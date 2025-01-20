package i3;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class b extends Enum {
    public final boolean X;
    public final boolean Y;
    public static final enum b Z;
    public static final enum b b0;
    public static final b[] c0;

    static {
        b.Z = new b("ENABLED", 0, true, true);
        b b0 = new b("READ_ONLY", 1, true, false);
        b b1 = new b("WRITE_ONLY", 2, false, true);
        b.b0 = new b("DISABLED", 3, false, false);
        b[] arr_b = {b.Z, b0, b1, b.b0};
        b.c0 = arr_b;
        new Gb.b(arr_b);
    }

    public b(String s, int v, boolean z, boolean z1) {
        super(s, v);
        this.X = z;
        this.Y = z1;
    }

    public static b valueOf(String s) {
        return (b)Enum.valueOf(b.class, s);
    }

    public static b[] values() {
        return (b[])b.c0.clone();
    }
}

