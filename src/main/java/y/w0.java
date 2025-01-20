package y;

import Ab.t;
import Fb.c;
import Nb.v;
import a1.l;
import androidx.compose.foundation.gestures.a;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import kotlin.jvm.functions.Function2;
import m0.b;
import w.h0;
import w.p0;
import y0.f;
import yc.d;

public final class W0 {
    public P0 a;
    public p0 b;
    public m0 c;
    public q0 d;
    public boolean e;
    public NestedScrollDispatcher f;
    public int g;
    public w0 h;
    public final T0 i;
    public final F0 j;

    public W0(P0 p00, p0 p01, m0 m00, q0 q00, boolean z, NestedScrollDispatcher nestedScrollDispatcher0) {
        this.a = p00;
        this.b = p01;
        this.c = m00;
        this.d = q00;
        this.e = z;
        this.f = nestedScrollDispatcher0;
        this.g = 1;
        this.h = a.a;
        this.i = new T0(this);
        this.j = new F0(1, this);
    }

    public static final long a(W0 w00, w0 w01, long v, int v1) {
        f f0 = w00.f.a;
        f f1 = null;
        f f2 = f0 == null || !f0.k0 ? null : ((f)F0.f.k(f0));
        long v2 = f2 == null ? 0L : f2.e0(v1, v);
        long v3 = b.h(v, v2);
        long v4 = w00.d(w00.g(w01.a(w00.f(w00.d(b.a(v3, 0.0f, (w00.d == q0.Y ? 1 : 2)))))));
        long v5 = b.h(v3, v4);
        f f3 = w00.f.a;
        if(f3 != null && f3.k0) {
            f1 = (f)F0.f.k(f3);
        }
        return f1 == null ? b.i(b.i(v2, v4), 0L) : b.i(b.i(v2, v4), f1.Q(v4, v5, v1));
    }

    public final Object b(long v, c c0) {
        Q0 q00;
        if(c0 instanceof Q0) {
            q00 = (Q0)c0;
            int v1 = q00.e0;
            if((v1 & 0x80000000) == 0) {
                q00 = new Q0(this, c0);
            }
            else {
                q00.e0 = v1 ^ 0x80000000;
            }
        }
        else {
            q00 = new Q0(this, c0);
        }
        Object object0 = q00.c0;
        Object object1 = Eb.a.X;
        switch(q00.e0) {
            case 0: {
                W5.f.b0(object0);
                v v2 = new v();  // initializer: Ljava/lang/Object;-><init>()V
                v2.X = v;
                S0 s00 = new S0(this, v2, v, null);
                q00.b0 = v2;
                q00.e0 = 1;
                return this.e(h0.X, s00, q00) == object1 ? object1 : new l(v2.X);
            }
            case 1: {
                v v3 = q00.b0;
                W5.f.b0(object0);
                return new l(v3.X);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    // Deobfuscation rating: LOW(20)
    public final float c(float f) {
        return this.e ? f * -1.0f : f;
    }

    // Deobfuscation rating: LOW(20)
    public final long d(long v) {
        return this.e ? b.j(-1.0f, v) : v;
    }

    public final Object e(h0 h00, Function2 function20, c c0) {
        Object object0 = this.a.b(h00, new V0(this, function20, null), c0);
        return object0 == Eb.a.X ? object0 : t.a;
    }

    public final float f(long v) {
        return this.d == q0.Y ? b.d(v) : b.e(v);
    }

    public final long g(float f) {
        if(f == 0.0f) {
            return 0L;
        }
        return this.d == q0.Y ? d.d(f, 0.0f) : d.d(0.0f, f);
    }
}

