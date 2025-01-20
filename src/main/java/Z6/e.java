package Z6;

import M5.c;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public final class e implements c {
    public static final AtomicReference a;

    static {
        e.a = new AtomicReference();
    }

    @Override  // M5.c
    public final void a(boolean z) {
        synchronized(g.k) {
            for(Object object1: new ArrayList(g.l.values())) {
                g g0 = (g)object1;
                if(g0.e.get()) {
                    Log.d("FirebaseApp", "Notifying background state change listeners.");
                    for(Object object2: g0.i) {
                        g g1 = ((d)object2).a;
                        if(z) {
                            g1.getClass();
                        }
                        else {
                            ((v7.c)g1.h.get()).b();
                        }
                    }
                }
            }
        }
    }
}

