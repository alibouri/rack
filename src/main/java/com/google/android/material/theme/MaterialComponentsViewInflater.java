package com.google.android.material.theme;

import K6.q;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import i.F;
import o.N;
import o.l;
import o.m;
import o.t;
import w6.a;

public class MaterialComponentsViewInflater extends F {
    @Override  // i.F
    public final l a(Context context0, AttributeSet attributeSet0) {
        return new q(context0, attributeSet0);
    }

    @Override  // i.F
    public final AppCompatButton b(Context context0, AttributeSet attributeSet0) {
        return new MaterialButton(context0, attributeSet0);
    }

    @Override  // i.F
    public final m c(Context context0, AttributeSet attributeSet0) {
        m m0 = new a(L6.a.a(context0, attributeSet0, 0x7F0400AD, 0x7F130303), attributeSet0, 0x7F0400AD);  // initializer: Lo/m;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
        Context context1 = m0.getContext();
        TypedArray typedArray0 = B6.l.f(context1, attributeSet0, p6.a.s, 0x7F0400AD, 0x7F130303, new int[0]);  // attr:checkboxStyle
        if(typedArray0.hasValue(0)) {
            m0.setButtonTintList(Bb.F.w(context1, typedArray0, 0));
        }
        m0.g0 = typedArray0.getBoolean(1, false);
        typedArray0.recycle();
        return m0;
    }

    @Override  // i.F
    public final t d(Context context0, AttributeSet attributeSet0) {
        t t0 = new D6.a(L6.a.a(context0, attributeSet0, 0x7F040360, 0x7F130304), attributeSet0);  // initializer: Lo/t;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
        Context context1 = t0.getContext();
        TypedArray typedArray0 = B6.l.f(context1, attributeSet0, p6.a.t, 0x7F040360, 0x7F130304, new int[0]);  // attr:radioButtonStyle
        if(typedArray0.hasValue(0)) {
            t0.setButtonTintList(Bb.F.w(context1, typedArray0, 0));
        }
        t0.g0 = typedArray0.getBoolean(1, false);
        typedArray0.recycle();
        return t0;
    }

    @Override  // i.F
    public final N e(Context context0, AttributeSet attributeSet0) {
        return new MaterialTextView(context0, attributeSet0);
    }
}

