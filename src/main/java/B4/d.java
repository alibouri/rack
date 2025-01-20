package b4;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class d extends Enum {
    public static final enum d X;
    public static final enum d Y;
    public static final d[] Z;

    static {
        d.X = new d("all", 0);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        d d0 = new d("aural", 1);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        d d1 = new d("braille", 2);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        d d2 = new d("embossed", 3);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        d d3 = new d("handheld", 4);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        d d4 = new d("print", 5);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        d d5 = new d("projection", 6);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        d.Y = new d("screen", 7);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        d.Z = new d[]{d.X, d0, d1, d2, d3, d4, d5, d.Y, new d("speech", 8), new d("tty", 9), new d("tv", 10)};  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V / initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V / initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
    }

    public static d valueOf(String s) {
        return (d)Enum.valueOf(d.class, s);
    }

    public static d[] values() {
        return (d[])d.Z.clone();
    }
}

