package h3;

import Ec.E;
import Ec.F;
import M4.s;
import Vb.j;
import W4.f;
import pc.p;
import pc.y;

public final class b {
    public final Object a;
    public final Object b;
    public final long c;
    public final long d;
    public final boolean e;
    public final p f;

    public b(F f0) {
        this.a = f.z(new a(this, 0));
        this.b = f.z(new a(this, 1));
        this.c = Long.parseLong(f0.G(0x7FFFFFFFFFFFFFFFL));
        this.d = Long.parseLong(f0.G(0x7FFFFFFFFFFFFFFFL));
        this.e = Integer.parseInt(f0.G(0x7FFFFFFFFFFFFFFFL)) > 0;
        int v = Integer.parseInt(f0.G(0x7FFFFFFFFFFFFFFFL));
        s s0 = new s(4, false);
        for(int v1 = 0; v1 < v; ++v1) {
            String s1 = f0.G(0x7FFFFFFFFFFFFFFFL);
            int v2 = j.Z(s1, ':', 0, false, 6);
            if(v2 == -1) {
                throw new IllegalArgumentException(("Unexpected header: " + s1).toString());
            }
            String s2 = s1.substring(0, v2);
            Nb.j.e(s2, "substring(...)");
            String s3 = j.z0(s2).toString();
            String s4 = s1.substring(v2 + 1);
            Nb.j.e(s4, "substring(...)");
            s0.f(s3, s4);
        }
        this.f = s0.j();
    }

    public b(y y0) {
        boolean z = false;
        this.a = f.z(new a(this, 0));
        this.b = f.z(new a(this, 1));
        this.c = y0.i0;
        this.d = y0.j0;
        if(y0.c0 != null) {
            z = true;
        }
        this.e = z;
        this.f = y0.d0;
    }

    public final void a(E e0) {
        e0.b(this.c);
        e0.y(10);
        e0.b(this.d);
        e0.y(10);
        e0.b((this.e ? 1L : 0L));
        e0.y(10);
        p p0 = this.f;
        e0.b(((long)p0.size()));
        e0.y(10);
        int v = p0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            e0.R(p0.d(v1));
            e0.R(": ");
            e0.R(p0.g(v1));
            e0.y(10);
        }
    }
}

