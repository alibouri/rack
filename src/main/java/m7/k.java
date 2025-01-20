package m7;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import u7.a;
import u7.b;
import u7.c;

public final class k implements b, c {
    public final HashMap a;
    public ArrayDeque b;
    public final n7.k c;

    public k() {
        this.a = new HashMap();
        this.b = new ArrayDeque();
        this.c = n7.k.X;
    }

    public final void a(Executor executor0, a a0) {
        Class class0 = Z6.b.class;
        synchronized(this) {
            executor0.getClass();
            if(!this.a.containsKey(class0)) {
                ConcurrentHashMap concurrentHashMap0 = new ConcurrentHashMap();
                this.a.put(class0, concurrentHashMap0);
            }
            ((ConcurrentHashMap)this.a.get(class0)).put(a0, executor0);
        }
    }
}

