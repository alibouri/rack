package E7;

import F7.d;
import F7.e;
import a8.Q;
import java.util.HashMap;
import t7.g;

public abstract class y {
    public static final Q a;

    static {
        HashMap hashMap0 = new HashMap();
        HashMap hashMap1 = new HashMap();
        hashMap0.put(y.class, c.a);
        hashMap1.remove(y.class);
        hashMap0.put(e.class, b.a);
        hashMap1.remove(e.class);
        hashMap0.put(d.class, a.a);
        hashMap1.remove(d.class);
        y.a = new Q(new HashMap(hashMap0), new HashMap(hashMap1), g.a, 28);
    }
}

