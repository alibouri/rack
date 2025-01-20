package com.google.android.material.timepicker;

import android.view.ViewTreeObserver.OnPreDrawListener;

public final class b implements ViewTreeObserver.OnPreDrawListener {
    public final ClockFaceView X;

    public b(ClockFaceView clockFaceView0) {
        this.X = clockFaceView0;
    }

    @Override  // android.view.ViewTreeObserver$OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView0 = this.X;
        if(!clockFaceView0.isShown()) {
            return true;
        }
        clockFaceView0.getViewTreeObserver().removeOnPreDrawListener(this);
        int v = clockFaceView0.getHeight() / 2 - clockFaceView0.u0.c0 - clockFaceView0.B0;
        if(v != clockFaceView0.s0) {
            clockFaceView0.s0 = v;
            clockFaceView0.l();
            clockFaceView0.u0.k0 = clockFaceView0.s0;
            clockFaceView0.u0.invalidate();
        }
        return true;
    }
}

