package com.sendwave.util;

import Nb.j;
import R1.d;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.lifecycle.ViewModelProvider;
import i9.o;
import q9.C;
import q9.k3;
import q9.z;

public final class AnnouncementDetailSplashActivity extends k3 {
    public C F0;

    @Override  // android.app.Activity
    public final boolean dispatchTouchEvent(MotionEvent motionEvent0) {
        if(motionEvent0 != null && motionEvent0.getAction() == 0) {
            int v = ViewConfiguration.get(this).getScaledWindowTouchSlop();
            int v1 = this.getWindow().getDecorView().getHeight();
            int v2 = this.getWindow().getDecorView().getWidth();
            if(motionEvent0.getX() >= ((float)v) || motionEvent0.getX() <= ((float)(v2 - v)) || motionEvent0.getY() >= ((float)v) || motionEvent0.getY() <= ((float)(v1 - v))) {
                C c0 = this.F0;
                if(c0 != null) {
                    c0.h0.i();
                    this.finish();
                    return true;
                }
                j.p("viewModel");
                throw null;
            }
        }
        return super.dispatchTouchEvent(motionEvent0);
    }

    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.y().h(1);
        C c0 = (C)new ViewModelProvider(this, new z(this)).a(C.class);
        o o0 = (o)d.a(this.getLayoutInflater(), 0x7F0D0026, null);  // layout:announcement_detail
        this.B(o0.w);
        o0.u(c0);
        o0.r(this);
        this.setContentView(o0.d);
        this.getWindow().setLayout(-1, -1);
        c0.Y.c(this, this.E0);
        this.F0 = c0;
    }
}

