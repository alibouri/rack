package f9;

import Aa.t0;
import Ab.k;
import Ba.n;
import Bb.F;
import Ea.E0;
import Ha.S;
import N2.l;
import Nb.j;
import Nb.p;
import Nb.x;
import R9.I1;
import R9.U1;
import Tb.e;
import Xb.J;
import ac.B0;
import ac.d0;
import ac.e0;
import ac.h;
import ac.j0;
import ac.w;
import androidx.lifecycle.FlowWatcherKt;
import androidx.lifecycle.SubViewModel;
import androidx.lifecycle.WatchedProperty;
import com.sendwave.backend.type.Currency;
import com.sendwave.models.CurrencyAmount;
import com.sendwave.util.Country;
import com.wave.components.sendmoney.d;
import java.math.BigDecimal;
import java.util.Map;
import q9.A2;
import q9.s;

public final class o0 extends SubViewModel {
    public final B0 Y;
    public final int Z;
    public final int b0;
    public final Country c0;
    public final a d0;
    public final j0 e0;
    public final a f0;
    public V g0;
    public final e0 h0;
    public final B0 i0;
    public final B0 j0;
    public final B0 k0;
    public final B0 l0;
    public final B0 m0;
    public final WatchedProperty n0;
    public final d0 o0;
    public static final e[] p0;

    static {
        p p0 = new p(o0.class, "wTransferAmount", "getWTransferAmount()Lcom/sendwave/components/TransferAmount;", 0);
        x.a.getClass();
        o0.p0 = new e[]{p0};
    }

    public o0(d d0, t0 t00, B0 b00, Country country0, j0 j00, n n0) {
        super(d0);
        this.Y = b00;
        this.Z = 0x7F0A029B;  // id:send_amount_requester
        this.b0 = 0x7F0A0260;  // id:receive_amount_requester
        this.c0 = country0;
        s s0 = new s(5, new K9.e0(t00, 1));
        U1 u10 = new U1(j00, 4);
        a a0 = new a(d0, s0);
        this.d0 = a0;
        e0 e00 = q9.o0.l(b00, a0.b0, 0x7F0A029B);  // id:send_amount_requester
        this.e0 = q9.o0.b0(this, new e0(t00, j00, new E0(this, null, 2), 0), null);
        a a1 = new a(d0, u10, new l(7, s0));
        this.f0 = a1;
        e0 e01 = new e0(e00, q9.o0.l(b00, a1.b0, 0x7F0A0260), new I1(3, null, 2), 0);  // id:receive_amount_requester
        S s1 = new S(b00, 12, this);
        this.h0 = a0.d0;
        this.i0 = a0.b0;
        this.j0 = a0.e0;
        this.k0 = a1.b0;
        this.l0 = a1.e0;
        BigDecimal bigDecimal0 = BigDecimal.ZERO;
        j.e(bigDecimal0, "ZERO");
        B0 b01 = ac.o0.c(new W(bigDecimal0, bigDecimal0, bigDecimal0));
        this.m0 = b01;
        d0 d00 = ac.o0.j(s0, u10, b01, new n0(4, null, 0));
        this.n0 = FlowWatcherKt.b(d00).a(this, o0.p0[0]);
        K9.e0 e02 = new K9.e0(t00, 2);
        J.q(FlowWatcherKt.a(this), null, null, new f0(this, null), 3);
        l l0 = q9.o0.o(e02);
        w w0 = new w(n0, new l0(2, null));  // initializer: LFb/j;-><init>(ILkotlin/coroutines/g;)V
        m0 m00 = new m0(null);
        this.o0 = new d0(new h[]{d00, l0, e01, s1, w0}, m00, 1);
    }

    public final void c() {
        A2 a20;
        f9.d0 d00 = (f9.d0)((B0)this.e0.X).getValue();
        if(d00 == null) {
            return;
        }
        switch((this.g0 == null ? -1 : f9.e0.a[this.g0.ordinal()])) {
            case 1: {
                BigDecimal bigDecimal0 = new BigDecimal(-1);
                a20 = new A2(this.d0, this.f0, "send_amount", d00.a, bigDecimal0);
                break;
            }
            case 2: {
                a20 = new A2(this.f0, this.d0, "receive_amount", d00.b, BigDecimal.ONE);
                break;
            }
            default: {
                return;
            }
        }
        a a0 = (a)a20.b;
        String s = (String)a20.c;
        g9.h h0 = (g9.h)a20.d;
        BigDecimal bigDecimal1 = (BigDecimal)a20.e;
        BigDecimal bigDecimal2 = (BigDecimal)((a)a20.a).c0.getValue();
        Currency currency0 = ((a)a20.a).d();
        if(currency0 == null) {
            return;
        }
        Currency currency1 = a0.d();
        if(currency1 == null) {
            return;
        }
        if(this.g0 == V.Y && d00 instanceof b0) {
            Map map0 = F.K(new k[]{new k("fx_rate", ((b0)d00).g), new k("foreign_amount", bigDecimal2)});
            bigDecimal2 = ((b0)d00).f.X.v(map0);
        }
        Map map1 = F.J(new k(s, bigDecimal2));
        BigDecimal bigDecimal3 = h0.X.v(map1);
        j.e(bigDecimal3, "evaluate(...)");
        BigDecimal bigDecimal4 = bigDecimal1.multiply(bigDecimal3);
        j.e(bigDecimal4, "multiply(...)");
        BigDecimal bigDecimal5 = bigDecimal2.add(bigDecimal4);
        j.e(bigDecimal5, "add(...)");
        BigDecimal bigDecimal6 = bigDecimal5.max(BigDecimal.ZERO);
        if(this.g0 == V.X && d00 instanceof b0) {
            Map map2 = F.K(new k[]{new k("fx_rate", ((b0)d00).g), new k("domestic_amount", bigDecimal6)});
            bigDecimal6 = ((b0)d00).e.X.v(map2);
        }
        if(currency0.equals(currency1)) {
            j.c(bigDecimal6);
            a.g(a0, bigDecimal6);
        }
        else {
            a0.i(new CurrencyAmount(currency1, bigDecimal6));
        }
        do {
            Object object0 = this.m0.getValue();
            W w0 = (W)object0;
            BigDecimal bigDecimal7 = (BigDecimal)this.d0.c0.getValue();
            BigDecimal bigDecimal8 = (BigDecimal)this.f0.c0.getValue();
            BigDecimal bigDecimal9 = bigDecimal4.abs();
            j.e(bigDecimal9, "abs(...)");
            W w1 = new W(bigDecimal7, bigDecimal8, bigDecimal9);
        }
        while(!this.m0.j(object0, w1));
    }
}

