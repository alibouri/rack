package p0;

import Nb.j;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import m0.e;
import n0.t;

public final class a {
    public Density a;
    public LayoutDirection b;
    public t c;
    public long d;

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof a)) {
            return false;
        }
        if(!j.a(this.a, ((a)object0).a)) {
            return false;
        }
        if(this.b != ((a)object0).b) {
            return false;
        }
        return j.a(this.c, ((a)object0).c) ? e.a(this.d, ((a)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return ((int)(this.d ^ this.d >>> 0x20)) + (this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F) * 0x1F;
    }

    @Override
    public final String toString() {
        return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + e.f(this.d) + ')';
    }
}

