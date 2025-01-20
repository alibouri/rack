package Q;

import Nb.j;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

public abstract class z {
    public static final boolean a;

    static {
        z.a = j.a(Build.DEVICE, "layoutlib");
    }

    public static final r a(ViewGroup viewGroup0) {
        int v = viewGroup0.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = viewGroup0.getChildAt(v1);
            if(view0 instanceof r) {
                return (r)view0;
            }
        }
        r r0 = new r(viewGroup0.getContext());
        viewGroup0.addView(r0);
        return r0;
    }

    public static final ViewGroup b(View view0) {
        while(!(view0 instanceof ViewGroup)) {
            ViewParent viewParent0 = view0.getParent();
            if(!(viewParent0 instanceof View)) {
                throw new IllegalArgumentException(("Couldn\'t find a valid parent for " + view0 + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            view0 = viewParent0;
        }
        return (ViewGroup)view0;
    }
}

