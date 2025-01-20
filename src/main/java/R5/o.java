package r5;

import A5.a;
import X1.k;
import X2.g;
import a8.Q;
import android.content.Context;
import io.sentry.android.core.m;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import o5.c;
import w5.b;
import x5.h;
import x5.i;

public final class o {
    public final a a;
    public final a b;
    public final b c;
    public final h d;
    public static volatile g e;

    public o(a a0, a a1, b b0, h h0, i i0) {
        this.a = a0;
        this.b = a1;
        this.c = b0;
        this.d = h0;
        i0.getClass();
        m m0 = new m(7, i0);
        i0.a.execute(m0);
    }

    public static o a() {
        g g0 = o.e;
        if(g0 == null) {
            throw new IllegalStateException("Not initialized!");
        }
        return (o)((zb.a)g0.e0).get();
    }

    public static void b(Context context0) {
        if(o.e == null) {
            Class class0 = o.class;
            synchronized(class0) {
                if(o.e == null) {
                    k k0 = new k();  // initializer: Ljava/lang/Object;-><init>()V
                    context0.getClass();
                    k0.a = context0;
                    o.e = k0.b();
                }
            }
        }
    }

    public final n c(p5.a a0) {
        byte[] arr_b;
        Set set0;
        if(a0 instanceof j) {
            a0.getClass();
            set0 = Collections.unmodifiableSet(p5.a.d);
        }
        else {
            set0 = Collections.singleton(new c("proto"));
        }
        Q q0 = r5.i.a();
        a0.getClass();
        q0.Y = "cct";
        String s = a0.a;
        String s1 = a0.b;
        if(s1 != null || s != null) {
            if(s1 == null) {
                s1 = "";
            }
            arr_b = ("1$" + s + "\\" + s1).getBytes(Charset.forName("UTF-8"));
        }
        else {
            arr_b = null;
        }
        q0.Z = arr_b;
        return new n(set0, q0.f(), this);
    }
}

