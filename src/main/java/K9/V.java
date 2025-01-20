package K9;

import Ab.e;
import Ab.t;
import Eb.a;
import Fb.j;
import Ha.Q;
import L9.i;
import W5.f;
import Xb.G;
import com.wave.components.sendmoney.SendMoneyDialogActivity;
import com.wave.components.sendmoney.d;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class v extends j implements Function2 {
    public int c0;
    public final SendMoneyDialogActivity d0;
    public final i e0;

    public v(SendMoneyDialogActivity sendMoneyDialogActivity0, i i0, g g0) {
        this.d0 = sendMoneyDialogActivity0;
        this.e0 = i0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((v)this.t(((G)object0), ((g)object1))).v(t.a);
        return a.X;
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new v(this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                d d0 = this.d0.I();
                Q q0 = new Q(this.e0, 3, this.d0);
                this.c0 = 1;
                d0.y0.d(q0, this);
                return object1;
            }
            case 1: {
                f.b0(object0);
                throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

