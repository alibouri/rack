package d2;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class b extends Enum {
    public static final enum b X;
    public static final enum b Y;
    public static final enum b Z;
    public static final enum b b0;
    public static final enum b c0;
    public static final b[] d0;

    static {
        b b0 = new b("PENALTY_LOG", 0);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        b b1 = new b("PENALTY_DEATH", 1);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        b.X = new b("DETECT_FRAGMENT_REUSE", 2);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        b.Y = new b("DETECT_FRAGMENT_TAG_USAGE", 3);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        b.Z = new b("DETECT_WRONG_NESTED_HIERARCHY", 4);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        b.b0 = new b("DETECT_RETAIN_INSTANCE_USAGE", 5);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        b b2 = new b("DETECT_SET_USER_VISIBLE_HINT", 6);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        b b3 = new b("DETECT_TARGET_FRAGMENT_USAGE", 7);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        b.c0 = new b("DETECT_WRONG_FRAGMENT_CONTAINER", 8);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        b.d0 = new b[]{b0, b1, b.X, b.Y, b.Z, b.b0, b2, b3, b.c0};
    }

    public static b valueOf(String s) {
        return (b)Enum.valueOf(b.class, s);
    }

    public static b[] values() {
        return (b[])b.d0.clone();
    }
}

