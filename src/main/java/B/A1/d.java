package a1;

public final class d implements Comparable {
    public final float X;

    public d(float f) {
        this.X = f;
    }

    public static final boolean a(float f, float f1) {
        return Float.compare(f, f1) == 0;
    }

    // Deobfuscation rating: LOW(20)
    public static String b(float f) {
        return Float.isNaN(f) ? "Dp.Unspecified" : f + ".dp";
    }

    @Override
    public final int compareTo(Object object0) {
        return Float.compare(this.X, ((d)object0).X);
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof d && Float.compare(this.X, ((d)object0).X) == 0;
    }

    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.X);
    }

    @Override
    public final String toString() {
        return d.b(this.X);
    }
}

