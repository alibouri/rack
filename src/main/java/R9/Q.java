package R9;

import Aa.t0;
import D9.a;
import Ha.S;
import Nb.j;
import Nb.p;
import Nb.x;
import Tb.e;
import V8.c;
import X8.f;
import Y8.R6;
import ac.B0;
import ac.i0;
import ac.j0;
import ac.o0;
import ac.r0;
import androidx.lifecycle.FlowWatcherKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.WatchedProperty;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import bc.n;
import com.sendwave.backend.fragment.PayBillDialogFragment;
import com.wave.customer.BuyAirtimeDialogParams;
import java.util.LinkedHashMap;
import p9.G;

public final class q extends G {
    public final BuyAirtimeDialogParams h0;
    public final f i0;
    public final a j0;
    public final c k0;
    public final B0 l0;
    public final j0 m0;
    public final i0 n0;
    public final B0 o0;
    public final LinkedHashMap p0;
    public final t0 q0;
    public final WatchedProperty r0;
    public final n s0;
    public final WatchedProperty t0;
    public static final e[] u0;

    static {
        p p0 = new p(q.class, "wFieldViewModels", "getWFieldViewModels()Ljava/util/List;", 0);
        x.a.getClass();
        q.u0 = new e[]{p0, new p(q.class, "wCanSend", "getWCanSend()Ljava/lang/Boolean;", 0)};
    }

    public q(R6 r60, BuyAirtimeDialogParams buyAirtimeDialogParams0, f f0, a a0, G9.c c0) {
        j.f(r60, "repo");
        j.f(a0, "adTracking");
        j.f(c0, "announcementsSource");
        super(r60, buyAirtimeDialogParams0.Y.Y, c0, false);
        this.h0 = buyAirtimeDialogParams0;
        this.i0 = f0;
        this.j0 = a0;
        this.k0 = new c(o9.i0.a);
        B0 b00 = o0.c(Boolean.FALSE);
        this.l0 = b00;
        this.m0 = new j0(b00);
        CloseableCoroutineScope closeableCoroutineScope0 = ViewModelKt.a(this);
        this.n0 = o0.B(r60.h(buyAirtimeDialogParams0.Y.X, PayBillDialogFragment.class), closeableCoroutineScope0, r0.a(2, 5000L), 1);
        this.o0 = o0.c(-1);
        this.p0 = new LinkedHashMap();
        i0 i00 = q9.o0.W(this, new S(new t0(this.d0, 13), 5, this), null, 6);
        t0 t00 = new t0(i00, 14);
        this.q0 = t00;
        this.r0 = FlowWatcherKt.b(i00).b(this, q.u0[0]);
        n n0 = o0.F(t00, new m(3, null, 0));
        this.s0 = n0;
        this.t0 = FlowWatcherKt.b(n0).b(this, q.u0[1]);
    }
}

