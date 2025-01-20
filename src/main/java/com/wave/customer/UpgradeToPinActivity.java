package com.wave.customer;

import Ab.o;
import R1.d;
import R9.F2;
import R9.o3;
import W4.f;
import android.os.Bundle;
import android.widget.EditText;
import ca.c0;
import q9.k3;

public final class UpgradeToPinActivity extends k3 {
    public final o F0;
    public static final int G0;

    public UpgradeToPinActivity() {
        this.F0 = f.A(new F2(1, this));
    }

    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        o3 o30 = (o3)this.F0.getValue();
        c0 c00 = (c0)d.a(this.getLayoutInflater(), 0x7F0D0104, null);  // layout:upgrade_to_pin
        c00.u(o30.Z);
        c00.r(this);
        this.setContentView(c00.d);
        ((EditText)this.findViewById(0x7F0A018E)).requestFocus();  // id:invis_pin_entry
    }
}

