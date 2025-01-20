package U0;

import Nb.j;
import V0.c;

public final class n {
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final c f;
    public static final n g;

    static {
        n.g = new n(false, 0, true, 1, 1, c.Z);
    }

    public n(boolean z, int v, boolean z1, int v1, int v2, c c0) {
        this.a = z;
        this.b = v;
        this.c = z1;
        this.d = v1;
        this.e = v2;
        this.f = c0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof n)) {
            return false;
        }
        if(this.a != ((n)object0).a) {
            return false;
        }
        if(!o.a(this.b, ((n)object0).b)) {
            return false;
        }
        if(this.c != ((n)object0).c) {
            return false;
        }
        if(!p.a(this.d, ((n)object0).d)) {
            return false;
        }
        if(!m.a(this.e, ((n)object0).e)) {
            return false;
        }
        return j.a(null, null) ? j.a(this.f, ((n)object0).f) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0x4D5;
        int v1 = ((this.a ? 0x4CF : 0x4D5) * 0x1F + this.b) * 0x1F;
        if(this.c) {
            v = 0x4CF;
        }
        return this.f.X.hashCode() + (((v1 + v) * 0x1F + this.d) * 0x1F + this.e) * 961;
    }

    @Override
    public final String toString() {
        return "ImeOptions(singleLine=" + this.a + ", capitalization=" + o.b(this.b) + ", autoCorrect=" + this.c + ", keyboardType=" + p.b(this.d) + ", imeAction=" + m.b(this.e) + ", platformImeOptions=null, hintLocales=" + this.f + ')';
    }
}

