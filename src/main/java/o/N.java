package o;

import Bb.q;
import J1.N;
import M1.h;
import M1.j;
import a8.Q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.appcompat.widget.AppCompatEmojiTextHelper;
import h.a;

public final class n extends CheckedTextView implements j {
    public final o b0;
    public final V4.o c0;
    public final K d0;
    public AppCompatEmojiTextHelper e0;

    public n(Context context0, AttributeSet attributeSet0) {
        C0.a(context0);
        super(context0, attributeSet0, 0x7F0400B6);  // attr:checkedTextViewStyle
        B0.a(this, this.getContext());
        K k0 = new K(this);
        this.d0 = k0;
        k0.f(attributeSet0, 0x7F0400B6);  // attr:checkedTextViewStyle
        k0.b();
        V4.o o0 = new V4.o(this);
        this.c0 = o0;
        o0.l(attributeSet0, 0x7F0400B6);  // attr:checkedTextViewStyle
        this.b0 = new o(this);
        Q q0 = Q.G(this.getContext(), attributeSet0, a.l, 0x7F0400B6);  // attr:checkedTextViewStyle
        TypedArray typedArray0 = (TypedArray)q0.Z;
        N.j(this, this.getContext(), a.l, attributeSet0, ((TypedArray)q0.Z), 0x7F0400B6);  // attr:checkedTextViewStyle
        try {
            if(typedArray0.hasValue(1)) {
                int v1 = typedArray0.getResourceId(1, 0);
                if(v1 != 0) {
                    try {
                        this.setCheckMarkDrawable(q.v(this.getContext(), v1));
                        goto label_24;
                    }
                    catch(Resources.NotFoundException unused_ex) {
                    }
                }
                goto label_20;
            }
            else {
            label_20:
                if(typedArray0.hasValue(0)) {
                    int v2 = typedArray0.getResourceId(0, 0);
                    if(v2 != 0) {
                        this.setCheckMarkDrawable(q.v(this.getContext(), v2));
                    }
                }
            }
        label_24:
            if(typedArray0.hasValue(2)) {
                this.setCheckMarkTintList(q0.p(2));
            }
            if(typedArray0.hasValue(3)) {
                this.setCheckMarkTintMode(Y.c(typedArray0.getInt(3, -1), null));
            }
        }
        finally {
            q0.I();
        }
        this.getEmojiTextViewHelper().b(attributeSet0, 0x7F0400B6);  // attr:checkedTextViewStyle
    }

    @Override  // android.widget.CheckedTextView
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        K k0 = this.d0;
        if(k0 != null) {
            k0.b();
        }
        V4.o o0 = this.c0;
        if(o0 != null) {
            o0.a();
        }
        o o1 = this.b0;
        if(o1 != null) {
            o1.b();
        }
    }

    @Override  // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return h.f(super.getCustomSelectionActionModeCallback());
    }

    private AppCompatEmojiTextHelper getEmojiTextViewHelper() {
        if(this.e0 == null) {
            this.e0 = new AppCompatEmojiTextHelper(this);
        }
        return this.e0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.c0 == null ? null : this.c0.i();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return this.c0 == null ? null : this.c0.j();
    }

    public ColorStateList getSupportCheckMarkTintList() {
        return this.b0 == null ? null : this.b0.a;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        return this.b0 == null ? null : this.b0.b;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.d0.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.d0.e();
    }

    @Override  // android.widget.TextView
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo0) {
        InputConnection inputConnection0 = super.onCreateInputConnection(editorInfo0);
        a.a.u(inputConnection0, editorInfo0, this);
        return inputConnection0;
    }

    @Override  // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        this.getEmojiTextViewHelper().c(z);
    }

    @Override  // android.view.View
    public void setBackgroundDrawable(Drawable drawable0) {
        super.setBackgroundDrawable(drawable0);
        V4.o o0 = this.c0;
        if(o0 != null) {
            o0.n();
        }
    }

    @Override  // android.view.View
    public void setBackgroundResource(int v) {
        super.setBackgroundResource(v);
        V4.o o0 = this.c0;
        if(o0 != null) {
            o0.o(v);
        }
    }

    @Override  // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int v) {
        this.setCheckMarkDrawable(q.v(this.getContext(), v));
    }

    @Override  // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable0) {
        super.setCheckMarkDrawable(drawable0);
        o o0 = this.b0;
        if(o0 != null) {
            if(o0.e) {
                o0.e = false;
                return;
            }
            o0.e = true;
            o0.b();
        }
    }

    @Override  // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable0, Drawable drawable1, Drawable drawable2, Drawable drawable3) {
        super.setCompoundDrawables(drawable0, drawable1, drawable2, drawable3);
        K k0 = this.d0;
        if(k0 != null) {
            k0.b();
        }
    }

    @Override  // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable0, Drawable drawable1, Drawable drawable2, Drawable drawable3) {
        super.setCompoundDrawablesRelative(drawable0, drawable1, drawable2, drawable3);
        K k0 = this.d0;
        if(k0 != null) {
            k0.b();
        }
    }

    @Override  // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback actionMode$Callback0) {
        super.setCustomSelectionActionModeCallback(h.g(actionMode$Callback0, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.getEmojiTextViewHelper().d(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList0) {
        V4.o o0 = this.c0;
        if(o0 != null) {
            o0.t(colorStateList0);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode porterDuff$Mode0) {
        V4.o o0 = this.c0;
        if(o0 != null) {
            o0.u(porterDuff$Mode0);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList0) {
        o o0 = this.b0;
        if(o0 != null) {
            o0.a = colorStateList0;
            o0.c = true;
            o0.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode porterDuff$Mode0) {
        o o0 = this.b0;
        if(o0 != null) {
            o0.b = porterDuff$Mode0;
            o0.d = true;
            o0.b();
        }
    }

    @Override  // M1.j
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList0) {
        this.d0.k(colorStateList0);
        this.d0.b();
    }

    @Override  // M1.j
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode porterDuff$Mode0) {
        this.d0.l(porterDuff$Mode0);
        this.d0.b();
    }

    @Override  // android.widget.TextView
    public final void setTextAppearance(Context context0, int v) {
        super.setTextAppearance(context0, v);
        K k0 = this.d0;
        if(k0 != null) {
            k0.g(context0, v);
        }
    }
}

