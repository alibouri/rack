package o;

import Bb.q;
import J1.N;
import a8.Q;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import h.a;

public final class o {
    public ColorStateList a;
    public PorterDuff.Mode b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final TextView f;

    public o(TextView textView0) {
        this.a = null;
        this.b = null;
        this.c = false;
        this.d = false;
        this.f = textView0;
        super();
    }

    public void a() {
        CompoundButton compoundButton0 = (CompoundButton)this.f;
        Drawable drawable0 = compoundButton0.getButtonDrawable();
        if(drawable0 != null && (this.c || this.d)) {
            Drawable drawable1 = drawable0.mutate();
            if(this.c) {
                drawable1.setTintList(this.a);
            }
            if(this.d) {
                drawable1.setTintMode(this.b);
            }
            if(drawable1.isStateful()) {
                drawable1.setState(compoundButton0.getDrawableState());
            }
            compoundButton0.setButtonDrawable(drawable1);
        }
    }

    public void b() {
        n n0 = (n)this.f;
        Drawable drawable0 = n0.getCheckMarkDrawable();
        if(drawable0 != null && (this.c || this.d)) {
            Drawable drawable1 = drawable0.mutate();
            if(this.c) {
                drawable1.setTintList(this.a);
            }
            if(this.d) {
                drawable1.setTintMode(this.b);
            }
            if(drawable1.isStateful()) {
                drawable1.setState(n0.getDrawableState());
            }
            n0.setCheckMarkDrawable(drawable1);
        }
    }

    public void c(AttributeSet attributeSet0, int v) {
        CompoundButton compoundButton0 = (CompoundButton)this.f;
        Q q0 = Q.G(compoundButton0.getContext(), attributeSet0, a.m, v);
        TypedArray typedArray0 = (TypedArray)q0.Z;
        N.j(compoundButton0, compoundButton0.getContext(), a.m, attributeSet0, ((TypedArray)q0.Z), v);
        try {
            if(typedArray0.hasValue(1)) {
                int v2 = typedArray0.getResourceId(1, 0);
                if(v2 != 0) {
                    try {
                        compoundButton0.setButtonDrawable(q.v(compoundButton0.getContext(), v2));
                        goto label_14;
                    }
                    catch(Resources.NotFoundException unused_ex) {
                    }
                }
                goto label_10;
            }
            else {
            label_10:
                if(typedArray0.hasValue(0)) {
                    int v3 = typedArray0.getResourceId(0, 0);
                    if(v3 != 0) {
                        compoundButton0.setButtonDrawable(q.v(compoundButton0.getContext(), v3));
                    }
                }
            }
        label_14:
            if(typedArray0.hasValue(2)) {
                compoundButton0.setButtonTintList(q0.p(2));
            }
            if(typedArray0.hasValue(3)) {
                compoundButton0.setButtonTintMode(Y.c(typedArray0.getInt(3, -1), null));
            }
        }
        finally {
            q0.I();
        }
    }
}

