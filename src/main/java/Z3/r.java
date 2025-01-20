package Z3;

import Gb.b;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class r extends Enum {
    public static final enum r X;
    public static final r[] Y;

    static {
        r.X = new r("Text", 0);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        r[] arr_r = {r.X, new r("Binary", 1)};  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        r.Y = arr_r;
        new b(arr_r);
    }

    public static r valueOf(String s) {
        return (r)Enum.valueOf(r.class, s);
    }

    public static r[] values() {
        return (r[])r.Y.clone();
    }
}

