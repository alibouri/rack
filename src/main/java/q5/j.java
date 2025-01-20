package q5;

public final class j extends q {
    public final h a;

    public j(h h0) {
        this.a = h0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof q) {
            ((j)(((q)object0))).getClass();
            return p.X.equals(p.X) && this.a.equals(((j)(((q)object0))).a);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return (p.X.hashCode() ^ 1000003) * 1000003 ^ this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "ClientInfo{clientType=" + p.X + ", androidClientInfo=" + this.a + "}";
    }
}

