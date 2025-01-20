package com.wave.customer;

import Ab.k;
import Ab.o;
import Bb.F;
import Cb.h;
import F0.W;
import G7.b;
import I2.a;
import J9.l;
import Na.p;
import Nb.j;
import R2.m;
import R9.A0;
import R9.B0;
import R9.C0;
import R9.D0;
import R9.E0;
import R9.F0;
import R9.G0;
import R9.H0;
import R9.I0;
import R9.J0;
import R9.d0;
import R9.e0;
import R9.h0;
import R9.i0;
import R9.j0;
import R9.k0;
import R9.n0;
import R9.o0;
import R9.p0;
import R9.q0;
import R9.r0;
import R9.t0;
import R9.u0;
import R9.v0;
import R9.w0;
import R9.w2;
import R9.x0;
import R9.y0;
import R9.z0;
import V8.c;
import V8.d;
import W4.f;
import Xb.G;
import Xb.J;
import Y2.e;
import Y8.G6;
import Y8.N;
import Y8.O;
import Y8.R6;
import Y8.s6;
import Y8.y2;
import Y8.y6;
import a3.t;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.os.Process;
import android.util.Base64;
import android.util.Log;
import com.sendwave.backend.type.SecurityQuestionFormPurpose.SELF_SERVE_PIN_RECOVERY;
import com.sendwave.shared.PayBillDialogActivity;
import com.sendwave.shared.SecurityChallengeResult;
import com.sendwave.util.Country;
import com.sendwave.util.UNIT;
import com.wave.customer.home.CustomerSendMoneySelectActivity;
import com.wave.customer.home.PersonalHomeActivity;
import com.wave.customer.limits.AccountLimitsActivity;
import com.wave.customer.linkedaccounts.typeselect.LinkedAccountTypeSelectActivity;
import com.wave.customer.paymentcards.PaymentCardsActivity;
import com.wave.customer.receipts.ReceiptActivity;
import com.wave.customer.risk.magiclinksecuritychallenge.MagicLinkSecurityChallengeActivity;
import com.wave.customer.savings.SavingsActivity;
import com.wave.customer.scratchCardRewards.ScratchCardRewardsActivity;
import com.wave.customer.settings.SettingsActivity;
import hb.n;
import hb.s;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function2;
import pb.E;
import pb.g;
import q9.C3;
import q9.p1;
import q9.s3;

public final class CustomerApp extends l implements a, e, g {
    public final o A0;
    public final m B0;
    public final D9.a C0;
    public final d0 D0;
    public final o E0;
    public final o F0;
    public final int G0;
    public final e0 H0;
    public final boolean I0;
    public final boolean J0;
    public final n K0;
    public static final int L0;
    public final Class w0;
    public final boolean x0;
    public W y0;
    public final o z0;

    static {
    }

