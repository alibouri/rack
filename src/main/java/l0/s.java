package l0;

import Bb.n;
import F0.f;
import Nb.j;
import androidx.compose.ui.node.LayoutNode;
import java.util.Arrays;
import java.util.Comparator;

public final class s implements Comparator {
    public static final s X;

    static {
        s.X = new s();  // initializer: Ljava/lang/Object;-><init>()V
    }

    @Override
    public final int compare(Object object0, Object object1) {
        if(d.s(((q)object0)) && d.s(((q)object1))) {
            LayoutNode layoutNode0 = f.v(((q)object0));
            LayoutNode layoutNode1 = f.v(((q)object1));
            if(!j.a(layoutNode0, layoutNode1)) {
                LayoutNode[] arr_layoutNode = new LayoutNode[16];
                int v1 = 0;
                while(layoutNode0 != null) {
                    if(arr_layoutNode.length < v1 + 1) {
                        arr_layoutNode = Arrays.copyOf(arr_layoutNode, Math.max(v1 + 1, arr_layoutNode.length * 2));
                        j.e(arr_layoutNode, "copyOf(this, newSize)");
                    }
                    if(v1 != 0) {
                        n.i0(1, 0, v1, arr_layoutNode, arr_layoutNode);
                    }
                    arr_layoutNode[0] = layoutNode0;
                    ++v1;
                    layoutNode0 = layoutNode0.s();
                }
                LayoutNode[] arr_layoutNode1 = new LayoutNode[16];
                int v2 = 0;
                while(layoutNode1 != null) {
                    if(arr_layoutNode1.length < v2 + 1) {
                        arr_layoutNode1 = Arrays.copyOf(arr_layoutNode1, Math.max(v2 + 1, arr_layoutNode1.length * 2));
                        j.e(arr_layoutNode1, "copyOf(this, newSize)");
                    }
                    if(v2 != 0) {
                        n.i0(1, 0, v2, arr_layoutNode1, arr_layoutNode1);
                    }
                    arr_layoutNode1[0] = layoutNode1;
                    ++v2;
                    layoutNode1 = layoutNode1.s();
                }
                int v3 = Math.min(v1 - 1, v2 - 1);
                if(v3 >= 0) {
                    for(int v = 0; true; ++v) {
                        if(!j.a(arr_layoutNode[v], arr_layoutNode1[v])) {
                            return j.h(arr_layoutNode[v].t(), arr_layoutNode1[v].t());
                        }
                        if(v == v3) {
                            break;
                        }
                    }
                }
                throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
            }
            return 0;
        }
        if(d.s(((q)object0))) {
            return -1;
        }
        return d.s(((q)object1)) ? 1 : 0;
    }
}

