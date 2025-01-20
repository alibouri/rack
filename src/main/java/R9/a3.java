package R9;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Y8.O;
import Y8.R9;
import com.sendwave.util.Country;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class a3 extends j implements Function2 {
    public int c0;
    public final e3 d0;
    public final Country e0;

    public a3(e3 e30, Country country0, g g0) {
        this.d0 = e30;
        this.e0 = country0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((a3)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new a3(this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object2;
        Object object1;
        try {
            object1 = a.X;
            object2 = t.a;
            switch(this.c0) {
                case 0: {
                    goto label_6;
                }
                case 1: {
                    goto label_11;
                }
                case 2: {
                    goto label_4;
                }
            }
        }
        catch(O unused_ex) {
            return object2;
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
        try {
        label_4:
            f.b0(object0);
        }
        catch(O unused_ex) {
        }
        return object2;
    label_6:
        f.b0(object0);
        try {
            this.c0 = 1;
            object0 = this.d0.i0.e(this);
            if(object0 == object1) {
                return object1;
            label_11:
                f.b0(object0);
            }
            this.c0 = 2;
            ((W0)object0).M(this.e0);
            if(object2 == object1) {
                return object1;
            }
        }
        catch(O unused_ex) {
        }
        return object2;
    }
}

