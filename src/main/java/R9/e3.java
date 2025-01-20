package R9;

import Ab.k;
import Ab.t;
import Bb.F;
import E9.a;
import Ha.f;
import Nb.j;
import Nb.p;
import Nb.x;
import S9.c;
import Tb.e;
import Y8.E8;
import Y8.G6;
import Y8.H8;
import Y8.N;
import Y8.Q;
import Y8.R3;
import Y8.R6;
import Y8.S3;
import Y8.T3;
import Y8.y6;
import ac.B0;
import ac.d0;
import ac.h0;
import ac.o0;
import androidx.lifecycle.FlowWatcherKt;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.WatchedProperty;
import bc.n;
import com.sendwave.backend.FragmentHandle;
import com.sendwave.backend.type.PartnerOrg;
import com.sendwave.backend.type.UserInterface.SMARTPHONE_APP;
import com.sendwave.util.Country;
import com.wave.customer.SignupLoginParams;
import d9.R0;
import io.sentry.Q0;
import io.sentry.i1;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import q9.M0;
import q9.r1;

public final class e3 extends ViewModel {
    public final f Y;
    public final Country Z;
    public final a b0;
    public final c c0;
    public final C9.a d0;
    public final X8.f e0;
    public final B9.f f0;
    public final B0 g0;
    public final WatchedProperty h0;
    public final V8.c i0;
    public final B0 j0;
    public final boolean k0;
    public final String l0;
    public final B0 m0;
    public final d0 n0;
    public final n o0;
    public static final e[] p0;

    static {
        p p0 = new p(e3.class, "wMobile", "getWMobile()Ljava/lang/String;", 0);
        x.a.getClass();
        e3.p0 = new e[]{p0};
    }

    public e3(SignupLoginParams signupLoginParams0, f f0, Country country0, a a0, c c0, C9.a a1, X8.f f1, B9.f f2) {
        j.f(a0, "analytics");
        j.f(c0, "accountSwitcherAnalytics");
        j.f(a1, "adTracking");
        j.f(f2, "accountManager");
        super();
        this.Y = f0;
        this.Z = country0;
        this.b0 = a0;
        this.c0 = c0;
        this.d0 = a1;
        this.e0 = f1;
        this.f0 = f2;
        B0 b00 = o0.c("");
        this.g0 = b00;
        this.h0 = FlowWatcherKt.b(b00).b(this, e3.p0[0]);
        this.i0 = new V8.c(new V2());
        this.j0 = o0.c(Boolean.FALSE);
        this.k0 = signupLoginParams0.X;
        this.l0 = signupLoginParams0.X ? r1.d(0x7F120149, new Object[0]) : r1.d(0x7F12049B, new Object[0]);  // string:enter_mobile_to_add "Enter the mobile number that you would like to add"
        B0 b01 = o0.c(country0);
        this.m0 = b01;
        n n0 = o0.F(b00, new d3(null, this, 0));
        this.n0 = o0.j(b00, b01, n0, new K1(4, null, 1));
        this.o0 = o0.F(n0, new d3(null, this, 1));
    }

