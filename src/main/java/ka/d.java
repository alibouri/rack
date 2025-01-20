package ka;

import Ab.t;
import Fb.j;
import W5.f;
import java.util.List;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function3;

public final class d extends j implements Function3 {
    public final int c0;
    public List d0;
    public List e0;

    public d(int v, g g0, int v1) {
        this.c0 = v1;
        super(v, g0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        if(this.c0 != 0) {
            d d0 = new d(3, ((g)object2), 1);
            d0.d0 = (List)object0;
            d0.e0 = (List)object1;
            return d0.v(t.a);
        }
        d d1 = new d(3, ((g)object2), 0);
        d1.d0 = (List)object0;
        d1.e0 = (List)object1;
        return d1.v(t.a);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        int v = 0;
        if(this.c0 != 0) {
            f.b0(object0);
            List list0 = this.d0;
            List list1 = this.e0;
            boolean z = list1.isEmpty();
            if(list0.isEmpty()) {
                return Boolean.valueOf(!z);
            }
            if(list0.size() > 12 || list1.size() > list0.size()) {
                v = 1;
            }
            return Boolean.valueOf(((boolean)v));
        }
        f.b0(object0);
        if(this.d0.isEmpty() && !this.e0.isEmpty()) {
            v = 1;
        }
        return Boolean.valueOf(((boolean)v));
    }
}

