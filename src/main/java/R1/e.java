package r1;

import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import o1.d;
import o1.j;
import p1.c;
import v.h;

public final class e implements c {
    public final ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final ConstraintLayout h;

    public e(ConstraintLayout constraintLayout0, ConstraintLayout constraintLayout1) {
        this.h = constraintLayout0;
        this.a = constraintLayout1;
    }

    @Override  // p1.c
    public final void a() {
        ConstraintLayout constraintLayout0 = this.a;
        int v = constraintLayout0.getChildCount();
        for(int v2 = 0; v2 < v; ++v2) {
            constraintLayout0.getChildAt(v2);
        }
        int v3 = constraintLayout0.c0.size();
        if(v3 > 0) {
            for(int v1 = 0; v1 < v3; ++v1) {
                ((b)constraintLayout0.c0.get(v1)).getClass();
            }
        }
    }

    @Override  // p1.c
    public final void b(d d0, p1.b b0) {
        int v16;
        int v15;
        int v14;
        int v22;
        int v11;
        int v7;
        if(d0 == null) {
            return;
        }
        if(d0.h0 == 8) {
            b0.e = 0;
            b0.f = 0;
            b0.g = 0;
            return;
        }
        if(d0.U == null) {
            return;
        }
        ConstraintLayout constraintLayout0 = this.h;
        constraintLayout0.getClass();
        int v = b0.a;
        int v1 = b0.b;
        int v2 = b0.c;
        int v3 = b0.d;
        int v4 = this.b + this.c;
        int v5 = this.d;
        View view0 = (View)d0.g0;
        int v6 = h.d(v);
        o1.c c0 = d0.L;
        o1.c c1 = d0.J;
        switch(v6) {
            case 0: {
                v7 = View.MeasureSpec.makeMeasureSpec(v2, 0x40000000);
                break;
            }
            case 1: {
                v7 = ViewGroup.getChildMeasureSpec(this.f, v5, -2);
                break;
            }
            case 2: {
                int v10 = ViewGroup.getChildMeasureSpec(this.f, v5, -2);
                boolean z = d0.s == 1;
                if(b0.j == 1 || b0.j == 2) {
                    boolean z1 = view0.getMeasuredHeight() == d0.l();
                    if(b0.j == 2 || !z || z1 || d0.B()) {
                        v10 = View.MeasureSpec.makeMeasureSpec(d0.r(), 0x40000000);
                    }
                }
                v7 = v10;
                break;
            }
            default: {
                if(v6 == 3) {
                    int v8 = this.f;
                    int v9 = c1 == null ? 0 : c1.g;
                    if(c0 != null) {
                        v9 += c0.g;
                    }
                    v7 = ViewGroup.getChildMeasureSpec(v8, v5 + v9, -1);
                }
                else {
                    v7 = 0;
                }
            }
        }
        switch(h.d(v1)) {
            case 0: {
                v11 = View.MeasureSpec.makeMeasureSpec(v3, 0x40000000);
                break;
            }
            case 1: {
                v11 = ViewGroup.getChildMeasureSpec(this.g, v4, -2);
                break;
            }
            case 2: {
                v11 = ViewGroup.getChildMeasureSpec(this.g, v4, -2);
                boolean z2 = d0.t == 1;
                if(b0.j == 1 || b0.j == 2) {
                    boolean z3 = view0.getMeasuredWidth() == d0.r();
                    if(b0.j == 2 || !z2 || z3 || d0.C()) {
                        v11 = View.MeasureSpec.makeMeasureSpec(d0.l(), 0x40000000);
                    }
                }
                break;
            }
            case 3: {
                int v12 = this.g;
                int v13 = c1 == null ? 0 : d0.K.g;
                if(c0 != null) {
                    v13 += d0.M.g;
                }
                v11 = ViewGroup.getChildMeasureSpec(v12, v4 + v13, -1);
                break;
            }
            default: {
                v11 = 0;
            }
        }
        o1.e e0 = d0.U;
        if(e0 != null && j.c(constraintLayout0.j0, 0x100) && view0.getMeasuredWidth() == d0.r() && view0.getMeasuredWidth() < e0.r() && view0.getMeasuredHeight() == d0.l() && view0.getMeasuredHeight() < e0.l() && view0.getBaseline() == d0.b0 && !d0.A() && e.c(d0.H, v7, d0.r()) && e.c(d0.I, v11, d0.l())) {
            b0.e = d0.r();
            b0.f = d0.l();
            b0.g = d0.b0;
            return;
        }
        boolean z4 = v == 3 && d0.X <= 0.0f;
        boolean z5 = v1 == 3 && d0.X <= 0.0f;
        if(view0 == null) {
            return;
        }
        r1.d d1 = (r1.d)view0.getLayoutParams();
        if(b0.j == 1 || b0.j == 2 || v != 3 || d0.s != 0 || v1 != 3 || d0.t != 0) {
            view0.measure(v7, v11);
            d0.H = v7;
            d0.I = v11;
            d0.g = false;
            int v17 = view0.getMeasuredWidth();
            int v18 = view0.getMeasuredHeight();
            int v19 = view0.getBaseline();
            v16 = d0.v <= 0 ? v17 : Math.max(d0.v, v17);
            int v20 = d0.w;
            if(v20 > 0) {
                v16 = Math.min(v20, v16);
            }
            int v21 = d0.y;
            if(v21 > 0) {
                v14 = Math.max(v21, v18);
                v22 = v11;
            }
            else {
                v22 = v11;
                v14 = v18;
            }
            int v23 = d0.z;
            if(v23 > 0) {
                v14 = Math.min(v23, v14);
            }
            if(!j.c(constraintLayout0.j0, 1)) {
                if(z4 && (v1 == 1 || v1 == 4)) {
                    v16 = (int)(((float)v14) * d0.X + 0.5f);
                }
                else if(z5 && (v == 1 || v == 4)) {
                    v14 = (int)(((float)v16) / d0.X + 0.5f);
                }
            }
            if(v17 != v16 || v18 != v14) {
                if(v17 != v16) {
                    v7 = View.MeasureSpec.makeMeasureSpec(v16, 0x40000000);
                }
                int v24 = v18 == v14 ? v22 : View.MeasureSpec.makeMeasureSpec(v14, 0x40000000);
                view0.measure(v7, v24);
                d0.H = v7;
                d0.I = v24;
                d0.g = false;
                int v25 = view0.getMeasuredWidth();
                v14 = view0.getMeasuredHeight();
                v16 = v25;
                v15 = view0.getBaseline();
            }
            else {
                v15 = v19;
            }
        }
        else {
            v14 = 0;
            v15 = 0;
            v16 = 0;
        }
        b0.i = v16 != b0.c || v14 != b0.d;
        boolean z6 = d1.c0 ? true : v15 != -1;
        if(z6 && v15 != -1 && d0.b0 != v15) {
            b0.i = true;
        }
        b0.e = v16;
        b0.f = v14;
        b0.h = z6;
        b0.g = v15;
    }

    public static boolean c(int v, int v1, int v2) {
        if(v == v1) {
            return true;
        }
        int v3 = View.MeasureSpec.getMode(v);
        return View.MeasureSpec.getMode(v1) == 0x40000000 && (v3 == 0x80000000 || v3 == 0) && v2 == View.MeasureSpec.getSize(v1);
    }
}

