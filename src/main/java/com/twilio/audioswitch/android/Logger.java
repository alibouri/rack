package com.twilio.audioswitch.android;

public interface Logger {
    void d(String arg1, String arg2);

    void e(String arg1, String arg2);

    void e(String arg1, String arg2, Throwable arg3);

    boolean getLoggingEnabled();

    void setLoggingEnabled(boolean arg1);

    void w(String arg1, String arg2);
}

