package q9;

import Ab.k;
import Ab.n;
import Ab.t;
import B4.e;
import Bb.F;
import Bb.z;
import Ea.r;
import Eb.a;
import Fb.c;
import G0.e0;
import M.J;
import N4.h;
import Nb.j;
import Nb.w;
import R9.I1;
import V8.d;
import W5.f;
import Wc.q;
import Xb.H;
import Xb.r0;
import Y8.H6;
import Y8.N;
import Y8.O;
import Y8.Q8;
import Y8.R6;
import Y8.S6;
import Y8.T;
import Y8.V8;
import Y8.W8;
import Y8.X8;
import Y8.Y8;
import Y8.Z;
import Y8.a9;
import Y8.h3;
import Y8.i3;
import Y8.j3;
import Y8.y6;
import Yc.p;
import a8.Q;
import a9.T7;
import ac.B0;
import ac.K;
import ac.h0;
import ac.i0;
import ac.i;
import ac.j0;
import ac.s0;
import ac.t0;
import ac.y0;
import ac.z0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.SubViewModel;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import c2.I;
import c2.x;
import com.apollographql.apollo.api.Optional.Absent;
import com.apollographql.apollo.api.Optional;
import com.google.android.play.core.review.ReviewInfo;
import com.sendwave.backend.type.PartnerOrg.BF_ORABANK;
import com.sendwave.backend.type.PartnerOrg.BF_UBA;
import com.sendwave.backend.type.PartnerOrg.BJ_ORABANK;
import com.sendwave.backend.type.PartnerOrg.BJ_UBA;
import com.sendwave.backend.type.PartnerOrg.CI_ECOBANK;
import com.sendwave.backend.type.PartnerOrg.CI_ORABANK;
import com.sendwave.backend.type.PartnerOrg.CI_UBA;
import com.sendwave.backend.type.PartnerOrg.CM_CBC;
import com.sendwave.backend.type.PartnerOrg.ET_SMFI;
import com.sendwave.backend.type.PartnerOrg.GM_ACCESSBANK;
import com.sendwave.backend.type.PartnerOrg.GM_MEGABANK;
import com.sendwave.backend.type.PartnerOrg.GM_WTL;
import com.sendwave.backend.type.PartnerOrg.GN_WAVE;
import com.sendwave.backend.type.PartnerOrg.LEGACY_UNKNOWN__;
import com.sendwave.backend.type.PartnerOrg.ML_ORABANK;
import com.sendwave.backend.type.PartnerOrg.ML_UBA;
import com.sendwave.backend.type.PartnerOrg.NE_BIA;
import com.sendwave.backend.type.PartnerOrg.NE_ECOBANK;
import com.sendwave.backend.type.PartnerOrg.NE_ORABANK;
import com.sendwave.backend.type.PartnerOrg.QQ_DUMMYEMI;
import com.sendwave.backend.type.PartnerOrg.QQ_FAKEBANK;
import com.sendwave.backend.type.PartnerOrg.SL_WTL;
import com.sendwave.backend.type.PartnerOrg.SN_ECOBANK;
import com.sendwave.backend.type.PartnerOrg.SN_UBA;
import com.sendwave.backend.type.PartnerOrg.SN_WDF;
import com.sendwave.backend.type.PartnerOrg.TG_ORABANK;
import com.sendwave.backend.type.PartnerOrg.UG_EQUITYBANK;
import com.sendwave.backend.type.PartnerOrg.UNKNOWN__;
import com.sendwave.backend.type.PartnerOrg;
import com.sendwave.util.AnnouncementAction;
import com.sendwave.util.Country;
import com.sendwave.util.LauncherFragment;
import com.sendwave.util.ParcelableSingleton;
import f.b;
import f.g;
import io.sentry.i1;
import java.io.File;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public abstract class o0 {
    public static final String[] a;
    public static final x1 b;

    static {
        o0.a = new String[]{"EXYNOS 7872", "EXYNOS 7880", "EXYNOS 7870", "MSM8953", "MSM8937", "MSM8940", "MSM8992", "MSM8952", "MSM8917", "SDM439"};
        o0.b = new x1("deviceUUID");  // initializer: LB4/e;-><init>(Ljava/lang/String;)V
    }

    public static final Object A(Country country0, String s, R6 r60, c c0) {
        Q2 q20;
        if(c0 instanceof Q2) {
            q20 = (Q2)c0;
            int v = q20.c0;
            if((v & 0x80000000) == 0) {
                q20 = new Q2(c0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
            }
            else {
                q20.c0 = v ^ 0x80000000;
            }
        }
        else {
            q20 = new Q2(c0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
        }
        Object object0 = q20.b0;
        Object object1 = a.X;
        switch(q20.c0) {
            case 0: {
                f.b0(object0);
                try {
                    Q8 q80 = new Q8(S6.a(country0.Y), Optional.Companion.presentIfNotNull(s));
                    q20.c0 = 1;
                    object0 = R6.d(r60, q80, H6.c0, null, q20, 4);
                    if(object0 == object1) {
                        return object1;
                    label_19:
                        f.b0(object0);
                    }
                    return ((y6)object0).b;
                }
                catch(O unused_ex) {
                    break;
                }
            }
            case 1: {
                goto label_19;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return null;
    }

    public static final Object B(Country country0, String s, R6 r60, c c0) {
        R2 r20;
        if(c0 instanceof R2) {
            r20 = (R2)c0;
            int v = r20.c0;
            if((v & 0x80000000) == 0) {
                r20 = new R2(c0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
            }
            else {
                r20.c0 = v ^ 0x80000000;
            }
        }
        else {
            r20 = new R2(c0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
        }
        Object object0 = r20.b0;
        Object object1 = a.X;
        switch(r20.c0) {
            case 0: {
                f.b0(object0);
                try {
                    X8 x80 = new X8(S6.a(country0.Y), Optional.Companion.presentIfNotNull(s));
                    r20.c0 = 1;
                    object0 = R6.d(r60, x80, H6.c0, null, r20, 4);
                    if(object0 == object1) {
                        return object1;
                    label_19:
                        f.b0(object0);
                    }
                    return ((y6)object0).b;
                }
                catch(O unused_ex) {
                    break;
                }
            }
            case 1: {
                goto label_19;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return null;
    }

    public static final Object C(Country country0, R6 r60, c c0) {
        Object object3;
        Object object2;
        S2 s20;
        if(c0 instanceof S2) {
            s20 = (S2)c0;
            int v = s20.d0;
            if((v & 0x80000000) == 0) {
                s20 = new S2(c0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
            }
            else {
                s20.d0 = v ^ 0x80000000;
            }
        }
        else {
            s20 = new S2(c0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
        }
        Object object0 = s20.c0;
        Object object1 = a.X;
        switch(s20.d0) {
            case 0: {
                f.b0(object0);
                String s = country0.j0;
                try {
                    X8 x80 = new X8(S6.a(country0.Y), Absent.INSTANCE);
                    s20.b0 = s;
                    s20.d0 = 1;
                    object2 = R6.d(r60, x80, null, null, s20, 6);
                }
                catch(O unused_ex) {
                    return s;
                }
                if(object2 == object1) {
                    return object1;
                }
                object0 = object2;
                object3 = s;
                return ((V8)((y6)object0).b).a.b;
            }
            case 1: {
                try {
                    object3 = s20.b0;
                    f.b0(object0);
                    return ((V8)((y6)object0).b).a.b;
                }
                catch(O unused_ex) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return object3;
    }

    public static TelephonyManager D(Context context0) {
        return (TelephonyManager)context0.getSystemService("phone");
    }

    public static final boolean E(String s) {
        j.f(s, "<this>");
        Iterable iterable0 = Vb.j.p0(s, new String[]{" "}, 0, 6);
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            if(!Vb.j.c0(((String)object0))) {
                arrayList0.add(object0);
            }
        }
        return arrayList0.size() >= 2;
    }

    public static void F(x x0, Class class0, Parcelable parcelable0) {
        j.f(x0, "<this>");
        j.f(class0, "klass");
        j.f(parcelable0, "params");
        x0.startActivity(o0.I(x0, class0, parcelable0, null));
    }

    public static final void G(Context context0, b b0, Class class0, Parcelable parcelable0, Parcelable parcelable1, boolean z) {
        j.f(context0, "<this>");
        j.f(b0, "launcher");
        j.f(parcelable0, "params");
        Intent intent0 = new Intent(context0, class0);
        if(z) {
            intent0.addFlags(0x4000000);
        }
        intent0.putExtra("com.wave.typeSafeExtras", parcelable0);
        intent0.putExtra("com.wave.workflowState", parcelable1);
        b0.a(intent0);
    }

    public static final Q H(Function0 function00, x1 x10, Function0 function01) {
        j.f(x10, "stringKey");
        return new Q(function00, x10, function01, 23);
    }

    public static final Intent I(Context context0, Class class0, Parcelable parcelable0, Uri uri0) {
        j.f(context0, "context");
        j.f(class0, "klass");
        j.f(parcelable0, "params");
        Intent intent0 = new Intent(context0, class0);
        intent0.putExtra("com.wave.typeSafeExtras", parcelable0);
        if(uri0 != null) {
            intent0.setData(uri0);
        }
        return intent0;
    }

    public static final Object J(z3 z30, c c0) {
        Void void0;
        z3 z33;
        k0 k02;
        Object object4;
        Object object3;
        ReviewInfo reviewInfo0;
        k0 k01;
        com.google.android.play.core.review.b b1;
        z3 z32;
        z3 z31;
        o1 o10;
        if(c0 instanceof o1) {
            o10 = (o1)c0;
            int v = o10.f0;
            if((v & 0x80000000) == 0) {
                o10 = new o1(c0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
            }
            else {
                o10.f0 = v ^ 0x80000000;
            }
        }
        else {
            o10 = new o1(c0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
        }
        Object object0 = o10.e0;
        Object object1 = a.X;
        Object object2 = t.a;
        boolean z = true;
        switch(o10.f0) {
            case 0: {
                f.b0(object0);
                z30.getClass();
                R6 r60 = r1.b(z30).a();
                z31 = z30;
                o10.b0 = z31;
                o10.f0 = 1;
                object0 = o0.z(r60, o10);
                if(object0 == object1) {
                    return object1;
                }
                goto label_26;
            }
            case 1: {
                z31 = o10.b0;
                f.b0(object0);
            label_26:
                if(!(((Boolean)object0) == null ? false : ((Boolean)object0).booleanValue())) {
                    return object2;
                }
                r1.b(z31);
                k0 k00 = new k0(z31);
                ((m)k00.X).getClass();
                q q0 = new q(o0.q(((m)k00.X), k0.Y), p.Q());
                q q1 = new q();
                Wc.a a0 = q0.Y;
                if(a0 == null) {
                    a0 = p.Q();
                }
                if(Wc.j.d(a0.h().c(q1.X, q0.X)).X < 365) {
                    z = false;
                }
                if(!z) {
                    return object2;
                }
                Context context0 = z31.getApplicationContext();
                if(context0 == null) {
                    context0 = z31;
                }
                com.google.android.play.core.review.b b0 = new com.google.android.play.core.review.b(new S6.c(context0));
                try {
                    o6.p p0 = b0.b();
                    j.e(p0, "requestReviewFlow(...)");
                    o10.b0 = z31;
                    o10.c0 = k00;
                    o10.d0 = b0;
                    o10.f0 = 2;
                    object0 = h.k(p0, o10);
                    goto label_57;
                }
                catch(CancellationException cancellationException0) {
                    throw cancellationException0;
                }
                catch(Throwable throwable0) {
                }
                z32 = z31;
                b1 = b0;
                k01 = k00;
                goto label_72;
            label_57:
                if(object0 == object1) {
                    return object1;
                }
                z32 = z31;
                b1 = b0;
                k01 = k00;
                reviewInfo0 = (ReviewInfo)object0;
                goto label_73;
            }
            case 2: {
                b1 = (com.google.android.play.core.review.b)o10.d0;
                k01 = o10.c0;
                z32 = o10.b0;
                try {
                    f.b0(object0);
                    reviewInfo0 = (ReviewInfo)object0;
                    goto label_73;
                }
                catch(CancellationException cancellationException0) {
                    throw cancellationException0;
                }
                catch(Throwable throwable0) {
                }
            label_72:
                reviewInfo0 = f.v(throwable0);
            label_73:
                object3 = reviewInfo0;
                if(!(object3 instanceof Ab.m)) {
                    ReviewInfo reviewInfo1 = (ReviewInfo)object3;
                    try {
                        o6.p p1 = b1.a(z32, reviewInfo1);
                        j.e(p1, "launchReviewFlow(...)");
                        o10.b0 = z32;
                        o10.c0 = k01;
                        o10.d0 = object3;
                        o10.f0 = 3;
                        object0 = h.k(p1, o10);
                        goto label_89;
                    }
                    catch(CancellationException cancellationException1) {
                        throw cancellationException1;
                    }
                    catch(Throwable throwable1) {
                    }
                    object4 = object3;
                    k02 = k01;
                    z33 = z32;
                    goto label_104;
                label_89:
                    if(object0 == object1) {
                        return object1;
                    }
                    object4 = object3;
                    k02 = k01;
                    z33 = z32;
                    void0 = (Void)object0;
                    goto label_105;
                }
                goto label_115;
            }
            case 3: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            object4 = o10.d0;
            k02 = o10.c0;
            z33 = o10.b0;
            f.b0(object0);
            void0 = (Void)object0;
            goto label_105;
        }
        catch(CancellationException cancellationException1) {
            throw cancellationException1;
        }
        catch(Throwable throwable1) {
        }
    label_104:
        void0 = f.v(throwable1);
    label_105:
        if(!(void0 instanceof Ab.m)) {
            k02.getClass();
            long v1 = new Wc.b().X;  // initializer: LXc/d;-><init>()V
            ((m)k02.X).getClass();
            l l0 = new l(((m)k02.X));
            o0.O(l0, k0.Y, v1);
            l0.apply();
            z33.getClass();
            r1.b(z33).e().d("In-app review (possibly) launched", null);
        }
        object3 = object4;
    label_115:
        Throwable throwable2 = n.a(object3);
        if(throwable2 != null) {
            hb.n.d(J.e("Issue when prompting user to review the app. Message: ", throwable2.getMessage(), ". "), i1.INFO, null, false, 12);
        }
        return object2;
    }

    public static final s K(z0 z00) {
        j.f(z00, "<this>");
        return new s(2, z00);
    }

    public static final Object L(V8.c c0, int v, Country country0, R6 r60, h0 h00, E9.a a0, String s, c c1) {
        String s9;
        Object object7;
        B0 b00;
        String s1;
        V8.c c4;
        h0 h01;
        AtomicInteger atomicInteger0;
        Country country1;
        R6 r61;
        h0 h02;
        E9.a a1;
        String s2;
        Country country3;
        Object object2;
        String s4;
        E9.a a3;
        h0 h04;
        R6 r63;
        int v3;
        r2 r20;
        V8.c c2 = c0;
        if(c1 instanceof r2) {
            r20 = (r2)c1;
            int v1 = r20.j0;
            if((v1 & 0x80000000) == 0) {
                r20 = new r2(c1);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
            }
            else {
                r20.j0 = v1 ^ 0x80000000;
            }
        }
        else {
            r20 = new r2(c1);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
        }
        Object object0 = r20.i0;
        Object object1 = a.X;
        switch(r20.j0) {
            case 0: {
                f.b0(object0);
                r20.b0 = c2;
                country3 = country0;
                r20.c0 = country3;
                r20.d0 = r60;
                r20.e0 = h00;
                a3 = a0;
                r20.f0 = a3;
                r20.g0 = s;
                v3 = v;
                r20.h0 = v3;
                r20.j0 = 1;
                Object object3 = c2.e(r20);
                if(object3 == object1) {
                    return object1;
                }
                r63 = r60;
                object2 = object3;
                h04 = h00;
                s4 = s;
                break;
            }
            case 1: {
                int v2 = r20.h0;
                String s3 = r20.g0;
                E9.a a2 = r20.f0;
                h0 h03 = r20.e0;
                R6 r62 = (R6)r20.d0;
                Country country2 = (Country)r20.c0;
                V8.c c5 = (V8.c)r20.b0;
                f.b0(object0);
                v3 = v2;
                c2 = c5;
                r63 = r62;
                h04 = h03;
                a3 = a2;
                s4 = s3;
                object2 = object0;
                country3 = country2;
                break;
            }
            case 2: {
                s2 = r20.g0;
                a1 = r20.f0;
                h02 = r20.e0;
                r61 = (R6)r20.d0;
                country1 = (Country)r20.c0;
                c4 = (V8.c)r20.b0;
                f.b0(object0);
                goto label_88;
            }
            case 3: {
                atomicInteger0 = (AtomicInteger)r20.d0;
                h01 = (h0)r20.c0;
                V8.c c3 = (V8.c)r20.b0;
                try {
                    f.b0(object0);
                    c4 = c3;
                    s9 = (String)object0;
                    goto label_126;
                }
                catch(Throwable throwable0) {
                    goto label_122;
                }
            }
            case 4: {
                s1 = (String)r20.b0;
                f.b0(object0);
                ((d)object0).F(s1);
                return Boolean.TRUE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        String s5 = r1.d(0x7F1201A4, new Object[0]);  // string:forgot_your_pin "Forgot your secret code?"
        String s6 = r1.d(v3, new Object[0]);
        String s7 = r1.d(0x7F120091, new Object[0]);  // string:cancel "Cancel"
        String s8 = r1.d(0x7F12007B, new Object[0]);  // string:call "Call"
        r20.b0 = c2;
        r20.c0 = country3;
        r20.d0 = r63;
        r20.e0 = h04;
        r20.f0 = a3;
        r20.g0 = s4;
        r20.j0 = 2;
        Object object4 = Pb.a.O(((d)object2), s5, s6, s8, s7, false, null, null, r20, 488);
        if(object4 == object1) {
            return object1;
        }
        c4 = c2;
        country1 = country3;
        h02 = h04;
        object0 = object4;
        r61 = r63;
        s2 = s4;
        a1 = a3;
    label_88:
        if(s2 == null) {
            s2 = "";
        }
        a1.a("click call Wave to reset code button", new k[]{new k("screenName", s2)});
        if(((Integer)object0) == null || ((int)(((Integer)object0))) != -1) {
            return Boolean.FALSE;
        }
        Map map0 = N.a;
        Object object5 = map0.get(h02);
        if(object5 == null) {
            object5 = new AtomicInteger(0);
            map0.put(h02, object5);
        }
        atomicInteger0 = (AtomicInteger)object5;
        do {
            b00 = (B0)h02;
            Object object6 = b00.getValue();
            ((Boolean)object6).getClass();
        }
        while(!b00.j(object6, Boolean.valueOf(atomicInteger0.incrementAndGet() > 0)));
        try {
            r20.b0 = c4;
            r20.c0 = b00;
            r20.d0 = atomicInteger0;
            r20.e0 = null;
            r20.f0 = null;
            r20.g0 = null;
            r20.j0 = 3;
            object7 = o0.C(country1, r61, r20);
        }
        catch(Throwable throwable0) {
            h01 = b00;
            goto label_122;
        }
        if(object7 == object1) {
            return object1;
        }
        h01 = b00;
        object0 = object7;
        try {
            s9 = (String)object0;
            goto label_126;
        }
        catch(Throwable throwable0) {
        }
        do {
        label_122:
            Object object8 = ((B0)h01).getValue();
            ((Boolean)object8).getClass();
        }
        while(!((B0)h01).j(object8, Boolean.valueOf(atomicInteger0.decrementAndGet() > 0)));
        throw throwable0;
        do {
        label_126:
            Object object9 = ((B0)h01).getValue();
            ((Boolean)object9).getClass();
        }
        while(!((B0)h01).j(object9, Boolean.valueOf(atomicInteger0.decrementAndGet() > 0)));
        r20.b0 = s9;
        r20.c0 = null;
        r20.d0 = null;
        r20.j0 = 4;
        Object object10 = c4.e(r20);
        if(object10 == object1) {
            return object1;
        }
        object0 = object10;
        s1 = s9;
        ((d)object0).F(s1);
        return Boolean.TRUE;
    }

    public static final Object M(V8.c c0, int v, Country country0, R6 r60, B0 b00, E9.a a0, Function2 function20, Function1 function10, String s, String s1, Function1 function11, Function1 function12, boolean z, c c1) {
        V8 v80;
        Object object2;
        V8.c c2;
        Country country1;
        R6 r61;
        B0 b02;
        E9.a a1;
        String s2;
        Function1 function13;
        int v2;
        Function2 function22;
        R6 r63;
        E9.a a3;
        Object object3;
        V8.c c3;
        Country country2;
        B0 b03;
        Function1 function15;
        String s3;
        Function1 function14;
        AtomicInteger atomicInteger0;
        int v3;
        boolean z1;
        s2 s20;
        B0 b01 = b00;
        if(c1 instanceof s2) {
            s20 = (s2)c1;
            int v1 = s20.o0;
            if((v1 & 0x80000000) == 0) {
                s20 = new s2(c1);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
            }
            else {
                s20.o0 = v1 ^ 0x80000000;
            }
        }
        else {
            s20 = new s2(c1);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
        }
        Object object0 = s20.n0;
        Object object1 = a.X;
        switch(s20.o0) {
            case 0: {
                f.b0(object0);
                Map map0 = N.a;
                Object object4 = map0.get(b01);
                if(object4 == null) {
                    object4 = m5.b.E(0, map0, b01);
                }
                atomicInteger0 = (AtomicInteger)object4;
                do {
                    Object object5 = b00.getValue();
                    ((Boolean)object5).getClass();
                }
                while(!b01.j(object5, Boolean.valueOf(atomicInteger0.incrementAndGet() > 0)));
                try {
                    s20.b0 = c0;
                    s20.c0 = country0;
                    r63 = r60;
                    s20.d0 = r63;
                    s20.e0 = b01;
                    s20.f0 = a0;
                    function22 = function20;
                    s20.g0 = function22;
                    s20.h0 = function10;
                    s20.i0 = s;
                    function14 = function11;
                    s20.j0 = function14;
                    s20.k0 = atomicInteger0;
                    s20.l0 = v;
                    s20.m0 = z;
                    s20.o0 = 1;
                    object3 = H.c(new u2(r60, country0, s1, null, function12), s20);
                }
                catch(Throwable throwable0) {
                    goto label_90;
                }
                if(object3 == object1) {
                    return object1;
                }
                c3 = c0;
                a3 = a0;
                b03 = b01;
                z1 = z;
                function15 = function10;
                country2 = country0;
                v3 = v;
                s3 = s;
                break;
            }
            case 1: {
                z1 = s20.m0;
                v3 = s20.l0;
                atomicInteger0 = s20.k0;
                function14 = s20.j0;
                s3 = s20.i0;
                function15 = s20.h0;
                Function2 function21 = (Function2)s20.g0;
                E9.a a2 = s20.f0;
                b03 = s20.e0;
                R6 r62 = s20.d0;
                country2 = s20.c0;
                c3 = s20.b0;
                try {
                    f.b0(object0);
                    object3 = object0;
                    a3 = a2;
                    r63 = r62;
                    function22 = function21;
                    break;
                }
                catch(Throwable throwable0) {
                    goto label_89;
                }
            }
            case 2: {
                v2 = s20.l0;
                function13 = s20.h0;
                s2 = (String)s20.g0;
                a1 = s20.f0;
                b02 = s20.e0;
                r61 = s20.d0;
                country1 = s20.c0;
                c2 = s20.b0;
                f.b0(object0);
                object2 = object1;
                goto label_140;
            }
            case 3: {
                f.b0(object0);
                return Boolean.TRUE;
            }
            case 4: {
                f.b0(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            v80 = (V8)object3;
            goto label_94;
        }
        catch(Throwable throwable0) {
        label_89:
            b01 = b03;
        }
        do {
        label_90:
            Object object6 = b01.getValue();
            ((Boolean)object6).getClass();
        }
        while(!b01.j(object6, Boolean.valueOf(atomicInteger0.decrementAndGet() > 0)));
        throw throwable0;
        while(true) {
        label_94:
            Object object7 = b03.getValue();
            ((Boolean)object7).getClass();
            if(b03.j(object7, Boolean.valueOf(atomicInteger0.decrementAndGet() > 0))) {
                break;
            }
            atomicInteger0 = atomicInteger0;
        }
        if(v80 == null) {
            object2 = object1;
            a1 = a3;
            s2 = s3;
        }
        else {
            W8 w80 = v80.a;
            ArrayList arrayList0 = new ArrayList();
            Iterator iterator0 = w80.d.a.iterator();
            while(iterator0.hasNext()) {
                Object object8 = iterator0.next();
                if(((Boolean)function22.j(((T7)object8).e, ((T7)object8).f.a)).booleanValue()) {
                    arrayList0.add(object8);
                }
                iterator0 = iterator0;
                v3 = v3;
                function14 = function14;
            }
            if(!arrayList0.isEmpty()) {
                function15.n(v80);
                return Boolean.TRUE;
            }
            t9.a a4 = Bb.q.l(country2.t0, w80.e.a, z1);
            s20.b0 = c3;
            s20.c0 = country2;
            s20.d0 = r63;
            s20.e0 = b03;
            s20.f0 = a3;
            s20.g0 = s3;
            s20.h0 = function14;
            s20.i0 = null;
            s20.j0 = null;
            s20.k0 = null;
            s20.l0 = v3;
            s20.o0 = 2;
            Object object9 = F.M(c3, a4, 0x7F1201A4, 0x7F120349, s20);  // string:forgot_your_pin "Forgot your secret code?"
            object2 = object1;
            if(object9 == object2) {
                return object2;
            }
            a1 = a3;
            object0 = object9;
            v2 = v3;
            r61 = r63;
            function13 = function14;
            s2 = s3;
            c2 = c3;
            country1 = country2;
            b02 = b03;
        label_140:
            if(((Boolean)object0).booleanValue()) {
                return Boolean.TRUE;
            }
            b03 = b02;
            r63 = r61;
            country2 = country1;
            c3 = c2;
            function14 = function13;
            v3 = v2;
        }
        if(function14 != null) {
            s20.b0 = null;
            s20.c0 = null;
            s20.d0 = null;
            s20.e0 = null;
            s20.f0 = null;
            s20.g0 = null;
            s20.h0 = null;
            s20.i0 = null;
            s20.j0 = null;
            s20.k0 = null;
            s20.o0 = 3;
            return function14.n(s20) == object2 ? object2 : Boolean.TRUE;
        }
        s20.b0 = null;
        s20.c0 = null;
        s20.d0 = null;
        s20.e0 = null;
        s20.f0 = null;
        s20.g0 = null;
        s20.h0 = null;
        s20.i0 = null;
        s20.j0 = null;
        s20.k0 = null;
        s20.o0 = 4;
        object0 = o0.L(c3, v3, country2, r63, b03, a1, s2, s20);
        return object0 == object2 ? object2 : object0;
    }

    public static Object N(V8.c c0, Country country0, R6 r60, B0 b00, E9.a a0, Function2 function20, Function1 function10, String s, String s1, Function1 function11, Function1 function12, boolean z, Fb.j j0, int v) {
        String s2 = (v & 0x100) == 0 ? s1 : null;
        Function1 function13 = (v & 0x200) == 0 ? function11 : null;
        return (v & 0x400) == 0 ? o0.M(c0, 0x7F12008D, country0, r60, b00, a0, function20, function10, s, s2, function13, function12, z, j0) : o0.M(c0, 0x7F12008D, country0, r60, b00, a0, function20, function10, s, s2, function13, null, z, j0);  // string:call_wave_support_to_reset "Call Wave support to reset your secret code."
    }

    public static void O(s1 s10, e e0, Object object0) {
        j.f(e0, "key");
        if(e0 instanceof u1) {
            j.d(object0, "null cannot be cast to non-null type kotlin.Boolean");
            s10.putBoolean(((u1)e0).a, ((Boolean)object0).booleanValue());
            return;
        }
        if(e0 instanceof v1) {
            j.d(object0, "null cannot be cast to non-null type kotlin.Int");
            s10.putInt(((v1)e0).a, ((int)(((Integer)object0))));
            return;
        }
        if(e0 instanceof w1) {
            j.d(object0, "null cannot be cast to non-null type kotlin.Long");
            s10.putLong(((w1)e0).a, ((long)(((Long)object0))));
            return;
        }
        if(e0 instanceof x1) {
            s10.putString(((x1)e0).a, ((String)object0));
            return;
        }
        if(!(e0 instanceof y1)) {
            throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
        }
        s10.putStringSet(((y1)e0).a, ((Set)object0));
    }

    public static void P(R6 r60, String s, PartnerOrg partnerOrg0) {
        j.f(r60, "repo");
        j.f(s, "walletId");
        j.f(partnerOrg0, "partnerOrg");
        mb.a.a(null, null, new W2(s, partnerOrg0, r60, null, null), 3);
    }

    public static final g Q(k3 k30, Function2 function20) {
        return (g)k30.v(new I(4), new c3(0, function20));
    }

    public static final r0 R(LifecycleOwner lifecycleOwner0, Function2 function20) {
        j.f(lifecycleOwner0, "<this>");
        return Xb.J.q(LifecycleOwnerKt.a(lifecycleOwner0), null, null, new J0(lifecycleOwner0, function20, null), 3);
    }

    public static final void S(O o0, String s, PartnerOrg partnerOrg0) {
        if(!(o0 instanceof T)) {
            hb.n.b(new Exception(s, o0), i1.ERROR, F.J(new k("Partner org", partnerOrg0.toString())), 8);
        }
    }

    public static final void T(Activity activity0, Parcelable parcelable0, boolean z) {
        j.f(activity0, "<this>");
        Intent intent0 = new Intent();
        intent0.putExtra("com.wave.typeSafeExtras", parcelable0);
        Parcelable parcelable1 = activity0.getIntent().getParcelableExtra("com.wave.workflowState");
        if(parcelable1 != null) {
            intent0.putExtra("com.wave.workflowState", parcelable1);
        }
        activity0.setResult(-1, intent0);
        if(z) {
            activity0.finish();
        }
    }

    public static void U(z3 z30, c0.b b0) {
        j.f(z30, "<this>");
        c0.b b1 = new c0.b(1708823966, new q9.r0(b0), true);
        View view0 = ((ViewGroup)z30.getWindow().getDecorView().findViewById(0x1020002)).getChildAt(0);
        e0 e00 = view0 instanceof e0 ? ((e0)view0) : null;
        if(e00 != null) {
            e00.setParentCompositionContext(null);
            e00.setContent(b1);
            return;
        }
        e0 e01 = new e0(z30);
        e01.setParentCompositionContext(null);
        e01.setContent(b1);
        View view1 = z30.getWindow().getDecorView();
        if(ViewTreeLifecycleOwner.a(view1) == null) {
            ViewTreeLifecycleOwner.b(view1, z30);
        }
        if(ViewTreeViewModelStoreOwner.a(view1) == null) {
            ViewTreeViewModelStoreOwner.b(view1, z30);
        }
        if(f.C(view1) == null) {
            f.U(view1, z30);
        }
        z30.setContentView(e01, d.b.a);
    }

    public static i0 V(ac.h h0, CloseableCoroutineScope closeableCoroutineScope0) {
        return ac.o0.B(h0, closeableCoroutineScope0, ac.r0.a(2, 5000L), 1);
    }

    public static i0 W(ViewModel viewModel0, ac.h h0, t0 t00, int v) {
        if((v & 4) != 0) {
            t00 = ac.r0.a(2, 5000L);
        }
        j.f(t00, "started");
        return ac.o0.B(h0, ViewModelKt.a(viewModel0), t00, 1);
    }

    public static final Object X(i.f f0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, Function1 function10, c c0) {
        kotlin.coroutines.k k0 = new kotlin.coroutines.k(N4.j.w(c0));
        V0 v00 = new V0(k0);
        w w0 = new w();  // initializer: Ljava/lang/Object;-><init>()V
        Aa.t t0 = new Aa.t(v00, 15, w0);
        if(charSequence0 != null) {
            f0.d(charSequence0, new F0(0, t0));
        }
        if(charSequence1 != null) {
            f0.b(charSequence1, new F0(0, t0));
        }
        if(charSequence2 != null) {
            F0 f00 = new F0(0, t0);
            f0.a.k = charSequence2;
            f0.a.l = f00;
        }
        f0.c(new G0(v00, w0));
        i.g g0 = f0.a();
        w0.X = g0;
        g0.show();
        Object object0 = w0.X;
        if(object0 != null) {
            function10.n(((i.g)object0));
            return k0.c();
        }
        j.p("dialog");
        throw null;
    }

    public static Object Y(i.f f0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, r r0, c c0, int v) {
        if((v & 8) != 0) {
            r0 = new lb.j(7);
        }
        return o0.X(f0, charSequence0, ((v & 2) == 0 ? charSequence1 : null), ((v & 4) == 0 ? charSequence2 : null), r0, c0);
    }

    public static final Object Z(Activity activity0, Function1 function10, c c0) {
        Object object0 = activity0.getSystemService("input_method");
        j.d(object0, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager)object0).hideSoftInputFromWindow(activity0.getWindow().getDecorView().getWindowToken(), 0);
        kotlin.coroutines.k k0 = new kotlin.coroutines.k(N4.j.w(c0));
        V0 v00 = new V0(k0);
        u6.e e0 = new u6.e(activity0, 0x7F1301EB);  // style:Theme.App.BottomSheetDialog
        e0.setOnDismissListener(new E0(v00, e0, 0));
        function10.n(new u0(e0, new W8.b(v00, e0)));
        e0.show();
        return k0.c();
    }

    public static final j0 a(Object object0) {
        return new j0(ac.o0.c(object0));
    }

    public static final void a0(k3 k30, View view0, View view1) {
        new q1(k30, new r(view0, 17, view1));
    }

    public static final void b(Xb.j j0, Object object0) {
        if(j0.b()) {
            j0.i(object0);
        }
    }

    public static j0 b0(SubViewModel subViewModel0, ac.h h0, Object object0) {
        y0 y00 = ac.r0.a(2, 5000L);
        j.f(h0, "<this>");
        j.f(subViewModel0, "$context_receiver_0");
        return ac.o0.D(h0, ViewModelKt.a(subViewModel0.X), y00, object0);
    }

    public static final ac.e0 c(ac.h h0, ac.h h1) {
        j.f(h0, "<this>");
        j.f(h1, "other");
        return new ac.e0(h0, h1, new I1(3, null, 1), 0);
    }

    public static final j0 c0(ViewModel viewModel0, ac.h h0, Object object0, s0 s00) {
        j.f(viewModel0, "$context_receiver_0");
        j.f(s00, "started");
        return ac.o0.D(h0, ViewModelKt.a(viewModel0), s00, object0);
    }

    public static final Object d(x x0, Class class0, Parcelable parcelable0, Class class1, kotlin.coroutines.g g0) {
        x x1;
        Object object3;
        LauncherFragment launcherFragment1;
        Object object2;
        d3 d30;
        if(g0 instanceof d3) {
            d30 = (d3)g0;
            int v = d30.e0;
            if((v & 0x80000000) == 0) {
                d30 = new d3(g0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
            }
            else {
                d30.e0 = v ^ 0x80000000;
            }
        }
        else {
            d30 = new d3(g0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
        }
        Object object0 = d30.d0;
        Object object1 = a.X;
        Parcelable parcelable1 = null;
        switch(d30.e0) {
            case 0: {
                f.b0(object0);
                LauncherFragment launcherFragment0 = new LauncherFragment();
                c2.N n0 = x0.w();
                n0.getClass();
                c2.a a0 = new c2.a(n0);
                a0.h(0, launcherFragment0, null, 1);
                a0.g();
                Intent intent0 = new Intent(x0, class0);
                intent0.putExtra("com.wave.typeSafeExtras", parcelable0);
                launcherFragment0.Y0.a(intent0);
                try {
                    d30.b0 = class1;
                    d30.c0 = launcherFragment0;
                    d30.e0 = 1;
                    kotlin.coroutines.k k0 = new kotlin.coroutines.k(N4.j.w(d30));
                    launcherFragment0.X0 = k0;
                    object2 = k0.c();
                }
                catch(Throwable throwable0) {
                    launcherFragment1 = launcherFragment0;
                    goto label_59;
                }
                if(object2 == object1) {
                    return object1;
                }
                object0 = object2;
                launcherFragment1 = launcherFragment0;
                goto label_42;
            }
            case 1: {
                try {
                    launcherFragment1 = d30.c0;
                    class1 = d30.b0;
                    f.b0(object0);
                label_42:
                    int v1 = ((Number)((k)object0).X).intValue();
                    Intent intent1 = (Intent)((k)object0).Y;
                    switch(v1) {
                        case -1: {
                            goto label_46;
                        }
                        case 0: {
                            throw new q9.a();
                        }
                    }
                    throw new AssertionError("Typed activity call() invocation (expecting a " + class1 + ") should only ever finish with RESULT_OK or RESULT_CANCELED, got " + v1);
                label_46:
                    if(intent1 != null) {
                        parcelable1 = intent1.getParcelableExtra("com.wave.typeSafeExtras");
                    }
                    object3 = class1.cast(parcelable1);
                    x1 = launcherFragment1.j();
                    if(x1 != null) {
                        break;
                    }
                    return object3;
                }
                catch(Throwable throwable0) {
                    goto label_59;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        c2.N n1 = x1.w();
        if(n1 != null) {
            c2.a a1 = new c2.a(n1);
            a1.j(launcherFragment1);
            a1.f(true, true);
        }
        return object3;
        try {
            throw new q9.a();
        }
        catch(Throwable throwable0) {
        }
    label_59:
        x x2 = launcherFragment1.j();
        if(x2 != null) {
            c2.N n2 = x2.w();
            if(n2 != null) {
                c2.a a2 = new c2.a(n2);
                a2.j(launcherFragment1);
                a2.f(true, true);
            }
        }
        throw throwable0;
    }

    public static j0 d0(ViewModel viewModel0, ac.h h0, Object object0) {
        return o0.c0(viewModel0, h0, object0, ac.r0.a(2, 5000L));
    }

    public static final void e(ac.h h0, LifecycleOwner lifecycleOwner0, i i0) {
        j.f(h0, "<this>");
        j.f(lifecycleOwner0, "lifecycleOwner");
        o0.R(lifecycleOwner0, new H0(h0, i0, null));
    }

    public static final String e0(long v) {
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(6);
        for(int v1 = 0; v1 < 6; ++v1) {
            byteBuffer0.put(q0.e[((int)(v % 0x40L))]);
            v /= 0x40L;
        }
        byte[] arr_b = byteBuffer0.array();
        j.e(arr_b, "array(...)");
        StringBuilder stringBuilder0 = new StringBuilder(new String(arr_b, Vb.a.a)).reverse();
        j.e(stringBuilder0, "reverse(...)");
        return stringBuilder0.toString();
    }

    public static final ac.e f(ArrayList arrayList0) {
        return new ac.e(new a1(arrayList0, null), kotlin.coroutines.j.X, -2, Zb.a.X);
    }

    public static final U2 g(PartnerOrg partnerOrg0, String s) {
        j.f(partnerOrg0, "partnerOrg");
        o2 o20 = o0.v(partnerOrg0);
        if(o20 == null) {
            hb.n.d("Requested to show T&C for a null partner org, will show given terms and no bank logo.", i1.ERROR, null, false, 12);
            return new U2(null, s);
        }
        return new U2(((int)o20.a), s);
    }

    public static byte[] h(int v, String s) {
        byte[] arr_b = s.getBytes();
        int v1 = arr_b.length * 3 / 4;
        byte[] arr_b1 = new byte[v1];
        int[] arr_v = q0.c;
        int v3 = 0;
        int v4 = 0;
        int v5 = 0;
        for(int v2 = 0; v2 < arr_b.length; ++v2) {
            if(v3 == 0) {
                while(v2 + 4 <= arr_b.length) {
                    v4 = arr_v[arr_b[v2] & 0xFF] << 18 | arr_v[arr_b[v2 + 1] & 0xFF] << 12 | arr_v[arr_b[v2 + 2] & 0xFF] << 6 | arr_v[arr_b[v2 + 3] & 0xFF];
                    if(v4 < 0) {
                        break;
                    }
                    arr_b1[v5 + 2] = (byte)v4;
                    arr_b1[v5 + 1] = (byte)(v4 >> 8);
                    arr_b1[v5] = (byte)(v4 >> 16);
                    v5 += 3;
                    v2 += 4;
                }
                if(v2 >= arr_b.length) {
                    break;
                }
            }
            int v6 = arr_v[arr_b[v2] & 0xFF];
            switch(v3) {
                case 0: {
                    if(v6 < 0) {
                        if(v6 != -1) {
                            throw new IllegalArgumentException("bad base-64");
                        }
                        break;
                    }
                    ++v3;
                    v4 = v6;
                    break;
                }
                case 1: {
                    if(v6 < 0) {
                        if(v6 != -1) {
                            throw new IllegalArgumentException("bad base-64");
                        }
                        break;
                    }
                    else {
                        v6 |= v4 << 6;
                    }
                    ++v3;
                    v4 = v6;
                    break;
                }
                default: {
                    if(v3 != 2) {
                        switch(v3) {
                            case 3: {
                                if(v6 >= 0) {
                                    v6 |= v4 << 6;
                                    arr_b1[v5 + 2] = (byte)v6;
                                    arr_b1[v5 + 1] = (byte)(v6 >> 8);
                                    arr_b1[v5] = (byte)(v6 >> 16);
                                    v5 += 3;
                                    v3 = 0;
                                    v4 = v6;
                                }
                                else if(v6 == -2) {
                                    arr_b1[v5 + 1] = (byte)(v4 >> 2);
                                    arr_b1[v5] = (byte)(v4 >> 10);
                                    v5 += 2;
                                    v3 = 5;
                                }
                                else if(v6 != -1) {
                                    throw new IllegalArgumentException("bad base-64");
                                }
                                break;
                            }
                            case 4: {
                                if(v6 == -2) {
                                    v3 = 5;
                                }
                                else if(v6 != -1) {
                                    throw new IllegalArgumentException("bad base-64");
                                }
                                break;
                            }
                            case 5: {
                                if(v6 != -1) {
                                    throw new IllegalArgumentException("bad base-64");
                                }
                            }
                        }
                    }
                    else if(v6 < 0) {
                        switch(v6) {
                            case -2: {
                                arr_b1[v5] = (byte)(v4 >> 4);
                                v3 = 4;
                                ++v5;
                                break;
                            }
                            case -1: {
                                break;
                            }
                            default: {
                                throw new IllegalArgumentException("bad base-64");
                            }
                        }
                    }
                    else {
                        v6 |= v4 << 6;
                        ++v3;
                        v4 = v6;
                        break;
                    }
                }
            }
        }
        switch(v3) {
            case 2: {
                arr_b1[v5] = (byte)(v4 >> 4);
                ++v5;
                break;
            }
            case 3: {
                int v7 = v5 + 1;
                arr_b1[v5] = (byte)(v4 >> 10);
                v5 += 2;
                arr_b1[v7] = (byte)(v4 >> 2);
                break;
            }
            case 1: 
            case 4: {
                throw new IllegalArgumentException("bad base-64");
            }
        }
        if(v5 != v1) {
            byte[] arr_b2 = new byte[v5];
            System.arraycopy(arr_b1, 0, arr_b2, 0, v5);
            return arr_b2;
        }
        return arr_b1;
    }

    public static byte[] i(int v, byte[] arr_b) {
        int v1 = 0;
        boolean z = (v & 2) == 0;
        byte[] arr_b1 = (v & 8) == 0 ? q0.d : q0.e;
        int v2 = arr_b.length % 3 <= 0 ? arr_b.length / 3 * 4 : arr_b.length / 3 * 4 + 4;
        if(z && arr_b.length > 0) {
            v2 += (arr_b.length - 1) / 57 + 1;
        }
        byte[] arr_b2 = new byte[v2];
        int v3 = z ? 19 : -1;
        int v4 = 0;
        while(v1 + 3 <= arr_b.length) {
            int v5 = arr_b[v1 + 2] & 0xFF | ((arr_b[v1] & 0xFF) << 16 | (arr_b[v1 + 1] & 0xFF) << 8);
            arr_b2[v4] = arr_b1[v5 >> 18 & 0x3F];
            arr_b2[v4 + 1] = arr_b1[v5 >> 12 & 0x3F];
            arr_b2[v4 + 2] = arr_b1[v5 >> 6 & 0x3F];
            arr_b2[v4 + 3] = arr_b1[v5 & 0x3F];
            int v6 = v4 + 4;
            --v3;
            if(v3 == 0) {
                v4 += 5;
                arr_b2[v6] = 10;
                v3 = 19;
            }
            else {
                v4 = v6;
            }
            v1 += 3;
        }
        if(v1 == arr_b.length - 1) {
            int v7 = (arr_b[v1] & 0xFF) << 4;
            arr_b2[v4] = arr_b1[v7 >> 6 & 0x3F];
            arr_b2[v4 + 1] = arr_b1[v7 & 0x3F];
            arr_b2[v4 + 2] = 61;
            arr_b2[v4 + 3] = 61;
            if(z) {
                arr_b2[v4 + 4] = 10;
                return arr_b2;
            }
        }
        else if(v1 == arr_b.length - 2) {
            int v8 = (arr_b[v1 + 1] & 0xFF) << 2 | (arr_b[v1] & 0xFF) << 10;
            arr_b2[v4] = arr_b1[v8 >> 12 & 0x3F];
            arr_b2[v4 + 1] = arr_b1[v8 >> 6 & 0x3F];
            arr_b2[v4 + 2] = arr_b1[v8 & 0x3F];
            arr_b2[v4 + 3] = 61;
            if(z) {
                arr_b2[v4 + 4] = 10;
                return arr_b2;
            }
        }
        else if(z && v4 > 0 && v3 != 19) {
            arr_b2[v4] = 10;
        }
        return arr_b2;
    }

    public static String j(String s) {
        j.f(s, "str");
        Object object0 = v2.d.getValue();
        j.e(object0, "getValue(...)");
        byte[] arr_b = s.getBytes(Vb.a.a);
        j.e(arr_b, "getBytes(...)");
        byte[] arr_b1 = Arrays.copyOf(v2.c, 0x20 + arr_b.length);
        System.arraycopy(arr_b, 0, arr_b1, 0x20, arr_b.length);
        j.c(arr_b1);
        byte[] arr_b2 = ((MessageDigest)object0).digest(arr_b1);
        j.e(arr_b2, "digest(...)");
        return Z6.b.z(arr_b2);
    }

    public static String k(int v, byte[] arr_b) {
        try {
            return new String(o0.i(v, arr_b), "US-ASCII");
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new AssertionError(unsupportedEncodingException0);
        }
    }

    public static final ac.e0 l(B0 b00, z0 z00, int v) {
        j.f(b00, "focus");
        j.f(z00, "value");
        Nb.s s0 = new Nb.s();  // initializer: Ljava/lang/Object;-><init>()V
        return new ac.e0(new c1(b00, new Nb.s(), new Nb.s(), v, 0), z00, new K9.g(s0, null, 2), 0);  // initializer: Ljava/lang/Object;-><init>()V / initializer: Ljava/lang/Object;-><init>()V
    }

    public static final Object m(R6 r60, PartnerOrg partnerOrg0, H6 h60, c c0) {
        V2 v20;
        if(c0 instanceof V2) {
            v20 = (V2)c0;
            int v = v20.d0;
            if((v & 0x80000000) == 0) {
                v20 = new V2(c0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
            }
            else {
                v20.d0 = v ^ 0x80000000;
            }
        }
        else {
            v20 = new V2(c0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
        }
        Object object0 = v20.c0;
        Object object1 = a.X;
        switch(v20.d0) {
            case 0: {
                f.b0(object0);
                try {
                    a9 a90 = new a9(partnerOrg0);
                    v20.b0 = partnerOrg0;
                    v20.d0 = 1;
                    object0 = R6.d(r60, a90, h60, null, v20, 4);
                    if(object0 == object1) {
                        return object1;
                    label_20:
                        partnerOrg0 = v20.b0;
                        f.b0(object0);
                    }
                    return ((Y8)((y6)object0).b).a;
                }
                catch(O o0) {
                    break;
                }
            }
            case 1: {
                goto label_20;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        o0.S(o0, "Error when trying to retrieve Terms & Conditions for bank partner.", partnerOrg0);
        if(!(o0 instanceof Z)) {
            throw o0;
        }
        return null;
    }

    public static final String n(String s) {
        j.f(s, "<this>");
        StringBuilder stringBuilder0 = new StringBuilder();
        int v = s.length();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = s.charAt(v1);
            if(Character.isDigit(((char)v2))) {
                stringBuilder0.append(((char)v2));
            }
        }
        String s1 = stringBuilder0.toString();
        j.e(s1, "toString(...)");
        return s1;
    }

    public static final N2.l o(ac.h h0) {
        return new N2.l(new K(h0, new R9.m(3, null, 8), null));
    }

    public static R2.m p(a9.d d0) {
        ArrayList arrayList0 = null;
        if(d0 == null) {
            return null;
        }
        List list0 = d0.d;
        if(list0 != null) {
            arrayList0 = new ArrayList(Bb.r.b0(list0));
            for(Object object0: list0) {
                String s = ((a9.a)object0).a;
                String s1 = ((a9.a)object0).b;
                a9.i i0 = ((a9.a)object0).c;
                if(i0 != null) {
                    s1 = s1 + "?message=" + URLEncoder.encode(i0.a) + "&baseUrl=" + URLEncoder.encode(i0.b);
                }
                arrayList0.add(new AnnouncementAction(s, s1));
            }
        }
        if(arrayList0 == null) {
            arrayList0 = z.X;
        }
        return new R2.m(d0.a, d0.b, d0.c, arrayList0);
    }

    public static long q(z1 z10, w1 w10) {
        j.f(w10, "key");
        return z10.f(w10.b, w10.a);
    }

    public static final R6 r(ParcelableSingleton parcelableSingleton0, Context context0) {
        j.f(parcelableSingleton0, "<this>");
        j.f(context0, "ctx");
        return (R6)((Function1)parcelableSingleton0.X).n(context0);
    }

    public static final String s(PartnerOrg partnerOrg0) {
        j.f(partnerOrg0, "<this>");
        o2 o20 = o0.v(partnerOrg0);
        if(o20 != null) {
            return o20.b == null ? partnerOrg0.getClass().getSimpleName() : o20.b;
        }
        return partnerOrg0.getClass().getSimpleName();
    }

    public static File t(C3 c30, String s) {
        File file0 = c30.getExternalFilesDir(null);
        if(file0 == null || !file0.isDirectory()) {
            throw new RuntimeException("No external storage available");
        }
        File file1 = new File(file0, s);
        if(!file1.isDirectory() && !file1.mkdirs()) {
            throw new RuntimeException("Could not create directory: " + file1);
        }
        return file1;
    }

    public static String u(Context context0) {
        j.f(context0, "ctx");
        m m0 = new m(context0, "DEVICE_UUID");
        x1 x10 = o0.b;
        String s = m0.a(x10);
        if(s == null) {
            s = Settings.Secure.getString(context0.getContentResolver(), "android_id");
            l l0 = new l(m0);
            o0.O(l0, x10, s);
            l0.apply();
        }
        return s;
    }

    public static final o2 v(PartnerOrg partnerOrg0) {
        j.f(partnerOrg0, "<this>");
        if(partnerOrg0 instanceof SN_UBA) {
            return new o2(0x7F0802D7, 0x7F0802AC, "UBA");  // drawable:logo_uba
        }
        if(partnerOrg0 instanceof SN_WDF) {
            return new o2(0x7F0802D8, 0x7F0802B0, "Wave Digital Finance");  // drawable:logo_wave_digital_finance
        }
        if(partnerOrg0 instanceof CI_UBA) {
            return new o2(0x7F0802D7, 0x7F0802AC, "UBA");  // drawable:logo_uba
        }
        if(partnerOrg0 instanceof SN_ECOBANK) {
            return new o2(0x7F0802C6, 0x7F08022C, "Ecobank");  // drawable:logo_ecobank
        }
        if(partnerOrg0 instanceof UG_EQUITYBANK) {
            return new o2(0x7F0802C4, 0x7F0802C4, "Equity Bank");  // drawable:logo_blank
        }
        if(partnerOrg0 instanceof ML_UBA) {
            return new o2(0x7F0802D7, 0x7F0802AC, "UBA");  // drawable:logo_uba
        }
        if(partnerOrg0 instanceof CI_ORABANK) {
            return new o2(0x7F0802CE, 0x7F080267, "Orabank");  // drawable:logo_orabank
        }
        if(partnerOrg0 instanceof ML_ORABANK) {
            return new o2(0x7F0802CE, 0x7F080267, "Orabank");  // drawable:logo_orabank
        }
        if(partnerOrg0 instanceof BF_UBA) {
            return new o2(0x7F0802D7, 0x7F0802AC, "UBA");  // drawable:logo_uba
        }
        if(partnerOrg0 instanceof BF_ORABANK) {
            return new o2(0x7F0802CE, 0x7F080267, "Orabank");  // drawable:logo_orabank
        }
        if(partnerOrg0 instanceof BJ_UBA) {
            return new o2(0x7F0802D7, 0x7F0802AC, "UBA");  // drawable:logo_uba
        }
        if(partnerOrg0 instanceof BJ_ORABANK) {
            return new o2(0x7F0802CE, 0x7F080267, "Orabank");  // drawable:logo_orabank
        }
        if(partnerOrg0 instanceof GM_MEGABANK) {
            return new o2(0x7F0802CA, 0x7F080257, "MegaBank");  // drawable:logo_megabank
        }
        if(partnerOrg0 instanceof GM_ACCESSBANK) {
            return new o2(0x7F0802C1, 0x7F0801C6, "Access Bank");  // drawable:logo_accessbank
        }
        if(partnerOrg0 instanceof CM_CBC) {
            return new o2(0x7F0802C4, 0x7F0802C4, "CBC");  // drawable:logo_blank
        }
        if(partnerOrg0 instanceof GN_WAVE) {
            return new o2(0x7F0802C4, 0x7F0802C4, "Wave");  // drawable:logo_blank
        }
        if(partnerOrg0 instanceof GM_WTL) {
            return new o2(0x7F0802C4, 0x7F0802C4, "Wave Transfer Limited");  // drawable:logo_blank
        }
        if(partnerOrg0 instanceof SL_WTL) {
            return new o2(0x7F0802C4, 0x7F0802C4, "Wave Transfer SL Limited");  // drawable:logo_blank
        }
        if(partnerOrg0 instanceof NE_ECOBANK) {
            return new o2(0x7F0802C6, 0x7F08022C, "Ecobank");  // drawable:logo_ecobank
        }
        if(partnerOrg0 instanceof NE_BIA) {
            return new o2(0x7F0802C4, 0x7F0802C4, "BIA");  // drawable:logo_blank
        }
        if(!(partnerOrg0 instanceof TG_ORABANK) && !(partnerOrg0 instanceof NE_ORABANK) && !(partnerOrg0 instanceof ET_SMFI) && !(partnerOrg0 instanceof CI_ECOBANK) && !(partnerOrg0 instanceof QQ_FAKEBANK) && !(partnerOrg0 instanceof QQ_DUMMYEMI) && !(partnerOrg0 instanceof LEGACY_UNKNOWN__) && !(partnerOrg0 instanceof UNKNOWN__)) {
            throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
        }
        return null;
    }

    public static String w(Context context0) {
        int v1;
        int v = Build.VERSION.SDK_INT;
        if(v >= 33) {
            v1 = o0.D(context0).getDataNetworkType();
        }
        else if(w1.c.a(context0, "android.permission.READ_PHONE_STATE") != 0) {
            NetworkInfo networkInfo0 = ((ConnectivityManager)context0.getSystemService("connectivity")).getActiveNetworkInfo();
            if(networkInfo0 == null) {
                return "UNKNOWN";
            }
            v1 = networkInfo0.getSubtype();
        }
        else if(v >= 24) {
            v1 = o0.D(context0).getDataNetworkType();
        }
        else {
            v1 = o0.D(context0).getNetworkType();
        }
        switch(v1) {
            case 0: {
                return "UNKNOWN";
            }
            case 1: {
                return "GPRS";
            }
            case 2: {
                return "EDGE";
            }
            case 3: {
                return "UMTS";
            }
            case 4: {
                return "CDMA";
            }
            case 5: {
                return "EVDO_0";
            }
            case 6: {
                return "EVDO_A";
            }
            case 7: {
                return "1xRTT";
            }
            case 8: {
                return "HSDPA";
            }
            case 9: {
                return "HSUPA";
            }
            case 10: {
                return "HSPA";
            }
            case 11: {
                return "IDEN";
            }
            case 12: {
                return "EVDO_B";
            }
            case 14: {
                return "EHRPD";
            }
            case 15: {
                return "HSPAP";
            }
            case 16: {
                return "GSM";
            }
            case 17: {
                return "TD_SCDMA";
            }
            case 18: {
                return "IWLAN";
            }
            case 13: 
            case 19: {
                return "LTE";
            }
            case 20: {
                return "NR";
            }
            default: {
                return Integer.toString(v1);
            }
        }
    }

    // Deobfuscation rating: LOW(20)
    public static final String x(Country country0) {
        return country0.equals(L0.f) || country0.equals(L0.p) ? "0" : null;
    }

    public static final List y(Country country0) {
        if(country0.equals(L0.d)) {
            return Bb.q.L(new k2[]{new k2("(\\d{3})(\\d{2})(\\d{2})(\\d{2})", "8", "$1 $2 $3 $4"), new k2("(\\d{2})(\\d{3})(\\d{2})(\\d{2})", "[379]", "$1 $2 $3 $4")});
        }
        if(country0.equals(L0.e)) {
            return Bb.q.L(new k2[]{new k2("(\\d{2})(\\d{2})(\\d)(\\d{5})", "2", "$1 $2 $3 $4"), new k2("(\\d{2})(\\d{2})(\\d{2})(\\d{2})(\\d{2})", "[03-9]", "$1 $2 $3 $4 $5")});
        }
        if(country0.equals(L0.f)) {
            return Bb.q.L(new k2[]{new k2("(\\d{4})(\\d{5})", "202", "$1 $2"), new k2("(\\d{3})(\\d{2})(\\d{2})(\\d{2})", "800", "$1 $2 $3 $4"), new k2("(\\d{3})(\\d{3})(\\d{3})", "3[0-9]|[27-9]|4(?:6[45]|[7-9])", "$1 $2 $3"), new k2("(\\d{2})(\\d{7})", "[34]", "$1 $2")});
        }
        if(country0.equals(L0.h)) {
            return Bb.q.K(new k2("(\\d{2})(\\d{2})(\\d{2})(\\d{2})", "([5679][0-9])|(8[23459])", "$1 $2 $3 $4"));
        }
        if(country0.equals(L0.i)) {
            return Bb.q.K(new k2("(\\d{2})(\\d{2})(\\d{2})(\\d{2})", "(0[1234567])|(5[0-8]|6[0-9]|7[0-9])", "$1 $2 $3 $4"));
        }
        if(country0.equals(L0.j)) {
            return Bb.q.K(new k2("(\\d{2})(\\d{2})(\\d{2})(\\d{2})", "(0[1267]|5[12345678]|6[0-9]|7[0-9]|9[0-9])", "$1 $2 $3 $4"));
        }
        if(country0.equals(L0.l)) {
            return Bb.q.K(new k2("(\\d{3})(\\d{4})", "([123456789])", "$1 $2"));
        }
        if(country0.equals(L0.k)) {
            return Bb.q.K(new k2("(\\d{2})(\\d{2})(\\d{2})(\\d{2})", "(0[1267]|5[12345678]|6[0-9]|7[0-9])", "$1 $2 $3 $4"));
        }
        if(country0.equals(L0.n)) {
            return Bb.q.K(new k2("(\\d{3})(\\d{2})(\\d{2})(\\d{2})", "6", "$1 $2 $3 $4"));
        }
        if(country0.equals(L0.o)) {
            return Bb.q.K(new k2("(\\d{3})(\\d{2})(\\d{2})(\\d{2})", "6(1[012]|2[0-9]|5[4567]|6[0123469])", "$1 $2 $3 $4"));
        }
        if(country0.equals(L0.p)) {
            return Bb.q.K(new k2("(\\d{2})(\\d{6})", "1|25|3[0-5]|6|7|77|8|9", "$1 $2"));
        }
        if(!country0.equals(L0.m)) {
            throw new IllegalArgumentException("No number formats available for " + country0.X);
        }
        return Bb.q.K(new k2("(\\d{2})(\\d{2})(\\d{2})(\\d{2})", "[089]|2[013]|7[0467]|3[0-9]", "$1 $2 $3 $4"));
    }

    public static final Serializable z(R6 r60, c c0) {
        Ab.m m0;
        n1 n10;
        if(c0 instanceof n1) {
            n10 = (n1)c0;
            int v = n10.c0;
            if((v & 0x80000000) == 0) {
                n10 = new n1(c0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
            }
            else {
                n10.c0 = v ^ 0x80000000;
            }
        }
        else {
            n10 = new n1(c0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
        }
        Object object0 = n10.b0;
        Serializable serializable0 = a.X;
        switch(n10.c0) {
            case 0: {
                f.b0(object0);
                try {
                    j3 j30 = new j3();  // initializer: Ljava/lang/Object;-><init>()V
                    n10.c0 = 1;
                    object0 = R6.d(r60, j30, H6.b0, null, n10, 4);
                    if(object0 == serializable0) {
                        return serializable0;
                    label_19:
                        f.b0(object0);
                    }
                    i3 i30 = ((h3)((y6)object0).b).a;
                    m0 = i30 == null ? null : Boolean.valueOf(i30.b.a);
                    return !(m0 instanceof Ab.m) ? m0 : null;
                }
                catch(CancellationException cancellationException0) {
                    break;
                }
                catch(Throwable throwable0) {
                    m0 = f.v(throwable0);
                    return !(m0 instanceof Ab.m) ? m0 : null;
                }
            }
            case 1: {
                goto label_19;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        throw cancellationException0;
    }
}

