package D0;

import Ab.t;
import Nb.k;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.functions.Function2;

public final class d0 extends k implements Function2 {
    public final int X;
    public final e0 Y;

    public d0(e0 e00, int v) {
        this.X = v;
        this.Y = e00;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        switch(this.X) {
            case 0: {
                LayoutNode layoutNode0 = (LayoutNode)object0;
                this.Y.a().Y = (CompositionContext)object1;
                return t.a;
            }
            case 1: {
                G g2 = this.Y.a();
                ((LayoutNode)object0).Y(new D(g2, ((Function2)object1), g2.n0));
                return t.a;
            }
            default: {
                e0 e00 = (e0)object1;
                G g0 = ((LayoutNode)object0).w0;
                e0 e01 = this.Y;
                if(g0 == null) {
                    g0 = new G(((LayoutNode)object0), e01.a);
                    ((LayoutNode)object0).w0 = g0;
                }
                e01.b = g0;
                e01.a().b();
                G g1 = e01.a();
                h0 h00 = e01.a;
                if(g1.Z != h00) {
                    g1.Z = h00;
                    g1.c(false);
                    LayoutNode.T(g1.X, false, 7);
                }
                return t.a;
            }
        }
    }
}

