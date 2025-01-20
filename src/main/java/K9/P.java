package K9;

import Bb.z;
import Ha.S;
import N9.n;
import Nb.j;
import Nb.x;
import Tb.e;
import X8.f;
import ac.B0;
import ac.e0;
import ac.h;
import ac.j0;
import ac.o0;
import androidx.lifecycle.FlowWatcherKt;
import androidx.lifecycle.SubViewModel;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.WatchedProperty;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import mb.a;

public final class p extends SubViewModel {
    public final CloseableCoroutineScope Y;
    public final f Z;
    public final String b0;
    public final String c0;
    public final k d0;
    public final h e0;
    public final n f0;
    public final B0 g0;
    public final j0 h0;
    public final B0 i0;
    public final S j0;
    public final B0 k0;
    public final B0 l0;
    public final WatchedProperty m0;
    public final bc.n n0;
    public static final e[] o0;

    static {
        Nb.p p0 = new Nb.p(p.class, "wLatestContactQuery", "getWLatestContactQuery()Ljava/lang/String;", 0);
        x.a.getClass();
        p.o0 = new e[]{p0};
    }

    public p(ViewModel viewModel0, CloseableCoroutineScope closeableCoroutineScope0, f f0, String s, String s1, h h0, k k0, h h1, n n0) {
        j.f(h1, "canScanQrSendScreen");
        super(viewModel0);
        this.Y = closeableCoroutineScope0;
        this.Z = f0;
        this.b0 = s;
        this.c0 = s1;
        this.d0 = k0;
        this.e0 = h1;
        this.f0 = n0;
        Boolean boolean0 = Boolean.FALSE;
        B0 b00 = o0.c(boolean0);
        this.g0 = b00;
        j0 j00 = new j0(b00);
        this.h0 = j00;
        this.i0 = o0.c(boolean0);
        this.j0 = new S(h0, 1, this);
        this.k0 = o0.c(z.X);
        B0 b01 = o0.c("");
        this.l0 = b01;
        this.m0 = FlowWatcherKt.b(b01).a(this, p.o0[0]);
        this.n0 = o0.z(o0.m(new e0(b01, j00, l.f0, 0), 0xFAL), new m(this, null));
    }

    public final void c() {
        if(!((Boolean)((B0)this.h0.X).getValue()).booleanValue()) {
            return;
        }
        K9.n n0 = new K9.n(this, null);
        a.a(null, this.Y, n0, 1);
    }

    public final void d(boolean z) {
        do {
            Object object0 = this.g0.getValue();
            ((Boolean)object0).getClass();
        }
        while(!this.g0.j(object0, Boolean.valueOf(z)));
    }
}

