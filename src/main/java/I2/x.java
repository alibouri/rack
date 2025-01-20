package I2;

public final class x extends y {
    public final m a;

    public x() {
        this.a = m.b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return x.class == class0 ? this.a.equals(((x)object0).a) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() + x.class.getName().hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }
}

