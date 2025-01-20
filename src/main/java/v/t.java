package v;

public final class t {
    public double a;
    public double b;

    public t(double f, double f1) {
        this.a = f;
        this.b = f1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof t)) {
            return false;
        }
        return Double.compare(this.a, ((t)object0).a) == 0 ? Double.compare(this.b, ((t)object0).b) == 0 : false;
    }

    @Override
    public final int hashCode() {
        long v = Double.doubleToLongBits(this.a);
        long v1 = Double.doubleToLongBits(this.b);
        return ((int)(v ^ v >>> 0x20)) * 0x1F + ((int)(v1 >>> 0x20 ^ v1));
    }

    @Override
    public final String toString() {
        return "ComplexDouble(_real=" + this.a + ", _imaginary=" + this.b + ')';
    }
}

