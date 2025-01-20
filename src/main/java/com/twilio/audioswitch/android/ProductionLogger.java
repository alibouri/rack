package com.twilio.audioswitch.android;

import Nb.j;
import android.util.Log;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ProductionLogger implements Logger {
    private boolean loggingEnabled;

    public ProductionLogger() {
        this(false, 1, null);
    }

    public ProductionLogger(boolean z) {
        this.loggingEnabled = z;
    }

    public ProductionLogger(boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            z = false;
        }
        this(z);
    }

    private final String createTag(String s) {
        return "AS/" + s;
    }

    @Override  // com.twilio.audioswitch.android.Logger
    public void d(String s, String s1) {
        j.f(s, "tag");
        j.f(s1, "message");
        if(this.getLoggingEnabled()) {
            Log.d(this.createTag(s), s1);
        }
    }

    @Override  // com.twilio.audioswitch.android.Logger
    public void e(String s, String s1) {
        j.f(s, "tag");
        j.f(s1, "message");
        if(this.getLoggingEnabled()) {
            Log.e(this.createTag(s), s1);
        }
    }

    @Override  // com.twilio.audioswitch.android.Logger
    public void e(String s, String s1, Throwable throwable0) {
        j.f(s, "tag");
        j.f(s1, "message");
        j.f(throwable0, "throwable");
        if(this.getLoggingEnabled()) {
            Log.e(this.createTag(s), s1, throwable0);
        }
    }

    @Override  // com.twilio.audioswitch.android.Logger
    public boolean getLoggingEnabled() {
        return this.loggingEnabled;
    }

    @Override  // com.twilio.audioswitch.android.Logger
    public void setLoggingEnabled(boolean z) {
        this.loggingEnabled = z;
    }

    @Override  // com.twilio.audioswitch.android.Logger
    public void w(String s, String s1) {
        j.f(s, "tag");
        j.f(s1, "message");
        if(this.getLoggingEnabled()) {
            Log.w(this.createTag(s), s1);
        }
    }
}

