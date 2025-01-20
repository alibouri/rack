package p1;

import o1.a;
import o1.d;

public final class j extends o {
    @Override  // p1.e
    public final void a(e e0) {
        a a0 = (a)this.b;
        int v = a0.t0;
        f f0 = this.h;
        int v1 = 0;
        int v2 = -1;
        for(Object object0: f0.l) {
            int v3 = ((f)object0).g;
            if(v2 == -1 || v3 < v2) {
                v2 = v3;
            }
            if(v1 < v3) {
                v1 = v3;
            }
        }
        if(v != 0 && v != 2) {
            f0.d(v1 + a0.v0);
            return;
        }
        f0.d(v2 + a0.v0);
    }

    @Override  // p1.o
    public final void d() {
        d d0 = this.b;
        if(d0 instanceof a) {
            f f0 = this.h;
            f0.b = true;
            int v = ((a)d0).t0;
            boolean z = ((a)d0).u0;
            int v1 = 0;
            switch(v) {
                case 0: {
                    f0.e = 4;
                    while(v1 < ((a)d0).s0) {
                        d d4 = ((a)d0).r0[v1];
                        if(z || d4.h0 != 8) {
                            f f4 = d4.d.h;
                            f4.k.add(f0);
                            f0.l.add(f4);
                        }
                        ++v1;
                    }
                    this.m(this.b.d.h);
                    this.m(this.b.d.i);
                    break;
                }
                case 1: {
                    f0.e = 5;
                    while(v1 < ((a)d0).s0) {
                        d d1 = ((a)d0).r0[v1];
                        if(z || d1.h0 != 8) {
                            f f1 = d1.d.i;
                            f1.k.add(f0);
                            f0.l.add(f1);
                        }
                        ++v1;
                    }
                    this.m(this.b.d.h);
                    this.m(this.b.d.i);
                    return;
                }
                case 2: {
                    f0.e = 6;
                    while(v1 < ((a)d0).s0) {
                        d d2 = ((a)d0).r0[v1];
                        if(z || d2.h0 != 8) {
                            f f2 = d2.e.h;
                            f2.k.add(f0);
                            f0.l.add(f2);
                        }
                        ++v1;
                    }
                    this.m(this.b.e.h);
                    this.m(this.b.e.i);
                    return;
                }
                case 3: {
                    f0.e = 7;
                    while(v1 < ((a)d0).s0) {
                        d d3 = ((a)d0).r0[v1];
                        if(z || d3.h0 != 8) {
                            f f3 = d3.e.i;
                            f3.k.add(f0);
                            f0.l.add(f3);
                        }
                        ++v1;
                    }
                    this.m(this.b.e.h);
                    this.m(this.b.e.i);
                }
            }
        }
    }

    @Override  // p1.o
    public final void e() {
        d d0 = this.b;
        if(d0 instanceof a) {
            f f0 = this.h;
            switch(((a)d0).t0) {
                case 0: 
                case 1: {
                    d0.Z = f0.g;
                    break;
                }
                default: {
                    d0.a0 = f0.g;
                }
            }
        }
    }

    @Override  // p1.o
    public final void f() {
        this.c = null;
        this.h.c();
    }

    @Override  // p1.o
    public final boolean k() {
        return false;
    }

    public final void m(f f0) {
        this.h.k.add(f0);
        f0.l.add(this.h);
    }
}

