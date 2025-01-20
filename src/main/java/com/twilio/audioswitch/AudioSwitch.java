package com.twilio.audioswitch;

import Ab.h;
import Ab.t;
import Bb.C;
import Bb.p;
import Bb.q;
import Bb.r;
import Nb.j;
import Nb.u;
import Nb.z;
import Ob.a;
import Ob.d;
import W4.f;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.media.AudioManager;
import com.twilio.audioswitch.android.Logger;
import com.twilio.audioswitch.android.ProductionLogger;
import com.twilio.audioswitch.bluetooth.BluetoothHeadsetConnectionListener;
import com.twilio.audioswitch.bluetooth.BluetoothHeadsetManager;
import com.twilio.audioswitch.wired.WiredDeviceConnectionListener;
import com.twilio.audioswitch.wired.WiredHeadsetReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class AudioSwitch {
    public static final class AudioDeviceState {
        private final List audioDeviceList;
        private final AudioDevice selectedAudioDevice;

        public AudioDeviceState(List list0, AudioDevice audioDevice0) {
            j.f(list0, "audioDeviceList");
            super();
            this.audioDeviceList = list0;
            this.selectedAudioDevice = audioDevice0;
        }

        public final List component1() {
            return this.audioDeviceList;
        }

        public final AudioDevice component2() {
            return this.selectedAudioDevice;
        }

        public final AudioDeviceState copy(List list0, AudioDevice audioDevice0) {
            j.f(list0, "audioDeviceList");
            return new AudioDeviceState(list0, audioDevice0);
        }

        public static AudioDeviceState copy$default(AudioDeviceState audioSwitch$AudioDeviceState0, List list0, AudioDevice audioDevice0, int v, Object object0) {
            if((v & 1) != 0) {
                list0 = audioSwitch$AudioDeviceState0.audioDeviceList;
            }
            if((v & 2) != 0) {
                audioDevice0 = audioSwitch$AudioDeviceState0.selectedAudioDevice;
            }
            return audioSwitch$AudioDeviceState0.copy(list0, audioDevice0);
        }

        // Deobfuscation rating: LOW(30)
        @Override
        public boolean equals(Object object0) {
            return this == object0 || object0 instanceof AudioDeviceState && j.a(this.audioDeviceList, ((AudioDeviceState)object0).audioDeviceList) && j.a(this.selectedAudioDevice, ((AudioDeviceState)object0).selectedAudioDevice);
        }

        public final List getAudioDeviceList() {
            return this.audioDeviceList;
        }

        public final AudioDevice getSelectedAudioDevice() {
            return this.selectedAudioDevice;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.audioDeviceList == null ? 0 : this.audioDeviceList.hashCode();
            AudioDevice audioDevice0 = this.selectedAudioDevice;
            if(audioDevice0 != null) {
                v = audioDevice0.hashCode();
            }
            return v1 * 0x1F + v;
        }

        @Override
        public String toString() {
            return "AudioDeviceState(audioDeviceList=" + this.audioDeviceList + ", selectedAudioDevice=" + this.selectedAudioDevice + ")";
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public static final List access$getDefaultPreferredDeviceList$p(Companion audioSwitch$Companion0) {
            return audioSwitch$Companion0.getDefaultPreferredDeviceList();
        }

        private final List getDefaultPreferredDeviceList() {
            return (List)AudioSwitch.defaultPreferredDeviceList$delegate.getValue();
        }
    }

    public static enum State {
        STARTED,
        ACTIVATED,
        STOPPED;

    }

    public static final Companion Companion = null;
    public static final String VERSION = "1.1.8";
    private Function2 audioDeviceChangeListener;
    private final AudioDeviceManager audioDeviceManager;
    private final List availableAudioDevices;
    private final BluetoothHeadsetConnectionListener bluetoothDeviceConnectionListener;
    private BluetoothHeadsetManager bluetoothHeadsetManager;
    private static final h defaultPreferredDeviceList$delegate;
    private Logger logger;
    private final ArrayList mutableAudioDevices;
    private final List preferredDeviceList;
    private AudioDevice selectedDevice;
    private State state;
    private AudioDevice userSelectedDevice;
    private final WiredDeviceConnectionListener wiredDeviceConnectionListener;
    private boolean wiredHeadsetAvailable;
    private final WiredHeadsetReceiver wiredHeadsetReceiver;

    static {
        AudioSwitch.Companion = new Companion(null);
        AudioSwitch.defaultPreferredDeviceList$delegate = f.A(AudioSwitch.Companion.defaultPreferredDeviceList.2.INSTANCE);
    }

    public AudioSwitch(Context context0) {
        this(context0, false, null, null, 14, null);
    }

    public AudioSwitch(Context context0, Logger logger0, AudioManager.OnAudioFocusChangeListener audioManager$OnAudioFocusChangeListener0, List list0, AudioDeviceManager audioDeviceManager0, WiredHeadsetReceiver wiredHeadsetReceiver0, BluetoothHeadsetManager bluetoothHeadsetManager0) {
        j.f(context0, "context");
        j.f(logger0, "logger");
        j.f(audioManager$OnAudioFocusChangeListener0, "audioFocusChangeListener");
        j.f(list0, "preferredDeviceList");
        j.f(audioDeviceManager0, "audioDeviceManager");
        j.f(wiredHeadsetReceiver0, "wiredHeadsetReceiver");
        super();
        this.logger = new ProductionLogger(false, 1, null);
        ArrayList arrayList0 = new ArrayList();
        this.mutableAudioDevices = arrayList0;
        this.state = State.STOPPED;
        this.bluetoothDeviceConnectionListener = new BluetoothHeadsetConnectionListener() {
            @Override  // com.twilio.audioswitch.bluetooth.BluetoothHeadsetConnectionListener
            public void onBluetoothHeadsetActivationError() {
                if(AudioSwitch.access$getUserSelectedDevice$p(AudioSwitch.this) instanceof BluetoothHeadset) {
                    AudioSwitch.access$setUserSelectedDevice$p(AudioSwitch.this, null);
                }
                AudioSwitch.enumerateDevices$default(AudioSwitch.this, null, 1, null);
            }

            @Override  // com.twilio.audioswitch.bluetooth.BluetoothHeadsetConnectionListener
            public void onBluetoothHeadsetStateChanged(String s) {
                AudioSwitch.access$enumerateDevices(AudioSwitch.this, s);
            }
        };
        this.wiredDeviceConnectionListener = new WiredDeviceConnectionListener() {
            @Override  // com.twilio.audioswitch.wired.WiredDeviceConnectionListener
            public void onDeviceConnected() {
                AudioSwitch.access$setWiredHeadsetAvailable$p(AudioSwitch.this, true);
                AudioSwitch.enumerateDevices$default(AudioSwitch.this, null, 1, null);
            }

            @Override  // com.twilio.audioswitch.wired.WiredDeviceConnectionListener
            public void onDeviceDisconnected() {
                AudioSwitch.access$setWiredHeadsetAvailable$p(AudioSwitch.this, false);
                AudioSwitch.enumerateDevices$default(AudioSwitch.this, null, 1, null);
            }
        };
        this.availableAudioDevices = arrayList0;
        this.logger = logger0;
        this.audioDeviceManager = audioDeviceManager0;
        this.wiredHeadsetReceiver = wiredHeadsetReceiver0;
        this.bluetoothHeadsetManager = bluetoothHeadsetManager0;
        List list1 = this.getPreferredDeviceList(list0);
        this.preferredDeviceList = list1;
        logger0.d("AudioSwitch", "AudioSwitch(1.1.8)");
        StringBuilder stringBuilder0 = new StringBuilder("Preferred device list = ");
        ArrayList arrayList1 = new ArrayList(r.b0(list1));
        for(Object object0: list1) {
            arrayList1.add(((Class)object0).getSimpleName());
        }
        stringBuilder0.append(arrayList1);
        logger0.d("AudioSwitch", stringBuilder0.toString());
    }

    public AudioSwitch(Context context0, Logger logger0, AudioManager.OnAudioFocusChangeListener audioManager$OnAudioFocusChangeListener0, List list0, AudioDeviceManager audioDeviceManager0, WiredHeadsetReceiver wiredHeadsetReceiver0, BluetoothHeadsetManager bluetoothHeadsetManager0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        BluetoothHeadsetManager bluetoothHeadsetManager1;
        AudioDeviceManager audioDeviceManager1;
        if((v & 16) == 0) {
            audioDeviceManager1 = audioDeviceManager0;
        }
        else {
            Object object0 = context0.getSystemService("audio");
            if(object0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.media.AudioManager");
            }
            audioDeviceManager1 = new AudioDeviceManager(context0, logger0, ((AudioManager)object0), null, null, audioManager$OnAudioFocusChangeListener0, 24, null);
        }
        WiredHeadsetReceiver wiredHeadsetReceiver1 = (v & 0x20) == 0 ? wiredHeadsetReceiver0 : new WiredHeadsetReceiver(context0, logger0);
        if((v & 0x40) == 0) {
            bluetoothHeadsetManager1 = bluetoothHeadsetManager0;
        }
        else {
            BluetoothAdapter bluetoothAdapter0 = BluetoothAdapter.getDefaultAdapter();
            bluetoothHeadsetManager1 = BluetoothHeadsetManager.Companion.newInstance$audioswitch_release(context0, logger0, bluetoothAdapter0, audioDeviceManager1);
        }
        this(context0, logger0, audioManager$OnAudioFocusChangeListener0, list0, audioDeviceManager1, wiredHeadsetReceiver1, bluetoothHeadsetManager1);
    }

    public AudioSwitch(Context context0, boolean z) {
        this(context0, z, null, null, 12, null);
    }

    public AudioSwitch(Context context0, boolean z, AudioManager.OnAudioFocusChangeListener audioManager$OnAudioFocusChangeListener0) {
        this(context0, z, audioManager$OnAudioFocusChangeListener0, null, 8, null);
    }

    public AudioSwitch(Context context0, boolean z, AudioManager.OnAudioFocusChangeListener audioManager$OnAudioFocusChangeListener0, List list0) {
        j.f(context0, "context");
        j.f(audioManager$OnAudioFocusChangeListener0, "audioFocusChangeListener");
        j.f(list0, "preferredDeviceList");
        Context context1 = context0.getApplicationContext();
        j.e(context1, "context.applicationContext");
        this(context1, new ProductionLogger(z), audioManager$OnAudioFocusChangeListener0, list0, null, null, null, 0x70, null);

        final class com.twilio.audioswitch.AudioSwitch.1 implements AudioManager.OnAudioFocusChangeListener {
            public static final com.twilio.audioswitch.AudioSwitch.1 INSTANCE;

            static {
                com.twilio.audioswitch.AudioSwitch.1.INSTANCE = new com.twilio.audioswitch.AudioSwitch.1();
            }

            public com.twilio.audioswitch.AudioSwitch.1() {
                super();
            }

            @Override  // android.media.AudioManager$OnAudioFocusChangeListener
            public final void onAudioFocusChange(int v) {
            }
        }

    }

    public AudioSwitch(Context context0, boolean z, AudioManager.OnAudioFocusChangeListener audioManager$OnAudioFocusChangeListener0, List list0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            z = false;
        }
        if((v & 4) != 0) {
            audioManager$OnAudioFocusChangeListener0 = com.twilio.audioswitch.AudioSwitch.1.INSTANCE;
        }
        if((v & 8) != 0) {
            list0 = Companion.access$getDefaultPreferredDeviceList$p(AudioSwitch.Companion);
        }
        this(context0, z, audioManager$OnAudioFocusChangeListener0, list0);
    }

    public static final void access$enumerateDevices(AudioSwitch audioSwitch0, String s) {
        audioSwitch0.enumerateDevices(s);
    }

    public static final AudioDevice access$getUserSelectedDevice$p(AudioSwitch audioSwitch0) {
        return audioSwitch0.userSelectedDevice;
    }

    public static final boolean access$getWiredHeadsetAvailable$p(AudioSwitch audioSwitch0) {
        return audioSwitch0.wiredHeadsetAvailable;
    }

    public static final void access$setUserSelectedDevice$p(AudioSwitch audioSwitch0, AudioDevice audioDevice0) {
        audioSwitch0.userSelectedDevice = audioDevice0;
    }

    public static final void access$setWiredHeadsetAvailable$p(AudioSwitch audioSwitch0, boolean z) {
        audioSwitch0.wiredHeadsetAvailable = z;
    }

    private final void activate(AudioDevice audioDevice0) {
        if(audioDevice0 instanceof BluetoothHeadset) {
            this.audioDeviceManager.enableSpeakerphone(false);
            BluetoothHeadsetManager bluetoothHeadsetManager0 = this.bluetoothHeadsetManager;
            if(bluetoothHeadsetManager0 != null) {
                bluetoothHeadsetManager0.activate();
            }
        }
        else if(audioDevice0 instanceof Earpiece || audioDevice0 instanceof WiredHeadset) {
            this.audioDeviceManager.enableSpeakerphone(false);
            BluetoothHeadsetManager bluetoothHeadsetManager1 = this.bluetoothHeadsetManager;
            if(bluetoothHeadsetManager1 != null) {
                bluetoothHeadsetManager1.deactivate();
            }
        }
        else if(audioDevice0 instanceof Speakerphone) {
            this.audioDeviceManager.enableSpeakerphone(true);
            BluetoothHeadsetManager bluetoothHeadsetManager2 = this.bluetoothHeadsetManager;
            if(bluetoothHeadsetManager2 != null) {
                bluetoothHeadsetManager2.deactivate();
            }
        }
    }

    public final void activate() {
        switch(AudioSwitch.WhenMappings.$EnumSwitchMapping$2[this.state.ordinal()]) {
            case 1: {
                this.state = State.ACTIVATED;
                this.audioDeviceManager.cacheAudioState();
                this.audioDeviceManager.mute(false);
                this.audioDeviceManager.setAudioFocus();
                AudioDevice audioDevice0 = this.selectedDevice;
                if(audioDevice0 != null) {
                    this.activate(audioDevice0);
                    return;
                }
                break;
            }
            case 2: {
                AudioDevice audioDevice1 = this.selectedDevice;
                if(audioDevice1 != null) {
                    this.activate(audioDevice1);
                    return;
                }
                break;
            }
            case 3: {
                throw new IllegalStateException();
            }
        }
    }

    private final void addAvailableAudioDevices(String s) {
        this.mutableAudioDevices.clear();
        for(Object object0: this.preferredDeviceList) {
            Class class0 = (Class)object0;
            if(j.a(class0, BluetoothHeadset.class)) {
                BluetoothHeadsetManager bluetoothHeadsetManager0 = this.bluetoothHeadsetManager;
                if(bluetoothHeadsetManager0 == null) {
                    continue;
                }
                BluetoothHeadset audioDevice$BluetoothHeadset0 = bluetoothHeadsetManager0.getHeadset(s);
                if(audioDevice$BluetoothHeadset0 == null) {
                    continue;
                }
                this.mutableAudioDevices.add(audioDevice$BluetoothHeadset0);
            }
            else if(j.a(class0, WiredHeadset.class)) {
                if(!this.wiredHeadsetAvailable) {
                    continue;
                }
                WiredHeadset audioDevice$WiredHeadset0 = new WiredHeadset(null, 1, null);
                this.mutableAudioDevices.add(audioDevice$WiredHeadset0);
            }
            else if(j.a(class0, Earpiece.class)) {
                if(!this.audioDeviceManager.hasEarpiece() || this.wiredHeadsetAvailable) {
                    continue;
                }
                Earpiece audioDevice$Earpiece0 = new Earpiece(null, 1, null);
                this.mutableAudioDevices.add(audioDevice$Earpiece0);
            }
            else if(j.a(class0, Speakerphone.class) && this.audioDeviceManager.hasSpeakerphone()) {
                Speakerphone audioDevice$Speakerphone0 = new Speakerphone(null, 1, null);
                this.mutableAudioDevices.add(audioDevice$Speakerphone0);
            }
        }
        this.logger.d("AudioSwitch", "Available AudioDevice list updated: " + this.availableAudioDevices);
    }

    private final void closeListeners() {
        this.state = State.STOPPED;
        BluetoothHeadsetManager bluetoothHeadsetManager0 = this.bluetoothHeadsetManager;
        if(bluetoothHeadsetManager0 != null) {
            bluetoothHeadsetManager0.stop();
        }
        this.wiredHeadsetReceiver.stop();
        this.audioDeviceChangeListener = null;
    }

    public final void deactivate() {
        if(AudioSwitch.WhenMappings.$EnumSwitchMapping$3[this.state.ordinal()] == 1) {
            this.state = State.STARTED;
            BluetoothHeadsetManager bluetoothHeadsetManager0 = this.bluetoothHeadsetManager;
            if(bluetoothHeadsetManager0 != null) {
                bluetoothHeadsetManager0.deactivate();
            }
            this.audioDeviceManager.restoreAudioState();
        }
    }

    private final void enumerateDevices(String s) {
        ArrayList arrayList0 = new ArrayList(r.b0(this.mutableAudioDevices));
        for(Object object0: this.mutableAudioDevices) {
            arrayList0.add(((AudioDevice)object0));
        }
        AudioDeviceState audioSwitch$AudioDeviceState0 = new AudioDeviceState(arrayList0, this.selectedDevice);
        this.addAvailableAudioDevices(s);
        AudioDevice audioDevice0 = null;
        if(!this.userSelectedDevicePresent(this.mutableAudioDevices)) {
            this.userSelectedDevice = null;
        }
        this.logger.d("AudioSwitch", "Current user selected AudioDevice = " + this.userSelectedDevice);
        AudioDevice audioDevice1 = this.userSelectedDevice;
        if(audioDevice1 != null) {
            audioDevice0 = audioDevice1;
        }
        else if(this.mutableAudioDevices.size() > 0) {
            Object object1 = this.mutableAudioDevices.get(0);
            j.e(object1, "mutableAudioDevices[0]");
            audioDevice0 = (AudioDevice)object1;
            if(audioDevice0 instanceof BluetoothHeadset && (this.bluetoothHeadsetManager != null && this.bluetoothHeadsetManager.hasActivationError())) {
                audioDevice0 = (AudioDevice)this.mutableAudioDevices.get(1);
            }
        }
        this.selectedDevice = audioDevice0;
        if(this.state == State.ACTIVATED) {
            this.activate();
        }
        if(!new AudioDeviceState(this.mutableAudioDevices, this.selectedDevice).equals(audioSwitch$AudioDeviceState0)) {
            Function2 function20 = this.audioDeviceChangeListener;
            if(function20 != null) {
                t t0 = (t)function20.j(this.mutableAudioDevices, this.selectedDevice);
            }
        }
    }

    public static void enumerateDevices$default(AudioSwitch audioSwitch0, String s, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        audioSwitch0.enumerateDevices(s);
    }

    public final Function2 getAudioDeviceChangeListener$audioswitch_release() {
        return this.audioDeviceChangeListener;
    }

    public final List getAvailableAudioDevices() {
        return this.availableAudioDevices;
    }

    public final BluetoothHeadsetConnectionListener getBluetoothDeviceConnectionListener$audioswitch_release() {
        return this.bluetoothDeviceConnectionListener;
    }

    public final boolean getLoggingEnabled() {
        return this.logger.getLoggingEnabled();
    }

    private final List getPreferredDeviceList(List list0) {
        if(!this.hasNoDuplicates(list0)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if(!list0.isEmpty()) {
            Companion audioSwitch$Companion0 = AudioSwitch.Companion;
            if(!list0.equals(Companion.access$getDefaultPreferredDeviceList$p(audioSwitch$Companion0))) {
                List list1 = p.R0(Companion.access$getDefaultPreferredDeviceList$p(audioSwitch$Companion0));
                ((ArrayList)list1).removeAll(list0);
                int v = 0;
                for(Object object0: list0) {
                    if(v >= 0) {
                        ((ArrayList)list1).add(v, ((Class)object0));
                        ++v;
                        continue;
                    }
                    q.Z();
                    throw null;
                }
                return list1;
            }
        }
        return Companion.access$getDefaultPreferredDeviceList$p(AudioSwitch.Companion);
    }

    public final AudioDevice getSelectedAudioDevice() {
        return this.selectedDevice;
    }

    public final State getState$audioswitch_release() {
        return this.state;
    }

    public final WiredDeviceConnectionListener getWiredDeviceConnectionListener$audioswitch_release() {
        return this.wiredDeviceConnectionListener;
    }

    private final boolean hasNoDuplicates(List list0) {
        com.twilio.audioswitch.AudioSwitch.hasNoDuplicates..inlined.groupingBy.1 audioSwitch$hasNoDuplicates$$inlined$groupingBy$10 = new C() {
            @Override  // Bb.C
            public Object keyOf(Object object0) {
                return (Class)object0;
            }

            @Override  // Bb.C
            public Iterator sourceIterator() {
                return this.$this_groupingBy.iterator();
            }
        };
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        Iterator iterator0 = audioSwitch$hasNoDuplicates$$inlined$groupingBy$10.sourceIterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            Object object1 = audioSwitch$hasNoDuplicates$$inlined$groupingBy$10.keyOf(object0);
            Object object2 = linkedHashMap0.get(object1);
            if(object2 == null && !linkedHashMap0.containsKey(object1)) {
                object2 = new u();  // initializer: Ljava/lang/Object;-><init>()V
            }
            ++((u)object2).X;
            linkedHashMap0.put(object1, ((u)object2));
        }
        for(Object object3: linkedHashMap0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object3;
            j.d(map$Entry0, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4>");
            if(map$Entry0 instanceof a && !(map$Entry0 instanceof d)) {
                z.f(map$Entry0, "kotlin.collections.MutableMap.MutableEntry");
                throw null;
            }
            map$Entry0.setValue(((int)((u)map$Entry0.getValue()).X));
        }
        Map map0 = z.c(linkedHashMap0);
        LinkedHashMap linkedHashMap1 = new LinkedHashMap();
        for(Object object4: map0.entrySet()) {
            Map.Entry map$Entry1 = (Map.Entry)object4;
            if(((Number)map$Entry1.getValue()).intValue() > 1) {
                linkedHashMap1.put(map$Entry1.getKey(), map$Entry1.getValue());
            }
        }
        return linkedHashMap1.isEmpty();
    }

    public final void selectDevice(AudioDevice audioDevice0) {
        if(!j.a(this.selectedDevice, audioDevice0)) {
            this.logger.d("AudioSwitch", "Selected AudioDevice = " + audioDevice0);
            this.userSelectedDevice = audioDevice0;
            AudioSwitch.enumerateDevices$default(this, null, 1, null);
        }
    }

    public final void setAudioDeviceChangeListener$audioswitch_release(Function2 function20) {
        this.audioDeviceChangeListener = function20;
    }

    public final void setLoggingEnabled(boolean z) {
        this.logger.setLoggingEnabled(z);
    }

    public final void setState$audioswitch_release(State audioSwitch$State0) {
        j.f(audioSwitch$State0, "<set-?>");
        this.state = audioSwitch$State0;
    }

    public final void start(Function2 function20) {
        j.f(function20, "listener");
        this.audioDeviceChangeListener = function20;
        if(AudioSwitch.WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()] != 1) {
            this.logger.d("AudioSwitch", "Redundant start() invocation while already in the started or activated state");
            return;
        }
        this.state = State.STARTED;
        AudioSwitch.enumerateDevices$default(this, null, 1, null);
        BluetoothHeadsetManager bluetoothHeadsetManager0 = this.bluetoothHeadsetManager;
        if(bluetoothHeadsetManager0 != null) {
            bluetoothHeadsetManager0.start(this.bluetoothDeviceConnectionListener);
        }
        this.wiredHeadsetReceiver.start(this.wiredDeviceConnectionListener);
    }

    public final void stop() {
        switch(AudioSwitch.WhenMappings.$EnumSwitchMapping$1[this.state.ordinal()]) {
            case 1: {
                this.deactivate();
                this.closeListeners();
                return;
            }
            case 2: {
                this.closeListeners();
                return;
            }
            case 3: {
                this.logger.d("AudioSwitch", "Redundant stop() invocation while already in the stopped state");
            }
        }
    }

    private final boolean userSelectedDevicePresent(List list0) {
        AudioDevice audioDevice0 = this.userSelectedDevice;
        if(audioDevice0 != null) {
            if(!(audioDevice0 instanceof BluetoothHeadset)) {
                return list0.contains(audioDevice0);
            }
            Object object0 = null;
            for(Object object1: list0) {
                if(((AudioDevice)object1) instanceof BluetoothHeadset) {
                    object0 = object1;
                    break;
                }
            }
            if(((AudioDevice)object0) != null) {
                this.userSelectedDevice = (AudioDevice)object0;
                return true;
            }
        }
        return false;
    }
}

