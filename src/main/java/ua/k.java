package ua;

import E9.b;
import Nb.j;
import R9.e0;
import V8.c;
import Xb.J;
import ac.B0;
import ac.o0;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.sendwave.backend.type.Currency.CFA;
import ra.j0;

public final class k extends ViewModel {
    public final b Y;
    public final j0 Z;
    public final B0 b0;
    public final ac.j0 c0;
    public final c d0;

    public k(e0 e00, b b0) {
        j.f(e00, "cardsRepoProvider");
        super();
        this.Y = b0;
        this.Z = (j0)e00.n(ViewModelKt.a(this));
        B0 b00 = o0.c(new h(false, CFA.X, null, null, null));
        this.b0 = b00;
        this.c0 = new ac.j0(b00);
        this.d0 = new c(m.a);
        J.q(ViewModelKt.a(this), null, null, new i(this, null), 3);
    }
}

