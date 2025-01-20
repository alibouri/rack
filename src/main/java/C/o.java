package c;

import Nb.j;
import Nb.k;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.functions.Function1;

public final class O extends k implements Function1 {
    public final int X;
    public static final O Y;
    public static final O Z;
    public static final O b0;

    static {
        O.Y = new O(1, 0);
        O.Z = new O(1, 1);
        O.b0 = new O(1, 2);
    }

    public O(int v, int v1) {
        this.X = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        switch(this.X) {
            case 0: {
                j.f(((Resources)object0), "resources");
                return (((Resources)object0).getConfiguration().uiMode & 0x30) == 0x20 ? Boolean.valueOf(true) : Boolean.valueOf(false);
            }
            case 1: {
                j.f(((View)object0), "it");
                ViewParent viewParent0 = ((View)object0).getParent();
                return viewParent0 instanceof View ? ((View)viewParent0) : null;
            }
            default: {
                j.f(((View)object0), "it");
                Object object1 = ((View)object0).getTag(0x7F0A0324);  // id:view_tree_on_back_pressed_dispatcher_owner
                return object1 instanceof N ? ((N)object1) : null;
            }
        }
    }
}

