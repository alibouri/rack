package f9;

public final class j {
    public final String a;
    public final int b;
    public final Object c;

    public j(Object object0, String s, int v) {
        Nb.j.f(s, "id");
        super();
        this.a = s;
        this.b = v;
        this.c = object0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof j)) {
            return false;
        }
        if(!Nb.j.a(this.a, ((j)object0).a)) {
            return false;
        }
        return this.b == ((j)object0).b ? Nb.j.a(this.c, ((j)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() + (this.a.hashCode() * 0x1F + this.b) * 0x1F;
    }

    @Override
    public final String toString() {
        return "Item(id=" + this.a + ", layout=" + this.b + ", model=" + this.c + ")";
    }
}

