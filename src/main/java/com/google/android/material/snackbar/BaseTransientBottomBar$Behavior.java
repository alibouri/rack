package com.google.android.material.snackbar;

import H6.e;
import I6.b;
import I6.d;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

public class BaseTransientBottomBar.Behavior extends SwipeDismissBehavior {
    public final e g;

    public BaseTransientBottomBar.Behavior() {
        e e0 = new e(4);
        this.d = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.e = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.c = 0;
        this.g = e0;
    }

    @Override  // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean g(CoordinatorLayout coordinatorLayout0, View view0, MotionEvent motionEvent0) {
        this.g.getClass();
        switch(motionEvent0.getActionMasked()) {
            case 0: {
                if(coordinatorLayout0.o(view0, ((int)motionEvent0.getX()), ((int)motionEvent0.getY())) && d.b == null) {
                    d.b = new d();
                    return super.g(coordinatorLayout0, view0, motionEvent0);
                }
                break;
            }
            case 1: 
            case 3: {
                if(d.b == null) {
                    d.b = new d();
                    return super.g(coordinatorLayout0, view0, motionEvent0);
                }
                break;
            }
            default: {
                return super.g(coordinatorLayout0, view0, motionEvent0);
            }
        }
        return super.g(coordinatorLayout0, view0, motionEvent0);
    }

    @Override  // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean s(View view0) {
        this.g.getClass();
        return view0 instanceof b;
    }
}

