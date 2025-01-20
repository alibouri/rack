package Ba;

import G9.c;
import Nb.j;
import Y8.R6;
import ac.B0;
import ac.j0;
import ac.o0;
import ac.w;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.sendwave.backend.fragment.SavingsFragment;
import com.sendwave.backend.type.Currency.CFA;
import com.wave.customer.savings.deposit.DepositSavingsParams;

public final class q extends ViewModel {
    public final R6 Y;
    public final c Z;
    public final B0 b0;
    public final j0 c0;
    public final V8.c d0;

    public q(DepositSavingsParams depositSavingsParams0, R6 r60, c c0) {
        j.f(r60, "repo");
        j.f(c0, "announcementsSource");
        super();
        this.Y = r60;
        this.Z = c0;
        B0 b00 = o0.c(new k(true, null, null, CFA.X, null, null, null, null, null, false));
        this.b0 = b00;
        this.c0 = new j0(b00);
        this.d0 = new V8.c(s.a);
        o0.y(new w(new n(r60.h(depositSavingsParams0.X, SavingsFragment.class), 0), new o(this, null), 4), ViewModelKt.a(this));
    }
}

