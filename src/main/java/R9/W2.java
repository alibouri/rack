package R9;

import B.B;
import B.e;
import B.k;
import B.z;
import Bb.n;
import Bb.r;
import Ea.m0;
import F0.h;
import F0.i;
import F0.j;
import J2.w;
import M.J;
import N.m2;
import P0.f;
import U.d;
import U.g0;
import U.l0;
import U.p;
import Vb.q;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.LabeledIntent;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.os.Vibrator;
import android.text.Html;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.Modifier;
import g0.a;
import g0.b;
import g0.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import q9.r1;
import q9.u1;

public abstract class w2 {
    public static final u1 a;

    static {
        w2.a = new u1("PlayReferrer", false);
    }

    public static final void a(Modifier modifier0, p p0, int v) {
        p0.S(0x7E254F0F);
        if((((v & 6) == 0 ? (p0.f(modifier0) ? 4 : 2) | v : v) & 3) != 2 || !p0.x()) {
            l l0 = l.X;
            B b0 = z.a(k.e, b.n, p0, 54);
            int v1 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier1 = a.d(p0, modifier0);
            F0.k.a.getClass();
            i i0 = j.b;
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            d.K(p0, b0, j.f);
            d.K(p0, g00, j.e);
            h h0 = j.g;
            if(p0.O || !Nb.j.a(p0.G(), v1)) {
                m5.b.F(v1, p0, v1, h0);
            }
            d.K(p0, modifier1, j.d);
            e.b(p0, A3.e.D(l0, 1.0f));
            M6.b.d(yc.l.y(0x7F080253, p0, 0), null, c.d(l0, 0.25f), null, null, 0.0f, null, p0, 0x1B0, 120);  // drawable:ic_magnifying_glass
            m2.b(w.S(0x7F1202C7, p0), androidx.compose.foundation.layout.a.l(l0, 0.0f, 16.0f, 1), 0L, 0L, null, null, null, 0L, null, new Z0.i(3), 0L, 0, false, 0, 0, null, ((db.a)p0.k(db.b.d)).l, p0, 0x30, 0, 0xFDFC);  // string:no_match_for_search "Sorry, we didn\'t find a match for your search."
            m2.b(w.S(0x7F12034D, p0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((db.a)p0.k(db.b.d)).e, p0, 0, 0, 0xFFFE);  // string:please_try_again "Please try again"
            e.b(p0, A3.e.D(l0, 2.0f));
            p0.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new m0(v, 4, modifier0);
        }
    }

    public static String b(i3 i30, p p0) {
        String s;
        p0.Q(0xBBE9B6C6);
        if(i30 instanceof h3) {
            p0.Q(0x5408FA48);
            p0.p(false);
            s = ((h3)i30).a;
        }
        else if(i30 instanceof g3) {
            p0.Q(0x5408FDAE);
            Object[] arr_object = ((g3)i30).b.toArray(new Object[0]);
            Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length);
            s = w.T(((g3)i30).a, arr_object1, p0);
            p0.p(false);
        }
        else if(i30 instanceof f3) {
            p0.Q(0x5409061A);
            Object[] arr_object2 = ((f3)i30).c.toArray(new Object[0]);
            Object[] arr_object3 = Arrays.copyOf(arr_object2, arr_object2.length);
            s = w.P(((f3)i30).a, ((f3)i30).b, arr_object3, p0);
            p0.p(false);
        }
        else {
            throw J.c(0x5408F685, p0, false);
        }
        p0.p(false);
        return s;
    }

