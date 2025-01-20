package m7;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import x7.a;

public final class n implements a {
    public volatile Set a;
    public volatile Set b;

    public final void a() {
        synchronized(this) {
            for(Object object0: this.a) {
                this.b.add(((a)object0).get());
            }
            this.a = null;
        }
    }

    @Override  // x7.a
    public final Object get() {
        if(this.b == null) {
            synchronized(this) {
                if(this.b == null) {
                    this.b = Collections.newSetFromMap(new ConcurrentHashMap());
                    this.a();
                }
            }
        }
        return Collections.unmodifiableSet(this.b);
    }
}

