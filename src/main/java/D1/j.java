package d1;

import F0.f;
import F0.t;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.node.LayoutNode;
import g0.n;
import m0.b;
import m0.c;

public abstract class j {
    public static final i a;

    static {
        j.a = new i();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public static final boolean a(View view0, View view1) {
        for(ViewParent viewParent0 = view1.getParent(); viewParent0 != null; viewParent0 = viewParent0.getParent()) {
            if(viewParent0 == view0.getParent()) {
                return true;
            }
        }
        return false;
    }

    public static final Rect b(FocusOwner focusOwner0, View view0, View view1) {
        int[] arr_v = new int[2];
        view0.getLocationOnScreen(arr_v);
        int[] arr_v1 = new int[2];
        view1.getLocationOnScreen(arr_v1);
        c c0 = focusOwner0.c();
        if(c0 == null) {
            return null;
        }
        int v = arr_v[0];
        int v1 = arr_v1[0];
        int v2 = arr_v[1];
        return new Rect(((int)c0.a) + v - v1, ((int)c0.b) + v2 - arr_v1[1], ((int)c0.c) + v - v1, ((int)c0.d) + v2 - arr_v1[1]);
    }

    public static final View c(n n0) {
        o o0 = f.v(n0.X).h0;
        View view0 = o0 == null ? null : o0.getInteropView();
        if(view0 == null) {
            throw new IllegalStateException("Could not fetch interop view");
        }
        return view0;
    }

    public static final void d(o o0, LayoutNode layoutNode0) {
        long v = ((t)layoutNode0.u0.c).F(0L);
        int v1 = Math.round(b.d(v));
        int v2 = Math.round(b.e(v));
        o0.layout(v1, v2, o0.getMeasuredWidth() + v1, o0.getMeasuredHeight() + v2);
    }
}

