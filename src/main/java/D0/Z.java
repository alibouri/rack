package D0;

import F0.J;
import W.a;
import W.d;
import Y8.o;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class z implements M, f0 {
    public final B X;
    public final G Y;

    public z(G g0) {
        this.Y = g0;
        this.X = g0.f0;
    }

    @Override  // androidx.compose.ui.unit.Density
    public final int D(long v) {
        return this.X.D(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float E(long v) {
        this.X.getClass();
        return o.f(v, this.X);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final int I(float f) {
        this.X.getClass();
        return o.e(f, this.X);
    }

    @Override  // D0.M
    public final L L(int v, int v1, Map map0, Function1 function10) {
        return this.X.a(v, v1, map0, function10);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final long P(long v) {
        this.X.getClass();
        return o.i(v, this.X);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float T(long v) {
        this.X.getClass();
        return o.h(v, this.X);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final long d0(float f) {
        return this.X.d0(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.X.Y;
    }

    @Override  // D0.o
    public final LayoutDirection getLayoutDirection() {
        return this.X.X;
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float i0(int v) {
        return this.X.i0(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float j0(float f) {
        return f / this.X.getDensity();
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float n() {
        return this.X.Z;
    }

    @Override  // D0.f0
    public final List q(Object object0, Function2 function20) {
        G g0 = this.Y;
        LayoutNode layoutNode0 = (LayoutNode)g0.e0.get(object0);
        List list0 = layoutNode0 == null ? null : layoutNode0.m();
        if(list0 != null) {
            return list0;
        }
        d d0 = g0.k0;
        int v = d0.Z;
        int v1 = g0.c0;
        if(v < v1) {
            throw new IllegalArgumentException("Error: currentPostLookaheadIndex cannot be greater than the size of thepostLookaheadComposedSlotIds list.");
        }
        if(v == v1) {
            d0.c(object0);
        }
        else {
            Object[] arr_object = d0.X;
            Object object1 = arr_object[v1];
            arr_object[v1] = object0;
        }
        ++g0.c0;
        HashMap hashMap0 = g0.h0;
        if(!hashMap0.containsKey(object0)) {
            c0 c00 = g0.g(object0, function20);
            g0.j0.put(object0, c00);
            LayoutNode layoutNode1 = g0.X;
            if(layoutNode1.v0.c == 3) {
                layoutNode1.Q(true);
            }
            else {
                LayoutNode.R(layoutNode1, true, 6);
            }
        }
        LayoutNode layoutNode2 = (LayoutNode)hashMap0.get(object0);
        if(layoutNode2 != null) {
            List list1 = layoutNode2.v0.r.f0();
            int v2 = ((a)list1).X.Z;
            for(int v3 = 0; v3 < v2; ++v3) {
                ((J)((a)list1).get(v3)).F0.b = true;
            }
            return list1;
        }
        return Bb.z.X;
    }

    @Override  // D0.o
    public final boolean s() {
        return this.X.s();
    }

    @Override  // androidx.compose.ui.unit.Density
    public final long u(float f) {
        this.X.getClass();
        return o.j(f, this.X);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final long v(long v) {
        this.X.getClass();
        return o.g(v, this.X);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float w(float f) {
        return this.X.getDensity() * f;
    }
}

