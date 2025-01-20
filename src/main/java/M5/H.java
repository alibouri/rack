package M5;

public final class h {
    public final Object a;
    public final String b;

    public h(Object object0, String s) {
        this.a = object0;
        this.b = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof h ? this.a == ((h)object0).a && this.b.equals(((h)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + System.identityHashCode(this.a) * 0x1F;
    }
}

