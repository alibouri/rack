package N;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class i2 extends Enum {
    public static final enum i2 X;
    public static final i2[] Y;

    static {
        i2.X = new i2("Filled", 0);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        i2.Y = new i2[]{i2.X, new i2("Outlined", 1)};  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
    }

    public static i2 valueOf(String s) {
        return (i2)Enum.valueOf(i2.class, s);
    }

    public static i2[] values() {
        return (i2[])i2.Y.clone();
    }
}

