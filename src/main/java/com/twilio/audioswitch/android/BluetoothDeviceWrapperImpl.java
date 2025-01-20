package com.twilio.audioswitch.android;

import Nb.j;
import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class BluetoothDeviceWrapperImpl implements BluetoothDeviceWrapper {
    private final BluetoothDevice device;
    private final Integer deviceClass;
    private final String name;

    public BluetoothDeviceWrapperImpl(BluetoothDevice bluetoothDevice0, String s, Integer integer0) {
        j.f(bluetoothDevice0, "device");
        j.f(s, "name");
        super();
        this.device = bluetoothDevice0;
        this.name = s;
        this.deviceClass = integer0;
    }

    public BluetoothDeviceWrapperImpl(BluetoothDevice bluetoothDevice0, String s, Integer integer0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            s = bluetoothDevice0.getName();
            if(s == null) {
                s = "Bluetooth";
            }
        }
        if((v & 4) != 0) {
            BluetoothClass bluetoothClass0 = bluetoothDevice0.getBluetoothClass();
            integer0 = bluetoothClass0 == null ? null : bluetoothClass0.getDeviceClass();
        }
        this(bluetoothDevice0, s, integer0);
    }

    public final BluetoothDevice component1() {
        return this.device;
    }

    public final String component2() {
        return this.getName();
    }

    public final Integer component3() {
        return this.getDeviceClass();
    }

    public final BluetoothDeviceWrapperImpl copy(BluetoothDevice bluetoothDevice0, String s, Integer integer0) {
        j.f(bluetoothDevice0, "device");
        j.f(s, "name");
        return new BluetoothDeviceWrapperImpl(bluetoothDevice0, s, integer0);
    }

    public static BluetoothDeviceWrapperImpl copy$default(BluetoothDeviceWrapperImpl bluetoothDeviceWrapperImpl0, BluetoothDevice bluetoothDevice0, String s, Integer integer0, int v, Object object0) {
        if((v & 1) != 0) {
            bluetoothDevice0 = bluetoothDeviceWrapperImpl0.device;
        }
        if((v & 2) != 0) {
            s = bluetoothDeviceWrapperImpl0.getName();
        }
        if((v & 4) != 0) {
            integer0 = bluetoothDeviceWrapperImpl0.getDeviceClass();
        }
        return bluetoothDeviceWrapperImpl0.copy(bluetoothDevice0, s, integer0);
    }

    // Deobfuscation rating: LOW(40)
    @Override
    public boolean equals(Object object0) {
        return this == object0 || object0 instanceof BluetoothDeviceWrapperImpl && j.a(this.device, ((BluetoothDeviceWrapperImpl)object0).device) && j.a(this.getName(), ((BluetoothDeviceWrapperImpl)object0).getName()) && j.a(this.getDeviceClass(), ((BluetoothDeviceWrapperImpl)object0).getDeviceClass());
    }

    public final BluetoothDevice getDevice() {
        return this.device;
    }

    @Override  // com.twilio.audioswitch.android.BluetoothDeviceWrapper
    public Integer getDeviceClass() {
        return this.deviceClass;
    }

    @Override  // com.twilio.audioswitch.android.BluetoothDeviceWrapper
    public String getName() {
        return this.name;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.device == null ? 0 : this.device.hashCode();
        String s = this.getName();
        int v2 = s == null ? 0 : s.hashCode();
        Integer integer0 = this.getDeviceClass();
        if(integer0 != null) {
            v = integer0.hashCode();
        }
        return (v1 * 0x1F + v2) * 0x1F + v;
    }

    @Override
    public String toString() {
        return "BluetoothDeviceWrapperImpl(device=" + this.device + ", name=" + this.getName() + ", deviceClass=" + this.getDeviceClass() + ")";
    }
}

