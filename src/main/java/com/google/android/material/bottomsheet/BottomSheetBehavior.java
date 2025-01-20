package com.google.android.material.bottomsheet;

import B6.m;
import B6.n;
import Bb.F;
import H6.f;
import J1.C;
import J1.E;
import J1.N;
import J6.b;
import K.v;
import K1.c;
import L2.h;
import Q1.d;
import S2.j;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View.AccessibilityDelegate;
import android.view.View.BaseSavedState;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import j6.z0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

public class BottomSheetBehavior extends Behavior {
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR;
        public final int Z;
        public final int b0;
        public final boolean c0;
        public final boolean d0;
        public final boolean e0;

        static {
            SavedState.CREATOR = new a();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public SavedState(Parcel parcel0, ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            this.Z = parcel0.readInt();
            this.b0 = parcel0.readInt();
            boolean z = false;
            this.c0 = parcel0.readInt() == 1;
            this.d0 = parcel0.readInt() == 1;
            if(parcel0.readInt() == 1) {
                z = true;
            }
            this.e0 = z;
        }

        public SavedState(android.view.AbsSavedState absSavedState0, BottomSheetBehavior bottomSheetBehavior0) {
            super(absSavedState0);
            this.Z = bottomSheetBehavior0.F;
            this.b0 = bottomSheetBehavior0.d;
            this.c0 = bottomSheetBehavior0.b;
            this.d0 = bottomSheetBehavior0.C;
            this.e0 = bottomSheetBehavior0.D;
        }

        @Override  // androidx.customview.view.AbsSavedState
        public final void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeInt(this.Z);
            parcel0.writeInt(this.b0);
            parcel0.writeInt(((int)this.c0));
            parcel0.writeInt(((int)this.d0));
            parcel0.writeInt(((int)this.e0));
        }
    }

    public int A;
    public final float B;
    public boolean C;
    public boolean D;
    public final boolean E;
    public int F;
    public d G;
    public boolean H;
    public int I;
    public boolean J;
    public int K;
    public int L;
    public int M;
    public WeakReference N;
    public WeakReference O;
    public final ArrayList P;
    public VelocityTracker Q;
    public int R;
    public int S;
    public boolean T;
    public HashMap U;
    public int V;
    public final u6.a W;
    public final int a;
    public boolean b;
    public final float c;
    public int d;
    public boolean e;
    public int f;
    public final int g;
    public final boolean h;
    public MaterialShapeDrawable i;
    public final int j;
    public int k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public int q;
    public int r;
    public ShapeAppearanceModel s;
    public boolean t;
    public j u;
    public final ValueAnimator v;
    public final int w;
    public int x;
    public int y;
    public final float z;

    public BottomSheetBehavior() {
        this.a = 0;
        this.b = true;
        this.j = -1;
        this.u = null;
        this.z = 0.5f;
        this.B = -1.0f;
        this.E = true;
        this.F = 4;
        this.P = new ArrayList();
        this.V = -1;
        this.W = new u6.a(this);
    }

    public BottomSheetBehavior(Context context0, AttributeSet attributeSet0) {
        this.a = 0;
        this.b = true;
        this.j = -1;
        this.u = null;
        this.z = 0.5f;
        this.B = -1.0f;
        this.E = true;
        this.F = 4;
        this.P = new ArrayList();
        this.V = -1;
        this.W = new u6.a(this);
        this.g = context0.getResources().getDimensionPixelSize(0x7F070186);  // dimen:mtrl_min_touch_target_size
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, p6.a.d);
        this.h = typedArray0.hasValue(16);
        boolean z = typedArray0.hasValue(2);
        if(z) {
            this.u(context0, attributeSet0, z, F.w(context0, typedArray0, 2));
        }
        else {
            this.u(context0, attributeSet0, z, null);
        }
        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.v = valueAnimator0;
        valueAnimator0.setDuration(500L);
        b b0 = new b(6, this);
        this.v.addUpdateListener(b0);
        this.B = typedArray0.getDimension(1, -1.0f);
        if(typedArray0.hasValue(0)) {
            this.j = typedArray0.getDimensionPixelSize(0, -1);
        }
        TypedValue typedValue0 = typedArray0.peekValue(8);
        if(typedValue0 == null || typedValue0.data != -1) {
            this.A(typedArray0.getDimensionPixelSize(8, -1));
        }
        else {
            this.A(-1);
        }
        this.z(typedArray0.getBoolean(7, false));
        this.l = typedArray0.getBoolean(11, false);
        boolean z1 = typedArray0.getBoolean(5, true);
        if(this.b != z1) {
            this.b = z1;
            if(this.N != null) {
                this.s();
            }
            this.C((!this.b || this.F != 6 ? this.F : 3));
            this.G();
        }
        this.D = typedArray0.getBoolean(10, false);
        this.E = typedArray0.getBoolean(3, true);
        this.a = typedArray0.getInt(9, 0);
        float f = typedArray0.getFloat(6, 0.5f);
        if(f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.z = f;
        if(this.N != null) {
            this.y = (int)((1.0f - f) * ((float)this.M));
        }
        TypedValue typedValue1 = typedArray0.peekValue(4);
        if(typedValue1 != null && typedValue1.type == 16) {
            int v = typedValue1.data;
            if(v < 0) {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
            this.w = v;
        }
        else {
            int v1 = typedArray0.getDimensionPixelOffset(4, 0);
            if(v1 < 0) {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
            this.w = v1;
        }
        this.m = typedArray0.getBoolean(12, false);
        this.n = typedArray0.getBoolean(13, false);
        this.o = typedArray0.getBoolean(14, false);
        this.p = typedArray0.getBoolean(15, true);
        typedArray0.recycle();
        this.c = (float)ViewConfiguration.get(context0).getScaledMaximumFlingVelocity();
    }

    public final void A(int v) {
        if(v == -1) {
            if(!this.e) {
                this.e = true;
                this.J();
            }
        }
        else if(this.e || this.d != v) {
            this.e = false;
            this.d = Math.max(0, v);
            this.J();
        }
    }

    public final void B(int v) {
        if(v == this.F) {
            return;
        }
        if(this.N == null) {
            if(v == 3 || v == 4 || v == 6 || this.C && v == 5) {
                this.F = v;
            }
            return;
        }
        View view0 = (View)this.N.get();
        if(view0 != null) {
            ViewParent viewParent0 = view0.getParent();
            if(viewParent0 != null && viewParent0.isLayoutRequested() && view0.isAttachedToWindow()) {
                view0.post(new h(this, view0, v));
                return;
            }
            this.D(view0, v);
        }
    }

    public final void C(int v) {
        if(this.F == v) {
            return;
        }
        this.F = v;
        WeakReference weakReference0 = this.N;
        if(weakReference0 == null) {
            return;
        }
        View view0 = (View)weakReference0.get();
        if(view0 == null) {
            return;
        }
        if(v == 3) {
            this.I(true);
        }
        else if(v == 4 || v == 5 || v == 6) {
            this.I(false);
        }
        this.H(v);
        for(int v1 = 0; true; ++v1) {
            ArrayList arrayList0 = this.P;
            if(v1 >= arrayList0.size()) {
                break;
            }
            ((u6.b)arrayList0.get(v1)).b(view0, v);
        }
        this.G();
    }

    public final void D(View view0, int v) {
        int v1;
        switch(v) {
            case 3: {
                v1 = this.y();
                break;
            }
            case 4: {
                v1 = this.A;
                break;
            }
            case 6: {
                v1 = this.y;
                if(this.b) {
                    int v2 = this.x;
                    if(v1 <= v2) {
                        v = 3;
                        v1 = v2;
                    }
                }
                break;
            }
            default: {
                if(!this.C || v != 5) {
                    throw new IllegalArgumentException("Illegal state argument: " + v);
                }
                v1 = this.M;
                break;
            }
        }
        this.F(view0, v, v1, false);
    }

    public final boolean E(View view0, float f) {
        if(this.D) {
            return true;
        }
        if(view0.getTop() < this.A) {
            return false;
        }
        int v = this.t();
        return Math.abs(f * 0.1f + ((float)view0.getTop()) - ((float)this.A)) / ((float)v) > 0.5f;
    }

    public final void F(View view0, int v, int v1, boolean z) {
        d d0 = this.G;
        if(d0 != null) {
            if(!z) {
                int v2 = view0.getLeft();
                d0.r = view0;
                d0.c = -1;
                boolean z1 = d0.h(v2, v1, 0, 0);
                if(!z1 && d0.a == 0 && d0.r != null) {
                    d0.r = null;
                }
                if(z1) {
                label_12:
                    this.C(2);
                    this.H(v);
                    if(this.u == null) {
                        this.u = new j(this, view0, v);
                    }
                    j j0 = this.u;
                    if(!j0.Y) {
                        j0.Z = v;
                        view0.postOnAnimation(j0);
                        this.u.Y = true;
                        return;
                    }
                    j0.Z = v;
                    return;
                }
            }
            else if(d0.o(view0.getLeft(), v1)) {
                goto label_12;
            }
        }
        this.C(v);
    }

    public final void G() {
        J1.b b1;
        int v3;
        WeakReference weakReference0 = this.N;
        if(weakReference0 == null) {
            return;
        }
        View view0 = (View)weakReference0.get();
        if(view0 == null) {
            return;
        }
        N.h(view0, 0x80000);
        N.f(view0, 0);
        N.h(view0, 0x40000);
        N.f(view0, 0);
        N.h(view0, 0x100000);
        N.f(view0, 0);
        int v = this.V;
        if(v != -1) {
            N.h(view0, v);
            N.f(view0, 0);
        }
        int v1 = 6;
        if(!this.b && this.F != 6) {
            A0.b b0 = new A0.b(6, this);
            ArrayList arrayList0 = N.d(view0);
            for(int v2 = 0; true; ++v2) {
                if(v2 >= arrayList0.size()) {
                    int v5 = -1;
                    for(int v4 = 0; v4 < 0x20 && v5 == -1; ++v4) {
                        int v6 = N.d[v4];
                        int v8 = 1;
                        for(int v7 = 0; v7 < arrayList0.size(); ++v7) {
                            v8 &= (((c)arrayList0.get(v7)).a() == v6 ? 0 : 1);
                        }
                        if(v8 != 0) {
                            v5 = v6;
                        }
                    }
                    v3 = v5;
                    break;
                }
                if(TextUtils.equals("Expand halfway", ((AccessibilityNodeInfo.AccessibilityAction)((c)arrayList0.get(v2)).a).getLabel())) {
                    v3 = ((c)arrayList0.get(v2)).a();
                    break;
                }
            }
            if(v3 != -1) {
                c c0 = new c(null, v3, "Expand halfway", b0, null);
                View.AccessibilityDelegate view$AccessibilityDelegate0 = N.c(view0);
                if(view$AccessibilityDelegate0 == null) {
                    b1 = null;
                }
                else {
                    b1 = view$AccessibilityDelegate0 instanceof J1.a ? ((J1.a)view$AccessibilityDelegate0).a : new J1.b(view$AccessibilityDelegate0);
                }
                if(b1 == null) {
                    b1 = new J1.b();
                }
                N.k(view0, b1);
                N.h(view0, c0.a());
                N.d(view0).add(c0);
                N.f(view0, 0);
            }
            this.V = v3;
        }
        if(this.C && this.F != 5) {
            A0.b b2 = new A0.b(5, this);
            N.i(view0, c.l, b2);
        }
        switch(this.F) {
            case 3: {
                if(this.b) {
                    v1 = 4;
                }
                A0.b b3 = new A0.b(v1, this);
                N.i(view0, c.k, b3);
                return;
            }
            case 4: {
                if(this.b) {
                    v1 = 3;
                }
                A0.b b4 = new A0.b(v1, this);
                N.i(view0, c.j, b4);
                return;
            }
            case 6: {
                A0.b b5 = new A0.b(4, this);
                N.i(view0, c.k, b5);
                A0.b b6 = new A0.b(3, this);
                N.i(view0, c.j, b6);
            }
        }
    }

    public final void H(int v) {
        ValueAnimator valueAnimator0 = this.v;
        if(v == 2) {
            return;
        }
        if(this.t != (v == 3)) {
            this.t = v == 3;
            if(this.i != null && valueAnimator0 != null) {
                if(valueAnimator0.isRunning()) {
                    valueAnimator0.reverse();
                    return;
                }
                float f = v == 3 ? 1.0f : 0.0f;
                valueAnimator0.setFloatValues(new float[]{1.0f - f, f});
                valueAnimator0.start();
            }
        }
    }

    public final void I(boolean z) {
        WeakReference weakReference0 = this.N;
        if(weakReference0 == null) {
            return;
        }
        ViewParent viewParent0 = ((View)weakReference0.get()).getParent();
        if(!(viewParent0 instanceof CoordinatorLayout)) {
            return;
        }
        int v = ((CoordinatorLayout)viewParent0).getChildCount();
        if(z) {
            if(this.U == null) {
                this.U = new HashMap(v);
                goto label_12;
            }
            return;
        }
    label_12:
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = ((CoordinatorLayout)viewParent0).getChildAt(v1);
            if(view0 != this.N.get() && z) {
                this.U.put(view0, view0.getImportantForAccessibility());
            }
        }
        if(!z) {
            this.U = null;
        }
    }

    public final void J() {
        if(this.N != null) {
            this.s();
            if(this.F == 4) {
                View view0 = (View)this.N.get();
                if(view0 != null) {
                    view0.requestLayout();
                }
            }
        }
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public final void c(androidx.coordinatorlayout.widget.c c0) {
        this.N = null;
        this.G = null;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public final void f() {
        this.N = null;
        this.G = null;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public final boolean g(CoordinatorLayout coordinatorLayout0, View view0, MotionEvent motionEvent0) {
        if(view0.isShown() && this.E) {
            int v = motionEvent0.getActionMasked();
            View view1 = null;
            if(v == 0) {
                this.R = -1;
                VelocityTracker velocityTracker0 = this.Q;
                if(velocityTracker0 != null) {
                    velocityTracker0.recycle();
                    this.Q = null;
                }
            }
            if(this.Q == null) {
                this.Q = VelocityTracker.obtain();
            }
            this.Q.addMovement(motionEvent0);
            switch(v) {
                case 0: {
                    int v1 = (int)motionEvent0.getX();
                    this.S = (int)motionEvent0.getY();
                    if(this.F != 2) {
                        View view2 = this.O == null ? null : ((View)this.O.get());
                        if(view2 != null && coordinatorLayout0.o(view2, v1, this.S)) {
                            this.R = motionEvent0.getPointerId(motionEvent0.getActionIndex());
                            this.T = true;
                        }
                    }
                    this.H = this.R == -1 && !coordinatorLayout0.o(view0, v1, this.S);
                    break;
                }
                case 1: {
                label_24:
                    this.T = false;
                    this.R = -1;
                    if(this.H) {
                        this.H = false;
                        return false;
                    }
                    break;
                }
                default: {
                    if(v == 3) {
                        goto label_24;
                    }
                }
            }
            if(!this.H && (this.G != null && this.G.p(motionEvent0))) {
                return true;
            }
            WeakReference weakReference0 = this.O;
            if(weakReference0 != null) {
                view1 = (View)weakReference0.get();
            }
            return v == 2 && view1 != null && !this.H && this.F != 1 && !coordinatorLayout0.o(view1, ((int)motionEvent0.getX()), ((int)motionEvent0.getY())) && this.G != null && Math.abs(((float)this.S) - motionEvent0.getY()) <= ((float)this.G.b);
        }
        this.H = true;
        return false;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public final boolean h(CoordinatorLayout coordinatorLayout0, View view0, int v) {
        int v1 = this.j;
        if(coordinatorLayout0.getFitsSystemWindows() && !view0.getFitsSystemWindows()) {
            view0.setFitsSystemWindows(true);
        }
        if(this.N == null) {
            this.f = coordinatorLayout0.getResources().getDimensionPixelSize(0x7F070086);  // dimen:design_bottom_sheet_peek_height_min
            boolean z = Build.VERSION.SDK_INT >= 29 && !this.l && !this.e;
            if(this.m || this.n || this.o || z) {
                F1.c c0 = new F1.c(z, this);
                int v2 = view0.getPaddingStart();
                view0.getPaddingTop();
                int v3 = view0.getPaddingEnd();
                int v4 = view0.getPaddingBottom();
                n n0 = new n();  // initializer: Ljava/lang/Object;-><init>()V
                n0.a = v2;
                n0.b = v3;
                n0.c = v4;
                E.k(view0, new v(c0, 1, n0));
                if(view0.isAttachedToWindow()) {
                    C.c(view0);
                }
                else {
                    view0.addOnAttachStateChangeListener(new m(0));
                }
            }
            this.N = new WeakReference(view0);
            if(this.h) {
                MaterialShapeDrawable materialShapeDrawable0 = this.i;
                if(materialShapeDrawable0 != null) {
                    view0.setBackground(materialShapeDrawable0);
                }
            }
            MaterialShapeDrawable materialShapeDrawable1 = this.i;
            if(materialShapeDrawable1 != null) {
                materialShapeDrawable1.i((this.B == -1.0f ? E.e(view0) : this.B));
                this.t = this.F == 3;
                MaterialShapeDrawable materialShapeDrawable2 = this.i;
                float f = this.F == 3 ? 1.0f : 0.0f;
                f f1 = materialShapeDrawable2.X;
                if(f1.i != f) {
                    f1.i = f;
                    materialShapeDrawable2.c0 = true;
                    materialShapeDrawable2.invalidateSelf();
                }
            }
            this.G();
            if(view0.getImportantForAccessibility() == 0) {
                view0.setImportantForAccessibility(1);
            }
            if(view0.getMeasuredWidth() > v1 && v1 != -1) {
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
                viewGroup$LayoutParams0.width = v1;
                view0.post(new z0(view0, 22, viewGroup$LayoutParams0));
            }
        }
        if(this.G == null) {
            this.G = new d(coordinatorLayout0.getContext(), coordinatorLayout0, this.W);
        }
        int v5 = view0.getTop();
        coordinatorLayout0.q(view0, v);
        this.L = coordinatorLayout0.getWidth();
        this.M = coordinatorLayout0.getHeight();
        int v6 = view0.getHeight();
        this.K = v6;
        int v7 = this.M;
        int v8 = this.r;
        if(v7 - v6 < v8) {
            this.K = this.p ? v7 : v7 - v8;
        }
        this.x = Math.max(0, v7 - this.K);
        this.y = (int)((1.0f - this.z) * ((float)this.M));
        this.s();
        int v9 = this.F;
        if(v9 == 3) {
            view0.offsetTopAndBottom(this.y());
        }
        else if(v9 == 6) {
            view0.offsetTopAndBottom(this.y);
        }
        else if(!this.C || v9 != 5) {
            switch(v9) {
                case 1: 
                case 2: {
                    view0.offsetTopAndBottom(v5 - view0.getTop());
                    break;
                }
                case 4: {
                    view0.offsetTopAndBottom(this.A);
                }
            }
        }
        else {
            view0.offsetTopAndBottom(this.M);
        }
        this.O = new WeakReference(BottomSheetBehavior.w(view0));
        return true;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public final boolean j(View view0) {
        return this.O != null && view0 == this.O.get() && this.F != 3;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public final void k(CoordinatorLayout coordinatorLayout0, View view0, View view1, int v, int v1, int[] arr_v, int v2) {
        boolean z = this.E;
        if(v2 == 1) {
            return;
        }
        if(view1 != (this.O == null ? null : ((View)this.O.get()))) {
            return;
        }
        int v3 = view0.getTop();
        int v4 = v3 - v1;
        if(v1 <= 0) {
            if(v1 < 0 && !view1.canScrollVertically(-1)) {
                int v6 = this.A;
                if(v4 <= v6 || this.C) {
                    if(!z) {
                        return;
                    }
                    arr_v[1] = v1;
                    view0.offsetTopAndBottom(-v1);
                    this.C(1);
                }
                else {
                    int v7 = v3 - v6;
                    arr_v[1] = v7;
                    view0.offsetTopAndBottom(-v7);
                    this.C(4);
                }
            }
        }
        else if(v4 < this.y()) {
            int v5 = v3 - this.y();
            arr_v[1] = v5;
            view0.offsetTopAndBottom(-v5);
            this.C(3);
        }
        else {
            if(!z) {
                return;
            }
            arr_v[1] = v1;
            view0.offsetTopAndBottom(-v1);
            this.C(1);
        }
        this.v(view0.getTop());
        this.I = v1;
        this.J = true;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public final void l(CoordinatorLayout coordinatorLayout0, View view0, int v, int v1, int v2, int[] arr_v) {
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public final void n(View view0, Parcelable parcelable0) {
        int v = this.a;
        if(v != 0) {
            if(v == -1 || (v & 1) == 1) {
                this.d = ((SavedState)parcelable0).b0;
            }
            if(v == -1 || (v & 2) == 2) {
                this.b = ((SavedState)parcelable0).c0;
            }
            if(v == -1 || (v & 4) == 4) {
                this.C = ((SavedState)parcelable0).d0;
            }
            if(v == -1 || (v & 8) == 8) {
                this.D = ((SavedState)parcelable0).e0;
            }
        }
        int v1 = ((SavedState)parcelable0).Z;
        if(v1 != 1 && v1 != 2) {
            this.F = v1;
            return;
        }
        this.F = 4;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public final Parcelable o(View view0) {
        return new SavedState(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public final boolean p(CoordinatorLayout coordinatorLayout0, View view0, View view1, int v, int v1) {
        this.I = 0;
        this.J = false;
        return (v & 2) != 0;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public final void q(CoordinatorLayout coordinatorLayout0, View view0, View view1, int v) {
        int v2;
        float f;
        int v1 = 3;
        if(view0.getTop() == this.y()) {
            this.C(3);
            return;
        }
        if(this.O != null && view1 == this.O.get() && this.J) {
            if(this.I <= 0) {
                if(this.C) {
                    VelocityTracker velocityTracker0 = this.Q;
                    if(velocityTracker0 == null) {
                        f = 0.0f;
                    }
                    else {
                        velocityTracker0.computeCurrentVelocity(1000, this.c);
                        f = this.Q.getYVelocity(this.R);
                    }
                    if(this.E(view0, f)) {
                        v2 = this.M;
                        v1 = 5;
                        this.F(view0, v1, v2, false);
                        this.J = false;
                        return;
                    }
                    goto label_28;
                }
                else {
                label_28:
                    if(this.I == 0) {
                        int v5 = view0.getTop();
                        if(!this.b) {
                            int v6 = this.y;
                            if(v5 >= v6) {
                                if(Math.abs(v5 - v6) < Math.abs(v5 - this.A)) {
                                    v2 = this.y;
                                    v1 = 6;
                                }
                                else {
                                    v2 = this.A;
                                    v1 = 4;
                                }
                            }
                            else if(v5 < Math.abs(v5 - this.A)) {
                                v2 = this.y();
                            }
                            else {
                                v2 = this.y;
                                v1 = 6;
                            }
                        }
                        else if(Math.abs(v5 - this.x) < Math.abs(v5 - this.A)) {
                            v2 = this.x;
                        }
                        else {
                            v2 = this.A;
                            v1 = 4;
                        }
                    }
                    else if(this.b) {
                        v2 = this.A;
                        v1 = 4;
                    }
                    else {
                        int v7 = view0.getTop();
                        if(Math.abs(v7 - this.y) < Math.abs(v7 - this.A)) {
                            v2 = this.y;
                            v1 = 6;
                        }
                        else {
                            v2 = this.A;
                            v1 = 4;
                        }
                    }
                }
            }
            else if(this.b) {
                v2 = this.x;
            }
            else {
                int v3 = view0.getTop();
                int v4 = this.y;
                if(v3 > v4) {
                    v1 = 6;
                    v2 = v4;
                }
                else {
                    v2 = this.y();
                }
            }
            this.F(view0, v1, v2, false);
            this.J = false;
        }
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public final boolean r(CoordinatorLayout coordinatorLayout0, View view0, MotionEvent motionEvent0) {
        if(!view0.isShown()) {
            return false;
        }
        int v = motionEvent0.getActionMasked();
        if(this.F == 1 && v == 0) {
            return true;
        }
        d d0 = this.G;
        if(d0 != null) {
            d0.j(motionEvent0);
        }
        if(v == 0) {
            this.R = -1;
            VelocityTracker velocityTracker0 = this.Q;
            if(velocityTracker0 != null) {
                velocityTracker0.recycle();
                this.Q = null;
            }
        }
        if(this.Q == null) {
            this.Q = VelocityTracker.obtain();
        }
        this.Q.addMovement(motionEvent0);
        if(this.G != null && v == 2 && !this.H) {
            float f = Math.abs(((float)this.S) - motionEvent0.getY());
            d d1 = this.G;
            if(f > ((float)d1.b)) {
                d1.b(view0, motionEvent0.getPointerId(motionEvent0.getActionIndex()));
            }
        }
        return !this.H;
    }

    public final void s() {
        int v = this.t();
        if(this.b) {
            this.A = Math.max(this.M - v, this.x);
            return;
        }
        this.A = this.M - v;
    }

    public final int t() {
        if(this.e) {
            return Math.min(Math.max(this.f, this.M - this.L * 9 / 16), this.K) + this.q;
        }
        if(!this.l && !this.m) {
            return this.k <= 0 ? this.d + this.q : Math.max(this.d, this.k + this.g);
        }
        return this.d + this.q;
    }

    public final void u(Context context0, AttributeSet attributeSet0, boolean z, ColorStateList colorStateList0) {
        if(this.h) {
            this.s = ShapeAppearanceModel.b(context0, attributeSet0, 0x7F04007B, 0x7F1302CE).a();  // attr:bottomSheetStyle
            MaterialShapeDrawable materialShapeDrawable0 = new MaterialShapeDrawable(this.s);
            this.i = materialShapeDrawable0;
            materialShapeDrawable0.h(context0);
            if(z && colorStateList0 != null) {
                this.i.j(colorStateList0);
                return;
            }
            TypedValue typedValue0 = new TypedValue();
            context0.getTheme().resolveAttribute(0x1010031, typedValue0, true);
            this.i.setTint(typedValue0.data);
        }
    }

    public final void v(int v) {
        View view0 = (View)this.N.get();
        if(view0 != null) {
            ArrayList arrayList0 = this.P;
            if(!arrayList0.isEmpty()) {
                for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
                    ((u6.b)arrayList0.get(v1)).a(view0);
                }
            }
        }
    }

    public static View w(View view0) {
        if(E.g(view0)) {
            return view0;
        }
        if(view0 instanceof ViewGroup) {
            int v = ((ViewGroup)view0).getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                View view1 = BottomSheetBehavior.w(((ViewGroup)view0).getChildAt(v1));
                if(view1 != null) {
                    return view1;
                }
            }
        }
        return null;
    }

    public static BottomSheetBehavior x(View view0) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        if(!(viewGroup$LayoutParams0 instanceof androidx.coordinatorlayout.widget.c)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        Behavior coordinatorLayout$Behavior0 = ((androidx.coordinatorlayout.widget.c)viewGroup$LayoutParams0).a;
        if(!(coordinatorLayout$Behavior0 instanceof BottomSheetBehavior)) {
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        return (BottomSheetBehavior)coordinatorLayout$Behavior0;
    }

    public final int y() {
        if(this.b) {
            return this.x;
        }
        return this.p ? Math.max(this.w, 0) : Math.max(this.w, this.r);
    }

    public final void z(boolean z) {
        if(this.C != z) {
            this.C = z;
            if(!z && this.F == 5) {
                this.B(4);
            }
            this.G();
        }
    }
}

