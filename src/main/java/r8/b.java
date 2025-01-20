package r8;

public final class b extends l {
    public static final b Z;

    static {
        b b0 = new b();  // initializer: Ljava/lang/Exception;-><init>()V
        b.Z = b0;
        b0.setStackTrace(l.Y);
    }

    // Deobfuscation rating: LOW(20)
    public static b a() {
        return l.X ? new b() : b.Z;  // initializer: Ljava/lang/Exception;-><init>()V
    }
}

