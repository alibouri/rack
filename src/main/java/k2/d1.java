package k2;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class D1 extends Enum {
    public static final enum D1 X;
    public static final D1[] Y;

    static {
        D1.X = new D1("LAUNCH_INITIAL_REFRESH", 0);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        D1.Y = new D1[]{D1.X, new D1("SKIP_INITIAL_REFRESH", 1)};  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
    }

    public static D1 valueOf(String s) {
        return (D1)Enum.valueOf(D1.class, s);
    }

    public static D1[] values() {
        return (D1[])D1.Y.clone();
    }
}

