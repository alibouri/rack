package com.sendwave.util;

import B3.c;
import E7.w;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import c2.I;
import c2.o;
import c2.s;
import d2.a;
import d2.d;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.k;

public final class LauncherFragment extends Fragment {
    public k X0;
    public final o Y0;

    public LauncherFragment() {
        I i0 = new I(4);
        w w0 = new w(27, this);
        c c0 = new c(22, this);
        if(this.X > 1) {
            throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
        }
        AtomicReference atomicReference0 = new AtomicReference();
        s s0 = new s(this, c0, atomicReference0, i0, w0);
        if(this.X >= 0) {
            s0.a();
        }
        else {
            this.U0.add(s0);
        }
        this.Y0 = new o(atomicReference0);
    }

    @Override  // androidx.fragment.app.Fragment
    public final void A(Bundle bundle0) {
        super.A(bundle0);
        d.b(new a(this, "Attempting to set retain instance for fragment " + this));
        d.a(this).getClass();
        this.A0 = true;
        androidx.fragment.app.d d0 = this.r0;
        if(d0 != null) {
            d0.O.o(this);
            return;
        }
        this.B0 = true;
    }

    @Override  // androidx.fragment.app.Fragment
    public final void C() {
        this.D0 = true;
        this.X0 = null;
    }
}

