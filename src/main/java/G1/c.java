package g1;

public final class c {
    public final Object a;
    public final int b;
    public final b c;

    public c(Object object0, int v, b b0) {
        this.a = object0;
        this.b = v;
        this.c = b0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof c)) {
            return false;
        }
        if(!this.a.equals(((c)object0).a)) {
            return false;
        }
        return this.b == ((c)object0).b ? this.c.equals(((c)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() + (this.a.hashCode() * 0x1F + this.b) * 0x1F;
    }

    @Override
    public final String toString() {
        return "HorizontalAnchor(id=" + this.a + ", index=" + this.b + ", reference=" + this.c + ')';
    }
}

