package q9;

import Aa.w;
import Ab.t;
import Bb.F;
import Bb.z;
import E9.a;
import K.v;
import Nb.j;
import Nb.p;
import Nb.x;
import Sb.d;
import Tb.e;
import V8.c;
import Xb.J;
import Xb.r0;
import Y8.N;
import Y8.R6;
import a9.T7;
import a9.o4;
import ac.B0;
import ac.h;
import ac.o0;
import androidx.lifecycle.FlowWatcherKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.WatchedProperty;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import com.sendwave.util.Country;
import f9.A;
import java.util.Map;
import pa.m;
import pb.E;
import s9.f;

public final class a2 extends ViewModel implements f {
    public final boolean A0;
    public final String B0;
    public final B0 C0;
    public final B0 D0;
    public final B0 E0;
    public static final e[] F0;
    public final R6 Y;
    public final J1 Z;
    public final s0 b0;
    public final B0 c0;
    public final Country d0;
    public final String e0;
    public final a f0;
    public final w g0;
    public final boolean h0;
    public final c i0;
    public final String j0;
    public int k0;
    public boolean l0;
    public boolean m0;
    public final Q1 n0;
    public final v o0;
    public final A p0;
    public final B0 q0;
    public final String r0;
    public final B0 s0;
    public final B0 t0;
    public final WatchedProperty u0;
    public final E v0;
    public final B0 w0;
    public final B0 x0;
    public final WatchedProperty y0;
    public final X1 z0;

    static {
        p p0 = new p(a2.class, "wSupportCallingParams", "getWSupportCallingParams()Lcom/wave/voip/SupportCallingParams;", 0);
        x.a.getClass();
        a2.F0 = new e[]{p0, new p(a2.class, "wSupportHoursDisplayInfo", "getWSupportHoursDisplayInfo()Lcom/sendwave/util/supportHours/SupportHoursDisplayInfo;", 0)};
    }

    public a2(R6 r60, v2 v20, J1 j10, s0 s00, B0 b00, Country country0, String s, a a0, w w0, B9.f f0, boolean z, Aa.v v0) {
        j.f(r60, "repo");
        String s3;
        j.f(v20, "pinRepository");
        j.f(j10, "lockScreenRepository");
        j.f(s00, "biometricEnrolledRepository");
        j.f(a0, "analytics");
        j.f(f0, "accountManager");
        super();
        this.Y = r60;
        this.Z = j10;
        this.b0 = s00;
        this.c0 = b00;
        this.d0 = country0;
        this.e0 = s;
        this.f0 = a0;
        this.g0 = w0;
        this.h0 = z;
        this.i0 = new c(I1.a);
        String s1 = r1.d(0x7F120343, new Object[0]);  // string:pin_required_to_unlock "Your secret code is required to unlock Wave"
        this.j0 = s1;
        this.k0 = 3;
        Q1 q10 = new Q1(this);
        this.n0 = q10;
        this.o0 = new v(r60, v20);
        w w1 = new w(2, this, a2.class, "submit", "submit(Ljava/lang/String;Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/Job;", 0, 14);
        m m0 = new m(0, this, a2.class, "cancel", "cancel()V", 0, 8);
        CloseableCoroutineScope closeableCoroutineScope0 = ViewModelKt.a(this);
        A a1 = new A(s1, w1, m0, q10.c, b00, closeableCoroutineScope0);
        this.p0 = a1;
        this.q0 = a1.f;
        this.r0 = "lockscreen";
        B0 b01 = o0.c(null);
        this.s0 = b01;
        B0 b02 = o0.c(null);
        this.t0 = b02;
        this.u0 = FlowWatcherKt.b(new X1(b02, 0)).b(this, a2.F0[0]);
        CloseableCoroutineScope closeableCoroutineScope1 = ViewModelKt.a(this);
        this.v0 = (E)v0.h(a1.f, s9.a.b0, closeableCoroutineScope1);
        this.w0 = o0.c(z.X);
        B0 b03 = o0.c(null);
        this.x0 = b03;
        this.y0 = FlowWatcherKt.b(b03).b(this, a2.F0[1]);
        this.z0 = new X1(b01, 1);
        this.A0 = f0.f().size() > 1;
        String s2 = f0.h();
        if(s2 == null) {
            s3 = null;
        }
        else {
            s3 = l1.b(s2);
            char[] arr_c = s3.toCharArray();
            j.e(arr_c, "toCharArray(...)");
            Map map0 = (Map)l1.c.getValue();
            Country country1 = M0.c(s2);
            j.c(country1);
            d d0 = (d)map0.get(country1.Y);
            if(d0 != null) {
                int v2 = 0;
                for(int v1 = 0; v1 < arr_c.length; ++v1) {
                    if(arr_c[v1] == 0xA0) {
                        ++v2;
                    }
                    else if(d0.X <= v1 - v2 && v1 - v2 <= d0.Y) {
                        arr_c[v1] = '•';
                    }
                }
                s3 = new String(arr_c);
            }
        }
        this.B0 = s3;
        Boolean boolean0 = Boolean.FALSE;
        this.C0 = o0.c(boolean0);
        J.q(ViewModelKt.a(this), null, null, new K1(this, null), 3);
        this.D0 = o0.c((((Boolean)this.c0.getValue()).booleanValue() ? "" : this.j0));
        this.E0 = o0.c(boolean0);
    }

