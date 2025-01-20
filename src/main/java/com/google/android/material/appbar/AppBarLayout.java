package com.google.android.material.appbar;

import Bb.q;
import J1.E;
import J1.N;
import K1.c;
import U0.l;
import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.a;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.shape.MaterialShapeDrawable;
import hb.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import n0.y;
import r6.b;
import r6.e;
import s.J;

public class AppBarLayout extends LinearLayout implements a {
    public static class BaseBehavior extends b {
        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator CREATOR;
            public int Z;
            public float b0;
            public boolean c0;

            static {
                SavedState.CREATOR = new d();  // initializer: Ljava/lang/Object;-><init>()V
            }

            public SavedState(Parcel parcel0, ClassLoader classLoader0) {
                super(parcel0, classLoader0);
                this.Z = parcel0.readInt();
                this.b0 = parcel0.readFloat();
                this.c0 = parcel0.readByte() != 0;
            }

            @Override  // androidx.customview.view.AbsSavedState
            public final void writeToParcel(Parcel parcel0, int v) {
                super.writeToParcel(parcel0, v);
                parcel0.writeInt(this.Z);
                parcel0.writeFloat(this.b0);
                parcel0.writeByte(((byte)this.c0));
            }
        }

        public int j;
        public int k;
        public ValueAnimator l;
        public int m;
        public boolean n;
        public float o;
        public WeakReference p;

        public BaseBehavior() {
            this.f = -1;
            this.h = -1;
            this.m = -1;
        }

        public BaseBehavior(Context context0, AttributeSet attributeSet0) {
            super(0);
            this.f = -1;
            this.h = -1;
            this.m = -1;
        }

        public final void A(CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0) {
            c c0 = c.h;
            N.h(coordinatorLayout0, c0.a());
            N.f(coordinatorLayout0, 0);
            c c1 = c.i;
            N.h(coordinatorLayout0, c1.a());
            N.f(coordinatorLayout0, 0);
            View view0 = BaseBehavior.x(coordinatorLayout0);
            if(view0 == null || appBarLayout0.getTotalScrollRange() == 0 || !(((androidx.coordinatorlayout.widget.c)view0.getLayoutParams()).a instanceof ScrollingViewBehavior)) {
                return;
            }
            if(this.u() != -appBarLayout0.getTotalScrollRange() && view0.canScrollVertically(1)) {
                N.i(coordinatorLayout0, c0, new com.google.android.material.appbar.c(appBarLayout0, false));
            }
            if(this.u() != 0) {
                if(view0.canScrollVertically(-1)) {
                    int v = appBarLayout0.getDownNestedPreScrollRange();
                    if(-v != 0) {
                        N.i(coordinatorLayout0, c1, new com.google.android.material.appbar.b(this, coordinatorLayout0, appBarLayout0, view0, -v));
                    }
                }
                else {
                    N.i(coordinatorLayout0, c1, new com.google.android.material.appbar.c(appBarLayout0, true));
                }
            }
        }

        public static void B(CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0, int v, int v1, boolean z) {
            boolean z1;
            View view0;
            int v2 = Math.abs(v);
            int v3 = appBarLayout0.getChildCount();
            for(int v5 = 0; true; ++v5) {
                view0 = null;
                if(v5 >= v3) {
                    break;
                }
                View view1 = appBarLayout0.getChildAt(v5);
                if(v2 >= view1.getTop() && v2 <= view1.getBottom()) {
                    view0 = view1;
                    break;
                }
            }
            if(view0 != null) {
                int v6 = ((r6.a)view0.getLayoutParams()).a;
                if((v6 & 1) == 0) {
                    z1 = false;
                }
                else {
                    int v7 = view0.getMinimumHeight();
                    if(v1 <= 0 || (v6 & 12) == 0) {
                        z1 = (v6 & 2) == 0 || -v < view0.getBottom() - v7 - appBarLayout0.getTopInset() ? false : true;
                    }
                    else if(-v >= view0.getBottom() - v7 - appBarLayout0.getTopInset()) {
                        z1 = true;
                    }
                    else {
                        z1 = false;
                    }
                }
                if(appBarLayout0.k0) {
                    z1 = appBarLayout0.e(BaseBehavior.x(coordinatorLayout0));
                }
                boolean z2 = appBarLayout0.d(z1);
                if(z) {
                    appBarLayout0.jumpDrawablesToCurrentState();
                }
                else if(z2) {
                    List list0 = (List)((J)coordinatorLayout0.c0.b).get(appBarLayout0);
                    ArrayList arrayList0 = coordinatorLayout0.e0;
                    arrayList0.clear();
                    if(list0 != null) {
                        arrayList0.addAll(list0);
                    }
                    int v8 = arrayList0.size();
                    for(int v4 = 0; v4 < v8; ++v4) {
                        Behavior coordinatorLayout$Behavior0 = ((androidx.coordinatorlayout.widget.c)((View)arrayList0.get(v4)).getLayoutParams()).a;
                        if(coordinatorLayout$Behavior0 instanceof ScrollingViewBehavior) {
                            if(((ScrollingViewBehavior)coordinatorLayout$Behavior0).f == 0) {
                                return;
                            }
                            appBarLayout0.jumpDrawablesToCurrentState();
                            return;
                        }
                    }
                }
            }
        }

