package j6;

import N5.r;
import O3.j;
import U5.b;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

public final class d extends j {
    public Boolean Z;
    public String b0;
    public e c0;
    public Boolean d0;

    public final boolean A(String s, A a0) {
        return this.B(s, a0);
    }

    public final boolean B(String s, A a0) {
        if(TextUtils.isEmpty(s)) {
            return ((Boolean)a0.a(null)).booleanValue();
        }
        String s1 = this.c0.d(s, a0.a);
        return TextUtils.isEmpty(s1) ? ((Boolean)a0.a(null)).booleanValue() : ((Boolean)a0.a(Boolean.valueOf("1".equals(s1)))).booleanValue();
    }

    public final boolean C(String s) {
        return "1".equals(this.c0.d(s, "measurement.event_sampling_enabled"));
    }

    public final boolean D() {
        Boolean boolean0 = this.z("google_analytics_automatic_screen_reporting_enabled");
        return boolean0 == null || boolean0.booleanValue();
    }

    public final boolean E() {
        if(this.Z == null) {
            Boolean boolean0 = this.z("app_measurement_lite");
            this.Z = boolean0;
            if(boolean0 == null) {
                this.Z = Boolean.FALSE;
            }
        }
        return this.Z.booleanValue() || !((d0)this.Y).c0;
    }

    public final double r(String s, A a0) {
        if(TextUtils.isEmpty(s)) {
            return (double)(((Double)a0.a(null)));
        }
        String s1 = this.c0.d(s, a0.a);
        if(TextUtils.isEmpty(s1)) {
            return (double)(((Double)a0.a(null)));
        }
        try {
            return (double)(((Double)a0.a(Double.parseDouble(s1))));
        }
        catch(NumberFormatException unused_ex) {
            return (double)(((Double)a0.a(null)));
        }
    }

    public final String s(String s) {
        try {
            String s1 = (String)Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, s, "");
            r.j(s1);
            return s1;
        }
        catch(ClassNotFoundException classNotFoundException0) {
            this.b().e0.b(classNotFoundException0, "Could not find SystemProperties class");
            return "";
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            this.b().e0.b(noSuchMethodException0, "Could not find SystemProperties.get() method");
            return "";
        }
        catch(IllegalAccessException illegalAccessException0) {
            this.b().e0.b(illegalAccessException0, "Could not access SystemProperties.get()");
            return "";
        }
        catch(InvocationTargetException invocationTargetException0) {
            this.b().e0.b(invocationTargetException0, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    public final boolean t(A a0) {
        return this.B(null, a0);
    }

    public final Bundle u() {
        d0 d00 = (d0)this.Y;
        try {
            if(d00.X.getPackageManager() == null) {
                this.b().e0.d("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo0 = b.a(d00.X).b(0x80, "com.wave.personal");
            if(applicationInfo0 == null) {
                this.b().e0.d("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return applicationInfo0.metaData;
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
        }
        this.b().e0.b(packageManager$NameNotFoundException0, "Failed to load metadata: Package name not found");
        return null;
    }

    public final int v(String s, A a0) {
        if(TextUtils.isEmpty(s)) {
            return (int)(((Integer)a0.a(null)));
        }
        String s1 = this.c0.d(s, a0.a);
        if(TextUtils.isEmpty(s1)) {
            return (int)(((Integer)a0.a(null)));
        }
        try {
            return (int)(((Integer)a0.a(Integer.parseInt(s1))));
        }
        catch(NumberFormatException unused_ex) {
            return (int)(((Integer)a0.a(null)));
        }
    }

    public final long w(String s, A a0) {
        if(TextUtils.isEmpty(s)) {
            return (long)(((Long)a0.a(null)));
        }
        String s1 = this.c0.d(s, a0.a);
        if(TextUtils.isEmpty(s1)) {
            return (long)(((Long)a0.a(null)));
        }
        try {
            return (long)(((Long)a0.a(Long.parseLong(s1))));
        }
        catch(NumberFormatException unused_ex) {
            return (long)(((Long)a0.a(null)));
        }
    }

    public final s0 x(String s, boolean z) {
        Object object0;
        r.f(s);
        Bundle bundle0 = this.u();
        if(bundle0 == null) {
            this.b().e0.d("Failed to load metadata: Metadata bundle is null");
            object0 = null;
        }
        else {
            object0 = bundle0.get(s);
        }
        s0 s00 = s0.Y;
        if(object0 == null) {
            return s00;
        }
        if(Boolean.TRUE.equals(object0)) {
            return s0.c0;
        }
        if(Boolean.FALSE.equals(object0)) {
            return s0.b0;
        }
        if(z && "eu_consent_policy".equals(object0)) {
            return s0.Z;
        }
        this.b().h0.b(s, "Invalid manifest metadata for");
        return s00;
    }

    // Deobfuscation rating: LOW(20)
    public final String y(String s, A a0) {
        return TextUtils.isEmpty(s) ? ((String)a0.a(null)) : ((String)a0.a(this.c0.d(s, a0.a)));
    }

    public final Boolean z(String s) {
        r.f(s);
        Bundle bundle0 = this.u();
        if(bundle0 == null) {
            this.b().e0.d("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        return bundle0.containsKey(s) ? Boolean.valueOf(bundle0.getBoolean(s)) : null;
    }
}

