package com.google.android.material.tabs;

import B3.c;
import B6.j;
import B6.l;
import Bb.F;
import Bb.q;
import F1.d;
import F1.i;
import F6.a;
import J1.G;
import J6.h;
import a5.w;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.text.Layout;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.badge.BadgeDrawable.SavedState;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.ref.WeakReference;

public final class b extends LinearLayout {
    public Tab b0;
    public TextView c0;
    public ImageView d0;
    public View e0;
    public BadgeDrawable f0;
    public View g0;
    public TextView h0;
    public ImageView i0;
    public Drawable j0;
    public int k0;
    public final TabLayout l0;
    public static final int m0;

    public b(TabLayout tabLayout0, Context context0) {
        this.l0 = tabLayout0;
        super(context0);
        this.k0 = 2;
        this.e(context0);
        this.setPaddingRelative(tabLayout0.e0, tabLayout0.f0, tabLayout0.g0, tabLayout0.h0);
        this.setGravity(17);
        this.setOrientation(!tabLayout0.A0);
        this.setClickable(true);
        Context context1 = this.getContext();
        int v = Build.VERSION.SDK_INT;
        c c0 = v < 24 ? new c(7, null) : new c(7, d.g(context1));
        if(v >= 24) {
            G.a(this, i.l(((PointerIcon)c0.Y)));
        }
    }

    public final void a() {
        if(this.f0 != null) {
            this.setClipChildren(true);
            this.setClipToPadding(true);
            ViewGroup viewGroup0 = (ViewGroup)this.getParent();
            if(viewGroup0 != null) {
                viewGroup0.setClipChildren(true);
                viewGroup0.setClipToPadding(true);
            }
            View view0 = this.e0;
            if(view0 != null) {
                BadgeDrawable badgeDrawable0 = this.f0;
                if(badgeDrawable0 != null) {
                    if((badgeDrawable0.n0 == null ? null : ((FrameLayout)badgeDrawable0.n0.get())) == null) {
                        view0.getOverlay().remove(badgeDrawable0);
                    }
                    else {
                        (badgeDrawable0.n0 == null ? null : ((FrameLayout)badgeDrawable0.n0.get())).setForeground(null);
                    }
                }
                this.e0 = null;
            }
        }
    }

    public final void b() {
        if(this.f0 != null) {
            if(this.g0 != null) {
                this.a();
                return;
            }
            TextView textView0 = this.c0;
            if(textView0 == null || this.b0 == null) {
                this.a();
            }
            else {
                if(this.e0 == textView0) {
                    this.c(textView0);
                    return;
                }
                this.a();
                TextView textView1 = this.c0;
                if(this.f0 != null && textView1 != null) {
                    this.setClipChildren(false);
                    this.setClipToPadding(false);
                    ViewGroup viewGroup0 = (ViewGroup)this.getParent();
                    if(viewGroup0 != null) {
                        viewGroup0.setClipChildren(false);
                        viewGroup0.setClipToPadding(false);
                    }
                    BadgeDrawable badgeDrawable0 = this.f0;
                    Rect rect0 = new Rect();
                    textView1.getDrawingRect(rect0);
                    badgeDrawable0.setBounds(rect0);
                    FrameLayout frameLayout0 = null;
                    badgeDrawable0.e(textView1, null);
                    if((badgeDrawable0.n0 == null ? null : ((FrameLayout)badgeDrawable0.n0.get())) == null) {
                        textView1.getOverlay().add(badgeDrawable0);
                    }
                    else {
                        WeakReference weakReference0 = badgeDrawable0.n0;
                        if(weakReference0 != null) {
                            frameLayout0 = (FrameLayout)weakReference0.get();
                        }
                        frameLayout0.setForeground(badgeDrawable0);
                    }
                    this.e0 = textView1;
                }
            }
        }
    }

    public final void c(View view0) {
        BadgeDrawable badgeDrawable0 = this.f0;
        if(badgeDrawable0 != null && view0 == this.e0) {
            Rect rect0 = new Rect();
            view0.getDrawingRect(rect0);
            badgeDrawable0.setBounds(rect0);
            badgeDrawable0.e(view0, null);
        }
    }

