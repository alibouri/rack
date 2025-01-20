package com.google.android.material.timepicker;

import J1.b;
import K1.d;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

public final class c extends b {
    public final ClockFaceView d;

    public c(ClockFaceView clockFaceView0) {
        this.d = clockFaceView0;
        super();
    }

    @Override  // J1.b
    public final void d(View view0, d d0) {
        AccessibilityNodeInfo accessibilityNodeInfo0 = d0.a;
        this.a.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfo0);
        int v = (int)(((Integer)view0.getTag(0x7F0A01D3)));  // id:material_value_index
        if(v > 0) {
            accessibilityNodeInfo0.setTraversalAfter(((View)this.d.x0.get(v - 1)));
        }
        d0.k(U7.c.t(view0.isSelected(), 0, 1, v, 1));
    }
}

