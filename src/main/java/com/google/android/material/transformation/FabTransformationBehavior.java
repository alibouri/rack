package com.google.android.material.transformation;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.c;

@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public FabTransformationBehavior() {
        new Rect();
        new RectF();
        new RectF();
    }

    public FabTransformationBehavior(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        new Rect();
        new RectF();
        new RectF();
    }

    @Override  // com.google.android.material.transformation.ExpandableBehavior
    public final boolean b(View view0, View view1) {
        if(view0.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        return false;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public final void c(c c0) {
        if(c0.h == 0) {
            c0.h = 80;
        }
    }
}