        @Override  // r6.d
        public final boolean h(CoordinatorLayout coordinatorLayout0, View view0, int v) {
            int v5;
            super.h(coordinatorLayout0, ((AppBarLayout)view0), v);
            int v1 = ((AppBarLayout)view0).getPendingAction();
            int v2 = this.m;
            if(v2 >= 0 && (v1 & 8) == 0) {
                View view1 = ((AppBarLayout)view0).getChildAt(v2);
                int v3 = view1.getBottom();
                if(this.n) {
                    int v4 = view1.getMinimumHeight();
                    v5 = ((AppBarLayout)view0).getTopInset() + v4 - v3;
                }
                else {
                    v5 = Math.round(((float)view1.getHeight()) * this.o) - v3;
                }
                this.v(coordinatorLayout0, ((AppBarLayout)view0), v5, 0x80000000, 0x7FFFFFFF);
            }
            else if(v1 != 0) {
                boolean z = (v1 & 4) != 0;
                if((v1 & 2) != 0) {
                    int v6 = ((AppBarLayout)view0).getUpNestedPreScrollRange();
                    if(z) {
                        this.w(coordinatorLayout0, ((AppBarLayout)view0), -v6);
                    }
                    else {
                        this.v(coordinatorLayout0, ((AppBarLayout)view0), -v6, 0x80000000, 0x7FFFFFFF);
                    }
                }
                else if((v1 & 1) != 0) {
                    if(z) {
                        this.w(coordinatorLayout0, ((AppBarLayout)view0), 0);
                    }
                    else {
                        this.v(coordinatorLayout0, ((AppBarLayout)view0), 0, 0x80000000, 0x7FFFFFFF);
                    }
                }
            }
            ((AppBarLayout)view0).g0 = 0;
            this.m = -1;
            int v7 = h.F(this.s(), -((AppBarLayout)view0).getTotalScrollRange(), 0);
            l l0 = this.a;
            if(l0 == null) {
                this.b = v7;
            }
            else if(l0.d != v7) {
                l0.d = v7;
                l0.a();
            }
            BaseBehavior.B(coordinatorLayout0, ((AppBarLayout)view0), this.s(), 0, true);
            ((AppBarLayout)view0).b0 = this.s();
            if(!((AppBarLayout)view0).willNotDraw()) {
                ((AppBarLayout)view0).postInvalidateOnAnimation();
            }
            this.A(coordinatorLayout0, ((AppBarLayout)view0));
            return true;
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public final boolean i(CoordinatorLayout coordinatorLayout0, View view0, int v, int v1, int v2) {
            if(((androidx.coordinatorlayout.widget.c)((AppBarLayout)view0).getLayoutParams()).height == -2) {
                coordinatorLayout0.r(((AppBarLayout)view0), v, v1, 0);
                return true;
            }
            return false;
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public final void k(CoordinatorLayout coordinatorLayout0, View view0, View view1, int v, int v1, int[] arr_v, int v2) {
            this.y(coordinatorLayout0, ((AppBarLayout)view0), view1, v1, arr_v);
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public final void l(CoordinatorLayout coordinatorLayout0, View view0, int v, int v1, int v2, int[] arr_v) {
            if(v2 < 0) {
                arr_v[1] = this.v(coordinatorLayout0, ((AppBarLayout)view0), this.u() - v2, -((AppBarLayout)view0).getDownNestedScrollRange(), 0);
            }
            if(v2 == 0) {
                this.A(coordinatorLayout0, ((AppBarLayout)view0));
            }
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public final void n(View view0, Parcelable parcelable0) {
            AppBarLayout appBarLayout0 = (AppBarLayout)view0;
            if(parcelable0 instanceof SavedState) {
                this.m = ((SavedState)parcelable0).Z;
                this.o = ((SavedState)parcelable0).b0;
                this.n = ((SavedState)parcelable0).c0;
                return;
            }
            this.m = -1;
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public final Parcelable o(View view0) {
            boolean z = true;
            Parcelable parcelable0 = View.BaseSavedState.EMPTY_STATE;
            int v = this.s();
            int v1 = ((AppBarLayout)view0).getChildCount();
            for(int v2 = 0; v2 < v1; ++v2) {
                View view1 = ((AppBarLayout)view0).getChildAt(v2);
                int v3 = view1.getBottom() + v;
                if(view1.getTop() + v <= 0 && v3 >= 0) {
                    SavedState appBarLayout$BaseBehavior$SavedState0 = new SavedState(parcelable0);  // initializer: Landroidx/customview/view/AbsSavedState;-><init>(Landroid/os/Parcelable;)V
                    appBarLayout$BaseBehavior$SavedState0.Z = v2;
                    int v4 = view1.getMinimumHeight();
                    if(v3 != ((AppBarLayout)view0).getTopInset() + v4) {
                        z = false;
                    }
                    appBarLayout$BaseBehavior$SavedState0.c0 = z;
                    appBarLayout$BaseBehavior$SavedState0.b0 = ((float)v3) / ((float)view1.getHeight());
                    return appBarLayout$BaseBehavior$SavedState0;
                }
            }
            return parcelable0;
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public final boolean p(CoordinatorLayout coordinatorLayout0, View view0, View view1, int v, int v1) {
            boolean z = (v & 2) != 0 && (((AppBarLayout)view0).k0 || ((AppBarLayout)view0).getTotalScrollRange() != 0 && coordinatorLayout0.getHeight() - view1.getHeight() <= ((AppBarLayout)view0).getHeight());
            if(z) {
                ValueAnimator valueAnimator0 = this.l;
                if(valueAnimator0 != null) {
                    valueAnimator0.cancel();
                }
            }
            this.p = null;
            this.k = v1;
            return z;
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public final void q(CoordinatorLayout coordinatorLayout0, View view0, View view1, int v) {
            if(this.k == 0 || v == 1) {
                this.z(coordinatorLayout0, ((AppBarLayout)view0));
                if(((AppBarLayout)view0).k0) {
                    ((AppBarLayout)view0).d(((AppBarLayout)view0).e(view1));
                }
            }
            this.p = new WeakReference(view1);
        }

        @Override  // r6.b
        public final int u() {
            return this.s() + this.j;
        }

        @Override  // r6.b
        public final int v(CoordinatorLayout coordinatorLayout0, View view0, int v, int v1, int v2) {
            boolean z;
            int v13;
            int v11;
            int v3 = 1;
            int v4 = this.u();
            int v5 = 0;
            if(v1 == 0 || v4 < v1 || v4 > v2) {
                this.j = 0;
            }
            else {
                int v6 = h.F(v, v1, v2);
                if(v4 != v6) {
                    if(((AppBarLayout)view0).f0) {
                        int v7 = Math.abs(v6);
                        int v8 = ((AppBarLayout)view0).getChildCount();
                        int v9 = 0;
                        while(v9 < v8) {
                            View view1 = ((AppBarLayout)view0).getChildAt(v9);
                            r6.a a0 = (r6.a)view1.getLayoutParams();
                            Interpolator interpolator0 = a0.b;
                            if(v7 >= view1.getTop() && v7 <= view1.getBottom()) {
                                if(interpolator0 == null) {
                                    break;
                                }
                                int v10 = a0.a;
                                if((v10 & 1) == 0) {
                                    v11 = 0;
                                }
                                else {
                                    v11 = view1.getHeight() + a0.topMargin + a0.bottomMargin;
                                    if((v10 & 2) != 0) {
                                        v11 -= view1.getMinimumHeight();
                                    }
                                }
                                if(view1.getFitsSystemWindows()) {
                                    v11 -= ((AppBarLayout)view0).getTopInset();
                                }
                                if(v11 <= 0) {
                                    break;
                                }
                                int v12 = Math.round(interpolator0.getInterpolation(((float)(v7 - view1.getTop())) / ((float)v11)) * ((float)v11));
                                v13 = (view1.getTop() + v12) * Integer.signum(v6);
                                goto label_32;
                            }
                            ++v9;
                        }
                    }
                    v13 = v6;
                label_32:
                    l l0 = this.a;
                    if(l0 == null) {
                        this.b = v13;
                        z = false;
                    }
                    else if(l0.d != v13) {
                        l0.d = v13;
                        l0.a();
                        z = true;
                    }
                    else {
                        z = false;
                    }
                    this.j = v6 - v13;
                    if(!z && ((AppBarLayout)view0).f0) {
                        List list0 = (List)((J)coordinatorLayout0.c0.b).get(((AppBarLayout)view0));
                        if(list0 != null && !list0.isEmpty()) {
                            for(int v14 = 0; v14 < list0.size(); ++v14) {
                                View view2 = (View)list0.get(v14);
                                Behavior coordinatorLayout$Behavior0 = ((androidx.coordinatorlayout.widget.c)view2.getLayoutParams()).a;
                                if(coordinatorLayout$Behavior0 != null) {
                                    coordinatorLayout$Behavior0.d(view2, ((AppBarLayout)view0));
                                }
                            }
                        }
                    }
                    ((AppBarLayout)view0).b0 = this.s();
                    if(!((AppBarLayout)view0).willNotDraw()) {
                        ((AppBarLayout)view0).postInvalidateOnAnimation();
                    }
                    if(v6 < v4) {
                        v3 = -1;
                    }
                    BaseBehavior.B(coordinatorLayout0, ((AppBarLayout)view0), v6, v3, false);
                    v5 = v4 - v6;
                }
            }
            this.A(coordinatorLayout0, ((AppBarLayout)view0));
            return v5;
        }

        public final void w(CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0, int v) {
            int v1 = Math.abs(this.u() - v);
            float f = Math.abs(0.0f);
            int v2 = f > 0.0f ? Math.round(((float)v1) / f * 1000.0f) * 3 : ((int)((((float)v1) / ((float)appBarLayout0.getHeight()) + 1.0f) * 150.0f));
            int v3 = this.u();
            if(v3 != v) {
                ValueAnimator valueAnimator0 = this.l;
                if(valueAnimator0 == null) {
                    ValueAnimator valueAnimator1 = new ValueAnimator();
                    this.l = valueAnimator1;
                    valueAnimator1.setInterpolator(q6.a.e);
                    this.l.addUpdateListener(new com.google.android.material.appbar.a(this, coordinatorLayout0, appBarLayout0));
                }
                else {
                    valueAnimator0.cancel();
                }
                this.l.setDuration(((long)Math.min(v2, 600)));
                this.l.setIntValues(new int[]{v3, v});
                this.l.start();
            }
            else if(this.l != null && this.l.isRunning()) {
                this.l.cancel();
            }
        }

        public static View x(CoordinatorLayout coordinatorLayout0) {
            int v = coordinatorLayout0.getChildCount();
            int v1 = 0;
            while(v1 < v) {
                View view0 = coordinatorLayout0.getChildAt(v1);
                if(!(view0 instanceof J1.l) && !(view0 instanceof ListView) && !(view0 instanceof ScrollView)) {
                    ++v1;
                    continue;
                }
                return view0;
            }
            return null;
        }

        public final void y(CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0, View view0, int v, int[] arr_v) {
            int v2;
            int v1;
            if(v != 0) {
                if(v < 0) {
                    v1 = -appBarLayout0.getTotalScrollRange();
                    v2 = appBarLayout0.getDownNestedPreScrollRange() + v1;
                }
                else {
                    v1 = -appBarLayout0.getUpNestedPreScrollRange();
                    v2 = 0;
                }
                if(v1 != v2) {
                    arr_v[1] = this.v(coordinatorLayout0, appBarLayout0, this.u() - v, v1, v2);
                }
            }
            if(appBarLayout0.k0) {
                appBarLayout0.d(appBarLayout0.e(view0));
            }
        }

        public final void z(CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0) {
            int v = this.u();
            int v1 = appBarLayout0.getChildCount();
            int v2;
            for(v2 = 0; true; ++v2) {
                if(v2 >= v1) {
                    v2 = -1;
                    break;
                }
                View view0 = appBarLayout0.getChildAt(v2);
                int v3 = view0.getTop();
                int v4 = view0.getBottom();
                r6.a a0 = (r6.a)view0.getLayoutParams();
                if((a0.a & 0x20) == 0x20) {
                    v3 -= a0.topMargin;
                    v4 += a0.bottomMargin;
                }
                if(v3 <= -v && v4 >= -v) {
                    break;
                }
            }
            if(v2 >= 0) {
                View view1 = appBarLayout0.getChildAt(v2);
                r6.a a1 = (r6.a)view1.getLayoutParams();
                int v5 = a1.a;
                if((v5 & 17) == 17) {
                    int v6 = -view1.getTop();
                    int v7 = -view1.getBottom();
                    if(v2 == appBarLayout0.getChildCount() - 1) {
                        v7 += appBarLayout0.getTopInset();
                    }
                    if((v5 & 2) == 2) {
                        v7 += view1.getMinimumHeight();
                    }
                    else if((v5 & 5) == 5) {
                        int v8 = view1.getMinimumHeight() + v7;
                        if(v < v8) {
                            v6 = v8;
                        }
                        else {
                            v7 = v8;
                        }
                    }
                    if((v5 & 0x20) == 0x20) {
                        v6 += a1.topMargin;
                        v7 -= a1.bottomMargin;
                    }
                    if(v < (v7 + v6) / 2) {
                        v6 = v7;
                    }
                    this.w(coordinatorLayout0, appBarLayout0, h.F(v6, -appBarLayout0.getTotalScrollRange(), 0));
                }
            }
        }
    }

    public static class com.google.android.material.appbar.AppBarLayout.Behavior extends BaseBehavior {
        public com.google.android.material.appbar.AppBarLayout.Behavior() {
        }

        public com.google.android.material.appbar.AppBarLayout.Behavior(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
        }
    }

    public static class ScrollingViewBehavior extends r6.c {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context0, AttributeSet attributeSet0) {
            super(0);
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, p6.a.z);
            this.f = typedArray0.getDimensionPixelSize(0, 0);
            typedArray0.recycle();
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public final boolean b(View view0, View view1) {
            return view1 instanceof AppBarLayout;
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public final boolean d(View view0, View view1) {
            Behavior coordinatorLayout$Behavior0 = ((androidx.coordinatorlayout.widget.c)view1.getLayoutParams()).a;
            if(coordinatorLayout$Behavior0 instanceof BaseBehavior) {
                view0.offsetTopAndBottom(view1.getBottom() - view0.getTop() + ((BaseBehavior)coordinatorLayout$Behavior0).j + this.e - this.u(view1));
            }
            if(view1 instanceof AppBarLayout && ((AppBarLayout)view1).k0) {
                ((AppBarLayout)view1).d(((AppBarLayout)view1).e(view0));
            }
            return false;
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public final void e(CoordinatorLayout coordinatorLayout0, View view0) {
            if(view0 instanceof AppBarLayout) {
                N.h(coordinatorLayout0, c.h.a());
                N.f(coordinatorLayout0, 0);
                N.h(coordinatorLayout0, c.i.a());
                N.f(coordinatorLayout0, 0);
            }
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public final boolean m(CoordinatorLayout coordinatorLayout0, View view0, Rect rect0, boolean z) {
            AppBarLayout appBarLayout0 = ScrollingViewBehavior.v(coordinatorLayout0.j(view0));
            if(appBarLayout0 != null) {
                rect0.offset(view0.getLeft(), view0.getTop());
                int v = coordinatorLayout0.getWidth();
                int v1 = coordinatorLayout0.getHeight();
                this.c.set(0, 0, v, v1);
                if(!this.c.contains(rect0)) {
                    appBarLayout0.c(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        public static AppBarLayout v(ArrayList arrayList0) {
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                View view0 = (View)arrayList0.get(v1);
                if(view0 instanceof AppBarLayout) {
                    return (AppBarLayout)view0;
                }
            }
            return null;
        }
    }

    public int b0;
    public int c0;
    public int d0;
    public int e0;
    public boolean f0;
    public int g0;
    public WindowInsetsCompat h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public int l0;
    public WeakReference m0;
    public ValueAnimator n0;
    public int[] o0;
    public Drawable p0;

    public AppBarLayout(Context context0, AttributeSet attributeSet0) {
        super(L6.a.a(context0, attributeSet0, 0x7F04003A, 0x7F1302CC), attributeSet0, 0x7F04003A);  // attr:appBarLayoutStyle
        this.c0 = -1;
        this.d0 = -1;
        this.e0 = -1;
        this.g0 = 0;
        Context context1 = this.getContext();
        this.setOrientation(1);
        int v = Build.VERSION.SDK_INT;
        this.setOutlineProvider(ViewOutlineProvider.BOUNDS);
        Context context2 = this.getContext();
        TypedArray typedArray0 = B6.l.f(context2, attributeSet0, e.a, 0x7F04003A, 0x7F1302CC, new int[0]);  // attr:appBarLayoutStyle
        try {
            if(typedArray0.hasValue(0)) {
                this.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context2, typedArray0.getResourceId(0, 0)));
            }
        }
        finally {
            typedArray0.recycle();
        }
        TypedArray typedArray1 = B6.l.f(context1, attributeSet0, p6.a.a, 0x7F04003A, 0x7F1302CC, new int[0]);  // attr:appBarLayoutStyle
        this.setBackground(typedArray1.getDrawable(0));
        if(this.getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable0 = (ColorDrawable)this.getBackground();
            MaterialShapeDrawable materialShapeDrawable0 = new MaterialShapeDrawable();
            materialShapeDrawable0.j(ColorStateList.valueOf(colorDrawable0.getColor()));
            materialShapeDrawable0.h(context1);
            this.setBackground(materialShapeDrawable0);
        }
        if(typedArray1.hasValue(4)) {
            this.c(typedArray1.getBoolean(4, false), false, false);
        }
        if(typedArray1.hasValue(3)) {
            e.a(this, ((float)typedArray1.getDimensionPixelSize(3, 0)));
        }
        if(v >= 26) {
            if(typedArray1.hasValue(2)) {
                y.p(this, typedArray1.getBoolean(2, false));
            }
            if(typedArray1.hasValue(1)) {
                this.setTouchscreenBlocksFocus(typedArray1.getBoolean(1, false));
            }
        }
        this.k0 = typedArray1.getBoolean(5, false);
        this.l0 = typedArray1.getResourceId(6, -1);
        this.setStatusBarForeground(typedArray1.getDrawable(7));
        typedArray1.recycle();
        E.k(this, new g.a(22, this));
    }

    public final r6.a a(AttributeSet attributeSet0) {
        Context context0 = this.getContext();
        r6.a a0 = new r6.a(context0, attributeSet0);  // initializer: Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
        a0.a = 1;
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, p6.a.b);
        a0.a = typedArray0.getInt(0, 0);
        if(typedArray0.hasValue(1)) {
            a0.b = AnimationUtils.loadInterpolator(context0, typedArray0.getResourceId(1, 0));
        }
        typedArray0.recycle();
        return a0;
    }

    public static r6.a b(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(viewGroup$LayoutParams0 instanceof LinearLayout.LayoutParams) {
            r6.a a0 = new r6.a(((LinearLayout.LayoutParams)viewGroup$LayoutParams0));  // initializer: Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/widget/LinearLayout$LayoutParams;)V
            a0.a = 1;
            return a0;
        }
        if(viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams) {
            r6.a a1 = new r6.a(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0));  // initializer: Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V
            a1.a = 1;
            return a1;
        }
        r6.a a2 = new r6.a(viewGroup$LayoutParams0);  // initializer: Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V
        a2.a = 1;
        return a2;
    }

    // Deobfuscation rating: LOW(20)
    public final void c(boolean z, boolean z1, boolean z2) {
        this.g0 = (z ? 1 : 2) | (z1 ? 4 : 0) | (z2 ? 8 : 0);
        this.requestLayout();
    }

    @Override  // android.widget.LinearLayout
    public final boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof r6.a;
    }

    public final boolean d(boolean z) {
        if(this.j0 != z) {
            this.j0 = z;
            this.refreshDrawableState();
            if(this.k0 && this.getBackground() instanceof MaterialShapeDrawable) {
                MaterialShapeDrawable materialShapeDrawable0 = (MaterialShapeDrawable)this.getBackground();
                float f = this.getResources().getDimension(0x7F070077);  // dimen:design_appbar_elevation
                float f1 = z ? 0.0f : f;
                if(!z) {
                    f = 0.0f;
                }
                ValueAnimator valueAnimator0 = this.n0;
                if(valueAnimator0 != null) {
                    valueAnimator0.cancel();
                }
                ValueAnimator valueAnimator1 = ValueAnimator.ofFloat(new float[]{f1, f});
                this.n0 = valueAnimator1;
                valueAnimator1.setDuration(((long)this.getResources().getInteger(0x7F0B0002)));  // integer:app_bar_elevation_anim_duration
                this.n0.setInterpolator(q6.a.a);
                this.n0.addUpdateListener(new J6.b(5, materialShapeDrawable0));
                this.n0.start();
            }
            return true;
        }
        return false;
    }

    @Override  // android.view.View
    public final void draw(Canvas canvas0) {
        super.draw(canvas0);
        if(this.p0 != null && this.getTopInset() > 0) {
            int v = canvas0.save();
            canvas0.translate(0.0f, ((float)(-this.b0)));
            this.p0.draw(canvas0);
            canvas0.restoreToCount(v);
        }
    }

    @Override  // android.view.ViewGroup
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] arr_v = this.getDrawableState();
        Drawable drawable0 = this.p0;
        if(drawable0 != null && drawable0.isStateful() && drawable0.setState(arr_v)) {
            this.invalidateDrawable(drawable0);
        }
    }

    public final boolean e(View view0) {
        View view1 = null;
        if(this.m0 == null) {
            int v = this.l0;
            if(v != -1) {
                View view2 = view0 == null ? null : view0.findViewById(v);
                if(view2 == null && this.getParent() instanceof ViewGroup) {
                    view2 = ((ViewGroup)this.getParent()).findViewById(this.l0);
                }
                if(view2 != null) {
                    this.m0 = new WeakReference(view2);
                }
            }
        }
        WeakReference weakReference0 = this.m0;
        if(weakReference0 != null) {
            view1 = (View)weakReference0.get();
        }
        if(view1 != null) {
            view0 = view1;
        }
        return view0 != null && (view0.canScrollVertically(-1) || view0.getScrollY() > 0);
    }

    public final boolean f() {
        if(this.getChildCount() > 0) {
            View view0 = this.getChildAt(0);
            return view0.getVisibility() != 8 && !view0.getFitsSystemWindows();
        }
        return false;
    }

    @Override  // android.widget.LinearLayout
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = new r6.a(-1, -2);  // initializer: Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
        viewGroup$LayoutParams0.a = 1;
        return viewGroup$LayoutParams0;
    }

    @Override  // android.widget.LinearLayout
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new r6.a(-1, -2);  // initializer: Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
        linearLayout$LayoutParams0.a = 1;
        return linearLayout$LayoutParams0;
    }

    @Override  // android.widget.LinearLayout
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return this.a(attributeSet0);
    }

    @Override  // android.widget.LinearLayout
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return AppBarLayout.b(viewGroup$LayoutParams0);
    }

