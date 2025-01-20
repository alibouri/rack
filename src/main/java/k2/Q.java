package k2;

import Nb.j;

public final class q {
    public final e0 a;
    public final e0 b;
    public final e0 c;
    public final f0 d;
    public final f0 e;

    public q(e0 e00, e0 e01, e0 e02, f0 f00, f0 f01) {
        j.f(e00, "refresh");
        j.f(e01, "prepend");
        j.f(e02, "append");
        j.f(f00, "source");
        super();
        this.a = e00;
        this.b = e01;
        this.c = e02;
        this.d = f00;
        this.e = f01;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(q.class != class0 || !j.a(this.a, ((q)object0).a)) {
                return false;
            }
            if(!j.a(this.b, ((q)object0).b)) {
                return false;
            }
            if(!j.a(this.c, ((q)object0).c)) {
                return false;
            }
            return j.a(this.d, ((q)object0).d) ? j.a(this.e, ((q)object0).e) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = this.b.hashCode();
        int v2 = this.c.hashCode();
        int v3 = this.d.hashCode();
        return this.e == null ? (v3 + (v2 + (v1 + v * 0x1F) * 0x1F) * 0x1F) * 0x1F : (v3 + (v2 + (v1 + v * 0x1F) * 0x1F) * 0x1F) * 0x1F + this.e.hashCode();
    }

    @Override
    public final String toString() {
        return "CombinedLoadStates(refresh=" + this.a + ", prepend=" + this.b + ", append=" + this.c + ", source=" + this.d + ", mediator=" + this.e + ')';
    }
}

