package Y9;

public final class b implements d {
    public static final b a;

    static {
        b.a = new b();  // initializer: Ljava/lang/Object;-><init>()V
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof b;
    }

    @Override
    public final int hashCode() {
        return 0xAF2706C7;
    }

    @Override
    public final String toString() {
        return "Default";
    }
}

