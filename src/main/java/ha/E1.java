package ha;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Y8.R9;
import android.os.Parcelable;
import com.wave.customer.transactions.ui.TransactionsActivity;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class e1 extends j implements Function2 {
    public Class c0;
    public int d0;
    public Object e0;
    public final S2 f0;

    public e1(S2 s20, g g0) {
        this.f0 = s20;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((e1)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new e1(this.f0, g0);
        g1.e0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        w w0;
        Class class1;
        R9 r90;
        Object object1 = a.X;
        S2 s20 = this.f0;
        switch(this.d0) {
            case 0: {
                f.b0(object0);
                r90 = (R9)this.e0;
                s20.i0.d("click transaction history search button", null);
                this.e0 = r90;
                this.d0 = 1;
                object0 = s20.r0.e(this);
                if(object0 == object1) {
                    return object1;
                }
                goto label_14;
            }
            case 1: {
                r90 = (R9)this.e0;
                f.b0(object0);
            label_14:
                this.e0 = (w)object0;
                Class class0 = TransactionsActivity.class;
                this.c0 = class0;
                this.d0 = 2;
                Object object2 = S2.y(s20, r90, this);
                if(object2 == object1) {
                    return object1;
                }
                class1 = class0;
                w0 = (w)object0;
                object0 = object2;
                break;
            }
            case 2: {
                class1 = this.c0;
                w0 = (w)this.e0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        w0.V(class1, ((Parcelable)object0));
        return t.a;
    }
}

