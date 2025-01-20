package Fa;

import Ab.t;
import D0.V;
import Nb.j;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

public final class r implements Function1 {
    public final ArrayList X;
    public final V Y;
    public final int Z;
    public final int b0;

    public r(ArrayList arrayList0, V v0, int v1, int v2) {
        this.X = arrayList0;
        this.Y = v0;
        this.Z = v1;
        this.b0 = v2;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        int v2;
        j.f(((Placeable.PlacementScope)object0), "$this$layout");
        ArrayList arrayList0 = this.X;
        int v = arrayList0.size();
        for(int v1 = 0; true; ++v1) {
            v2 = this.Z;
            if(v1 >= v) {
                break;
            }
            V v3 = (V)arrayList0.get(v1);
            Placeable.PlacementScope.d(((Placeable.PlacementScope)object0), v3, (v2 - v3.X) / 2, (this.b0 - v3.Y) / 2);
        }
        Placeable.PlacementScope.d(((Placeable.PlacementScope)object0), this.Y, (v2 - this.Y.X) / 2, -this.Y.Y);
        return t.a;
    }
}

