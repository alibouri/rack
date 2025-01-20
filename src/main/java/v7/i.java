package V7;

import M5.c;
import java.util.concurrent.atomic.AtomicReference;

public final class i implements c {
    public static final AtomicReference a;

    static {
        i.a = new AtomicReference();
    }

    @Override  // M5.c
    public final void a(boolean z) {
        synchronized(j.class) {
            for(Object object0: j.k.values()) {
                ((b)object0).c(z);
            }
        }
    }
}

