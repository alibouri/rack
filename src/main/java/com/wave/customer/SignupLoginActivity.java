package com.wave.customer;

import Ab.o;
import Ab.t;
import Eb.a;
import Fb.c;
import R1.d;
import R9.L2;
import R9.M2;
import R9.N2;
import R9.O2;
import R9.P2;
import R9.S2;
import R9.W0;
import R9.e3;
import W4.f;
import Xb.J;
import Xb.i0;
import Y8.E8;
import Y8.F8;
import Y8.G6;
import Y8.H8;
import Y8.N;
import Y8.R6;
import Y8.S6;
import Y8.T6;
import Y8.Y;
import Y8.y6;
import ac.B0;
import ac.h0;
import android.os.Bundle;
import android.os.Parcelable;
import ca.a0;
import com.apollographql.apollo.api.Optional.Present;
import com.sendwave.backend.FragmentHandle;
import com.sendwave.backend.type.UserInterface.SMARTPHONE_APP;
import com.sendwave.shared.LoginUsingQrWorkflow.StepScanQr;
import com.sendwave.shared.LoginWithPinRecoveryWorkflow.StepVerifyAuthCode;
import com.sendwave.shared.QRScanResult;
import com.sendwave.shared.VerifyAuthCodeActivity;
import com.sendwave.shared.VerifyAuthCodeParams;
import com.sendwave.util.Country;
import com.sendwave.util.NonauthRepoHandle;
import d9.R0;
import f.g;
import hb.h;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.j;
import m5.b;
import q9.C1;
import q9.C3;
import q9.M0;
import q9.j0;
import q9.k3;
import q9.o0;
import q9.r1;

public final class SignupLoginActivity extends k3 {
    public a0 F0;
    public final o G0;
    public final o H0;
    public final o I0;
    public final g J0;
    public final g K0;
    public final g L0;
    public final g M0;
    public final g N0;
    public final g O0;
    public final g P0;
    public final N2 Q0;
    public static final int R0;

    public SignupLoginActivity() {
        this.G0 = f.A(new M2(this, 0));
        this.H0 = f.A(new M2(this, 1));
        this.I0 = f.A(new M2(this, 2));
        this.J0 = o0.Q(this, new L2(this, 1));
        this.K0 = o0.Q(this, new L2(this, 2));
        this.L0 = o0.Q(this, new L2(this, 3));
        this.M0 = o0.Q(this, new L2(this, 4));
        this.N0 = o0.Q(this, new L2(this, 5));
        this.O0 = o0.Q(this, new L2(this, 6));
        this.P0 = o0.Q(this, new L2(this, 0));
        this.Q0 = new N2(this);
    }

    public static final void I(SignupLoginActivity signupLoginActivity0, String s, CreatePinResult createPinResult0) {
        FragmentHandle fragmentHandle0;
        B0 b00 = signupLoginActivity0.K().j0;
        Map map0 = N.a;
        Object object0 = map0.get(b00);
        if(object0 == null) {
            object0 = b.E(0, map0, b00);
        }
        do {
            Object object1 = b00.getValue();
            ((Boolean)object1).getClass();
        }
        while(!b00.j(object1, Boolean.valueOf(((AtomicInteger)object0).incrementAndGet() > 0)));
        try {
            O2 o20 = new O2(signupLoginActivity0, s, createPinResult0, null);
            y6 y60 = (y6)J.t(j.X, o20);
            Nb.j.c(((T6)y60.b).a);
            fragmentHandle0 = y60.a(((T6)y60.b).a.a.b);
        }
        finally {
            do {
                Object object2 = b00.getValue();
                ((Boolean)object2).getClass();
            }
            while(!b00.j(object2, Boolean.valueOf(((AtomicInteger)object0).decrementAndGet() > 0)));
        }
        NonauthRepoHandle nonauthRepoHandle0 = new NonauthRepoHandle();
        RecoverPinAndLogin recoverPinAndLogin0 = new RecoverPinAndLogin();
        Parcelable parcelable0 = signupLoginActivity0.getIntent().getParcelableExtra("com.wave.typeSafeExtras");
        if(parcelable0 == null) {
            throw new Exception(SignupLoginActivity.class.getName() + " invoked with no params");
        }
        VerifyAuthCodeParams verifyAuthCodeParams0 = new VerifyAuthCodeParams(fragmentHandle0, null, nonauthRepoHandle0, recoverPinAndLogin0, s, ((SignupLoginParams)parcelable0).X, 0x2E0);
        StepVerifyAuthCode loginWithPinRecoveryWorkflow$StepVerifyAuthCode0 = new StepVerifyAuthCode(fragmentHandle0, s, createPinResult0.X);
        o0.G(signupLoginActivity0, signupLoginActivity0.K0, VerifyAuthCodeActivity.class, verifyAuthCodeParams0, loginWithPinRecoveryWorkflow$StepVerifyAuthCode0, true);
    }

