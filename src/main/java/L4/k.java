package l4;

import java.io.Serializable;

public final class k extends Number implements Serializable, Comparable {
    public final long X;
    public final long Y;

    public k(long v, long v1) {
        this.X = v;
        this.Y = v1;
    }

    // Deobfuscation rating: LOW(20)
    public final boolean a() {
        return this.Y == 1L || (Long.compare(this.Y, 0L) != 0 && this.X % this.Y == 0L || this.Y == 0L && this.X == 0L);
    }

    public final boolean b() {
        return this.c() ? false : (Long.compare(this.X, 0L) <= 0 ? 0 : 1) == (this.Y <= 0L ? 0 : 1);
    }

    @Override
    public final byte byteValue() {
        return (byte)(((int)this.doubleValue()));
    }

    public final boolean c() {
        return this.X == 0L || this.Y == 0L;
    }

    @Override
    public final int compareTo(Object object0) {
        return Double.compare(this.doubleValue(), ((k)object0).doubleValue());
    }

    public final String d(boolean z) {
        long v = this.Y;
        int v1 = Long.compare(v, 0L);
        long v2 = this.X;
        if(v1 == 0 && v2 != 0L) {
            return this.toString();
        }
        if(this.a()) {
            return Integer.toString(((int)this.doubleValue()));
        }
        if(v1 < 0) {
            v2 = -v2;
            v = -v;
        }
        long v3 = v2 >= 0L ? v2 : -v2;
        long v4 = v >= 0L ? v : -v;
        while(true) {
            int v5 = Long.compare(v3, 0L);
            if(v5 == 0 || v4 == 0L) {
                break;
            }
            if(v3 > v4) {
                v3 %= v4;
            }
            else {
                v4 %= v3;
            }
        }
        if(v5 == 0) {
            v3 = v4;
        }
        k k0 = new k(v2 / v3, v / v3);
        if(z) {
            String s = Double.toString(k0.doubleValue());
            return s.length() >= 5 ? k0.toString() : s;
        }
        return k0.toString();
    }

    @Override
    public final double doubleValue() {
        return this.X == 0L ? 0.0 : ((double)this.X) / ((double)this.Y);
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof k ? this.doubleValue() == ((k)object0).doubleValue() : false;
    }

    @Override
    public final float floatValue() {
        return this.X == 0L ? 0.0f : ((float)this.X) / ((float)this.Y);
    }

    @Override
    public final int hashCode() {
        return ((int)this.Y) * 23 + ((int)this.X);
    }

    @Override
    public final int intValue() {
        return (int)this.doubleValue();
    }

    @Override
    public final long longValue() {
        return (long)this.doubleValue();
    }

    @Override
    public final short shortValue() {
        return (short)(((int)this.doubleValue()));
    }

    @Override
    public final String toString() {
        return this.X + "/" + this.Y;
    }
}

