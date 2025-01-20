package ra;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import Xb.Q;
import Y8.V;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class k0 extends j implements Function2 {
    public int c0;
    public int d0;
    public Function1 e0;
    public int f0;
    public final j g0;

    public k0(Function1 function10, g g0) {
        this.g0 = (j)function10;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((k0)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new k0(((Function1)this.g0), g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Function1 function10;
        int v3;
        int v2;
        int v1;
        int v;
        j j0;
        Object object1 = a.X;
        switch(this.f0) {
            case 0: {
                f.b0(object0);
                j0 = this.g0;
                v = 7;
                v1 = 0;
                goto label_20;
            }
            case 1: {
                v2 = this.d0;
                v3 = this.c0;
                function10 = this.e0;
                f.b0(object0);
                goto label_32;
            }
            case 2: {
                v2 = this.d0;
                v3 = this.c0;
                function10 = this.e0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            j0 = function10;
            v1 = v2 + 1;
            v = v3;
        label_20:
            if(v1 >= v) {
                break;
            }
            this.e0 = (Function1)j0;
            this.c0 = v;
            this.d0 = v1;
            this.f0 = 1;
            Object object2 = ((Function1)j0).n(this);
            if(object2 == object1) {
                return object1;
            }
            function10 = j0;
            object0 = object2;
            v3 = v;
            v2 = v1;
        label_32:
            if(object0 != null) {
                return object0;
            }
            this.e0 = function10;
            this.c0 = v3;
            this.d0 = v2;
            this.f0 = 2;
            if(Q.b(1000L, this) != object1) {
                continue;
            }
            return object1;
        }
        throw new V(null);
    }
}

