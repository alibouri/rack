package o9;

import H6.e;
import N2.l;
import Nb.j;
import P4.c;
import a9.k0;
import ac.B0;
import ac.d0;
import ac.e0;
import ac.h0;
import ac.h;
import ac.j0;
import ac.o0;
import androidx.lifecycle.ViewModel;
import com.sendwave.backend.fragment.BillFieldsFragment;
import f9.L;
import ma.N;

public final class w extends n {
    public final h0 e0;
    public final L f0;
    public final B0 g0;
    public final B0 h0;
    public final d0 i0;
    public final j0 j0;
    public final l k0;

    public w(ViewModel viewModel0, BillFieldsFragment billFieldsFragment0, k0 k00, h0 h00, B0 b00) {
        j.f(viewModel0, "parent");
        int v;
        j.f(k00, "field");
        j.f(b00, "focusTracker");
        super(viewModel0, 0x7F0D00CD, billFieldsFragment0, k00);  // layout:personal_bill_text_field
        this.e0 = h00;
        L l0 = c.u(k00);
        this.f0 = l0;
        B0 b01 = o0.c(l0.b(((String)((B0)h00).getValue())));
        this.g0 = b01;
        this.h0 = o0.c(((String)b01.getValue()).length());
        e0 e00 = new e0(h00, k00, billFieldsFragment0, 1);
        e0 e01 = q9.o0.l(b00, h00, this.c0);
        N n0 = new N(4, null, 2);
        this.i0 = o0.j(e01, e00, this.d0, n0);
        f9.N.X.getClass();
        switch(e.l(k00.d).ordinal()) {
            case 0: {
                v = 2;
                break;
            }
            case 1: {
                v = 0x91;
                break;
            }
            default: {
                throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
            }
        }
        this.j0 = q9.o0.a(v);
        this.k0 = new l(12, e00);
    }

    @Override  // o9.n
    public final String c() {
        return (String)this.g0.getValue();
    }

    @Override  // o9.n
    public final h d() {
        return this.k0;
    }
}

