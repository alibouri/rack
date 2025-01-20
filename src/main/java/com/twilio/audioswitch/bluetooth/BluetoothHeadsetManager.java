package com.twilio.audioswitch.bluetooth;

import Bb.p;
import Nb.j;
import Nb.x;
import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile.ServiceListener;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.twilio.audioswitch.AudioDeviceManager;
import com.twilio.audioswitch.android.BluetoothDeviceWrapper;
import com.twilio.audioswitch.android.BluetoothIntentProcessor;
import com.twilio.audioswitch.android.BluetoothIntentProcessorImpl;
import com.twilio.audioswitch.android.Logger;
import com.twilio.audioswitch.android.PermissionsCheckStrategy;
import com.twilio.audioswitch.android.SystemClockWrapper;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class BluetoothHeadsetManager extends BroadcastReceiver implements BluetoothProfile.ServiceListener {
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final BluetoothHeadsetManager newInstance$audioswitch_release(Context context0, Logger logger0, BluetoothAdapter bluetoothAdapter0, AudioDeviceManager audioDeviceManager0) {
            j.f(context0, "context");
            j.f(logger0, "logger");
            j.f(audioDeviceManager0, "audioDeviceManager");
            if(bluetoothAdapter0 != null) {
                return new BluetoothHeadsetManager(context0, logger0, bluetoothAdapter0, audioDeviceManager0, null, null, null, null, null, null, false, 0x7F0, null);
            }
            logger0.d("BluetoothHeadsetManager", "Bluetooth is not supported on this device");
            return null;
        }
    }

    public static final class DefaultPermissionsCheckStrategy implements PermissionsCheckStrategy {
        private final Context context;

        public DefaultPermissionsCheckStrategy(Context context0) {
            j.f(context0, "context");
            super();
            this.context = context0;
        }

        @Override  // com.twilio.audioswitch.android.PermissionsCheckStrategy
        @SuppressLint({"NewApi"})
        public boolean hasPermissions() {
            if(Build.VERSION.SDK_INT > 30) {
                int v = Process.myPid();
                int v1 = Process.myUid();
                return this.context.checkPermission("android.permission.BLUETOOTH_CONNECT", v, v1) == 0;
            }
            int v2 = Process.myPid();
            int v3 = Process.myUid();
            return this.context.checkPermission("android.permission.BLUETOOTH", v2, v3) == 0;
        }
    }

    public final class DisableBluetoothScoJob extends BluetoothScoJob {
        private final AudioDeviceManager audioDeviceManager;
        private final Logger logger;

        public DisableBluetoothScoJob(Logger logger0, AudioDeviceManager audioDeviceManager0, Handler handler0, SystemClockWrapper systemClockWrapper0) {
            j.f(logger0, "logger");
            j.f(audioDeviceManager0, "audioDeviceManager");
            j.f(handler0, "bluetoothScoHandler");
            j.f(systemClockWrapper0, "systemClockWrapper");
            BluetoothHeadsetManager.this = bluetoothHeadsetManager0;
            super(logger0, handler0, systemClockWrapper0);
            this.logger = logger0;
            this.audioDeviceManager = audioDeviceManager0;
        }

        @Override  // com.twilio.audioswitch.bluetooth.BluetoothScoJob
        public void scoAction() {
            this.logger.d("BluetoothHeadsetManager", "Attempting to disable bluetooth SCO");
            this.audioDeviceManager.enableBluetoothSco(false);
            BluetoothHeadsetManager.this.setHeadsetState$audioswitch_release(Connected.INSTANCE);
        }

        @Override  // com.twilio.audioswitch.bluetooth.BluetoothScoJob
        public void scoTimeOutAction() {
            BluetoothHeadsetManager.this.setHeadsetState$audioswitch_release(AudioActivationError.INSTANCE);
        }
    }

    public final class EnableBluetoothScoJob extends BluetoothScoJob {
        private final AudioDeviceManager audioDeviceManager;
        private final Logger logger;

        public EnableBluetoothScoJob(Logger logger0, AudioDeviceManager audioDeviceManager0, Handler handler0, SystemClockWrapper systemClockWrapper0) {
            j.f(logger0, "logger");
            j.f(audioDeviceManager0, "audioDeviceManager");
            j.f(handler0, "bluetoothScoHandler");
            j.f(systemClockWrapper0, "systemClockWrapper");
            BluetoothHeadsetManager.this = bluetoothHeadsetManager0;
            super(logger0, handler0, systemClockWrapper0);
            this.logger = logger0;
            this.audioDeviceManager = audioDeviceManager0;
        }

        @Override  // com.twilio.audioswitch.bluetooth.BluetoothScoJob
        public void scoAction() {
            this.logger.d("BluetoothHeadsetManager", "Attempting to enable bluetooth SCO");
            this.audioDeviceManager.enableBluetoothSco(true);
            BluetoothHeadsetManager.this.setHeadsetState$audioswitch_release(AudioActivating.INSTANCE);
        }

        @Override  // com.twilio.audioswitch.bluetooth.BluetoothScoJob
        public void scoTimeOutAction() {
            BluetoothHeadsetManager.this.setHeadsetState$audioswitch_release(AudioActivationError.INSTANCE);
            BluetoothHeadsetConnectionListener bluetoothHeadsetConnectionListener0 = BluetoothHeadsetManager.this.getHeadsetListener();
            if(bluetoothHeadsetConnectionListener0 != null) {
                bluetoothHeadsetConnectionListener0.onBluetoothHeadsetActivationError();
            }
        }
    }

    public static abstract class HeadsetState {
        public static final class AudioActivated extends HeadsetState {
            public static final AudioActivated INSTANCE;

            static {
                AudioActivated.INSTANCE = new AudioActivated();
            }

            private AudioActivated() {
                super(null);
            }
        }

        public static final class AudioActivating extends HeadsetState {
            public static final AudioActivating INSTANCE;

            static {
                AudioActivating.INSTANCE = new AudioActivating();
            }

            private AudioActivating() {
                super(null);
            }
        }

        public static final class AudioActivationError extends HeadsetState {
            public static final AudioActivationError INSTANCE;

            static {
                AudioActivationError.INSTANCE = new AudioActivationError();
            }

            private AudioActivationError() {
                super(null);
            }
        }

        public static final class Connected extends HeadsetState {
            public static final Connected INSTANCE;

            static {
                Connected.INSTANCE = new Connected();
            }

            private Connected() {
                super(null);
            }
        }

        public static final class Disconnected extends HeadsetState {
            public static final Disconnected INSTANCE;

            static {
                Disconnected.INSTANCE = new Disconnected();
            }

            private Disconnected() {
                super(null);
            }
        }

        private HeadsetState() {
        }

        public HeadsetState(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final Companion Companion;
    private final BluetoothAdapter bluetoothAdapter;
    private final BluetoothIntentProcessor bluetoothIntentProcessor;
    private final Context context;
    private final DisableBluetoothScoJob disableBluetoothScoJob;
    private final EnableBluetoothScoJob enableBluetoothScoJob;
    private boolean hasRegisteredReceivers;
    private BluetoothHeadsetConnectionListener headsetListener;
    private BluetoothHeadset headsetProxy;
    private HeadsetState headsetState;
    private final Logger logger;
    private final PermissionsCheckStrategy permissionsRequestStrategy;

    static {
        BluetoothHeadsetManager.Companion = new Companion(null);
    }

    public BluetoothHeadsetManager(Context context0, Logger logger0, BluetoothAdapter bluetoothAdapter0, AudioDeviceManager audioDeviceManager0, BluetoothHeadsetConnectionListener bluetoothHeadsetConnectionListener0, Handler handler0, SystemClockWrapper systemClockWrapper0, BluetoothIntentProcessor bluetoothIntentProcessor0, BluetoothHeadset bluetoothHeadset0, PermissionsCheckStrategy permissionsCheckStrategy0, boolean z) {
        j.f(context0, "context");
        j.f(logger0, "logger");
        j.f(bluetoothAdapter0, "bluetoothAdapter");
        j.f(audioDeviceManager0, "audioDeviceManager");
        j.f(handler0, "bluetoothScoHandler");
        j.f(systemClockWrapper0, "systemClockWrapper");
        j.f(bluetoothIntentProcessor0, "bluetoothIntentProcessor");
        j.f(permissionsCheckStrategy0, "permissionsRequestStrategy");
        super();
        this.context = context0;
        this.logger = logger0;
        this.bluetoothAdapter = bluetoothAdapter0;
        this.headsetListener = bluetoothHeadsetConnectionListener0;
        this.bluetoothIntentProcessor = bluetoothIntentProcessor0;
        this.headsetProxy = bluetoothHeadset0;
        this.permissionsRequestStrategy = permissionsCheckStrategy0;
        this.hasRegisteredReceivers = z;
        this.headsetState = Disconnected.INSTANCE;
        this.enableBluetoothScoJob = new EnableBluetoothScoJob(this, logger0, audioDeviceManager0, handler0, systemClockWrapper0);
        this.disableBluetoothScoJob = new DisableBluetoothScoJob(this, logger0, audioDeviceManager0, handler0, systemClockWrapper0);
    }

    public BluetoothHeadsetManager(Context context0, Logger logger0, BluetoothAdapter bluetoothAdapter0, AudioDeviceManager audioDeviceManager0, BluetoothHeadsetConnectionListener bluetoothHeadsetConnectionListener0, Handler handler0, SystemClockWrapper systemClockWrapper0, BluetoothIntentProcessor bluetoothIntentProcessor0, BluetoothHeadset bluetoothHeadset0, PermissionsCheckStrategy permissionsCheckStrategy0, boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        Handler handler1 = (v & 0x20) == 0 ? handler0 : new Handler(Looper.getMainLooper());
        SystemClockWrapper systemClockWrapper1 = (v & 0x40) == 0 ? systemClockWrapper0 : new SystemClockWrapper();
        BluetoothIntentProcessor bluetoothIntentProcessor1 = (v & 0x80) == 0 ? bluetoothIntentProcessor0 : new BluetoothIntentProcessorImpl();
        PermissionsCheckStrategy permissionsCheckStrategy1 = (v & 0x200) == 0 ? permissionsCheckStrategy0 : new DefaultPermissionsCheckStrategy(context0);
        this(context0, logger0, bluetoothAdapter0, audioDeviceManager0, ((v & 16) == 0 ? bluetoothHeadsetConnectionListener0 : null), handler1, systemClockWrapper1, bluetoothIntentProcessor1, ((v & 0x100) == 0 ? bluetoothHeadset0 : null), permissionsCheckStrategy1, ((v & 0x400) == 0 ? z : false));
    }

    public final void activate() {
        if(this.hasPermissions$audioswitch_release()) {
            if(!j.a(this.headsetState, Connected.INSTANCE) && !j.a(this.headsetState, AudioActivationError.INSTANCE)) {
                this.logger.w("BluetoothHeadsetManager", "Cannot activate when in the " + x.a(this.headsetState.getClass()).c() + " state");
                return;
            }
            this.enableBluetoothScoJob.executeBluetoothScoJob();
            return;
        }
        this.logger.w("BluetoothHeadsetManager", "Bluetooth unsupported, permissions not granted");
    }

    private final void connect() {
        if(!this.hasActiveHeadset()) {
            this.setHeadsetState$audioswitch_release(Connected.INSTANCE);
        }
    }

    public final void deactivate() {
        if(j.a(this.headsetState, AudioActivated.INSTANCE)) {
            this.disableBluetoothScoJob.executeBluetoothScoJob();
            return;
        }
        this.logger.w("BluetoothHeadsetManager", "Cannot deactivate when in the " + x.a(this.headsetState.getClass()).c() + " state");
    }

    private final void disconnect() {
        AudioActivated bluetoothHeadsetManager$HeadsetState$AudioActivated0;
        if(this.hasActiveHeadset()) {
            bluetoothHeadsetManager$HeadsetState$AudioActivated0 = AudioActivated.INSTANCE;
        }
        else if(this.hasConnectedDevice()) {
            bluetoothHeadsetManager$HeadsetState$AudioActivated0 = Connected.INSTANCE;
        }
        else {
            bluetoothHeadsetManager$HeadsetState$AudioActivated0 = Disconnected.INSTANCE;
        }
        this.setHeadsetState$audioswitch_release(bluetoothHeadsetManager$HeadsetState$AudioActivated0);
    }

    public final DisableBluetoothScoJob getDisableBluetoothScoJob$audioswitch_release() {
        return this.disableBluetoothScoJob;
    }

    public static void getDisableBluetoothScoJob$audioswitch_release$annotations() {
    }

    public final EnableBluetoothScoJob getEnableBluetoothScoJob$audioswitch_release() {
        return this.enableBluetoothScoJob;
    }

    public static void getEnableBluetoothScoJob$audioswitch_release$annotations() {
    }

    public final com.twilio.audioswitch.AudioDevice.BluetoothHeadset getHeadset(String s) {
        if(!this.hasPermissions$audioswitch_release()) {
            this.logger.w("BluetoothHeadsetManager", "Bluetooth unsupported, permissions not granted");
        }
        else if(!j.a(this.headsetState, Disconnected.INSTANCE)) {
            if(s == null) {
                s = this.getHeadsetName();
            }
            return s == null ? new com.twilio.audioswitch.AudioDevice.BluetoothHeadset(null, 1, null) : new com.twilio.audioswitch.AudioDevice.BluetoothHeadset(s);
        }
        return null;
    }

    private final BluetoothDeviceWrapper getHeadsetDevice(Intent intent0) {
        BluetoothDeviceWrapper bluetoothDeviceWrapper0 = this.bluetoothIntentProcessor.getBluetoothDevice(intent0);
        return bluetoothDeviceWrapper0 != null && this.isHeadsetDevice(bluetoothDeviceWrapper0) ? bluetoothDeviceWrapper0 : null;
    }

    public final BluetoothHeadsetConnectionListener getHeadsetListener() {
        return this.headsetListener;
    }

    private final String getHeadsetName() {
        BluetoothHeadset bluetoothHeadset0 = this.headsetProxy;
        String s = null;
        if(bluetoothHeadset0 != null) {
            List list0 = bluetoothHeadset0.getConnectedDevices();
            if(list0 != null) {
                if(list0.size() > 1 && this.hasActiveHeadset()) {
                    Object object0 = null;
                    for(Object object1: list0) {
                        if(bluetoothHeadset0.isAudioConnected(((BluetoothDevice)object1))) {
                            object0 = object1;
                            break;
                        }
                    }
                    if(((BluetoothDevice)object0) != null) {
                        s = ((BluetoothDevice)object0).getName();
                    }
                    this.logger.d("BluetoothHeadsetManager", "Device size > 1 with device name: " + s);
                    return s;
                }
                if(list0.size() == 1) {
                    Object object2 = p.p0(list0);
                    j.e(object2, "devices.first()");
                    s = ((BluetoothDevice)object2).getName();
                    this.logger.d("BluetoothHeadsetManager", "Device size 1 with device name: " + s);
                    return s;
                }
                this.logger.d("BluetoothHeadsetManager", "Device size 0");
            }
        }
        return null;
    }

    public final HeadsetState getHeadsetState$audioswitch_release() {
        return this.headsetState;
    }

    public static void getHeadsetState$audioswitch_release$annotations() {
    }

    public final boolean hasActivationError() {
        if(this.hasPermissions$audioswitch_release()) {
            return j.a(this.headsetState, AudioActivationError.INSTANCE);
        }
        this.logger.w("BluetoothHeadsetManager", "Bluetooth unsupported, permissions not granted");
        return false;
    }

    private final boolean hasActiveHeadset() {
        BluetoothHeadset bluetoothHeadset0 = this.headsetProxy;
        if(bluetoothHeadset0 != null) {
            boolean z = false;
            List list0 = bluetoothHeadset0.getConnectedDevices();
            if(list0 != null) {
                if(!(list0 instanceof Collection) || !list0.isEmpty()) {
                    for(Object object0: list0) {
                        if(bluetoothHeadset0.isAudioConnected(((BluetoothDevice)object0))) {
                            z = true;
                            break;
                        }
                    }
                }
                Boolean boolean0 = Boolean.valueOf(z);
                return boolean0 == null ? false : boolean0.booleanValue();
            }
            return false;
        }
        return false;
    }

    // Deobfuscation rating: LOW(30)
    private final boolean hasActiveHeadsetChanged() {
        return j.a(this.headsetState, AudioActivated.INSTANCE) && this.hasConnectedDevice() && !this.hasActiveHeadset();
    }

    private final boolean hasConnectedDevice() {
        BluetoothHeadset bluetoothHeadset0 = this.headsetProxy;
        if(bluetoothHeadset0 != null) {
            List list0 = bluetoothHeadset0.getConnectedDevices();
            Boolean boolean0 = list0 == null ? null : Boolean.valueOf(!list0.isEmpty());
            return boolean0 == null ? false : boolean0.booleanValue();
        }
        return false;
    }

    public final boolean hasPermissions$audioswitch_release() {
        return this.permissionsRequestStrategy.hasPermissions();
    }

    // Deobfuscation rating: LOW(20)
    private final boolean isCorrectIntentAction(String s) {
        return j.a(s, "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED") || j.a(s, "android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
    }

    private final boolean isHeadsetDevice(BluetoothDeviceWrapper bluetoothDeviceWrapper0) {
        Integer integer0 = bluetoothDeviceWrapper0.getDeviceClass();
        if(integer0 != null) {
            switch(integer0.intValue()) {
                case 0x404: 
                case 0x408: 
                case 1048: 
                case 0x420: 
                case 0x1F00: {
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
        return false;
    }

    @Override  // android.content.BroadcastReceiver
    public void onReceive(Context context0, Intent intent0) {
        j.f(context0, "context");
        j.f(intent0, "intent");
        if(this.isCorrectIntentAction(intent0.getAction())) {
            BluetoothDeviceWrapper bluetoothDeviceWrapper0 = this.getHeadsetDevice(intent0);
            if(bluetoothDeviceWrapper0 != null) {
                switch(intent0.getIntExtra("android.bluetooth.profile.extra.STATE", 0)) {
                    case 0: {
                        this.logger.d("BluetoothHeadsetManager", "Bluetooth headset " + bluetoothDeviceWrapper0 + " disconnected");
                        this.disconnect();
                        BluetoothHeadsetConnectionListener bluetoothHeadsetConnectionListener0 = this.headsetListener;
                        if(bluetoothHeadsetConnectionListener0 != null) {
                            DefaultImpls.onBluetoothHeadsetStateChanged$default(bluetoothHeadsetConnectionListener0, null, 1, null);
                            return;
                        }
                        break;
                    }
                    case 2: {
                        this.logger.d("BluetoothHeadsetManager", "Bluetooth headset " + bluetoothDeviceWrapper0 + " connected");
                        this.connect();
                        BluetoothHeadsetConnectionListener bluetoothHeadsetConnectionListener1 = this.headsetListener;
                        if(bluetoothHeadsetConnectionListener1 != null) {
                            bluetoothHeadsetConnectionListener1.onBluetoothHeadsetStateChanged(bluetoothDeviceWrapper0.getName());
                            return;
                        }
                        break;
                    }
                    case 10: {
                        this.logger.d("BluetoothHeadsetManager", "Bluetooth audio disconnected on device " + bluetoothDeviceWrapper0);
                        this.disableBluetoothScoJob.cancelBluetoothScoJob();
                        if(this.hasActiveHeadsetChanged()) {
                            this.enableBluetoothScoJob.executeBluetoothScoJob();
                        }
                        BluetoothHeadsetConnectionListener bluetoothHeadsetConnectionListener2 = this.headsetListener;
                        if(bluetoothHeadsetConnectionListener2 != null) {
                            DefaultImpls.onBluetoothHeadsetStateChanged$default(bluetoothHeadsetConnectionListener2, null, 1, null);
                            return;
                        }
                        break;
                    }
                    case 12: {
                        this.logger.d("BluetoothHeadsetManager", "Bluetooth audio connected on device " + bluetoothDeviceWrapper0);
                        this.enableBluetoothScoJob.cancelBluetoothScoJob();
                        this.setHeadsetState$audioswitch_release(AudioActivated.INSTANCE);
                        BluetoothHeadsetConnectionListener bluetoothHeadsetConnectionListener3 = this.headsetListener;
                        if(bluetoothHeadsetConnectionListener3 != null) {
                            DefaultImpls.onBluetoothHeadsetStateChanged$default(bluetoothHeadsetConnectionListener3, null, 1, null);
                            return;
                        }
                        break;
                    }
                }
            }
        }
    }

    @Override  // android.bluetooth.BluetoothProfile$ServiceListener
    public void onServiceConnected(int v, BluetoothProfile bluetoothProfile0) {
        j.f(bluetoothProfile0, "bluetoothProfile");
        this.headsetProxy = (BluetoothHeadset)bluetoothProfile0;
        List list0 = ((BluetoothHeadset)bluetoothProfile0).getConnectedDevices();
        j.e(list0, "bluetoothProfile.connectedDevices");
        for(Object object0: list0) {
            j.e(((BluetoothDevice)object0), "device");
            this.logger.d("BluetoothHeadsetManager", "Bluetooth " + ((BluetoothDevice)object0).getName() + " connected");
        }
        if(this.hasConnectedDevice()) {
            this.connect();
            BluetoothHeadsetConnectionListener bluetoothHeadsetConnectionListener0 = this.headsetListener;
            if(bluetoothHeadsetConnectionListener0 != null) {
                bluetoothHeadsetConnectionListener0.onBluetoothHeadsetStateChanged(this.getHeadsetName());
            }
        }
    }

    @Override  // android.bluetooth.BluetoothProfile$ServiceListener
    public void onServiceDisconnected(int v) {
        this.logger.d("BluetoothHeadsetManager", "Bluetooth disconnected");
        this.setHeadsetState$audioswitch_release(Disconnected.INSTANCE);
        BluetoothHeadsetConnectionListener bluetoothHeadsetConnectionListener0 = this.headsetListener;
        if(bluetoothHeadsetConnectionListener0 != null) {
            DefaultImpls.onBluetoothHeadsetStateChanged$default(bluetoothHeadsetConnectionListener0, null, 1, null);
        }
    }

    public final void setHeadsetListener(BluetoothHeadsetConnectionListener bluetoothHeadsetConnectionListener0) {
        this.headsetListener = bluetoothHeadsetConnectionListener0;
    }

    public final void setHeadsetState$audioswitch_release(HeadsetState bluetoothHeadsetManager$HeadsetState0) {
        j.f(bluetoothHeadsetManager$HeadsetState0, "value");
        if(!j.a(this.headsetState, bluetoothHeadsetManager$HeadsetState0)) {
            this.headsetState = bluetoothHeadsetManager$HeadsetState0;
            this.logger.d("BluetoothHeadsetManager", "Headset state changed to " + x.a(this.headsetState.getClass()).c());
            if(bluetoothHeadsetManager$HeadsetState0.equals(Disconnected.INSTANCE)) {
                this.enableBluetoothScoJob.cancelBluetoothScoJob();
            }
        }
    }

    public final void start(BluetoothHeadsetConnectionListener bluetoothHeadsetConnectionListener0) {
        j.f(bluetoothHeadsetConnectionListener0, "headsetListener");
        if(this.hasPermissions$audioswitch_release()) {
            this.headsetListener = bluetoothHeadsetConnectionListener0;
            this.bluetoothAdapter.getProfileProxy(this.context, this, 1);
            if(!this.hasRegisteredReceivers) {
                IntentFilter intentFilter0 = new IntentFilter("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
                this.context.registerReceiver(this, intentFilter0);
                IntentFilter intentFilter1 = new IntentFilter("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
                this.context.registerReceiver(this, intentFilter1);
                this.hasRegisteredReceivers = true;
            }
        }
        else {
            this.logger.w("BluetoothHeadsetManager", "Bluetooth unsupported, permissions not granted");
        }
    }

    public final void stop() {
        if(this.hasPermissions$audioswitch_release()) {
            this.headsetListener = null;
            this.bluetoothAdapter.closeProfileProxy(1, this.headsetProxy);
            if(this.hasRegisteredReceivers) {
                this.context.unregisterReceiver(this);
                this.hasRegisteredReceivers = false;
            }
        }
        else {
            this.logger.w("BluetoothHeadsetManager", "Bluetooth unsupported, permissions not granted");
        }
    }
}

