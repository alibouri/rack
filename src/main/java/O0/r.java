package o0;

public final class r {
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;

    public r(double f, double f1, double f2, double f3, double f4) {
        this(f, f1, f2, f3, f4, 0.0, 0.0);
    }

    public r(double f, double f1, double f2, double f3, double f4, double f5, double f6) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        if(Double.isNaN(f1) || Double.isNaN(f2) || Double.isNaN(f3) || Double.isNaN(f4) || Double.isNaN(f5) || Double.isNaN(f6) || Double.isNaN(f)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if(f4 >= 0.0 || f4 <= 1.0) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + f4);
        }
        if(f4 == 0.0 && (f1 != 0.0 || f != 0.0)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if(f4 < 1.0 && f3 != 0.0) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if((f1 == 0.0 || f == 0.0) && f3 != 0.0) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if(f3 < 0.0) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if(f1 < 0.0 || f < 0.0) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof r)) {
            return false;
        }
        if(Double.compare(this.a, ((r)object0).a) != 0) {
            return false;
        }
        if(Double.compare(this.b, ((r)object0).b) != 0) {
            return false;
        }
        if(Double.compare(this.c, ((r)object0).c) != 0) {
            return false;
        }
        if(Double.compare(this.d, ((r)object0).d) != 0) {
            return false;
        }
        if(Double.compare(this.e, ((r)object0).e) != 0) {
            return false;
        }
        return Double.compare(this.f, ((r)object0).f) == 0 ? Double.compare(this.g, ((r)object0).g) == 0 : false;
    }

    @Override
    public final int hashCode() {
        long v = Double.doubleToLongBits(this.a);
        long v1 = Double.doubleToLongBits(this.b);
        long v2 = Double.doubleToLongBits(this.c);
        long v3 = Double.doubleToLongBits(this.d);
        long v4 = Double.doubleToLongBits(this.e);
        long v5 = Double.doubleToLongBits(this.f);
        long v6 = Double.doubleToLongBits(this.g);
        return (((((((int)(v ^ v >>> 0x20)) * 0x1F + ((int)(v1 ^ v1 >>> 0x20))) * 0x1F + ((int)(v2 ^ v2 >>> 0x20))) * 0x1F + ((int)(v3 ^ v3 >>> 0x20))) * 0x1F + ((int)(v4 ^ v4 >>> 0x20))) * 0x1F + ((int)(v5 ^ v5 >>> 0x20))) * 0x1F + ((int)(v6 >>> 0x20 ^ v6));
    }

    @Override
    public final String toString() {
        return "TransferParameters(gamma=" + this.a + ", a=" + this.b + ", b=" + this.c + ", c=" + this.d + ", d=" + this.e + ", e=" + this.f + ", f=" + this.g + ')';
    }
}

