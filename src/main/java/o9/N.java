package o9;

import Nb.j;
import ac.B0;
import ac.h;
import ac.o0;
import android.view.View;
import androidx.lifecycle.SubViewModel;
import androidx.lifecycle.ViewModel;
import com.sendwave.backend.fragment.BillFieldsFragment;

public abstract class n extends SubViewModel {
    public final int Y;
    public final BillFieldsFragment Z;
    public final Object b0;
    public final int c0;
    public final B0 d0;

    public n(ViewModel viewModel0, int v, BillFieldsFragment billFieldsFragment0, Object object0) {
        j.f(viewModel0, "parent");
        j.f(object0, "field");
        super(viewModel0);
        this.Y = v;
        this.Z = billFieldsFragment0;
        this.b0 = object0;
        this.c0 = View.generateViewId();
        this.d0 = o0.c(Boolean.FALSE);
    }

    public abstract String c();

    public abstract h d();

    public void e() {
    }
}

