package a9;

import n0.v;
import v1.r;

public final class h {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public h(long v, long v1, long v2, long v3) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof h)) {
            return false;
        }
        if(!v.c(this.a, ((h)object0).a)) {
            return false;
        }
        if(!v.c(this.b, ((h)object0).b)) {
            return false;
        }
        return v.c(this.c, ((h)object0).c) ? v.c(this.d, ((h)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return v.i(this.d) + r.c(r.c(v.i(this.a) * 0x1F, this.b, 0x1F), this.c, 0x1F);
    }

    @Override
    public final String toString() {
        return "PlayButton(playPauseButtonColor=" + v.j(this.a) + ", playProgressColor=" + v.j(this.b) + ", bufferProgressColor=" + v.j(this.c) + ", backgroundColor=" + v.j(this.d) + ")";
    }
}

