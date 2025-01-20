package I2;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import androidx.work.CoroutineWorker;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class i extends j implements Function2 {
    public int c0;
    public final CoroutineWorker d0;

    public i(CoroutineWorker coroutineWorker0, g g0) {
        this.d0 = coroutineWorker0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((i)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new i(this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                this.c0 = 1;
                object0 = this.d0.d();
                return object0 == object1 ? object1 : object0;
            }
            case 1: {
                f.b0(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