    public CustomerApp() {
        int v = 2;
        super();
        this.w0 = RootActivity.class;
        this.x0 = true;
        this.z0 = f.A(new d0(this, 0));
        this.A0 = f.A(new d0(this, 1));
        j.f(this, "app");
        m m0 = new m();  // initializer: Ljava/lang/Object;-><init>()V
        m0.X = this;
        Cb.g g0 = new Cb.g();
        B0 b00 = new B0(2, null);  // initializer: LFb/j;-><init>(ILkotlin/coroutines/g;)V
        g0.put(SignupLoginActivity.class, b00);
        C0 c00 = new C0(m0, null);
        g0.put(CustomerSendMoneySelectActivity.class, c00);
        D0 d00 = new D0(2, null);  // initializer: LFb/j;-><init>(ILkotlin/coroutines/g;)V
        g0.put(PaymentListActivity.class, d00);
        E0 e00 = new E0(m0, null);
        g0.put(PayBillDialogActivity.class, e00);
        F0 f00 = new F0(m0, null);
        g0.put(BuyAirtimeSelectActivity.class, f00);
        G0 g00 = new G0(m0, null);
        g0.put(CardFullScreenActivity.class, g00);
        H0 h00 = new H0(m0, null);
        g0.put(PersonalHomeActivity.class, h00);
        I0 i00 = new I0(m0, null);
        g0.put(ReceiptActivity.class, i00);
        J0 j00 = new J0(m0, null);
        g0.put(ResetPinActivity.class, j00);
        u0 u00 = new u0(m0, null);
        g0.put(SettingsActivity.class, u00);
        v0 v00 = new v0(m0, null);
        g0.put(LinkedAccountTypeSelectActivity.class, v00);
        w0 w00 = new w0(m0, null);
        g0.put(AccountLimitsActivity.class, w00);
        x0 x00 = new x0(m0, null);
        g0.put(PaymentCardsActivity.class, x00);
        y0 y00 = new y0(m0, null);
        g0.put(SavingsActivity.class, y00);
        z0 z00 = new z0(m0, null);
        g0.put(MagicLinkSecurityChallengeActivity.class, z00);
        A0 a00 = new A0(2, null);  // initializer: LFb/j;-><init>(ILkotlin/coroutines/g;)V
        g0.put(ScratchCardRewardsActivity.class, a00);
        m0.Y = g0.b();
        m0.Z = new HashMap();
        m0.b0 = F.D(new k[]{new k("/referral_via_p2p_share", new n0(m0, null)), new k("/referral_via_whatsapp_share", new o0(m0, null)), new k("/p2p_share", new p0(m0, null)), new k("/whatsapp_share", new q0(m0, null)), new k("/update_app", new r0(m0, null)), new k("/share", new t0(2, null))});  // initializer: LFb/j;-><init>(ILkotlin/coroutines/g;)V
        this.B0 = m0;
        this.C0 = new D9.a(new C9.a[]{new T9.a(this, 0), new T9.a(this, 1)});
        this.D0 = new d0(this, 2);
        this.E0 = f.A(new d0(this, 3));
        this.F0 = f.A(new d0(this, 4));
        Locale locale0 = Locale.ROOT;
        j.e(locale0, "ROOT");
        String s = "production".toLowerCase(locale0);
        j.e(s, "toLowerCase(...)");
        if(s.equals("local")) {
            v = 1;
        }
        else if(s.equals("production")) {
        }
        else {
            throw new IllegalStateException("unknown build flavor");
        }
        this.G0 = v;
        this.H0 = new e0(this, 0);
        this.I0 = true;
        this.J0 = true;
        this.K0 = new n(1);
    }

    @Override  // q9.C3
    public final E9.a e() {
        return (E9.a)this.F0.getValue();
    }

