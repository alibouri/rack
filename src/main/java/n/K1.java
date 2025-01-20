package N;

import Ab.t;
import B8.c;
import D0.V;
import Nb.k;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

public final class k1 extends k implements Function1 {
    public final ArrayList X;
    public final ArrayList Y;
    public final ArrayList Z;
    public final ArrayList b0;
    public final ArrayList c0;
    public final int d0;
    public final int e0;
    public final int f0;
    public final Integer g0;
    public final c h0;
    public final Integer i0;

    public k1(ArrayList arrayList0, ArrayList arrayList1, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, int v, int v1, int v2, Integer integer0, c c0, Integer integer1) {
        this.X = arrayList0;
        this.Y = arrayList1;
        this.Z = arrayList2;
        this.b0 = arrayList3;
        this.c0 = arrayList4;
        this.d0 = v;
        this.e0 = v1;
        this.f0 = v2;
        this.g0 = integer0;
        this.h0 = c0;
        this.i0 = integer1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        int v6;
        ArrayList arrayList0 = this.X;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Placeable.PlacementScope.d(((Placeable.PlacementScope)object0), ((V)arrayList0.get(v1)), 0, this.d0);
        }
        ArrayList arrayList1 = this.Y;
        int v2 = arrayList1.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            Placeable.PlacementScope.d(((Placeable.PlacementScope)object0), ((V)arrayList1.get(v3)), 0, 0);
        }
        ArrayList arrayList2 = this.Z;
        int v4 = arrayList2.size();
        for(int v5 = 0; true; ++v5) {
            v6 = this.e0;
            if(v5 >= v4) {
                break;
            }
            Placeable.PlacementScope.d(((Placeable.PlacementScope)object0), ((V)arrayList2.get(v5)), 0, v6 - this.f0);
        }
        ArrayList arrayList3 = this.b0;
        int v7 = arrayList3.size();
        for(int v8 = 0; v8 < v7; ++v8) {
            Placeable.PlacementScope.d(((Placeable.PlacementScope)object0), ((V)arrayList3.get(v8)), 0, v6 - (this.g0 == null ? 0 : ((int)this.g0)));
        }
        ArrayList arrayList4 = this.c0;
        int v9 = arrayList4.size();
        for(int v10 = 0; v10 < v9; ++v10) {
            Placeable.PlacementScope.d(((Placeable.PlacementScope)object0), ((V)arrayList4.get(v10)), (this.h0 == null ? 0 : this.h0.b), v6 - (this.i0 == null ? 0 : ((int)this.i0)));
        }
        return t.a;
    }
}

