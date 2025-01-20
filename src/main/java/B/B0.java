package B;

import F0.k0;
import androidx.compose.ui.unit.Density;
import g0.e;
import g0.n;

public final class b0 extends n implements k0 {
    public e l0;

    @Override  // F0.k0
    public final Object h(Density density0, Object object0) {
        Object object1 = object0 instanceof u0 ? ((u0)object0) : null;
        if(object1 == null) {
            object1 = new u0();
        }
        object1.c = new E(this.l0);
        return object1;
    }
}

