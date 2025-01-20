package w;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class h0 extends Enum {
    public static final enum h0 X;
    public static final enum h0 Y;
    public static final h0[] Z;

    static {
        h0.X = new h0("Default", 0);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        h0.Y = new h0("UserInput", 1);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        h0.Z = new h0[]{h0.X, h0.Y, new h0("PreventUserInput", 2)};  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
    }

    public static h0 valueOf(String s) {
        return (h0)Enum.valueOf(h0.class, s);
    }

    public static h0[] values() {
        return (h0[])h0.Z.clone();
    }
}

