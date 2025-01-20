package I6;

import B6.l;
import Bb.F;
import J1.C;
import J1.E;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar.OnAttachStateChangeListener;
import com.google.android.material.snackbar.BaseTransientBottomBar.OnLayoutChangeListener;

public abstract class b extends FrameLayout {
    public BaseTransientBottomBar.OnLayoutChangeListener b0;
    public BaseTransientBottomBar.OnAttachStateChangeListener c0;
    public int d0;
    public final float e0;
    public final float f0;
    public ColorStateList g0;
    public PorterDuff.Mode h0;
    public static final a i0;

    static {
        b.i0 = new a(0);
    }

    public b(Context context0, AttributeSet attributeSet0) {
        super(L6.a.a(context0, attributeSet0, 0, 0), attributeSet0);
        Context context1 = this.getContext();
        TypedArray typedArray0 = context1.obtainStyledAttributes(attributeSet0, p6.a.B);
        if(typedArray0.hasValue(6)) {
            E.j(this, ((float)typedArray0.getDimensionPixelSize(6, 0)));
        }
        this.d0 = typedArray0.getInt(2, 0);
        this.e0 = typedArray0.getFloat(3, 1.0f);
        this.setBackgroundTintList(F.w(context1, typedArray0, 4));
        this.setBackgroundTintMode(l.g(typedArray0.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f0 = typedArray0.getFloat(1, 1.0f);
        typedArray0.recycle();
        this.setOnTouchListener(b.i0);
        this.setFocusable(true);
        if(this.getBackground() == null) {
            float f = this.getResources().getDimension(0x7F0701B4);  // dimen:mtrl_snackbar_background_corner_radius
            GradientDrawable gradientDrawable0 = new GradientDrawable();
            gradientDrawable0.setShape(0);
            gradientDrawable0.setCornerRadius(f);
            gradientDrawable0.setColor(F.F(F.u(this, 0x7F040101), this.getBackgroundOverlayColorAlpha(), F.u(this, 0x7F0400F9)));  // attr:colorSurface
            ColorStateList colorStateList0 = this.g0;
            if(colorStateList0 != null) {
                gradientDrawable0.setTintList(colorStateList0);
            }
            this.setBackground(gradientDrawable0);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f0;
    }

    public int getAnimationMode() {
        return this.d0;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.e0;
    }

    @Override  // android.view.ViewGroup
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        BaseTransientBottomBar.OnAttachStateChangeListener baseTransientBottomBar$OnAttachStateChangeListener0 = this.c0;
        if(baseTransientBottomBar$OnAttachStateChangeListener0 != null) {
            baseTransientBottomBar$OnAttachStateChangeListener0.b();
        }
        C.c(this);
    }

    @Override  // android.view.ViewGroup
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BaseTransientBottomBar.OnAttachStateChangeListener baseTransientBottomBar$OnAttachStateChangeListener0 = this.c0;
        if(baseTransientBottomBar$OnAttachStateChangeListener0 != null) {
            baseTransientBottomBar$OnAttachStateChangeListener0.a();
        }
    }

    @Override  // android.widget.FrameLayout
    public final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        BaseTransientBottomBar.OnLayoutChangeListener baseTransientBottomBar$OnLayoutChangeListener0 = this.b0;
        if(baseTransientBottomBar$OnLayoutChangeListener0 != null) {
            baseTransientBottomBar$OnLayoutChangeListener0.a();
        }
    }

    public void setAnimationMode(int v) {
        this.d0 = v;
    }

    @Override  // android.view.View
    public void setBackground(Drawable drawable0) {
        this.setBackgroundDrawable(drawable0);
    }

    @Override  // android.view.View
    public void setBackgroundDrawable(Drawable drawable0) {
        if(drawable0 != null && this.g0 != null) {
            drawable0 = drawable0.mutate();
            drawable0.setTintList(this.g0);
            drawable0.setTintMode(this.h0);
        }
        super.setBackgroundDrawable(drawable0);
    }

    @Override  // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList0) {
        this.g0 = colorStateList0;
        if(this.getBackground() != null) {
            Drawable drawable0 = this.getBackground().mutate();
            drawable0.setTintList(colorStateList0);
            drawable0.setTintMode(this.h0);
            if(drawable0 != this.getBackground()) {
                super.setBackgroundDrawable(drawable0);
            }
        }
    }

    @Override  // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode porterDuff$Mode0) {
        this.h0 = porterDuff$Mode0;
        if(this.getBackground() != null) {
            Drawable drawable0 = this.getBackground().mutate();
            drawable0.setTintMode(porterDuff$Mode0);
            if(drawable0 != this.getBackground()) {
                super.setBackgroundDrawable(drawable0);
            }
        }
    }

    public void setOnAttachStateChangeListener(BaseTransientBottomBar.OnAttachStateChangeListener baseTransientBottomBar$OnAttachStateChangeListener0) {
        this.c0 = baseTransientBottomBar$OnAttachStateChangeListener0;
    }

    @Override  // android.view.View
    public void setOnClickListener(View.OnClickListener view$OnClickListener0) {
        this.setOnTouchListener((view$OnClickListener0 == null ? b.i0 : null));
        super.setOnClickListener(view$OnClickListener0);
    }

    public void setOnLayoutChangeListener(BaseTransientBottomBar.OnLayoutChangeListener baseTransientBottomBar$OnLayoutChangeListener0) {
        this.b0 = baseTransientBottomBar$OnLayoutChangeListener0;
    }
}

