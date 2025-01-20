package X1;

import C3.i;
import E7.h;
import K.v;
import R2.c;
import R2.f;
import R2.m;
import a8.Q;
import android.content.Context;
import g3.b;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.N0;
import r5.l;
import s5.e;

public final class k implements g {
    public Context a;

    @Override  // X1.g
    public void a(f f0) {
        a a0 = new a("EmojiCompatInitializer");
        ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), a0);
        threadPoolExecutor0.allowCoreThreadTimeOut(true);
        threadPoolExecutor0.execute(new h(this, f0, threadPoolExecutor0, 11));
    }

    public X2.g b() {
        Context context0 = this.a;
        if(context0 == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        X2.g g0 = new X2.g();
        g0.Y = t5.a.a(l.a);
        b b0 = new b(16, context0);
        g0.Z = b0;
        g0.b0 = t5.a.a(new v(b0, 17, new e(b0, 0)));
        b b1 = (b)g0.Z;
        g0.c0 = new b(20, b1);
        zb.a a0 = t5.a.a(new e(b1, 1));
        zb.a a1 = t5.a.a(new c(18, ((b)g0.c0), a0, false));
        g0.d0 = a1;
        q8.b b2 = new q8.b(3);
        b b3 = (b)g0.Z;
        w5.c c0 = new w5.c(b3, a1, b2);
        zb.a a2 = (zb.a)g0.Y;
        zb.a a3 = (zb.a)g0.b0;
        g0.e0 = t5.a.a(new Q(new i(a2, a3, c0, a1, a1), new N0(b3, a3, a1, c0, a2, a1, a1, 6), new m(a2, a1, c0, a1), 27));
        return g0;
    }
}

