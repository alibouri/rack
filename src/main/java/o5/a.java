package o5;

public final class a {
    public final Object a;
    public final b b;

    public a(Object object0, b b0) {
        this.a = object0;
        this.b = b0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof a) {
            ((a)object0).getClass();
            if(this.a.equals(((a)object0).a) && d.X.equals(d.X)) {
                b b0 = ((a)object0).b;
                return this.b == null ? b0 == null : this.b.equals(b0);
            }
            return false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = d.X.hashCode();
        return this.b == null ? ((0xD5009D89 ^ v) * 1000003 ^ v1) * 1000003 : this.b.hashCode() ^ ((0xD5009D89 ^ v) * 1000003 ^ v1) * 1000003;
    }

    @Override
    public final String toString() {
        return "Event{code=null, payload=" + this.a + ", priority=" + d.X + ", productData=" + this.b + "}";
    }
}

