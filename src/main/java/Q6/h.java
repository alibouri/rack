package Q6;

public final class h {
    public final String a;
    public final Long b;

    public h(String s, Long long0) {
        this.a = s;
        this.b = long0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof h && this.a.equals(((h)object0).a)) {
            Long long0 = ((h)object0).b;
            return this.b == null ? long0 == null : this.b.equals(long0);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? (v ^ 1000003) * 0xD5009D89 : ((v ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "IntegrityTokenRequest{nonce=" + this.a + ", cloudProjectNumber=" + this.b + ", network=null}";
    }
}

