package E;

import D0.J;
import D0.M;
import D0.f0;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class L implements M {
    public final D X;
    public final f0 Y;
    public final G Z;
    public final HashMap b0;

    public L(D d0, f0 f00) {
        this.X = d0;
        this.Y = f00;
        this.Z = (G)d0.b.invoke();
        this.b0 = new HashMap();
    }

    @Override  // androidx.compose.ui.unit.Density
    public final int D(long v) {
        return this.Y.D(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float E(long v) {
        return this.Y.E(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final int I(float f) {
        return this.Y.I(f);
    }

    @Override  // D0.M
    public final D0.L L(int v, int v1, Map map0, Function1 function10) {
        return this.Y.L(v, v1, map0, function10);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final long P(long v) {
        return this.Y.P(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float T(long v) {
        return this.Y.T(v);
    }

    public final List a(int v, long v1) {
        HashMap hashMap0 = this.b0;
        List list0 = (List)hashMap0.get(v);
        if(list0 == null) {
            Object object0 = this.Z.c(v);
            Object object1 = this.Z.d(v);
            Function2 function20 = this.X.a(object0, v, object1);
            List list1 = this.Y.q(object0, function20);
            int v2 = list1.size();
            ArrayList arrayList0 = new ArrayList(v2);
            for(int v3 = 0; v3 < v2; ++v3) {
                arrayList0.add(((J)list1.get(v3)).a(v1));
            }
            hashMap0.put(v, arrayList0);
            return arrayList0;
        }
        return list0;
    }

    @Override  // androidx.compose.ui.unit.Density
    public final long d0(float f) {
        return this.Y.d0(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.Y.getDensity();
    }

    @Override  // D0.o
    public final LayoutDirection getLayoutDirection() {
        return this.Y.getLayoutDirection();
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float i0(int v) {
        return this.Y.i0(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float j0(float f) {
        return this.Y.j0(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float n() {
        return this.Y.n();
    }

    @Override  // D0.o
    public final boolean s() {
        return this.Y.s();
    }

    @Override  // androidx.compose.ui.unit.Density
    public final long u(float f) {
        return this.Y.u(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final long v(long v) {
        return this.Y.v(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float w(float f) {
        return this.Y.w(f);
    }
}

