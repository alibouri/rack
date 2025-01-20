package u9;

import Gb.b;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class w extends Enum {
    public static final enum w X;
    public static final w[] Y;

    static {
        w.X = new w("START", 0);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        w[] arr_w = {w.X, new w("END", 1), new w("TOP", 2), new w("BOTTOM", 3)};  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V / initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V / initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        w.Y = arr_w;
        new b(arr_w);
    }

    public static w valueOf(String s) {
        return (w)Enum.valueOf(w.class, s);
    }

    public static w[] values() {
        return (w[])w.Y.clone();
    }
}

