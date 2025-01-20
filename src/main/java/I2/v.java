package I2;

public final class v extends y {
    public final m a;

    public v() {
        this(m.b);
    }

    public v(m m0) {
        this.a = m0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return v.class == class0 ? this.a.equals(((v)object0).a) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() + v.class.getName().hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "Failure {mOutputData=" + this.a + '}';
    }
}

