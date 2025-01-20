package r6;

import G1.n;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout.BaseBehavior;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;

public abstract class b extends d {
    public n c;
    public OverScroller d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public VelocityTracker i;

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public final boolean g(CoordinatorLayout coordinatorLayout0, View view0, MotionEvent motionEvent0) {
        boolean z;
        if(this.h < 0) {
            this.h = ViewConfiguration.get(coordinatorLayout0.getContext()).getScaledTouchSlop();
        }
        if(motionEvent0.getActionMasked() == 2 && this.e) {
            int v = this.f;
            if(v == -1) {
                return false;
            }
            int v1 = motionEvent0.findPointerIndex(v);
            if(v1 == -1) {
                return false;
            }
            int v2 = (int)motionEvent0.getY(v1);
            if(Math.abs(v2 - this.g) > this.h) {
                this.g = v2;
                return true;
            }
        }
        if(motionEvent0.getActionMasked() == 0) {
            this.f = -1;
            int v3 = (int)motionEvent0.getX();
            int v4 = (int)motionEvent0.getY();
            AppBarLayout appBarLayout0 = (AppBarLayout)view0;
            WeakReference weakReference0 = ((BaseBehavior)this).p;
            if(weakReference0 == null) {
            label_24:
                z = coordinatorLayout0.o(view0, v3, v4);
            }
            else {
                View view1 = (View)weakReference0.get();
                if(view1 == null || !view1.isShown() || view1.canScrollVertically(-1)) {
                    z = false;
                    goto label_25;
                }
                goto label_24;
            }
        label_25:
            this.e = z;
            if(z) {
                this.g = v4;
                this.f = motionEvent0.getPointerId(0);
                if(this.i == null) {
                    this.i = VelocityTracker.obtain();
                }
                if(this.d != null && !this.d.isFinished()) {
                    this.d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker0 = this.i;
        if(velocityTracker0 != null) {
            velocityTracker0.addMovement(motionEvent0);
        }
        return false;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public final boolean r(CoordinatorLayout coordinatorLayout0, View view0, MotionEvent motionEvent0) {
        boolean z;
        switch(motionEvent0.getActionMasked()) {
            case 1: {
                VelocityTracker velocityTracker0 = this.i;
                if(velocityTracker0 == null) {
                    z = false;
                }
                else {
                    velocityTracker0.addMovement(motionEvent0);
                    this.i.computeCurrentVelocity(1000);
                    float f = this.i.getYVelocity(this.f);
                    int v = ((AppBarLayout)view0).getTotalScrollRange();
                    n n0 = this.c;
                    if(n0 != null) {
                        view0.removeCallbacks(n0);
                        this.c = null;
                    }
                    if(this.d == null) {
                        this.d = new OverScroller(view0.getContext());
                    }
                    this.d.fling(0, this.s(), 0, Math.round(f), 0, 0, -v, 0);
                    if(this.d.computeScrollOffset()) {
                        n n1 = new n(this, coordinatorLayout0, view0, 13);
                        this.c = n1;
                        view0.postOnAnimation(n1);
                    }
                    else {
                        ((BaseBehavior)this).z(coordinatorLayout0, ((AppBarLayout)view0));
                        if(((AppBarLayout)view0).k0) {
                            ((AppBarLayout)view0).d(((AppBarLayout)view0).e(BaseBehavior.x(coordinatorLayout0)));
                        }
                    }
                    z = true;
                }
                goto label_39;
            }
            case 2: {
                int v1 = motionEvent0.findPointerIndex(this.f);
                if(v1 == -1) {
                    return false;
                }
                int v2 = (int)motionEvent0.getY(v1);
                int v3 = this.g - v2;
                this.g = v2;
                int v4 = ((AppBarLayout)view0).getDownNestedScrollRange();
                this.v(coordinatorLayout0, view0, this.u() - v3, -v4, 0);
                z = false;
                break;
            }
            case 3: {
                z = false;
            label_39:
                this.e = false;
                this.f = -1;
                VelocityTracker velocityTracker1 = this.i;
                if(velocityTracker1 != null) {
                    velocityTracker1.recycle();
                    this.i = null;
                }
                break;
            }
            case 6: {
                int v5 = motionEvent0.getActionIndex() == 0 ? 1 : 0;
                this.f = motionEvent0.getPointerId(v5);
                this.g = (int)(motionEvent0.getY(v5) + 0.5f);
                z = false;
                break;
            }
            default: {
                z = false;
            }
        }
        VelocityTracker velocityTracker2 = this.i;
        if(velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent0);
        }
        return this.e || z;
    }

    public abstract int u();

    public abstract int v(CoordinatorLayout arg1, View arg2, int arg3, int arg4, int arg5);
}

