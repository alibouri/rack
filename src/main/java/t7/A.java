package t7;

public final class a implements e {
    public final int a;

    public a(int v) {
        this.a = v;
    }

    @Override
    public final Class annotationType() {
        return e.class;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof e)) {
            return false;
        }
        if(this.a == ((a)(((e)object0))).a) {
            ((a)(((e)object0))).getClass();
            return d.X.equals(d.X);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return (0xDE0D66 ^ this.a) + (d.X.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + d.X + ')';
    }
}

