package com.twilio.audioswitch;

import Nb.j;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class AudioDevice {
    public static final class BluetoothHeadset extends AudioDevice {
        private final String name;

        public BluetoothHeadset() {
            this(null, 1, null);
        }

        public BluetoothHeadset(String s) {
            j.f(s, "name");
            super(null);
            this.name = s;
        }

        public BluetoothHeadset(String s, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                s = "Bluetooth";
            }
            this(s);
        }

        public final String component1() {
            return this.getName();
        }

        public final BluetoothHeadset copy(String s) {
            j.f(s, "name");
            return new BluetoothHeadset(s);
        }

        public static BluetoothHeadset copy$default(BluetoothHeadset audioDevice$BluetoothHeadset0, String s, int v, Object object0) {
            if((v & 1) != 0) {
                s = audioDevice$BluetoothHeadset0.getName();
            }
            return audioDevice$BluetoothHeadset0.copy(s);
        }

        // Deobfuscation rating: LOW(20)
        @Override
        public boolean equals(Object object0) {
            return this == object0 || object0 instanceof BluetoothHeadset && j.a(this.getName(), ((BluetoothHeadset)object0).getName());
        }

        @Override  // com.twilio.audioswitch.AudioDevice
        public String getName() {
            return this.name;
        }

        @Override
        public int hashCode() {
            String s = this.getName();
            return s == null ? 0 : s.hashCode();
        }

        @Override
        public String toString() {
            return "BluetoothHeadset(name=" + this.getName() + ")";
        }
    }

    public static final class Earpiece extends AudioDevice {
        private final String name;

        public Earpiece() {
            this(null, 1, null);
        }

        public Earpiece(String s) {
            j.f(s, "name");
            super(null);
            this.name = s;
        }

        public Earpiece(String s, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                s = "Earpiece";
            }
            this(s);
        }

        public final String component1() {
            return this.getName();
        }

        public final Earpiece copy(String s) {
            j.f(s, "name");
            return new Earpiece(s);
        }

        public static Earpiece copy$default(Earpiece audioDevice$Earpiece0, String s, int v, Object object0) {
            if((v & 1) != 0) {
                s = audioDevice$Earpiece0.getName();
            }
            return audioDevice$Earpiece0.copy(s);
        }

        // Deobfuscation rating: LOW(20)
        @Override
        public boolean equals(Object object0) {
            return this == object0 || object0 instanceof Earpiece && j.a(this.getName(), ((Earpiece)object0).getName());
        }

        @Override  // com.twilio.audioswitch.AudioDevice
        public String getName() {
            return this.name;
        }

        @Override
        public int hashCode() {
            String s = this.getName();
            return s == null ? 0 : s.hashCode();
        }

        @Override
        public String toString() {
            return "Earpiece(name=" + this.getName() + ")";
        }
    }

    public static final class Speakerphone extends AudioDevice {
        private final String name;

        public Speakerphone() {
            this(null, 1, null);
        }

        public Speakerphone(String s) {
            j.f(s, "name");
            super(null);
            this.name = s;
        }

        public Speakerphone(String s, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                s = "Speakerphone";
            }
            this(s);
        }

        public final String component1() {
            return this.getName();
        }

        public final Speakerphone copy(String s) {
            j.f(s, "name");
            return new Speakerphone(s);
        }

        public static Speakerphone copy$default(Speakerphone audioDevice$Speakerphone0, String s, int v, Object object0) {
            if((v & 1) != 0) {
                s = audioDevice$Speakerphone0.getName();
            }
            return audioDevice$Speakerphone0.copy(s);
        }

        // Deobfuscation rating: LOW(20)
        @Override
        public boolean equals(Object object0) {
            return this == object0 || object0 instanceof Speakerphone && j.a(this.getName(), ((Speakerphone)object0).getName());
        }

        @Override  // com.twilio.audioswitch.AudioDevice
        public String getName() {
            return this.name;
        }

        @Override
        public int hashCode() {
            String s = this.getName();
            return s == null ? 0 : s.hashCode();
        }

        @Override
        public String toString() {
            return "Speakerphone(name=" + this.getName() + ")";
        }
    }

    public static final class WiredHeadset extends AudioDevice {
        private final String name;

        public WiredHeadset() {
            this(null, 1, null);
        }

        public WiredHeadset(String s) {
            j.f(s, "name");
            super(null);
            this.name = s;
        }

        public WiredHeadset(String s, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                s = "Wired Headset";
            }
            this(s);
        }

        public final String component1() {
            return this.getName();
        }

        public final WiredHeadset copy(String s) {
            j.f(s, "name");
            return new WiredHeadset(s);
        }

        public static WiredHeadset copy$default(WiredHeadset audioDevice$WiredHeadset0, String s, int v, Object object0) {
            if((v & 1) != 0) {
                s = audioDevice$WiredHeadset0.getName();
            }
            return audioDevice$WiredHeadset0.copy(s);
        }

        // Deobfuscation rating: LOW(20)
        @Override
        public boolean equals(Object object0) {
            return this == object0 || object0 instanceof WiredHeadset && j.a(this.getName(), ((WiredHeadset)object0).getName());
        }

        @Override  // com.twilio.audioswitch.AudioDevice
        public String getName() {
            return this.name;
        }

        @Override
        public int hashCode() {
            String s = this.getName();
            return s == null ? 0 : s.hashCode();
        }

        @Override
        public String toString() {
            return "WiredHeadset(name=" + this.getName() + ")";
        }
    }

    private AudioDevice() {
    }

    public AudioDevice(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    public abstract String getName();
}

