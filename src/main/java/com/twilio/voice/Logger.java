package com.twilio.voice;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;

public final class Logger {
    public static final int INHERIT = 8;
    private static int globalLevel;
    private int level;
    private static final Map loggers;
    private final String name;

    static {
        Logger.loggers = new HashMap();
        Logger.globalLevel = 6;
    }

    private Logger(String s) {
        this.level = 8;
        this.name = s;
    }

    public void d(String s) {
        if(this.isDebugEnabled()) {
            Log.d(this.name, s);
        }
    }

    public void d(String s, Throwable throwable0) {
        if(this.isDebugEnabled()) {
            Log.d(this.name, s, throwable0);
        }
    }

    public void e(String s) {
        if(this.isErrorEnabled()) {
            Log.e(this.name, s);
        }
    }

    public void e(String s, Throwable throwable0) {
        if(this.isErrorEnabled()) {
            Log.e(this.name, s, throwable0);
        }
    }

    public static int getLogLevel() {
        return Logger.globalLevel;
    }

    public static Logger getLogger(Class class0) {
        Map map0 = Logger.loggers;
        if(!map0.containsKey(class0)) {
            synchronized(map0) {
                if(!map0.containsKey(class0)) {
                    map0.put(class0, new Logger(class0.getSimpleName()));
                }
            }
        }
        return (Logger)map0.get(class0);
    }

    public void i(String s) {
        if(this.isInfoEnabled()) {
            Log.i(this.name, s);
        }
    }

    public void i(String s, Throwable throwable0) {
        if(this.isInfoEnabled()) {
            Log.i(this.name, s, throwable0);
        }
    }

    public boolean isDebugEnabled() {
        return this.level <= 3 || this.level == 8 && Logger.globalLevel <= 3;
    }

    public boolean isErrorEnabled() {
        return this.level <= 6 || this.level == 8 && Logger.globalLevel <= 6;
    }

    public boolean isInfoEnabled() {
        return this.level <= 4 || this.level == 8 && Logger.globalLevel <= 4;
    }

    public boolean isVerboseEnabled() {
        return this.level <= 2 || this.level == 8 && Logger.globalLevel <= 2;
    }

    public boolean isWarnEnabled() {
        return this.level <= 5 || this.level == 8 && Logger.globalLevel <= 5;
    }

    public void setLevel(int v) {
        this.level = v;
    }

    public static void setLogLevel(int v) {
        Logger.globalLevel = v;
    }

    public void v(String s) {
        if(this.isVerboseEnabled()) {
            Log.v(this.name, s);
        }
    }

    public void v(String s, Throwable throwable0) {
        if(this.isVerboseEnabled()) {
            Log.v(this.name, s, throwable0);
        }
    }

    public void w(String s) {
        if(this.isWarnEnabled()) {
            Log.w(this.name, s);
        }
    }

    public void w(String s, Throwable throwable0) {
        if(this.isWarnEnabled()) {
            Log.w(this.name, s, throwable0);
        }
    }
}

