package com.twilio.audioswitch.android;

import Nb.j;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Parcelable;

public final class BluetoothIntentProcessorImpl implements BluetoothIntentProcessor {
    @Override  // com.twilio.audioswitch.android.BluetoothIntentProcessor
    public BluetoothDeviceWrapper getBluetoothDevice(Intent intent0) {
        j.f(intent0, "intent");
        Parcelable parcelable0 = intent0.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        return ((BluetoothDevice)parcelable0) != null ? new BluetoothDeviceWrapperImpl(((BluetoothDevice)parcelable0), null, null, 6, null) : null;
    }
}

