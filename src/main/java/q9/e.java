package q9;

import Ab.t;
import Bb.r;
import Eb.a;
import Fb.j;
import W5.f;
import Y8.R6;
import Y8.R9;
import Y8.S6;
import Y8.l;
import Y8.m;
import Y8.n;
import Y8.y6;
import java.util.ArrayList;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class e extends j implements Function2 {
    public int c0;
    public final i d0;

    public e(i i0, g g0) {
        this.d0 = i0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((e)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new e(this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        i i0 = this.d0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                n n0 = new n(S6.a(i0.Z));
                this.c0 = 1;
                object0 = R6.d(i0.Y, n0, null, null, this, 6);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Iterable iterable0 = ((m)((y6)object0).b).a;
        ArrayList arrayList0 = new ArrayList(r.b0(iterable0));
        for(Object object2: iterable0) {
            arrayList0.add(new q9.j(((l)object2).a, ((l)object2).b, ((l)object2).c, ((l)object2).d, ((l)object2).e));
        }
        mb.a.a(null, null, new d(i0, arrayList0, null), 3);
        Boolean boolean0 = Boolean.FALSE;
        i0.e0.getClass();
        i0.e0.l(null, boolean0);
        return t.a;
    }
}

