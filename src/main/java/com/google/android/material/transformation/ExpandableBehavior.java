package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;

@Deprecated
public abstract class ExpandableBehavior extends Behavior {
    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context0, AttributeSet attributeSet0) {
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public abstract boolean b(View arg1, View arg2);

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public final boolean d(View view0, View view1) {
        view1.getClass();
        throw new ClassCastException();
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public final boolean h(CoordinatorLayout coordinatorLayout0, View view0, int v) {
        if(!view0.isLaidOut()) {
            ArrayList arrayList0 = coordinatorLayout0.j(view0);
            int v1 = arrayList0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                this.b(view0, ((View)arrayList0.get(v2)));
            }
        }
        return false;
    }
}

