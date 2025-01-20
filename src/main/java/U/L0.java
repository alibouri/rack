package U;

import Nb.j;
import kotlin.jvm.functions.Function2;
import s.B;
import s.y;

public final class l0 {
    public int a;
    public s b;
    public c c;
    public Function2 d;
    public int e;
    public y f;
    public B g;

    public l0(s s0) {
        this.b = s0;
    }

    public static boolean a(C c0, B b0) {
        j.d(c0, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        G0 g00 = c0.Z;
        if(g00 == null) {
            g00 = Z.e;
        }
        return !g00.a(c0.m().f, b0.e(c0));
    }

    public final boolean b() {
        if(this.b != null) {
            return this.c == null ? false : this.c.a();
        }
        return false;
    }

    public final void c() {
        s s0 = this.b;
        if(s0 != null) {
            s0.p(this, null);
        }
    }

    public final int d(Object object0) {
        s s0 = this.b;
        if(s0 != null) {
            int v = s0.p(this, object0);
            return v == 0 ? 1 : v;
        }
        return 1;
    }

    public final void e() {
        s s0 = this.b;
        if(s0 != null) {
            s0.m0 = true;
        }
        this.b = null;
        this.f = null;
        this.g = null;
    }

    public final void f(boolean z) {
        if(z) {
            this.a |= 0x20;
            return;
        }
        this.a &= -33;
    }
}

