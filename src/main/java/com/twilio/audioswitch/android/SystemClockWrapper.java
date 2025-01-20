package com.twilio.audioswitch.android;

import android.os.SystemClock;

public final class SystemClockWrapper {
    public final long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }
}

