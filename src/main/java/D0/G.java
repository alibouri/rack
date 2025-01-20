package d0;

import U.E;
import e0.p;
import java.util.Map;
import u.k;

public final class g implements E {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public g(f f0, h h0, Object object0) {
        this.a = 0;
        super();
        this.c = f0;
        this.d = h0;
        this.b = object0;
    }

    public g(p p0, Object object0, k k0) {
        this.a = 1;
        super();
        this.c = p0;
        this.b = object0;
        this.d = k0;
    }

    @Override  // U.E
    public final void a() {
        if(this.a != 0) {
            ((p)this.c).remove(this.b);
            ((k)this.d).d.g(this.b);
            return;
        }
        h h0 = (h)this.d;
        Map map0 = h0.a;
        f f0 = (f)this.c;
        if(f0.b) {
            Map map1 = f0.c.d();
            Object object0 = f0.a;
            if(map1.isEmpty()) {
                map0.remove(object0);
            }
            else {
                map0.put(object0, map1);
            }
        }
        h0.b.remove(this.b);
    }
}