    @Override  // android.widget.LinearLayout
    public final LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return this.a(attributeSet0);
    }

    @Override  // android.widget.LinearLayout
    public final LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return AppBarLayout.b(viewGroup$LayoutParams0);
    }

    @Override  // androidx.coordinatorlayout.widget.a
    public Behavior getBehavior() {
        return new com.google.android.material.appbar.AppBarLayout.Behavior();
    }

    public int getDownNestedPreScrollRange() {
        int v6;
        int v = this.d0;
        if(v != -1) {
            return v;
        }
        int v1 = this.getChildCount() - 1;
        int v2 = 0;
        while(v1 >= 0) {
            View view0 = this.getChildAt(v1);
            r6.a a0 = (r6.a)view0.getLayoutParams();
            int v3 = view0.getMeasuredHeight();
            int v4 = a0.a;
            if((v4 & 5) == 5) {
                int v5 = a0.topMargin + a0.bottomMargin;
                if((v4 & 8) == 0) {
                    v6 = (v4 & 2) == 0 ? v5 + v3 : v3 - view0.getMinimumHeight() + v5;
                }
                else {
                    v6 = view0.getMinimumHeight() + v5;
                }
                if(v1 == 0 && view0.getFitsSystemWindows()) {
                    v6 = Math.min(v6, v3 - this.getTopInset());
                }
                v2 += v6;
            }
            else if(v2 > 0) {
                break;
            }
            --v1;
        }
        int v7 = Math.max(0, v2);
        this.d0 = v7;
        return v7;
    }

    public int getDownNestedScrollRange() {
        int v = this.e0;
        if(v != -1) {
            return v;
        }
        int v1 = this.getChildCount();
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            View view0 = this.getChildAt(v2);
            r6.a a0 = (r6.a)view0.getLayoutParams();
            int v4 = view0.getMeasuredHeight();
            int v5 = a0.topMargin + a0.bottomMargin + v4;
            int v6 = a0.a;
            if((v6 & 1) == 0) {
                break;
            }
            v3 += v5;
            if((v6 & 2) != 0) {
                v3 -= view0.getMinimumHeight();
                break;
            }
        }
        int v7 = Math.max(0, v3);
        this.e0 = v7;
        return v7;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.l0;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int v = this.getTopInset();
        int v1 = this.getMinimumHeight();
        if(v1 != 0) {
            return v1 * 2 + v;
        }
        int v2 = this.getChildCount();
        v1 = v2 < 1 ? 0 : this.getChildAt(v2 - 1).getMinimumHeight();
        return v1 == 0 ? this.getHeight() / 3 : v1 * 2 + v;
    }

    public int getPendingAction() {
        return this.g0;
    }

    public Drawable getStatusBarForeground() {
        return this.p0;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        return this.h0 == null ? 0 : this.h0.d();
    }

    public final int getTotalScrollRange() {
        int v = this.c0;
        if(v != -1) {
            return v;
        }
        int v1 = this.getChildCount();
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            View view0 = this.getChildAt(v2);
            r6.a a0 = (r6.a)view0.getLayoutParams();
            int v4 = view0.getMeasuredHeight();
            int v5 = a0.a;
            if((v5 & 1) == 0) {
                break;
            }
            int v6 = v4 + a0.topMargin + a0.bottomMargin + v3;
            v3 = v2 != 0 || !view0.getFitsSystemWindows() ? v4 + a0.topMargin + a0.bottomMargin + v3 : v6 - this.getTopInset();
            if((v5 & 2) != 0) {
                v3 -= view0.getMinimumHeight();
                break;
            }
        }
        int v7 = Math.max(0, v3);
        this.c0 = v7;
        return v7;
    }

    public int getUpNestedPreScrollRange() {
        return this.getTotalScrollRange();
    }

    @Override  // android.view.ViewGroup
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable0 = this.getBackground();
        if(drawable0 instanceof MaterialShapeDrawable) {
            h.i0(this, ((MaterialShapeDrawable)drawable0));
        }
    }

    @Override  // android.view.ViewGroup
    public final int[] onCreateDrawableState(int v) {
        if(this.o0 == null) {
            this.o0 = new int[4];
        }
        int[] arr_v = this.o0;
        int[] arr_v1 = super.onCreateDrawableState(v + arr_v.length);
        boolean z = this.i0;
        arr_v[0] = z ? 0x7F0403BF : 0x80FBFC41;  // attr:state_liftable
        arr_v[1] = !z || !this.j0 ? 0x80FBFC40 : 0x7F0403C0;  // attr:state_lifted
        arr_v[2] = z ? 0x7F0403BD : 0x80FBFC43;  // attr:state_collapsible
        arr_v[3] = !z || !this.j0 ? 0x80FBFC44 : 0x7F0403BC;  // attr:state_collapsed
        return View.mergeDrawableStates(arr_v1, arr_v);
    }

    @Override  // android.view.ViewGroup
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference0 = this.m0;
        if(weakReference0 != null) {
            weakReference0.clear();
        }
        this.m0 = null;
    }

    @Override  // android.widget.LinearLayout
    public final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        boolean z1 = true;
        super.onLayout(z, v, v1, v2, v3);
        if(this.getFitsSystemWindows() && this.f()) {
            int v4 = this.getTopInset();
            for(int v5 = this.getChildCount() - 1; v5 >= 0; --v5) {
                this.getChildAt(v5).offsetTopAndBottom(v4);
            }
        }
        this.c0 = -1;
        this.d0 = -1;
        this.e0 = -1;
        this.f0 = false;
        int v6 = this.getChildCount();
        for(int v7 = 0; v7 < v6; ++v7) {
            if(((r6.a)this.getChildAt(v7).getLayoutParams()).b != null) {
                this.f0 = true;
                break;
            }
        }
        Drawable drawable0 = this.p0;
        if(drawable0 != null) {
            drawable0.setBounds(0, 0, this.getWidth(), this.getTopInset());
        }
        if(!this.k0) {
            int v8 = this.getChildCount();
            for(int v9 = 0; true; ++v9) {
                if(v9 >= v8) {
                    z1 = false;
                    break;
                }
                int v10 = ((r6.a)this.getChildAt(v9).getLayoutParams()).a;
                if((v10 & 1) == 1 && (v10 & 10) != 0) {
                    break;
                }
            }
        }
        if(this.i0 != z1) {
            this.i0 = z1;
            this.refreshDrawableState();
        }
    }

    @Override  // android.widget.LinearLayout
    public final void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        int v2 = View.MeasureSpec.getMode(v1);
        if(v2 != 0x40000000 && this.getFitsSystemWindows() && this.f()) {
            int v3 = this.getMeasuredHeight();
            switch(v2) {
                case 0x80000000: {
                    int v4 = this.getMeasuredHeight();
                    v3 = h.F(this.getTopInset() + v4, 0, View.MeasureSpec.getSize(v1));
                    break;
                }
                case 0: {
                    v3 += this.getTopInset();
                }
            }
            this.setMeasuredDimension(this.getMeasuredWidth(), v3);
        }
        this.c0 = -1;
        this.d0 = -1;
        this.e0 = -1;
    }

    @Override  // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable drawable0 = this.getBackground();
        if(drawable0 instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable)drawable0).i(f);
        }
    }

    public void setExpanded(boolean z) {
        this.c(z, this.isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z) {
        this.k0 = z;
    }

    public void setLiftOnScrollTargetViewId(int v) {
        this.l0 = v;
        WeakReference weakReference0 = this.m0;
        if(weakReference0 != null) {
            weakReference0.clear();
        }
        this.m0 = null;
    }

    @Override  // android.widget.LinearLayout
    public void setOrientation(int v) {
        if(v != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(1);
    }

    public void setStatusBarForeground(Drawable drawable0) {
        Drawable drawable1 = null;
        Drawable drawable2 = this.p0;
        if(drawable2 != drawable0) {
            if(drawable2 != null) {
                drawable2.setCallback(null);
            }
            if(drawable0 != null) {
                drawable1 = drawable0.mutate();
            }
            this.p0 = drawable1;
            int v = 0;
            if(drawable1 != null) {
                if(drawable1.isStateful()) {
                    this.p0.setState(this.getDrawableState());
                }
                this.p0.setLayoutDirection(this.getLayoutDirection());
                this.p0.setVisible(this.getVisibility() == 0, false);
                this.p0.setCallback(this);
            }
            if(this.p0 != null && this.getTopInset() > 0) {
                v = 1;
            }
            this.setWillNotDraw(((boolean)(1 ^ v)));
            this.postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int v) {
        this.setStatusBarForeground(new ColorDrawable(v));
    }

    public void setStatusBarForegroundResource(int v) {
        this.setStatusBarForeground(q.v(this.getContext(), v));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        e.a(this, f);
    }

    @Override  // android.view.View
    public void setVisibility(int v) {
        super.setVisibility(v);
        Drawable drawable0 = this.p0;
        if(drawable0 != null) {
            drawable0.setVisible(v == 0, false);
        }
    }

    @Override  // android.view.View
    public final boolean verifyDrawable(Drawable drawable0) {
        return super.verifyDrawable(drawable0) || drawable0 == this.p0;
    }
}

