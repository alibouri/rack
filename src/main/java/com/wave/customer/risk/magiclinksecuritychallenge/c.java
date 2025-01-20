package com.wave.customer.risk.magiclinksecuritychallenge;

import Ab.k;
import Bb.F;
import Eb.a;
import N4.o;
import Nb.j;
import V8.e;
import W5.f;
import Xb.I0;
import Xb.J;
import Y8.A0;
import Y8.C0;
import Y8.G6;
import Y8.N;
import Y8.R6;
import Y8.c7;
import Y8.f7;
import Y8.k2;
import Y8.l2;
import Y8.m2;
import Y8.x0;
import Y8.y0;
import Y8.y6;
import Y8.z0;
import ac.B0;
import ac.j0;
import ac.o0;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.b;
import com.sendwave.backend.fragment.SmsTokenFragment;
import com.sendwave.util.Country;
import io.sentry.i1;
import java.util.concurrent.CancellationException;
import q9.C3;
import q9.M0;
import q9.w;
import ya.A;
import ya.n;
import ya.p;
import ya.s;
import ya.t;
import ya.u;
import ya.v;
import ya.z;

public final class c extends ViewModel {
    public final C3 Y;
    public final R6 Z;
    public final MagicLinkSecurityChallengeContext b0;
    public final V8.c c0;
    public final w d0;
    public final B0 e0;
    public final j0 f0;
    public I0 g0;

    public c(C3 c30, R6 r60, MagicLinkSecurityChallengeContext magicLinkSecurityChallengeContext0) {
        j.f(r60, "repo");
        j.f(magicLinkSecurityChallengeContext0, "context");
        super();
        this.Y = c30;
        this.Z = r60;
        this.b0 = magicLinkSecurityChallengeContext0;
        V8.c c0 = new V8.c(new e());  // initializer: Ljava/lang/Object;-><init>()V
        this.c0 = c0;
        this.d0 = new w(c0, this);
        B0 b00 = o0.c(new n(c30.k().j0, o.I(15, Wb.c.b0), null, new p(3, false)));
        this.e0 = b00;
        this.f0 = new j0(b00);
        J.q(ViewModelKt.a(this), null, null, new s(this, null), 3);
        I0 i00 = this.g0;
        if(i00 != null) {
            i00.f(null);
        }
        this.g0 = J.q(ViewModelKt.a(this), null, null, new z(this, null), 3);
    }

    public final void o(String s, String s1, boolean z) {
        j.f(s, "secret");
        j0 j00 = this.f0;
        if(!(((n)((B0)j00.X).getValue()).d instanceof p)) {
            this.Y.e().d("magic link security challenge: tried to confirm magic link in wrong state", F.J(new k("state", ((n)((B0)j00.X).getValue()).d.G())));
            return;
        }
        this.d0.i();
        do {
            Object object0 = this.e0.getValue();
            n n0 = n.a(((n)object0), 0L, null, new ya.o(s, z), 7);
        }
        while(!this.e0.j(object0, n0));
        t t0 = new t(this, s, z, s1, null);
        N.k(this, this.c0, false, t0);
    }

