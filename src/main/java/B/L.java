package B;

import Ab.t;
import D0.V;
import Nb.j;
import Nb.k;
import a1.g;
import android.support.v4.media.session.a;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function1;

public final class l extends k implements Function1 {
    public final int X;
    public final V Y;

    public l(V v0, int v1) {
        this.X = v1;
        this.Y = v0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        switch(this.X) {
            case 0: {
                Placeable.PlacementScope.f(((Placeable.PlacementScope)object0), this.Y, 0, 0);
                return t.a;
            }
            case 1: {
                Placeable.PlacementScope.f(((Placeable.PlacementScope)object0), this.Y, 0, 0);
                return t.a;
            }
            case 2: {
                LayoutDirection layoutDirection0 = ((Placeable.PlacementScope)object0).b();
                V v0 = this.Y;
                if(layoutDirection0 != LayoutDirection.X && ((Placeable.PlacementScope)object0).c() != 0) {
                    long v1 = a.i(((Placeable.PlacementScope)object0).c() - v0.X, 0);
                    Placeable.PlacementScope.a(((Placeable.PlacementScope)object0), v0);
                    v0.Z(g.d(v1, v0.c0), 0.0f, null);
                    return t.a;
                }
                Placeable.PlacementScope.a(((Placeable.PlacementScope)object0), v0);
                v0.Z(g.d(0L, v0.c0), 0.0f, null);
                return t.a;
            }
            case 3: {
                Placeable.PlacementScope.f(((Placeable.PlacementScope)object0), this.Y, 0, 0);
                return t.a;
            }
            case 4: {
                Placeable.PlacementScope.f(((Placeable.PlacementScope)object0), this.Y, 0, 0);
                return t.a;
            }
            case 5: {
                Placeable.PlacementScope.g(((Placeable.PlacementScope)object0), this.Y, 0, 0);
                return t.a;
            }
            case 6: {
                Placeable.PlacementScope.f(((Placeable.PlacementScope)object0), this.Y, 0, 0);
                return t.a;
            }
            case 7: {
                Placeable.PlacementScope.d(((Placeable.PlacementScope)object0), this.Y, 0, 0);
                return t.a;
            }
            case 8: {
                Placeable.PlacementScope.d(((Placeable.PlacementScope)object0), this.Y, 0, 0);
                return t.a;
            }
            case 9: {
                Placeable.PlacementScope.f(((Placeable.PlacementScope)object0), this.Y, 0, 0);
                return t.a;
            }
            case 10: {
                Placeable.PlacementScope.f(((Placeable.PlacementScope)object0), this.Y, 0, 0);
                return t.a;
            }
            case 11: {
                Placeable.PlacementScope.d(((Placeable.PlacementScope)object0), this.Y, 0, 0);
                return t.a;
            }
            case 12: {
                Placeable.PlacementScope.d(((Placeable.PlacementScope)object0), this.Y, 0, 0);
                return t.a;
            }
            case 13: {
                Placeable.PlacementScope.d(((Placeable.PlacementScope)object0), this.Y, 0, 0);
                return t.a;
            }
            default: {
                j.f(((Placeable.PlacementScope)object0), "$this$layout");
                Placeable.PlacementScope.f(((Placeable.PlacementScope)object0), this.Y, 0, 0);
                return t.a;
            }
        }
    }
}