    public static final Object o(e3 e30, String s, Fb.c c0) {
        y6 y60;
        H8 h82;
        e3 e33;
        Country country1;
        R0 r01;
        String s1;
        AtomicInteger atomicInteger0;
        h0 h00;
        H8 h80;
        Country country0;
        b3 b30;
        e3 e31 = e30;
        e30.getClass();
        if(c0 instanceof b3) {
            b30 = (b3)c0;
            int v = b30.k0;
            if((v & 0x80000000) == 0) {
                b30 = new b3(e31, c0);
            }
            else {
                b30.k0 = v ^ 0x80000000;
            }
        }
        else {
            b30 = new b3(e31, c0);
        }
        Object object0 = b30.i0;
        Object object1 = Eb.a.X;
        switch(b30.k0) {
            case 0: {
                W5.f.b0(object0);
                country0 = M0.c(s);
                if(country0 == null) {
                    throw new Error("Unknown country for mobile: " + s);
                }
                V8.c c1 = e31.i0;
                V8.a a0 = c1.Y;
                if(a0 == null) {
                    throw new AssertionError("\'run\' called when no owner");
                }
                a0.a.a().b().a(State.b0);
                R0 r00 = ((W0)a0.b).D();
                h80 = new H8(s, null, null, r00, SMARTPHONE_APP.X, 13);
                try {
                    h00 = e31.j0;
                    Map map0 = N.a;
                    Object object2 = map0.get(h00);
                    if(object2 == null) {
                        object2 = new AtomicInteger(0);
                        map0.put(h00, object2);
                    }
                    atomicInteger0 = (AtomicInteger)object2;
                    do {
                        Object object3 = ((B0)h00).getValue();
                        ((Boolean)object3).getClass();
                    }
                    while(!((B0)h00).j(object3, Boolean.valueOf(atomicInteger0.incrementAndGet() > 0)));
                }
                catch(R3 unused_ex) {
                    return W2.b;
                }
                catch(S3 unused_ex) {
                    return W2.c;
                }
                catch(T3 unused_ex) {
                    return W2.d;
                }
                catch(Y8.x unused_ex) {
                    return W2.a;
                }
                catch(Q q0) {
                    s1 = s;
                    r01 = r00;
                    goto label_129;
                }
                try {
                    b30.b0 = e31;
                    b30.c0 = s;
                    b30.d0 = country0;
                    b30.e0 = r00;
                    b30.f0 = h80;
                    b30.g0 = h00;
                    b30.h0 = atomicInteger0;
                    b30.k0 = 1;
                    object0 = c1.e(b30);
                }
                catch(Throwable throwable0) {
                    try {
                        s1 = s;
                        r01 = r00;
                        country1 = country0;
                        break;
                    }
                    catch(R3 unused_ex) {
                        return W2.b;
                    }
                    catch(S3 unused_ex) {
                        return W2.c;
                    }
                    catch(T3 unused_ex) {
                        return W2.d;
                    }
                    catch(Y8.x unused_ex) {
                        return W2.a;
                    }
                    catch(Q q0) {
                        country0 = country1;
                        goto label_129;
                    }
                }
                if(object0 == object1) {
                    return object1;
                }
                s1 = s;
                r01 = r00;
                country1 = country0;
                goto label_71;
            }
            case 1: {
                atomicInteger0 = b30.h0;
                h00 = b30.g0;
                H8 h81 = (H8)b30.f0;
                r01 = (R0)b30.e0;
                country1 = (Country)b30.d0;
                s1 = (String)b30.c0;
                e3 e32 = (e3)b30.b0;
                try {
                    W5.f.b0(object0);
                    h80 = h81;
                    e31 = e32;
                label_71:
                    b30.b0 = e31;
                    b30.c0 = s1;
                    b30.d0 = country1;
                    b30.e0 = r01;
                    b30.f0 = h80;
                    b30.g0 = h00;
                    b30.h0 = atomicInteger0;
                    b30.k0 = 2;
                    ((W0)object0).M(country1);
                    if(t.a == object1) {
                        return object1;
                    }
                    e33 = e31;
                    h82 = h80;
                    goto label_92;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            case 2: {
                atomicInteger0 = b30.h0;
                h00 = b30.g0;
                h82 = (H8)b30.f0;
                r01 = (R0)b30.e0;
                country1 = (Country)b30.d0;
                s1 = (String)b30.c0;
                e33 = (e3)b30.b0;
                try {
                    W5.f.b0(object0);
                label_92:
                    R6 r60 = (R6)e33.Y.invoke();
                    b30.b0 = s1;
                    b30.c0 = country1;
                    b30.d0 = r01;
                    b30.e0 = h00;
                    b30.f0 = atomicInteger0;
                    b30.g0 = null;
                    b30.h0 = null;
                    b30.k0 = 3;
                    object0 = r60.f(h82, G6.X, b30);
                    if(object0 == object1) {
                        return object1;
                    }
                    y60 = (y6)object0;
                    goto label_117;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            case 3: {
                atomicInteger0 = (AtomicInteger)b30.f0;
                h00 = (h0)b30.e0;
                r01 = (R0)b30.d0;
                country1 = (Country)b30.c0;
                s1 = (String)b30.b0;
                try {
                    W5.f.b0(object0);
                    y60 = (y6)object0;
                    goto label_117;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            do {
                Object object4 = ((B0)h00).getValue();
                ((Boolean)object4).getClass();
            }
            while(!((B0)h00).j(object4, Boolean.valueOf(atomicInteger0.decrementAndGet() > 0)));
            throw throwable0;
            do {
            label_117:
                Object object5 = ((B0)h00).getValue();
                ((Boolean)object5).getClass();
            }
            while(!((B0)h00).j(object5, Boolean.valueOf(atomicInteger0.decrementAndGet() > 0)));
            j.c(((E8)y60.b).a);
            return new X2(y60.a(((E8)y60.b).a.a.b), ((E8)y60.b).a.b);
        }
        catch(R3 unused_ex) {
        }
        catch(S3 unused_ex) {
            return W2.c;
        }
        catch(T3 unused_ex) {
            return W2.d;
        }
        catch(Y8.x unused_ex) {
            return W2.a;
        }
        catch(Q q0) {
            country0 = country1;
            goto label_129;
        }
        return W2.b;
    label_129:
        Map map1 = F.K(new k[]{new k("mobile", s1), new k("mobileCountry", country0.Y), new k("deviceId", r01.a)});
        Q0.i(new hb.k(i1.INFO, map1, q0, true));
        throw q0;
    }

    public static void p(e3 e30, FragmentHandle fragmentHandle0, String s, Boolean boolean0, String s1, String s2, PartnerOrg partnerOrg0, String s3, int v) {
        e30.getClass();
        j.f(fragmentHandle0, "tokenHandle");
        j.f(s, "smsCode");
        Z2 z20 = new Z2(e30, fragmentHandle0, boolean0, ((v & 8) == 0 ? s1 : null), ((v & 16) == 0 ? s2 : null), ((v & 0x40) == 0 ? s3 : null), ((v & 0x20) == 0 ? partnerOrg0 : null), s, null);
        N.k(e30, e30.i0, false, z20);
    }
}

