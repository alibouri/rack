package I7;

import I3.i;
import M6.b;
import java.util.Collections;
import java.util.Map;

public final class f extends b {
    public static f b;
    public static final Map c;

    static {
        i i0 = new i();  // initializer: Ljava/util/HashMap;-><init>()V
        i0.put(461L, "FIREPERF_AUTOPUSH");
        i0.put(462L, "FIREPERF");
        i0.put(675L, "FIREPERF_INTERNAL_LOW");
        i0.put(676L, "FIREPERF_INTERNAL_HIGH");
        f.c = Collections.unmodifiableMap(i0);
    }

    @Override  // M6.b
    public final String B() {
        return "com.google.firebase.perf.LogSourceName";
    }
}

