package com.google.android.material.behavior;

import J1.N;
import K1.c;
import Q1.d;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import g3.b;
import s6.a;

public class SwipeDismissBehavior extends Behavior {
    public d a;
    public boolean b;
    public int c;
    public float d;
    public float e;
    public final a f;

    public SwipeDismissBehavior() {
        this.c = 2;
        this.d = 0.0f;
        this.e = 0.5f;
        this.f = new a(this);
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean g(CoordinatorLayout coordinatorLayout0, View view0, MotionEvent motionEvent0) {
        boolean z = this.b;
        switch(motionEvent0.getActionMasked()) {
            case 0: {
                z = coordinatorLayout0.o(view0, ((int)motionEvent0.getX()), ((int)motionEvent0.getY()));
                this.b = z;
                break;
            }
            case 1: 
            case 3: {
                this.b = false;
            }
        }
        if(z) {
            if(this.a == null) {
                this.a = new d(coordinatorLayout0.getContext(), coordinatorLayout0, this.f);
            }
            return this.a.p(motionEvent0);
        }
        return false;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public final boolean h(CoordinatorLayout coordinatorLayout0, View view0, int v) {
        if(view0.getImportantForAccessibility() == 0) {
            view0.setImportantForAccessibility(1);
            N.h(view0, 0x100000);
            N.f(view0, 0);
            if(this.s(view0)) {
                b b0 = new b(14, this);
                N.i(view0, c.l, b0);
            }
        }
        return false;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public final boolean r(CoordinatorLayout coordinatorLayout0, View view0, MotionEvent motionEvent0) {
        d d0 = this.a;
        if(d0 != null) {
            d0.j(motionEvent0);
            return true;
        }
        return false;
    }

    public boolean s(View view0) {
        return true;
    }
}

