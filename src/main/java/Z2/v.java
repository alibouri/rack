package Z2;

import D0.j;
import g0.c;
import m5.b;

public final class v implements B.v {
    public final B.v a;
    public final n b;
    public final c c;
    public final j d;
    public final float e;
    public final n0.n f;
    public final boolean g;

    public v(B.v v0, n n0, c c0, j j0, float f, n0.n n1, boolean z) {
        this.a = v0;
        this.b = n0;
        this.c = c0;
        this.d = j0;
        this.e = f;
        this.f = n1;
        this.g = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof v)) {
            return false;
        }
        if(!Nb.j.a(this.a, ((v)object0).a)) {
            return false;
        }
        if(!this.b.equals(((v)object0).b)) {
            return false;
        }
        if(!Nb.j.a(null, null)) {
            return false;
        }
        if(!Nb.j.a(this.c, ((v)object0).c)) {
            return false;
        }
        if(!Nb.j.a(this.d, ((v)object0).d)) {
            return false;
        }
        if(Float.compare(this.e, ((v)object0).e) != 0) {
            return false;
        }
        return Nb.j.a(this.f, ((v)object0).f) ? this.g == ((v)object0).g : false;
    }

    @Override
    public final int hashCode() {
        int v = b.p((this.d.hashCode() + (this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 961) * 0x1F) * 0x1F, this.e, 0x1F);
        int v1 = this.f == null ? 0 : this.f.hashCode();
        return this.g ? (v + v1) * 0x1F + 0x4CF : (v + v1) * 0x1F + 0x4D5;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("RealSubcomposeAsyncImageScope(parentScope=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", painter=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", contentDescription=null, alignment=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", contentScale=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", alpha=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", colorFilter=");
        stringBuilder0.append(this.f);
        stringBuilder0.append(", clipToBounds=");
        return b.z(stringBuilder0, this.g, ')');
    }
}

