package com.twilio.voice;

import H6.e;
import K.v;
import L7.b;
import M.J;
import a8.Q;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.util.Pair;
import j5.a;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public abstract class Voice {
    static enum NetworkChangeEvent {
        CONNECTION_LOST,
        CONNECTION_CHANGED;

    }

    public static enum RegistrationChannel {
        FCM,
        GCM;

        @Override
        public String toString() {
            return this.name().toLowerCase();
        }
    }

    static AudioDevice audioDevice;
    static final Map callInviteProxyMap;
    static Pair callSidBridgeTokenPair;
    static final Set calls;
    private static final LogLevel defaultLogLevel;
    static String edge;
    static boolean enableInsights;
    static boolean isLibraryLoaded;
    static LogLevel level;
    static Map moduleLogLevel;
    static AtomicInteger networkChangedCount;
    static String region;
    static final Set rejects;

    static {
        Voice.networkChangedCount = new AtomicInteger(0);
        Voice.moduleLogLevel = new EnumMap(LogModule.class);
        Voice.defaultLogLevel = LogLevel.ERROR;
        Voice.level = LogLevel.ERROR;
        Voice.enableInsights = true;
        Voice.region = Constants.GLOBAL_LOW_LATENCY_REGION;
        Voice.edge = Constants.EDGE_ROAMING;
        Voice.isLibraryLoaded = false;
        Voice.calls = new HashSet();
        Voice.callInviteProxyMap = new HashMap();
        Voice.rejects = new HashSet();
    }

    private static void callNativeHandleMessage(Context context0, Map map0, MessageListener messageListener0, EventListener call$EventListener0) {
        Voice.loadLibrary(context0);
        Handler handler0 = Utils.createHandler();
        handler0.post(new Runnable() {
            @Override
            public void run() {
                CallInvite callInvite0 = CallInvite.create(map0);
                CancelledCallInvite cancelledCallInvite0 = CancelledCallInvite.create(map0);
                if(callInvite0.getBridgeToken() != null) {
                    Voice.callSidBridgeTokenPair = Pair.create(callInvite0.getCallSid(), callInvite0.getBridgeToken());
                }
                Pair pair0 = Utils.mapToArrays(map0);
                MediaFactory mediaFactory0 = MediaFactory.instance(this, context0.getApplicationContext());
                Voice.nativeHandleMessage(context0.getApplicationContext(), ((String[])pair0.first), ((String[])pair0.second), callInvite0, cancelledCallInvite0, handler0, messageListener0, call$EventListener0, mediaFactory0.getNativeMediaFactoryHandle());
                mediaFactory0.release(this);
            }
        });
    }

    public static Call connect(Context context0, ConnectOptions connectOptions0, Listener call$Listener0) {
        Preconditions.checkNotNull(context0, "context must not be null");
        Preconditions.checkNotNull(connectOptions0, "connectOptions must not be null");
        Preconditions.checkNotNull(call$Listener0, "listener must not be null");
        if(!Utils.isAudioPermissionGranted(context0)) {
            throw new SecurityException("Requires the RECORD_AUDIO permission");
        }
        Builder connectOptions$Builder0 = new Builder(connectOptions0.getAccessToken());
        connectOptions$Builder0.params(connectOptions0.getParams());
        if(connectOptions0.getIceOptions() != null) {
            connectOptions$Builder0.iceOptions(connectOptions0.getIceOptions());
        }
        if(connectOptions0.getPreferredAudioCodecs() != null) {
            connectOptions$Builder0.preferAudioCodecs(connectOptions0.getPreferredAudioCodecs());
        }
        connectOptions$Builder0.enableDscp(connectOptions0.enableDscp);
        connectOptions$Builder0.enableIceGatheringOnAnyAddressPorts(connectOptions0.enableIceGatheringOnAnyAddressPorts);
        connectOptions$Builder0.audioTracks(Collections.singletonList(LocalAudioTrack.create(context0, true)));
        connectOptions$Builder0.eventListener(connectOptions0.getEventListener());
        ConnectOptions connectOptions1 = connectOptions$Builder0.build();
        Call call0 = new Call(context0.getApplicationContext(), connectOptions1.getAccessToken(), call$Listener0);
        call0.connect(connectOptions1);
        return call0;
    }

    public static Call connect(Context context0, String s, Listener call$Listener0) {
        return Voice.connect(context0, new Builder(s).build(), call$Listener0);
    }

    public static void enableInsights(boolean z) {
        if(Voice.isLibraryLoaded) {
            Voice.nativeEnableInsights(z);
        }
        Voice.enableInsights = z;
    }

    public static AudioDevice getAudioDevice() {
        if(Voice.audioDevice == null) {
            Voice.audioDevice = new DefaultAudioDevice();
        }
        return Voice.audioDevice;
    }

    public static String getEdge() {
        return Voice.edge;
    }

    public static LogLevel getLogLevel() {
        return Voice.level;
    }

    // Deobfuscation rating: LOW(20)
    public static LogLevel getModuleLogLevel(LogModule logModule0) {
        return Voice.moduleLogLevel.containsKey(logModule0) ? ((LogLevel)Voice.moduleLogLevel.get(logModule0)) : Voice.defaultLogLevel;
    }

    @Deprecated
    public static String getRegion() {
        return Voice.region;
    }

    public static String getVersion() [...] // Inlined contents

    public static boolean handleMessage(Context context0, Bundle bundle0, MessageListener messageListener0) {
        Preconditions.checkNotNull(context0, "context must not be null");
        Preconditions.checkNotNull(bundle0, "data must not be null");
        Preconditions.checkNotNull(messageListener0, "listener must not be null");
        return Voice.handleMessage(context0, Utils.bundleToMap(bundle0), messageListener0);
    }

    public static boolean handleMessage(Context context0, Map map0, MessageListener messageListener0) {
        synchronized(Voice.class) {
            return Voice.handleMessage(context0, map0, messageListener0, null);
        }
    }

    public static boolean handleMessage(Context context0, Map map0, MessageListener messageListener0, EventListener call$EventListener0) {
        synchronized(Voice.class) {
            Preconditions.checkNotNull(context0, "context must not be null");
            Preconditions.checkNotNull(map0, "data must not be null");
            Preconditions.checkNotNull(messageListener0, "listener must not be null");
            boolean z = CallInvite.isValid(context0, map0);
            if(z || CancelledCallInvite.isValid(map0) && false) {
                Voice.callNativeHandleMessage(context0, map0, messageListener0, call$EventListener0);
            }
            return z;
        }
    }

    public static boolean isInsightsEnabled() {
        return Voice.enableInsights;
    }

    public static void loadLibrary(Context context0) {
        String[] arr_s1;
        FileOutputStream fileOutputStream0;
        InputStream inputStream0;
        ZipFile zipFile0;
        v v2;
        v v1;
        if(!Voice.isLibraryLoaded) {
            Q q0 = new Q(13);
            if(context0 == null) {
                throw new IllegalArgumentException("Given context is null");
            }
            b b0 = (b)q0.Z;
            HashSet hashSet0 = (HashSet)q0.Y;
            if(!hashSet0.contains("twilio_voice_android_so")) {
                try {
                    b0.getClass();
                    System.loadLibrary("twilio_voice_android_so");
                    hashSet0.add("twilio_voice_android_so");
                }
                catch(UnsatisfiedLinkError unsatisfiedLinkError0) {
                    Log.getStackTraceString(unsatisfiedLinkError0);
                    File file0 = q0.C(context0);
                    if(!file0.exists()) {
                        File file1 = context0.getDir("lib", 0);
                        File file2 = q0.C(context0);
                        b0.getClass();
                        File[] arr_file = file1.listFiles(new a(System.mapLibraryName("twilio_voice_android_so")));
                        if(arr_file != null) {
                            for(int v = 0; v < arr_file.length; ++v) {
                                File file3 = arr_file[v];
                                if(!file3.getAbsolutePath().equals(file2.getAbsolutePath())) {
                                    file3.delete();
                                }
                            }
                        }
                        String[] arr_s = Build.SUPPORTED_ABIS;
                        if(arr_s.length <= 0) {
                            arr_s = Build.CPU_ABI2 == null || Build.CPU_ABI2.length() == 0 ? new String[]{Build.CPU_ABI} : new String[]{Build.CPU_ABI, Build.CPU_ABI2};
                        }
                        String s = System.mapLibraryName("twilio_voice_android_so");
                        ((e)q0.b0).getClass();
                        try {
                            v1 = e.k(context0, arr_s, s, q0);
                        }
                        catch(Throwable throwable0) {
                            v2 = null;
                            goto label_103;
                        }
                        if(v1 != null) {
                            int v3 = 0;
                            while(true) {
                                zipFile0 = (ZipFile)v1.Y;
                                if(v3 >= 5) {
                                    break;
                                }
                                try {
                                    if(file0.exists() || file0.createNewFile()) {
                                        inputStream0 = null;
                                        inputStream0 = zipFile0.getInputStream(((ZipEntry)v1.Z));
                                        fileOutputStream0 = new FileOutputStream(file0);
                                        goto label_57;
                                    }
                                    goto label_89;
                                }
                                catch(IOException unused_ex) {
                                    goto label_89;
                                }
                                catch(Throwable throwable0) {
                                    goto label_102;
                                }
                                try {
                                    inputStream0 = null;
                                    inputStream0 = zipFile0.getInputStream(((ZipEntry)v1.Z));
                                    fileOutputStream0 = new FileOutputStream(file0);
                                    goto label_57;
                                }
                                catch(FileNotFoundException unused_ex) {
                                    fileOutputStream0 = null;
                                    goto label_68;
                                }
                                catch(IOException unused_ex) {
                                    fileOutputStream0 = null;
                                    goto label_71;
                                }
                                catch(Throwable throwable1) {
                                }
                                InputStream inputStream1 = null;
                                goto label_55;
                                try {
                                    fileOutputStream0 = new FileOutputStream(file0);
                                    goto label_57;
                                }
                                catch(FileNotFoundException unused_ex) {
                                    fileOutputStream0 = null;
                                    goto label_68;
                                }
                                catch(IOException unused_ex) {
                                    fileOutputStream0 = null;
                                    goto label_71;
                                }
                                catch(Throwable throwable1) {
                                    inputStream1 = inputStream0;
                                }
                            label_55:
                                Closeable closeable0 = null;
                                goto label_77;
                                try {
                                label_57:
                                    byte[] arr_b = new byte[0x1000];
                                    long v4 = 0L;
                                    int v5;
                                    while((v5 = inputStream0.read(arr_b)) != -1) {
                                        fileOutputStream0.write(arr_b, 0, v5);
                                        v4 += (long)v5;
                                    }
                                    fileOutputStream0.flush();
                                    fileOutputStream0.getFD().sync();
                                    if(v4 == file0.length()) {
                                        goto label_83;
                                    }
                                    else {
                                        goto label_80;
                                    }
                                    goto label_106;
                                }
                                catch(FileNotFoundException unused_ex) {
                                }
                                catch(IOException unused_ex) {
                                    goto label_71;
                                }
                                catch(Throwable throwable1) {
                                    goto label_75;
                                }
                                try {
                                label_68:
                                    e.g(inputStream0);
                                    e.g(fileOutputStream0);
                                    goto label_89;
                                label_71:
                                    e.g(inputStream0);
                                    e.g(fileOutputStream0);
                                    goto label_89;
                                label_75:
                                    inputStream1 = inputStream0;
                                    closeable0 = fileOutputStream0;
                                label_77:
                                    e.g(inputStream1);
                                    e.g(closeable0);
                                    throw throwable1;
                                label_80:
                                    e.g(inputStream0);
                                    e.g(fileOutputStream0);
                                    goto label_89;
                                label_83:
                                    e.g(inputStream0);
                                    e.g(fileOutputStream0);
                                    file0.setReadable(true, false);
                                    file0.setExecutable(true, false);
                                    file0.setWritable(true);
                                    break;
                                }
                                catch(Throwable throwable0) {
                                    goto label_102;
                                }
                            label_89:
                                ++v3;
                            }
                            try {
                                zipFile0.close();
                            }
                            catch(IOException unused_ex) {
                            }
                            goto label_106;
                        }
                        try {
                            try {
                                arr_s1 = e.p(context0, s);
                            }
                            catch(Exception exception0) {
                                arr_s1 = new String[]{exception0.toString()};
                            }
                            StringBuilder stringBuilder0 = com.apollographql.apollo.api.b.s("Could not find \'", s, "\'. Looked for: ");
                            stringBuilder0.append(Arrays.toString(arr_s));
                            stringBuilder0.append(", but only found: ");
                            throw new Ab.e(m5.b.y(stringBuilder0, Arrays.toString(arr_s1), "."));  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                        }
                        catch(Throwable throwable0) {
                        label_102:
                            v2 = v1;
                        }
                    label_103:
                        if(v2 != null) {
                            try {
                                ((ZipFile)v2.Y).close();
                            }
                            catch(IOException unused_ex) {
                            }
                        }
                        throw throwable0;
                    }
                label_106:
                    String s1 = file0.getAbsolutePath();
                    b0.getClass();
                    System.load(s1);
                    hashSet0.add("twilio_voice_android_so");
                }
            }
            Voice.isLibraryLoaded = true;
            Voice.setLogLevel(Voice.level);
            if(!Voice.edge.equals("roaming")) {
                Voice.nativeSetEdge(Voice.edge);
            }
            if(!Voice.region.equals("gll")) {
                Voice.nativeSetRegion(Voice.region);
            }
            Voice.enableInsights(Voice.enableInsights);
            for(Object object0: Voice.moduleLogLevel.keySet()) {
                Voice.setModuleLogLevel(((LogModule)object0), ((LogLevel)Voice.moduleLogLevel.get(((LogModule)object0))));
            }
        }
    }

    private static native void nativeEnableInsights(boolean arg0) {
    }

    private static native boolean nativeHandleMessage(Context arg0, String[] arg1, String[] arg2, CallInvite arg3, CancelledCallInvite arg4, Handler arg5, MessageListener arg6, EventListener arg7, long arg8) {
    }

    private static native void nativeSetEdge(String arg0) {
    }

    private static native void nativeSetModuleLevel(int arg0, int arg1) {
    }

    private static native void nativeSetRegion(String arg0) {
    }

    public static void onNetworkChanged(NetworkChangeEvent voice$NetworkChangeEvent0) {
        Voice.networkChangedCount.incrementAndGet();
        for(Object object0: Voice.calls) {
            ((Call)object0).networkChange(voice$NetworkChangeEvent0);
        }
        for(Object object1: Voice.callInviteProxyMap.values()) {
            ((CallInviteProxy)object1).networkChange(voice$NetworkChangeEvent0);
        }
    }

    public static void register(String s, RegistrationChannel voice$RegistrationChannel0, String s1, RegistrationListener registrationListener0) {
        Preconditions.checkNotNull(s, "accessToken must not be null");
        Preconditions.checkNotNull(voice$RegistrationChannel0, "registrationChannel must not be null");
        Preconditions.checkNotNull(s1, "registrationToken must not be null");
        Preconditions.checkNotNull(registrationListener0, "listener must not be null");
        new Registrar(s, voice$RegistrationChannel0.toString(), s1).register(registrationListener0);
    }

    public static void setAudioDevice(AudioDevice audioDevice0) {
        Preconditions.checkNotNull(audioDevice0, "audioDevice must not be null");
        if(!Voice.calls.isEmpty()) {
            throw new UnsupportedOperationException("Changing the audio device during a call is not allowed");
        }
        Voice.audioDevice = audioDevice0;
    }

    public static void setEdge(String s) {
        Preconditions.checkNotNull(s, "edge must not be null");
        Preconditions.checkArgument(Voice.region.equals(Constants.GLOBAL_LOW_LATENCY_REGION), J.e("Non default region value ", Voice.getRegion(), " has already been specified. Please use Voice.edge or Voice.region to specify the Twilio Region that the SDK connects to."));
        if(Voice.isLibraryLoaded) {
            Voice.nativeSetEdge(s);
        }
        Voice.edge = s;
    }

    public static void setLogLevel(LogLevel logLevel0) {
        Voice.setSDKLogLevel(logLevel0);
        if(Voice.isLibraryLoaded) {
            Voice.nativeSetModuleLevel(LogModule.CORE.ordinal(), logLevel0.ordinal());
        }
        Voice.level = logLevel0;
    }

    public static void setModuleLogLevel(LogModule logModule0, LogLevel logLevel0) {
        if(logModule0 == LogModule.PLATFORM) {
            Voice.setSDKLogLevel(logLevel0);
        }
        if(Voice.isLibraryLoaded) {
            Voice.nativeSetModuleLevel(logModule0.ordinal(), logLevel0.ordinal());
        }
        Voice.moduleLogLevel.put(logModule0, logLevel0);
    }

    @Deprecated
    public static void setRegion(String s) {
        Preconditions.checkNotNull(s, "region must not be null");
        Preconditions.checkArgument(Voice.edge.equals(Constants.EDGE_ROAMING), J.e("Non default edge value ", Voice.getEdge(), " has already been specified. Please use Voice.edge or Voice.region to specify the Twilio Region that the SDK connects to."));
        if(Voice.isLibraryLoaded) {
            Voice.nativeSetRegion(s);
        }
        Voice.region = s;
    }

    private static void setSDKLogLevel(LogLevel logLevel0) {
        switch(com.twilio.voice.Voice.2.$SwitchMap$com$twilio$voice$LogLevel[logLevel0.ordinal()]) {
            case 1: {
                Logger.setLogLevel(7);
                return;
            }
            case 2: {
                Logger.setLogLevel(6);
                return;
            }
            case 3: {
                Logger.setLogLevel(5);
                return;
            }
            case 4: {
                Logger.setLogLevel(4);
                return;
            }
            case 5: {
                Logger.setLogLevel(3);
                return;
            }
            case 6: {
                Logger.setLogLevel(2);
                return;
            }
            case 7: {
                Logger.setLogLevel(2);
                return;
            }
            default: {
                Logger.setLogLevel(7);
            }
        }
    }

    public static void unregister(String s, RegistrationChannel voice$RegistrationChannel0, String s1, UnregistrationListener unregistrationListener0) {
        Preconditions.checkNotNull(s, "accessToken must not be null");
        Preconditions.checkNotNull(voice$RegistrationChannel0, "registrationChannel must not be null");
        Preconditions.checkNotNull(s1, "registrationToken must not be null");
        Preconditions.checkNotNull(unregistrationListener0, "listener must not be null");
        new Registrar(s, voice$RegistrationChannel0.toString(), s1).unregister(unregistrationListener0);
    }
}

