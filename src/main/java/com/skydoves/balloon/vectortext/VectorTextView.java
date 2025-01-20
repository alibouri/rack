package com.skydoves.balloon.vectortext;

import Nb.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.media.session.a;
import android.util.AttributeSet;
import o.N;
import u9.y;
import yc.l;

public final class VectorTextView extends N {
    public VectorTextViewParams i0;

    public VectorTextView(Context context0, AttributeSet attributeSet0) {
        j.f(context0, "context");
        super(context0, attributeSet0);
        if(attributeSet0 != null) {
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, y.a);
            j.e(typedArray0, "obtainStyledAttributes(...)");
            this.setDrawableTextViewParams(new VectorTextViewParams(l.D(typedArray0.getResourceId(5, 0x80000000)), l.D(typedArray0.getResourceId(1, 0x80000000)), l.D(typedArray0.getResourceId(0, 0x80000000)), l.D(typedArray0.getResourceId(7, 0x80000000)), null, null, null, null, l.D(typedArray0.getResourceId(3, 0x80000000)), l.D(typedArray0.getColor(6, 0x80000000)), l.D(typedArray0.getResourceId(8, 0x80000000)), l.D(typedArray0.getResourceId(2, 0x80000000)), l.D(typedArray0.getResourceId(4, 0x80000000)), 0x1FF0));
            typedArray0.recycle();
        }
    }

    public final VectorTextViewParams getDrawableTextViewParams() {
        return this.i0;
    }

    public final void setDrawableTextViewParams(VectorTextViewParams vectorTextViewParams0) {
        if(vectorTextViewParams0 == null) {
            vectorTextViewParams0 = null;
        }
        else {
            a.r(this, vectorTextViewParams0);
        }
        this.i0 = vectorTextViewParams0;
    }
}

