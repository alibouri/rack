package com.google.android.material.tabs;

import B6.l;
import Bb.F;
import Bb.q;
import E2.b;
import J1.E;
import J6.g;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout.LayoutParams;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.shape.MaterialShapeDrawable;
import hb.h;
import java.util.ArrayList;
import java.util.Iterator;
import v7.d;

@b
public class TabLayout extends HorizontalScrollView {
    public interface BaseOnTabSelectedListener {
        void a(Tab arg1);
    }

    public interface OnTabSelectedListener extends BaseOnTabSelectedListener {
    }

    public static final class Tab {
        public CharSequence a;
        public int b;
        public View c;
        public TabLayout d;
        public com.google.android.material.tabs.b e;
        public int f;

    }

    public boolean A0;
    public boolean B0;
    public int C0;
    public boolean D0;
    public d E0;
    public BaseOnTabSelectedListener F0;
    public final ArrayList G0;
    public c H0;
    public ValueAnimator I0;
    public ViewPager J0;
    public PagerAdapter K0;
    public J6.d L0;
    public a M0;
    public J6.c N0;
    public boolean O0;
    public final I1.c P0;
    public static final I1.d Q0;
    public final ArrayList b0;
    public Tab c0;
    public final g d0;
    public final int e0;
    public final int f0;
    public final int g0;
    public final int h0;
    public final int i0;
    public ColorStateList j0;
    public ColorStateList k0;
    public ColorStateList l0;
    public Drawable m0;
    public int n0;
    public final float o0;
    public final float p0;
    public final int q0;
    public int r0;
    public final int s0;
    public final int t0;
    public final int u0;
    public final int v0;
    public int w0;
    public final int x0;
    public int y0;
    public int z0;

    static {
        TabLayout.Q0 = new I1.d(16);
    }

    public TabLayout(Context context0, AttributeSet attributeSet0) {
        super(L6.a.a(context0, attributeSet0, 0x7F0403F5, 0x7F1302D4), attributeSet0, 0x7F0403F5);  // attr:tabStyle
        this.b0 = new ArrayList();
        this.m0 = new GradientDrawable();
        this.n0 = 0;
        this.r0 = 0x7FFFFFFF;
        this.G0 = new ArrayList();
        this.P0 = new I1.c(12);
        Context context1 = this.getContext();
        this.setHorizontalScrollBarEnabled(false);
        g g0 = new g(this, context1);
        this.d0 = g0;
        super.addView(g0, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArray0 = l.f(context1, attributeSet0, p6.a.C, 0x7F0403F5, 0x7F1302D4, new int[]{23});  // attr:tabStyle
        if(this.getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable0 = (ColorDrawable)this.getBackground();
            MaterialShapeDrawable materialShapeDrawable0 = new MaterialShapeDrawable();
            materialShapeDrawable0.j(ColorStateList.valueOf(colorDrawable0.getColor()));
            materialShapeDrawable0.h(context1);
            materialShapeDrawable0.i(E.e(this));
            this.setBackground(materialShapeDrawable0);
        }
        this.setSelectedTabIndicator(F.x(context1, typedArray0, 5));
        this.setSelectedTabIndicatorColor(typedArray0.getColor(8, 0));
        int v = typedArray0.getDimensionPixelSize(11, -1);
        Rect rect0 = this.m0.getBounds();
        this.m0.setBounds(rect0.left, 0, rect0.right, v);
        g0.requestLayout();
        this.setSelectedTabIndicatorGravity(typedArray0.getInt(10, 0));
        this.setTabIndicatorFullWidth(typedArray0.getBoolean(9, true));
        this.setTabIndicatorAnimationMode(typedArray0.getInt(7, 0));
        int v1 = typedArray0.getDimensionPixelSize(16, 0);
        this.h0 = v1;
        this.g0 = v1;
        this.f0 = v1;
        this.e0 = v1;
        this.e0 = typedArray0.getDimensionPixelSize(19, v1);
        this.f0 = typedArray0.getDimensionPixelSize(20, v1);
        this.g0 = typedArray0.getDimensionPixelSize(18, v1);
        this.h0 = typedArray0.getDimensionPixelSize(17, v1);
        int v2 = typedArray0.getResourceId(23, 0x7F1301D5);  // style:TextAppearance.Design.Tab
        this.i0 = v2;
        TypedArray typedArray1 = context1.obtainStyledAttributes(v2, h.a.w);
        try {
            this.o0 = (float)typedArray1.getDimensionPixelSize(0, 0);
            this.j0 = F.w(context1, typedArray1, 3);
        }
        finally {
            typedArray1.recycle();
        }
        if(typedArray0.hasValue(24)) {
            this.j0 = F.w(context1, typedArray0, 24);
        }
        if(typedArray0.hasValue(22)) {
            int v4 = typedArray0.getColor(22, 0);
            int v5 = this.j0.getDefaultColor();
            this.j0 = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{v4, v5});
        }
        this.k0 = F.w(context1, typedArray0, 3);
        typedArray0.getInt(4, -1);
        this.l0 = F.w(context1, typedArray0, 21);
        this.x0 = typedArray0.getInt(6, 300);
        this.s0 = typedArray0.getDimensionPixelSize(14, -1);
        this.t0 = typedArray0.getDimensionPixelSize(13, -1);
        this.q0 = typedArray0.getResourceId(0, 0);
        this.v0 = typedArray0.getDimensionPixelSize(1, 0);
        this.z0 = typedArray0.getInt(15, 1);
        this.w0 = typedArray0.getInt(2, 0);
        this.A0 = typedArray0.getBoolean(12, false);
        this.D0 = typedArray0.getBoolean(25, false);
        typedArray0.recycle();
        Resources resources0 = this.getResources();
        this.p0 = (float)resources0.getDimensionPixelSize(0x7F0700A4);  // dimen:design_tab_text_size_2line
        this.u0 = resources0.getDimensionPixelSize(0x7F0700A2);  // dimen:design_tab_scrollable_min_width
        this.d();
    }

