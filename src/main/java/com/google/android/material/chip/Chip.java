package com.google.android.material.chip;

import A1.d;
import B6.h;
import B6.j;
import B6.l;
import Bb.F;
import Bb.q;
import H6.t;
import J1.E;
import J1.N;
import L6.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView.BufferType;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.shape.ShapeAppearanceModel;
import io.sentry.android.core.internal.util.g;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Locale;
import o.m;
import x6.b;
import x6.c;

public class Chip extends m implements t, c {
    public ChipDrawable f0;
    public InsetDrawable g0;
    public RippleDrawable h0;
    public View.OnClickListener i0;
    public CompoundButton.OnCheckedChangeListener j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public int p0;
    public int q0;
    public final b r0;
    public final Rect s0;
    public final RectF t0;
    public final h u0;
    public static final Rect v0;
    public static final int[] w0;
    public static final int[] x0;

    static {
        Chip.v0 = new Rect();
        Chip.w0 = new int[]{0x10100A1};
        Chip.x0 = new int[]{0x101009F};
    }

    public Chip(Context context0, AttributeSet attributeSet0) {
        super(a.a(context0, attributeSet0, 0x7F0400C9, 0x7F1302F9), attributeSet0, 0x7F0400C9);  // attr:chipStyle
        MotionSpec motionSpec1;
        MotionSpec motionSpec0;
        TextAppearance textAppearance0;
        this.s0 = new Rect();
        this.t0 = new RectF();
        this.u0 = new h(1, this);
        Context context1 = this.getContext();
        if(attributeSet0 != null) {
            if(attributeSet0.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if(attributeSet0.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if(attributeSet0.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if(attributeSet0.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null || attributeSet0.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if(!attributeSet0.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet0.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet0.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet0.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if(attributeSet0.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 0x800013) != 0x800013) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        ChipDrawable chipDrawable0 = new ChipDrawable(context1, attributeSet0);
        int[] arr_v = p6.a.e;
        TypedArray typedArray0 = l.f(chipDrawable0.c1, attributeSet0, arr_v, 0x7F0400C9, 0x7F1302F9, new int[0]);  // attr:chipStyle
        chipDrawable0.C1 = typedArray0.hasValue(37);
        Context context2 = chipDrawable0.c1;
        ColorStateList colorStateList0 = F.w(context2, typedArray0, 24);
        if(chipDrawable0.v0 != colorStateList0) {
            chipDrawable0.v0 = colorStateList0;
            chipDrawable0.onStateChange(chipDrawable0.getState());
        }
        ColorStateList colorStateList1 = F.w(context2, typedArray0, 11);
        if(chipDrawable0.w0 != colorStateList1) {
            chipDrawable0.w0 = colorStateList1;
            chipDrawable0.onStateChange(chipDrawable0.getState());
        }
        float f = typedArray0.getDimension(19, 0.0f);
        if(chipDrawable0.x0 != f) {
            chipDrawable0.x0 = f;
            chipDrawable0.invalidateSelf();
            chipDrawable0.u();
        }
        if(typedArray0.hasValue(12)) {
            chipDrawable0.A(typedArray0.getDimension(12, 0.0f));
        }
        chipDrawable0.F(F.w(context2, typedArray0, 22));
        chipDrawable0.G(typedArray0.getDimension(23, 0.0f));
        chipDrawable0.P(F.w(context2, typedArray0, 36));
        CharSequence charSequence0 = typedArray0.getText(5);
        if(charSequence0 == null) {
            charSequence0 = "";
        }
        boolean z = TextUtils.equals(chipDrawable0.C0, charSequence0);
        j j0 = chipDrawable0.i1;
        if(!z) {
            chipDrawable0.C0 = charSequence0;
            j0.d = true;
            chipDrawable0.invalidateSelf();
            chipDrawable0.u();
        }
        if(typedArray0.hasValue(0)) {
            int v = typedArray0.getResourceId(0, 0);
            textAppearance0 = v == 0 ? null : new TextAppearance(context2, v);
        }
        else {
            textAppearance0 = null;
        }
        textAppearance0.k = typedArray0.getDimension(1, textAppearance0.k);
        j0.b(textAppearance0, context2);
        int v1 = typedArray0.getInt(3, 0);
        if(v1 == 1) {
            chipDrawable0.z1 = TextUtils.TruncateAt.START;
        }
        else {
            switch(v1) {
                case 2: {
                    chipDrawable0.z1 = TextUtils.TruncateAt.MIDDLE;
                    break;
                }
                case 3: {
                    chipDrawable0.z1 = TextUtils.TruncateAt.END;
                }
            }
        }
        chipDrawable0.E(typedArray0.getBoolean(18, false));
        if(attributeSet0 != null && attributeSet0.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet0.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            chipDrawable0.E(typedArray0.getBoolean(15, false));
        }
        chipDrawable0.B(F.x(context2, typedArray0, 14));
        if(typedArray0.hasValue(17)) {
            chipDrawable0.D(F.w(context2, typedArray0, 17));
        }
        chipDrawable0.C(typedArray0.getDimension(16, -1.0f));
        chipDrawable0.M(typedArray0.getBoolean(0x1F, false));
        if(attributeSet0 != null && attributeSet0.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet0.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            chipDrawable0.M(typedArray0.getBoolean(26, false));
        }
        chipDrawable0.H(F.x(context2, typedArray0, 25));
        chipDrawable0.L(F.w(context2, typedArray0, 30));
        chipDrawable0.J(typedArray0.getDimension(28, 0.0f));
        chipDrawable0.w(typedArray0.getBoolean(6, false));
        chipDrawable0.z(typedArray0.getBoolean(10, false));
        if(attributeSet0 != null && attributeSet0.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet0.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            chipDrawable0.z(typedArray0.getBoolean(8, false));
        }
        chipDrawable0.x(F.x(context2, typedArray0, 7));
        if(typedArray0.hasValue(9)) {
            chipDrawable0.y(F.w(context2, typedArray0, 9));
        }
        if(typedArray0.hasValue(39)) {
            int v2 = typedArray0.getResourceId(39, 0);
            motionSpec0 = v2 == 0 ? null : MotionSpec.a(context2, v2);
        }
        else {
            motionSpec0 = null;
        }
        chipDrawable0.S0 = motionSpec0;
        if(typedArray0.hasValue(33)) {
            int v3 = typedArray0.getResourceId(33, 0);
            motionSpec1 = v3 == 0 ? null : MotionSpec.a(context2, v3);
        }
        else {
            motionSpec1 = null;
        }
        chipDrawable0.T0 = motionSpec1;
        float f1 = typedArray0.getDimension(21, 0.0f);
        if(chipDrawable0.U0 != f1) {
            chipDrawable0.U0 = f1;
            chipDrawable0.invalidateSelf();
            chipDrawable0.u();
        }
        chipDrawable0.O(typedArray0.getDimension(35, 0.0f));
        chipDrawable0.N(typedArray0.getDimension(34, 0.0f));
        float f2 = typedArray0.getDimension(41, 0.0f);
        if(chipDrawable0.X0 != f2) {
            chipDrawable0.X0 = f2;
            chipDrawable0.invalidateSelf();
            chipDrawable0.u();
        }
        float f3 = typedArray0.getDimension(40, 0.0f);
        if(chipDrawable0.Y0 != f3) {
            chipDrawable0.Y0 = f3;
            chipDrawable0.invalidateSelf();
            chipDrawable0.u();
        }
        chipDrawable0.K(typedArray0.getDimension(29, 0.0f));
        chipDrawable0.I(typedArray0.getDimension(27, 0.0f));
        float f4 = typedArray0.getDimension(13, 0.0f);
        if(chipDrawable0.b1 != f4) {
            chipDrawable0.b1 = f4;
            chipDrawable0.invalidateSelf();
            chipDrawable0.u();
        }
        chipDrawable0.B1 = typedArray0.getDimensionPixelSize(4, 0x7FFFFFFF);
        typedArray0.recycle();
        l.a(context1, attributeSet0, 0x7F0400C9, 0x7F1302F9);  // attr:chipStyle
        l.b(context1, attributeSet0, arr_v, 0x7F0400C9, 0x7F1302F9, new int[0]);  // attr:chipStyle
        TypedArray typedArray1 = context1.obtainStyledAttributes(attributeSet0, arr_v, 0x7F0400C9, 0x7F1302F9);  // attr:chipStyle
        this.o0 = typedArray1.getBoolean(0x20, false);
        this.q0 = (int)Math.ceil(typedArray1.getDimension(20, ((float)Math.ceil(l.d(this.getContext(), 0x30)))));
        typedArray1.recycle();
        this.setChipDrawable(chipDrawable0);
        chipDrawable0.i(E.e(this));
        l.a(context1, attributeSet0, 0x7F0400C9, 0x7F1302F9);  // attr:chipStyle
        l.b(context1, attributeSet0, arr_v, 0x7F0400C9, 0x7F1302F9, new int[0]);  // attr:chipStyle
        TypedArray typedArray2 = context1.obtainStyledAttributes(attributeSet0, arr_v, 0x7F0400C9, 0x7F1302F9);  // attr:chipStyle
        boolean z1 = typedArray2.hasValue(37);
        typedArray2.recycle();
        this.r0 = new b(this, this);
        this.f();
        if(!z1) {
            this.setOutlineProvider(new x6.a(this));
        }
        this.setChecked(this.k0);
        this.setText(chipDrawable0.C0);
        this.setEllipsize(chipDrawable0.z1);
        this.i();
        if(!this.f0.A1) {
            this.setLines(1);
            this.setHorizontallyScrolling(true);
        }
        this.setGravity(0x800013);
        this.h();
        if(this.o0) {
            this.setMinHeight(this.q0);
        }
        this.p0 = this.getLayoutDirection();
    }

    public final void c(int v) {
        this.q0 = v;
        int v1 = 0;
        if(!this.o0) {
            if(this.g0 != null) {
                this.g0 = null;
                this.setMinWidth(0);
                this.setMinHeight(((int)this.getChipMinHeight()));
                this.g();
                return;
            }
            this.g();
            return;
        }
        int v2 = Math.max(0, v - ((int)this.f0.x0));
        int v3 = Math.max(0, v - this.f0.getIntrinsicWidth());
        if(v3 <= 0 && v2 <= 0) {
            if(this.g0 != null) {
                this.g0 = null;
                this.setMinWidth(0);
                this.setMinHeight(((int)this.getChipMinHeight()));
                this.g();
                return;
            }
            this.g();
            return;
        }
        int v4 = v3 <= 0 ? 0 : v3 / 2;
        if(v2 > 0) {
            v1 = v2 / 2;
        }
        if(this.g0 != null) {
            Rect rect0 = new Rect();
            this.g0.getPadding(rect0);
            if(rect0.top == v1 && rect0.bottom == v1 && rect0.left == v4 && rect0.right == v4) {
                this.g();
                return;
            }
        }
        if(this.getMinHeight() != v) {
            this.setMinHeight(v);
        }
        if(this.getMinWidth() != v) {
            this.setMinWidth(v);
        }
        this.g0 = new InsetDrawable(this.f0, v4, v1, v4, v1);
        this.g();
    }

    public final boolean d() {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            Drawable drawable0 = chipDrawable0.J0;
            if(drawable0 == null) {
                drawable0 = null;
            }
            else if(drawable0 instanceof d) {
                d d0 = (d)drawable0;
                return false;
            }
            return drawable0 != null;
        }
        return false;
    }

    @Override  // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent0) {
        Class class0 = Q1.a.class;
        int v = motionEvent0.getAction();
        b b0 = this.r0;
        if(v == 10) {
            try {
                Field field0 = class0.getDeclaredField("m");
                field0.setAccessible(true);
                if(((int)(((Integer)field0.get(b0)))) != 0x80000000) {
                    Method method0 = class0.getDeclaredMethod("s", Integer.TYPE);
                    method0.setAccessible(true);
                    method0.invoke(b0, 0x80000000);
                    return true;
                }
            }
            catch(NoSuchMethodException noSuchMethodException0) {
                Log.e("Chip", "Unable to send Accessibility Exit event", noSuchMethodException0);
                return b0.l(motionEvent0) || super.dispatchHoverEvent(motionEvent0);
            }
            catch(IllegalAccessException illegalAccessException0) {
                Log.e("Chip", "Unable to send Accessibility Exit event", illegalAccessException0);
                return b0.l(motionEvent0) || super.dispatchHoverEvent(motionEvent0);
            }
            catch(InvocationTargetException invocationTargetException0) {
                Log.e("Chip", "Unable to send Accessibility Exit event", invocationTargetException0);
                return b0.l(motionEvent0) || super.dispatchHoverEvent(motionEvent0);
            }
            catch(NoSuchFieldException noSuchFieldException0) {
                Log.e("Chip", "Unable to send Accessibility Exit event", noSuchFieldException0);
                return b0.l(motionEvent0) || super.dispatchHoverEvent(motionEvent0);
            }
        }
        return b0.l(motionEvent0) || super.dispatchHoverEvent(motionEvent0);
    }

    @Override  // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        b b0 = this.r0;
        b0.getClass();
        int v = 0;
        if(keyEvent0.getAction() != 1) {
            int v1 = 66;
            int v2 = keyEvent0.getKeyCode();
            switch(v2) {
                case 19: 
                case 20: 
                case 21: 
                case 22: {
                    if(keyEvent0.hasNoModifiers()) {
                        switch(v2) {
                            case 19: {
                                v1 = 33;
                                break;
                            }
                            case 21: {
                                v1 = 17;
                                break;
                            }
                            case 22: {
                                break;
                            }
                            default: {
                                v1 = 130;
                            }
                        }
                        int v3 = keyEvent0.getRepeatCount();
                        boolean z;
                        for(z = false; v < v3 + 1 && b0.n(v1, null); z = true) {
                            ++v;
                        }
                        return !z || b0.l == 0x80000000 ? super.dispatchKeyEvent(keyEvent0) : true;
                    }
                    break;
                }
                case 61: {
                    if(keyEvent0.hasNoModifiers()) {
                        return b0.n(2, null) == 0 || b0.l == 0x80000000 ? super.dispatchKeyEvent(keyEvent0) : true;
                    }
                    if(keyEvent0.hasModifiers(1)) {
                        v = b0.n(1, null);
                    }
                    break;
                }
                case 23: 
                case 66: {
                    if(keyEvent0.hasNoModifiers() && keyEvent0.getRepeatCount() == 0) {
                        int v4 = b0.l;
                        if(v4 != 0x80000000) {
                            Chip chip0 = b0.q;
                            if(v4 == 0) {
                                chip0.performClick();
                                return b0.l == 0x80000000 ? super.dispatchKeyEvent(keyEvent0) : true;
                            }
                            if(v4 == 1) {
                                chip0.playSoundEffect(0);
                                View.OnClickListener view$OnClickListener0 = chip0.i0;
                                if(view$OnClickListener0 != null) {
                                    view$OnClickListener0.onClick(chip0);
                                }
                                chip0.r0.r(1, 1);
                            }
                        }
                        return b0.l == 0x80000000 ? super.dispatchKeyEvent(keyEvent0) : true;
                    }
                    break;
                }
                default: {
                    return super.dispatchKeyEvent(keyEvent0);
                }
            }
        }
        return v == 0 || b0.l == 0x80000000 ? super.dispatchKeyEvent(keyEvent0) : true;
    }

    @Override  // o.m
    public final void drawableStateChanged() {
        int v1;
        super.drawableStateChanged();
        boolean z = false;
        if(this.f0 != null && ChipDrawable.t(this.f0.J0)) {
            ChipDrawable chipDrawable0 = this.f0;
            int v = this.isEnabled();
            if(this.n0) {
                ++v;
            }
            if(this.m0) {
                ++v;
            }
            if(this.l0) {
                ++v;
            }
            if(this.isChecked()) {
                ++v;
            }
            int[] arr_v = new int[v];
            if(this.isEnabled()) {
                arr_v[0] = 0x101009E;
                v1 = 1;
            }
            else {
                v1 = 0;
            }
            if(this.n0) {
                arr_v[v1] = 0x101009C;
                ++v1;
            }
            if(this.m0) {
                arr_v[v1] = 0x1010367;
                ++v1;
            }
            if(this.l0) {
                arr_v[v1] = 0x10100A7;
                ++v1;
            }
            if(this.isChecked()) {
                arr_v[v1] = 0x10100A1;
            }
            if(!Arrays.equals(chipDrawable0.w1, arr_v)) {
                chipDrawable0.w1 = arr_v;
                if(chipDrawable0.S()) {
                    z = chipDrawable0.v(chipDrawable0.getState(), arr_v);
                }
            }
        }
        if(z) {
            this.invalidate();
        }
    }

    public final boolean e() {
        return this.f0 != null && this.f0.O0;
    }

    public final void f() {
        if(this.d() && (this.f0 != null && this.f0.I0 && this.i0 != null)) {
            N.k(this, this.r0);
            return;
        }
        N.k(this, null);
    }

    public final void g() {
        this.h0 = new RippleDrawable(F6.a.a(this.f0.B0), this.getBackgroundDrawable(), null);
        this.f0.getClass();
        this.setBackground(this.h0);
        this.h();
    }

    public Drawable getBackgroundDrawable() {
        Drawable drawable0 = this.g0;
        return drawable0 == null ? this.f0 : drawable0;
    }

    public Drawable getCheckedIcon() {
        return this.f0 == null ? null : this.f0.Q0;
    }

    public ColorStateList getCheckedIconTint() {
        return this.f0 == null ? null : this.f0.R0;
    }

    public ColorStateList getChipBackgroundColor() {
        return this.f0 == null ? null : this.f0.w0;
    }

    public float getChipCornerRadius() {
        return this.f0 == null ? 0.0f : Math.max(0.0f, this.f0.r());
    }

    public Drawable getChipDrawable() {
        return this.f0;
    }

    public float getChipEndPadding() {
        return this.f0 == null ? 0.0f : this.f0.b1;
    }

    public Drawable getChipIcon() {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            Drawable drawable0 = chipDrawable0.E0;
            if(drawable0 != null) {
                if(drawable0 instanceof d) {
                    d d0 = (d)drawable0;
                    return null;
                }
                return drawable0;
            }
        }
        return null;
    }

    public float getChipIconSize() {
        return this.f0 == null ? 0.0f : this.f0.G0;
    }

    public ColorStateList getChipIconTint() {
        return this.f0 == null ? null : this.f0.F0;
    }

    public float getChipMinHeight() {
        return this.f0 == null ? 0.0f : this.f0.x0;
    }

    public float getChipStartPadding() {
        return this.f0 == null ? 0.0f : this.f0.U0;
    }

    public ColorStateList getChipStrokeColor() {
        return this.f0 == null ? null : this.f0.z0;
    }

    public float getChipStrokeWidth() {
        return this.f0 == null ? 0.0f : this.f0.A0;
    }

    @Deprecated
    public CharSequence getChipText() {
        return this.getText();
    }

    public Drawable getCloseIcon() {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            Drawable drawable0 = chipDrawable0.J0;
            if(drawable0 != null) {
                if(drawable0 instanceof d) {
                    d d0 = (d)drawable0;
                    return null;
                }
                return drawable0;
            }
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        ChipDrawable chipDrawable0 = this.f0;
        return chipDrawable0 != null ? chipDrawable0.N0 : null;
    }

    public float getCloseIconEndPadding() {
        return this.f0 == null ? 0.0f : this.f0.a1;
    }

    public float getCloseIconSize() {
        return this.f0 == null ? 0.0f : this.f0.M0;
    }

    public float getCloseIconStartPadding() {
        return this.f0 == null ? 0.0f : this.f0.Z0;
    }

    public ColorStateList getCloseIconTint() {
        return this.f0 == null ? null : this.f0.L0;
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF0 = this.t0;
        rectF0.setEmpty();
        if(this.d() && this.i0 != null) {
            ChipDrawable chipDrawable0 = this.f0;
            Rect rect0 = chipDrawable0.getBounds();
            rectF0.setEmpty();
            if(chipDrawable0.S()) {
                float f = chipDrawable0.b1 + chipDrawable0.a1 + chipDrawable0.M0 + chipDrawable0.Z0 + chipDrawable0.Y0;
                if(chipDrawable0.getLayoutDirection() == 0) {
                    float f1 = (float)rect0.right;
                    rectF0.right = f1;
                    rectF0.left = f1 - f;
                }
                else {
                    float f2 = (float)rect0.left;
                    rectF0.left = f2;
                    rectF0.right = f2 + f;
                }
                rectF0.top = (float)rect0.top;
                rectF0.bottom = (float)rect0.bottom;
            }
        }
        return rectF0;
    }

    private Rect getCloseIconTouchBoundsInt() {
        RectF rectF0 = this.getCloseIconTouchBounds();
        this.s0.set(((int)rectF0.left), ((int)rectF0.top), ((int)rectF0.right), ((int)rectF0.bottom));
        return this.s0;
    }

    @Override  // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        return this.f0 == null ? null : this.f0.z1;
    }

