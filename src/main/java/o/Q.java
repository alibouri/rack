package o;

import M1.j;
import V4.o;
import a.a;
import a8.Q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

public final class q extends MultiAutoCompleteTextView implements j {
    public final o b0;
    public final K c0;
    public final s d0;
    public static final int[] e0;

    static {
        q.e0 = new int[]{0x1010176};
    }

    public q(Context context0, AttributeSet attributeSet0) {
        C0.a(context0);
        super(context0, attributeSet0, 0x7F040042);  // attr:autoCompleteTextViewStyle
        B0.a(this, this.getContext());
        Q q0 = Q.G(this.getContext(), attributeSet0, q.e0, 0x7F040042);  // attr:autoCompleteTextViewStyle
        if(((TypedArray)q0.Z).hasValue(0)) {
            this.setDropDownBackgroundDrawable(q0.t(0));
        }
        q0.I();
        o o0 = new o(this);
        this.b0 = o0;
        o0.l(attributeSet0, 0x7F040042);  // attr:autoCompleteTextViewStyle
        K k0 = new K(this);
        this.c0 = k0;
        k0.f(attributeSet0, 0x7F040042);  // attr:autoCompleteTextViewStyle
        k0.b();
        s s0 = new s(this);
        this.d0 = s0;
        s0.b(attributeSet0, 0x7F040042);  // attr:autoCompleteTextViewStyle
        KeyListener keyListener0 = this.getKeyListener();
        if(!(keyListener0 instanceof NumberKeyListener)) {
            boolean z = this.isFocusable();
            boolean z1 = this.isClickable();
            boolean z2 = this.isLongClickable();
            int v = this.getInputType();
            KeyListener keyListener1 = s0.a(keyListener0);
            if(keyListener1 != keyListener0) {
                super.setKeyListener(keyListener1);
                this.setRawInputType(v);
                this.setFocusable(z);
                this.setClickable(z1);
                this.setLongClickable(z2);
            }
        }
    }

    @Override  // android.widget.TextView
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o o0 = this.b0;
        if(o0 != null) {
            o0.a();
        }
        K k0 = this.c0;
        if(k0 != null) {
            k0.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.b0 == null ? null : this.b0.i();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return this.b0 == null ? null : this.b0.j();
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c0.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c0.e();
    }

    @Override  // android.widget.TextView
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo0) {
        InputConnection inputConnection0 = super.onCreateInputConnection(editorInfo0);
        a.u(inputConnection0, editorInfo0, this);
        return this.d0.c(inputConnection0, editorInfo0);
    }

    @Override  // android.view.View
    public void setBackgroundDrawable(Drawable drawable0) {
        super.setBackgroundDrawable(drawable0);
        o o0 = this.b0;
        if(o0 != null) {
            o0.n();
        }
    }

    @Override  // android.view.View
    public void setBackgroundResource(int v) {
        super.setBackgroundResource(v);
        o o0 = this.b0;
        if(o0 != null) {
            o0.o(v);
        }
    }

    @Override  // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable0, Drawable drawable1, Drawable drawable2, Drawable drawable3) {
        super.setCompoundDrawables(drawable0, drawable1, drawable2, drawable3);
        K k0 = this.c0;
        if(k0 != null) {
            k0.b();
        }
    }

    @Override  // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable0, Drawable drawable1, Drawable drawable2, Drawable drawable3) {
        super.setCompoundDrawablesRelative(drawable0, drawable1, drawable2, drawable3);
        K k0 = this.c0;
        if(k0 != null) {
            k0.b();
        }
    }

    @Override  // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int v) {
        this.setDropDownBackgroundDrawable(Bb.q.v(this.getContext(), v));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.d0.d(z);
    }

    @Override  // android.widget.TextView
    public void setKeyListener(KeyListener keyListener0) {
        super.setKeyListener(this.d0.a(keyListener0));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList0) {
        o o0 = this.b0;
        if(o0 != null) {
            o0.t(colorStateList0);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode porterDuff$Mode0) {
        o o0 = this.b0;
        if(o0 != null) {
            o0.u(porterDuff$Mode0);
        }
    }

    @Override  // M1.j
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList0) {
        this.c0.k(colorStateList0);
        this.c0.b();
    }

    @Override  // M1.j
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode porterDuff$Mode0) {
        this.c0.l(porterDuff$Mode0);
        this.c0.b();
    }

    @Override  // android.widget.TextView
    public final void setTextAppearance(Context context0, int v) {
        super.setTextAppearance(context0, v);
        K k0 = this.c0;
        if(k0 != null) {
            k0.g(context0, v);
        }
    }
}

