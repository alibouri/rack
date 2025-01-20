package L5;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

public abstract class i {
    public static final Set a;

    static {
        i.a = Collections.newSetFromMap(new WeakHashMap());
    }

    public static Set a() {
        synchronized(i.a) {
        }
        return i.a;
    }
}

