package r0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import n0.d;
import n0.t;

public abstract class a extends ViewGroup {
    public final void a(t t0, View view0, long v) {
        super.drawChild(d.a(t0), view0, v);
    }

    @Override  // android.view.View
    public final void forceLayout() {
    }

    @Override  // android.view.ViewGroup
    public int getChildCount() {
        return 0;
    }

    @Override  // android.view.ViewGroup
    public final ViewParent invalidateChildInParent(int[] arr_v, Rect rect0) {
        return null;
    }

    @Override  // android.view.ViewGroup
    public final void onLayout(boolean z, int v, int v1, int v2, int v3) {
    }

    @Override  // android.view.View
    public final void onMeasure(int v, int v1) {
        this.setMeasuredDimension(0, 0);
    }

    @Override  // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }
}

