package I7;

import M6.b;

public final class d extends b {
    public static d b;

    @Override  // M6.b
    public final String B() {
        return "com.google.firebase.perf.ExperimentTTID";
    }

    @Override  // M6.b
    public final String E() {
        return "experiment_app_start_ttid";
    }

    public static d b0() {
        synchronized(d.class) {
            if(d.b == null) {
                d.b = new d();  // initializer: Ljava/lang/Object;-><init>()V
            }
            return d.b;
        }
    }
}

