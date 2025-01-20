package b8;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class c extends Enum {
    public static final enum c X;
    public static final enum c Y;
    public static final c[] Z;

    static {
        c.X = new c("CRASHLYTICS", 0);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        c.Y = new c("PERFORMANCE", 1);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        c.Z = new c[]{c.X, c.Y, new c("MATT_SAYS_HI", 2)};  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
    }

    public static c valueOf(String s) {
        return (c)Enum.valueOf(c.class, s);
    }

    public static c[] values() {
        return (c[])c.Z.clone();
    }
}

