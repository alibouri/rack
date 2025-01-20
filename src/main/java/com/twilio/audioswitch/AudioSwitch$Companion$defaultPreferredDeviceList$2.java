package com.twilio.audioswitch;

import Bb.q;
import Nb.k;
import java.util.List;
import kotlin.jvm.functions.Function0;

final class AudioSwitch.Companion.defaultPreferredDeviceList.2 extends k implements Function0 {
    public static final AudioSwitch.Companion.defaultPreferredDeviceList.2 INSTANCE;

    static {
        AudioSwitch.Companion.defaultPreferredDeviceList.2.INSTANCE = new AudioSwitch.Companion.defaultPreferredDeviceList.2();
    }

    public AudioSwitch.Companion.defaultPreferredDeviceList.2() {
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public Object invoke() {
        return this.invoke();
    }

    public final List invoke() {
        return q.L(new Class[]{BluetoothHeadset.class, WiredHeadset.class, Earpiece.class, Speakerphone.class});
    }
}

