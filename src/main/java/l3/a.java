package l3;

public final class a {
    public static final a a;

    static {
        a.a = new a();  // initializer: Ljava/lang/Object;-><init>()V
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof a;
    }

    @Override
    public final int hashCode() {
        return a.class.hashCode();
    }
}

