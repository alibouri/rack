package u9;

import Gb.b;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class o extends Enum {
    public static final enum o X;
    public static final o[] Y;

    static {
        o.X = new o("NONE", 0);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        o[] arr_o = {o.X, new o("HEARTBEAT", 1), new o("SHAKE", 2), new o("BREATH", 3), new o("ROTATE", 4)};  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V / initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V / initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V / initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        o.Y = arr_o;
        new b(arr_o);
    }

    public static o valueOf(String s) {
        return (o)Enum.valueOf(o.class, s);
    }

    public static o[] values() {
        return (o[])o.Y.clone();
    }
}

