package b4;

import Lc.b;
import java.util.ArrayList;

public final class s0 implements L {
    public final ArrayList a;
    public float b;
    public float c;
    public t0 d;
    public boolean e;
    public boolean f;
    public int g;
    public boolean h;

    public s0(A0 a00, b b0) {
        ArrayList arrayList0 = new ArrayList();
        this.a = arrayList0;
        this.d = null;
        this.e = false;
        this.f = true;
        this.g = -1;
        if(b0 == null) {
            return;
        }
        b0.o(this);
        if(this.h) {
            this.d.b(((t0)arrayList0.get(this.g)));
            arrayList0.set(this.g, this.d);
            this.h = false;
        }
        t0 t00 = this.d;
        if(t00 != null) {
            arrayList0.add(t00);
        }
    }

    @Override  // b4.L
    public final void a(float f, float f1) {
        ArrayList arrayList0 = this.a;
        if(this.h) {
            this.d.b(((t0)arrayList0.get(this.g)));
            arrayList0.set(this.g, this.d);
            this.h = false;
        }
        t0 t00 = this.d;
        if(t00 != null) {
            arrayList0.add(t00);
        }
        this.b = f;
        this.c = f1;
        this.d = new t0(f, f1, 0.0f, 0.0f);
        this.g = arrayList0.size();
    }

    @Override  // b4.L
    public final void b(float f, float f1, float f2, float f3, float f4, float f5) {
        if(this.f || this.e) {
            this.d.a(f, f1);
            this.a.add(this.d);
            this.e = false;
        }
        this.d = new t0(f4, f5, f4 - f2, f5 - f3);
        this.h = false;
    }

    @Override  // b4.L
    public final void c(float f, float f1) {
        this.d.a(f, f1);
        this.a.add(this.d);
        this.d = new t0(f, f1, f - this.d.a, f1 - this.d.b);
        this.h = false;
    }

    @Override  // b4.L
    public final void close() {
        this.a.add(this.d);
        this.c(this.b, this.c);
        this.h = true;
    }

    @Override  // b4.L
    public final void d(float f, float f1, float f2, boolean z, boolean z1, float f3, float f4) {
        this.e = true;
        this.f = false;
        A0.a(this.d.a, this.d.b, f, f1, f2, z, z1, f3, f4, this);
        this.f = true;
        this.h = false;
    }

    @Override  // b4.L
    public final void e(float f, float f1, float f2, float f3) {
        this.d.a(f, f1);
        this.a.add(this.d);
        this.d = new t0(f2, f3, f2 - f, f3 - f1);
        this.h = false;
    }
}

