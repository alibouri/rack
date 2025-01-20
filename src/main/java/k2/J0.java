package k2;

import Nb.j;
import p2.A;

public final class j0 implements A {
    public final A1 a;
    public final A b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    public j0(A1 a10, A1 a11, A a0) {
        j.f(a10, "oldList");
        j.f(a11, "newList");
        super();
        this.a = a11;
        this.b = a0;
        this.c = a10.a();
        this.d = a10.c();
        this.e = a10.d();
        this.f = 1;
        this.g = 1;
    }

    @Override  // p2.A
    public final void a(int v, int v1) {
        x x0 = x.X;
        A a0 = this.b;
        A1 a10 = this.a;
        int v2 = 0;
        if(v + v1 >= this.e && this.g != 3) {
            int v5 = Math.min(a10.c() - this.d, v1);
            if(v5 >= 0) {
                v2 = v5;
            }
            int v6 = v1 - v2;
            if(v2 > 0) {
                this.g = 2;
                a0.d(this.c + v, v2, x0);
                this.d += v2;
            }
            if(v6 > 0) {
                a0.a(v + v2 + this.c, v6);
            }
        }
        else if(v > 0 || this.f == 3) {
            a0.a(v + this.c, v1);
        }
        else {
            int v3 = Math.min(a10.a() - this.c, v1);
            if(v3 >= 0) {
                v2 = v3;
            }
            int v4 = v1 - v2;
            if(v4 > 0) {
                a0.a(this.c, v4);
            }
            if(v2 > 0) {
                this.f = 2;
                a0.d(this.c, v2, x0);
                this.c += v2;
            }
        }
        this.e -= v1;
    }

    @Override  // p2.A
    public final void b(int v, int v1) {
        this.b.b(v + this.c, v1 + this.c);
    }

    @Override  // p2.A
    public final void c(int v, int v1) {
        x x0 = x.Y;
        A a0 = this.b;
        if(v >= this.e && this.g != 2) {
            int v4 = Math.min(v1, this.d);
            if(v4 > 0) {
                this.g = 3;
                a0.d(this.c + v, v4, x0);
                this.d -= v4;
            }
            int v5 = v1 - v4;
            if(v5 > 0) {
                a0.c(v + v4 + this.c, v5);
            }
        }
        else if(v > 0 || this.f == 2) {
            a0.c(v + this.c, v1);
        }
        else {
            int v2 = Math.min(v1, this.c);
            if(v2 > 0) {
                this.f = 3;
                a0.d(-v2 + this.c, v2, x0);
                this.c -= v2;
            }
            int v3 = v1 - v2;
            if(v3 > 0) {
                a0.c(this.c, v3);
            }
        }
        this.e += v1;
    }

    @Override  // p2.A
    public final void d(int v, int v1, Object object0) {
        this.b.d(v + this.c, v1, object0);
    }
}

