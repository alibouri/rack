package o1;

import p1.b;
import p1.c;

public abstract class k extends i {
    public final b A0;
    public c B0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public boolean x0;
    public int y0;
    public int z0;

    public k() {
        this.t0 = 0;
        this.u0 = 0;
        this.v0 = 0;
        this.w0 = 0;
        this.x0 = false;
        this.y0 = 0;
        this.z0 = 0;
        this.A0 = new b();  // initializer: Ljava/lang/Object;-><init>()V
        this.B0 = null;
    }

    public abstract void X(int arg1, int arg2, int arg3, int arg4);

    public final void Y(int v, int v1, int v2, int v3, d d0) {
        c c0;
        while((c0 = this.B0) == null) {
            e e0 = this.U;
            if(e0 == null) {
                break;
            }
            this.B0 = e0.v0;
        }
        this.A0.a = v;
        this.A0.b = v2;
        this.A0.c = v1;
        this.A0.d = v3;
        c0.b(d0, this.A0);
        d0.S(this.A0.e);
        d0.N(this.A0.f);
        d0.F = this.A0.h;
        d0.J(this.A0.g);
    }
}

