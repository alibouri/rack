package o9;

import Ha.S;
import Nb.j;
import Nb.p;
import Nb.x;
import Tb.e;
import a9.i0;
import ac.h;
import ac.j0;
import androidx.lifecycle.FlowWatcherKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.WatchedProperty;
import com.sendwave.backend.fragment.BillFieldsFragment;
import com.sendwave.models.CurrencyAmount;
import ha.v2;
import q9.o0;

public final class q extends n implements Y {
    public final WatchedProperty e0;
    public final j0 f0;
    public static final e[] g0;

    static {
        p p0 = new p(q.class, "wBillAmount", "getWBillAmount()Lcom/sendwave/models/CurrencyAmount;", 0);
        x.a.getClass();
        q.g0 = new e[]{p0};
    }

    public q(ViewModel viewModel0, BillFieldsFragment billFieldsFragment0, i0 i00, v2 v20) {
        j.f(viewModel0, "parent");
        j.f(i00, "field");
        super(viewModel0, 0x7F0D00C8, billFieldsFragment0, i00);  // layout:personal_bill_fixed_amount_field
        this.e0 = FlowWatcherKt.b(new S(v20, 22, billFieldsFragment0)).a(this, q.g0[0]);
        this.f0 = o0.a(Boolean.TRUE);
    }

    @Override  // o9.Y
    public final CurrencyAmount a() {
        return (CurrencyAmount)this.e0.a(q.g0[0], this);
    }

    @Override  // o9.n
    public final String c() {
        return String.valueOf(this.Z.d);
    }

    @Override  // o9.n
    public final h d() {
        return this.f0;
    }
}

