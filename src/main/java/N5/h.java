package N5;

import com.google.android.gms.common.internal.RootTelemetryConfiguration;

public final class h {
    public RootTelemetryConfiguration a;
    public static h b;
    public static final RootTelemetryConfiguration c;

    static {
        h.c = new RootTelemetryConfiguration(0, 0, 0, false, false);
    }

    public static h a() {
        synchronized(h.class) {
            if(h.b == null) {
                h.b = new h();  // initializer: Ljava/lang/Object;-><init>()V
            }
            return h.b;
        }
    }
}

