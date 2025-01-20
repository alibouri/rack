package com.sendwave.util;

import Ab.k;
import Ab.o;
import E7.w;
import J1.E;
import N4.c;
import R1.d;
import R2.e;
import R9.I1;
import U0.F;
import Vb.j;
import W4.f;
import a8.Q;
import ac.e0;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import android.text.TextUtils;
import android.util.Log;
import androidx.biometric.BiometricFragment;
import androidx.lifecycle.ViewModelProvider;
import c2.I;
import c2.N;
import c2.a;
import c2.x;
import f.g;
import i9.H;
import java.security.InvalidKeyException;
import javax.crypto.SecretKey;
import q9.C1;
import q9.D1;
import q9.E1;
import q9.F1;
import q9.a2;
import q9.k3;
import q9.r1;
import q9.s0;
import q9.t0;
import r.m;
import r.s;

public final class LockScreenActivity extends k3 {
    public H F0;
    public final o G0;
    public final o H0;
    public final o I0;
    public final o J0;
    public final g K0;
    public final o L0;
    public final E1 M0;
    public static final int N0;

    public LockScreenActivity() {
        this.G0 = f.A(new D1(this, 0));
        this.H0 = f.A(new D1(this, 1));
        this.I0 = f.A(new D1(this, 2));
        this.J0 = f.A(new D1(this, 3));
        this.K0 = (g)this.v(new I(4), new w(29, this));
        this.L0 = f.A(new D1(this, 4));
        this.M0 = new E1(this);
    }

    public final boolean I() {
        String s = Build.MODEL == null ? "" : Build.MODEL;
        if(j.R(s, "SM-A10", false) || s.equals("A10 Glxy") || s.equals("A10")) {
            return false;
        }
        s0 s00 = (s0)this.I0.getValue();
        s00.getClass();
        return s00.c.g(s0.f[2]).booleanValue() ? false : new Q(new V6.f(this, 1)).g(0xFF) == 0;
    }

    public final a2 J() {
        return (a2)this.J0.getValue();
    }

    public final void K() {
        if(!((Boolean)this.J().c0.getValue()).booleanValue()) {
            return;
        }
        a2 a20 = this.J();
        a20.D0.getClass();
        a20.D0.l(null, "");
        F f0 = new F(1, new Handler(this.getMainLooper()));
        a2 a21 = this.J();
        Nb.j.f(a21, "screenViewModel");
        F1 f10 = new F1(a21, this);
        N n0 = this.w();
        s s0 = (s)new ViewModelProvider(this).a(s.class);
        s0.Y = f0;
        s0.Z = f10;
        String s1 = r1.d(0x7F12045F, new Object[0]);  // string:unlock_wave "Unlock Wave"
        String s2 = r1.d(0x7F120475, new Object[0]);  // string:use_pin_instead "Enter Secret Code"
        if(TextUtils.isEmpty(s1)) {
            throw new IllegalArgumentException("Title must be set and non-empty.");
        }
        if(TextUtils.isEmpty(s2)) {
            throw new IllegalArgumentException("Negative text must be set and non-empty.");
        }
        TextUtils.isEmpty(s2);
        e e0 = new e(s1, s2);
        if(n0 == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
        }
        else if(n0.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
        }
        else {
            BiometricFragment biometricFragment0 = (BiometricFragment)n0.E("androidx.biometric.BiometricFragment");
            if(biometricFragment0 == null) {
                biometricFragment0 = new BiometricFragment();
                a a0 = new a(n0);
                a0.h(0, biometricFragment0, "androidx.biometric.BiometricFragment", 1);
                a0.f(true, true);
                n0.A(true);
                n0.F();
            }
            x x0 = biometricFragment0.j();
            if(x0 == null) {
                Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            }
            else {
                biometricFragment0.Y0.b0 = e0;
                biometricFragment0.Y0.c0 = null;
                if(biometricFragment0.X()) {
                    s s3 = biometricFragment0.Y0;
                    s3.g0 = biometricFragment0.r(0x7F1200E6);  // string:confirm_device_credential_password "Use password"
                }
                else {
                    biometricFragment0.Y0.g0 = null;
                }
                if(biometricFragment0.X() && new Q(new V6.f(x0, 1)).g(0xFF) != 0) {
                    biometricFragment0.Y0.j0 = true;
                    biometricFragment0.Z();
                }
                else if(biometricFragment0.Y0.l0) {
                    m m0 = new m(biometricFragment0);
                    biometricFragment0.X0.postDelayed(m0, 600L);
                }
                else {
                    biometricFragment0.e0();
                }
            }
        }
        this.J().f0.d("lockscreen: biometrics displayed", null);
    }

    public final void L() {
        C1.X.getClass();
        C1.b0 = true;
        Intent intent0 = (Intent)this.getIntent().getParcelableExtra("next_intent");
        if(intent0 != null) {
            intent0.setExtrasClassLoader(LockScreenActivity.class.getClassLoader());
            this.startActivity(intent0);
        }
        this.finish();
    }