    public static final Object J(SignupLoginActivity signupLoginActivity0, StepScanQr loginUsingQrWorkflow$StepScanQr0, QRScanResult qRScanResult0, c c0) {
        StepScanQr loginUsingQrWorkflow$StepScanQr2;
        h0 h00;
        AtomicInteger atomicInteger0;
        AtomicInteger atomicInteger1;
        h0 h01;
        Object object2;
        SignupLoginActivity signupLoginActivity3;
        W0 w00;
        SignupLoginActivity signupLoginActivity5;
        StepScanQr loginUsingQrWorkflow$StepScanQr4;
        Y y0;
        Object object3;
        AtomicInteger atomicInteger2;
        h0 h02;
        h0 h03;
        Object object7;
        AtomicInteger atomicInteger3;
        String s1;
        String s;
        Object object6;
        FragmentHandle fragmentHandle0;
        P2 p20;
        SignupLoginActivity signupLoginActivity1 = signupLoginActivity0;
        StepScanQr loginUsingQrWorkflow$StepScanQr1 = loginUsingQrWorkflow$StepScanQr0;
        QRScanResult qRScanResult1 = qRScanResult0;
        signupLoginActivity0.getClass();
        if(c0 instanceof P2) {
            p20 = (P2)c0;
            int v = p20.i0;
            if((v & 0x80000000) == 0) {
                p20 = new P2(signupLoginActivity1, c0);
            }
            else {
                p20.i0 = v ^ 0x80000000;
            }
        }
        else {
            p20 = new P2(signupLoginActivity1, c0);
        }
        Object object0 = p20.g0;
        Object object1 = a.X;
        t t0 = t.a;
        switch(p20.i0) {
            case 0: {
                W5.f.b0(object0);
                h02 = signupLoginActivity0.K().j0;
                Map map0 = N.a;
                Object object4 = map0.get(h02);
                if(object4 == null) {
                    object4 = b.E(0, map0, ((B0)h02));
                }
                atomicInteger2 = (AtomicInteger)object4;
                while(true) {
                    Object object5 = ((B0)h02).getValue();
                    ((Boolean)object5).getClass();
                    if(((B0)h02).j(object5, Boolean.valueOf(atomicInteger2.incrementAndGet() > 0))) {
                        break;
                    }
                    signupLoginActivity1 = signupLoginActivity0;
                }
                try {
                    R6 r60 = r1.b(signupLoginActivity0).q();
                    R0 r00 = signupLoginActivity1.Q0.D();
                    Present optional$Present0 = S6.a(qRScanResult1.X);
                    H8 h80 = new H8(loginUsingQrWorkflow$StepScanQr1.X, null, optional$Present0, r00, SMARTPHONE_APP.X, 5);
                    p20.b0 = signupLoginActivity1;
                    p20.c0 = loginUsingQrWorkflow$StepScanQr1;
                    p20.d0 = qRScanResult1;
                    p20.e0 = h02;
                    p20.f0 = atomicInteger2;
                    p20.i0 = 1;
                    object3 = r60.f(h80, G6.X, p20);
                    if(object3 != object1) {
                    label_83:
                        F8 f80 = ((E8)((y6)object3).b).a;
                        Nb.j.c(f80);
                        fragmentHandle0 = ((y6)object3).a(f80.a.b);
                        goto label_170;
                    }
                    break;
                }
                catch(Y y0) {
                    try {
                    label_88:
                        e3 e30 = signupLoginActivity1.K();
                        p20.b0 = signupLoginActivity1;
                        p20.c0 = loginUsingQrWorkflow$StepScanQr1;
                        p20.d0 = h02;
                        p20.e0 = atomicInteger2;
                        p20.f0 = y0;
                        p20.i0 = 2;
                        object6 = e30.i0.e(p20);
                    }
                    catch(Throwable throwable0) {
                        h00 = h02;
                        atomicInteger0 = atomicInteger2;
                        goto label_166;
                    }
                    if(object6 != object1) {
                        try {
                            signupLoginActivity5 = signupLoginActivity1;
                            loginUsingQrWorkflow$StepScanQr4 = loginUsingQrWorkflow$StepScanQr1;
                            h00 = h02;
                            atomicInteger0 = atomicInteger2;
                            w00 = (W0)object6;
                        }
                        catch(Throwable throwable0) {
                            goto label_166;
                        }
                        try {
                        label_107:
                            s = r1.d(0x7F120157, new Object[0]);  // string:error "Error"
                            s1 = r1.d(0x7F120091, new Object[0]);  // string:cancel "Cancel"
                        }
                        catch(Throwable throwable0) {
                            atomicInteger3 = atomicInteger0;
                            atomicInteger0 = atomicInteger3;
                            goto label_166;
                        }
                        try {
                            atomicInteger3 = atomicInteger0;
                            String s2 = r1.d(0x7F12007B, new Object[0]);  // string:call "Call"
                            p20.b0 = signupLoginActivity5;
                            p20.c0 = loginUsingQrWorkflow$StepScanQr4;
                            p20.d0 = h00;
                            p20.e0 = atomicInteger0;
                            p20.f0 = null;
                            p20.i0 = 3;
                            atomicInteger3 = atomicInteger0;
                            object2 = Pb.a.O(w00, s, y0.X, s2, s1, false, null, null, p20, 488);
                        }
                        catch(Throwable throwable0) {
                            atomicInteger0 = atomicInteger3;
                            goto label_166;
                        }
                        if(object2 != object1) {
                            signupLoginActivity3 = signupLoginActivity5;
                            loginUsingQrWorkflow$StepScanQr2 = loginUsingQrWorkflow$StepScanQr4;
                            h01 = h00;
                            atomicInteger1 = atomicInteger3;
                            try {
                            label_132:
                                if(((Integer)object2) == null || ((int)(((Integer)object2))) != -1) {
                                    goto label_152;
                                }
                                R2.f.u(((E9.a)signupLoginActivity3.H0.getValue()), s9.a.g0, false);
                                e3 e31 = signupLoginActivity3.K();
                                p20.b0 = loginUsingQrWorkflow$StepScanQr2;
                                p20.c0 = h01;
                                p20.d0 = atomicInteger1;
                                p20.e0 = null;
                                p20.i0 = 4;
                                object7 = e31.i0.e(p20);
                                if(object7 != object1) {
                                    goto label_142;
                                }
                                break;
                            }
                            catch(Throwable throwable0) {
                                atomicInteger0 = atomicInteger1;
                                h00 = h01;
                                goto label_166;
                            }
                        label_142:
                            object0 = object7;
                            atomicInteger0 = atomicInteger1;
                            h00 = h01;
                            try {
                            label_145:
                                Country country0 = M0.c(loginUsingQrWorkflow$StepScanQr2.X);
                                Nb.j.c(country0);
                                ((W0)object0).F(country0.j0);
                                h03 = h00;
                                goto label_159;
                            }
                            catch(Throwable throwable0) {
                                goto label_166;
                            }
                            try {
                            label_152:
                                atomicInteger0 = atomicInteger1;
                                h03 = h01;
                            }
                            catch(Throwable throwable0) {
                                atomicInteger0 = atomicInteger1;
                                h00 = h01;
                                goto label_166;
                            }
                            do {
                            label_159:
                                Object object8 = ((B0)h03).getValue();
                                ((Boolean)object8).getClass();
                            }
                            while(!((B0)h03).j(object8, Boolean.valueOf(atomicInteger0.decrementAndGet() > 0)));
                            return t0;
                        }
                    }
                    break;
                }
                catch(Throwable throwable0) {
                    h00 = h02;
                    atomicInteger0 = atomicInteger2;
                }
                do {
                label_166:
                    Object object9 = ((B0)h00).getValue();
                    ((Boolean)object9).getClass();
                }
                while(!((B0)h00).j(object9, Boolean.valueOf(atomicInteger0.decrementAndGet() > 0)));
                throw throwable0;
                do {
                label_170:
                    Object object10 = ((B0)h02).getValue();
                    ((Boolean)object10).getClass();
                }
                while(!((B0)h02).j(object10, Boolean.valueOf(atomicInteger2.decrementAndGet() > 0)));
                NonauthRepoHandle nonauthRepoHandle0 = new NonauthRepoHandle();
                PersistentVerifySMSMutator persistentVerifySMSMutator0 = new PersistentVerifySMSMutator();
                String s3 = loginUsingQrWorkflow$StepScanQr1.X;
                Parcelable parcelable0 = signupLoginActivity1.getIntent().getParcelableExtra("com.wave.typeSafeExtras");
                if(parcelable0 == null) {
                    throw new Exception(SignupLoginActivity.class.getName() + " invoked with no params");
                }
                VerifyAuthCodeParams verifyAuthCodeParams0 = new VerifyAuthCodeParams(fragmentHandle0, null, nonauthRepoHandle0, persistentVerifySMSMutator0, s3, ((SignupLoginParams)parcelable0).X, 0x2E0);
                com.sendwave.shared.LoginUsingQrWorkflow.StepVerifyAuthCode loginUsingQrWorkflow$StepVerifyAuthCode0 = new com.sendwave.shared.LoginUsingQrWorkflow.StepVerifyAuthCode(fragmentHandle0, loginUsingQrWorkflow$StepScanQr1.X, qRScanResult1.X);
                o0.G(signupLoginActivity1, signupLoginActivity1.K0, VerifyAuthCodeActivity.class, verifyAuthCodeParams0, loginUsingQrWorkflow$StepVerifyAuthCode0, true);
                return t0;
            }
            case 1: {
                atomicInteger0 = (AtomicInteger)p20.f0;
                h00 = (h0)p20.e0;
                qRScanResult1 = (QRScanResult)p20.d0;
                StepScanQr loginUsingQrWorkflow$StepScanQr5 = (StepScanQr)p20.c0;
                SignupLoginActivity signupLoginActivity6 = (SignupLoginActivity)p20.b0;
                try {
                    h02 = h00;
                    loginUsingQrWorkflow$StepScanQr1 = loginUsingQrWorkflow$StepScanQr5;
                    atomicInteger2 = atomicInteger0;
                    signupLoginActivity1 = signupLoginActivity6;
                    W5.f.b0(object0);
                    atomicInteger2 = atomicInteger0;
                    signupLoginActivity1 = signupLoginActivity6;
                    object3 = object0;
                    h02 = h00;
                    loginUsingQrWorkflow$StepScanQr1 = loginUsingQrWorkflow$StepScanQr5;
                    goto label_83;
                }
                catch(Y y0) {
                    goto label_88;
                }
                catch(Throwable throwable0) {
                    goto label_166;
                }
            }
            case 2: {
                y0 = (Y)p20.f0;
                atomicInteger0 = (AtomicInteger)p20.e0;
                h00 = (h0)p20.d0;
                StepScanQr loginUsingQrWorkflow$StepScanQr3 = (StepScanQr)p20.c0;
                SignupLoginActivity signupLoginActivity4 = (SignupLoginActivity)p20.b0;
                try {
                    W5.f.b0(object0);
                    loginUsingQrWorkflow$StepScanQr4 = loginUsingQrWorkflow$StepScanQr3;
                    signupLoginActivity5 = signupLoginActivity4;
                    w00 = (W0)object0;
                    goto label_107;
                }
                catch(Throwable throwable0) {
                    goto label_166;
                }
            }
            case 3: {
                atomicInteger0 = (AtomicInteger)p20.e0;
                h00 = (h0)p20.d0;
                loginUsingQrWorkflow$StepScanQr2 = (StepScanQr)p20.c0;
                SignupLoginActivity signupLoginActivity2 = (SignupLoginActivity)p20.b0;
                try {
                    W5.f.b0(object0);
                    signupLoginActivity3 = signupLoginActivity2;
                    object2 = object0;
                    h01 = h00;
                    atomicInteger1 = atomicInteger0;
                    goto label_132;
                }
                catch(Throwable throwable0) {
                    goto label_166;
                }
            }
            case 4: {
                atomicInteger0 = (AtomicInteger)p20.d0;
                h00 = (h0)p20.c0;
                loginUsingQrWorkflow$StepScanQr2 = (StepScanQr)p20.b0;
                try {
                    W5.f.b0(object0);
                    goto label_145;
                }
                catch(Throwable throwable0) {
                    goto label_166;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return object1;
    }

    public final e3 K() {
        return (e3)this.G0.getValue();
    }

    public final void L(SignupSuccess signupSuccess0) {
        C1.b0 = true;
        if(w1.c.a(this, "android.permission.READ_CONTACTS") == 0) {
            S2 s20 = new S2(this, null);
            J.q(i0.X, null, null, s20, 3);
        }
        o0.T(this, signupSuccess0, true);
    }

    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.A0 = false;
        e3 e30 = this.K();
        a0 a00 = (a0)d.a(this.getLayoutInflater(), 0x7F0D00F3, null);  // layout:signup_login
        a00.u(e30);
        a00.r(this);
        this.C(e30.j0);
        this.F0 = a00;
        this.setContentView(a00.d);
        a0 a01 = this.F0;
        if(a01 != null) {
            a01.r.h0.setShowSoftInputOnFocus(false);
            a01.r.h0.requestFocus();
            r1.b(this).e().d("view enter number screen", null);
            C3 c30 = r1.b(this);
            if(((CustomerApp)c30).J0) {
                j0 j00 = (j0)c30.h0.getValue();
                Xb.N n0 = j00.b;
                if(n0 != null) {
                    n0.f(null);
                }
                q9.i0 i00 = new q9.i0(j00, null);
                j00.b = J.d(i0.X, null, i00, 3);
            }
            a0 a02 = this.F0;
            if(a02 != null) {
                this.B(a02.u);
                h h0 = this.z();
                Nb.j.c(h0);
                h0.h0(true);
                a0 a03 = this.F0;
                if(a03 != null) {
                    N4.c c0 = new N4.c(5);
                    a03.d.post(c0);
                    return;
                }
                Nb.j.p("binding");
                throw null;
            }
            Nb.j.p("binding");
            throw null;
        }
        Nb.j.p("binding");
        throw null;
    }
}

