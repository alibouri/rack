package com.twilio.audioswitch.android;

import android.os.Build.VERSION;

public final class BuildWrapper {
    public final int getVersion() {
        return Build.VERSION.SDK_INT;
    }
}

