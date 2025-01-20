package w;

import Nb.j;
import androidx.compose.ui.graphics.Path;
import n0.g;
import n0.t;
import p0.b;

public final class q {
    public g a;
    public t b;
    public b c;
    public Path d;

    public q() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof q)) {
            return false;
        }
        if(!j.a(this.a, ((q)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((q)object0).b)) {
            return false;
        }
        return j.a(this.c, ((q)object0).c) ? j.a(this.d, ((q)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        Path path0 = this.d;
        if(path0 != null) {
            v = path0.hashCode();
        }
        return ((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ')';
    }
}

