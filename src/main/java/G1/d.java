package g1;

public final class d {
    public final Object a;
    public final int b;
    public final b c;

    public d(Object object0, int v, b b0) {
        this.a = object0;
        this.b = v;
        this.c = b0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof d)) {
            return false;
        }
        if(!this.a.equals(((d)object0).a)) {
            return false;
        }
        return this.b == ((d)object0).b ? this.c.equals(((d)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() + (this.a.hashCode() * 0x1F + this.b) * 0x1F;
    }

    @Override
    public final String toString() {
        return "VerticalAnchor(id=" + this.a + ", index=" + this.b + ", reference=" + this.c + ')';
    }
}

