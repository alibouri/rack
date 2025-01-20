package d1;

import Ab.t;
import Nb.k;
import android.util.SparseArray;
import kotlin.jvm.functions.Function0;

public final class g extends k implements Function0 {
    public final int X;
    public final o Y;

    public g(o o0, int v) {
        this.X = v;
        this.Y = o0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.X) {
            case 0: {
                this.Y.getLayoutNode().z();
                return t.a;
            }
            case 1: {
                o o0 = this.Y;
                if(o0.f0 && o0.isAttachedToWindow() && o0.getView().getParent() == o0) {
                    h.j(o0).a(o0, a.Y, o0.getUpdate());
                }
                return t.a;
            }
            case 2: {
                Object object0 = new SparseArray();
                this.Y.x0.saveHierarchyState(((SparseArray)object0));
                return object0;
            }
            case 3: {
                this.Y.getReleaseBlock().n(this.Y.x0);
                o.l(this.Y);
                return t.a;
            }
            case 4: {
                this.Y.getResetBlock().n(this.Y.x0);
                return t.a;
            }
            default: {
                this.Y.getUpdateBlock().n(this.Y.x0);
                return t.a;
            }
        }
    }
}