    @Override  // c.o
    public final void onBackPressed() {
        this.finishAffinity();
    }

    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.A0 = false;
        R2.f.z(this.getWindow(), false);
        a2 a20 = this.J();
        H h0 = (H)d.a(this.getLayoutInflater(), 0x7F0D0070, null);  // layout:lock_screen
        h0.w(a20);
        h0.v(a20.p0);
        h0.u(a20.n0);
        h0.r(this);
        this.F0 = h0;
        this.setContentView(h0.d);
        H h1 = this.F0;
        if(h1 != null) {
            m7.o o0 = new m7.o(15);
            E.k(h1.t, o0);
            a2 a21 = this.J();
            this.X.a(a21.v0);
            r1.b(this).e().d("lockscreen: view enter secret code screen", null);
            a2 a22 = this.J();
            a2 a23 = this.J();
            I1 i10 = new I1(3, null, 3);
            this.C(new e0(a22.p0.g, a23.E0, i10, 0));
            H h2 = this.F0;
            if(h2 != null) {
                c c0 = new c(18);
                h2.d.post(c0);
                return;
            }
            Nb.j.p("binding");
            throw null;
        }
        Nb.j.p("binding");
        throw null;
    }

    @Override  // c.o
    public final void onNewIntent(Intent intent0) {
        Nb.j.f(intent0, "intent");
        super.onNewIntent(intent0);
        this.setIntent(intent0);
    }

    @Override  // q9.z3
    public final void onResume() {
        super.onResume();
        o o0 = this.L0;
        if(((Boolean)o0.getValue()).booleanValue()) {
            t0 t00 = (t0)r1.b(this).g0.getValue();
            boolean z = t00.c();
            boolean z1 = t00.d.g(0xFF) == 0;
            t00.a.getClass();
            if(!t00.a.a.g(s0.f[0]).booleanValue() && z || !t00.a.b.g(s0.f[1]).booleanValue() && z1) {
                B9.f.e(r1.b(this).d(), "new_biometric_added", null, 6);
                return;
            }
        }
        boolean z2 = ((Boolean)o0.getValue()).booleanValue();
        o o1 = this.I0;
        if(z2) {
            t0 t01 = (t0)r1.b(this).g0.getValue();
            E9.a a0 = t01.b;
            if(Build.VERSION.SDK_INT >= 24) {
                s0 s00 = t01.a;
                s00.getClass();
                boolean z3 = s00.a.g(s0.f[0]).booleanValue();
                boolean z4 = s00.b.g(s0.f[1]).booleanValue();
                boolean z5 = t01.c();
                boolean z6 = t01.d.g(0xFF) == 0;
                s00.a.i(s0.f[0], z5);
                s00.b.i(s0.f[1], z6);
                if(!z3 && z5 || !z4 && z6) {
                label_52:
                    ((s0)o1.getValue()).b(true);
                    a2 a20 = this.J();
                    Boolean boolean0 = Boolean.valueOf(this.I());
                    a20.c0.getClass();
                    a20.c0.l(null, boolean0);
                    a2 a21 = this.J();
                    a2 a22 = this.J();
                    a21.D0.k(a22.j0);
                    F f0 = new F(1, new Handler(this.getMainLooper()));
                    a2 a23 = this.J();
                    Nb.j.f(a23, "screenViewModel");
                    F1 f10 = new F1(a23, this);
                    N n0 = this.w();
                    s s0 = (s)new ViewModelProvider(this).a(s.class);
                    s0.Y = f0;
                    s0.Z = f10;
                    if(n0 == null) {
                        Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
                    }
                    else {
                        BiometricFragment biometricFragment0 = (BiometricFragment)n0.E("androidx.biometric.BiometricFragment");
                        if(biometricFragment0 == null) {
                            Log.e("BiometricPromptCompat", "Unable to cancel authentication. BiometricFragment not found.");
                        }
                        else {
                            biometricFragment0.U(3);
                        }
                    }
                }
                else if(t01.c()) {
                    try {
                        SecretKey secretKey0 = t01.b();
                        if(secretKey0 == null) {
                            t0.a();
                        }
                        else {
                            try {
                                if(s00.a()) {
                                    a0.d("biometrics: starting key validity check", null);
                                }
                                t01.c.init(1, secretKey0);
                                if(s00.a()) {
                                    a0.d("biometrics: key still valid", null);
                                }
                            }
                            catch(KeyPermanentlyInvalidatedException unused_ex) {
                                t0.a();
                                if(s00.a()) {
                                    a0.d("biometrics: key invalidated", null);
                                }
                                goto label_52;
                            }
                            catch(InvalidKeyException unused_ex) {
                                if(s00.a()) {
                                    a0.d("biometrics: exception: InvalidKeyException", null);
                                }
                                t0.a();
                                goto label_52;
                            }
                        }
                        goto label_76;
                    }
                    catch(IllegalStateException illegalStateException0) {
                    }
                    catch(Exception exception0) {
                        goto label_50;
                    }
                    a0.a("biometrics: exception", new k[]{new k("javaClass", illegalStateException0.getClass().getName()), new k("message", illegalStateException0.getMessage())});
                    goto label_76;
                label_50:
                    a0.a("biometrics: exception", new k[]{new k("javaClass", exception0.getClass().getName()), new k("message", exception0.getMessage())});
                }
            }
        }
    label_76:
        H h0 = this.F0;
        if(h0 != null) {
            h0.q.requestFocus();
            s0 s01 = (s0)o1.getValue();
            s01.getClass();
            if(!s01.c.g(s0.f[2]).booleanValue() && ((Boolean)this.J().c0.getValue()).booleanValue()) {
                this.K();
            }
            this.J().g();
            return;
        }
        Nb.j.p("binding");
        throw null;
    }
}

