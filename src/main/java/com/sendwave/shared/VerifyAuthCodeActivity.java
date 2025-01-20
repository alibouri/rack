package com.sendwave.shared;

import Ab.k;
import Ab.o;
import Bb.F;
import E9.a;
import J1.E;
import Nb.j;
import Vb.d;
import W4.f;
import Xb.J;
import Z5.b;
import a5.c;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.LifecycleOwnerKt;
import c2.I;
import f.g;
import hb.h;
import hb.n;
import i9.t0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o9.O1;
import o9.Q1;
import o9.R1;
import o9.S1;
import o9.T1;
import o9.s2;
import q9.k3;
import q9.r1;

public final class VerifyAuthCodeActivity extends k3 {
    public b F0;
    public t0 G0;
    public final g H0;
    public O1 I0;
    public boolean J0;
    public final o K0;
    public final S1 L0;
    public final c M0;
    public static final int N0;

    public VerifyAuthCodeActivity() {
        this.H0 = (g)this.v(new I(4), new Q1(this, 0));
        this.J0 = true;
        this.K0 = f.A(new R1(0, this));
        this.L0 = new S1(this);
        this.M0 = new c(10, this);
    }

    public final void I(String s) {
        String s2;
        s2 s20 = this.J();
        s20.getClass();
        Integer integer0 = (Integer)s20.p0.a(s2.N0[2], s20);
        if(integer0 != null) {
            String s1 = "\\b\\d{" + ((int)integer0) + "}\\b";
            j.f(s1, "pattern");
            Pattern pattern0 = Pattern.compile(s1);
            j.e(pattern0, "compile(...)");
            Matcher matcher0 = pattern0.matcher(s);
            j.e(matcher0, "matcher(...)");
            d d0 = Z6.b.g(matcher0, 0, s);
            if(d0 == null) {
                s2 = null;
            }
            else {
                s2 = d0.a.group();
                j.e(s2, "group(...)");
            }
            if(s2 == null) {
                return;
            }
            this.L0.l0(s2, true);
        }
    }

    public final s2 J() {
        return (s2)this.K0.getValue();
    }

    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        Parcelable parcelable0 = this.getIntent().getParcelableExtra("com.wave.workflowState");
        this.A0 = false;
        this.I0 = parcelable0 instanceof StepVerifyAuthCode ? O1.Y : O1.Z;
        R2.f.z(this.getWindow(), false);
        s2 s20 = this.J();
        t0 t00 = (t0)R1.d.a(this.getLayoutInflater(), 0x7F0D0105, null);  // layout:verify_auth_code
        t00.u(s20);
        t00.r(this);
        this.G0 = t00;
        this.setContentView(t00.d);
        t0 t01 = this.G0;
        if(t01 != null) {
            m7.o o0 = new m7.o(12);
            E.k(t01.y, o0);
            try {
                this.B(((Toolbar)this.findViewById(0x7F0A0307)));  // id:toolbar
            }
            catch(IllegalStateException illegalStateException0) {
                n.b(new IllegalStateException("VerifyAuthCodeActivity requires a theme without an action bar. Set `@style/VerifyAuthTheme` or specify\n<item name=\"windowActionBar\">false</item>\n<item name=\"windowNoTitle\">true</item>\nin your own theme.\nSee https://docs.google.com/document/d/1J_JG1q6eXGQyf8WyRvFj0vKuwO4UdRDY2B9NYhYMY-w/edit#bookmark=id.c5t1bcxwb4j8 for the why.", illegalStateException0), null, null, 14);
            }
            h h0 = this.z();
            if(h0 != null) {
                h0.h0(true);
            }
            int v = K5.b.d.b(this, K5.c.a);
            if(v == 0) {
                Parcelable parcelable1 = this.getIntent().getParcelableExtra("com.wave.typeSafeExtras");
                if(parcelable1 == null) {
                    throw new Exception(VerifyAuthCodeActivity.class.getName() + " invoked with no params");
                }
                if(((VerifyAuthCodeParams)parcelable1).f0) {
                    J.q(LifecycleOwnerKt.a(this), null, null, new T1(this, null), 3);
                }
            }
            else {
                r1.b(this).e().d("verify auth code: google play service is not available", F.J(new k("statusCode", v)));
            }
            a a0 = r1.b(this).e();
            O1 o10 = this.I0;
            if(o10 != null) {
                a0.d("view SMS code entry screen", F.J(new k("user_entry", o10.X)));
                return;
            }
            j.p("userEntry");
            throw null;
        }
        j.p("binding");
        throw null;
    }

    @Override  // i.j
    public final void onDestroy() {
        super.onDestroy();
        if(K5.b.d.b(this, K5.c.a) == 0) {
            try {
                this.unregisterReceiver(this.M0);
            }
            catch(IllegalArgumentException unused_ex) {
            }
        }
    }

    @Override  // q9.z3
    public final void onResume() {
        super.onResume();
        t0 t00 = this.G0;
        if(t00 != null) {
            t00.v.requestFocus();
            return;
        }
        j.p("binding");
        throw null;
    }
}

