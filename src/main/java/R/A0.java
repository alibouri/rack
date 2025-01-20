package R;

import Ab.t;
import Fb.j;
import W5.f;
import Xb.G;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

public final class a0 extends j implements Function3 {
    public float c0;
    public final Function1 d0;

    public a0(Function1 function10, g g0) {
        this.d0 = function10;
        super(3, g0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        G g0 = (G)object0;
        float f = ((Number)object1).floatValue();
        a0 a00 = new a0(this.d0, ((g)object2));
        a00.c0 = f;
        a00.v(t.a);
        return t.a;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        this.d0.n(new Float(this.c0));
        return t.a;
    }
}

