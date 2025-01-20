package oa;

import Bb.A;
import Bb.z;
import E9.a;
import Ha.S;
import Nb.j;
import R9.U1;
import V8.c;
import V8.e;
import Y8.N;
import Y8.R6;
import ac.B0;
import ac.e0;
import ac.j0;
import ac.o0;
import ac.w;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.wave.customer.linkedaccounts.typeselect.LinkedAccountTypeSelectParams;
import q9.n;

public final class t extends ViewModel {
    public final R6 Y;
    public final n Z;
    public final LinkedAccountTypeSelectParams b0;
    public final a c0;
    public final c d0;
    public final B0 e0;
    public final j0 f0;
    public final B0 g0;
    public final B0 h0;

    public t(R6 r60, n n0, LinkedAccountTypeSelectParams linkedAccountTypeSelectParams0, a a0) {
        j.f(r60, "repo");
        j.f(a0, "analytics");
        super();
        this.Y = r60;
        this.Z = n0;
        this.b0 = linkedAccountTypeSelectParams0;
        this.c0 = a0;
        c c0 = new c(new e());  // initializer: Ljava/lang/Object;-><init>()V
        this.d0 = c0;
        B0 b00 = o0.c(new i("", null, z.X, false));
        this.e0 = b00;
        j0 j00 = new j0(b00);
        this.f0 = j00;
        B0 b01 = o0.c(Boolean.FALSE);
        this.g0 = b01;
        B0 b02 = o0.c(A.X);
        this.h0 = b02;
        e0 e00 = new e0(o0.n(new U1(j00, 8)), b02, new oa.n(3, null), 0);  // initializer: LFb/j;-><init>(ILkotlin/coroutines/g;)V
        N.k(this, c0, true, new l(this, null));
        o0.y(new w(new S(e00, 24, this), new oa.j(this, null), 4), ViewModelKt.a(this));
        o0.y(new w(b01, new k(this, null), 4), ViewModelKt.a(this));
    }

    public final void o(String s) {
        j.f(s, "query");
        do {
            Object object0 = this.e0.getValue();
            j.f(((i)object0), "$this$updateState");
            i i0 = i.a(((i)object0), s, null, null, false, 14);
        }
        while(!this.e0.j(object0, i0));
    }
}

