package I7;

import M6.b;

public final class c extends b {
    public static c b;

    @Override  // M6.b
    public final String B() {
        return "isEnabled";
    }

    @Override  // M6.b
    public final String E() {
        return "firebase_performance_collection_enabled";
    }

    public static c b0() {
        synchronized(c.class) {
            if(c.b == null) {
                c.b = new c();  // initializer: Ljava/lang/Object;-><init>()V
            }
            return c.b;
        }
    }
}

