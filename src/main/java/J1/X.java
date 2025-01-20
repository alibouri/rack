package J1;

import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

public abstract class x {
    public static final Map a;

    static {
        x.a = Collections.synchronizedMap(new WeakHashMap());
    }
}

