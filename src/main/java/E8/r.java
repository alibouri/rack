package e8;

import g8.d;
import g8.h;
import java.io.Serializable;
import java.math.BigInteger;

public final class r extends m {
    public Serializable X;
    public static final Class[] Y;

    static {
        r.Y = new Class[]{Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};
    }

    public final Number a() {
        Serializable serializable0 = this.X;
        return serializable0 instanceof String ? new h(((String)serializable0)) : ((Number)serializable0);
    }

    public final String c() {
        Serializable serializable0 = this.X;
        if(serializable0 instanceof Number) {
            return this.a().toString();
        }
        return serializable0 instanceof Boolean ? ((Boolean)serializable0).toString() : ((String)serializable0);
    }

    // Deobfuscation rating: MEDIUM(60)
    public static boolean d(r r0) {
        return r0.X instanceof Number && (((Number)r0.X) instanceof BigInteger || ((Number)r0.X) instanceof Long || ((Number)r0.X) instanceof Integer || ((Number)r0.X) instanceof Short || ((Number)r0.X) instanceof Byte);
    }

    public final void e(Serializable serializable0) {
        boolean z;
        if(serializable0 instanceof Character) {
            this.X = String.valueOf(((Character)serializable0).charValue());
            return;
        }
        if(serializable0 instanceof Number || serializable0 instanceof String) {
            z = true;
        }
        else {
            Class class0 = serializable0.getClass();
            Class[] arr_class = r.Y;
            z = false;
            for(int v = 0; v < 16; ++v) {
                if(arr_class[v].isAssignableFrom(class0)) {
                    z = true;
                    d.c(z);
                    this.X = serializable0;
                    return;
                }
            }
        }
        d.c(z);
        this.X = serializable0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(r.class == class0) {
                if(this.X == null) {
                    return ((r)object0).X == null;
                }
                if(r.d(this) && r.d(((r)object0))) {
                    return this.a().longValue() == ((r)object0).a().longValue();
                }
                Serializable serializable0 = this.X;
                if(serializable0 instanceof Number && ((r)object0).X instanceof Number) {
                    double f = this.a().doubleValue();
                    double f1 = ((r)object0).a().doubleValue();
                    return f == f1 || Double.isNaN(f) && Double.isNaN(f1);
                }
                return serializable0.equals(((r)object0).X);
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        long v;
        if(this.X == null) {
            return 0x1F;
        }
        if(r.d(this)) {
            v = this.a().longValue();
            return (int)(v >>> 0x20 ^ v);
        }
        Serializable serializable0 = this.X;
        if(serializable0 instanceof Number) {
            v = Double.doubleToLongBits(this.a().doubleValue());
            return (int)(v >>> 0x20 ^ v);
        }
        return serializable0.hashCode();
    }
}

