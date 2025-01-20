package o9;

import Aa.v;
import Ab.t;
import Bb.z;
import E9.a;
import Nb.j;
import Nb.p;
import Nb.x;
import Qa.T;
import R9.m;
import Tb.e;
import V8.c;
import Xb.J;
import Xb.N;
import Xb.r0;
import Y8.H6;
import Y8.O;
import Y8.R6;
import Y8.R8;
import Y8.S6;
import Y8.U8;
import Y8.V;
import Y8.y6;
import a9.T7;
import a9.w7;
import ac.B0;
import ac.h0;
import ac.h;
import ac.j0;
import ac.o0;
import androidx.lifecycle.FlowWatcherKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.WatchedProperty;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import bc.n;
import com.apollographql.apollo.api.Optional.Present;
import com.sendwave.backend.type.SecurityQuestionFieldFormat.DROPDOWN;
import com.sendwave.backend.type.SecurityQuestionFieldFormat.HIDDEN;
import com.sendwave.backend.type.SecurityQuestionFieldFormat.UNKNOWN__;
import com.sendwave.backend.type.SecurityQuestionFieldFormat;
import com.sendwave.backend.type.SecurityQuestionFormPurpose.PERSISTENT;
import com.sendwave.backend.type.SecurityQuestionFormPurpose.SELF_SERVE_PIN_RECOVERY;
import com.sendwave.util.Country;
import j6.w;
import java.util.LinkedHashMap;
import pb.E;
import q9.r1;
import s9.f;

public final class X extends ViewModel implements f {
    public final T A0;
    public final B0 B0;
    public static final w C0;
    public static final e[] D0;
    public static int E0;
    public final R6 Y;
    public final a Z;
    public final Country b0;
    public final String c0;
    public final boolean d0;
    public final Aa.w e0;
    public final boolean f0;
    public final c g0;
    public N h0;
    public final CharSequence i0;
    public final String j0;
    public final int k0;
    public final B0 l0;
    public final LinkedHashMap m0;
    public final B0 n0;
    public final WatchedProperty o0;
    public final B0 p0;
    public final j0 q0;
    public final B0 r0;
    public final B0 s0;
    public final j0 t0;
    public final String u0;
    public final B0 v0;
    public final WatchedProperty w0;
    public final E x0;
    public final B0 y0;
    public final B0 z0;

    static {
        p p0 = new p(X.class, "wFormLabel", "getWFormLabel()Ljava/lang/String;", 0);
        x.a.getClass();
        X.D0 = new e[]{p0, new p(X.class, "wSupportCallingParams", "getWSupportCallingParams()Lcom/wave/voip/SupportCallingParams;", 0)};
        X.C0 = new w(29);
    }

    public X(R6 r60, a a0, Country country0, String s, boolean z, Aa.w w0, boolean z1, v v0) {
        j.f(r60, "repo");
        j.f(a0, "analytics");
        super();
        this.Y = r60;
        this.Z = a0;
        this.b0 = country0;
        this.c0 = s;
        this.d0 = z;
        this.e0 = w0;
        this.f0 = z1;
        this.g0 = new c(o9.E.a);
        this.i0 = z ? r1.d(0x7F12048B, new Object[0]) : r1.d(0x7F1203D0, new Object[0]);  // string:verify_identity_create_secret_code "Please verify your identity to create 
                                                                                          // a new secret code"
        this.j0 = z ? r1.d(0x7F12048A, new Object[0]) : r1.d(0x7F1203D1, new Object[0]);  // string:verify_identity "Verify identity"
        this.k0 = z ? 0x7F080273 : 0x7F08024D;  // drawable:ic_pin_recovery_penguin
        this.l0 = o0.c(null);
        this.m0 = new LinkedHashMap();
        B0 b00 = o0.c(null);
        this.n0 = b00;
        this.o0 = FlowWatcherKt.b(b00).b(this, X.D0[0]);
        B0 b01 = o0.c(z.X);
        this.p0 = b01;
        n n0 = o0.F(b01, new m(3, null, 4));
        Boolean boolean0 = Boolean.FALSE;
        this.q0 = q9.o0.d0(this, n0, boolean0);
        this.r0 = o0.c(boolean0);
        this.r();
        B0 b02 = o0.c(boolean0);
        this.s0 = b02;
        this.t0 = new j0(b02);
        this.u0 = "security_challenges";
        B0 b03 = o0.c(null);
        this.v0 = b03;
        this.w0 = FlowWatcherKt.b(new T(o0.c(null), 12)).b(this, X.D0[1]);
        CloseableCoroutineScope closeableCoroutineScope0 = ViewModelKt.a(this);
        this.x0 = (E)v0.h(b02, s9.a.c0, closeableCoroutineScope0);
        this.y0 = o0.c(z.X);
        this.z0 = o0.c(null);
        this.A0 = new T(b03, 13);
        this.B0 = o0.c(boolean0);
    }

    @Override  // s9.f
    public final r0 a() {
        o9.T t0 = new o9.T(this, null);
        return Y8.N.k(this, this.g0, true, t0);
    }

    @Override  // s9.f
    public final B0 c() {
        return this.B0;
    }

    @Override  // s9.f
    public final r0 d(T7 t70) {
        j.f(t70, "supportChannel");
        U u0 = new U(this, t70, null);
        return Y8.N.k(this, this.g0, true, u0);
    }

    @Override  // s9.f
    public final h e() {
        return this.y0;
    }

    @Override  // s9.f
    public final void g() {
        Boolean boolean0 = Boolean.FALSE;
        this.B0.getClass();
        this.B0.l(null, boolean0);
    }

