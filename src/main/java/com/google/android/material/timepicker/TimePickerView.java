package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import java.util.HashMap;

class TimePickerView extends ConstraintLayout {
    public final MaterialButtonToggleGroup r0;
    public static final int s0;

    public TimePickerView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0, 0);
        g g0 = new g(this);
        LayoutInflater.from(context0).inflate(0x7F0D007D, this);  // layout:material_timepicker
        ClockFaceView clockFaceView0 = (ClockFaceView)this.findViewById(0x7F0A01C2);  // id:material_clock_face
        MaterialButtonToggleGroup materialButtonToggleGroup0 = (MaterialButtonToggleGroup)this.findViewById(0x7F0A01C6);  // id:material_clock_period_toggle
        this.r0 = materialButtonToggleGroup0;
        h h0 = new h(this);
        materialButtonToggleGroup0.e0.add(h0);
        Chip chip0 = (Chip)this.findViewById(0x7F0A01CB);  // id:material_minute_tv
        Chip chip1 = (Chip)this.findViewById(0x7F0A01C8);  // id:material_hour_tv
        ClockHandView clockHandView0 = (ClockHandView)this.findViewById(0x7F0A01C3);  // id:material_clock_hand
        j j0 = new j(new GestureDetector(this.getContext(), new i(this)));
        chip0.setOnTouchListener(j0);
        chip1.setOnTouchListener(j0);
        chip0.setTag(0x7F0A0299, 12);  // id:selection_type
        chip1.setTag(0x7F0A0299, 10);  // id:selection_type
        chip0.setOnClickListener(g0);
        chip1.setOnClickListener(g0);
    }

    public final void l() {
        if(this.r0.getVisibility() == 0) {
            ConstraintSet constraintSet0 = new ConstraintSet();
            constraintSet0.b(this);
            int v = this.getLayoutDirection() == 0 ? 2 : 1;
            HashMap hashMap0 = constraintSet0.c;
            if(hashMap0.containsKey(0x7F0A01C1)) {  // id:material_clock_display
                r1.h h0 = (r1.h)hashMap0.get(0x7F0A01C1);  // id:material_clock_display
                if(h0 != null) {
                    r1.i i0 = h0.d;
                    switch(v) {
                        case 1: {
                            i0.i = -1;
                            i0.h = -1;
                            i0.F = -1;
                            i0.M = 0x80000000;
                            break;
                        }
                        case 2: {
                            i0.k = -1;
                            i0.j = -1;
                            i0.G = -1;
                            i0.O = 0x80000000;
                            break;
                        }
                        default: {
                            throw new IllegalArgumentException("unknown constraint");
                        }
                    }
                }
            }
            constraintSet0.a(this);
            this.setConstraintSet(null);
            this.requestLayout();
        }
    }

    @Override  // android.view.ViewGroup
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.l();
    }

    @Override  // android.view.View
    public final void onVisibilityChanged(View view0, int v) {
        super.onVisibilityChanged(view0, v);
        if(view0 == this && v == 0) {
            this.l();
        }
    }
}

