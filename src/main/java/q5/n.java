package q5;

public final class n extends v {
    public final u a;
    public final t b;

    public n(u u0, t t0) {
        this.a = u0;
        this.b = t0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof v) {
            u u0 = this.a;
            if(u0 == null) {
                if(((n)(((v)object0))).a == null) {
                    return this.b == null ? ((n)(((v)object0))).b == null : this.b.equals(((n)(((v)object0))).b);
                }
            }
            else if(u0.equals(((n)(((v)object0))).a)) {
                return this.b == null ? ((n)(((v)object0))).b == null : this.b.equals(((n)(((v)object0))).b);
            }
            return false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        t t0 = this.b;
        if(t0 != null) {
            v = t0.hashCode();
        }
        return v ^ (v1 ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}

