package P4;

import Nb.j;
import java.util.Arrays;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class m extends Enum {
    public static final enum m X;
    public static final enum m Y;
    public static final enum m Z;
    public static final m[] b0;

    static {
        m.X = new m("USER_DATA", 0);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        m.Y = new m("APP_DATA", 1);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        m.Z = new m("CUSTOM_DATA", 2);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        m.b0 = new m[]{m.X, m.Y, m.Z, new m("CUSTOM_EVENTS", 3)};  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
    }

    public static m valueOf(String s) {
        j.f(s, "value");
        return (m)Enum.valueOf(m.class, s);
    }

    public static m[] values() {
        return (m[])Arrays.copyOf(m.b0, 4);
    }
}

