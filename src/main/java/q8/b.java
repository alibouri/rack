package q8;

import M5.p;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;
import x5.a;

public final class b implements d, t5.b {
    public final int X;

    public b(int v) {
        this.X = v;
        super();
    }

    @Override  // q8.d
    public Object a(m8.d d0) {
        return d0.G0;
    }

    @Override  // zb.a
    public Object get() {
        if(this.X != 1) {
            L7.b b0 = new L7.b(1);
            HashMap hashMap0 = new HashMap();
            o5.d d0 = o5.d.X;
            Set set0 = Collections.emptySet();
            if(set0 == null) {
                throw new NullPointerException("Null flags");
            }
            hashMap0.put(d0, new x5.b(30000L, 86400000L, set0));
            o5.d d1 = o5.d.Z;
            Set set1 = Collections.emptySet();
            if(set1 == null) {
                throw new NullPointerException("Null flags");
            }
            hashMap0.put(d1, new x5.b(1000L, 86400000L, set1));
            o5.d d2 = o5.d.Y;
            if(Collections.emptySet() == null) {
                throw new NullPointerException("Null flags");
            }
            Set set2 = Collections.unmodifiableSet(new HashSet(Arrays.asList(new x5.d[]{x5.d.Y})));
            if(set2 == null) {
                throw new NullPointerException("Null flags");
            }
            hashMap0.put(d2, new x5.b(86400000L, 86400000L, set2));
            if(hashMap0.keySet().size() < o5.d.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            new HashMap();
            return new a(b0, hashMap0);
        }
        return new p(5, Executors.newSingleThreadExecutor());
    }
}

