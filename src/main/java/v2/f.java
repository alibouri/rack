package v2;

import Nb.j;
import Nb.k;
import android.view.View;
import android.view.ViewParent;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.jvm.functions.Function1;

public final class f extends k implements Function1 {
    public final int X;
    public static final f Y;
    public static final f Z;

    static {
        f.Y = new f(1, 0);
        f.Z = new f(1, 1);
    }

    public f(int v, int v1) {
        this.X = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        if(this.X != 0) {
            j.f(((View)object0), "view");
            Object object1 = ((View)object0).getTag(0x7F0A0325);  // id:view_tree_saved_state_registry_owner
            return object1 instanceof SavedStateRegistryOwner ? ((SavedStateRegistryOwner)object1) : null;
        }
        j.f(((View)object0), "view");
        ViewParent viewParent0 = ((View)object0).getParent();
        return viewParent0 instanceof View ? ((View)viewParent0) : null;
    }
}