    public final void a(BaseOnTabSelectedListener tabLayout$BaseOnTabSelectedListener0) {
        ArrayList arrayList0 = this.G0;
        if(!arrayList0.contains(tabLayout$BaseOnTabSelectedListener0)) {
            arrayList0.add(tabLayout$BaseOnTabSelectedListener0);
        }
    }

    @Override  // android.widget.HorizontalScrollView
    public final void addView(View view0) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override  // android.widget.HorizontalScrollView
    public final void addView(View view0, int v) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override  // android.widget.HorizontalScrollView
    public final void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override  // android.widget.HorizontalScrollView
    public final void addView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void b(Tab tabLayout$Tab0, boolean z) {
        ArrayList arrayList0 = this.b0;
        int v = arrayList0.size();
        if(tabLayout$Tab0.d != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        tabLayout$Tab0.b = v;
        arrayList0.add(v, tabLayout$Tab0);
        int v1 = arrayList0.size();
        for(int v2 = v + 1; v2 < v1; ++v2) {
            ((Tab)arrayList0.get(v2)).b = v2;
        }
        com.google.android.material.tabs.b b0 = tabLayout$Tab0.e;
        b0.setSelected(false);
        b0.setActivated(false);
        int v3 = tabLayout$Tab0.b;
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-2, -1);
        if(this.z0 != 1 || this.w0 != 0) {
            linearLayout$LayoutParams0.width = -2;
            linearLayout$LayoutParams0.weight = 0.0f;
        }
        else {
            linearLayout$LayoutParams0.width = 0;
            linearLayout$LayoutParams0.weight = 1.0f;
        }
        this.d0.addView(b0, v3, linearLayout$LayoutParams0);
        if(z) {
            TabLayout tabLayout0 = tabLayout$Tab0.d;
            if(tabLayout0 == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout0.k(tabLayout$Tab0, true);
        }
    }

    public final void c(int v) {
        if(v == -1) {
            return;
        }
        if(this.getWindowToken() != null && this.isLaidOut()) {
            g g0 = this.d0;
            int v1 = g0.getChildCount();
            for(int v2 = 0; v2 < v1; ++v2) {
                if(g0.getChildAt(v2).getWidth() <= 0) {
                    this.m(v, 0.0f, true, true);
                    return;
                }
            }
            int v3 = this.getScrollX();
            int v4 = this.e(v, 0.0f);
            if(v3 != v4) {
                this.f();
                this.I0.setIntValues(new int[]{v3, v4});
                this.I0.start();
            }
            if(g0.b0 != null && g0.b0.isRunning()) {
                g0.b0.cancel();
            }
            g0.c(v, this.x0, true);
            return;
        }
        this.m(v, 0.0f, true, true);
    }

    public final void d() {
        g g0 = this.d0;
        g0.setPaddingRelative((this.z0 == 0 || this.z0 == 2 ? Math.max(0, this.v0 - this.e0) : 0), 0, 0, 0);
    alab1:
        switch(this.z0) {
            case 0: {
                switch(this.w0) {
                    case 0: {
                        Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
                        break;
                    }
                    case 1: {
                        g0.setGravity(1);
                        break alab1;
                    }
                    case 2: {
                        break;
                    }
                    default: {
                        break alab1;
                    }
                }
                g0.setGravity(0x800003);
                break;
            }
            case 1: 
            case 2: {
                if(this.w0 == 2) {
                    Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
                }
                g0.setGravity(1);
            }
        }
        this.p(true);
    }

    public final int e(int v, float f) {
        int v1 = 0;
        if(this.z0 != 0 && this.z0 != 2) {
            return 0;
        }
        View view0 = this.d0.getChildAt(v);
        View view1 = v + 1 >= this.d0.getChildCount() ? null : this.d0.getChildAt(v + 1);
        int v2 = view0 == null ? 0 : view0.getWidth();
        if(view1 != null) {
            v1 = view1.getWidth();
        }
        int v3 = v2 / 2 + view0.getLeft() - this.getWidth() / 2;
        int v4 = (int)(((float)(v2 + v1)) * 0.5f * f);
        return this.getLayoutDirection() == 0 ? v3 + v4 : v3 - v4;
    }

    public final void f() {
        if(this.I0 == null) {
            ValueAnimator valueAnimator0 = new ValueAnimator();
            this.I0 = valueAnimator0;
            valueAnimator0.setInterpolator(q6.a.b);
            this.I0.setDuration(((long)this.x0));
            this.I0.addUpdateListener(new J6.b(0, this));
        }
    }

    public final Tab g(int v) {
        return v < 0 || v >= this.getTabCount() ? null : ((Tab)this.b0.get(v));
    }

    @Override  // android.widget.FrameLayout
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return this.generateDefaultLayoutParams();
    }

