package l4;

import java.text.DecimalFormat;

public final class g {
    public final double a;
    public final double b;

    public g(double f, double f1) {
        this.a = f;
        this.b = f1;
    }

    public static String a(double f) {
        double f1 = Math.abs(f % 1.0 * 60.0);
        DecimalFormat decimalFormat0 = new DecimalFormat("0.##");
        return decimalFormat0.format(((double)(((int)f)))) + "° " + decimalFormat0.format(((double)(((int)f1)))) + "\' " + decimalFormat0.format(f1 % 1.0 * 60.0) + "\"";
    }

    public static Double b(k k0, k k1, k k2, boolean z) {
        double f = k2.doubleValue() / 3600.0 + (k1.doubleValue() / 60.0 + Math.abs(k0.doubleValue()));
        if(Double.isNaN(f)) {
            return null;
        }
        if(z) {
            f *= -1.0;
        }
        return f;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return g.class == class0 && Double.compare(((g)object0).a, this.a) == 0 ? Double.compare(((g)object0).b, this.b) == 0 : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        long v = 0L;
        long v1 = Double.compare(this.a, 0.0) == 0 ? 0L : Double.doubleToLongBits(this.a);
        double f = this.b;
        if(f != 0.0) {
            v = Double.doubleToLongBits(f);
        }
        return ((int)(v1 ^ v1 >>> 0x20)) * 0x1F + ((int)(v >>> 0x20 ^ v));
    }

    @Override
    public final String toString() {
        return this.a + ", " + this.b;
    }
}

