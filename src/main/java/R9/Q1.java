package R9;

import Na.f;
import Nb.j;
import a9.d6;
import q9.n;

public final class q1 implements s1 {
    public final d6 a;
    public final v1 b;

    public q1(d6 d60, v1 v10) {
        j.f(d60, "deal");
        super();
        this.a = d60;
        this.b = v10;
    }

    @Override  // R9.s1
    public final void a() {
        this.b.invoke();
    }

    @Override  // R9.s1
    public final f b(n n0) {
        j.f(n0, "assetLoader");
        return n0.g(0x7F0802C4, this.a.d);  // drawable:logo_blank
    }

    @Override  // R9.s1
    public final boolean c() {
        String s = this.d();
        return s == null || Vb.j.c0(s) ? 0 : 1;
    }

    @Override  // R9.s1
    public final String d() {
        return this.a.c;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof q1)) {
            return false;
        }
        return j.a(this.a, ((q1)object0).a) ? this.b.equals(((q1)object0).b) : false;
    }

    @Override  // R9.s1
    public final String getName() {
        return this.a.b;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "Deal(deal=" + this.a + ", onClickDelegate=" + this.b + ")";
    }
}

