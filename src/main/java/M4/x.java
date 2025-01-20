package M4;

import Nb.j;
import java.util.Arrays;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class x extends Enum {
    public static final enum x X;
    public static final enum x Y;
    public static final x[] Z;

    static {
        x.X = new x("GET", 0);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        x.Y = new x("POST", 1);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        x.Z = new x[]{x.X, x.Y, new x("DELETE", 2)};  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
    }

    public static x valueOf(String s) {
        j.f(s, "value");
        return (x)Enum.valueOf(x.class, s);
    }

    public static x[] values() {
        return (x[])Arrays.copyOf(x.Z, 3);
    }
}

