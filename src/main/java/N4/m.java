package N4;

import M4.h;
import M4.l;
import M4.y;
import U4.c;
import U4.e;
import V4.d;
import a5.w;
import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import f5.a;
import io.sentry.hints.i;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.json.JSONException;

public final class m {
    public final String a;
    public final b b;
    public static ScheduledThreadPoolExecutor c;
    public static final Object d;
    public static String e;
    public static boolean f;

    static {
        m.d = new Object();
    }

    public m(Context context0, String s) {
        this(w.C(context0), s);
    }

    public m(String s, String s1) {
        j.J();
        this.a = s;
        AccessToken accessToken0 = M6.b.A();
        if(accessToken0 == null || new Date().after(accessToken0.X) || s1 != null && !s1.equals(accessToken0.f0)) {
            if(s1 == null) {
                l.a();
                s1 = l.b();
            }
            this.b = new b(null, s1);
        }
        else {
            String s2 = l.b();
            this.b = new b(accessToken0.c0, s2);
        }
        i.z();
    }

    // Deobfuscation rating: LOW(20)
    public static final String a() {
        return a.b(m.class) ? null : m.e;
    }

    // Deobfuscation rating: LOW(20)
    public static final ScheduledThreadPoolExecutor b() {
        return a.b(m.class) ? null : m.c;
    }

    // Deobfuscation rating: LOW(20)
    public static final Object c() {
        return a.b(m.class) ? null : m.d;
    }

    public final void d(String s, double f, Bundle bundle0) {
        if(a.b(this)) {
            return;
        }
        try {
            this.f(s, f, bundle0, false, d.b());
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
        }
    }

    public final void e(String s, Bundle bundle0) {
        if(a.b(this)) {
            return;
        }
        try {
            this.f(s, null, bundle0, false, d.b());
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
        }
    }

    public final void f(String s, Double double0, Bundle bundle0, boolean z, UUID uUID0) {
        boolean z2;
        Class class0;
        y y0;
        if(a.b(this)) {
            return;
        }
        if(s != null && s.length() != 0) {
            try {
                boolean z1 = a5.l.b("app_events_killswitch", l.b(), false);
                y0 = y.b0;
                if(z1) {
                    i.D(y0, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", new Object[]{s});
                    return;
                }
                class0 = U4.a.class;
                if(a.b(class0)) {
                    goto label_17;
                }
                else {
                    goto label_10;
                }
                goto label_18;
            }
            catch(Throwable throwable0) {
                a.a(throwable0, this);
                return;
            }
        label_10:
            if(U4.a.b) {
                try {
                    z2 = U4.a.c.contains(s);
                }
                catch(Throwable throwable1) {
                    try {
                        a.a(throwable1, class0);
                        z2 = false;
                        goto label_18;
                    label_17:
                        z2 = false;
                    label_18:
                        if(z2) {
                            return;
                        }
                        try {
                            c.e(s, bundle0);
                            e.b(bundle0);
                            i.h(new f(this.a, s, double0, bundle0, z, d.j == 0, uUID0), this.b);
                        }
                        catch(JSONException jSONException0) {
                            i.D(y0, "AppEvents", "JSON encoding for app event failed: \'%s\'", new Object[]{jSONException0.toString()});
                        }
                        catch(h h0) {
                            i.D(y0, "AppEvents", "Invalid app event: %s", new Object[]{h0.toString()});
                        }
                        return;
                    }
                    catch(Throwable throwable0) {
                    }
                    a.a(throwable0, this);
                    return;
                }
            }
            else {
                z2 = false;
            }
            goto label_18;
        }
    }

    public final void g(BigDecimal bigDecimal0, Currency currency0, Bundle bundle0) {
        if(a.b(this)) {
            return;
        }
        try {
            y y0 = y.c0;
            if(bigDecimal0 == null) {
                i.C(y0, "AppEvents", "purchaseAmount cannot be null");
                return;
            }
            if(currency0 == null) {
                i.C(y0, "AppEvents", "currency cannot be null");
                return;
            }
            if(bundle0 == null) {
                bundle0 = new Bundle();
            }
            bundle0.putString("fb_currency", currency0.getCurrencyCode());
            this.f("fb_mobile_purchase", bigDecimal0.doubleValue(), bundle0, true, d.b());
            if(i.u() != k.Y) {
                N4.i.c(p.b0);
            }
            return;
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, this);
    }
}

