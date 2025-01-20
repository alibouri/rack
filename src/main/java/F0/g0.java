package F0;

import Nb.j;
import androidx.compose.ui.node.LayoutNode;
import java.util.Comparator;

public final class g0 implements Comparator {
    public final int X;
    public static final g0 Y;

    static {
        g0.Y = new g0(0);
    }

    public g0(int v) {
        this.X = v;
        super();
    }

    @Override
    public final int compare(Object object0, Object object1) {
        if(this.X != 0) {
            int v = j.h(((LayoutNode)object0).i0, ((LayoutNode)object1).i0);
            return v == 0 ? j.h(((LayoutNode)object0).hashCode(), ((LayoutNode)object1).hashCode()) : v;
        }
        int v1 = j.h(((LayoutNode)object1).i0, ((LayoutNode)object0).i0);
        return v1 == 0 ? j.h(((LayoutNode)object0).hashCode(), ((LayoutNode)object1).hashCode()) : v1;
    }
}

