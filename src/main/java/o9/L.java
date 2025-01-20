package o9;

import Ea.E0;
import Na.f;
import Nb.j;
import Nb.p;
import Nb.x;
import R9.Q1;
import Tb.e;
import a9.i0;
import ac.B0;
import ac.d0;
import ac.e0;
import ac.h0;
import ac.h;
import androidx.lifecycle.FlowWatcherKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.WatchedProperty;
import com.sendwave.backend.fragment.BillFieldsFragment;
import com.sendwave.models.CurrencyAmount;
import f9.a;
import java.math.BigDecimal;
import java.math.RoundingMode;
import ma.N;
import q9.L0;
import q9.o0;

public final class l extends n implements Y {
    public final h0 e0;
    public final a f0;
    public final Boolean g0;
    public final WatchedProperty h0;
    public final WatchedProperty i0;
    public final d0 j0;
    public final Q1 k0;
    public static final e[] l0;

    static {
        p p0 = new p(l.class, "wAmountText", "getWAmountText()Ljava/lang/String;", 0);
        x.a.getClass();
        l.l0 = new e[]{p0, new p(l.class, "wBillAmount", "getWBillAmount()Lcom/sendwave/models/CurrencyAmount;", 0)};
    }

    public l(ViewModel viewModel0, BillFieldsFragment billFieldsFragment0, i0 i00, h0 h00, h h0, B0 b00) {
        j.f(viewModel0, "parent");
        j.f(i00, "field");
        j.f(b00, "focusTracker");
        super(viewModel0, 0x7F0D00C6, billFieldsFragment0, i00);  // layout:personal_bill_amount_field
        this.e0 = h00;
        a a0 = new a(viewModel0, new f(7, h0));
        this.f0 = a0;
        this.g0 = i00.d;
        f f0 = new f(8, h0);
        E0 e00 = new E0(i00, null, 4);
        e0 e01 = new e0(a0.d0, f0, e00, 0);
        e0 e02 = o0.l(b00, h00, this.c0);
        this.h0 = FlowWatcherKt.b(a0.b0).a(this, l.l0[0]);
        this.i0 = FlowWatcherKt.b(a0.d0).a(this, l.l0[1]);
        N n0 = new N(4, null, 1);
        this.j0 = ac.o0.j(e02, e01, this.d0, n0);
        this.k0 = new Q1(e01, 3);
        String s = (String)((B0)h00).getValue();
        String s1 = (String)a0.b0.getValue();
        a0.e(0, ((String)a0.b0.getValue()).length(), s, s1);
    }

    @Override  // o9.Y
    public final CurrencyAmount a() {
        return (CurrencyAmount)this.i0.a(l.l0[1], this);
    }

    @Override  // o9.n
    public final String c() {
        return (String)((B0)this.e0).getValue();
    }

    @Override  // o9.n
    public final h d() {
        return this.k0;
    }

    @Override  // o9.n
    public final void e() {
        if(j.a(this.g0, Boolean.TRUE)) {
            String s = (String)this.h0.a(l.l0[0], this);
            if(s != null && !Vb.j.c0(s)) {
                CurrencyAmount currencyAmount0 = this.a();
                if(currencyAmount0 != null) {
                    RoundingMode roundingMode0 = RoundingMode.UP;
                    BigDecimal bigDecimal0 = L0.a(currencyAmount0.X);
                    BigDecimal bigDecimal1 = currencyAmount0.Y.divide(bigDecimal0, roundingMode0).setScale(0, roundingMode0).multiply(bigDecimal0);
                    j.e(bigDecimal1, "scalar");
                    this.f0.c0.getClass();
                    this.f0.c0.l(null, bigDecimal1);
                    String s1 = bigDecimal1.toString();
                    j.e(s1, "toString(...)");
                    this.f0.e(0, 0, s1, "");
                }
            }
        }
    }
}

