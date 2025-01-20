package com.google.android.material.behavior;

import J1.U;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import q6.a;

public class HideBottomViewOnScrollBehavior extends Behavior {
    public int a;
    public int b;
    public ViewPropertyAnimator c;

    public HideBottomViewOnScrollBehavior() {
        this.a = 0;
        this.b = 2;
    }

    public HideBottomViewOnScrollBehavior(Context context0, AttributeSet attributeSet0) {
        this.a = 0;
        this.b = 2;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean h(CoordinatorLayout coordinatorLayout0, View view0, int v) {
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
        this.a = view0.getMeasuredHeight() + viewGroup$MarginLayoutParams0.bottomMargin;
        return false;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public final void l(CoordinatorLayout coordinatorLayout0, View view0, int v, int v1, int v2, int[] arr_v) {
        if(v > 0) {
            if(this.b != 1) {
                ViewPropertyAnimator viewPropertyAnimator0 = this.c;
                if(viewPropertyAnimator0 != null) {
                    viewPropertyAnimator0.cancel();
                    view0.clearAnimation();
                }
                this.b = 1;
                int v3 = this.a;
                this.c = view0.animate().translationY(((float)v3)).setInterpolator(a.c).setDuration(0xAFL).setListener(new U(4, this));
            }
        }
        else if(v < 0 && this.b != 2) {
            ViewPropertyAnimator viewPropertyAnimator1 = this.c;
            if(viewPropertyAnimator1 != null) {
                viewPropertyAnimator1.cancel();
                view0.clearAnimation();
            }
            this.b = 2;
            this.c = view0.animate().translationY(0.0f).setInterpolator(a.d).setDuration(0xE1L).setListener(new U(4, this));
        }
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean p(CoordinatorLayout coordinatorLayout0, View view0, View view1, int v, int v1) {
        return v == 2;
    }
}

