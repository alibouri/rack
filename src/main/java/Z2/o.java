package Z2;

import Nb.j;
import Y2.m;
import i3.i;
import java.util.Arrays;

public final class o {
    public final Object a;
    public final s b;
    public final m c;

    public o(Object object0, s s0, m m0) {
        this.a = object0;
        this.b = s0;
        this.c = m0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 instanceof o) {
            Object object1 = ((o)object0).a;
            this.b.getClass();
            Object object2 = this.a;
            if(object2 == object1) {
                return this.c.equals(((o)object0).c);
            }
            if(object2 instanceof i && object1 instanceof i) {
                return j.a(((i)object2).a, ((i)object1).a) && ((i)object2).b.equals(((i)object1).b) && j.a(null, null) && j.a(null, null) && j.a(null, null) && ((i)object2).e == ((i)object1).e && j.a(null, null) && j.a(((i)object2).h, ((i)object1).h) && j.a(((i)object2).j, ((i)object1).j) && ((i)object2).l == ((i)object1).l && ((i)object2).m == ((i)object1).m && ((i)object2).n == ((i)object1).n && ((i)object2).o == ((i)object1).o && ((i)object2).p == ((i)object1).p && ((i)object2).q == ((i)object1).q && ((i)object2).r == ((i)object1).r && ((i)object2).x.equals(((i)object1).x) && ((i)object2).y == ((i)object1).y && ((i)object2).f == ((i)object1).f && ((i)object2).z.equals(((i)object1).z) ? this.c.equals(((o)object0).c) : false;
            }
            return j.a(object2, object1) && this.c.equals(((o)object0).c);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        this.b.getClass();
        Object object0 = this.a;
        if(!(object0 instanceof i)) {
            return object0 == null ? this.c.hashCode() : this.c.hashCode() + object0.hashCode() * 0x1F;
        }
        int v = ((i)object0).a.hashCode();
        int v1 = ((i)object0).b.hashCode();
        int v2 = ((i)object0).e.hashCode();
        ((i)object0).h.getClass();
        int v3 = Arrays.hashCode(((i)object0).j.X);
        int v4 = 0x4D5;
        int v5 = ((i)object0).l ? 0x4CF : 0x4D5;
        int v6 = ((i)object0).m ? 0x4CF : 0x4D5;
        int v7 = ((i)object0).n ? 0x4CF : 0x4D5;
        if(((i)object0).o) {
            v4 = 0x4CF;
        }
        return this.c.hashCode() + (((i)object0).z.X.hashCode() + (((i)object0).f.hashCode() + (((i)object0).y.hashCode() + (((i)object0).x.hashCode() + (((i)object0).r.hashCode() + (((i)object0).q.hashCode() + (((i)object0).p.hashCode() + ((((((1 + (v2 + (v1 + v * 0x1F) * 0xE1781) * 961) * 0x1F + v3) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v4) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F;
    }
}

