package com.google.android.material.button;

import B6.l;
import Bb.F;
import Bb.q;
import H6.i;
import H6.t;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.shape.ShapeAppearanceModel;
import hb.h;
import java.util.LinkedHashSet;
import v6.b;

public class MaterialButton extends AppCompatButton implements t, Checkable {
    public interface OnPressedChangeListener {
        void a();
    }

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR;
        public boolean Z;

        static {
            SavedState.CREATOR = new a();  // initializer: Ljava/lang/Object;-><init>()V
        }

        public SavedState(Parcel parcel0, ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            if(classLoader0 == null) {
                this.getClass();
            }
            this.Z = parcel0.readInt() == 1;
        }

        @Override  // androidx.customview.view.AbsSavedState
        public final void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeInt(((int)this.Z));
        }
    }

    public final v6.a e0;
    public final LinkedHashSet f0;
    public OnPressedChangeListener g0;
    public PorterDuff.Mode h0;
    public ColorStateList i0;
    public Drawable j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public boolean o0;
    public boolean p0;
    public int q0;
    public static final int[] r0;
    public static final int[] s0;

    static {
        MaterialButton.r0 = new int[]{0x101009F};
        MaterialButton.s0 = new int[]{0x10100A0};
    }

    public MaterialButton(Context context0, AttributeSet attributeSet0) {
        super(L6.a.a(context0, attributeSet0, 0x7F0402B6, 0x7F1302EB), attributeSet0, 0x7F0402B6);  // attr:materialButtonStyle
        this.f0 = new LinkedHashSet();
        boolean z = false;
        this.o0 = false;
        this.p0 = false;
        Context context1 = this.getContext();
        TypedArray typedArray0 = l.f(context1, attributeSet0, p6.a.o, 0x7F0402B6, 0x7F1302EB, new int[0]);  // attr:materialButtonStyle
        this.n0 = typedArray0.getDimensionPixelSize(12, 0);
        int v = typedArray0.getInt(15, -1);
        PorterDuff.Mode porterDuff$Mode0 = PorterDuff.Mode.SRC_IN;
        this.h0 = l.g(v, porterDuff$Mode0);
        this.i0 = F.w(this.getContext(), typedArray0, 14);
        this.j0 = F.x(this.getContext(), typedArray0, 10);
        this.q0 = typedArray0.getInteger(11, 1);
        this.k0 = typedArray0.getDimensionPixelSize(13, 0);
        v6.a a0 = new v6.a(this, ShapeAppearanceModel.b(context1, attributeSet0, 0x7F0402B6, 0x7F1302EB).a());  // attr:materialButtonStyle
        this.e0 = a0;
        a0.c = typedArray0.getDimensionPixelOffset(1, 0);
        a0.d = typedArray0.getDimensionPixelOffset(2, 0);
        a0.e = typedArray0.getDimensionPixelOffset(3, 0);
        a0.f = typedArray0.getDimensionPixelOffset(4, 0);
        if(typedArray0.hasValue(8)) {
            int v1 = typedArray0.getDimensionPixelSize(8, -1);
            a0.g = v1;
            i i0 = a0.b.e();
            i0.e = new H6.a(((float)v1));
            i0.f = new H6.a(((float)v1));
            i0.g = new H6.a(((float)v1));
            i0.h = new H6.a(((float)v1));
            a0.c(i0.a());
            a0.p = true;
        }
        a0.h = typedArray0.getDimensionPixelSize(20, 0);
        a0.i = l.g(typedArray0.getInt(7, -1), porterDuff$Mode0);
        a0.j = F.w(this.getContext(), typedArray0, 6);
        a0.k = F.w(this.getContext(), typedArray0, 19);
        a0.l = F.w(this.getContext(), typedArray0, 16);
        a0.q = typedArray0.getBoolean(5, false);
        a0.s = typedArray0.getDimensionPixelSize(9, 0);
        int v2 = this.getPaddingStart();
        int v3 = this.getPaddingTop();
        int v4 = this.getPaddingEnd();
        int v5 = this.getPaddingBottom();
        if(typedArray0.hasValue(0)) {
            a0.o = true;
            this.setSupportBackgroundTintList(a0.j);
            this.setSupportBackgroundTintMode(a0.i);
        }
        else {
            a0.e();
        }
        this.setPaddingRelative(v2 + a0.c, v3 + a0.e, v4 + a0.d, v5 + a0.f);
        typedArray0.recycle();
        this.setCompoundDrawablePadding(this.n0);
        if(this.j0 != null) {
            z = true;
        }
        this.d(z);
    }

    public final boolean a() {
        return this.e0 != null && this.e0.q;
    }

    public final boolean b() {
        return this.e0 != null && !this.e0.o;
    }

    public final void c() {
        int v = this.q0;
        if(v == 1 || v == 2) {
            this.setCompoundDrawablesRelative(this.j0, null, null, null);
            return;
        }
        switch(v) {
            case 3: 
            case 4: {
                this.setCompoundDrawablesRelative(null, null, this.j0, null);
                return;
            }
            case 16: 
            case 0x20: {
                this.setCompoundDrawablesRelative(null, this.j0, null, null);
            }
        }
    }

    public final void d(boolean z) {
        Drawable drawable0 = this.j0;
        if(drawable0 != null) {
            Drawable drawable1 = drawable0.mutate();
            this.j0 = drawable1;
            drawable1.setTintList(this.i0);
            PorterDuff.Mode porterDuff$Mode0 = this.h0;
            if(porterDuff$Mode0 != null) {
                this.j0.setTintMode(porterDuff$Mode0);
            }
            int v = this.k0 == 0 ? this.j0.getIntrinsicWidth() : this.k0;
            int v1 = this.k0 == 0 ? this.j0.getIntrinsicHeight() : this.k0;
            this.j0.setBounds(this.l0, this.m0, v + this.l0, v1 + this.m0);
        }
        if(z) {
            this.c();
            return;
        }
        Drawable[] arr_drawable = this.getCompoundDrawablesRelative();
        if((this.q0 == 1 || this.q0 == 2) && arr_drawable[0] != this.j0 || (this.q0 == 3 || this.q0 == 4) && arr_drawable[2] != this.j0 || (this.q0 == 16 || this.q0 == 0x20) && arr_drawable[1] != this.j0) {
            this.c();
        }
    }

    public final void e(int v, int v1) {
        if(this.j0 != null && this.getLayout() != null) {
            int v2 = this.q0;
            int v3 = 1;
            if(v2 != 1 && v2 != 2 && (v2 != 3 && v2 != 4)) {
                if(v2 != 16 && v2 != 0x20) {
                    return;
                }
                this.l0 = 0;
                if(v2 == 16) {
                    this.m0 = 0;
                    this.d(false);
                    return;
                }
                int v4 = this.k0 == 0 ? this.j0.getIntrinsicHeight() : this.k0;
                int v5 = (v1 - this.getTextHeight() - this.getPaddingTop() - v4 - this.n0 - this.getPaddingBottom()) / 2;
                if(this.m0 == v5) {
                    return;
                }
                this.m0 = v5;
                this.d(false);
                return;
            }
            this.m0 = 0;
            if(v2 != 1 && v2 != 3) {
                int v6 = this.k0 == 0 ? this.j0.getIntrinsicWidth() : this.k0;
                int v7 = (v - this.getTextWidth() - this.getPaddingEnd() - v6 - this.n0 - this.getPaddingStart()) / 2;
                int v8 = this.getLayoutDirection() == 1 ? 1 : 0;
                if(this.q0 != 4) {
                    v3 = 0;
                }
                if(v8 != v3) {
                    v7 = -v7;
                }
                if(this.l0 != v7) {
                    this.l0 = v7;
                    this.d(false);
                }
                return;
            }
            this.l0 = 0;
            this.d(false);
        }
    }

    // Deobfuscation rating: LOW(20)
    private String getA11yClassName() {
        return this.a() ? CompoundButton.class.getName() : Button.class.getName();
    }

    @Override  // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.getSupportBackgroundTintList();
    }

    @Override  // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.getSupportBackgroundTintMode();
    }

    // Deobfuscation rating: LOW(20)
    public int getCornerRadius() {
        return this.b() ? this.e0.g : 0;
    }

    public Drawable getIcon() {
        return this.j0;
    }

    public int getIconGravity() {
        return this.q0;
    }

    public int getIconPadding() {
        return this.n0;
    }

    public int getIconSize() {
        return this.k0;
    }

    public ColorStateList getIconTint() {
        return this.i0;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.h0;
    }

    public int getInsetBottom() {
        return this.e0.f;
    }

    public int getInsetTop() {
        return this.e0.e;
    }

    // Deobfuscation rating: LOW(20)
    public ColorStateList getRippleColor() {
        return this.b() ? this.e0.l : null;
    }

    public ShapeAppearanceModel getShapeAppearanceModel() {
        if(!this.b()) {
            throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        }
        return this.e0.b;
    }

    // Deobfuscation rating: LOW(20)
    public ColorStateList getStrokeColor() {
        return this.b() ? this.e0.k : null;
    }

    // Deobfuscation rating: LOW(20)
    public int getStrokeWidth() {
        return this.b() ? this.e0.h : 0;
    }

    // Deobfuscation rating: LOW(20)
    @Override  // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        return this.b() ? this.e0.j : super.getSupportBackgroundTintList();
    }

    // Deobfuscation rating: LOW(20)
    @Override  // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return this.b() ? this.e0.i : super.getSupportBackgroundTintMode();
    }

    private int getTextHeight() {
        TextPaint textPaint0 = this.getPaint();
        String s = this.getText().toString();
        if(this.getTransformationMethod() != null) {
            s = this.getTransformationMethod().getTransformation(s, this).toString();
        }
        Rect rect0 = new Rect();
        textPaint0.getTextBounds(s, 0, s.length(), rect0);
        return Math.min(rect0.height(), this.getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint textPaint0 = this.getPaint();
        String s = this.getText().toString();
        if(this.getTransformationMethod() != null) {
            s = this.getTransformationMethod().getTransformation(s, this).toString();
        }
        return Math.min(((int)textPaint0.measureText(s)), this.getLayout().getEllipsizedWidth());
    }

    @Override  // android.widget.Checkable
    public final boolean isChecked() {
        return this.o0;
    }

    @Override  // android.widget.TextView
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if(this.b()) {
            h.i0(this, this.e0.b(false));
        }
    }

    @Override  // android.widget.TextView
    public final int[] onCreateDrawableState(int v) {
        int[] arr_v = super.onCreateDrawableState(v + 2);
        if(this.a()) {
            View.mergeDrawableStates(arr_v, MaterialButton.r0);
        }
        if(this.o0) {
            View.mergeDrawableStates(arr_v, MaterialButton.s0);
        }
        return arr_v;
    }

    @Override  // androidx.appcompat.widget.AppCompatButton
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent0) {
        super.onInitializeAccessibilityEvent(accessibilityEvent0);
        accessibilityEvent0.setClassName(this.getA11yClassName());
        accessibilityEvent0.setChecked(this.o0);
    }

    @Override  // androidx.appcompat.widget.AppCompatButton
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        accessibilityNodeInfo0.setClassName(this.getA11yClassName());
        accessibilityNodeInfo0.setCheckable(this.a());
        accessibilityNodeInfo0.setChecked(this.o0);
        accessibilityNodeInfo0.setClickable(this.isClickable());
    }

    @Override  // android.widget.TextView
    public final void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((SavedState)parcelable0).X);
        this.setChecked(((SavedState)parcelable0).Z);
    }

    @Override  // android.widget.TextView
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());  // initializer: Landroidx/customview/view/AbsSavedState;-><init>(Landroid/os/Parcelable;)V
        parcelable0.Z = this.o0;
        return parcelable0;
    }

    @Override  // android.view.View
    public final void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        this.e(v, v1);
    }

    @Override  // androidx.appcompat.widget.AppCompatButton
    public final void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
        super.onTextChanged(charSequence0, v, v1, v2);
        this.e(this.getMeasuredWidth(), this.getMeasuredHeight());
    }

    @Override  // android.view.View
    public final boolean performClick() {
        this.toggle();
        return super.performClick();
    }

    @Override  // android.view.View
    public void setBackground(Drawable drawable0) {
        this.setBackgroundDrawable(drawable0);
    }

    @Override  // android.view.View
    public void setBackgroundColor(int v) {
        if(this.b()) {
            v6.a a0 = this.e0;
            if(a0.b(false) != null) {
                a0.b(false).setTint(v);
            }
        }
        else {
            super.setBackgroundColor(v);
        }
    }

    @Override  // androidx.appcompat.widget.AppCompatButton
    public void setBackgroundDrawable(Drawable drawable0) {
        if(this.b()) {
            if(drawable0 != this.getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                this.e0.o = true;
                this.e0.a.setSupportBackgroundTintList(this.e0.j);
                this.e0.a.setSupportBackgroundTintMode(this.e0.i);
                super.setBackgroundDrawable(drawable0);
                return;
            }
            this.getBackground().setState(drawable0.getState());
            return;
        }
        super.setBackgroundDrawable(drawable0);
    }

    @Override  // androidx.appcompat.widget.AppCompatButton
    public void setBackgroundResource(int v) {
        this.setBackgroundDrawable((v == 0 ? null : q.v(this.getContext(), v)));
    }

    @Override  // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList0) {
        this.setSupportBackgroundTintList(colorStateList0);
    }

    @Override  // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode porterDuff$Mode0) {
        this.setSupportBackgroundTintMode(porterDuff$Mode0);
    }

    public void setCheckable(boolean z) {
        if(this.b()) {
            this.e0.q = z;
        }
    }

    @Override  // android.widget.Checkable
    public void setChecked(boolean z) {
        if(this.a() && this.isEnabled() && this.o0 != z) {
            this.o0 = z;
            this.refreshDrawableState();
            if(this.p0) {
                return;
            }
            this.p0 = true;
            for(Object object0: this.f0) {
                boolean z1 = this.o0;
                MaterialButtonToggleGroup materialButtonToggleGroup0 = ((b)object0).a;
                if(!materialButtonToggleGroup0.h0) {
                    if(materialButtonToggleGroup0.i0) {
                        materialButtonToggleGroup0.k0 = z1 ? this.getId() : -1;
                    }
                    if(materialButtonToggleGroup0.d(this.getId(), z1)) {
                        materialButtonToggleGroup0.b(this.getId(), this.o0);
                    }
                    materialButtonToggleGroup0.invalidate();
                }
            }
            this.p0 = false;
        }
    }

    public void setCornerRadius(int v) {
        if(this.b()) {
            v6.a a0 = this.e0;
            if(!a0.p || a0.g != v) {
                a0.g = v;
                a0.p = true;
                i i0 = a0.b.e();
                i0.e = new H6.a(((float)v));
                i0.f = new H6.a(((float)v));
                i0.g = new H6.a(((float)v));
                i0.h = new H6.a(((float)v));
                a0.c(i0.a());
            }
        }
    }

    public void setCornerRadiusResource(int v) {
        if(this.b()) {
            this.setCornerRadius(this.getResources().getDimensionPixelSize(v));
        }
    }

    @Override  // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if(this.b()) {
            this.e0.b(false).i(f);
        }
    }

    public void setIcon(Drawable drawable0) {
        if(this.j0 != drawable0) {
            this.j0 = drawable0;
            this.d(true);
            this.e(this.getMeasuredWidth(), this.getMeasuredHeight());
        }
    }

    public void setIconGravity(int v) {
        if(this.q0 != v) {
            this.q0 = v;
            this.e(this.getMeasuredWidth(), this.getMeasuredHeight());
        }
    }

    public void setIconPadding(int v) {
        if(this.n0 != v) {
            this.n0 = v;
            this.setCompoundDrawablePadding(v);
        }
    }

    public void setIconResource(int v) {
        this.setIcon((v == 0 ? null : q.v(this.getContext(), v)));
    }

    public void setIconSize(int v) {
        if(v < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if(this.k0 != v) {
            this.k0 = v;
            this.d(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList0) {
        if(this.i0 != colorStateList0) {
            this.i0 = colorStateList0;
            this.d(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode porterDuff$Mode0) {
        if(this.h0 != porterDuff$Mode0) {
            this.h0 = porterDuff$Mode0;
            this.d(false);
        }
    }

    public void setIconTintResource(int v) {
        this.setIconTint(q.t(this.getContext(), v));
    }

    public void setInsetBottom(int v) {
        this.e0.d(this.e0.e, v);
    }

    public void setInsetTop(int v) {
        this.e0.d(v, this.e0.f);
    }

    public void setInternalBackground(Drawable drawable0) {
        super.setBackgroundDrawable(drawable0);
    }

    public void setOnPressedChangeListenerInternal(OnPressedChangeListener materialButton$OnPressedChangeListener0) {
        this.g0 = materialButton$OnPressedChangeListener0;
    }

    @Override  // android.view.View
    public void setPressed(boolean z) {
        OnPressedChangeListener materialButton$OnPressedChangeListener0 = this.g0;
        if(materialButton$OnPressedChangeListener0 != null) {
            materialButton$OnPressedChangeListener0.a();
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList0) {
        if(this.b()) {
            v6.a a0 = this.e0;
            if(a0.l != colorStateList0) {
                a0.l = colorStateList0;
                MaterialButton materialButton0 = a0.a;
                if(materialButton0.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable)materialButton0.getBackground()).setColor(F6.a.a(colorStateList0));
                }
            }
        }
    }

    public void setRippleColorResource(int v) {
        if(this.b()) {
            this.setRippleColor(q.t(this.getContext(), v));
        }
    }

    @Override  // H6.t
    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel0) {
        if(!this.b()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.e0.c(shapeAppearanceModel0);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if(this.b()) {
            this.e0.n = z;
            this.e0.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList0) {
        if(this.b()) {
            v6.a a0 = this.e0;
            if(a0.k != colorStateList0) {
                a0.k = colorStateList0;
                a0.f();
            }
        }
    }

    public void setStrokeColorResource(int v) {
        if(this.b()) {
            this.setStrokeColor(q.t(this.getContext(), v));
        }
    }

    public void setStrokeWidth(int v) {
        if(this.b()) {
            v6.a a0 = this.e0;
            if(a0.h != v) {
                a0.h = v;
                a0.f();
            }
        }
    }

    public void setStrokeWidthResource(int v) {
        if(this.b()) {
            this.setStrokeWidth(this.getResources().getDimensionPixelSize(v));
        }
    }

    @Override  // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList0) {
        if(this.b()) {
            v6.a a0 = this.e0;
            if(a0.j != colorStateList0) {
                a0.j = colorStateList0;
                if(a0.b(false) != null) {
                    a0.b(false).setTintList(a0.j);
                }
            }
        }
        else {
            super.setSupportBackgroundTintList(colorStateList0);
        }
    }

    @Override  // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode porterDuff$Mode0) {
        if(this.b()) {
            v6.a a0 = this.e0;
            if(a0.i != porterDuff$Mode0) {
                a0.i = porterDuff$Mode0;
                if(a0.b(false) != null && a0.i != null) {
                    a0.b(false).setTintMode(a0.i);
                }
            }
        }
        else {
            super.setSupportBackgroundTintMode(porterDuff$Mode0);
        }
    }

    @Override  // android.widget.Checkable
    public final void toggle() {
        this.setChecked(!this.o0);
    }
}

