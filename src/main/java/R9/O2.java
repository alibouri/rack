package R9;

import E9.a;
import Nb.j;
import Nb.p;
import Nb.x;
import Qa.T;
import Tb.e;
import V8.c;
import Y8.R6;
import ac.B0;
import ac.i0;
import ac.j0;
import ac.o0;
import ac.r0;
import androidx.lifecycle.FlowWatcherKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.WatchedProperty;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import com.sendwave.backend.fragment.QrScanOrCardFragment;
import com.wave.customer.QrScanOrCardParams;

public final class o2 extends ViewModel {
    public final R6 Y;
    public final QrScanOrCardParams Z;
    public final a b0;
    public final c c0;
    public final B0 d0;
    public final T e0;
    public final i0 f0;
    public final WatchedProperty g0;
    public final B0 h0;
    public final j0 i0;
    public static final e[] j0;

    static {
        p p0 = new p(o2.class, "wFragmentData", "getWFragmentData()Lcom/sendwave/backend/FragmentData;", 0);
        x.a.getClass();
        o2.j0 = new e[]{p0};
    }

    public o2(R6 r60, QrScanOrCardParams qrScanOrCardParams0, a a0) {
        j.f(r60, "repo");
        j.f(a0, "analytics");
        super();
        this.Y = r60;
        this.Z = qrScanOrCardParams0;
        this.b0 = a0;
        this.c0 = new c(k2.b);
        B0 b00 = o0.c(0);
        this.d0 = b00;
        this.e0 = new T(b00, 5);
        CloseableCoroutineScope closeableCoroutineScope0 = ViewModelKt.a(this);
        i0 i00 = o0.B(r60.h(qrScanOrCardParams0.Z, QrScanOrCardFragment.class), closeableCoroutineScope0, r0.a(2, 5000L), 1);
        this.f0 = i00;
        this.g0 = FlowWatcherKt.b(i00).b(this, o2.j0[0]);
        B0 b01 = o0.c(Boolean.FALSE);
        this.h0 = b01;
        this.i0 = new j0(b01);
    }

    public final c q() {
        return this.c0;
    }

    public final a r() {
        return this.b0;
    }

    public final QrScanOrCardParams s() {
        return this.Z;
    }

    public final R6 t() {
        return this.Y;
    }
}

