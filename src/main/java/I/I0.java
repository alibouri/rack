package I;

import Nb.j;
import U0.m;
import U0.o;
import U0.p;
import V0.c;

public final class i0 {
    public final int a;
    public final Boolean b;
    public final int c;
    public final int d;
    public final Boolean e;
    public final c f;
    public static final i0 g;

    static {
        i0.g = new i0(-1, null, 0, -1, null, null);
    }

    public i0(int v, Boolean boolean0, int v1, int v2, Boolean boolean1, c c0) {
        this.a = v;
        this.b = boolean0;
        this.c = v1;
        this.d = v2;
        this.e = boolean1;
        this.f = c0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof i0)) {
            return false;
        }
        if(!o.a(this.a, ((i0)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((i0)object0).b)) {
            return false;
        }
        if(!p.a(this.c, ((i0)object0).c)) {
            return false;
        }
        if(!m.a(this.d, ((i0)object0).d)) {
            return false;
        }
        if(!j.a(null, null)) {
            return false;
        }
        return j.a(this.e, ((i0)object0).e) ? j.a(this.f, ((i0)object0).f) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = (((this.a * 0x1F + (this.b == null ? 0 : this.b.hashCode())) * 0x1F + this.c) * 0x1F + this.d) * 961;
        int v2 = this.e == null ? 0 : this.e.hashCode();
        c c0 = this.f;
        if(c0 != null) {
            v = c0.X.hashCode();
        }
        return (v1 + v2) * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "KeyboardOptions(capitalization=" + o.b(this.a) + ", autoCorrectEnabled=" + this.b + ", keyboardType=" + p.b(this.c) + ", imeAction=" + m.b(this.d) + ", platformImeOptions=nullshowKeyboardOnFocus=" + this.e + ", hintLocales=" + this.f + ')';
    }
}

