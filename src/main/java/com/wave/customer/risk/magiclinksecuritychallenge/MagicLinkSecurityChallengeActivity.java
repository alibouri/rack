package com.wave.customer.risk.magiclinksecuritychallenge;

import Ab.k;
import Ab.o;
import Bb.F;
import Bb.p;
import G5.a;
import L5.e;
import Nb.j;
import W4.f;
import a5.c;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import c0.b;
import io.sentry.android.core.internal.util.d;
import o9.m0;
import q9.c3;
import q9.k3;
import q9.o0;
import q9.r1;
import va.i;

public final class MagicLinkSecurityChallengeActivity extends k3 {
    public final o F0;
    public final o G0;
    public final o H0;
    public final c I0;
    public static final int J0;

    public MagicLinkSecurityChallengeActivity() {
        this.F0 = f.A(new ya.f(this, 0));
        this.G0 = f.A(new ya.f(this, 1));
        this.H0 = f.A(new ya.f(this, 2));
        this.I0 = new c(16, this);
    }

    public static String I(Intent intent0) {
        Uri uri0;
        if(Build.VERSION.SDK_INT >= 33) {
            Bundle bundle0 = intent0.getExtras();
            uri0 = bundle0 == null ? null : ((Uri)d.b(bundle0));
        }
        else {
            try {
                Bundle bundle1 = intent0.getExtras();
                uri0 = bundle1 == null ? null : ((Uri)bundle1.getParcelable("android.intent.extra.REFERRER"));
            }
            catch(Exception unused_ex) {
                uri0 = null;
            }
        }
        if(uri0 != null) {
            return uri0.toString();
        }
        Bundle bundle2 = intent0.getExtras();
        return bundle2 == null ? null : bundle2.getString("android.intent.extra.REFERRER_NAME");
    }

    public final com.wave.customer.risk.magiclinksecuritychallenge.c J() {
        return (com.wave.customer.risk.magiclinksecuritychallenge.c)this.H0.getValue();
    }

    public final void K(Intent intent0) {
        String s1;
        j.f(intent0, "intent");
        Uri uri0 = intent0.getData();
        if(uri0 == null) {
            s1 = null;
        }
        else {
            String s = uri0.getPath();
            s1 = s == null ? null : ((String)p.w0(Vb.j.p0(s, new String[]{"/"}, 0, 6)));
        }
        String s2 = MagicLinkSecurityChallengeActivity.I(intent0);
        if(s1 != null) {
            this.J().o(s1, s2, false);
            return;
        }
        r1.b(this).e().d("magic link security challenge: clicked link doesn\'t have secret", F.J(new k("link", String.valueOf(intent0.getData()))));
    }

    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.A0 = false;
        this.J().c0.c(this, this.E0);
        o0.U(this, new b(-280649025, new i(2, this), true));
        if(this.getIntent() != null) {
            Intent intent0 = this.getIntent();
            j.e(intent0, "getIntent(...)");
            this.K(intent0);
        }
        String s = null;
        if(K5.b.d.b(this, K5.c.a) == 0) {
            o6.p p0 = new Z5.b(this, this, a.k, L5.b.b, e.c).d();  // initializer: LL5/f;-><init>(Landroid/content/Context;Landroid/app/Activity;LR2/k;LL5/b;LL5/e;)V
            c3 c30 = new c3(6, new m0(9, this));
            p0.getClass();
            p0.c(o6.j.a, c30);
            p0.k(new c3(7, this));
            IntentFilter intentFilter0 = new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
            if(!h9.a.a.get()) {
                s = "com.google.android.gms.auth.api.phone.permission.SEND";
            }
            w1.c.e(this, this.I0, intentFilter0, s, 2);
            return;
        }
        r1.b(this).e().d("magic link security challenge: google play services unavailable, no sms autofill", null);
    }

    @Override  // i.j
    public final void onDestroy() {
        super.onDestroy();
        this.J().d0.i();
        if(K5.b.d.b(this, K5.c.a) == 0) {
            try {
                this.unregisterReceiver(this.I0);
            }
            catch(IllegalArgumentException unused_ex) {
            }
        }
    }

    @Override  // c.o
    public final void onNewIntent(Intent intent0) {
        j.f(intent0, "intent");
        super.onNewIntent(intent0);
        this.K(intent0);
    }
}