    public static final Intent c(Context context0, String s, String s1) {
        Nb.j.f(context0, "context");
        Nb.j.f(s, "message");
        if(s1 != null) {
            s = com.apollographql.apollo.api.b.q(s, "\n\n", s1);
        }
        Intent intent0 = new Intent("android.intent.action.SEND");
        intent0.setType("text/plain");
        intent0.putExtra("android.intent.extra.TEXT", s);
        Intent intent1 = Intent.createChooser(intent0, null);
        List list0 = context0.getPackageManager().queryIntentActivities(intent0, 0);
        Nb.j.e(list0, "queryIntentActivities(...)");
        Set set0 = n.z0(new String[]{"com.whatsapp", "com.facebook.katana"});
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            if(set0.contains(((ResolveInfo)object0).activityInfo.packageName)) {
                arrayList0.add(object0);
            }
        }
        Iterable iterable0 = Bb.p.K0(arrayList0, new K2());  // initializer: Ljava/lang/Object;-><init>()V
        ArrayList arrayList1 = new ArrayList(r.b0(iterable0));
        for(Object object1: iterable0) {
            ResolveInfo resolveInfo0 = (ResolveInfo)object1;
            Object object2 = intent0.clone();
            Nb.j.d(object2, "null cannot be cast to non-null type android.content.Intent");
            Intent intent2 = (Intent)object2;
            intent2.setComponent(new ComponentName(resolveInfo0.activityInfo.packageName, resolveInfo0.activityInfo.name));
            if(s1 != null) {
                String s2 = resolveInfo0.activityInfo.packageName;
                Nb.j.e(s2, "packageName");
                if(Vb.j.R(s2, "facebook", false)) {
                    intent2.putExtra("android.intent.extra.TEXT", s1);
                }
            }
            intent2.setPackage(resolveInfo0.activityInfo.packageName);
            intent2.addFlags(0x10000000);
            arrayList1.add(new LabeledIntent(intent2, resolveInfo0.activityInfo.packageName, resolveInfo0.labelRes, resolveInfo0.icon));
        }
        intent1.putExtra("android.intent.extra.INITIAL_INTENTS", ((Parcelable[])arrayList1.toArray(new Parcelable[0])));
        return intent1;
    }

    public static final j3 d(String s) {
        Nb.j.f(s, "<this>");
        j3.A0.getClass();
        Bb.d d0 = new Bb.d(0, j3.A0);
        while(d0.hasNext()) {
            Object object0 = d0.next();
            Iterable iterable0 = ((j3)object0).Y;
            if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
                for(Object object1: iterable0) {
                    if(q.O(s, ((String)object1), false)) {
                        return (j3)object0;
                    }
                    if(false) {
                        break;
                    }
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    public static final void e(Context context0) {
        Nb.j.f(context0, "<this>");
        Object object0 = context0.getSystemService("vibrator");
        Nb.j.d(object0, "null cannot be cast to non-null type android.os.Vibrator");
        if(Build.VERSION.SDK_INT >= 26) {
            ((Vibrator)object0).vibrate(f.h());
            return;
        }
        ((Vibrator)object0).vibrate(20L);
    }

    public static final Object f(V8.d d0, String s, String s1, int v, Fb.c c0) {
        W w0;
        if(c0 instanceof W) {
            w0 = (W)c0;
            int v1 = w0.c0;
            if((v1 & 0x80000000) == 0) {
                w0 = new W(c0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
            }
            else {
                w0.c0 = v1 ^ 0x80000000;
            }
        }
        else {
            w0 = new W(c0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
        }
        Object object0 = w0.b0;
        Object object1 = Eb.a.X;
        boolean z = true;
        switch(w0.c0) {
            case 0: {
                W5.f.b0(object0);
                Nb.j.f(s, "pin");
                Nb.j.f(s1, "mobile");
                if(!s.equals(Vb.j.y0(s1))) {
                    Sb.d d1 = new Sb.d(1940, 2029, 1);  // initializer: LSb/b;-><init>(III)V
                    if(!(d1 instanceof Collection) || !((Collection)d1).isEmpty()) {
                        Sb.c c1 = d1.a();
                        while(c1.Z) {
                            if(!Nb.j.a(String.valueOf(c1.a()), s)) {
                                continue;
                            }
                            goto label_32;
                        }
                    }
                    Sb.d d2 = new Sb.d(0, 9, 1);  // initializer: LSb/b;-><init>(III)V
                    if(!(d2 instanceof Collection) || !((Collection)d2).isEmpty()) {
                        Sb.c c2 = d2.a();
                        while(c2.Z) {
                            if(!Nb.j.a(q.L(4, String.valueOf(c2.a())), s)) {
                                continue;
                            }
                            goto label_32;
                        }
                    }
                    if(!Bb.q.L(new String[]{"1234", "1212", "1004", "6969", "1122", "1313", "4321", "1010"}).contains(s)) {
                        return Boolean.FALSE;
                    }
                }
            label_32:
                String s2 = r1.d(0x7F12013C, new Object[0]);  // string:easy_pin "Easy secret code"
                String s3 = r1.d(0x7F12013D, new Object[0]);  // string:easy_pin_confirmation "Are you sure you want to choose a secret code that 
                                                              // is easy to guess?"
                String s4 = r1.d(0x7F1200FB, new Object[0]);  // string:continu "Continue"
                String s5 = r1.d(v, new Object[0]);
                w0.c0 = 1;
                object0 = Pb.a.O(d0, s2, s3, s4, Html.fromHtml(("<b>" + s5 + "</b>")), false, null, null, w0, 480);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                W5.f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((Integer)object0) == null || ((int)(((Integer)object0))) != -2) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

