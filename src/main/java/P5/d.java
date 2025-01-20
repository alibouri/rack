package p5;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.os.Build;
import android.telephony.TelephonyManager;
import b4.A0;
import g.a;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import q5.b;
import q5.c;
import q5.e;
import q5.f;
import q5.h;
import q5.i;
import q5.j;
import q5.k;
import q5.l;
import q5.n;
import q5.o;
import q5.q;
import q5.r;
import q5.s;
import q5.t;
import q5.v;
import s5.g;

public final class d implements g {
    public final a a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final A5.a e;
    public final A5.a f;
    public final int g;

    public d(Context context0, A5.a a0, A5.a a1) {
        s7.d d0 = new s7.d();
        d0.a(o.class, c.a);
        d0.a(i.class, c.a);
        d0.a(s.class, f.a);
        d0.a(l.class, f.a);
        d0.a(q.class, q5.d.a);
        d0.a(j.class, q5.d.a);
        d0.a(q5.a.class, b.a);
        d0.a(h.class, b.a);
        d0.a(r.class, e.a);
        d0.a(k.class, e.a);
        d0.a(v.class, q5.g.a);
        d0.a(n.class, q5.g.a);
        d0.d = true;
        this.a = new a(23, d0);
        this.c = context0;
        this.b = (ConnectivityManager)context0.getSystemService("connectivity");
        this.d = d.b(p5.a.c);
        this.e = a1;
        this.f = a0;
        this.g = 130000;
    }

    public final r5.h a(r5.h h0) {
        int v4;
        NetworkInfo networkInfo0 = this.b.getActiveNetworkInfo();
        A0 a00 = h0.c();
        int v = Build.VERSION.SDK_INT;
        HashMap hashMap0 = (HashMap)a00.g;
        if(hashMap0 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap0.put("sdk-version", String.valueOf(v));
        a00.c("model", Build.MODEL);
        a00.c("hardware", Build.HARDWARE);
        a00.c("device", Build.DEVICE);
        a00.c("product", Build.PRODUCT);
        a00.c("os-uild", Build.ID);
        a00.c("manufacturer", Build.MANUFACTURER);
        a00.c("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        int v1 = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis());
        HashMap hashMap1 = (HashMap)a00.g;
        if(hashMap1 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap1.put("tz-offset", String.valueOf(v1 / 1000));
        int v2 = -1;
        int v3 = networkInfo0 == null ? -1 : networkInfo0.getType();
        HashMap hashMap2 = (HashMap)a00.g;
        if(hashMap2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap2.put("net-type", String.valueOf(v3));
        if(networkInfo0 == null) {
            v4 = 0;
        }
        else {
            v4 = networkInfo0.getSubtype();
            if(v4 == -1) {
                v4 = 100;
            }
            else if(((t)t.X.get(v4)) == null) {
                v4 = 0;
            }
        }
        HashMap hashMap3 = (HashMap)a00.g;
        if(hashMap3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap3.put("mobile-subtype", String.valueOf(v4));
        a00.c("country", Locale.getDefault().getCountry());
        a00.c("locale", Locale.getDefault().getLanguage());
        a00.c("mcc_mnc", ((TelephonyManager)this.c.getSystemService("phone")).getSimOperator());
        try {
            v2 = this.c.getPackageManager().getPackageInfo("com.wave.personal", 0).versionCode;
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            android.support.v4.media.session.a.y("CctTransportBackend", "Unable to find version code for package", packageManager$NameNotFoundException0);
        }
        a00.c("application_build", Integer.toString(v2));
        return a00.f();
    }

    public static URL b(String s) {
        try {
            return new URL(s);
        }
        catch(MalformedURLException malformedURLException0) {
            throw new IllegalArgumentException("Invalid url: " + s, malformedURLException0);
        }
    }
}

