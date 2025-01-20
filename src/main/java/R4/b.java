package R4;

import Nb.j;
import java.util.Arrays;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class b extends Enum {
    public static final b[] X;

    static {
        b.X = new b[]{new b("MANUAL", 0), new b("INFERENCE", 1)};  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V / initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
    }

    public static b valueOf(String s) {
        j.f(s, "value");
        return (b)Enum.valueOf(b.class, s);
    }

    public static b[] values() {
        return (b[])Arrays.copyOf(b.X, 2);
    }
}

