package V4;

import M4.B;
import M4.l;
import M4.y;
import N4.k;
import N4.m;
import N5.A;
import Nb.j;
import Z6.b;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import f5.a;
import java.util.Arrays;
import java.util.Locale;

public final class p {
    public static final p a;
    public static final long[] b;

    static {
        p.a = new p();  // initializer: Ljava/lang/Object;-><init>()V
        p.b = new long[]{300000L, 900000L, 1800000L, 3600000L, 21600000L, 43200000L, 86400000L, 172800000L, 259200000L, 604800000L, 1209600000L, 1814400000L, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};
    }

    public String a(Context context0) {
        if(a.b(this)) {
            return null;
        }
        try {
            PackageManager packageManager0 = context0.getPackageManager();
            String s = j.m(packageManager0.getPackageInfo("com.wave.personal", 0).versionName, "PCKGCHKSUM;");
            SharedPreferences sharedPreferences0 = context0.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            String s1 = sharedPreferences0.getString(s, null);
            if(s1 != null && s1.length() == 0x20) {
                return s1;
            }
            String s2 = n.b(context0);
            if(s2 == null) {
                ApplicationInfo applicationInfo0 = packageManager0.getApplicationInfo("com.wave.personal", 0);
                j.e(applicationInfo0, "pm.getApplicationInfo(context.packageName, 0)");
                s2 = n.a(applicationInfo0.sourceDir);
            }
            sharedPreferences0.edit().putString(s, s2).apply();
            return s2;
        }
        catch(Exception unused_ex) {
            return null;
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, this);
        return null;
    }

    public i b() {
        i i0 = null;
        i i1 = a.b(i.class) ? null : i.c;
        if(i1 == null) {
            synchronized(this) {
                if(!l.l.get()) {
                    return null;
                }
                if(!a.b(i.class)) {
                    i0 = i.c;
                }
                if(i0 == null) {
                    i1 = new i();
                    if(!a.b(i.class)) {
                        i.c = i1;
                    }
                }
                else {
                    i1 = i0;
                }
            }
        }
        return i1;
    }

    public static final void c(Context context0, String s, String s1) {
        Class class0 = p.class;
        if(a.b(class0)) {
            return;
        }
        try {
            j.f(context0, "context");
            Bundle bundle0 = new Bundle();
            bundle0.putString("fb_mobile_launch_source", "Unclassified");
            bundle0.putString("fb_mobile_pckg_fp", p.a.a(context0));
            bundle0.putString("fb_mobile_app_cert_hash", b.o(context0));
            m m0 = new m(s, s1);
            if(B.c()) {
                m0.e("fb_mobile_activate_app", bundle0);
            }
            if(io.sentry.hints.i.u() != k.Y && !a.b(m0)) {
                try {
                    N4.i.c(N4.p.X);
                }
                catch(Throwable throwable1) {
                    a.a(throwable1, m0);
                }
            }
        }
        catch(Throwable throwable0) {
            a.a(throwable0, class0);
        }
    }

    public void d() {
        if(a.b(this)) {
            return;
        }
        try {
            io.sentry.hints.i.C(y.b0, "V4.p", "Clock skew detected");
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
        }
    }

    public static final void e(String s, o o0, String s1) {
        Locale locale0;
        Bundle bundle0;
        long v1;
        Class class0 = p.class;
        if(a.b(class0)) {
            return;
        }
        if(o0 == null) {
            return;
        }
        try {
            Long long0 = (Long)o0.d;
            if(long0 == null) {
                long0 = 0L;
            }
            long v = (long)long0;
            p p0 = p.a;
            if(Long.compare(v, 0L) < 0) {
                p0.d();
                v = 0L;
            }
            Long long1 = (Long)o0.b;
            if(long1 == null) {
                v1 = 0L;
            }
            else {
                Long long2 = (Long)o0.c;
                v1 = long2 == null ? 0L : long2.longValue() - ((long)long1);
            }
            if(v1 < 0L) {
                p0.d();
                v1 = 0L;
            }
            bundle0 = new Bundle();
            bundle0.putInt("fb_mobile_app_interruptions", o0.a);
            locale0 = Locale.ROOT;
            if(a.b(class0)) {
                goto label_37;
            }
            else {
                goto label_29;
            }
            goto label_38;
        }
        catch(Throwable throwable0) {
            a.a(throwable0, class0);
            return;
        }
    label_29:
        int v2 = 0;
        while(true) {
            try {
                if(v2 >= 19 || p.b[v2] >= v) {
                    goto label_38;
                }
                ++v2;
            }
            catch(Throwable throwable1) {
                try {
                    a.a(throwable1, class0);
                label_37:
                    v2 = 0;
                label_38:
                    String s2 = "Unclassified";
                    bundle0.putString("fb_mobile_time_between_sessions", String.format(locale0, "session_quanta_%d", Arrays.copyOf(new Object[]{v2}, 1)));
                    A a0 = (A)o0.f;
                    if(a0 != null) {
                        String s3 = a0.toString();
                        if(s3 != null) {
                            s2 = s3;
                        }
                    }
                    bundle0.putString("fb_mobile_launch_source", s2);
                    Long long3 = (Long)o0.c;
                    bundle0.putLong("_logTime", (long3 == null ? 0L : ((long)long3)) / 1000L);
                    m m0 = new m(s, s1);
                    if(B.c()) {
                        m0.d("fb_mobile_deactivate_app", ((double)v1) / 1000.0, bundle0);
                    }
                    return;
                }
                catch(Throwable throwable0) {
                }
                break;
            }
        }
        a.a(throwable0, class0);
    }
}

