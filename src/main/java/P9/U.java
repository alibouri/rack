package p9;

import K9.K;
import Nb.j;
import Nb.p;
import Nb.x;
import R9.Q1;
import Tb.e;
import V8.c;
import Xb.J;
import Y8.R6;
import ac.B0;
import ac.e0;
import ac.i0;
import ac.j0;
import ac.o0;
import ac.r0;
import androidx.lifecycle.FlowWatcherKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.WatchedProperty;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import com.sendwave.backend.fragment.PayableWalletFragment;
import com.sendwave.shared.paybill.AddFavoriteParams;
import o9.R1;
import o9.U0;
import o9.X0;

public final class u extends ViewModel {
    public final R6 Y;
    public final c Z;
    public final WatchedProperty b0;
    public final WatchedProperty c0;
    public final WatchedProperty d0;
    public final O e0;
    public final B0 f0;
    public final e0 g0;
    public final WatchedProperty h0;
    public final B0 i0;
    public final B0 j0;
    public final WatchedProperty k0;
    public final q l0;
    public final B0 m0;
    public final B0 n0;
    public final j0 o0;
    public final Q1 p0;
    public final Q1 q0;
    public static final e[] r0;

    static {
        p p0 = new p(u.class, "wBillTypeId", "getWBillTypeId()Ljava/lang/String;", 0);
        x.a.getClass();
        u.r0 = new e[]{p0, new p(u.class, "wFavoriteBillTypeField", "getWFavoriteBillTypeField()Lcom/sendwave/backend/fragment/BillFieldsFragment;", 0), new p(u.class, "wFormatter", "getWFormatter()Lcom/sendwave/components/TextFieldFormatter;", 0), new p(u.class, "wSelectedLabel", "getWSelectedLabel()Ljava/lang/String;", 0), new p(u.class, "wRawInputVal", "getWRawInputVal()Ljava/lang/String;", 0)};
    }

    public u(R6 r60, AddFavoriteParams addFavoriteParams0) {
        j.f(r60, "repo");
        super();
        this.Y = r60;
        c c0 = new c(h.a);
        this.Z = c0;
        CloseableCoroutineScope closeableCoroutineScope0 = ViewModelKt.a(this);
        i0 i00 = o0.B(r60.h(addFavoriteParams0.X, PayableWalletFragment.class), closeableCoroutineScope0, r0.a(2, 5000L), 1);
        this.b0 = FlowWatcherKt.b(new U0(i00, 7)).b(this, u.r0[0]);
        U0 u00 = new U0(i00, 8);
        this.c0 = FlowWatcherKt.b(u00).b(this, u.r0[1]);
        this.d0 = FlowWatcherKt.b(new q(u00, 0)).b(this, u.r0[2]);
        O o0 = new O(this, i00, c0);
        this.e0 = o0;
        B0 b00 = o0.c(null);
        this.f0 = b00;
        X0 x00 = new X0(3, null, 3);
        e0 e00 = new e0(b00, o0.b0, x00, 0);
        this.g0 = e00;
        this.h0 = FlowWatcherKt.b(e00).b(this, u.r0[3]);
        this.i0 = o0.c("");
        B0 b01 = o0.c("");
        this.j0 = b01;
        this.k0 = FlowWatcherKt.b(b01).b(this, u.r0[4]);
        this.l0 = new q(u00, 1);
        this.m0 = o0.c(0);
        B0 b02 = o0.c(Boolean.FALSE);
        this.n0 = b02;
        this.o0 = new j0(b02);
        e0 e01 = new e0(b01, u00, new K(3, null, 11), 0);
        this.p0 = new Q1(e01, 5);
        this.q0 = new Q1(e01, 6);
        R1 r10 = new R1(4, this);
        J.q(FlowWatcherKt.a(o0), null, null, new p9.J(o0, r10, null), 3);
    }
}

