package M;

import A3.e;
import kotlin.jvm.functions.Function1;
import s.v;

public final class l0 implements M {
    public final boolean a;
    public final int b;
    public final int c;
    public final q d;
    public final o e;

    public l0(boolean z, int v, int v1, q q0, o o0) {
        this.a = z;
        this.b = v;
        this.c = v1;
        this.d = q0;
        this.e = o0;
    }

    @Override  // M.M
    public final boolean a() {
        return this.a;
    }

    @Override  // M.M
    public final boolean b(M m0) {
        if(this.d != null && m0 != null && m0 instanceof l0 && this.b == ((l0)m0).b && this.c == ((l0)m0).c && this.a == ((l0)m0).a) {
            this.e.getClass();
            o o0 = ((l0)m0).e;
            return this.e.a != o0.a || this.e.c != o0.c || this.e.d != o0.d;
        }
        return true;
    }

    @Override  // M.M
    public final o c() {
        return this.e;
    }

    @Override  // M.M
    public final q d() {
        return this.d;
    }

    @Override  // M.M
    public final o e() {
        return this.e;
    }

    @Override  // M.M
    public final void f(Function1 function10) {
    }

    @Override  // M.M
    public final o g() {
        return this.e;
    }

    @Override  // M.M
    public final int h() {
        return this.b;
    }

    @Override  // M.M
    public final int i() {
        return this.c;
    }

    @Override  // M.M
    public final v j(q q0) {
        boolean z = q0.c;
        if(!z && q0.a.b <= q0.b.b || z && q0.a.b <= q0.b.b) {
            q0 = q.a(q0, null, null, !z, 3);
        }
        v v0 = new v();
        v0.g(this.e.a, q0);
        return v0;
    }

    @Override  // M.M
    public final o k() {
        return this.e;
    }

    @Override  // M.M
    public final int l() {
        int v = this.b;
        int v1 = this.c;
        if(v < v1) {
            return 2;
        }
        return v <= v1 ? this.e.b() : 1;
    }

    @Override  // M.M
    public final int m() {
        return 1;
    }

    @Override
    public final String toString() {
        return "SingleSelectionLayout(isStartHandle=" + this.a + ", crossed=" + e.C(this.l()) + ", info=\n\t" + this.e + ')';
    }
}

