package I2;

import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import f1.i;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class t extends j implements Function2 {
    public int c0;
    public Object d0;
    public final j e0;
    public final i f0;

    public t(Function2 function20, i i0, g g0) {
        this.e0 = (j)function20;
        this.f0 = i0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((t)this.t(((G)object0), ((g)object1))).v(Ab.t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new t(((Function2)this.e0), this.f0, g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        i i0 = this.f0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                G g0 = (G)this.d0;
                try {
                    this.c0 = 1;
                    object0 = ((Function2)this.e0).j(g0, this);
                    if(object0 == object1) {
                        return object1;
                    label_10:
                        f.b0(object0);
                    }
                    i0.a(object0);
                    return Ab.t.a;
                }
                catch(CancellationException unused_ex) {
                    break;
                }
                catch(Throwable throwable0) {
                    i0.b(throwable0);
                    return Ab.t.a;
                }
            }
            case 1: {
                goto label_10;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        i0.d = true;
        if(i0.b != null && i0.b.Y.cancel(true)) {
            i0.a = null;
            i0.b = null;
            i0.c = null;
        }
        return Ab.t.a;
    }
}

