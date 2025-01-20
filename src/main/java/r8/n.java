package r8;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class n extends Enum {
    public static final enum n X;
    public static final enum n Y;
    public static final enum n Z;
    public static final enum n b0;
    public static final enum n c0;
    public static final enum n d0;
    public static final enum n e0;
    public static final enum n f0;
    public static final enum n g0;
    public static final enum n h0;
    public static final n[] i0;

    static {
        n n0 = new n("OTHER", 0);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        n.X = new n("ORIENTATION", 1);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        n.Y = new n("BYTE_SEGMENTS", 2);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        n.Z = new n("ERROR_CORRECTION_LEVEL", 3);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        n.b0 = new n("ISSUE_NUMBER", 4);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        n.c0 = new n("SUGGESTED_PRICE", 5);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        n.d0 = new n("POSSIBLE_COUNTRY", 6);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        n.e0 = new n("UPC_EAN_EXTENSION", 7);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        n.f0 = new n("PDF417_EXTRA_METADATA", 8);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        n.g0 = new n("STRUCTURED_APPEND_SEQUENCE", 9);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        n.h0 = new n("STRUCTURED_APPEND_PARITY", 10);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        n.i0 = new n[]{n0, n.X, n.Y, n.Z, n.b0, n.c0, n.d0, n.e0, n.f0, n.g0, n.h0};
    }

    public static n valueOf(String s) {
        return (n)Enum.valueOf(n.class, s);
    }

    public static n[] values() {
        return (n[])n.i0.clone();
    }
}

