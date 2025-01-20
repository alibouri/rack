package e0;

import kotlin.jvm.functions.Function1;

public abstract class g {
    public k a;
    public int b;
    public boolean c;
    public int d;

    public g(int v, k k0) {
        int v5;
        this.a = k0;
        this.b = v;
        if(v == 0) {
            v5 = -1;
        }
        else {
            k k1 = this.e();
            int[] arr_v = k1.b0;
            if(arr_v == null) {
                long v1 = k1.Y;
                int v2 = k1.Z;
                if(Long.compare(v1, 0L) == 0) {
                    long v3 = k1.X;
                    if(v3 != 0L) {
                        v = Long.numberOfTrailingZeros(v3) + (v2 + 0x40);
                    }
                }
                else {
                    v = Long.numberOfTrailingZeros(v1) + v2;
                }
            }
            else {
                v = arr_v[0];
            }
            synchronized(m.b) {
                v5 = m.e.a(v);
            }
        }
        this.d = v5;
    }

    public final void a() {
        synchronized(m.b) {
            this.b();
            this.o();
        }
    }

    public void b() {
        m.c = m.c.c(this.d());
    }

    public abstract void c();

    public int d() {
        return this.b;
    }

    public k e() {
        return this.a;
    }

    public abstract Function1 f();

    public abstract boolean g();

    public int h() {
        return 0;
    }

    public abstract Function1 i();

    public final g j() {
        g g0 = (g)m.a.p();
        m.a.F(this);
        return g0;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(t arg1);

    public void o() {
        int v = this.d;
        if(v >= 0) {
            m.v(v);
            this.d = -1;
        }
    }

    public static void p(g g0) {
        m.a.F(g0);
    }

    public void q(int v) {
        this.b = v;
    }

    public void r(k k0) {
        this.a = k0;
    }

    public void s(int v) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract g t(Function1 arg1);
}

