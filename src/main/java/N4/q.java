package N4;

import Nb.j;
import java.util.Arrays;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class q extends Enum {
    public static final enum q X;
    public static final enum q Y;
    public static final enum q Z;
    public static final q[] b0;

    static {
        q.X = new q("SUCCESS", 0);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        q.Y = new q("SERVER_ERROR", 1);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        q.Z = new q("NO_CONNECTIVITY", 2);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        q.b0 = new q[]{q.X, q.Y, q.Z, new q("UNKNOWN_ERROR", 3)};  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
    }

    public static q valueOf(String s) {
        j.f(s, "value");
        return (q)Enum.valueOf(q.class, s);
    }

    public static q[] values() {
        return (q[])Arrays.copyOf(q.b0, 4);
    }
}

