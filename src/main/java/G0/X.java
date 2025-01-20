package G0;

import M0.o;
import a.a;
import androidx.compose.ui.node.LayoutNode;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;
import s.u;

public final class x implements Comparator {
    public final int X;
    public final Object Y;

    public x(int v, Object object0) {
        this.X = v;
        this.Y = object0;
        super();
    }

    public x(Comparator comparator0) {
        this.X = 0;
        super();
        this.Y = comparator0;
    }

    @Override
    public final int compare(Object object0, Object object1) {
        switch(this.X) {
            case 0: {
                int v1 = ((Comparator)this.Y).compare(object0, object1);
                return v1 == 0 ? LayoutNode.J0.compare(((o)object0).c, ((o)object1).c) : v1;
            }
            case 1: {
                int v2 = ((x)this.Y).compare(object0, object1);
                return v2 == 0 ? a.j(((int)((o)object0).g), ((int)((o)object1).g)) : v2;
            }
            case 2: {
                long v3 = ((Number)object0).longValue();
                Integer integer0 = ((u)this.Y).b(v3);
                long v4 = ((Number)object1).longValue();
                return a.j(integer0, ((u)this.Y).b(v4));
            }
            default: {
                int v = Boolean.valueOf(((MaterialButton)object0).o0).compareTo(Boolean.valueOf(((MaterialButton)object1).o0));
                if(v == 0) {
                    v = Boolean.valueOf(((MaterialButton)object0).isPressed()).compareTo(Boolean.valueOf(((MaterialButton)object1).isPressed()));
                    return v == 0 ? ((MaterialButtonToggleGroup)this.Y).indexOfChild(((MaterialButton)object0)).compareTo(((MaterialButtonToggleGroup)this.Y).indexOfChild(((MaterialButton)object1))) : v;
                }
                return v;
            }
        }
    }
}

