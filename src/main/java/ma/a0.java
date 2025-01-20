package ma;

import Ab.t;
import Eb.a;
import Fb.j;
import V8.d;
import W5.f;
import Y8.R9;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class a0 extends j implements Function2 {
    public int c0;
    public Object d0;
    public final q0 e0;

    public a0(q0 q00, g g0) {
        this.e0 = q00;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((a0)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new a0(this.e0, g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        R9 r91;
        Object object1 = a.X;
        q0 q00 = this.e0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                R9 r90 = (R9)this.d0;
                this.d0 = r90;
                this.c0 = 1;
                Object object2 = q00.d0.e(this);
                if(object2 == object1) {
                    return object1;
                }
                r91 = r90;
                object0 = object2;
                goto label_18;
            }
            case 1: {
                r91 = (R9)this.d0;
                f.b0(object0);
            label_18:
                this.d0 = r91;
                this.c0 = 2;
                object0 = Pb.a.N(((d)object0), 0x7F0D006E, this.e0, null, this, 4);  // layout:linked_account_transfer_confirmation
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 2: {
                r91 = (R9)this.d0;
                f.b0(object0);
                break;
            }
            case 3: {
                f.b0(object0);
                return t.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((Integer)object0) != null && ((int)(((Integer)object0))) == -1) {
            this.d0 = null;
            this.c0 = 3;
            if(q0.o(q00, r91, this) == object1) {
                return object1;
            }
        }
        return t.a;
    }
}

