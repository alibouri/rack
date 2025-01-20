package ga;

import Ab.t;
import Bb.F;
import Fb.j;
import W5.f;
import Xb.G;
import java.util.Map;
import kotlin.jvm.functions.Function2;

public final class g extends j implements Function2 {
    public final k c0;

    public g(k k0, kotlin.coroutines.g g0) {
        this.c0 = k0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((g)this.t(((G)object0), ((kotlin.coroutines.g)object1))).v(t.a);
        return t.a;
    }

    @Override  // Fb.a
    public final kotlin.coroutines.g t(Object object0, kotlin.coroutines.g g0) {
        return new g(this.c0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        Map map0 = F.J(new Ab.k("deal_id", this.c0.Y.X.X));
        this.c0.Z.d("view deal screen", map0);
        return t.a;
    }
}

