package g8;

import java.math.BigDecimal;

public final class h extends Number {
    public final String X;

    public h(String s) {
        this.X = s;
    }

    @Override
    public final double doubleValue() {
        return Double.parseDouble(this.X);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 instanceof h) {
            String s = ((h)object0).X;
            return this.X == s || this.X.equals(s);
        }
        return false;
    }

    @Override
    public final float floatValue() {
        return Float.parseFloat(this.X);
    }

    @Override
    public final int hashCode() {
        return this.X.hashCode();
    }

    @Override
    public final int intValue() {
        String s;
        try {
            s = this.X;
            return Integer.parseInt(s);
        }
        catch(NumberFormatException unused_ex) {
            try {
                return (int)Long.parseLong(s);
            }
            catch(NumberFormatException unused_ex) {
                return new BigDecimal(s).intValue();
            }
        }
    }

    @Override
    public final long longValue() {
        String s;
        try {
            s = this.X;
            return Long.parseLong(s);
        }
        catch(NumberFormatException unused_ex) {
            return new BigDecimal(s).longValue();
        }
    }

    @Override
    public final String toString() {
        return this.X;
    }

    private Object writeReplace() {
        return new BigDecimal(this.X);
    }
}

