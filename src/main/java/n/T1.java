package N;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class t1 extends Enum {
    public static final enum t1 X;
    public static final t1[] Y;

    static {
        t1.X = new t1("Short", 0);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        t1.Y = new t1[]{t1.X, new t1("Long", 1), new t1("Indefinite", 2)};  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V / initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
    }

    public static t1 valueOf(String s) {
        return (t1)Enum.valueOf(t1.class, s);
    }

    public static t1[] values() {
        return (t1[])t1.Y.clone();
    }
}

