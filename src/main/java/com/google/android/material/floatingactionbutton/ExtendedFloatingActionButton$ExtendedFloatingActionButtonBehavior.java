package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.c;
import p6.a;

public class ExtendedFloatingActionButton.ExtendedFloatingActionButtonBehavior extends Behavior {
    public ExtendedFloatingActionButton.ExtendedFloatingActionButtonBehavior() {
    }

    public ExtendedFloatingActionButton.ExtendedFloatingActionButtonBehavior(Context context0, AttributeSet attributeSet0) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, a.i);
        typedArray0.getBoolean(0, false);
        typedArray0.getBoolean(1, true);
        typedArray0.recycle();
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public final boolean a(View view0) {
        throw new ClassCastException();
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public final void c(c c0) {
        if(c0.h == 0) {
            c0.h = 80;
        }
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public final boolean d(View view0, View view1) {
        throw new ClassCastException();
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public final boolean h(CoordinatorLayout coordinatorLayout0, View view0, int v) {
        throw new ClassCastException();
    }
}

