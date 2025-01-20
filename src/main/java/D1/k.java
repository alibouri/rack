package d1;

import Ab.e;
import Ab.t;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.a;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class k extends Nb.k implements Function2 {
    public final int X;
    public static final k Y;
    public static final k Z;
    public static final k b0;
    public static final k c0;
    public static final k d0;
    public static final k e0;
    public static final k f0;

    static {
        k.Y = new k(2, 0);
        k.Z = new k(2, 1);
        k.b0 = new k(2, 2);
        k.c0 = new k(2, 3);
        k.d0 = new k(2, 4);
        k.e0 = new k(2, 5);
        k.f0 = new k(2, 6);
    }

    public k(int v, int v1) {
        this.X = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        switch(this.X) {
            case 0: {
                a.c(((LayoutNode)object0)).setUpdateBlock(((Function1)object1));
                return t.a;
            }
            case 1: {
                a.c(((LayoutNode)object0)).setReleaseBlock(((Function1)object1));
                return t.a;
            }
            case 2: {
                a.c(((LayoutNode)object0)).setModifier(((Modifier)object1));
                return t.a;
            }
            case 3: {
                a.c(((LayoutNode)object0)).setDensity(((Density)object1));
                return t.a;
            }
            case 4: {
                a.c(((LayoutNode)object0)).setLifecycleOwner(((LifecycleOwner)object1));
                return t.a;
            }
            case 5: {
                a.c(((LayoutNode)object0)).setSavedStateRegistryOwner(((SavedStateRegistryOwner)object1));
                return t.a;
            }
            default: {
                int v = 1;
                o o0 = a.c(((LayoutNode)object0));
                int v1 = ((LayoutDirection)object1).ordinal();
                if(v1 == 0) {
                    v = 0;
                }
                else if(v1 != 1) {
                    throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                }
                o0.setLayoutDirection(v);
                return t.a;
            }
        }
    }
}

