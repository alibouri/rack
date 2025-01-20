package com.twilio.audioswitch.bluetooth;

public interface BluetoothHeadsetConnectionListener {
    public static final class DefaultImpls {
        public static void onBluetoothHeadsetStateChanged$default(BluetoothHeadsetConnectionListener bluetoothHeadsetConnectionListener0, String s, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onBluetoothHeadsetStateChanged");
            }
            if((v & 1) != 0) {
                s = null;
            }
            bluetoothHeadsetConnectionListener0.onBluetoothHeadsetStateChanged(s);
        }
    }

    void onBluetoothHeadsetActivationError();

    void onBluetoothHeadsetStateChanged(String arg1);
}

