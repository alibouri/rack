package d1;

import F0.i0;
import Nb.k;
import U.n;
import android.content.Context;
import android.view.View;
import d0.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

public final class l extends k implements Function0 {
    public final Context X;
    public final Function1 Y;
    public final n Z;
    public final j b0;
    public final int c0;
    public final View d0;

    public l(Context context0, Function1 function10, n n0, j j0, int v, View view0) {
        this.X = context0;
        this.Y = function10;
        this.Z = n0;
        this.b0 = j0;
        this.c0 = v;
        this.d0 = view0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Nb.j.d(this.d0, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
        return new o(this.X, this.Y, this.Z, this.b0, this.c0, ((i0)this.d0)).getLayoutNode();
    }
}