    @Override  // s9.f
    public final r0 a() {
        U1 u10 = new U1(this, null);
        return N.k(this, this.i0, true, u10);
    }

    @Override  // s9.f
    public final B0 c() {
        return this.C0;
    }

    @Override  // s9.f
    public final r0 d(T7 t70) {
        j.f(t70, "supportChannel");
        V1 v10 = new V1(this, t70, null);
        return N.k(this, this.i0, true, v10);
    }

    @Override  // s9.f
    public final h e() {
        return this.w0;
    }

    @Override  // s9.f
    public final void g() {
        Boolean boolean0 = Boolean.FALSE;
        this.C0.getClass();
        this.C0.l(null, boolean0);
    }

    @Override  // s9.f
    public final h i() {
        return this.x0;
    }

    @Override  // s9.f
    public final h j() {
        return this.z0;
    }

    public static final Object o(a2 a20, boolean z, Fb.c c0) {
        R1 r10;
        a20.getClass();
        if(c0 instanceof R1) {
            r10 = (R1)c0;
            int v = r10.f0;
            if((v & 0x80000000) == 0) {
                r10 = new R1(a20, c0);
            }
            else {
                r10.f0 = v ^ 0x80000000;
            }
        }
        else {
            r10 = new R1(a20, c0);
        }
        Object object0 = r10.d0;
        Object object1 = Eb.a.X;
        t t0 = t.a;
        e[] arr_e = a2.F0;
        switch(r10.f0) {
            case 0: {
                W5.f.b0(object0);
                t9.a a0 = (t9.a)a20.y0.a(arr_e[1], a20);
                r10.b0 = a20;
                r10.c0 = z;
                r10.f0 = 1;
                object0 = F.M(a20.i0, a0, 0x7F1201A4, 0x7F120349, r10);  // string:forgot_your_pin "Forgot your secret code?"
                if(object0 == object1) {
                    return object1;
                }
                goto label_29;
            }
            case 1: {
                z = r10.c0;
                a20 = r10.b0;
                W5.f.b0(object0);
            label_29:
                if(((Boolean)object0).booleanValue()) {
                    a20.g();
                    return t0;
                }
                a20.getClass();
                pb.f f0 = (pb.f)a20.u0.a(arr_e[0], a20);
                c c1 = a20.i0;
                if(f0 != null) {
                    r10.b0 = null;
                    r10.f0 = 2;
                    return a20.v0.a(r10, c1, f0, z) == object1 ? object1 : t0;
                }
                R2.f.u(a20.f0, s9.a.b0, z);
                r10.b0 = a20;
                r10.f0 = 3;
                object0 = c1.e(r10);
                if(object0 == object1) {
                    return object1;
                }
                ((q2)object0).F(a20.d0.j0);
                return t0;
            }
            case 2: {
                W5.f.b0(object0);
                return t0;
            }
            case 3: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        a20 = r10.b0;
        W5.f.b0(object0);
        ((q2)object0).F(a20.d0.j0);
        return t0;
    }

    public static final void p(a2 a20, o4 o40) {
        a20.getClass();
        a20.l0 = o40.b;
        a20.m0 = o40.e;
        a20.b0.getClass();
        a20.b0.d.i(s0.f[3], o40.c);
        a20.b0.e.i(s0.f[4], o40.d);
    }
}

