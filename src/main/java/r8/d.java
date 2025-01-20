package r8;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class d extends Enum {
    public static final enum d X;
    public static final enum d Y;
    public static final enum d Z;
    public static final enum d b0;
    public static final enum d c0;
    public static final d[] d0;

    static {
        d.X = new d("ERROR_CORRECTION", 0);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        d.Y = new d("CHARACTER_SET", 1);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        d d0 = new d("DATA_MATRIX_SHAPE", 2);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        d d1 = new d("MIN_SIZE", 3);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        d d2 = new d("MAX_SIZE", 4);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        d.Z = new d("MARGIN", 5);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        d d3 = new d("PDF417_COMPACT", 6);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        d d4 = new d("PDF417_COMPACTION", 7);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        d d5 = new d("PDF417_DIMENSIONS", 8);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        d d6 = new d("AZTEC_LAYERS", 9);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        d.b0 = new d("QR_VERSION", 10);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        d.c0 = new d("GS1_FORMAT", 11);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        d.d0 = new d[]{d.X, d.Y, d0, d1, d2, d.Z, d3, d4, d5, d6, d.b0, d.c0};
    }

    public static d valueOf(String s) {
        return (d)Enum.valueOf(d.class, s);
    }

    public static d[] values() {
        return (d[])d.d0.clone();
    }
}

