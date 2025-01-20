package v;

import Nb.j;

public final class u0 {
    public final q a;
    public final y b;
    public final int c;

    public u0(q q0, y y0, int v) {
        this.a = q0;
        this.b = y0;
        this.c = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof u0)) {
            return false;
        }
        if(!j.a(this.a, ((u0)object0).a)) {
            return false;
        }
        return j.a(this.b, ((u0)object0).b) ? this.c == ((u0)object0).c : false;
    }

    @Override
    public final int hashCode() {
        return (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F + this.c;
    }

    @Override
    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.a + ", easing=" + this.b + ", arcMode=" + ("ArcMode(value=" + this.c + ')') + ')';
    }
}

