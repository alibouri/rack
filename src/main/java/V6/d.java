package V6;

public final class d implements g {
    public volatile e X;
    public volatile Object Y;
    public static final Object Z;

    static {
        d.Z = new Object();
    }

    public static d a(e e0) {
        if(e0 instanceof d) {
            return (d)e0;
        }
        d d0 = new d();  // initializer: Ljava/lang/Object;-><init>()V
        d0.Y = d.Z;
        d0.X = e0;
        return d0;
    }

    @Override  // V6.g
    public final Object e() {
        Object object0 = this.Y;
        Object object1 = d.Z;
        if(object0 == object1) {
            synchronized(this) {
                object0 = this.Y;
                if(object0 == object1) {
                    object0 = this.X.e();
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

