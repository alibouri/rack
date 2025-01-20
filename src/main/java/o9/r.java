package o9;

import Nb.j;
import ac.B0;
import ac.h0;
import ac.h;
import ac.j0;
import ac.o0;
import androidx.lifecycle.ViewModel;
import com.sendwave.backend.fragment.BillFieldsFragment;

public final class r extends n {
    public final B0 e0;
    public final j0 f0;

    public r(ViewModel viewModel0, BillFieldsFragment billFieldsFragment0, h0 h00) {
        j.f(viewModel0, "parent");
        super(viewModel0, 0x7F0D00C9, billFieldsFragment0, billFieldsFragment0);  // layout:personal_bill_fixed_value_field
        this.e0 = o0.c(((B0)h00).getValue());
        this.f0 = q9.o0.a(Boolean.TRUE);
    }

    @Override  // o9.n
    public final String c() {
        return (String)this.e0.getValue();
    }

    @Override  // o9.n
    public final h d() {
        return this.f0;
    }
}

