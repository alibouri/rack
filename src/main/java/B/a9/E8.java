package a9;

import Nb.j;

public final class e8 {
    public final b8 a;
    public final g8 b;
    public final h8 c;
    public final f8 d;
    public final a8 e;
    public final c8 f;
    public final d8 g;

    public e8(b8 b80, g8 g80, h8 h80, f8 f80, a8 a80, c8 c80, d8 d80) {
        this.a = b80;
        this.b = g80;
        this.c = h80;
        this.d = f80;
        this.e = a80;
        this.f = c80;
        this.g = d80;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof e8)) {
            return false;
        }
        if(!j.a(this.a, ((e8)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((e8)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((e8)object0).c)) {
            return false;
        }
        if(!j.a(this.d, ((e8)object0).d)) {
            return false;
        }
        if(!j.a(this.e, ((e8)object0).e)) {
            return false;
        }
        return j.a(this.f, ((e8)object0).f) ? j.a(this.g, ((e8)object0).g) : false;
    }

    @Override
    public final int hashCode() {
        return this.g.hashCode() + (this.f.hashCode() + (this.e.hashCode() + (this.d.hashCode() + (this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F;
    }

    @Override
    public final String toString() {
        return "SupportHours(monday=" + this.a + ", tuesday=" + this.b + ", wednesday=" + this.c + ", thursday=" + this.d + ", friday=" + this.e + ", saturday=" + this.f + ", sunday=" + this.g + ")";
    }
}