    @Override  // android.widget.FrameLayout
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return this.generateDefaultLayoutParams();
    }

    private int getDefaultHeight() {
        ArrayList arrayList0 = this.b0;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Tab tabLayout$Tab0 = (Tab)arrayList0.get(v1);
        }
        return 0x30;
    }

    public int getSelectedTabPosition() {
        return this.c0 == null ? -1 : this.c0.b;
    }

    public int getTabCount() {
        return this.b0.size();
    }

    public int getTabGravity() {
        return this.w0;
    }

    public ColorStateList getTabIconTint() {
        return this.k0;
    }

    public int getTabIndicatorAnimationMode() {
        return this.C0;
    }

    public int getTabIndicatorGravity() {
        return this.y0;
    }

    public int getTabMaxWidth() {
        return this.r0;
    }

    private int getTabMinWidth() {
        int v = this.s0;
        if(v != -1) {
            return v;
        }
        return this.z0 == 0 || this.z0 == 2 ? this.u0 : 0;
    }

    public int getTabMode() {
        return this.z0;
    }

    public ColorStateList getTabRippleColor() {
        return this.l0;
    }

    private int getTabScrollRange() {
        return Math.max(0, this.d0.getWidth() - this.getWidth() - this.getPaddingLeft() - this.getPaddingRight());
    }

    public Drawable getTabSelectedIndicator() {
        return this.m0;
    }

    public ColorStateList getTabTextColors() {
        return this.j0;
    }

    public final Tab h() {
        Tab tabLayout$Tab0 = (Tab)TabLayout.Q0.a();
        if(tabLayout$Tab0 == null) {
            tabLayout$Tab0 = new Tab();  // initializer: Ljava/lang/Object;-><init>()V
            tabLayout$Tab0.b = -1;
            tabLayout$Tab0.f = -1;
        }
        tabLayout$Tab0.d = this;
        com.google.android.material.tabs.b b0 = this.P0 == null ? null : ((com.google.android.material.tabs.b)this.P0.a());
        if(b0 == null) {
            b0 = new com.google.android.material.tabs.b(this, this.getContext());
        }
        b0.setTab(tabLayout$Tab0);
        b0.setFocusable(true);
        b0.setMinimumWidth(this.getTabMinWidth());
        if(TextUtils.isEmpty(null)) {
            b0.setContentDescription(tabLayout$Tab0.a);
        }
        else {
            b0.setContentDescription(null);
        }
        tabLayout$Tab0.e = b0;
        int v = tabLayout$Tab0.f;
        if(v != -1) {
            b0.setId(v);
        }
        return tabLayout$Tab0;
    }

    public final void i() {
        this.j();
        PagerAdapter pagerAdapter0 = this.K0;
        if(pagerAdapter0 != null) {
            int v = pagerAdapter0.a();
            for(int v1 = 0; v1 < v; ++v1) {
                Tab tabLayout$Tab0 = this.h();
                this.K0.getClass();
                if(TextUtils.isEmpty(null) && !TextUtils.isEmpty(null)) {
                    tabLayout$Tab0.e.setContentDescription(null);
                }
                tabLayout$Tab0.a = null;
                com.google.android.material.tabs.b b0 = tabLayout$Tab0.e;
                if(b0 != null) {
                    b0.d();
                }
                this.b(tabLayout$Tab0, false);
            }
            ViewPager viewPager0 = this.J0;
            if(viewPager0 != null && v > 0) {
                int v2 = viewPager0.getCurrentItem();
                if(v2 != this.getSelectedTabPosition() && v2 < this.getTabCount()) {
                    this.k(this.g(v2), true);
                }
            }
        }
    }

    public final void j() {
        g g0 = this.d0;
        for(int v = g0.getChildCount() - 1; v >= 0; --v) {
            com.google.android.material.tabs.b b0 = (com.google.android.material.tabs.b)g0.getChildAt(v);
            g0.removeViewAt(v);
            if(b0 != null) {
                b0.setTab(null);
                b0.setSelected(false);
                this.P0.c(b0);
            }
            this.requestLayout();
        }
        Iterator iterator0 = this.b0.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            iterator0.remove();
            ((Tab)object0).d = null;
            ((Tab)object0).e = null;
            ((Tab)object0).f = -1;
            ((Tab)object0).a = null;
            ((Tab)object0).b = -1;
            ((Tab)object0).c = null;
            TabLayout.Q0.c(((Tab)object0));
        }
        this.c0 = null;
    }

    public final void k(Tab tabLayout$Tab0, boolean z) {
        Tab tabLayout$Tab1 = this.c0;
        ArrayList arrayList0 = this.G0;
        if(tabLayout$Tab1 != tabLayout$Tab0) {
            int v1 = tabLayout$Tab0 == null ? -1 : tabLayout$Tab0.b;
            if(z) {
                if(tabLayout$Tab1 != null && tabLayout$Tab1.b != -1 || v1 == -1) {
                    this.c(v1);
                }
                else {
                    this.m(v1, 0.0f, true, true);
                }
                if(v1 != -1) {
                    this.setSelectedTabView(v1);
                }
            }
            this.c0 = tabLayout$Tab0;
            if(tabLayout$Tab1 != null) {
                for(int v2 = arrayList0.size() - 1; v2 >= 0; --v2) {
                    ((BaseOnTabSelectedListener)arrayList0.get(v2)).getClass();
                }
            }
            if(tabLayout$Tab0 != null) {
                for(int v3 = arrayList0.size() - 1; v3 >= 0; --v3) {
                    ((BaseOnTabSelectedListener)arrayList0.get(v3)).a(tabLayout$Tab0);
                }
            }
        }
        else if(tabLayout$Tab1 != null) {
            for(int v = arrayList0.size() - 1; v >= 0; --v) {
                ((BaseOnTabSelectedListener)arrayList0.get(v)).getClass();
            }
            this.c(tabLayout$Tab0.b);
        }
    }

    public final void l(PagerAdapter pagerAdapter0, boolean z) {
        if(this.K0 != null && this.L0 != null) {
            throw null;
        }
        this.K0 = pagerAdapter0;
        if(z && pagerAdapter0 != null) {
            if(this.L0 == null) {
                this.L0 = new J6.d(0, this);
            }
            throw null;
        }
        this.i();
    }

    public final void m(int v, float f, boolean z, boolean z1) {
        int v1 = Math.round(((float)v) + f);
        if(v1 >= 0) {
            g g0 = this.d0;
            if(v1 < g0.getChildCount()) {
                if(z1) {
                    if(g0.b0 != null && g0.b0.isRunning()) {
                        g0.b0.cancel();
                    }
                    g0.c0 = v;
                    g0.d0 = f;
                    g0.b(g0.getChildAt(v), g0.getChildAt(g0.c0 + 1), g0.d0);
                }
                if(this.I0 != null && this.I0.isRunning()) {
                    this.I0.cancel();
                }
                this.scrollTo(this.e(v, f), 0);
                if(z) {
                    this.setSelectedTabView(v1);
                }
            }
        }
    }

    public final void n(int v, int v1) {
        this.setTabTextColors(new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{v1, v}));
    }

    public final void o(ViewPager viewPager0, boolean z) {
        if(this.J0 != null) {
            if(this.M0 != null) {
                throw null;
            }
            if(this.N0 != null) {
                this.J0.getClass();
                throw null;
            }
        }
        c c0 = this.H0;
        if(c0 != null) {
            this.G0.remove(c0);
            this.H0 = null;
        }
        if(viewPager0 != null) {
            this.J0 = viewPager0;
            if(this.M0 == null) {
                this.M0 = new a(this);
            }
            this.M0.c = 0;
            this.M0.b = 0;
            throw null;
        }
        this.J0 = null;
        this.l(null, false);
        this.O0 = z;
    }

    @Override  // android.view.ViewGroup
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable0 = this.getBackground();
        if(drawable0 instanceof MaterialShapeDrawable) {
            h.i0(this, ((MaterialShapeDrawable)drawable0));
        }
        if(this.J0 == null) {
            ViewParent viewParent0 = this.getParent();
            if(viewParent0 instanceof ViewPager) {
                this.o(((ViewPager)viewParent0), true);
            }
        }
    }

    @Override  // android.view.ViewGroup
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if(this.O0) {
            this.setupWithViewPager(null);
            this.O0 = false;
        }
    }

    @Override  // android.view.View
    public final void onDraw(Canvas canvas0) {
        for(int v = 0; true; ++v) {
            g g0 = this.d0;
            if(v >= g0.getChildCount()) {
                break;
            }
            View view0 = g0.getChildAt(v);
            if(view0 instanceof com.google.android.material.tabs.b) {
                Drawable drawable0 = ((com.google.android.material.tabs.b)view0).j0;
                if(drawable0 != null) {
                    drawable0.setBounds(((com.google.android.material.tabs.b)view0).getLeft(), ((com.google.android.material.tabs.b)view0).getTop(), ((com.google.android.material.tabs.b)view0).getRight(), ((com.google.android.material.tabs.b)view0).getBottom());
                    ((com.google.android.material.tabs.b)view0).j0.draw(canvas0);
                }
            }
        }
        super.onDraw(canvas0);
    }

    @Override  // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        accessibilityNodeInfo0.setCollectionInfo(((AccessibilityNodeInfo.CollectionInfo)I5.h.r(1, this.getTabCount(), 1).Y));
    }

    @Override  // android.widget.HorizontalScrollView
    public final void onMeasure(int v, int v1) {
        int v2 = Math.round(l.d(this.getContext(), this.getDefaultHeight()));
        switch(View.MeasureSpec.getMode(v1)) {
            case 0x80000000: {
                if(this.getChildCount() == 1 && View.MeasureSpec.getSize(v1) >= v2) {
                    this.getChildAt(0).setMinimumHeight(v2);
                }
                break;
            }
            case 0: {
                int v3 = this.getPaddingTop();
                v1 = View.MeasureSpec.makeMeasureSpec(this.getPaddingBottom() + (v3 + v2), 0x40000000);
            }
        }
        int v4 = View.MeasureSpec.getSize(v);
        if(View.MeasureSpec.getMode(v) != 0) {
            this.r0 = this.t0 > 0 ? this.t0 : ((int)(((float)v4) - l.d(this.getContext(), 56)));
        }
        super.onMeasure(v, v1);
        if(this.getChildCount() == 1) {
            View view0 = this.getChildAt(0);
            int v5 = this.z0;
            switch(v5) {
                case 0: {
                label_18:
                    if(view0.getMeasuredWidth() < this.getMeasuredWidth()) {
                        goto label_21;
                    }
                    break;
                }
                case 1: {
                    if(view0.getMeasuredWidth() != this.getMeasuredWidth()) {
                    label_21:
                        int v6 = this.getPaddingTop();
                        int v7 = ViewGroup.getChildMeasureSpec(v1, this.getPaddingBottom() + v6, view0.getLayoutParams().height);
                        view0.measure(View.MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 0x40000000), v7);
                    }
                    break;
                }
                default: {
                    if(v5 != 2) {
                        return;
                    }
                    goto label_18;
                }
            }
        }
    }

    public final void p(boolean z) {
        for(int v = 0; true; ++v) {
            g g0 = this.d0;
            if(v >= g0.getChildCount()) {
                break;
            }
            View view0 = g0.getChildAt(v);
            view0.setMinimumWidth(this.getTabMinWidth());
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = (LinearLayout.LayoutParams)view0.getLayoutParams();
            if(this.z0 != 1 || this.w0 != 0) {
                linearLayout$LayoutParams0.width = -2;
                linearLayout$LayoutParams0.weight = 0.0f;
            }
            else {
                linearLayout$LayoutParams0.width = 0;
                linearLayout$LayoutParams0.weight = 1.0f;
            }
            if(z) {
                view0.requestLayout();
            }
        }
    }

    @Override  // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable drawable0 = this.getBackground();
        if(drawable0 instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable)drawable0).i(f);
        }
    }

    public void setInlineLabel(boolean z) {
        if(this.A0 != z) {
            this.A0 = z;
            for(int v = 0; true; ++v) {
                g g0 = this.d0;
                if(v >= g0.getChildCount()) {
                    break;
                }
                View view0 = g0.getChildAt(v);
                if(view0 instanceof com.google.android.material.tabs.b) {
                    ((com.google.android.material.tabs.b)view0).setOrientation(!((com.google.android.material.tabs.b)view0).l0.A0);
                    TextView textView0 = ((com.google.android.material.tabs.b)view0).h0;
                    if(textView0 != null || ((com.google.android.material.tabs.b)view0).i0 != null) {
                        ((com.google.android.material.tabs.b)view0).f(textView0, ((com.google.android.material.tabs.b)view0).i0);
                    }
                    else {
                        ((com.google.android.material.tabs.b)view0).f(((com.google.android.material.tabs.b)view0).c0, ((com.google.android.material.tabs.b)view0).d0);
                    }
                }
            }
            this.d();
        }
    }

    public void setInlineLabelResource(int v) {
        this.setInlineLabel(this.getResources().getBoolean(v));
    }

    @Deprecated
    public void setOnTabSelectedListener(BaseOnTabSelectedListener tabLayout$BaseOnTabSelectedListener0) {
        BaseOnTabSelectedListener tabLayout$BaseOnTabSelectedListener1 = this.F0;
        if(tabLayout$BaseOnTabSelectedListener1 != null) {
            this.G0.remove(tabLayout$BaseOnTabSelectedListener1);
        }
        this.F0 = tabLayout$BaseOnTabSelectedListener0;
        if(tabLayout$BaseOnTabSelectedListener0 != null) {
            this.a(tabLayout$BaseOnTabSelectedListener0);
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(OnTabSelectedListener tabLayout$OnTabSelectedListener0) {
        this.setOnTabSelectedListener(tabLayout$OnTabSelectedListener0);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animator$AnimatorListener0) {
        this.f();
        this.I0.addListener(animator$AnimatorListener0);
    }

    public void setSelectedTabIndicator(int v) {
        if(v != 0) {
            this.setSelectedTabIndicator(q.v(this.getContext(), v));
            return;
        }
        this.setSelectedTabIndicator(null);
    }

    public void setSelectedTabIndicator(Drawable drawable0) {
        if(this.m0 != drawable0) {
            if(drawable0 == null) {
                drawable0 = new GradientDrawable();
            }
            this.m0 = drawable0;
        }
    }

    public void setSelectedTabIndicatorColor(int v) {
        this.n0 = v;
    }

    public void setSelectedTabIndicatorGravity(int v) {
        if(this.y0 != v) {
            this.y0 = v;
            this.d0.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int v) {
        Rect rect0 = this.d0.e0.m0.getBounds();
        this.d0.e0.m0.setBounds(rect0.left, 0, rect0.right, v);
        this.d0.requestLayout();
    }

    private void setSelectedTabView(int v) {
        g g0 = this.d0;
        int v1 = g0.getChildCount();
        if(v < v1) {
            for(int v2 = 0; v2 < v1; ++v2) {
                View view0 = g0.getChildAt(v2);
                boolean z = true;
                view0.setSelected(v2 == v);
                if(v2 != v) {
                    z = false;
                }
                view0.setActivated(z);
            }
        }
    }

    public void setTabGravity(int v) {
        if(this.w0 != v) {
            this.w0 = v;
            this.d();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList0) {
        if(this.k0 != colorStateList0) {
            this.k0 = colorStateList0;
            ArrayList arrayList0 = this.b0;
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                com.google.android.material.tabs.b b0 = ((Tab)arrayList0.get(v1)).e;
                if(b0 != null) {
                    b0.d();
                }
            }
        }
    }

    public void setTabIconTintResource(int v) {
        this.setTabIconTint(q.t(this.getContext(), v));
    }

    public void setTabIndicatorAnimationMode(int v) {
        this.C0 = v;
        switch(v) {
            case 0: {
                this.E0 = new d(4);
                return;
            }
            case 1: {
                this.E0 = new J6.a(4);  // initializer: Lv7/d;-><init>(I)V
                return;
            }
            default: {
                throw new IllegalArgumentException(v + " is not a valid TabIndicatorAnimationMode");
            }
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.B0 = z;
        this.d0.postInvalidateOnAnimation();
    }

    public void setTabMode(int v) {
        if(v != this.z0) {
            this.z0 = v;
            this.d();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList0) {
        if(this.l0 != colorStateList0) {
            this.l0 = colorStateList0;
            for(int v = 0; true; ++v) {
                g g0 = this.d0;
                if(v >= g0.getChildCount()) {
                    break;
                }
                View view0 = g0.getChildAt(v);
                if(view0 instanceof com.google.android.material.tabs.b) {
                    ((com.google.android.material.tabs.b)view0).e(this.getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int v) {
        this.setTabRippleColor(q.t(this.getContext(), v));
    }

    public void setTabTextColors(ColorStateList colorStateList0) {
        if(this.j0 != colorStateList0) {
            this.j0 = colorStateList0;
            ArrayList arrayList0 = this.b0;
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                com.google.android.material.tabs.b b0 = ((Tab)arrayList0.get(v1)).e;
                if(b0 != null) {
                    b0.d();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(PagerAdapter pagerAdapter0) {
        this.l(pagerAdapter0, false);
    }

    public void setUnboundedRipple(boolean z) {
        if(this.D0 != z) {
            this.D0 = z;
            for(int v = 0; true; ++v) {
                g g0 = this.d0;
                if(v >= g0.getChildCount()) {
                    break;
                }
                View view0 = g0.getChildAt(v);
                if(view0 instanceof com.google.android.material.tabs.b) {
                    ((com.google.android.material.tabs.b)view0).e(this.getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int v) {
        this.setUnboundedRipple(this.getResources().getBoolean(v));
    }

    public void setupWithViewPager(ViewPager viewPager0) {
        this.o(viewPager0, false);
    }

    @Override  // android.widget.HorizontalScrollView
    public final boolean shouldDelayChildPressedState() {
        return this.getTabScrollRange() > 0;
    }
}

