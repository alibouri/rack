package R9;

import Aa.w;
import Bb.z;
import E9.a;
import Nb.j;
import Nb.p;
import Nb.x;
import Qa.T;
import Tb.e;
import V8.c;
import Xb.r0;
import Y8.N;
import Y8.R6;
import a9.T7;
import ac.B0;
import ac.h;
import ac.o0;
import androidx.lifecycle.FlowWatcherKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.WatchedProperty;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import com.sendwave.util.Country;
import com.wave.customer.VerifyPinParams;
import f9.A;
import q9.r1;
import q9.v2;
import s9.f;

public final class y3 extends ViewModel implements f {
    public final R6 Y;
    public final v2 Z;
    public final VerifyPinParams b0;
    public final Country c0;
    public final a d0;
    public final w e0;
    public final boolean f0;
    public final c g0;
    public final boolean h0;
    public final String i0;
    public final A j0;
    public final r3 k0;
    public final String l0;
    public final B0 m0;
    public final B0 n0;
    public final B0 o0;
    public final WatchedProperty p0;
    public final T q0;
    public final B0 r0;
    public static final e[] s0;

    static {
        p p0 = new p(y3.class, "wSupportHoursDisplayInfo", "getWSupportHoursDisplayInfo()Lcom/sendwave/util/supportHours/SupportHoursDisplayInfo;", 0);
        x.a.getClass();
        y3.s0 = new e[]{p0};
    }

    public y3(R6 r60, v2 v20, VerifyPinParams verifyPinParams0, Country country0, a a0, w w0, boolean z) {
        j.f(r60, "nonauthedRepo");
        j.f(a0, "analytics");
        super();
        this.Y = r60;
        this.Z = v20;
        this.b0 = verifyPinParams0;
        this.c0 = country0;
        this.d0 = a0;
        this.e0 = w0;
        this.f0 = z;
        this.g0 = new c(new V8.e());  // initializer: Ljava/lang/Object;-><init>()V
        this.h0 = verifyPinParams0.Z;
        this.i0 = verifyPinParams0.Z ? r1.d(0x7F12002E, new Object[0]) : null;  // string:add_another_account "Add another account"
        w w1 = new w(2, this, y3.class, "submit", "submit(Ljava/lang/String;Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/Job;", 0, 8);
        Ha.f f0 = new Ha.f(0, this, y3.class, "cancel", "cancel()V", 0, 18);
        CloseableCoroutineScope closeableCoroutineScope0 = ViewModelKt.a(this);
        this.j0 = new A(verifyPinParams0.Y, w1, f0, closeableCoroutineScope0);
        this.k0 = new r3(this);
        this.l0 = "login_pin_entry";
        B0 b00 = o0.c(null);
        this.m0 = b00;
        this.n0 = o0.c(z.X);
        B0 b01 = o0.c(null);
        this.o0 = b01;
        this.p0 = FlowWatcherKt.b(b01).b(this, y3.s0[0]);
        this.q0 = new T(b00, 6);
        this.r0 = o0.c(Boolean.FALSE);
    }

    @Override  // s9.f
    public final r0 a() {
        u3 u30 = new u3(this, null);
        return N.k(this, this.g0, true, u30);
    }

    @Override  // s9.f
    public final B0 c() {
        return this.r0;
    }

    @Override  // s9.f
    public final r0 d(T7 t70) {
        j.f(t70, "supportChannel");
        v3 v30 = new v3(this, t70, null);
        return N.k(this, this.g0, true, v30);
    }

    @Override  // s9.f
    public final h e() {
        return this.n0;
    }

    @Override  // s9.f
    public final void g() {
        Boolean boolean0 = Boolean.FALSE;
        this.r0.getClass();
        this.r0.l(null, boolean0);
    }

    @Override  // s9.f
    public final h i() {
        return this.o0;
    }

    @Override  // s9.f
    public final h j() {
        return this.q0;
    }
}

