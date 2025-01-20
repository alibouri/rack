package N;

import Ab.t;
import D0.M;
import D0.V;
import Nb.k;
import Pb.a;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import kotlin.jvm.functions.Function1;

public final class d2 extends k implements Function1 {
    public final V X;
    public final int Y;
    public final int Z;
    public final int b0;
    public final int c0;
    public final V d0;
    public final V e0;
    public final V f0;
    public final V g0;
    public final e2 h0;
    public final int i0;
    public final int j0;
    public final M k0;

    public d2(V v0, int v1, int v2, int v3, int v4, V v5, V v6, V v7, V v8, e2 e20, int v9, int v10, M m0) {
        this.X = v0;
        this.Y = v1;
        this.Z = v2;
        this.b0 = v3;
        this.c0 = v4;
        this.d0 = v5;
        this.e0 = v6;
        this.f0 = v7;
        this.g0 = v8;
        this.h0 = e20;
        this.i0 = v9;
        this.j0 = v10;
        this.k0 = m0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        V v0 = this.d0;
        M m0 = this.k0;
        V v1 = this.g0;
        V v2 = this.f0;
        V v3 = this.e0;
        int v4 = this.c0;
        int v5 = this.b0;
        e2 e20 = this.h0;
        V v6 = this.X;
        if(v6 == null) {
            boolean z1 = e20.a;
            float f1 = m0.getDensity();
            int v10 = a.H(e20.c.c() * f1);
            if(v2 != null) {
                Placeable.PlacementScope.f(((Placeable.PlacementScope)object0), v2, 0, Math.round(1.0f * (((float)(v4 - v2.Y)) / 2.0f)));
            }
            if(v1 != null) {
                Placeable.PlacementScope.f(((Placeable.PlacementScope)object0), v1, v5 - v1.X, Math.round(1.0f * (((float)(v4 - v1.Y)) / 2.0f)));
            }
            Placeable.PlacementScope.f(((Placeable.PlacementScope)object0), v0, Z1.e(v2), (z1 ? Math.round(1.0f * (((float)(v4 - v0.Y)) / 2.0f)) : v10));
            if(v3 != null) {
                if(z1) {
                    v10 = Math.round(1.0f * (((float)(v4 - v3.Y)) / 2.0f));
                }
                Placeable.PlacementScope.f(((Placeable.PlacementScope)object0), v3, Z1.e(v2), v10);
            }
        }
        else {
            int v7 = this.Y - this.Z >= 0 ? this.Y - this.Z : 0;
            boolean z = e20.a;
            int v8 = this.i0 + this.j0;
            float f = m0.getDensity();
            if(v2 != null) {
                Placeable.PlacementScope.f(((Placeable.PlacementScope)object0), v2, 0, Math.round(1.0f * (((float)(v4 - v2.Y)) / 2.0f)));
            }
            if(v1 != null) {
                Placeable.PlacementScope.f(((Placeable.PlacementScope)object0), v1, v5 - v1.X, Math.round(1.0f * (((float)(v4 - v1.Y)) / 2.0f)));
            }
            int v9 = z ? Math.round(1.0f * (((float)(v4 - v6.Y)) / 2.0f)) : a.H(Z1.b * f);
            Placeable.PlacementScope.f(((Placeable.PlacementScope)object0), v6, Z1.e(v2), v9 - a.H(((float)(v9 - v7)) * e20.b));
            Placeable.PlacementScope.f(((Placeable.PlacementScope)object0), v0, Z1.e(v2), v8);
            if(v3 != null) {
                Placeable.PlacementScope.f(((Placeable.PlacementScope)object0), v3, Z1.e(v2), v8);
                return t.a;
            }
        }
        return t.a;
    }
}

