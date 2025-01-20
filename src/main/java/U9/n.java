package u9;

import Gb.b;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class n extends Enum {
    public static final n[] X;

    static {
        n[] arr_n = {new n("START", 0), new n("END", 1), new n("TOP", 2), new n("BOTTOM", 3)};  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V / initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V / initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V / initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        n.X = arr_n;
        new b(arr_n);
    }

    public static n valueOf(String s) {
        return (n)Enum.valueOf(n.class, s);
    }

    public static n[] values() {
        return (n[])n.X.clone();
    }
}

