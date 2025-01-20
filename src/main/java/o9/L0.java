package o9;

import D9.a;
import G9.c;
import Nb.j;
import Nb.p;
import Nb.x;
import Tb.e;
import Xb.A0;
import Y8.N;
import Y8.R6;
import androidx.lifecycle.FlowWatcherKt;
import androidx.lifecycle.WatchedProperty;
import com.sendwave.shared.PayBillDialogParams;
import ha.v2;
import p9.D;
import q9.n;

public final class l0 extends Y0 {
    public final a L0;
    public final WatchedProperty M0;
    public final WatchedProperty N0;
    public final D O0;
    public final WatchedProperty P0;
    public final WatchedProperty Q0;
    public static final e[] R0;

    static {
        p p0 = new p(l0.class, "wCanSend", "getWCanSend()Ljava/lang/Boolean;", 0);
        x.a.getClass();
        l0.R0 = new e[]{p0, new p(l0.class, "wHasServerSideConfirmationMessage", "getWHasServerSideConfirmationMessage()Ljava/lang/Boolean;", 0), new p(l0.class, "wPollForPayment", "getWPollForPayment()Ljava/lang/Boolean;", 0), new p(l0.class, "wBillName", "getWBillName()Ljava/lang/String;", 0)};
    }

    public l0(R6 r60, PayBillDialogParams payBillDialogParams0, n n0, boolean z, c c0, a a0) {
        j.f(r60, "repo");
        j.f(c0, "announcementsSource");
        j.f(a0, "adTracking");
        super(r60, payBillDialogParams0, n0, c0, z, true);
        this.L0 = a0;
        this.M0 = FlowWatcherKt.b(this.x0).b(this, l0.R0[0]);
        this.N0 = FlowWatcherKt.b(new v2(this.d0, 22)).b(this, l0.R0[1]);
        this.O0 = new D(r60, this.d0, this);
        this.P0 = FlowWatcherKt.b(this.r0).b(this, l0.R0[2]);
        this.Q0 = FlowWatcherKt.b(this.n0).b(this, l0.R0[3]);
    }

    @Override  // o9.Y0
    public final A0 x() {
        j0 j00 = new j0(this, null);
        return N.k(this, this.l0, true, j00);
    }
}