    @Override  // q9.C3
    public final Object l(c c0, ac.B0 b00, Fb.c c1) {
        CustomerApp customerApp0;
        CustomerApp customerApp1;
        RecoverPinParams recoverPinParams0;
        c c2;
        AtomicInteger atomicInteger1;
        CustomerApp customerApp2;
        c c3;
        h0 h00;
        ac.B0 b01 = b00;
        if(c1 instanceof h0) {
            h00 = (h0)c1;
            int v = h00.h0;
            if((v & 0x80000000) == 0) {
                h00 = new h0(this, c1);
            }
            else {
                h00.h0 = v ^ 0x80000000;
            }
        }
        else {
            h00 = new h0(this, c1);
        }
        Object object0 = h00.f0;
        Object object1 = Eb.a.X;
        switch(h00.h0) {
            case 0: {
                W5.f.b0(object0);
                y2 y20 = new y2(SELF_SERVE_PIN_RECOVERY.X);
                this.e().d("generating security question form for in app pin recovery", null);
                try {
                    Map map0 = N.a;
                    Object object2 = map0.get(b01);
                    if(object2 == null) {
                        object2 = new AtomicInteger(0);
                        map0.put(b01, object2);
                    }
                    atomicInteger1 = (AtomicInteger)object2;
                    while(true) {
                        Object object3 = b00.getValue();
                        ((Boolean)object3).getClass();
                        if(b01.j(object3, Boolean.valueOf(atomicInteger1.incrementAndGet() > 0))) {
                            break;
                        }
                    }
                }
                catch(O unused_ex) {
                    return Boolean.FALSE;
                }
                try {
                    R6 r60 = this.a();
                    h00.b0 = this;
                    h00.c0 = c0;
                    h00.d0 = b01;
                    h00.e0 = atomicInteger1;
                    h00.h0 = 1;
                    object0 = r60.f(y20, G6.X, h00);
                    if(object0 == object1) {
                        return object1;
                    }
                    c3 = c0;
                    customerApp2 = this;
                label_62:
                    y6 y60 = (y6)object0;
                    goto label_69;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            case 1: {
                AtomicInteger atomicInteger0 = h00.e0;
                ac.B0 b02 = h00.d0;
                c3 = (c)h00.c0;
                customerApp2 = h00.b0;
                try {
                    atomicInteger1 = atomicInteger0;
                    b01 = b02;
                    W5.f.b0(object0);
                    atomicInteger1 = atomicInteger0;
                    b01 = b02;
                    goto label_62;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            case 2: {
                c2 = (c)h00.c0;
                customerApp1 = h00.b0;
                W5.f.b0(object0);
                goto label_85;
            }
            case 3: {
                c2 = (c)h00.c0;
                customerApp1 = h00.b0;
                W5.f.b0(object0);
                goto label_92;
            }
            case 4: {
                recoverPinParams0 = (RecoverPinParams)h00.c0;
                customerApp1 = h00.b0;
                W5.f.b0(object0);
                goto label_107;
            }
            case 5: {
                customerApp0 = h00.b0;
                W5.f.b0(object0);
                goto label_114;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            do {
                Object object4 = b01.getValue();
                ((Boolean)object4).getClass();
            }
            while(!b01.j(object4, Boolean.valueOf(atomicInteger1.decrementAndGet() > 0)));
            throw throwable0;
            do {
            label_69:
                Object object5 = b01.getValue();
                ((Boolean)object5).getClass();
            }
            while(!b01.j(object5, Boolean.valueOf(atomicInteger1.decrementAndGet() > 0)));
        }
        catch(O unused_ex) {
            return Boolean.FALSE;
        }
        customerApp2.e().d("presenting security questions to customer for in app pin recovery", null);
        h00.b0 = customerApp2;
        h00.c0 = c3;
        h00.d0 = null;
        h00.e0 = null;
        h00.h0 = 2;
        object0 = c3.e(h00);
        if(object0 == object1) {
            return object1;
        }
        c2 = c3;
        customerApp1 = customerApp2;
    label_85:
        UNIT uNIT0 = new UNIT();
        h00.b0 = customerApp1;
        h00.c0 = c2;
        h00.h0 = 3;
        object0 = ((d)object0).l(InAppPinRecoveryExtraSecurityChallengeActivity.class, uNIT0, SecurityChallengeResult.class, h00);
        if(object0 == object1) {
            return object1;
        }
    label_92:
        if(!((SecurityChallengeResult)object0).X) {
            return Boolean.FALSE;
        }
        String s = customerApp1.d().h();
        if(s == null) {
            s = "";
        }
        RecoverPinParams recoverPinParams1 = new RecoverPinParams(s, null);
        customerApp1.e().d("beginning recover pin activity", null);
        h00.b0 = customerApp1;
        h00.c0 = recoverPinParams1;
        h00.h0 = 4;
        Object object6 = c2.e(h00);
        if(object6 == object1) {
            return object1;
        }
        recoverPinParams0 = recoverPinParams1;
        object0 = object6;
    label_107:
        h00.b0 = customerApp1;
        h00.c0 = null;
        h00.h0 = 5;
        object0 = ((d)object0).l(RecoverPinActivity.class, recoverPinParams0, RecoverPinResult.class, h00);
        if(object0 == object1) {
            return object1;
        }
        customerApp0 = customerApp1;
    label_114:
        if(!((RecoverPinResult)object0).X) {
            return Boolean.FALSE;
        }
        customerApp0.e().d("logging in post recovering pin in app", null);
        return Boolean.TRUE;
    }

    @Override  // J9.l
    public final void onCreate() {
        boolean z;
        int v4;
        int v6;
        super.onCreate();
        B9.f f0 = this.d();
        j0 j00 = new j0(this);
        f0.m.add(j00);
        ba.a[] arr_a = {new ba.a(this, 1), new ba.a(this, 2), new ba.a(this, 0)};
        int v = 0;
        while(v < 3) {
            ba.a a0 = arr_a[v];
            switch(a0.a) {
                case 0: {
                    String[] arr_s = ba.a.c;
                    int v5 = 0;
                    while(true) {
                        v6 = 0;
                        if(v5 < 2) {
                            byte[] arr_b = Base64.decode(arr_s[v5], 0);
                            j.e(arr_b, "decode(...)");
                            if(new String(arr_b, Vb.a.a).equals("com.wave.personal")) {
                                v6 = 1;
                            }
                            else {
                                ++v5;
                                continue;
                            }
                        }
                        break;
                    }
                    z = v6 ^ 1;
                    break;
                }
                case 1: {
                    File file1 = a0.b.getFilesDir();
                    if(file1 != null) {
                        String s1 = file1.getPath();
                        if(s1 != null) {
                            z = Vb.j.R(s1, "999", false);
                            break;
                        }
                    }
                    z = false;
                    break;
                }
                default: {
                    CustomerApp customerApp0 = a0.b;
                    j.e("com.wave.personal", "getPackageName(...)");
                    int v1 = 0;
                    for(int v2 = 0; v2 < 17; ++v2) {
                        if("com.wave.personal".charAt(v2) == 46) {
                            ++v1;
                        }
                    }
                    File file0 = customerApp0.getFilesDir();
                    if(file0 == null) {
                        v4 = v1;
                    }
                    else {
                        String s = file0.getPath();
                        if(s != null) {
                            v4 = 0;
                            for(int v3 = 0; v3 < s.length(); ++v3) {
                                if(s.charAt(v3) == 46) {
                                    ++v4;
                                }
                            }
                        }
                    }
                    z = v4 == v1 ? false : true;
                }
            }
            if(!z) {
                ++v;
                continue;
            }
            B9.f.e(this.d(), "app_clone_detection", null, 4);
            Process.killProcess(Process.myPid());
            throw new IllegalStateException("Good bye!");
        }
        hb.c c0 = new hb.c(new q9.m(this, "CrashLoopDetector"));
        c0.b0 = this;
        c0.Z = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(c0);
        new P9.a();
        this.y0 = new W(this);
        new p(this).a(false);
    }

    @Override  // q9.C3
    public final H9.d p(String s, String s1, Country country0) {
        j.f(country0, "country");
        n.a(("Building apolloDI for " + s + " in " + country0.Y), null, null, null, null, 30);
        pa.m m0 = new pa.m(0, this, C3.class, "overrideProdBackendHostname", "overrideProdBackendHostname()Ljava/lang/String;", 0, 9);
        G0.k k0 = new G0.k(0, 1, C3.class, this, "cronetEngine", "getCronetEngine()Lorg/chromium/net/CronetEngine;");
        lb.j j0 = new lb.j(11);
        e0 e00 = new e0(this, 2);
        new H9.d(s, s1, country0, this, m0, this.G0, k0, j0, e00);
        e0 e01 = new e0(this, 1);
        return new H9.d(s, s1, country0, this, m0, this.G0, k0, i0.g0, e01);
    }

    @Override  // q9.C3
    public final void r(s6 s60) {
        j.f(s60, "config");
        s.j.set(s60.a.b);
        if(s60.a.c) {
            U3.c.a = new lb.j(13);
        }
        b b0 = P4.c.E();
        Boolean boolean0 = Boolean.valueOf(s60.a.a);
        synchronized(b0) {
            try {
                Z6.g.c();
            }
            catch(IllegalStateException unused_ex) {
                return;
            }
        }
        if(b0.b.g().booleanValue()) {
            L7.a a0 = b.d;
            if(a0.b) {
                a0.a.getClass();
                Log.i("FirebasePerformance", "Firebase Performance is permanently disabled");
            }
            return;
        }
        I7.a a1 = b0.b;
        if(!a1.g().booleanValue()) {
            I7.c.b0().getClass();
            a1.c.g("isEnabled", Boolean.TRUE.equals(boolean0));
        }
        b0.c = boolean0;
        if(Boolean.TRUE.equals(boolean0)) {
            L7.a a2 = b.d;
            if(a2.b) {
                a2.a.getClass();
                Log.i("FirebasePerformance", "Firebase Performance is Enabled");
            }
        }
        else if(Boolean.FALSE.equals(b0.c)) {
            L7.a a3 = b.d;
            if(a3.b) {
                a3.a.getClass();
                Log.i("FirebasePerformance", "Firebase Performance is Disabled");
            }
        }
    }

    @Override  // q9.C3
    public final Object s(String s, String s1, c c0, f.g g0, Fb.c c1) {
        f.b b2;
        String s2;
        CustomerApp customerApp0;
        f.b b0;
        k0 k00;
        if(c1 instanceof k0) {
            k00 = (k0)c1;
            int v = k00.h0;
            if((v & 0x80000000) == 0) {
                k00 = new k0(this, c1);
            }
            else {
                k00.h0 = v ^ 0x80000000;
            }
        }
        else {
            k00 = new k0(this, c1);
        }
        Object object0 = k00.f0;
        Object object1 = Eb.a.X;
        switch(k00.h0) {
            case 0: {
                W5.f.b0(object0);
                k00.b0 = this;
                k00.c0 = s;
                k00.d0 = s1;
                k00.e0 = g0;
                k00.h0 = 1;
                object0 = c0.e(k00);
                if(object0 == object1) {
                    return object1;
                }
                b0 = g0;
                customerApp0 = this;
                goto label_32;
            }
            case 1: {
                f.b b1 = k00.e0;
                s1 = k00.d0;
                s = k00.c0;
                CustomerApp customerApp1 = k00.b0;
                W5.f.b0(object0);
                customerApp0 = customerApp1;
                b0 = b1;
            label_32:
                k00.b0 = customerApp0;
                k00.c0 = s;
                k00.d0 = s1;
                k00.e0 = b0;
                k00.h0 = 2;
                object0 = w2.f(((d)object0), s1, s, 0x7F1201B1, k00);  // string:go_back "Go back"
                if(object0 == object1) {
                    return object1;
                }
                s2 = s;
                b2 = b0;
                break;
            }
            case 2: {
                b2 = k00.e0;
                s1 = k00.d0;
                s2 = k00.c0;
                customerApp0 = k00.b0;
                W5.f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((Boolean)object0).booleanValue()) {
            return Boolean.TRUE;
        }
        RecoverPinParams recoverPinParams0 = new RecoverPinParams(s2, s1);
        StepConfirmPin recoverPinWorkflow$StepConfirmPin0 = new StepConfirmPin(s2, s1);
        Intent intent0 = new Intent(customerApp0, RecoverPinActivity.class);
        intent0.putExtra("com.wave.typeSafeExtras", recoverPinParams0);
        intent0.putExtra("com.wave.workflowState", recoverPinWorkflow$StepConfirmPin0);
        b2.a(intent0);
        return Boolean.TRUE;
    }

    @Override  // q9.C3
    public final E u(ac.h0 h00, s9.a a0, G g0) {
        j.f(h00, "loading");
        j.f(a0, "flowName");
        j.f(g0, "coroutineScope");
        R6 r60 = this.a();
        return new E(r60, h00, new sb.l(this, r60), this.e(), a0, g0);
    }

    public final Parcelable w(Uri uri0, String s) {
        Object object0 = null;
        j.f(uri0, "uri");
        this.B0.getClass();
        Iterator iterator0 = ((h)((Cb.g)this.B0.Y).entrySet()).iterator();
        while(((Cb.f)iterator0).hasNext()) {
            Object object1 = ((Cb.d)iterator0).next();
            if(((Class)((Map.Entry)object1).getKey()).getName().equals(s)) {
                object0 = object1;
                break;
            }
        }
        if(((Map.Entry)object0) != null) {
            Function2 function20 = (Function2)((Map.Entry)object0).getValue();
            if(function20 != null) {
                s3 s30 = new s3(function20, uri0, null);
                return (Parcelable)J.t(kotlin.coroutines.j.X, s30);
            }
        }
        throw new p1("Unable to build params for " + s);
    }

    public final Y2.m x() {
        Context context0 = this.getApplicationContext();
        j.e(context0, "getApplicationContext(...)");
        m m0 = new m(context0);
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new t());
        m0.Z = new Y2.b(N4.h.N(arrayList0), N4.h.N(arrayList1), N4.h.N(arrayList2), N4.h.N(arrayList3), N4.h.N(arrayList4));
        return m0.b();
    }
}

