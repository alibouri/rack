package d1;

import Ab.t;
import F0.i0;
import G0.i;
import J1.N;
import Nb.k;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function1;

public final class b extends k implements Function1 {
    public final int X;
    public final o Y;
    public final LayoutNode Z;

    public b(o o0, LayoutNode layoutNode0, int v) {
        this.X = v;
        this.Y = o0;
        this.Z = layoutNode0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        switch(this.X) {
            case 0: {
                AndroidComposeView androidComposeView0 = ((i0)object0) instanceof AndroidComposeView ? ((AndroidComposeView)(((i0)object0))) : null;
                o o0 = this.Y;
                if(androidComposeView0 != null) {
                    androidComposeView0.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(o0, this.Z);
                    androidComposeView0.getAndroidViewsHandler$ui_release().addView(o0);
                    androidComposeView0.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(this.Z, o0);
                    o0.setImportantForAccessibility(1);
                    N.k(o0, new i(androidComposeView0, this.Z, androidComposeView0));
                }
                if(o0.getView().getParent() != o0) {
                    o0.addView(o0.getView());
                }
                return t.a;
            }
            case 1: {
                Placeable.PlacementScope placeable$PlacementScope0 = (Placeable.PlacementScope)object0;
                j.d(this.Y, this.Z);
                return t.a;
            }
            default: {
                LayoutCoordinates layoutCoordinates0 = (LayoutCoordinates)object0;
                j.d(this.Y, this.Z);
                ((AndroidComposeView)this.Y.d0).x0 = true;
                return t.a;
            }
        }
    }
}

