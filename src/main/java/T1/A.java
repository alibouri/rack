package t1;

import android.view.View;
import android.view.ViewGroup.OnHierarchyChangeListener;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public final class a implements ViewGroup.OnHierarchyChangeListener {
    public final CoordinatorLayout a;

    public a(CoordinatorLayout coordinatorLayout0) {
        this.a = coordinatorLayout0;
    }

    @Override  // android.view.ViewGroup$OnHierarchyChangeListener
    public final void onChildViewAdded(View view0, View view1) {
        ViewGroup.OnHierarchyChangeListener viewGroup$OnHierarchyChangeListener0 = this.a.r0;
        if(viewGroup$OnHierarchyChangeListener0 != null) {
            viewGroup$OnHierarchyChangeListener0.onChildViewAdded(view0, view1);
        }
    }

    @Override  // android.view.ViewGroup$OnHierarchyChangeListener
    public final void onChildViewRemoved(View view0, View view1) {
        this.a.p(2);
        ViewGroup.OnHierarchyChangeListener viewGroup$OnHierarchyChangeListener0 = this.a.r0;
        if(viewGroup$OnHierarchyChangeListener0 != null) {
            viewGroup$OnHierarchyChangeListener0.onChildViewRemoved(view0, view1);
        }
    }
}

