package t5;

public final class a implements zb.a {
    public volatile b X;
    public volatile Object Y;
    public static final Object Z;

    static {
        a.Z = new Object();
    }

    public static zb.a a(b b0) {
        if(b0 instanceof a) {
            return b0;
        }
        zb.a a0 = new a();  // initializer: Ljava/lang/Object;-><init>()V
        a0.Y = a.Z;
        a0.X = b0;
        return a0;
    }

    @Override  // zb.a
    public final Object get() {
        Object object0 = this.Y;
        Object object1 = a.Z;
        if(object0 == object1) {
            synchronized(this) {
                object0 = this.Y;
                if(object0 == object1) {
                    object0 = this.X.get();
                    Object object2 = this.Y;
                    if(object2 != object1 && object2 != object0) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + object2 + " & " + object0 + ". This is likely due to a circular dependency.");
                    }
                    this.Y = object0;
                    this.X = null;
                }
            }
        }
        return object0;
    }
}