    public final Object p(Fb.c c0) {
        u u0;
        if(c0 instanceof u) {
            u0 = (u)c0;
            int v = u0.d0;
            if((v & 0x80000000) == 0) {
                u0 = new u(this, c0);
            }
            else {
                u0.d0 = v ^ 0x80000000;
            }
        }
        else {
            u0 = new u(this, c0);
        }
        Object object0 = u0.b0;
        Object object1 = a.X;
        switch(u0.d0) {
            case 0: {
                f.b0(object0);
                Country country0 = M0.c(this.b0.b());
                if(country0 != null) {
                    l2 l20 = new l2(country0.Y);
                    u0.d0 = 1;
                    object0 = R6.d(this.Z, l20, null, null, u0, 6);
                    return object0 == object1 ? object1 : ((k2)((y6)object0).b).a.a;
                }
                return "";
            }
            case 1: {
                f.b0(object0);
                return ((k2)((y6)object0).b).a.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object q(String s, boolean z, String s1, Fb.c c0) {
        c c1;
        v v0;
        boolean z1 = false;
        if(c0 instanceof v) {
            v0 = (v)c0;
            int v1 = v0.h0;
            if((v1 & 0x80000000) == 0) {
                v0 = new v(this, c0);
            }
            else {
                v0.h0 = v1 ^ 0x80000000;
            }
        }
        else {
            v0 = new v(this, c0);
        }
        Object object0 = v0.f0;
        Object object1 = a.X;
        switch(v0.h0) {
            case 0: {
                f.b0(object0);
                E9.a a0 = this.Y.e();
                MagicLinkSecurityChallengeContext magicLinkSecurityChallengeContext0 = this.b0;
                a0.a("magic link security challenge: call confirm mutator", new k[]{new k("context", (magicLinkSecurityChallengeContext0 instanceof Authenticated ? "authenticated" : "unauthenticated"))});
                R6 r60 = this.Z;
                if(!(magicLinkSecurityChallengeContext0 instanceof Authenticated)) {
                    goto label_25;
                }
                z0 z00 = new z0(s, z, Optional.Companion.presentIfNotNull(s1));
                v0.h0 = 1;
                object0 = r60.f(z00, G6.X, v0);
                if(object0 == object1) {
                    return object1;
                label_25:
                    if(!(magicLinkSecurityChallengeContext0 instanceof Unauthenticated)) {
                        throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                    }
                    v0.b0 = this;
                    v0.c0 = s;
                    v0.d0 = s1;
                    v0.e0 = z;
                    v0.h0 = 2;
                    object0 = r60.e(((Unauthenticated)magicLinkSecurityChallengeContext0).X, SmsTokenFragment.class, v0);
                    if(object0 == object1) {
                        return object1;
                    }
                    c1 = this;
                    goto label_47;
                }
                goto label_38;
            }
            case 1: {
                f.b0(object0);
            label_38:
                x0 x00 = ((y0)((y6)object0).b).a;
                if(x00 != null) {
                    z1 = x00.a;
                }
                return new ya.c(z1);
            }
            case 2: {
                z = v0.e0;
                s1 = v0.d0;
                s = v0.c0;
                c1 = v0.b0;
                f.b0(object0);
            label_47:
                Optional optional0 = Optional.Companion.presentIfNotNull(s1);
                v0.b0 = null;
                v0.c0 = null;
                v0.d0 = null;
                v0.h0 = 3;
                object0 = c1.Z.f(new C0(((SmsTokenFragment)((m2)object0).a).getId(), s, z, optional0), G6.X, v0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 3: {
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        A0 a00 = ((Y8.B0)((y6)object0).b).a;
        if(a00 != null) {
            z1 = a00.a;
        }
        return new ya.c(z1);
    }

    public final Object r(Fb.c c0) {
        c c1;
        ya.w w0;
        if(c0 instanceof ya.w) {
            w0 = (ya.w)c0;
            int v = w0.e0;
            if((v & 0x80000000) == 0) {
                w0 = new ya.w(this, c0);
            }
            else {
                w0.e0 = v ^ 0x80000000;
            }
        }
        else {
            w0 = new ya.w(this, c0);
        }
        Object object0 = w0.c0;
        Object object1 = a.X;
        switch(w0.e0) {
            case 0: {
                f.b0(object0);
                MagicLinkSecurityChallengeContext magicLinkSecurityChallengeContext0 = this.b0;
                R6 r60 = this.Z;
                if(!(magicLinkSecurityChallengeContext0 instanceof Authenticated)) {
                    goto label_22;
                }
                c7 c70 = new c7();  // initializer: Ljava/lang/Object;-><init>()V
                w0.e0 = 1;
                object0 = r60.f(c70, G6.X, w0);
                if(object0 == object1) {
                    return object1;
                label_22:
                    if(!(magicLinkSecurityChallengeContext0 instanceof Unauthenticated)) {
                        throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                    }
                    w0.b0 = this;
                    w0.e0 = 2;
                    object0 = r60.e(((Unauthenticated)magicLinkSecurityChallengeContext0).X, SmsTokenFragment.class, w0);
                    if(object0 == object1) {
                        return object1;
                    }
                    c1 = this;
                    goto label_36;
                }
                goto label_32;
            }
            case 1: {
                f.b0(object0);
            label_32:
                y6 y60 = (y6)object0;
                return Ab.t.a;
            }
            case 2: {
                c1 = w0.b0;
                f.b0(object0);
            label_36:
                w0.b0 = null;
                w0.e0 = 3;
                object0 = c1.Z.f(new f7(((SmsTokenFragment)((m2)object0).a).getId()), G6.X, w0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 3: {
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        y6 y61 = (y6)object0;
        return Ab.t.a;
    }

    public final Object s(Fb.c c0) {
        Object object4;
        A a0;
        if(c0 instanceof A) {
            a0 = (A)c0;
            int v = a0.e0;
            if((v & 0x80000000) == 0) {
                a0 = new A(this, c0);
            }
            else {
                a0.e0 = v ^ 0x80000000;
            }
        }
        else {
            a0 = new A(this, c0);
        }
        Object object0 = a0.c0;
        Object object1 = a.X;
        Object object2 = Ab.t.a;
        switch(a0.e0) {
            case 0: {
                f.b0(object0);
                try {
                    a0.b0 = this;
                    a0.e0 = 1;
                    object0 = this.p(a0);
                    if(object0 == object1) {
                        return object1;
                    }
                    c c1 = this;
                    goto label_24;
                label_22:
                    c1 = a0.b0;
                    f.b0(object0);
                label_24:
                    if(!j.a(((String)object0), "")) {
                        B0 b00 = c1.e0;
                        while(true) {
                            Object object3 = b00.getValue();
                            if(b00.j(object3, n.a(((n)object3), 0L, ((String)object0), null, 11))) {
                                break;
                            }
                        }
                    }
                    object4 = object2;
                    goto label_34;
                }
                catch(CancellationException cancellationException0) {
                    break;
                }
                catch(Throwable throwable0) {
                    goto label_33;
                }
            }
            case 1: {
                goto label_22;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        throw cancellationException0;
    label_33:
        object4 = f.v(throwable0);
    label_34:
        Throwable throwable1 = Ab.n.a(object4);
        if(throwable1 != null) {
            hb.n.d("magic link security challenge: failed to fetch audio description URL", i1.WARNING, b.t("errorMessage", (throwable1.getMessage() == null ? "<no error message>" : throwable1.getMessage())), false, 8);
        }
        return object2;
    }
}

