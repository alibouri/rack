package u9;

import Gb.b;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class x extends Enum {
    public static final enum x X;
    public static final x[] Y;

    static {
        x.X = new x("ALIGNMENT", 0);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        x[] arr_x = {x.X, new x("DROPDOWN", 1), new x("CENTER", 2)};  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V / initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        x.Y = arr_x;
        new b(arr_x);
    }

    public static x valueOf(String s) {
        return (x)Enum.valueOf(x.class, s);
    }

    public static x[] values() {
        return (x[])x.Y.clone();
    }
}

