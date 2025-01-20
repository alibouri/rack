package c8;

import Ab.k;
import Ab.t;
import Bb.F;
import Fb.c;
import Nb.j;
import T1.h;
import Xb.J;
import a8.Q;
import a8.b;
import a8.q;
import android.os.Build.VERSION;
import android.os.Build;
import android.util.Log;
import hc.a;
import hc.e;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;

public final class d {
    public final CoroutineContext a;
    public final y7.d b;
    public final Q c;
    public final n d;
    public final hc.d e;

    public d(CoroutineContext coroutineContext0, y7.d d0, b b0, Q q0, h h0) {
        this.a = coroutineContext0;
        this.b = d0;
        this.c = q0;
        this.d = new n(h0);
        this.e = e.a();
    }

    public final Boolean a() {
        f f0 = this.d.b;
        if(f0 != null) {
            return f0.a;
        }
        j.p("sessionConfigs");
        throw null;
    }

    public static String b(String s) {
        Pattern pattern0 = Pattern.compile("/");
        j.e(pattern0, "compile(...)");
        String s1 = pattern0.matcher(s).replaceAll("");
        j.e(s1, "replaceAll(...)");
        return s1;
    }

    public final Object c(g g0) {
        a a2;
        Object object3;
        String s;
        d d1;
        a a1;
        c8.a a0;
        if(g0 instanceof c8.a) {
            a0 = (c8.a)g0;
            int v = a0.f0;
            if((v & 0x80000000) == 0) {
                a0 = new c8.a(this, ((c)g0));
            }
            else {
                a0.f0 = v ^ 0x80000000;
            }
        }
        else {
            a0 = new c8.a(this, ((c)g0));
        }
        Object object0 = a0.d0;
        Object object1 = Eb.a.X;
        Object object2 = t.a;
        switch(a0.f0) {
            case 0: {
                W5.f.b0(object0);
                hc.d d0 = this.e;
                if(!d0.c() && !this.d.b()) {
                    return object2;
                }
                a0.b0 = this;
                a0.c0 = d0;
                a0.f0 = 1;
                if(d0.d(null, a0) == object1) {
                    return object1;
                }
                a1 = d0;
                d1 = this;
                goto label_29;
            }
            case 1: {
                a1 = a0.c0;
                d1 = (d)a0.b0;
                W5.f.b0(object0);
                try {
                label_29:
                    if(!d1.d.b()) {
                        Log.d("SessionConfigFetcher", "Remote settings cache not expired. Using cached values.");
                        goto label_44;
                    }
                    a0.b0 = d1;
                    a0.c0 = a1;
                    a0.f0 = 2;
                    object0 = q.c.a(d1.b, a0);
                    if(object0 == object1) {
                        return object1;
                    }
                    goto label_41;
                }
                catch(Throwable throwable0) {
                    a2 = a1;
                    ((hc.d)a2).f(null);
                    throw throwable0;
                }
            }
            case 2: {
                a1 = a0.c0;
                d1 = (d)a0.b0;
                try {
                    W5.f.b0(object0);
                label_41:
                    s = ((q)object0).a;
                    if(s.equals("")) {
                        Log.w("SessionConfigFetcher", "Error getting Firebase Installation ID. Skipping this Session Event.");
                        goto label_44;
                    }
                    goto label_46;
                }
                catch(Throwable throwable0) {
                    a2 = a1;
                    ((hc.d)a2).f(null);
                    throw throwable0;
                }
            label_44:
                ((hc.d)a1).f(null);
                return object2;
                try {
                label_46:
                    k k0 = new k("X-Crashlytics-Installation-ID", s);
                    String s1 = String.format("%s/%s", Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2));
                    d1.getClass();
                    k k1 = new k("X-Crashlytics-Device-Model", d.b(s1));
                    String s2 = Build.VERSION.INCREMENTAL;
                    j.e(s2, "INCREMENTAL");
                    k k2 = new k("X-Crashlytics-OS-Build-Version", d.b(s2));
                    String s3 = Build.VERSION.RELEASE;
                    j.e(s3, "RELEASE");
                    Map map0 = F.K(new k[]{k0, k1, k2, new k("X-Crashlytics-OS-Display-Version", d.b(s3)), new k("X-Crashlytics-API-Client-Version", "2.0.0")});
                    Log.d("SessionConfigFetcher", "Fetching settings from server.");
                    c8.b b0 = new c8.b(d1, null);
                    c8.c c0 = new c8.c(2, null);  // initializer: LFb/j;-><init>(ILkotlin/coroutines/g;)V
                    a0.b0 = a1;
                    a0.c0 = null;
                    a0.f0 = 3;
                    c8.e e0 = new c8.e(d1.c, map0, b0, c0, null);
                    object3 = J.y(((CoroutineContext)d1.c.Y), e0, a0);
                }
                catch(Throwable throwable0) {
                    a2 = a1;
                    ((hc.d)a2).f(null);
                    throw throwable0;
                }
                if(object3 != object1) {
                    object3 = object2;
                }
                if(object3 == object1) {
                    return object1;
                }
                a2 = a1;
                break;
            }
            case 3: {
                a2 = (a)a0.b0;
                try {
                    W5.f.b0(object0);
                    break;
                }
                catch(Throwable throwable0) {
                }
                ((hc.d)a2).f(null);
                throw throwable0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ((hc.d)a2).f(null);
        return object2;
    }
}

