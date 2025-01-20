package com.sendwave.util;

import R1.d;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import i9.o;
import q9.C;
import q9.k3;
import q9.y;

public final class AnnouncementDetailActivity extends k3 {
    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        C c0 = (C)new ViewModelProvider(this, new y(this)).a(C.class);
        o o0 = (o)d.a(this.getLayoutInflater(), 0x7F0D0026, null);  // layout:announcement_detail
        this.B(o0.w);
        o0.u(c0);
        o0.r(this);
        this.setContentView(o0.d);
        c0.Y.c(this, this.E0);
    }
}