    @Override  // android.widget.TextView
    public final void getFocusedRect(Rect rect0) {
        if(this.r0.l != 1 && this.r0.k != 1) {
            super.getFocusedRect(rect0);
            return;
        }
        rect0.set(this.getCloseIconTouchBoundsInt());
    }

    public MotionSpec getHideMotionSpec() {
        return this.f0 == null ? null : this.f0.T0;
    }

    public float getIconEndPadding() {
        return this.f0 == null ? 0.0f : this.f0.W0;
    }

    public float getIconStartPadding() {
        return this.f0 == null ? 0.0f : this.f0.V0;
    }

    public ColorStateList getRippleColor() {
        return this.f0 == null ? null : this.f0.B0;
    }

    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.f0.X.a;
    }

    public MotionSpec getShowMotionSpec() {
        return this.f0 == null ? null : this.f0.S0;
    }

    private TextAppearance getTextAppearance() {
        return this.f0 == null ? null : this.f0.i1.f;
    }

    public float getTextEndPadding() {
        return this.f0 == null ? 0.0f : this.f0.Y0;
    }

    public float getTextStartPadding() {
        return this.f0 == null ? 0.0f : this.f0.X0;
    }

    public final void h() {
        if(!TextUtils.isEmpty(this.getText())) {
            ChipDrawable chipDrawable0 = this.f0;
            if(chipDrawable0 != null) {
                int v = (int)(chipDrawable0.q() + (chipDrawable0.b1 + chipDrawable0.Y0));
                float f = this.f0.U0 + this.f0.X0;
                int v1 = (int)(this.f0.p() + f);
                if(this.g0 != null) {
                    Rect rect0 = new Rect();
                    this.g0.getPadding(rect0);
                    v1 += rect0.left;
                    v += rect0.right;
                }
                this.setPaddingRelative(v1, this.getPaddingTop(), v, this.getPaddingBottom());
            }
        }
    }

    public final void i() {
        TextPaint textPaint0 = this.getPaint();
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            textPaint0.drawableState = chipDrawable0.getState();
        }
        TextAppearance textAppearance0 = this.getTextAppearance();
        if(textAppearance0 != null) {
            textAppearance0.e(this.getContext(), textPaint0, this.u0);
        }
    }

    @Override  // android.widget.TextView
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hb.h.i0(this, this.f0);
    }

    @Override  // android.widget.CompoundButton
    public final int[] onCreateDrawableState(int v) {
        int[] arr_v = super.onCreateDrawableState(v + 2);
        if(this.isChecked()) {
            View.mergeDrawableStates(arr_v, Chip.w0);
        }
        if(this.e()) {
            View.mergeDrawableStates(arr_v, Chip.x0);
        }
        return arr_v;
    }

    @Override  // android.widget.TextView
    public final void onFocusChanged(boolean z, int v, Rect rect0) {
        super.onFocusChanged(z, v, rect0);
        b b0 = this.r0;
        int v1 = b0.l;
        if(v1 != 0x80000000) {
            b0.j(v1);
        }
        if(z) {
            b0.n(v, rect0);
        }
    }

    @Override  // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent0) {
        switch(motionEvent0.getActionMasked()) {
            case 7: {
                this.setCloseIconHovered(this.getCloseIconTouchBounds().contains(motionEvent0.getX(), motionEvent0.getY()));
                return super.onHoverEvent(motionEvent0);
            }
            case 10: {
                this.setCloseIconHovered(false);
                return super.onHoverEvent(motionEvent0);
            }
            default: {
                return super.onHoverEvent(motionEvent0);
            }
        }
    }

    @Override  // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo0) {
        int v2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        if(this.e() || this.isClickable()) {
            accessibilityNodeInfo0.setClassName((this.e() ? "android.widget.CompoundButton" : "android.widget.Button"));
        }
        else {
            accessibilityNodeInfo0.setClassName("android.view.View");
        }
        accessibilityNodeInfo0.setCheckable(this.e());
        accessibilityNodeInfo0.setClickable(this.isClickable());
        if(this.getParent() instanceof ChipGroup) {
            ChipGroup chipGroup0 = (ChipGroup)this.getParent();
            int v = -1;
            if(chipGroup0.d0) {
                int v1 = 0;
                v2 = 0;
                while(v1 < chipGroup0.getChildCount()) {
                    if(chipGroup0.getChildAt(v1) instanceof Chip) {
                        if(((Chip)chipGroup0.getChildAt(v1)) == this) {
                            goto label_20;
                        }
                        ++v2;
                    }
                    ++v1;
                }
            }
            v2 = -1;
        label_20:
            Object object0 = this.getTag(0x7F0A0278);  // id:row_index_key
            if(object0 instanceof Integer) {
                v = (int)(((Integer)object0));
            }
            accessibilityNodeInfo0.setCollectionItemInfo(((AccessibilityNodeInfo.CollectionItemInfo)U7.c.t(this.isChecked(), v, 1, v2, 1).Y));
        }
    }

    // Deobfuscation rating: LOW(20)
    @Override  // android.widget.Button
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent0, int v) {
        return !this.getCloseIconTouchBounds().contains(motionEvent0.getX(), motionEvent0.getY()) || !this.isEnabled() ? null : g.k(this.getContext());
    }

    @Override  // android.widget.TextView
    public final void onRtlPropertiesChanged(int v) {
        super.onRtlPropertiesChanged(v);
        if(this.p0 != v) {
            this.p0 = v;
            this.h();
        }
    }

    @Override  // android.widget.TextView
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        boolean z1;
        int v = motionEvent0.getActionMasked();
        boolean z = this.getCloseIconTouchBounds().contains(motionEvent0.getX(), motionEvent0.getY());
        switch(v) {
            case 0: {
                if(!z) {
                    return super.onTouchEvent(motionEvent0);
                }
                this.setCloseIconPressed(true);
                return true;
            }
            case 1: {
                if(this.l0) {
                    this.playSoundEffect(0);
                    View.OnClickListener view$OnClickListener0 = this.i0;
                    if(view$OnClickListener0 != null) {
                        view$OnClickListener0.onClick(this);
                    }
                    this.r0.r(1, 1);
                    z1 = true;
                }
                else {
                    z1 = false;
                }
                break;
            }
            case 2: {
                if(this.l0) {
                    if(!z) {
                        this.setCloseIconPressed(false);
                    }
                    return true;
                }
                return super.onTouchEvent(motionEvent0);
            }
            case 3: {
                z1 = false;
                break;
            }
            default: {
                return super.onTouchEvent(motionEvent0);
            }
        }
        this.setCloseIconPressed(false);
        return z1 || super.onTouchEvent(motionEvent0);
    }

    @Override  // android.view.View
    public void setBackground(Drawable drawable0) {
        if(drawable0 != this.getBackgroundDrawable() && drawable0 != this.h0) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            return;
        }
        super.setBackground(drawable0);
    }

    @Override  // android.view.View
    public void setBackgroundColor(int v) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override  // o.m
    public void setBackgroundDrawable(Drawable drawable0) {
        if(drawable0 != this.getBackgroundDrawable() && drawable0 != this.h0) {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
            return;
        }
        super.setBackgroundDrawable(drawable0);
    }

    @Override  // o.m
    public void setBackgroundResource(int v) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override  // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList0) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override  // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode porterDuff$Mode0) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.w(z);
        }
    }

    public void setCheckableResource(int v) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.w(chipDrawable0.c1.getResources().getBoolean(v));
        }
    }

    @Override  // android.widget.CompoundButton
    public void setChecked(boolean z) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 == null) {
            this.k0 = z;
            return;
        }
        if(chipDrawable0.O0) {
            boolean z1 = this.isChecked();
            super.setChecked(z);
            if(z1 != z) {
                CompoundButton.OnCheckedChangeListener compoundButton$OnCheckedChangeListener0 = this.j0;
                if(compoundButton$OnCheckedChangeListener0 != null) {
                    compoundButton$OnCheckedChangeListener0.onCheckedChanged(this, z);
                }
            }
        }
    }

    public void setCheckedIcon(Drawable drawable0) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.x(drawable0);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        this.setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int v) {
        this.setCheckedIconVisible(v);
    }

    public void setCheckedIconResource(int v) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.x(q.v(chipDrawable0.c1, v));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList0) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.y(colorStateList0);
        }
    }

    public void setCheckedIconTintResource(int v) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.y(q.t(chipDrawable0.c1, v));
        }
    }

    public void setCheckedIconVisible(int v) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.z(chipDrawable0.c1.getResources().getBoolean(v));
        }
    }

    public void setCheckedIconVisible(boolean z) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.z(z);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList0) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null && chipDrawable0.w0 != colorStateList0) {
            chipDrawable0.w0 = colorStateList0;
            chipDrawable0.onStateChange(chipDrawable0.getState());
        }
    }

    public void setChipBackgroundColorResource(int v) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            ColorStateList colorStateList0 = q.t(chipDrawable0.c1, v);
            if(chipDrawable0.w0 != colorStateList0) {
                chipDrawable0.w0 = colorStateList0;
                chipDrawable0.onStateChange(chipDrawable0.getState());
            }
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.A(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int v) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.A(chipDrawable0.c1.getResources().getDimension(v));
        }
    }

    public void setChipDrawable(ChipDrawable chipDrawable0) {
        ChipDrawable chipDrawable1 = this.f0;
        if(chipDrawable1 != chipDrawable0) {
            if(chipDrawable1 != null) {
                chipDrawable1.y1 = new WeakReference(null);
            }
            this.f0 = chipDrawable0;
            chipDrawable0.A1 = false;
            chipDrawable0.y1 = new WeakReference(this);
            this.c(this.q0);
        }
    }

    public void setChipEndPadding(float f) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null && chipDrawable0.b1 != f) {
            chipDrawable0.b1 = f;
            chipDrawable0.invalidateSelf();
            chipDrawable0.u();
        }
    }

    public void setChipEndPaddingResource(int v) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            float f = chipDrawable0.c1.getResources().getDimension(v);
            if(chipDrawable0.b1 != f) {
                chipDrawable0.b1 = f;
                chipDrawable0.invalidateSelf();
                chipDrawable0.u();
            }
        }
    }

    public void setChipIcon(Drawable drawable0) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.B(drawable0);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        this.setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int v) {
        this.setChipIconVisible(v);
    }

    public void setChipIconResource(int v) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.B(q.v(chipDrawable0.c1, v));
        }
    }

    public void setChipIconSize(float f) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.C(f);
        }
    }

    public void setChipIconSizeResource(int v) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.C(chipDrawable0.c1.getResources().getDimension(v));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList0) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.D(colorStateList0);
        }
    }

    public void setChipIconTintResource(int v) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.D(q.t(chipDrawable0.c1, v));
        }
    }

    public void setChipIconVisible(int v) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.E(chipDrawable0.c1.getResources().getBoolean(v));
        }
    }

    public void setChipIconVisible(boolean z) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.E(z);
        }
    }

    public void setChipMinHeight(float f) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null && chipDrawable0.x0 != f) {
            chipDrawable0.x0 = f;
            chipDrawable0.invalidateSelf();
            chipDrawable0.u();
        }
    }

    public void setChipMinHeightResource(int v) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            float f = chipDrawable0.c1.getResources().getDimension(v);
            if(chipDrawable0.x0 != f) {
                chipDrawable0.x0 = f;
                chipDrawable0.invalidateSelf();
                chipDrawable0.u();
            }
        }
    }

    public void setChipStartPadding(float f) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null && chipDrawable0.U0 != f) {
            chipDrawable0.U0 = f;
            chipDrawable0.invalidateSelf();
            chipDrawable0.u();
        }
    }

    public void setChipStartPaddingResource(int v) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            float f = chipDrawable0.c1.getResources().getDimension(v);
            if(chipDrawable0.U0 != f) {
                chipDrawable0.U0 = f;
                chipDrawable0.invalidateSelf();
                chipDrawable0.u();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList0) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.F(colorStateList0);
        }
    }

    public void setChipStrokeColorResource(int v) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.F(q.t(chipDrawable0.c1, v));
        }
    }

    public void setChipStrokeWidth(float f) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.G(f);
        }
    }

    public void setChipStrokeWidthResource(int v) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.G(chipDrawable0.c1.getResources().getDimension(v));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence0) {
        this.setText(charSequence0);
    }

    @Deprecated
    public void setChipTextResource(int v) {
        this.setText(this.getResources().getString(v));
    }

    public void setCloseIcon(Drawable drawable0) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.H(drawable0);
        }
        this.f();
    }

    public void setCloseIconContentDescription(CharSequence charSequence0) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null && chipDrawable0.N0 != charSequence0) {
            H1.b b0 = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? H1.b.e : H1.b.d;
            b0.getClass();
            chipDrawable0.N0 = b0.c(charSequence0);
            chipDrawable0.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        this.setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int v) {
        this.setCloseIconVisible(v);
    }

    public void setCloseIconEndPadding(float f) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.I(f);
        }
    }

    public void setCloseIconEndPaddingResource(int v) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.I(chipDrawable0.c1.getResources().getDimension(v));
        }
    }

    private void setCloseIconHovered(boolean z) {
        if(this.m0 != z) {
            this.m0 = z;
            this.refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if(this.l0 != z) {
            this.l0 = z;
            this.refreshDrawableState();
        }
    }

    public void setCloseIconResource(int v) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.H(q.v(chipDrawable0.c1, v));
        }
        this.f();
    }

    public void setCloseIconSize(float f) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.J(f);
        }
    }

    public void setCloseIconSizeResource(int v) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.J(chipDrawable0.c1.getResources().getDimension(v));
        }
    }

    public void setCloseIconStartPadding(float f) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.K(f);
        }
    }

    public void setCloseIconStartPaddingResource(int v) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.K(chipDrawable0.c1.getResources().getDimension(v));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList0) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.L(colorStateList0);
        }
    }

    public void setCloseIconTintResource(int v) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.L(q.t(chipDrawable0.c1, v));
        }
    }

    public void setCloseIconVisible(int v) {
        this.setCloseIconVisible(this.getResources().getBoolean(v));
    }

    public void setCloseIconVisible(boolean z) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.M(z);
        }
        this.f();
    }

    @Override  // o.m
    public final void setCompoundDrawables(Drawable drawable0, Drawable drawable1, Drawable drawable2, Drawable drawable3) {
        if(drawable0 != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if(drawable2 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(null, drawable1, null, drawable3);
    }

    @Override  // o.m
    public final void setCompoundDrawablesRelative(Drawable drawable0, Drawable drawable1, Drawable drawable2, Drawable drawable3) {
        if(drawable0 != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if(drawable2 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(null, drawable1, null, drawable3);
    }

    @Override  // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int v, int v1, int v2, int v3) {
        if(v != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if(v2 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(0, v1, 0, v3);
    }

    @Override  // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable0, Drawable drawable1, Drawable drawable2, Drawable drawable3) {
        if(drawable0 != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if(drawable2 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(null, drawable1, null, drawable3);
    }

    @Override  // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int v, int v1, int v2, int v3) {
        if(v != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if(v2 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(0, v1, 0, v3);
    }

    @Override  // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable0, Drawable drawable1, Drawable drawable2, Drawable drawable3) {
        if(drawable0 != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if(drawable2 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(null, drawable1, null, drawable3);
    }

    @Override  // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.i(f);
        }
    }

    @Override  // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt textUtils$TruncateAt0) {
        if(this.f0 == null) {
            return;
        }
        if(textUtils$TruncateAt0 == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(textUtils$TruncateAt0);
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.z1 = textUtils$TruncateAt0;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.o0 = z;
        this.c(this.q0);
    }

    @Override  // android.widget.TextView
    public void setGravity(int v) {
        if(v != 0x800013) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
            return;
        }
        super.setGravity(0x800013);
    }

    public void setHideMotionSpec(MotionSpec motionSpec0) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.T0 = motionSpec0;
        }
    }

    public void setHideMotionSpecResource(int v) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.T0 = MotionSpec.a(chipDrawable0.c1, v);
        }
    }

    public void setIconEndPadding(float f) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.N(f);
        }
    }

    public void setIconEndPaddingResource(int v) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.N(chipDrawable0.c1.getResources().getDimension(v));
        }
    }

    public void setIconStartPadding(float f) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.O(f);
        }
    }

    public void setIconStartPaddingResource(int v) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.O(chipDrawable0.c1.getResources().getDimension(v));
        }
    }

    @Override  // android.view.View
    public void setLayoutDirection(int v) {
        if(this.f0 == null) {
            return;
        }
        super.setLayoutDirection(v);
    }

    @Override  // android.widget.TextView
    public void setLines(int v) {
        if(v > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(v);
    }

    @Override  // android.widget.TextView
    public void setMaxLines(int v) {
        if(v > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(v);
    }

    @Override  // android.widget.TextView
    public void setMaxWidth(int v) {
        super.setMaxWidth(v);
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.B1 = v;
        }
    }

    @Override  // android.widget.TextView
    public void setMinLines(int v) {
        if(v > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(v);
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener compoundButton$OnCheckedChangeListener0) {
        this.j0 = compoundButton$OnCheckedChangeListener0;
    }

    public void setOnCloseIconClickListener(View.OnClickListener view$OnClickListener0) {
        this.i0 = view$OnClickListener0;
        this.f();
    }

    public void setRippleColor(ColorStateList colorStateList0) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.P(colorStateList0);
        }
        this.f0.getClass();
        this.g();
    }

    public void setRippleColorResource(int v) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.P(q.t(chipDrawable0.c1, v));
            this.f0.getClass();
            this.g();
        }
    }

    @Override  // H6.t
    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel0) {
        this.f0.setShapeAppearanceModel(shapeAppearanceModel0);
    }

    public void setShowMotionSpec(MotionSpec motionSpec0) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.S0 = motionSpec0;
        }
    }

    public void setShowMotionSpecResource(int v) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.S0 = MotionSpec.a(chipDrawable0.c1, v);
        }
    }

    @Override  // android.widget.TextView
    public void setSingleLine(boolean z) {
        if(!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override  // android.widget.TextView
    public final void setText(CharSequence charSequence0, TextView.BufferType textView$BufferType0) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 == null) {
            return;
        }
        if(charSequence0 == null) {
            charSequence0 = "";
        }
        super.setText((chipDrawable0.A1 ? null : charSequence0), textView$BufferType0);
        ChipDrawable chipDrawable1 = this.f0;
        if(chipDrawable1 != null && !TextUtils.equals(chipDrawable1.C0, charSequence0)) {
            chipDrawable1.C0 = charSequence0;
            chipDrawable1.i1.d = true;
            chipDrawable1.invalidateSelf();
            chipDrawable1.u();
        }
    }

    @Override  // android.widget.TextView
    public void setTextAppearance(int v) {
        super.setTextAppearance(v);
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            TextAppearance textAppearance0 = new TextAppearance(chipDrawable0.c1, v);
            chipDrawable0.i1.b(textAppearance0, chipDrawable0.c1);
        }
        this.i();
    }

    @Override  // android.widget.TextView
    public final void setTextAppearance(Context context0, int v) {
        super.setTextAppearance(context0, v);
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            TextAppearance textAppearance0 = new TextAppearance(chipDrawable0.c1, v);
            chipDrawable0.i1.b(textAppearance0, chipDrawable0.c1);
        }
        this.i();
    }

    public void setTextAppearance(TextAppearance textAppearance0) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            chipDrawable0.i1.b(textAppearance0, chipDrawable0.c1);
        }
        this.i();
    }

    public void setTextAppearanceResource(int v) {
        this.setTextAppearance(this.getContext(), v);
    }

    public void setTextEndPadding(float f) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null && chipDrawable0.Y0 != f) {
            chipDrawable0.Y0 = f;
            chipDrawable0.invalidateSelf();
            chipDrawable0.u();
        }
    }

    public void setTextEndPaddingResource(int v) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            float f = chipDrawable0.c1.getResources().getDimension(v);
            if(chipDrawable0.Y0 != f) {
                chipDrawable0.Y0 = f;
                chipDrawable0.invalidateSelf();
                chipDrawable0.u();
            }
        }
    }

    public void setTextStartPadding(float f) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null && chipDrawable0.X0 != f) {
            chipDrawable0.X0 = f;
            chipDrawable0.invalidateSelf();
            chipDrawable0.u();
        }
    }

    public void setTextStartPaddingResource(int v) {
        ChipDrawable chipDrawable0 = this.f0;
        if(chipDrawable0 != null) {
            float f = chipDrawable0.c1.getResources().getDimension(v);
            if(chipDrawable0.X0 != f) {
                chipDrawable0.X0 = f;
                chipDrawable0.invalidateSelf();
                chipDrawable0.u();
            }
        }
    }
}

