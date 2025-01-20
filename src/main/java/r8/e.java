package r8;

public final class e extends l {
    public static final e Z;

    static {
        e e0 = new e();  // initializer: Ljava/lang/Exception;-><init>()V
        e.Z = e0;
        e0.setStackTrace(l.Y);
    }

    // Deobfuscation rating: LOW(20)
    public static e a() {
        return l.X ? new e() : e.Z;  // initializer: Ljava/lang/Exception;-><init>()V
    }
}

