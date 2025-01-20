package R;

import Ab.t;
import B.F0;
import B8.c;
import D0.V;
import D0.f0;
import Nb.j;
import Nb.k;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

public final class p0 extends k implements Function1 {
    public final ArrayList X;
    public final ArrayList Y;
    public final ArrayList Z;
    public final ArrayList b0;
    public final c c0;
    public final int d0;
    public final int e0;
    public final F0 f0;
    public final f0 g0;
    public final int h0;
    public final int i0;
    public final Integer j0;
    public final ArrayList k0;
    public final Integer l0;

    public p0(ArrayList arrayList0, ArrayList arrayList1, ArrayList arrayList2, ArrayList arrayList3, c c0, int v, int v1, F0 f00, f0 f01, int v2, int v3, Integer integer0, ArrayList arrayList4, Integer integer1) {
        this.X = arrayList0;
        this.Y = arrayList1;
        this.Z = arrayList2;
        this.b0 = arrayList3;
        this.c0 = c0;
        this.d0 = v;
        this.e0 = v1;
        this.f0 = f00;
        this.g0 = f01;
        this.h0 = v2;
        this.i0 = v3;
        this.j0 = integer0;
        this.k0 = arrayList4;
        this.l0 = integer1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        int v7;
        ArrayList arrayList0 = this.X;
        int v = arrayList0.size();
        for(int v2 = 0; v2 < v; ++v2) {
            Placeable.PlacementScope.d(((Placeable.PlacementScope)object0), ((V)arrayList0.get(v2)), 0, 0);
        }
        ArrayList arrayList1 = this.Y;
        int v3 = arrayList1.size();
        for(int v4 = 0; v4 < v3; ++v4) {
            Placeable.PlacementScope.d(((Placeable.PlacementScope)object0), ((V)arrayList1.get(v4)), 0, 0);
        }
        ArrayList arrayList2 = this.Z;
        int v5 = arrayList2.size();
        for(int v6 = 0; true; ++v6) {
            v7 = this.h0;
            if(v6 >= v5) {
                break;
            }
            V v8 = (V)arrayList2.get(v6);
            LayoutDirection layoutDirection0 = this.g0.getLayoutDirection();
            Placeable.PlacementScope.d(((Placeable.PlacementScope)object0), v8, this.f0.d(this.g0, layoutDirection0) + (this.d0 - this.e0) / 2, v7 - this.i0);
        }
        ArrayList arrayList3 = this.b0;
        int v9 = arrayList3.size();
        for(int v10 = 0; v10 < v9; ++v10) {
            Placeable.PlacementScope.d(((Placeable.PlacementScope)object0), ((V)arrayList3.get(v10)), 0, v7 - (this.j0 == null ? 0 : ((int)this.j0)));
        }
        c c0 = this.c0;
        if(c0 != null) {
            ArrayList arrayList4 = this.k0;
            int v11 = arrayList4.size();
            for(int v1 = 0; v1 < v11; ++v1) {
                V v12 = (V)arrayList4.get(v1);
                j.c(this.l0);
                Placeable.PlacementScope.d(((Placeable.PlacementScope)object0), v12, c0.b, v7 - ((int)this.l0));
            }
        }
        return t.a;
    }
}