    @Override  // s9.f
    public final h i() {
        return this.z0;
    }

    @Override  // s9.f
    public final h j() {
        return this.A0;
    }

    public static final Object o(X x0, Fb.c c0) {
        Object object2;
        boolean z1;
        Object object3;
        c c1;
        F f0;
        x0.getClass();
        if(c0 instanceof F) {
            f0 = (F)c0;
            int v = f0.g0;
            if((v & 0x80000000) == 0) {
                f0 = new F(x0, c0);
            }
            else {
                f0.g0 = v ^ 0x80000000;
            }
        }
        else {
            f0 = new F(x0, c0);
        }
        Object object0 = f0.e0;
        Object object1 = Eb.a.X;
        t t0 = t.a;
        switch(f0.g0) {
            case 0: {
                W5.f.b0(object0);
                f0.b0 = x0;
                c1 = x0.g0;
                f0.c0 = c1;
                z1 = false;
                f0.d0 = false;
                f0.g0 = 1;
                object3 = o0.v(x0.z0, f0);
                if(object3 != object1) {
                label_44:
                    f0.b0 = x0;
                    f0.c0 = null;
                    f0.d0 = z1;
                    f0.g0 = 2;
                    object2 = Bb.F.M(c1, ((t9.a)object3), 0x7F1201A4, 0x7F120349, f0);  // string:forgot_your_pin "Forgot your secret code?"
                    if(object2 != object1) {
                    label_50:
                        if(((Boolean)object2).booleanValue()) {
                            x0.g();
                            return t0;
                        }
                        x0.getClass();
                        pb.f f1 = (pb.f)x0.w0.a(X.D0[1], x0);
                        c c2 = x0.g0;
                        if(f1 != null) {
                            f0.b0 = null;
                            f0.g0 = 3;
                            return x0.x0.a(f0, c2, f1, z1) == object1 ? object1 : t0;
                        }
                        R2.f.u(x0.Z, s9.a.c0, z1);
                        f0.b0 = x0;
                        f0.g0 = 4;
                        object0 = c2.e(f0);
                        if(object0 != object1) {
                            ((o9.x)object0).F(x0.b0.j0);
                            return t0;
                        }
                    }
                }
                break;
            }
            case 1: {
                boolean z2 = f0.d0;
                c1 = f0.c0;
                X x2 = f0.b0;
                W5.f.b0(object0);
                z1 = z2;
                x0 = x2;
                object3 = object0;
                goto label_44;
            }
            case 2: {
                boolean z = f0.d0;
                X x1 = f0.b0;
                W5.f.b0(object0);
                z1 = z;
                x0 = x1;
                object2 = object0;
                goto label_50;
            }
            case 3: {
                W5.f.b0(object0);
                return t0;
            }
            case 4: {
                x0 = f0.b0;
                W5.f.b0(object0);
                ((o9.x)object0).F(x0.b0.j0);
                return t0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return object1;
    }

    public static final J1 p(X x0, w7 w70) {
        LinkedHashMap linkedHashMap0 = x0.m0;
        String s = w70.a;
        Object object0 = linkedHashMap0.get(s);
        if(object0 == null) {
            object0 = o0.c("");
            linkedHashMap0.put(s, object0);
        }
        SecurityQuestionFieldFormat securityQuestionFieldFormat0 = w70.b;
        if(securityQuestionFieldFormat0 instanceof DROPDOWN) {
            return new J1(x0, x0.Z, w70, ((h0)object0));
        }
        if(!(securityQuestionFieldFormat0 instanceof HIDDEN) && !(securityQuestionFieldFormat0 instanceof UNKNOWN__)) {
            throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
        }
        throw new V(null);
    }

    public final void q() {
        if(this.d0) {
            this.Z.d("customer calling support in in app pin recovery", null);
            G g0 = new G(this, null);
            Y8.N.k(this, this.g0, true, g0);
            return;
        }
        H h0 = new H(this, null);
        Y8.N.k(this, this.g0, true, h0);
    }

    public final void r() {
        Present optional$Present0 = this.d0 ? S6.a(SELF_SERVE_PIN_RECOVERY.X) : S6.a(PERSISTENT.X);
        this.h0 = J.d(ViewModelKt.a(this), null, new K(this, optional$Present0, null), 3);
    }

    public final Object s(Fb.c c0) {
        X x0;
        L l0;
        if(c0 instanceof L) {
            l0 = (L)c0;
            int v = l0.e0;
            if((v & 0x80000000) == 0) {
                l0 = new L(this, c0);
            }
            else {
                l0.e0 = v ^ 0x80000000;
            }
        }
        else {
            l0 = new L(this, c0);
        }
        Object object0 = l0.c0;
        Object object1 = Eb.a.X;
        switch(l0.e0) {
            case 0: {
                W5.f.b0(object0);
                try {
                    U8 u80 = new U8();  // initializer: Ljava/lang/Object;-><init>()V
                    l0.b0 = this;
                    l0.e0 = 1;
                    object0 = R6.d(this.Y, u80, H6.Y, null, l0, 4);
                }
                catch(O unused_ex) {
                    return this.c0;
                }
                if(object0 == object1) {
                    return object1;
                }
                x0 = this;
                return ((R8)((y6)object0).b).a.a.a;
            }
            case 1: {
                try {
                    x0 = l0.b0;
                    W5.f.b0(object0);
                    return ((R8)((y6)object0).b).a.a.a;
                }
                catch(O unused_ex) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return x0.c0;
    }
}

