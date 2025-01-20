package v;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import androidx.compose.runtime.MutableState;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class d extends j implements Function2 {
    public int c0;
    public final Object d0;
    public final b e0;
    public final MutableState f0;
    public final MutableState g0;

    public d(Object object0, b b0, MutableState mutableState0, MutableState mutableState1, g g0) {
        this.d0 = object0;
        this.e0 = b0;
        this.f0 = mutableState0;
        this.g0 = mutableState1;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((d)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new d(this.d0, this.e0, this.f0, this.g0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        b b0 = this.e0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                Object object2 = b0.e.getValue();
                if(!Nb.j.a(this.d0, object2)) {
                    Object object3 = this.f0.getValue();
                    this.c0 = 1;
                    if(b.c(this.e0, this.d0, ((k)object3), null, this, 12) == object1) {
                        return object1;
                    }
                    goto label_12;
                }
                break;
            }
            case 1: {
                f.b0(object0);
            label_12:
                Function1 function10 = (Function1)this.g0.getValue();
                if(function10 != null) {
                    function10.n(b0.d());
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return t.a;
    }
}

