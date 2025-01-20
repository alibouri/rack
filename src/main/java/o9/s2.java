package o9;

import Aa.w;
import Ab.t;
import Bb.z;
import E9.a;
import N2.l;
import Nb.j;
import Nb.p;
import Nb.x;
import Qa.T;
import Tb.e;
import V8.c;
import Xb.A0;
import Xb.J;
import Xb.u0;
import Y8.N;
import Y8.R6;
import Y8.W8;
import a9.T7;
import ac.B0;
import ac.h;
import ac.i0;
import ac.j0;
import ac.o0;
import ac.r0;
import androidx.lifecycle.FlowWatcherKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.WatchedProperty;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import com.sendwave.backend.fragment.SmsTokenFragment;
import com.sendwave.shared.VerifyAuthCodeParams;
import com.sendwave.util.Country;
import hb.n;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import m5.b;
import q9.M0;
import q9.r1;
import s9.f;

public final class s2 extends ViewModel implements f {
    public final WatchedProperty A0;
    public final j0 B0;
    public final T C0;
    public final j0 D0;
    public final T E0;
    public final j0 F0;
    public final String G0;
    public W8 H0;
    public final B0 I0;
    public final B0 J0;
    public final WatchedProperty K0;
    public final l L0;
    public final B0 M0;
    public static final e[] N0;
    public final R6 Y;
    public final VerifyAuthCodeParams Z;
    public final a b0;
    public final O1 c0;
    public final X8.f d0;
    public final w e0;
    public final boolean f0;
    public final B9.f g0;
    public final B0 h0;
    public final i0 i0;
    public final c j0;
    public final WatchedProperty k0;
    public final WatchedProperty l0;
    public final B0 m0;
    public final j0 n0;
    public final U0 o0;
    public final WatchedProperty p0;
    public final l q0;
    public final l r0;
    public String s0;
    public boolean t0;
    public boolean u0;
    public A0 v0;
    public boolean w0;
    public final B0 x0;
    public final B0 y0;
    public final j0 z0;

    static {
        p p0 = new p(s2.class, "tokenId", "getTokenId()Ljava/lang/String;", 0);
        x.a.getClass();
        s2.N0 = new e[]{p0, new p(s2.class, "attachLogs", "getAttachLogs()Ljava/lang/Boolean;", 0), new p(s2.class, "wLength", "getWLength()Ljava/lang/Integer;", 0), new p(s2.class, "wRobocallsEnabled", "getWRobocallsEnabled()Ljava/lang/Boolean;", 0), new p(s2.class, "wSupportHoursDisplayInfo", "getWSupportHoursDisplayInfo()Lcom/sendwave/util/supportHours/SupportHoursDisplayInfo;", 0)};
    }

    public s2(R6 r60, VerifyAuthCodeParams verifyAuthCodeParams0, a a0, O1 o10, X8.f f0, w w0, boolean z, B9.f f1) {
        j.f(r60, "repo");
        j.f(a0, "analytics");
        j.f(o10, "userEntry");
        j.f(f1, "accountManager");
        super();
        this.Y = r60;
        this.Z = verifyAuthCodeParams0;
        this.b0 = a0;
        this.c0 = o10;
        this.d0 = f0;
        this.e0 = w0;
        this.f0 = z;
        this.g0 = f1;
        boolean z1 = false;
        this.h0 = o0.c((verifyAuthCodeParams0.g0 ? r1.d(0x7F12002E, new Object[0]) : null));  // string:add_another_account "Add another account"
        CloseableCoroutineScope closeableCoroutineScope0 = ViewModelKt.a(this);
        i0 i00 = o0.B(r60.h(verifyAuthCodeParams0.X, SmsTokenFragment.class), closeableCoroutineScope0, r0.a(2, 5000L), 1);
        this.i0 = i00;
        this.j0 = new c(W1.a);
        U0 u00 = new U0(i00, 2);
        this.k0 = FlowWatcherKt.b(new U0(i00, 3)).b(this, s2.N0[0]);
        this.l0 = FlowWatcherKt.b(new U0(i00, 4)).b(this, s2.N0[1]);
        Boolean boolean0 = Boolean.FALSE;
        B0 b00 = o0.c(boolean0);
        this.m0 = b00;
        this.n0 = new j0(b00);
        U0 u01 = new U0(i00, 5);
        this.o0 = u01;
        this.p0 = FlowWatcherKt.b(u01).b(this, s2.N0[2]);
        this.q0 = new l(15, u01);
        this.r0 = new l(16, u00);
        this.s0 = "";
        u0 u02 = J.b();
        u02.f(null);
        this.v0 = u02;
        B0 b01 = o0.c(o9.a.Y);
        this.x0 = b01;
        B0 b02 = o0.c(r1.d(0x7F12037C, new Object[0]));  // string:resend_sms "Resend SMS"
        this.y0 = b02;
        this.z0 = new j0(b02);
        J.q(ViewModelKt.a(this), null, null, new X1(this, null), 3);
        this.A0 = FlowWatcherKt.b(new U0(i00, 6)).b(this, s2.N0[3]);
        this.B0 = q9.o0.d0(this, new T(b01, 17), boolean0);
        this.C0 = new T(b01, 18);
        this.D0 = q9.o0.d0(this, new T(b01, 14), boolean0);
        this.E0 = new T(b01, 15);
        this.F0 = q9.o0.d0(this, new T(b01, 16), boolean0);
        this.G0 = "login_sms_entry";
        this.I0 = o0.c(z.X);
        B0 b03 = o0.c(null);
        this.J0 = b03;
        this.K0 = FlowWatcherKt.b(b03).b(this, s2.N0[4]);
        W8 w80 = this.H0;
        if(w80 != null) {
            z1 = w80.c;
        }
        this.L0 = new l(4, Boolean.valueOf(z1));
        this.M0 = o0.c(boolean0);
    }

