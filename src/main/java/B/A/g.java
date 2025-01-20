package A;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import androidx.compose.runtime.MutableState;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

public final class g extends j implements Function2 {
    public int c0;
    public final k d0;
    public final MutableState e0;

    public g(k k0, MutableState mutableState0, kotlin.coroutines.g g0) {
        this.d0 = k0;
        this.e0 = mutableState0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((g)this.t(((G)object0), ((kotlin.coroutines.g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final kotlin.coroutines.g t(Object object0, kotlin.coroutines.g g0) {
        return new g(this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                A.f f0 = new A.f(new ArrayList(), this.e0, 0);
                this.c0 = 1;
                this.d0.a.d(f0, this);
                return object1;
            }
            case 1: {
                f.b0(object0);
                return t.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

