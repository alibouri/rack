package N9;

import Gb.b;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class e extends Enum {
    public static final enum e X;
    public static final e[] Y;

    static {
        e.X = new e("BOTTOM", 0);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        e[] arr_e = {e.X, new e("END", 1)};  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        e.Y = arr_e;
        new b(arr_e);
    }

    public static e valueOf(String s) {
        return (e)Enum.valueOf(e.class, s);
    }

    public static e[] values() {
        return (e[])e.Y.clone();
    }
}