    public final void d() {
        Tab tabLayout$Tab0 = this.b0;
        View view0 = tabLayout$Tab0 == null ? null : tabLayout$Tab0.c;
        if(view0 == null) {
            View view1 = this.g0;
            if(view1 != null) {
                this.removeView(view1);
                this.g0 = null;
            }
            this.h0 = null;
            this.i0 = null;
        }
        else {
            ViewParent viewParent0 = view0.getParent();
            if(viewParent0 != this) {
                if(viewParent0 != null) {
                    ((ViewGroup)viewParent0).removeView(view0);
                }
                this.addView(view0);
            }
            this.g0 = view0;
            TextView textView0 = this.c0;
            if(textView0 != null) {
                textView0.setVisibility(8);
            }
            ImageView imageView0 = this.d0;
            if(imageView0 != null) {
                imageView0.setVisibility(8);
                this.d0.setImageDrawable(null);
            }
            TextView textView1 = (TextView)view0.findViewById(0x1020014);
            this.h0 = textView1;
            if(textView1 != null) {
                this.k0 = textView1.getMaxLines();
            }
            this.i0 = (ImageView)view0.findViewById(0x1020006);
        }
        boolean z = false;
        if(this.g0 == null) {
            if(this.d0 == null) {
                ImageView imageView1 = (ImageView)LayoutInflater.from(this.getContext()).inflate(0x7F0D0043, this, false);  // layout:design_layout_tab_icon
                this.d0 = imageView1;
                this.addView(imageView1, 0);
            }
            if(this.c0 == null) {
                TextView textView2 = (TextView)LayoutInflater.from(this.getContext()).inflate(0x7F0D0044, this, false);  // layout:design_layout_tab_text
                this.c0 = textView2;
                this.addView(textView2);
                this.k0 = this.c0.getMaxLines();
            }
            this.c0.setTextAppearance(this.l0.i0);
            ColorStateList colorStateList0 = this.l0.j0;
            if(colorStateList0 != null) {
                this.c0.setTextColor(colorStateList0);
            }
            this.f(this.c0, this.d0);
            this.b();
            ImageView imageView2 = this.d0;
            if(imageView2 != null) {
                imageView2.addOnLayoutChangeListener(new h(this, imageView2));
            }
            TextView textView3 = this.c0;
            if(textView3 != null) {
                textView3.addOnLayoutChangeListener(new h(this, textView3));
            }
        }
        else {
            TextView textView4 = this.h0;
            if(textView4 != null || this.i0 != null) {
                this.f(textView4, this.i0);
            }
        }
        if(tabLayout$Tab0 != null && !TextUtils.isEmpty(null)) {
            this.setContentDescription(null);
        }
        if(tabLayout$Tab0 != null) {
            TabLayout tabLayout0 = tabLayout$Tab0.d;
            if(tabLayout0 == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            if(tabLayout0.getSelectedTabPosition() == tabLayout$Tab0.b) {
                z = true;
            }
        }
        this.setSelected(z);
    }

    @Override  // android.view.ViewGroup
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] arr_v = this.getDrawableState();
        if((this.j0 == null || !this.j0.isStateful() ? false : this.j0.setState(arr_v))) {
            this.invalidate();
            this.l0.invalidate();
        }
    }

    public final void e(Context context0) {
        int v = 0;
        TabLayout tabLayout0 = this.l0;
        int v1 = tabLayout0.q0;
        GradientDrawable gradientDrawable0 = null;
        if(v1 == 0) {
            this.j0 = null;
        }
        else {
            Drawable drawable0 = q.v(context0, v1);
            this.j0 = drawable0;
            if(drawable0 != null && drawable0.isStateful()) {
                this.j0.setState(this.getDrawableState());
            }
        }
        GradientDrawable gradientDrawable1 = new GradientDrawable();
        gradientDrawable1.setColor(0);
        if(tabLayout0.l0 != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(0.00001f);
            gradientDrawable2.setColor(-1);
            ColorStateList colorStateList0 = tabLayout0.l0;
            int v2 = colorStateList0 == null ? 0 : colorStateList0.getColorForState(a.b, colorStateList0.getDefaultColor());
            int v3 = z1.a.e(v2, Math.min(Color.alpha(v2) * 2, 0xFF));
            int[][] arr2_v = {a.c, StateSet.NOTHING};
            int[] arr_v = a.a;
            if(colorStateList0 != null) {
                v = colorStateList0.getColorForState(arr_v, colorStateList0.getDefaultColor());
            }
            ColorStateList colorStateList1 = new ColorStateList(arr2_v, new int[]{v3, z1.a.e(v, Math.min(Color.alpha(v) * 2, 0xFF))});
            boolean z = tabLayout0.D0;
            if(z) {
                gradientDrawable1 = null;
            }
            if(!z) {
                gradientDrawable0 = gradientDrawable2;
            }
            gradientDrawable1 = new RippleDrawable(colorStateList1, gradientDrawable1, gradientDrawable0);
        }
        this.setBackground(gradientDrawable1);
        tabLayout0.invalidate();
    }

    public final void f(TextView textView0, ImageView imageView0) {
        CharSequence charSequence0 = null;
        CharSequence charSequence1 = this.b0 == null ? null : this.b0.a;
        if(imageView0 != null) {
            imageView0.setVisibility(8);
            imageView0.setImageDrawable(null);
        }
        boolean z = TextUtils.isEmpty(charSequence1);
        if(textView0 != null) {
            if(z) {
                textView0.setVisibility(8);
                textView0.setText(null);
            }
            else {
                textView0.setText(charSequence1);
                this.b0.getClass();
                textView0.setVisibility(0);
                this.setVisibility(0);
            }
        }
        if(imageView0 != null) {
            ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)imageView0.getLayoutParams();
            int v = z || imageView0.getVisibility() != 0 ? 0 : ((int)l.d(this.getContext(), 8));
            if(!this.l0.A0) {
                if(v != viewGroup$MarginLayoutParams0.bottomMargin) {
                    viewGroup$MarginLayoutParams0.bottomMargin = v;
                    viewGroup$MarginLayoutParams0.setMarginEnd(0);
                    imageView0.setLayoutParams(viewGroup$MarginLayoutParams0);
                    imageView0.requestLayout();
                }
            }
            else if(v != viewGroup$MarginLayoutParams0.getMarginEnd()) {
                viewGroup$MarginLayoutParams0.setMarginEnd(v);
                viewGroup$MarginLayoutParams0.bottomMargin = 0;
                imageView0.setLayoutParams(viewGroup$MarginLayoutParams0);
                imageView0.requestLayout();
            }
        }
        if(Build.VERSION.SDK_INT > 23) {
            if(!z) {
                charSequence0 = charSequence1;
            }
            w.i0(this, charSequence0);
        }
    }

    private BadgeDrawable getBadge() {
        return this.f0;
    }

    public int getContentHeight() {
        View[] arr_view = {this.c0, this.d0, this.g0};
        int v = 0;
        int v1 = 0;
        boolean z = false;
        for(int v2 = 0; v2 < 3; ++v2) {
            View view0 = arr_view[v2];
            if(view0 != null && view0.getVisibility() == 0) {
                v1 = z ? Math.min(v1, view0.getTop()) : view0.getTop();
                v = z ? Math.max(v, view0.getBottom()) : view0.getBottom();
                z = true;
            }
        }
        return v - v1;
    }

    public int getContentWidth() {
        View[] arr_view = {this.c0, this.d0, this.g0};
        int v = 0;
        int v1 = 0;
        boolean z = false;
        for(int v2 = 0; v2 < 3; ++v2) {
            View view0 = arr_view[v2];
            if(view0 != null && view0.getVisibility() == 0) {
                v1 = z ? Math.min(v1, view0.getLeft()) : view0.getLeft();
                v = z ? Math.max(v, view0.getRight()) : view0.getRight();
                z = true;
            }
        }
        return v - v1;
    }

    private BadgeDrawable getOrCreateBadge() {
        if(this.f0 == null) {
            Context context0 = this.getContext();
            BadgeDrawable badgeDrawable0 = new BadgeDrawable(context0);
            l.a(context0, null, 0x7F040058, 0x7F1302E2);  // attr:badgeStyle
            l.b(context0, null, p6.a.c, 0x7F040058, 0x7F1302E2, new int[0]);  // attr:badgeStyle
            TypedArray typedArray0 = context0.obtainStyledAttributes(null, p6.a.c, 0x7F040058, 0x7F1302E2);  // attr:badgeStyle
            int v = typedArray0.getInt(4, 4);
            SavedState badgeDrawable$SavedState0 = badgeDrawable0.f0;
            j j0 = badgeDrawable0.Z;
            if(badgeDrawable$SavedState0.c0 != v) {
                badgeDrawable$SavedState0.c0 = v;
                badgeDrawable0.i0 = ((int)Math.pow(10.0, ((double)v) - 1.0)) - 1;
                j0.d = true;
                badgeDrawable0.f();
                badgeDrawable0.invalidateSelf();
            }
            if(typedArray0.hasValue(5)) {
                int v1 = Math.max(0, typedArray0.getInt(5, 0));
                if(badgeDrawable$SavedState0.b0 != v1) {
                    badgeDrawable$SavedState0.b0 = v1;
                    j0.d = true;
                    badgeDrawable0.f();
                    badgeDrawable0.invalidateSelf();
                }
            }
            int v2 = F.w(context0, typedArray0, 0).getDefaultColor();
            badgeDrawable$SavedState0.X = v2;
            ColorStateList colorStateList0 = ColorStateList.valueOf(v2);
            MaterialShapeDrawable materialShapeDrawable0 = badgeDrawable0.Y;
            if(materialShapeDrawable0.X.c != colorStateList0) {
                materialShapeDrawable0.j(colorStateList0);
                badgeDrawable0.invalidateSelf();
            }
            if(typedArray0.hasValue(2)) {
                int v3 = F.w(context0, typedArray0, 2).getDefaultColor();
                badgeDrawable$SavedState0.Y = v3;
                if(j0.a.getColor() != v3) {
                    j0.a.setColor(v3);
                    badgeDrawable0.invalidateSelf();
                }
            }
            int v4 = typedArray0.getInt(1, 0x800035);
            if(badgeDrawable$SavedState0.g0 != v4) {
                badgeDrawable$SavedState0.g0 = v4;
                if(badgeDrawable0.m0 != null && badgeDrawable0.m0.get() != null) {
                    badgeDrawable0.e(((View)badgeDrawable0.m0.get()), (badgeDrawable0.n0 == null ? null : ((FrameLayout)badgeDrawable0.n0.get())));
                }
            }
            badgeDrawable$SavedState0.i0 = typedArray0.getDimensionPixelOffset(3, 0);
            badgeDrawable0.f();
            badgeDrawable$SavedState0.j0 = typedArray0.getDimensionPixelOffset(6, 0);
            badgeDrawable0.f();
            typedArray0.recycle();
            this.f0 = badgeDrawable0;
        }
        this.b();
        BadgeDrawable badgeDrawable1 = this.f0;
        if(badgeDrawable1 == null) {
            throw new IllegalStateException("Unable to create badge");
        }
        return badgeDrawable1;
    }

    public Tab getTab() {
        return this.b0;
    }

    @Override  // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        if(this.f0 != null && this.f0.isVisible()) {
            CharSequence charSequence0 = this.getContentDescription();
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append(charSequence0);
            stringBuilder0.append(", ");
            BadgeDrawable badgeDrawable0 = this.f0;
            Object object0 = null;
            if(badgeDrawable0.isVisible()) {
                SavedState badgeDrawable$SavedState0 = badgeDrawable0.f0;
                if(!badgeDrawable0.d()) {
                    object0 = badgeDrawable$SavedState0.d0;
                }
                else if(badgeDrawable$SavedState0.e0 > 0) {
                    Context context0 = (Context)badgeDrawable0.X.get();
                    if(context0 != null) {
                        int v = badgeDrawable0.i0;
                        object0 = badgeDrawable0.c() <= v ? context0.getResources().getQuantityString(badgeDrawable$SavedState0.e0, badgeDrawable0.c(), new Object[]{badgeDrawable0.c()}) : context0.getString(badgeDrawable$SavedState0.f0, new Object[]{v});
                    }
                }
            }
            stringBuilder0.append(object0);
            accessibilityNodeInfo0.setContentDescription(stringBuilder0.toString());
        }
        int v1 = this.b0.b;
        accessibilityNodeInfo0.setCollectionItemInfo(((AccessibilityNodeInfo.CollectionItemInfo)U7.c.t(this.isSelected(), 0, 1, v1, 1).Y));
        if(this.isSelected()) {
            accessibilityNodeInfo0.setClickable(false);
            accessibilityNodeInfo0.removeAction(((AccessibilityNodeInfo.AccessibilityAction)K1.c.e.a));
        }
        accessibilityNodeInfo0.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", "Tab");
    }

    @Override  // android.widget.LinearLayout
    public final void onMeasure(int v, int v1) {
        int v2 = View.MeasureSpec.getSize(v);
        int v3 = View.MeasureSpec.getMode(v);
        TabLayout tabLayout0 = this.l0;
        int v4 = tabLayout0.getTabMaxWidth();
        if(v4 > 0 && (v3 == 0 || v2 > v4)) {
            v = View.MeasureSpec.makeMeasureSpec(tabLayout0.r0, 0x80000000);
        }
        super.onMeasure(v, v1);
        if(this.c0 != null) {
            float f = tabLayout0.o0;
            int v5 = this.k0;
            if(this.d0 != null && this.d0.getVisibility() == 0) {
                v5 = 1;
            }
            else if(this.c0 != null && this.c0.getLineCount() > 1) {
                f = tabLayout0.p0;
            }
            float f1 = this.c0.getTextSize();
            int v6 = this.c0.getLineCount();
            int v7 = this.c0.getMaxLines();
            int v8 = Float.compare(f, f1);
            if(v8 != 0 || v7 >= 0 && v5 != v7) {
                if(tabLayout0.z0 != 1 || v8 <= 0 || v6 != 1) {
                    this.c0.setTextSize(0, f);
                    this.c0.setMaxLines(v5);
                    super.onMeasure(v, v1);
                }
                else {
                    Layout layout0 = this.c0.getLayout();
                    if(layout0 != null) {
                        float f2 = layout0.getLineWidth(0);
                        if(f / layout0.getPaint().getTextSize() * f2 <= ((float)(this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight()))) {
                            this.c0.setTextSize(0, f);
                            this.c0.setMaxLines(v5);
                            super.onMeasure(v, v1);
                        }
                    }
                }
            }
        }
    }

    @Override  // android.view.View
    public final boolean performClick() {
        boolean z = super.performClick();
        if(this.b0 != null) {
            if(!z) {
                this.playSoundEffect(0);
            }
            Tab tabLayout$Tab0 = this.b0;
            TabLayout tabLayout0 = tabLayout$Tab0.d;
            if(tabLayout0 == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout0.k(tabLayout$Tab0, true);
            return true;
        }
        return z;
    }

    @Override  // android.view.View
    public void setSelected(boolean z) {
        this.isSelected();
        super.setSelected(z);
        TextView textView0 = this.c0;
        if(textView0 != null) {
            textView0.setSelected(z);
        }
        ImageView imageView0 = this.d0;
        if(imageView0 != null) {
            imageView0.setSelected(z);
        }
        View view0 = this.g0;
        if(view0 != null) {
            view0.setSelected(z);
        }
    }

    public void setTab(Tab tabLayout$Tab0) {
        if(tabLayout$Tab0 != this.b0) {
            this.b0 = tabLayout$Tab0;
            this.d();
        }
    }
}

