package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;
import android.widget.Checkable;

public final class j implements View.OnTouchListener {
    public final GestureDetector X;

    public j(GestureDetector gestureDetector0) {
        this.X = gestureDetector0;
    }

    // Deobfuscation rating: LOW(20)
    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        return ((Checkable)view0).isChecked() ? this.X.onTouchEvent(motionEvent0) : false;
    }
}