    @Override  // s9.f
    public final Xb.r0 a() {
        b2 b20 = new b2(this, null);
        return N.k(this, this.j0, true, b20);
    }

    @Override  // s9.f
    public final B0 c() {
        return this.M0;
    }

    @Override  // s9.f
    public final Xb.r0 d(T7 t70) {
        j.f(t70, "supportChannel");
        c2 c20 = new c2(this, t70, null);
        return N.k(this, this.j0, true, c20);
    }

    @Override  // s9.f
    public final h e() {
        return this.I0;
    }

    @Override  // s9.f
    public final void g() {
        Boolean boolean0 = Boolean.FALSE;
        this.M0.getClass();
        this.M0.l(null, boolean0);
    }

    @Override  // s9.f
    public final h i() {
        return this.J0;
    }

    @Override  // s9.f
    public final h j() {
        return this.L0;
    }

    public static final Object o(s2 s20, Fb.c c0) {
        String s1;
        String s;
        s2 s21;
        AtomicInteger atomicInteger1;
        Throwable throwable1;
        Object object4;
        B0 b00;
        Y1 y10;
        s20.getClass();
        if(c0 instanceof Y1) {
            y10 = (Y1)c0;
            int v = y10.g0;
            if((v & 0x80000000) == 0) {
                y10 = new Y1(s20, c0);
            }
            else {
                y10.g0 = v ^ 0x80000000;
            }
        }
        else {
            y10 = new Y1(s20, c0);
        }
        Object object0 = y10.e0;
        Object object1 = Eb.a.X;
        switch(y10.g0) {
            case 0: {
                W5.f.b0(object0);
                Map map0 = N.a;
                b00 = s20.m0;
                Object object2 = map0.get(b00);
                if(object2 == null) {
                    object2 = b.E(0, map0, b00);
                }
                AtomicInteger atomicInteger0 = (AtomicInteger)object2;
                do {
                    Object object3 = b00.getValue();
                    ((Boolean)object3).getClass();
                }
                while(!b00.j(object3, Boolean.valueOf(atomicInteger0.incrementAndGet() > 0)));
                try {
                    Country country0 = s20.p();
                    y10.b0 = s20;
                    y10.c0 = b00;
                    y10.d0 = atomicInteger0;
                    y10.g0 = 1;
                    object4 = q9.o0.C(country0, s20.Y, y10);
                }
                catch(Throwable throwable0) {
                    throwable1 = throwable0;
                    atomicInteger1 = atomicInteger0;
                    goto label_47;
                }
                if(object4 != object1) {
                    try {
                        s21 = s20;
                        atomicInteger1 = atomicInteger0;
                        s = (String)object4;
                        goto label_51;
                    }
                    catch(Throwable throwable1) {
                        goto label_47;
                    }
                }
                return object1;
            }
            case 1: {
                atomicInteger1 = y10.d0;
                b00 = y10.c0;
                s21 = (s2)y10.b0;
                try {
                    W5.f.b0(object0);
                    s = (String)object0;
                    goto label_51;
                }
                catch(Throwable throwable1) {
                }
                do {
                label_47:
                    Object object5 = b00.getValue();
                    ((Boolean)object5).getClass();
                }
                while(!b00.j(object5, Boolean.valueOf(atomicInteger1.decrementAndGet() > 0)));
                throw throwable1;
                do {
                label_51:
                    Object object6 = b00.getValue();
                    ((Boolean)object6).getClass();
                }
                while(!b00.j(object6, Boolean.valueOf(atomicInteger1.decrementAndGet() > 0)));
                R2.f.u(s21.b0, s9.a.f0, false);
                y10.b0 = s;
                y10.c0 = null;
                y10.d0 = null;
                y10.g0 = 2;
                Object object7 = s21.j0.e(y10);
                if(object7 != object1) {
                    object0 = object7;
                    s1 = s;
                    break;
                }
                return object1;
            }
            case 2: {
                s1 = (String)y10.b0;
                W5.f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ((P1)object0).F(s1);
        return t.a;
    }

    public final Country p() {
        Country country0 = M0.c(this.Z.c0);
        j.c(country0);
        return country0;
    }

    public final void q(boolean z) {
        e[] arr_e = s2.N0;
        boolean z1 = false;
        String s = (String)this.k0.a(arr_e[0], this);
        if(s == null) {
            return;
        }
        if(!z && (this.v0.b() || this.w0)) {
            return;
        }
        r2 r20 = new r2(this, s, null);
        Boolean boolean0 = (Boolean)this.l0.a(arr_e[1], this);
        if(boolean0 != null) {
            z1 = boolean0.booleanValue();
        }
        n.b = z1;
        CloseableCoroutineScope closeableCoroutineScope0 = ViewModelKt.a(this);
        A0 a00 = N.i(this.j0, true, closeableCoroutineScope0, r20);
        a00.q(new lb.j(6));
        this.v0 = a00;
    }
}

