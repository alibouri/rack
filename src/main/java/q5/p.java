package q5;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class p extends Enum {
    public static final enum p X;
    public static final p[] Y;

    static {
        p p0 = new p("UNKNOWN", 0);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        p.X = new p("ANDROID_FIREBASE", 1);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        p.Y = new p[]{p0, p.X};
    }

    public static p valueOf(String s) {
        return (p)Enum.valueOf(p.class, s);
    }

    public static p[] values() {
        return (p[])p.Y.clone();
    }
}

