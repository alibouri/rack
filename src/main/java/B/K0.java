package B;

import androidx.compose.ui.unit.Density;
import g0.n;

public final class k0 extends n implements F0.k0 {
    public float l0;
    public boolean m0;

    @Override  // F0.k0
    public final Object h(Density density0, Object object0) {
        Object object1 = object0 instanceof u0 ? ((u0)object0) : null;
        if(object1 == null) {
            object1 = new u0();
        }
        object1.a = this.l0;
        object1.b = this.m0;
        return object1;
    }
}

