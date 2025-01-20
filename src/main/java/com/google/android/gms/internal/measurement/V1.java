package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.regex.Pattern;

public abstract class v1 {
    public static final Uri a;
    public static final Uri b;
    public static final Pattern c;
    public static final Pattern d;

    static {
        v1.a = Uri.parse("content://com.google.android.gsf.gservices");
        v1.b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
        v1.c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        v1.d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    }
}

