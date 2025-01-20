package D0;

import Ab.t;
import E7.n;
import F0.h;
import F0.i;
import F0.j;
import Nb.k;
import U.p;
import a5.w;
import java.util.List;
import kotlin.jvm.functions.Function2;
import m5.b;

public final class v extends k implements Function2 {
    public final int X;
    public final List Y;

    public v(int v, List list0) {
        this.X = v;
        this.Y = list0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        if(this.X != 0) {
            String s = (String)object0;
            w.g0(new n(((Integer)object1), 13, this.Y));
            return t.a;
        }
        if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
            ((p)object0).K();
            return t.a;
        }
        List list0 = this.Y;
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Function2 function20 = (Function2)list0.get(v1);
            int v2 = ((p)object0).P;
            F0.k.a.getClass();
            i i0 = j.c;
            ((p)object0).U();
            if(((p)object0).O) {
                ((p)object0).l(i0);
            }
            else {
                ((p)object0).d0();
            }
            h h0 = j.g;
            if(((p)object0).O || !Nb.j.a(((p)object0).G(), v2)) {
                b.F(v2, ((p)object0), v2, h0);
            }
            function20.j(((p)object0), 0);
            ((p)object0).p(true);
        }
        return t.a;
    }
}

