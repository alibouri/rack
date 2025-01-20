package M;

import Z0.h;

public final class p {
    public final h a;
    public final int b;
    public final long c;

    public p(h h0, int v, long v1) {
        this.a = h0;
        this.b = v;
        this.c = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof p)) {
            return false;
        }
        if(this.a != ((p)object0).a) {
            return false;
        }
        return this.b == ((p)object0).b ? this.c == ((p)object0).c : false;
    }

    @Override
    public final int hashCode() {
        return (this.a.hashCode() * 0x1F + this.b) * 0x1F + ((int)(this.c ^ this.c >>> 0x20));
    }

    @Override
    public final String toString() {
        return "AnchorInfo(direction=" + this.a + ", offset=" + this.b + ", selectableId=" + this.c + ')';
    }
}

