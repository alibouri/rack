package a3;

import Ec.l;
import Nb.j;
import c3.m;

public final class t implements h {
    public final boolean a;

    public t() {
        this.a = true;
    }

    @Override  // a3.h
    public final i a(m m0, i3.m m1) {
        boolean z = j.a(m0.b, "image/svg+xml");
        p p0 = m0.a;
        if(!z) {
            l l0 = p0.h();
            if(l0.E(0L, s.b)) {
                Ec.m m2 = s.a;
                byte[] arr_b = m2.X;
                if(arr_b.length <= 0) {
                    throw new IllegalArgumentException("bytes is empty");
                }
                int v = arr_b[0];
                long v1 = 0x400L - ((long)arr_b.length);
                for(long v2 = 0L; true; v2 = 1L + v3) {
                    long v3 = -1L;
                    if(Long.compare(v2, v1) >= 0) {
                        break;
                    }
                    v3 = l0.D(((byte)v), v2, v1);
                    if(v3 == -1L || l0.E(v3, m2)) {
                        break;
                    }
                }
                if(v3 != -1L) {
                    return new u(p0, m1, this.a);
                }
            }
            return null;
        }
        return new u(p0, m1, this.a);
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof t && this.a == ((t)object0).a;
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final int hashCode() {
        return this.a ? 0x4CF : 0x4D5;
    }
}

