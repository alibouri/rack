package t7;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class d extends Enum {
    public static final enum d X;
    public static final d[] Y;

    static {
        d.X = new d("DEFAULT", 0);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        d.Y = new d[]{d.X, new d("SIGNED", 1), new d("FIXED", 2)};  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V / initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
    }

    public static d valueOf(String s) {
        return (d)Enum.valueOf(d.class, s);
    }

    public static d[] values() {
        return (d[])d.Y.clone();
    }
}

