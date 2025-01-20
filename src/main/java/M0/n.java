package M0;

import Nb.k;
import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.functions.Function1;

public final class n extends k implements Function1 {
    public static final n X;

    static {
        n.X = new n(1);  // initializer: LNb/k;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        j j0 = ((LayoutNode)object0).o();
        return Boolean.valueOf(j0 != null && j0.Y);
    }
}

