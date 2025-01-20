package K9;

import Ab.k;
import Ab.t;
import Fb.j;
import Vb.h;
import java.util.Collection;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function3;
import q9.o0;

public final class f extends j implements Function3 {
    public final int c0;
    public String d0;
    public String e0;
    public final i f0;

    public f(i i0, g g0, int v) {
        this.c0 = v;
        this.f0 = i0;
        super(3, g0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        if(this.c0 != 0) {
            f f0 = new f(this.f0, ((g)object2), 1);
            f0.d0 = (String)object0;
            f0.e0 = (String)object1;
            return f0.v(t.a);
        }
        f f1 = new f(this.f0, ((g)object2), 0);
        f1.d0 = (String)object0;
        f1.e0 = (String)object1;
        return f1.v(t.a);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        i i0 = this.f0;
        if(this.c0 != 0) {
            W5.f.b0(object0);
            String s = this.e0;
            if(!o0.E(this.d0)) {
                return Boolean.FALSE;
            }
            return i.o(i0, s) ? Boolean.TRUE : Boolean.FALSE;
        }
        W5.f.b0(object0);
        String s1 = this.e0;
        if(!o0.E(this.d0)) {
            return Boolean.FALSE;
        }
        if(s1 == null) {
            return Boolean.FALSE;
        }
        Iterable iterable0 = i0.e0;
        if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
            for(Object object1: iterable0) {
                if(((h)((k)object1).Y).c(s1)) {
                    return Boolean.FALSE;
                }
                if(false) {
                    break;
                }
            }
        }
        return Boolean.TRUE;
    }
}

