package Aa;

import Bb.z;
import E9.a;
import Nb.j;
import Q4.i;
import V8.c;
import Xb.A0;
import Y8.N;
import Y8.R6;
import ac.B0;
import ac.i0;
import ac.j0;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import com.sendwave.backend.fragment.SavingsFragment;
import com.sendwave.util.Country;
import com.wave.customer.savings.SavingsParams;
import kotlin.jvm.functions.Function2;
import q9.n;
import q9.o0;
import s9.g;

public final class u0 extends ViewModel {
    public final SavingsParams Y;
    public final R6 Z;
    public final a b0;
    public final n c0;
    public final boolean d0;
    public final Country e0;
    public final w f0;
    public final Function2 g0;
    public final N9.n h0;
    public A0 i0;
    public final B0 j0;
    public final j0 k0;
    public final c l0;
    public final B0 m0;

    public u0(SavingsParams savingsParams0, R6 r60, a a0, n n0, x x0, boolean z, Country country0, w w0, v v0) {
        J j0 = new J(1);
        j.f(r60, "repo");
        j.f(a0, "analytics");
        super();
        this.Y = savingsParams0;
        this.Z = r60;
        this.b0 = a0;
        this.c0 = n0;
        this.d0 = z;
        this.e0 = country0;
        this.f0 = w0;
        this.g0 = j0;
        i0 i00 = o0.W(this, r60.h(savingsParams0.X, SavingsFragment.class), null, 6);
        B0 b00 = ac.o0.c(new c0(true, false, null, Y.a, z.X, null, null, false, false, null, null, new g(z.X, null, true), false, null, null));
        this.j0 = b00;
        this.k0 = new j0(b00);
        this.l0 = new c(w0.a);
        B0 b01 = ac.o0.c(Boolean.valueOf(((c0)b00.getValue()).a));
        this.m0 = b01;
        CloseableCoroutineScope closeableCoroutineScope0 = ViewModelKt.a(this);
        v0.h(b01, s9.a.i0, closeableCoroutineScope0);
        this.h0 = (N9.n)x0.j(new t0(i00, 0), ViewModelKt.a(this));
        Xb.J.q(ViewModelKt.a(this), null, null, new e0(this, null), 3);
        Xb.J.q(ViewModelKt.a(this), null, null, new f0(this, null), 3);
        ac.o0.y(new ac.w(ac.o0.z(i00, new h0(2, null)), new Aa.i0(this, null), 4), ViewModelKt.a(this));  // initializer: LFb/j;-><init>(ILkotlin/coroutines/g;)V
        Xb.J.q(ViewModelKt.a(this), null, null, new Aa.j0(this, null), 3);
        this.p();
    }

    public final void o(b0 b00, Boolean boolean0) {
        j.f(b00, "sheet");
        if(b00 == b0.Y && j.a(boolean0, Boolean.TRUE)) {
            j.f(this.b0, "<this>");
            i.y(this.b0, x0.d0, "Keep Vault locked button clicked", null);
        }
        do {
            B0 b01 = this.j0;
            Object object0 = b01.getValue();
            c0 c00 = (c0)object0;
            if(c00.k == b00) {
                c00 = c0.a(c00, false, false, null, null, null, null, null, false, false, null, null, null, false, null, null, 0x7BFF);
            }
        }
        while(!b01.j(object0, c00));
    }

    public final void p() {
        if(this.i0 != null && this.i0.b()) {
            return;
        }
        q0 q00 = new q0(this, null);
        this.i0 = N.k(this, this.l0, true, q00);
    }
}

