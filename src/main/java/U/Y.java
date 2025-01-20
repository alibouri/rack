package u;

import Ab.t;
import B.m0;
import D0.V;
import Nb.k;
import a1.g;
import android.support.v4.media.session.a;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import kotlin.jvm.functions.Function1;
import m5.b;
import n0.U;
import p0.e;

public final class y extends k implements Function1 {
    public final int X;
    public final long Y;
    public final long Z;
    public final Object b0;
    public final Object c0;

    public y(Object object0, long v, long v1, Object object1, int v2) {
        this.X = v2;
        this.b0 = object0;
        this.Y = v;
        this.Z = v1;
        this.c0 = object1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        if(this.X != 0) {
            ((LayoutNodeDrawScope)object0).a();
            b.k(((LayoutNodeDrawScope)object0), ((U)this.b0), this.Y, this.Z, 0.0f, ((e)this.c0), 104);
            return t.a;
        }
        ((Placeable.PlacementScope)object0).getClass();
        Placeable.PlacementScope.a(((Placeable.PlacementScope)object0), ((V)this.b0));
        ((V)this.b0).Z(g.d(a.i(((int)(this.Y >> 0x20)) + ((int)(this.Z >> 0x20)), ((int)(this.Y & 0xFFFFFFFFL)) + ((int)(this.Z & 0xFFFFFFFFL))), ((V)this.b0).c0), 0.0f, ((m0)this.c0));
        return t.a;
    }
}

