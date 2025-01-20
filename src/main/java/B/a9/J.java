package a9;

import n0.v;
import v1.r;

public final class j {
    public final long a;
    public final long b;
    public final h c;
    public final b d;

    public j(long v, long v1, h h0, b b0) {
        this.a = v;
        this.b = v1;
        this.c = h0;
        this.d = b0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof j)) {
            return false;
        }
        if(!v.c(this.a, ((j)object0).a)) {
            return false;
        }
        if(!v.c(this.b, ((j)object0).b)) {
            return false;
        }
        return Nb.j.a(this.c, ((j)object0).c) ? Nb.j.a(this.d, ((j)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() + r.c(v.i(this.a) * 0x1F, this.b, 0x1F)) * 0x1F;
    }

    @Override
    public final String toString() {
        return "Styling(textColor=" + v.j(this.a) + ", dismissIconColor=" + v.j(this.b) + ", playButton=" + this.c + ", background=" + this.d + ")";
    }
}

