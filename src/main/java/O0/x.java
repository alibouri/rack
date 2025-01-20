package O0;

import Z0.d;
import Z0.e;
import Z0.g;
import Z0.i;
import Z0.k;
import Z0.p;
import Z0.q;
import a1.j;

public final class x {
    public final int a;
    public final int b;
    public final long c;
    public final p d;
    public final z e;
    public final g f;
    public final int g;
    public final int h;
    public final q i;

    public x(int v, int v1, long v2, p p0, int v3) {
        this(v, ((v3 & 2) == 0 ? v1 : 0x80000000), ((v3 & 4) == 0 ? v2 : j.c), ((v3 & 8) == 0 ? p0 : null), null, null, 0, 0x80000000, null);
    }

    public x(int v, int v1, long v2, p p0, z z0, g g0, int v3, int v4, q q0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = p0;
        this.e = z0;
        this.f = g0;
        this.g = v3;
        this.h = v4;
        this.i = q0;
        if(!j.a(v2, j.c) && j.c(v2) < 0.0f) {
            throw new IllegalStateException(("lineHeight can\'t be negative (" + j.c(v2) + ')').toString());
        }
    }

    public final x a(x x0) {
        return x0 == null ? this : y.a(this, x0.a, x0.b, x0.c, x0.d, x0.e, x0.f, x0.g, x0.h, x0.i);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof x)) {
            return false;
        }
        if(!i.a(this.a, ((x)object0).a)) {
            return false;
        }
        if(!k.a(this.b, ((x)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((x)object0).c)) {
            return false;
        }
        if(!Nb.j.a(this.d, ((x)object0).d)) {
            return false;
        }
        if(!Nb.j.a(this.e, ((x)object0).e)) {
            return false;
        }
        if(!Nb.j.a(this.f, ((x)object0).f)) {
            return false;
        }
        return this.g == ((x)object0).g && d.a(this.h, ((x)object0).h) ? Nb.j.a(this.i, ((x)object0).i) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = ((((((j.d(this.c) + (this.a * 0x1F + this.b) * 0x1F) * 0x1F + (this.d == null ? 0 : this.d.hashCode())) * 0x1F + (this.e == null ? 0 : this.e.hashCode())) * 0x1F + (this.f == null ? 0 : this.f.hashCode())) * 0x1F + this.g) * 0x1F + this.h) * 0x1F;
        q q0 = this.i;
        if(q0 != null) {
            v = q0.hashCode();
        }
        return v1 + v;
    }

    @Override
    public final String toString() {
        return "ParagraphStyle(textAlign=" + i.b(this.a) + ", textDirection=" + k.b(this.b) + ", lineHeight=" + j.e(this.c) + ", textIndent=" + this.d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f + ", lineBreak=" + e.a(this.g) + ", hyphens=" + d.b(this.h) + ", textMotion=" + this.i + ')';
    }
}

