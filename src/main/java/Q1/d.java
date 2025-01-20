package Q1;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import io.sentry.config.a;
import java.util.Arrays;

public final class d {
    public int a;
    public final int b;
    public int c;
    public float[] d;
    public float[] e;
    public float[] f;
    public float[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public int k;
    public VelocityTracker l;
    public final float m;
    public final float n;
    public final int o;
    public final OverScroller p;
    public final a q;
    public View r;
    public boolean s;
    public final CoordinatorLayout t;
    public final E5.d u;
    public static final c v;

    static {
        d.v = new c(0);
    }

    public d(Context context0, CoordinatorLayout coordinatorLayout0, a a0) {
        this.c = -1;
        this.u = new E5.d(11, this);
        if(coordinatorLayout0 == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if(a0 == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.t = coordinatorLayout0;
        this.q = a0;
        ViewConfiguration viewConfiguration0 = ViewConfiguration.get(context0);
        this.o = (int)(context0.getResources().getDisplayMetrics().density * 20.0f + 0.5f);
        this.b = viewConfiguration0.getScaledTouchSlop();
        this.m = (float)viewConfiguration0.getScaledMaximumFlingVelocity();
        this.n = (float)viewConfiguration0.getScaledMinimumFlingVelocity();
        this.p = new OverScroller(context0, d.v);
    }

    public final void a() {
        this.c = -1;
        float[] arr_f = this.d;
        if(arr_f != null) {
            Arrays.fill(arr_f, 0.0f);
            Arrays.fill(this.e, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            this.k = 0;
        }
        VelocityTracker velocityTracker0 = this.l;
        if(velocityTracker0 != null) {
            velocityTracker0.recycle();
            this.l = null;
        }
    }

    public final void b(View view0, int v) {
        ViewParent viewParent0 = view0.getParent();
        CoordinatorLayout coordinatorLayout0 = this.t;
        if(viewParent0 != coordinatorLayout0) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper\'s tracked parent view (" + coordinatorLayout0 + ")");
        }
        this.r = view0;
        this.c = v;
        this.q.W(view0, v);
        this.n(1);
    }

    public final boolean c(View view0, float f, float f1) {
        if(view0 == null) {
            return false;
        }
        boolean z = this.q.P(view0) > 0;
        boolean z1 = this.q.Q() > 0;
        if(z && z1) {
            return f1 * f1 + f * f > ((float)(this.b * this.b));
        }
        return z ? Math.abs(f) > ((float)this.b) : z1 && Math.abs(f1) <= ((float)this.b);
    }

    public final void d(int v) {
        float[] arr_f = this.d;
        if(arr_f != null) {
            int v1 = this.k;
            if((v1 & 1 << v) != 0) {
                arr_f[v] = 0.0f;
                this.e[v] = 0.0f;
                this.f[v] = 0.0f;
                this.g[v] = 0.0f;
                this.h[v] = 0;
                this.i[v] = 0;
                this.j[v] = 0;
                this.k = ~(1 << v) & v1;
            }
        }
    }

    public final int e(int v, int v1, int v2) {
        if(v == 0) {
            return 0;
        }
        int v3 = this.t.getWidth();
        int v4 = Math.abs(v1);
        return v4 <= 0 ? Math.min(((int)((((float)Math.abs(v)) / ((float)v2) + 1.0f) * 256.0f)), 600) : Math.min(Math.round(Math.abs((((float)Math.sin((Math.min(1.0f, ((float)Math.abs(v)) / ((float)v3)) - 0.5f) * 0.471239f)) * ((float)(v3 / 2)) + ((float)(v3 / 2))) / ((float)v4)) * 1000.0f) * 4, 600);
    }

    public final boolean f() {
        if(this.a == 2) {
            OverScroller overScroller0 = this.p;
            boolean z = overScroller0.computeScrollOffset();
            int v = overScroller0.getCurrX();
            int v1 = overScroller0.getCurrY();
            int v2 = v - this.r.getLeft();
            int v3 = v1 - this.r.getTop();
            if(v2 != 0) {
                this.r.offsetLeftAndRight(v2);
            }
            if(v3 != 0) {
                this.r.offsetTopAndBottom(v3);
            }
            if(v2 != 0 || v3 != 0) {
                this.q.Y(this.r, v, v1);
            }
            if(z && v == overScroller0.getFinalX() && v1 == overScroller0.getFinalY()) {
                overScroller0.abortAnimation();
                z = false;
            }
            if(!z) {
                this.t.post(this.u);
            }
        }
        return this.a == 2;
    }

    public final View g(int v, int v1) {
        CoordinatorLayout coordinatorLayout0 = this.t;
        for(int v2 = coordinatorLayout0.getChildCount() - 1; v2 >= 0; --v2) {
            this.q.getClass();
            View view0 = coordinatorLayout0.getChildAt(v2);
            if(v >= view0.getLeft() && v < view0.getRight() && v1 >= view0.getTop() && v1 < view0.getBottom()) {
                return view0;
            }
        }
        return null;
    }

    public final boolean h(int v, int v1, int v2, int v3) {
        float f3;
        float f2;
        float f1;
        float f;
        int v4 = this.r.getLeft();
        int v5 = this.r.getTop();
        int v6 = v - v4;
        int v7 = v1 - v5;
        OverScroller overScroller0 = this.p;
        if(v6 == 0 && v7 == 0) {
            overScroller0.abortAnimation();
            this.n(0);
            return false;
        }
        View view0 = this.r;
        int v8 = (int)this.n;
        int v9 = (int)this.m;
        int v10 = Math.abs(v2);
        if(v10 < v8) {
            v2 = 0;
        }
        else if(v10 > v9) {
            v2 = v2 <= 0 ? -v9 : v9;
        }
        int v11 = Math.abs(v3);
        if(v11 < v8) {
            v3 = 0;
        }
        else if(v11 > v9) {
            v3 = v3 > 0 ? v9 : -v9;
        }
        int v12 = Math.abs(v6);
        int v13 = Math.abs(v7);
        int v14 = Math.abs(v2);
        int v15 = Math.abs(v3);
        int v16 = v14 + v15;
        int v17 = v12 + v13;
        if(v2 == 0) {
            f = (float)v12;
            f1 = (float)v17;
        }
        else {
            f = (float)v14;
            f1 = (float)v16;
        }
        if(v3 == 0) {
            f2 = (float)v13;
            f3 = (float)v17;
        }
        else {
            f2 = (float)v15;
            f3 = (float)v16;
        }
        overScroller0.startScroll(v4, v5, v6, v7, ((int)(((float)this.e(v7, v3, this.q.Q())) * (f2 / f3) + ((float)this.e(v6, v2, this.q.P(view0))) * (f / f1))));
        this.n(2);
        return true;
    }

    public final boolean i(int v) {
        if((this.k & 1 << v) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + v + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void j(MotionEvent motionEvent0) {
        int v = 1;
        int v1 = motionEvent0.getActionMasked();
        int v2 = motionEvent0.getActionIndex();
        if(v1 == 0) {
            this.a();
        }
        if(this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent0);
        int v3 = 0;
    alab1:
        switch(v1) {
            case 0: {
                float f8 = motionEvent0.getX();
                float f9 = motionEvent0.getY();
                int v24 = motionEvent0.getPointerId(0);
                View view2 = this.g(((int)f8), ((int)f9));
                this.l(f8, f9, v24);
                this.q(view2, v24);
                int v25 = this.h[v24];
                break;
            }
            case 1: {
                if(this.a == 1) {
                    this.k();
                }
                this.a();
                return;
            label_15:
                a a0 = this.q;
                switch(v1) {
                    case 2: {
                        if(this.a != 1) {
                            int v16 = motionEvent0.getPointerCount();
                            while(v3 < v16) {
                                int v17 = motionEvent0.getPointerId(v3);
                                if(this.i(v17)) {
                                    float f2 = motionEvent0.getX(v3);
                                    float f3 = motionEvent0.getY(v3);
                                    float f4 = f2 - this.d[v17];
                                    float f5 = f3 - this.e[v17];
                                    int v18 = this.h[v17];
                                    int v19 = this.h[v17];
                                    int v20 = this.h[v17];
                                    int v21 = this.h[v17];
                                    if(this.a == 1) {
                                        break;
                                    }
                                    View view0 = this.g(((int)f2), ((int)f3));
                                    if(!this.c(view0, f4, f5) || !this.q(view0, v17)) {
                                        goto label_79;
                                    }
                                    break;
                                }
                            label_79:
                                ++v3;
                            }
                            this.m(motionEvent0);
                            return;
                        }
                        else if(this.i(this.c)) {
                            int v8 = motionEvent0.findPointerIndex(this.c);
                            float f = motionEvent0.getX(v8);
                            float f1 = motionEvent0.getY(v8);
                            int v9 = this.c;
                            int v10 = (int)(f - this.f[v9]);
                            int v11 = (int)(f1 - this.g[v9]);
                            int v12 = this.r.getLeft() + v10;
                            int v13 = this.r.getTop() + v11;
                            int v14 = this.r.getLeft();
                            int v15 = this.r.getTop();
                            if(v10 != 0) {
                                v12 = a0.y(this.r, v12);
                                this.r.offsetLeftAndRight(v12 - v14);
                            }
                            if(v11 != 0) {
                                v13 = a0.z(this.r, v13);
                                this.r.offsetTopAndBottom(v13 - v15);
                            }
                            if(v10 != 0 || v11 != 0) {
                                a0.Y(this.r, v12, v13);
                            }
                            this.m(motionEvent0);
                            return;
                        }
                        break alab1;
                    }
                    case 3: {
                        if(this.a == 1) {
                            this.s = true;
                            a0.Z(this.r, 0.0f, 0.0f);
                            this.s = false;
                            if(this.a == 1) {
                                this.n(0);
                            }
                        }
                        this.a();
                        return;
                    }
                    case 5: {
                        int v22 = motionEvent0.getPointerId(v2);
                        float f6 = motionEvent0.getX(v2);
                        float f7 = motionEvent0.getY(v2);
                        this.l(f6, f7, v22);
                        if(this.a == 0) {
                            this.q(this.g(((int)f6), ((int)f7)), v22);
                            int v23 = this.h[v22];
                            return;
                        }
                        View view1 = this.r;
                        if(view1 != null) {
                            if(((int)f6) < view1.getLeft() || ((int)f6) >= view1.getRight() || ((int)f7) < view1.getTop() || ((int)f7) >= view1.getBottom()) {
                                v = 0;
                            }
                            v3 = v;
                        }
                        if(v3 != 0) {
                            this.q(this.r, v22);
                            return;
                        }
                        break alab1;
                    }
                    case 6: {
                        int v4 = motionEvent0.getPointerId(v2);
                        if(this.a == 1 && v4 == this.c) {
                            int v5 = motionEvent0.getPointerCount();
                            while(true) {
                                int v6 = -1;
                                if(v3 >= v5) {
                                    break;
                                }
                                int v7 = motionEvent0.getPointerId(v3);
                                if(v7 != this.c && (this.g(((int)motionEvent0.getX(v3)), ((int)motionEvent0.getY(v3))) == this.r && this.q(this.r, v7))) {
                                    v6 = this.c;
                                    break;
                                }
                                ++v3;
                            }
                            if(v6 == -1) {
                                this.k();
                            }
                        }
                        this.d(v4);
                        return;
                    }
                    default: {
                        return;
                    }
                }
            }
            default: {
                goto label_15;
            }
        }
    }

    public final void k() {
        float f = this.m;
        this.l.computeCurrentVelocity(1000, f);
        float f1 = this.l.getXVelocity(this.c);
        float f2 = this.n;
        float f3 = Math.abs(f1);
        float f4 = 0.0f;
        if(Float.compare(f3, f2) < 0) {
            f1 = 0.0f;
        }
        else if(f3 > f) {
            f1 = f1 > 0.0f ? f : -f;
        }
        float f5 = this.l.getYVelocity(this.c);
        float f6 = Math.abs(f5);
        if(f6 >= f2) {
            if(f6 > f) {
                if(f5 <= 0.0f) {
                    f = -f;
                }
                f4 = f;
            }
            else {
                f4 = f5;
            }
        }
        this.s = true;
        this.q.Z(this.r, f1, f4);
        this.s = false;
        if(this.a == 1) {
            this.n(0);
        }
    }

    public final void l(float f, float f1, int v) {
        float[] arr_f = this.d;
        int v1 = 0;
        if(arr_f == null || arr_f.length <= v) {
            float[] arr_f1 = new float[v + 1];
            float[] arr_f2 = new float[v + 1];
            float[] arr_f3 = new float[v + 1];
            float[] arr_f4 = new float[v + 1];
            int[] arr_v = new int[v + 1];
            int[] arr_v1 = new int[v + 1];
            int[] arr_v2 = new int[v + 1];
            if(arr_f != null) {
                System.arraycopy(arr_f, 0, arr_f1, 0, arr_f.length);
                System.arraycopy(this.e, 0, arr_f2, 0, this.e.length);
                System.arraycopy(this.f, 0, arr_f3, 0, this.f.length);
                System.arraycopy(this.g, 0, arr_f4, 0, this.g.length);
                System.arraycopy(this.h, 0, arr_v, 0, this.h.length);
                System.arraycopy(this.i, 0, arr_v1, 0, this.i.length);
                System.arraycopy(this.j, 0, arr_v2, 0, this.j.length);
            }
            this.d = arr_f1;
            this.e = arr_f2;
            this.f = arr_f3;
            this.g = arr_f4;
            this.h = arr_v;
            this.i = arr_v1;
            this.j = arr_v2;
        }
        float[] arr_f5 = this.d;
        this.f[v] = f;
        arr_f5[v] = f;
        float[] arr_f6 = this.e;
        this.g[v] = f1;
        arr_f6[v] = f1;
        int[] arr_v3 = this.h;
        CoordinatorLayout coordinatorLayout0 = this.t;
        int v2 = coordinatorLayout0.getLeft();
        int v3 = this.o;
        if(((int)f) < v2 + v3) {
            v1 = 1;
        }
        if(((int)f1) < coordinatorLayout0.getTop() + v3) {
            v1 |= 4;
        }
        if(((int)f) > coordinatorLayout0.getRight() - v3) {
            v1 |= 2;
        }
        if(((int)f1) > coordinatorLayout0.getBottom() - v3) {
            v1 |= 8;
        }
        arr_v3[v] = v1;
        this.k |= 1 << v;
    }

    public final void m(MotionEvent motionEvent0) {
        int v = motionEvent0.getPointerCount();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = motionEvent0.getPointerId(v1);
            if(this.i(v2)) {
                float f = motionEvent0.getX(v1);
                float f1 = motionEvent0.getY(v1);
                this.f[v2] = f;
                this.g[v2] = f1;
            }
        }
    }

    public final void n(int v) {
        this.t.removeCallbacks(this.u);
        if(this.a != v) {
            this.a = v;
            this.q.X(v);
            if(this.a == 0) {
                this.r = null;
            }
        }
    }

    public final boolean o(int v, int v1) {
        if(!this.s) {
            throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        }
        return this.h(v, v1, ((int)this.l.getXVelocity(this.c)), ((int)this.l.getYVelocity(this.c)));
    }

    public final boolean p(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        int v1 = motionEvent0.getActionIndex();
        if(v == 0) {
            this.a();
        }
        if(this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent0);
        switch(v) {
            case 0: {
                float f = motionEvent0.getX();
                float f1 = motionEvent0.getY();
                int v2 = motionEvent0.getPointerId(0);
                this.l(f, f1, v2);
                View view0 = this.g(((int)f), ((int)f1));
                if(view0 == this.r && this.a == 2) {
                    this.q(view0, v2);
                }
                int v3 = this.h[v2];
                return this.a == 1;
            }
            case 2: {
                if(this.d != null && this.e != null) {
                    int v4 = motionEvent0.getPointerCount();
                    int v5 = 0;
                    while(v5 < v4) {
                        int v6 = motionEvent0.getPointerId(v5);
                        if(this.i(v6)) {
                            float f2 = motionEvent0.getX(v5);
                            float f3 = motionEvent0.getY(v5);
                            float f4 = f2 - this.d[v6];
                            float f5 = f3 - this.e[v6];
                            View view1 = this.g(((int)f2), ((int)f3));
                            boolean z = view1 != null && this.c(view1, f4, f5);
                            if(z) {
                                int v7 = view1.getLeft();
                                int v8 = this.q.y(view1, ((int)f4) + v7);
                                int v9 = view1.getTop();
                                int v10 = this.q.z(view1, ((int)f5) + v9);
                                int v11 = this.q.P(view1);
                                int v12 = this.q.Q();
                                if(v11 != 0 && (v11 <= 0 || v8 != v7) || v12 != 0 && (v12 <= 0 || v10 != v9)) {
                                    goto label_42;
                                }
                                break;
                            }
                        label_42:
                            int v13 = this.h[v6];
                            int v14 = this.h[v6];
                            int v15 = this.h[v6];
                            int v16 = this.h[v6];
                            if(this.a != 1 && (!z || !this.q(view1, v6))) {
                                goto label_47;
                            }
                            break;
                        }
                    label_47:
                        ++v5;
                    }
                    this.m(motionEvent0);
                    return this.a == 1;
                }
                break;
            }
            case 1: 
            case 3: {
                this.a();
                return this.a == 1;
            }
            case 5: {
                int v17 = motionEvent0.getPointerId(v1);
                float f6 = motionEvent0.getX(v1);
                float f7 = motionEvent0.getY(v1);
                this.l(f6, f7, v17);
                int v18 = this.a;
                if(v18 == 0) {
                    int v19 = this.h[v17];
                    return this.a == 1;
                }
                if(v18 == 2) {
                    View view2 = this.g(((int)f6), ((int)f7));
                    if(view2 == this.r) {
                        this.q(view2, v17);
                        return this.a == 1;
                    }
                }
                break;
            }
            case 6: {
                this.d(motionEvent0.getPointerId(v1));
                return this.a == 1;
            }
            default: {
                return this.a == 1;
            }
        }
        return this.a == 1;
    }

    public final boolean q(View view0, int v) {
        if(view0 == this.r && this.c == v) {
            return true;
        }
        if(view0 != null && this.q.b0(view0, v)) {
            this.c = v;
            this.b(view0, v);
            return true;
        }
        return false;
    }
}

