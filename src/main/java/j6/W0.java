package j6;

import E.h0;
import E7.o;
import M5.p;
import N5.r;
import R2.c;
import R2.k;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import com.apollographql.apollo.api.b;
import com.google.android.gms.internal.measurement.F;
import com.google.android.gms.internal.measurement.X;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzno;
import com.google.android.gms.measurement.internal.zzo;
import com.google.android.gms.measurement.internal.zzon;
import com.google.common.util.concurrent.ListenableFuture;
import g.a;
import io.sentry.android.core.internal.util.g;
import io.sentry.hints.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class w0 extends U {
    public o b0;
    public c c0;
    public final CopyOnWriteArraySet d0;
    public boolean e0;
    public final AtomicReference f0;
    public final Object g0;
    public boolean h0;
    public int i0;
    public C0 j0;
    public PriorityQueue k0;
    public boolean l0;
    public q0 m0;
    public final AtomicLong n0;
    public long o0;
    public final W p0;
    public boolean q0;
    public C0 r0;
    public A0 s0;
    public C0 t0;
    public final a u0;

    public w0(d0 d00) {
        super(d00);
        this.d0 = new CopyOnWriteArraySet();
        this.g0 = new Object();
        this.h0 = false;
        this.i0 = 1;
        this.q0 = true;
        this.u0 = new a(11, this);
        this.f0 = new AtomicReference();
        this.m0 = q0.c;
        this.o0 = -1L;
        this.n0 = new AtomicLong(0L);
        this.p0 = new W(d00, 2);
    }

    public final void A(l l0, boolean z) {
        z0 z00 = new z0(this, 4, l0);
        if(z) {
            this.q();
            z00.run();
            return;
        }
        this.c().z(z00);
    }

    public final void B(q0 q00) {
        this.q();
        boolean z = q00.i(p0.Z) && q00.i(p0.Y) || ((d0)this.Y).q().F();
        d0 d00 = (d0)this.Y;
        d0.h(d00.h0);
        d00.h0.q();
        if(z != d00.B0) {
            d0 d01 = (d0)this.Y;
            d0.h(d01.h0);
            d01.h0.q();
            d01.B0 = z;
            V v0 = this.o();
            v0.q();
            Boolean boolean0 = v0.y().contains("measurement_enabled_from_api") ? Boolean.valueOf(v0.y().getBoolean("measurement_enabled_from_api", true)) : null;
            if(!z || boolean0 != null || boolean0.booleanValue()) {
                this.F(Boolean.valueOf(z), false);
            }
        }
    }

    public final void C(q0 q00, long v, boolean z) {
        q0 q02;
        boolean z3;
        boolean z2;
        q0 q01 = q00;
        this.u();
        int v1 = q01.b;
        if(v1 != -10) {
            s0 s00 = (s0)q01.a.get(p0.Y);
            if(s00 == null) {
                s00 = s0.Y;
            }
            s0 s01 = s0.Y;
            if(s00 == s01) {
                s0 s02 = (s0)q01.a.get(p0.Z);
                if(s02 == null) {
                    s02 = s01;
                }
                if(s02 == s01) {
                    this.b().j0.d("Ignoring empty consent settings");
                    return;
                }
            }
        }
        synchronized(this.g0) {
            q02 = this.m0;
            boolean z1 = false;
            if(q0.h(v1, q02.b)) {
                z2 = q00.k(this.m0, ((p0[])q01.a.keySet().toArray(new p0[0])));
                if(q00.i(p0.Z) && !this.m0.i(p0.Z)) {
                    z1 = true;
                }
                q01 = q00.j(this.m0);
                this.m0 = q01;
                z3 = z1;
                z1 = true;
            }
            else {
                z2 = false;
                z3 = false;
            }
        }
        if(!z1) {
            this.b().k0.b(q01, "Ignoring lower-priority consent settings, proposed settings");
            return;
        }
        long v3 = this.n0.getAndIncrement();
        if(z2) {
            this.T(null);
            G0 g00 = new G0(this, q01, v, v3, z3, q02);
            if(z) {
                this.q();
                g00.run();
                return;
            }
            this.c().A(g00);
            return;
        }
        H0 h00 = new H0(this, q01, v3, z3, q02);
        if(z) {
            this.q();
            h00.run();
            return;
        }
        if(v1 != -10 && v1 != 30) {
            this.c().z(h00);
            return;
        }
        this.c().A(h00);
    }

    public static void D(w0 w00, q0 q00, long v, boolean z, boolean z1) {
        w00.q();
        w00.u();
        q0 q01 = w00.o().A();
        int v1 = q00.b;
        if(Long.compare(v, w00.o0) <= 0 && q0.h(q01.b, v1)) {
            w00.b().k0.b(q00, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        V v2 = w00.o();
        v2.q();
        if(q0.h(v1, v2.y().getInt("consent_source", 100))) {
            SharedPreferences.Editor sharedPreferences$Editor0 = v2.y().edit();
            sharedPreferences$Editor0.putString("consent_settings", q00.m());
            sharedPreferences$Editor0.putInt("consent_source", v1);
            sharedPreferences$Editor0.apply();
            w00.b().m0.b(q00, "Setting storage consent(FE)");
            w00.o0 = v;
            d0 d00 = (d0)w00.Y;
            P0 p00 = b.n(d00);
            if(p00.G() && p00.p().v0() < 241200) {
                d00.q().B(z);
            }
            else {
                P0 p01 = d00.q();
                p01.q();
                p01.u();
                d0 d01 = (d0)p01.Y;
                if(!d01.e0.B(null, s.X0) && z) {
                    d01.o().z();
                }
                O0 o00 = new O0(0);
                o00.Y = p01;
                p01.z(o00);
            }
            if(z1) {
                d00.q().A(new AtomicReference());
            }
        }
        else {
            w00.b().k0.b(v1, "Lower precedence consent source ignored, proposed source");
        }
    }

    public static void E(w0 w00, q0 q00, q0 q01) {
        if(!((d0)w00.Y).e0.B(null, s.X0)) {
            p0 p00 = p0.Z;
            p0 p01 = p0.Y;
            p0[] arr_p0 = {p00, p01};
            for(int v = 0; true; ++v) {
                boolean z = false;
                if(v >= 2) {
                    break;
                }
                p0 p02 = arr_p0[v];
                if(!q01.i(p02) && q00.i(p02)) {
                    z = true;
                    break;
                }
            }
            if(z || q00.k(q01, new p0[]{p00, p01})) {
                ((d0)w00.Y).n().z();
            }
        }
    }

    public final void F(Boolean boolean0, boolean z) {
        this.q();
        this.u();
        this.b().l0.b(boolean0, "Setting app measurement enabled (FE)");
        V v0 = this.o();
        v0.q();
        SharedPreferences.Editor sharedPreferences$Editor0 = v0.y().edit();
        if(boolean0 == null) {
            sharedPreferences$Editor0.remove("measurement_enabled");
        }
        else {
            sharedPreferences$Editor0.putBoolean("measurement_enabled", boolean0.booleanValue());
        }
        sharedPreferences$Editor0.apply();
        if(z) {
            V v1 = this.o();
            v1.q();
            SharedPreferences.Editor sharedPreferences$Editor1 = v1.y().edit();
            if(boolean0 == null) {
                sharedPreferences$Editor1.remove("measurement_enabled_from_api");
            }
            else {
                sharedPreferences$Editor1.putBoolean("measurement_enabled_from_api", boolean0.booleanValue());
            }
            sharedPreferences$Editor1.apply();
        }
        d0 d00 = (d0)this.Y;
        d0.h(d00.h0);
        d00.h0.q();
        if(d00.B0 || boolean0 != null && !boolean0.booleanValue()) {
            this.R();
        }
    }

    public final void G(String s, String s1, long v, Bundle bundle0) {
        this.q();
        this.H(s, s1, v, bundle0, true, this.c0 == null || r1.w0(s1), true);
    }

    // Detected as a lambda impl.
    public final void H(String s, String s1, long v, Bundle bundle0, boolean z, boolean z1, boolean z2) {
        boolean z6;
        Bundle[] arr_bundle;
        ArrayList arrayList1;
        boolean z5;
        d0 d03;
        int v2;
        d0 d01;
        S5.b b1;
        int v1 = 0;
        r.f(s);
        r.j(bundle0);
        this.q();
        this.u();
        d0 d00 = (d0)this.Y;
        if(!d00.i()) {
            this.b().l0.d("Event not sent since app measurement is disabled");
            return;
        }
        List list0 = d00.n().h0;
        if(list0 != null && !list0.contains(s1)) {
            this.b().l0.c(s1, "Dropping non-safelisted event. event name, origin", s);
            return;
        }
        if(!this.e0) {
            try {
                this.e0 = true;
                Class class0 = d00.c0 ? Class.forName("com.google.android.gms.tagmanager.TagManagerService") : Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, d00.X.getClassLoader());
                try {
                    class0.getDeclaredMethod("initialize", Context.class).invoke(null, d00.X);
                }
                catch(Exception exception0) {
                    this.b().h0.b(exception0, "Failed to invoke Tag Manager\'s initialize() method");
                }
            }
            catch(ClassNotFoundException unused_ex) {
                this.b().k0.d("Tag Manager is not found and thus will not be used");
            }
        }
        S5.b b0 = d00.l0;
        if(!"_cmp".equals(s1) || !bundle0.containsKey("gclid")) {
            b1 = b0;
            d01 = d00;
        }
        else {
            String s2 = bundle0.getString("gclid");
            b0.getClass();
            b1 = b0;
            d01 = d00;
            this.x(System.currentTimeMillis(), s2, "auto", "_lgclid");
        }
        if(z && !"_err".equals(s1)) {
            this.p().J(bundle0, this.o().y0.f());
        }
        G g0 = d01.k0;
        a a0 = this.u0;
        if(!z2 && !"_iap".equals(s1)) {
            r1 r10 = d01.j0;
            d0.e(r10);
            if(!r10.r0("event", s1)) {
                v2 = 2;
            }
            else if(!r10.f0("event", t0.a, t0.b, s1)) {
                v2 = 13;
            }
            else if(r10.W(40, "event", s1)) {
                v2 = 0;
            }
            else {
                v2 = 2;
            }
            if(v2 != 0) {
                L l0 = this.b();
                String s3 = g0.c(s1);
                l0.g0.b(s3, "Invalid public event name. Event will not be logged (FE)");
                d01.r();
                String s4 = r1.F(s1, true, 40);
                if(s1 != null) {
                    v1 = s1.length();
                }
                d01.r();
                r1.S(a0, null, v2, "_ev", s4, v1);
                return;
            }
        }
        M0 m00 = this.s().x(false);
        if(m00 != null && !bundle0.containsKey("_sc")) {
            m00.d = true;
        }
        r1.R(m00, bundle0, z && !z2);
        boolean z3 = "am".equals(s);
        boolean z4 = r1.w0(s1);
        if(z && this.c0 != null && !z4 && !z3) {
            L l1 = this.b();
            String s5 = g0.c(s1);
            String s6 = g0.a(bundle0);
            l1.l0.c(s5, "Passing event to registered event handler (FE)", s6);
            r.j(this.c0);
            c c0 = this.c0;
            c0.getClass();
            try {
                X x0 = (X)(((com.google.android.gms.internal.measurement.V)c0.Y));
                Parcel parcel0 = x0.b();
                parcel0.writeString(s);
                parcel0.writeString(s1);
                F.c(parcel0, bundle0);
                parcel0.writeLong(v);
                x0.L(1, parcel0);
            }
            catch(RemoteException remoteException0) {
                d0 d02 = ((AppMeasurementDynamiteService)c0.Z).d;
                if(d02 != null) {
                    d0.h(d02.g0);
                    d02.g0.h0.b(remoteException0, "Event interceptor threw exception");
                }
            }
            return;
        }
        if(!d01.j()) {
            return;
        }
        int v3 = this.p().v(s1);
        if(v3 != 0) {
            L l2 = this.b();
            String s7 = g0.c(s1);
            l2.g0.b(s7, "Invalid event name. Event will not be logged (FE)");
            this.p();
            String s8 = r1.F(s1, true, 40);
            if(s1 != null) {
                v1 = s1.length();
            }
            d01.r();
            r1.S(a0, null, v3, "_ev", s8, v1);
            return;
        }
        List list1 = Collections.unmodifiableList(Arrays.asList(new String[]{"_o", "_sn", "_sc", "_si"}));
        Bundle bundle1 = this.p().A(s1, bundle0, list1, z2);
        r.j(bundle1);
        if(this.s().x(false) == null || !"_ae".equals(s1)) {
            d03 = d01;
        }
        else {
            a1 a10 = this.t();
            ((d0)((a1)a10.e0.b0).Y).l0.getClass();
            long v4 = SystemClock.elapsedRealtime();
            d03 = d01;
            long v5 = v4 - a10.e0.Y;
            a10.e0.Y = v4;
            if(v5 > 0L) {
                this.p().I(bundle1, v5);
            }
        }
        if(!"auto".equals(s) && "_ssr".equals(s1)) {
            r1 r11 = this.p();
            String s9 = bundle1.getString("_ffr");
            s9 = s9 == null || s9.trim().isEmpty() ? null : s9.trim();
            if(Objects.equals(s9, r11.o().v0.x())) {
                r11.b().l0.d("Not logging duplicate session_start_with_rollout event");
                return;
            }
            r11.o().v0.y(s9);
        }
        else if("_ae".equals(s1)) {
            String s10 = this.p().o().v0.x();
            if(!TextUtils.isEmpty(s10)) {
                bundle1.putString("_ffr", s10);
            }
        }
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(bundle1);
        if(d03.e0.B(null, s.O0)) {
            a1 a11 = this.t();
            a11.q();
            z5 = a11.c0;
        }
        else {
            z5 = this.o().s0.b();
        }
        if(this.o().p0.a() <= 0L || !this.o().v(v) || !z5) {
            arrayList1 = arrayList0;
        }
        else {
            this.b().m0.d("Current session is expired, remove the session number, ID, and engagement time");
            b1.getClass();
            arrayList1 = arrayList0;
            this.x(System.currentTimeMillis(), null, "auto", "_sid");
            b1.getClass();
            this.x(System.currentTimeMillis(), null, "auto", "_sno");
            b1.getClass();
            this.x(System.currentTimeMillis(), null, "auto", "_se");
            this.o().q0.b(0L);
        }
        if(bundle1.getLong("extend_session", 0L) == 1L) {
            this.b().m0.d("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
            d0.g(d03.i0);
            d03.i0.d0.I(v, true);
        }
        ArrayList arrayList2 = new ArrayList(bundle1.keySet());
        Collections.sort(arrayList2);
        int v6 = arrayList2.size();
        for(int v7 = 0; v7 < v6; ++v7) {
            String s11 = (String)arrayList2.get(v7);
            if(s11 != null) {
                this.p();
                Object object0 = bundle1.get(s11);
                if(object0 instanceof Bundle) {
                    arr_bundle = new Bundle[]{((Bundle)object0)};
                }
                else if(object0 instanceof Parcelable[]) {
                    arr_bundle = (Bundle[])Arrays.copyOf(((Parcelable[])object0), ((Parcelable[])object0).length, Bundle[].class);
                }
                else {
                    arr_bundle = object0 instanceof ArrayList ? ((Bundle[])((ArrayList)object0).toArray(new Bundle[((ArrayList)object0).size()])) : null;
                }
                if(arr_bundle != null) {
                    bundle1.putParcelableArray(s11, arr_bundle);
                }
            }
        }
        int v8 = 0;
        while(v8 < arrayList1.size()) {
            Bundle bundle2 = (Bundle)arrayList1.get(v8);
            bundle2.putString("_o", s);
            if(z1) {
                bundle2 = this.p().z(bundle2);
            }
            zzbf zzbf0 = new zzbf((v8 == 0 ? s1 : "_ep"), new zzbe(bundle2), s, v);
            P0 p00 = d03.q();
            p00.getClass();
            p00.q();
            p00.u();
            E e0 = ((d0)p00.Y).o();
            e0.getClass();
            Parcel parcel1 = Parcel.obtain();
            zzbf0.writeToParcel(parcel1, 0);
            byte[] arr_b = parcel1.marshall();
            parcel1.recycle();
            if(arr_b.length > 0x20000) {
                e0.b().f0.d("Event is too long for local database. Sending event directly to service");
                z6 = false;
            }
            else {
                z6 = e0.y(0, arr_b);
            }
            p00.z(new S0(p00, p00.J(true), z6, zzbf0, 1));
            if(!z3) {
                for(Object object1: this.d0) {
                    j6.a a1 = (j6.a)object1;
                    Bundle bundle3 = new Bundle(bundle2);
                    a1.getClass();
                    try {
                        Parcel parcel2 = ((X)a1.a).b();
                        parcel2.writeString(s);
                        parcel2.writeString(s1);
                        F.c(parcel2, bundle3);
                        parcel2.writeLong(v);
                        ((X)a1.a).L(1, parcel2);
                    }
                    catch(RemoteException remoteException1) {
                        d0 d04 = a1.b.d;
                        if(d04 == null) {
                            continue;
                        }
                        d0.h(d04.g0);
                        d04.g0.h0.b(remoteException1, "Event listener threw exception");
                    }
                }
            }
            ++v8;
            arrayList1 = arrayList1;
        }
        if(this.s().x(false) != null && "_ae".equals(s1)) {
            a1 a12 = this.t();
            b1.getClass();
            long v9 = SystemClock.elapsedRealtime();
            a12.e0.b(v9, true, true);
        }
    }

    public final void I(String s, String s1, Bundle bundle0) {
        ((d0)this.Y).l0.getClass();
        r.f(s);
        Bundle bundle1 = new Bundle();
        bundle1.putString("name", s);
        bundle1.putLong("creation_timestamp", System.currentTimeMillis());
        if(s1 != null) {
            bundle1.putString("expired_event_name", s1);
            bundle1.putBundle("expired_event_params", bundle0);
        }
        this.c().z(new y0(this, bundle1, 1));
    }

    public final void J(String s, String s1, Bundle bundle0, boolean z, boolean z1, long v) {
        String s2;
        String s4;
        Bundle bundle1 = bundle0 == null ? new Bundle() : bundle0;
        if(Objects.equals(s1, "screen_view")) {
            L0 l00 = this.s();
            synchronized(l00.k0) {
                if(!l00.j0) {
                    l00.b().j0.d("Cannot log screen view event when the app is in the background.");
                    return;
                }
                s2 = bundle1.getString("screen_name");
                if(s2 != null) {
                    if(s2.length() <= 0) {
                        l00.b().j0.b(s2.length(), "Invalid screen name length for screen view. Length");
                        return;
                    }
                    ((d0)l00.Y).e0.getClass();
                    if(s2.length() > 500) {
                        l00.b().j0.b(s2.length(), "Invalid screen name length for screen view. Length");
                        return;
                    }
                }
                String s3 = bundle1.getString("screen_class");
                if(s3 != null) {
                    if(s3.length() <= 0) {
                        l00.b().j0.b(s3.length(), "Invalid screen class length for screen view. Length");
                        return;
                    }
                    ((d0)l00.Y).e0.getClass();
                    if(s3.length() > 500) {
                        l00.b().j0.b(s3.length(), "Invalid screen class length for screen view. Length");
                        return;
                    }
                }
                if(s3 == null) {
                    s4 = l00.f0 == null ? "Activity" : l00.y(l00.f0.getClass());
                }
                else {
                    s4 = s3;
                }
                M0 m00 = l00.b0;
                if(l00.g0 && m00 != null) {
                    l00.g0 = false;
                    if(Objects.equals(m00.b, s4) && Objects.equals(m00.a, s2)) {
                        l00.b().j0.d("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
            }
            l00.b().m0.c((s2 == null ? "null" : s2), "Logging screen view with name, class", (s4 == null ? "null" : s4));
            M0 m01 = l00.b0 == null ? l00.c0 : l00.b0;
            M0 m02 = new M0(s2, s4, l00.p().B0(), true, v);
            l00.b0 = m02;
            l00.c0 = m01;
            l00.h0 = m02;
            ((d0)l00.Y).l0.getClass();
            long v2 = SystemClock.elapsedRealtime();
            l00.c().z(new k0(l00, bundle1, m02, m01, v2, 2));
            return;
        }
        boolean z2 = !z1 || this.c0 == null || r1.w0(s1);
        Bundle bundle2 = new Bundle(bundle1);
        for(Object object1: bundle2.keySet()) {
            String s5 = (String)object1;
            Object object2 = bundle2.get(s5);
            if(object2 instanceof Bundle) {
                bundle2.putBundle(s5, new Bundle(((Bundle)object2)));
            }
            else if(object2 instanceof Parcelable[]) {
                for(int v3 = 0; v3 < ((Parcelable[])object2).length; ++v3) {
                    if(((Parcelable[])object2)[v3] instanceof Bundle) {
                        ((Parcelable[])object2)[v3] = new Bundle(((Bundle)((Parcelable[])object2)[v3]));
                    }
                }
            }
            else if(object2 instanceof List) {
                for(int v4 = 0; v4 < ((List)object2).size(); ++v4) {
                    Object object3 = ((List)object2).get(v4);
                    if(object3 instanceof Bundle) {
                        ((List)object2).set(v4, new Bundle(((Bundle)object3)));
                    }
                }
            }
        }
        this.c().z(() -> {
            boolean z6;
            Bundle[] arr_bundle;
            ArrayList arrayList1;
            boolean z5;
            d0 d03;
            int v2;
            d0 d01;
            S5.b b1;
            int v1 = 0;
            r.f((s == null ? "app" : s));
            r.j(bundle2);
            this.q();
            this.u();
            d0 d00 = (d0)this.Y;
            if(!d00.i()) {
                this.b().l0.d("Event not sent since app measurement is disabled");
                return;
            }
            List list0 = d00.n().h0;
            if(list0 != null && !list0.contains(s1)) {
                this.b().l0.c(s1, "Dropping non-safelisted event. event name, origin", (s == null ? "app" : s));
                return;
            }
            if(!this.e0) {
                try {
                    this.e0 = true;
                    Class class0 = d00.c0 ? Class.forName("com.google.android.gms.tagmanager.TagManagerService") : Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, d00.X.getClassLoader());
                    try {
                        class0.getDeclaredMethod("initialize", Context.class).invoke(null, d00.X);
                    }
                    catch(Exception exception0) {
                        this.b().h0.b(exception0, "Failed to invoke Tag Manager\'s initialize() method");
                    }
                }
                catch(ClassNotFoundException unused_ex) {
                    this.b().k0.d("Tag Manager is not found and thus will not be used");
                }
            }
            S5.b b0 = d00.l0;
            if(!"_cmp".equals(s1) || !bundle2.containsKey("gclid")) {
                b1 = b0;
                d01 = d00;
            }
            else {
                String s2 = bundle2.getString("gclid");
                b0.getClass();
                b1 = b0;
                d01 = d00;
                this.x(System.currentTimeMillis(), s2, "auto", "_lgclid");
            }
            if(z1 && !"_err".equals(s1)) {
                this.p().J(bundle2, this.o().y0.f());
            }
            G g0 = d01.k0;
            a a0 = this.u0;
            if(!z && !"_iap".equals(s1)) {
                r1 r10 = d01.j0;
                d0.e(r10);
                if(!r10.r0("event", s1)) {
                    v2 = 2;
                }
                else if(!r10.f0("event", t0.a, t0.b, s1)) {
                    v2 = 13;
                }
                else if(r10.W(40, "event", s1)) {
                    v2 = 0;
                }
                else {
                    v2 = 2;
                }
                if(v2 != 0) {
                    L l0 = this.b();
                    String s3 = g0.c(s1);
                    l0.g0.b(s3, "Invalid public event name. Event will not be logged (FE)");
                    d01.r();
                    String s4 = r1.F(s1, true, 40);
                    if(s1 != null) {
                        v1 = s1.length();
                    }
                    d01.r();
                    r1.S(a0, null, v2, "_ev", s4, v1);
                    return;
                }
            }
            M0 m00 = this.s().x(false);
            if(m00 != null && !bundle2.containsKey("_sc")) {
                m00.d = true;
            }
            r1.R(m00, bundle2, z1 && !z);
            boolean z3 = "am".equals((s == null ? "app" : s));
            boolean z4 = r1.w0(s1);
            if(z1 && this.c0 != null && !z4 && !z3) {
                L l1 = this.b();
                String s5 = g0.c(s1);
                String s6 = g0.a(bundle2);
                l1.l0.c(s5, "Passing event to registered event handler (FE)", s6);
                r.j(this.c0);
                c c0 = this.c0;
                c0.getClass();
                try {
                    X x0 = (X)(((com.google.android.gms.internal.measurement.V)c0.Y));
                    Parcel parcel0 = x0.b();
                    parcel0.writeString((s == null ? "app" : s));
                    parcel0.writeString(s1);
                    F.c(parcel0, bundle2);
                    parcel0.writeLong(v);
                    x0.L(1, parcel0);
                }
                catch(RemoteException remoteException0) {
                    d0 d02 = ((AppMeasurementDynamiteService)c0.Z).d;
                    if(d02 != null) {
                        d0.h(d02.g0);
                        d02.g0.h0.b(remoteException0, "Event interceptor threw exception");
                    }
                }
                return;
            }
            if(!d01.j()) {
                return;
            }
            int v3 = this.p().v(s1);
            if(v3 != 0) {
                L l2 = this.b();
                String s7 = g0.c(s1);
                l2.g0.b(s7, "Invalid event name. Event will not be logged (FE)");
                this.p();
                String s8 = r1.F(s1, true, 40);
                if(s1 != null) {
                    v1 = s1.length();
                }
                d01.r();
                r1.S(a0, null, v3, "_ev", s8, v1);
                return;
            }
            List list1 = Collections.unmodifiableList(Arrays.asList(new String[]{"_o", "_sn", "_sc", "_si"}));
            Bundle bundle1 = this.p().A(s1, bundle2, list1, z);
            r.j(bundle1);
            if(this.s().x(false) == null || !"_ae".equals(s1)) {
                d03 = d01;
            }
            else {
                a1 a10 = this.t();
                ((d0)((a1)a10.e0.b0).Y).l0.getClass();
                long v4 = SystemClock.elapsedRealtime();
                d03 = d01;
                long v5 = v4 - a10.e0.Y;
                a10.e0.Y = v4;
                if(v5 > 0L) {
                    this.p().I(bundle1, v5);
                }
            }
            if(!"auto".equals((s == null ? "app" : s)) && "_ssr".equals(s1)) {
                r1 r11 = this.p();
                String s9 = bundle1.getString("_ffr");
                s9 = s9 == null || s9.trim().isEmpty() ? null : s9.trim();
                if(Objects.equals(s9, r11.o().v0.x())) {
                    r11.b().l0.d("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                r11.o().v0.y(s9);
            }
            else if("_ae".equals(s1)) {
                String s10 = this.p().o().v0.x();
                if(!TextUtils.isEmpty(s10)) {
                    bundle1.putString("_ffr", s10);
                }
            }
            ArrayList arrayList0 = new ArrayList();
            arrayList0.add(bundle1);
            if(d03.e0.B(null, s.O0)) {
                a1 a11 = this.t();
                a11.q();
                z5 = a11.c0;
            }
            else {
                z5 = this.o().s0.b();
            }
            if(this.o().p0.a() <= 0L || !this.o().v(v) || !z5) {
                arrayList1 = arrayList0;
            }
            else {
                this.b().m0.d("Current session is expired, remove the session number, ID, and engagement time");
                b1.getClass();
                arrayList1 = arrayList0;
                this.x(System.currentTimeMillis(), null, "auto", "_sid");
                b1.getClass();
                this.x(System.currentTimeMillis(), null, "auto", "_sno");
                b1.getClass();
                this.x(System.currentTimeMillis(), null, "auto", "_se");
                this.o().q0.b(0L);
            }
            if(bundle1.getLong("extend_session", 0L) == 1L) {
                this.b().m0.d("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                d0.g(d03.i0);
                d03.i0.d0.I(v, true);
            }
            ArrayList arrayList2 = new ArrayList(bundle1.keySet());
            Collections.sort(arrayList2);
            int v6 = arrayList2.size();
            for(int v7 = 0; v7 < v6; ++v7) {
                String s11 = (String)arrayList2.get(v7);
                if(s11 != null) {
                    this.p();
                    Object object0 = bundle1.get(s11);
                    if(object0 instanceof Bundle) {
                        arr_bundle = new Bundle[]{((Bundle)object0)};
                    }
                    else if(object0 instanceof Parcelable[]) {
                        arr_bundle = (Bundle[])Arrays.copyOf(((Parcelable[])object0), ((Parcelable[])object0).length, Bundle[].class);
                    }
                    else {
                        arr_bundle = object0 instanceof ArrayList ? ((Bundle[])((ArrayList)object0).toArray(new Bundle[((ArrayList)object0).size()])) : null;
                    }
                    if(arr_bundle != null) {
                        bundle1.putParcelableArray(s11, arr_bundle);
                    }
                }
            }
            int v8 = 0;
            while(v8 < arrayList1.size()) {
                Bundle bundle2 = (Bundle)arrayList1.get(v8);
                bundle2.putString("_o", (s == null ? "app" : s));
                if(z2) {
                    bundle2 = this.p().z(bundle2);
                }
                zzbf zzbf0 = new zzbf((v8 == 0 ? s1 : "_ep"), new zzbe(bundle2), (s == null ? "app" : s), v);
                P0 p00 = d03.q();
                p00.getClass();
                p00.q();
                p00.u();
                E e0 = ((d0)p00.Y).o();
                e0.getClass();
                Parcel parcel1 = Parcel.obtain();
                zzbf0.writeToParcel(parcel1, 0);
                byte[] arr_b = parcel1.marshall();
                parcel1.recycle();
                if(arr_b.length > 0x20000) {
                    e0.b().f0.d("Event is too long for local database. Sending event directly to service");
                    z6 = false;
                }
                else {
                    z6 = e0.y(0, arr_b);
                }
                p00.z(new S0(p00, p00.J(true), z6, zzbf0, 1));
                if(!z3) {
                    for(Object object1: this.d0) {
                        j6.a a1 = (j6.a)object1;
                        Bundle bundle3 = new Bundle(bundle2);
                        a1.getClass();
                        try {
                            Parcel parcel2 = ((X)a1.a).b();
                            parcel2.writeString((s == null ? "app" : s));
                            parcel2.writeString(s1);
                            F.c(parcel2, bundle3);
                            parcel2.writeLong(v);
                            ((X)a1.a).L(1, parcel2);
                        }
                        catch(RemoteException remoteException1) {
                            d0 d04 = a1.b.d;
                            if(d04 == null) {
                                continue;
                            }
                            d0.h(d04.g0);
                            d04.g0.h0.b(remoteException1, "Event listener threw exception");
                        }
                    }
                }
                ++v8;
                arrayList1 = arrayList1;
            }
            if(this.s().x(false) != null && "_ae".equals(s1)) {
                a1 a12 = this.t();
                b1.getClass();
                long v9 = SystemClock.elapsedRealtime();
                a12.e0.b(v9, true, true);
            }
        });
    }

    public final void K(String s, String s1, Object object0, boolean z, long v) {
        int v2;
        String s2 = s == null ? "app" : s;
        int v1 = 0;
        if(z) {
            v2 = this.p().j0(s1);
        }
        else {
            r1 r10 = this.p();
            v2 = 6;
            if(r10.r0("user property", s1)) {
                if(!r10.f0("user property", t0.e, null, s1)) {
                    v2 = 15;
                }
                else if(r10.W(24, "user property", s1)) {
                    v2 = 0;
                }
            }
        }
        a a0 = this.u0;
        d0 d00 = (d0)this.Y;
        if(v2 != 0) {
            this.p();
            String s3 = r1.F(s1, true, 24);
            if(s1 != null) {
                v1 = s1.length();
            }
            d00.r();
            r1.S(a0, null, v2, "_ev", s3, v1);
            return;
        }
        if(object0 != null) {
            int v3 = this.p().u(object0, s1);
            if(v3 != 0) {
                this.p();
                String s4 = r1.F(s1, true, 24);
                if(object0 instanceof String || object0 instanceof CharSequence) {
                    v1 = String.valueOf(object0).length();
                }
                d00.r();
                r1.S(a0, null, v3, "_ev", s4, v1);
                return;
            }
            Object object1 = this.p().p0(object0, s1);
            if(object1 != null) {
                this.c().z(new k0(this, s2, s1, object1, v, 1));
            }
            return;
        }
        this.c().z(new k0(this, s2, s1, null, v, 1));
    }

    public final PriorityQueue L() {
        if(this.k0 == null) {
            this.k0 = g.n(g.l(new v0(), new E2.a(5)));  // initializer: Ljava/lang/Object;-><init>()V
        }
        return this.k0;
    }

    public final void M() {
        this.q();
        this.u();
        d0 d00 = (d0)this.Y;
        if(!d00.j()) {
            return;
        }
        Boolean boolean0 = d00.e0.z("google_analytics_deferred_deep_link_enabled");
        if(boolean0 != null && boolean0.booleanValue()) {
            this.b().l0.d("Deferred Deep Link feature enabled.");
            a0 a00 = this.c();
            g0 g00 = new g0(1);
            g00.Y = this;
            a00.z(g00);
        }
        P0 p00 = b.n(d00);
        zzo zzo0 = p00.J(true);
        ((d0)p00.Y).o().y(3, new byte[0]);
        p00.z(new T0(p00, zzo0, 1));
        this.q0 = false;
        V v0 = this.o();
        v0.q();
        String s = v0.y().getString("previous_os_version", null);
        ((d0)v0.Y).m().r();
        String s1 = Build.VERSION.RELEASE;
        if(!TextUtils.isEmpty(s1) && !s1.equals(s)) {
            SharedPreferences.Editor sharedPreferences$Editor0 = v0.y().edit();
            sharedPreferences$Editor0.putString("previous_os_version", s1);
            sharedPreferences$Editor0.apply();
        }
        if(!TextUtils.isEmpty(s)) {
            d00.m().r();
            if(!s.equals(s1)) {
                Bundle bundle0 = new Bundle();
                bundle0.putString("_po", s);
                this.U("auto", "_ou", bundle0);
            }
        }
    }

    public final void N() {
        d0 d00 = (d0)this.Y;
        if(d00.X.getApplicationContext() instanceof Application && this.b0 != null) {
            ((Application)d00.X.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.b0);
        }
    }

    public final void O() {
        if(!((d0)this.Y).e0.B(null, s.I0)) {
            return;
        }
        if(this.c().B()) {
            this.b().e0.d("Cannot get trigger URIs from analytics worker thread");
            return;
        }
        if(i.Q()) {
            this.b().e0.d("Cannot get trigger URIs from main thread");
            return;
        }
        this.u();
        this.b().m0.d("Getting trigger URIs (FE)");
        AtomicReference atomicReference0 = new AtomicReference();
        a0 a00 = this.c();
        x0 x00 = new x0();
        x00.Z = this;
        x00.Y = atomicReference0;
        a00.v(atomicReference0, 5000L, "get trigger URIs", x00);
        List list0 = (List)atomicReference0.get();
        if(list0 == null) {
            this.b().e0.d("Timed out waiting for get trigger URIs");
            return;
        }
        a0 a01 = this.c();
        z0 z00 = new z0(0);
        z00.Y = this;
        z00.Z = list0;
        a01.z(z00);
    }

    public final void P() {
        int v8;
        int v7;
        Bundle bundle0;
        int v3;
        String s1;
        int v2;
        int v1;
        int v;
        String s;
        this.q();
        this.b().l0.d("Handle tcf update.");
        SharedPreferences sharedPreferences0 = this.o().x();
        HashMap hashMap0 = new HashMap();
        try {
            s = "\u0000";
            s = sharedPreferences0.getString("IABTCF_VendorConsents", "\u0000");
        }
        catch(ClassCastException unused_ex) {
        }
        if(!"\u0000".equals(s) && s.length() > 0x2F2) {
            hashMap0.put("GoogleConsent", String.valueOf(s.charAt(0x2F2)));
        }
        try {
            v = -1;
            v = sharedPreferences0.getInt("IABTCF_gdprApplies", -1);
        }
        catch(ClassCastException unused_ex) {
        }
        if(v != -1) {
            hashMap0.put("gdprApplies", String.valueOf(v));
        }
        try {
            v1 = -1;
            v1 = sharedPreferences0.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
        }
        catch(ClassCastException unused_ex) {
        }
        if(v1 != -1) {
            hashMap0.put("EnableAdvertiserConsentMode", String.valueOf(v1));
        }
        try {
            v2 = -1;
            v2 = sharedPreferences0.getInt("IABTCF_PolicyVersion", -1);
        }
        catch(ClassCastException unused_ex) {
        }
        if(v2 != -1) {
            hashMap0.put("PolicyVersion", String.valueOf(v2));
        }
        try {
            s1 = "\u0000";
            s1 = sharedPreferences0.getString("IABTCF_PurposeConsents", "\u0000");
        }
        catch(ClassCastException unused_ex) {
        }
        if(!"\u0000".equals(s1)) {
            hashMap0.put("PurposeConsents", s1);
        }
        try {
            v3 = -1;
            v3 = sharedPreferences0.getInt("IABTCF_CmpSdkID", -1);
        }
        catch(ClassCastException unused_ex) {
        }
        if(v3 != -1) {
            hashMap0.put("CmpSdkID", String.valueOf(v3));
        }
        e1 e10 = new e1(hashMap0);
        this.b().m0.b(e10, "Tcf preferences read");
        V v4 = this.o();
        v4.q();
        String s2 = v4.y().getString("stored_tcf_param", "");
        String s3 = e10.a();
        if(!s3.equals(s2)) {
            SharedPreferences.Editor sharedPreferences$Editor0 = v4.y().edit();
            sharedPreferences$Editor0.putString("stored_tcf_param", s3);
            sharedPreferences$Editor0.apply();
            HashMap hashMap1 = e10.a;
            int v5 = 2;
            if(!"1".equals(hashMap1.get("GoogleConsent")) || !"1".equals(hashMap1.get("gdprApplies")) || !"1".equals(hashMap1.get("EnableAdvertiserConsentMode"))) {
                bundle0 = Bundle.EMPTY;
            }
            else {
                int v6 = e10.b();
                if(v6 < 0) {
                    bundle0 = Bundle.EMPTY;
                }
                else {
                    String s4 = (String)hashMap1.get("PurposeConsents");
                    if(TextUtils.isEmpty(s4)) {
                        bundle0 = Bundle.EMPTY;
                    }
                    else {
                        Bundle bundle1 = new Bundle();
                        String s5 = "denied";
                        if(s4.length() > 0) {
                            bundle1.putString("ad_storage", (s4.charAt(0) == 49 ? "granted" : "denied"));
                        }
                        if(s4.length() > 3) {
                            bundle1.putString("ad_personalization", (s4.charAt(2) != 49 || s4.charAt(3) != 49 ? "denied" : "granted"));
                        }
                        if(s4.length() > 6 && v6 >= 4) {
                            if(s4.charAt(0) == 49 && s4.charAt(6) == 49) {
                                s5 = "granted";
                            }
                            bundle1.putString("ad_user_data", s5);
                        }
                        bundle0 = bundle1;
                    }
                }
            }
            this.b().m0.b(bundle0, "Consent generated from Tcf");
            if(bundle0 != Bundle.EMPTY) {
                ((d0)this.Y).l0.getClass();
                this.z(bundle0, -30, System.currentTimeMillis());
            }
            Bundle bundle2 = new Bundle();
            StringBuilder stringBuilder0 = new StringBuilder("1");
            try {
                String s6 = (String)hashMap1.get("CmpSdkID");
                v7 = TextUtils.isEmpty(s6) ? -1 : Integer.parseInt(s6);
            }
            catch(NumberFormatException unused_ex) {
                v8 = -1;
                goto label_77;
            }
            v8 = v7;
        label_77:
            if(v8 < 0 || v8 > 0xFFF) {
                stringBuilder0.append("00");
            }
            else {
                stringBuilder0.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(v8 >> 6 & 0x3F));
                stringBuilder0.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(v8 & 0x3F));
            }
            int v9 = e10.b();
            if(v9 < 0 || v9 > 0x3F) {
                stringBuilder0.append("0");
            }
            else {
                stringBuilder0.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(v9));
            }
            if(!"1".equals(hashMap1.get("gdprApplies"))) {
                v5 = 0;
            }
            stringBuilder0.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(("1".equals(hashMap1.get("EnableAdvertiserConsentMode")) ? v5 | 12 : v5 | 4)));
            bundle2.putString("_tcfd", stringBuilder0.toString());
            this.U("auto", "_tcf", bundle2);
        }
    }

    public final void Q() {
        this.q();
        this.l0 = false;
        if(!this.L().isEmpty() && !this.h0) {
            zzno zzno0 = (zzno)this.L().poll();
            if(zzno0 == null) {
                return;
            }
            MeasurementManagerFutures measurementManagerFutures0 = this.p().C0();
            if(measurementManagerFutures0 == null) {
                return;
            }
            this.h0 = true;
            this.b().C().b(zzno0.X, "Registering trigger URI");
            ListenableFuture listenableFuture0 = measurementManagerFutures0.registerTriggerAsync(Uri.parse(zzno0.X));
            if(listenableFuture0 == null) {
                this.h0 = false;
                this.L().add(zzno0);
                return;
            }
            if(!this.n().t(s.N0)) {
                SparseArray sparseArray0 = this.o().z();
                sparseArray0.put(zzno0.Z, ((long)zzno0.Y));
                this.o().u(sparseArray0);
            }
            p p0 = new p(3, this);
            io.sentry.config.a.q(listenableFuture0, new k(14, this, zzno0, false), p0);
        }
    }

    public final void R() {
        this.q();
        String s = this.o().m0.x();
        d0 d00 = (d0)this.Y;
        if(s != null) {
            if("unset".equals(s)) {
                d00.l0.getClass();
                this.x(System.currentTimeMillis(), null, "app", "_npa");
            }
            else {
                d00.l0.getClass();
                this.x(System.currentTimeMillis(), ((long)("true".equals(s) ? 1L : 0L)), "app", "_npa");
            }
        }
        if(d00.i() && this.q0) {
            this.b().l0.d("Recording app launch after enabling measurement for the first time (FE)");
            this.M();
            this.t().d0.H();
            this.c().z(new g0(this));
            return;
        }
        this.b().l0.d("Updating Scion state (FE)");
        P0 p00 = d00.q();
        p00.q();
        p00.u();
        p00.z(new T0(p00, p00.J(true), 3));
    }

    public final void S(Bundle bundle0, long v) {
        r.j(bundle0);
        Bundle bundle1 = new Bundle(bundle0);
        if(!TextUtils.isEmpty(bundle1.getString("app_id"))) {
            this.b().h0.d("Package name should be null when calling setConditionalUserProperty");
        }
        bundle1.remove("app_id");
        t0.a(bundle1, "app_id", String.class, null);
        t0.a(bundle1, "origin", String.class, null);
        t0.a(bundle1, "name", String.class, null);
        t0.a(bundle1, "value", Object.class, null);
        t0.a(bundle1, "trigger_event_name", String.class, null);
        t0.a(bundle1, "trigger_timeout", Long.class, 0L);
        t0.a(bundle1, "timed_out_event_name", String.class, null);
        t0.a(bundle1, "timed_out_event_params", Bundle.class, null);
        t0.a(bundle1, "triggered_event_name", String.class, null);
        t0.a(bundle1, "triggered_event_params", Bundle.class, null);
        t0.a(bundle1, "time_to_live", Long.class, 0L);
        t0.a(bundle1, "expired_event_name", String.class, null);
        t0.a(bundle1, "expired_event_params", Bundle.class, null);
        r.f(bundle1.getString("name"));
        r.f(bundle1.getString("origin"));
        r.j(bundle1.get("value"));
        bundle1.putLong("creation_timestamp", v);
        String s = bundle1.getString("name");
        Object object0 = bundle1.get("value");
        int v1 = this.p().j0(s);
        d0 d00 = (d0)this.Y;
        if(v1 != 0) {
            L l0 = this.b();
            String s1 = d00.k0.g(s);
            l0.e0.b(s1, "Invalid conditional user property name");
            return;
        }
        if(this.p().u(object0, s) != 0) {
            L l1 = this.b();
            String s2 = d00.k0.g(s);
            l1.e0.c(s2, "Invalid conditional user property value", object0);
            return;
        }
        Object object1 = this.p().p0(object0, s);
        if(object1 == null) {
            L l2 = this.b();
            String s3 = d00.k0.g(s);
            l2.e0.c(s3, "Unable to normalize conditional user property value", object0);
            return;
        }
        t0.e(bundle1, object1);
        long v2 = bundle1.getLong("trigger_timeout");
        if(!TextUtils.isEmpty(bundle1.getString("trigger_event_name")) && (v2 > 15552000000L || v2 < 1L)) {
            L l3 = this.b();
            String s4 = d00.k0.g(s);
            l3.e0.c(s4, "Invalid conditional user property timeout", v2);
            return;
        }
        long v3 = bundle1.getLong("time_to_live");
        if(v3 <= 15552000000L && v3 >= 1L) {
            this.c().z(new y0(this, bundle1, 2));
            return;
        }
        L l4 = this.b();
        String s5 = d00.k0.g(s);
        l4.e0.c(s5, "Invalid conditional user property time to live", v3);
    }

    public final void T(String s) {
        this.f0.set(s);
    }

    public final void U(String s, String s1, Bundle bundle0) {
        this.q();
        ((d0)this.Y).l0.getClass();
        this.G(s, s1, System.currentTimeMillis(), bundle0);
    }

    @Override  // j6.U
    public final boolean w() {
        return false;
    }

    public final void x(long v, Object object0, String s, String s1) {
        boolean z;
        String s2 = "false";
        r.f(s);
        r.f(s1);
        this.q();
        this.u();
        if("allow_personalized_ads".equals(s1)) {
            if(object0 instanceof String && !TextUtils.isEmpty(((String)object0))) {
                long v1 = "false".equals(((String)object0).toLowerCase(Locale.ENGLISH)) ? 1L : 0L;
                object0 = v1;
                V v2 = this.o();
                if(v1 == 1L) {
                    s2 = "true";
                }
                v2.m0.y(s2);
                s1 = "_npa";
            }
            else if(object0 == null) {
                this.o().m0.y("unset");
                s1 = "_npa";
            }
            this.b().m0.c("non_personalized_ads(_npa)", "Setting user property(FE)", object0);
        }
        d0 d00 = (d0)this.Y;
        if(!d00.i()) {
            this.b().m0.d("User property not set since app measurement is disabled");
            return;
        }
        if(!d00.j()) {
            return;
        }
        zzon zzon0 = new zzon(v, object0, s1, s);
        P0 p00 = b.n(d00);
        E e0 = ((d0)p00.Y).o();
        e0.getClass();
        Parcel parcel0 = Parcel.obtain();
        zzon0.writeToParcel(parcel0, 0);
        byte[] arr_b = parcel0.marshall();
        parcel0.recycle();
        if(arr_b.length > 0x20000) {
            e0.b().f0.d("User property too long for local database. Sending directly to service");
            z = false;
        }
        else {
            z = e0.y(1, arr_b);
        }
        p00.z(new S0(p00, p00.J(true), z, zzon0, 0));
    }

    public final void y(long v, boolean z) {
        this.q();
        this.u();
        this.b().l0.d("Resetting analytics data (FE)");
        a1 a10 = this.t();
        a10.q();
        h0 h00 = a10.e0;
        ((d1)h00.Z).a();
        a1 a11 = (a1)h00.b0;
        if(((d0)a11.Y).e0.B(null, s.b1)) {
            ((d0)a11.Y).l0.getClass();
            h00.X = SystemClock.elapsedRealtime();
        }
        else {
            h00.X = 0L;
        }
        h00.Y = h00.X;
        d0 d00 = (d0)this.Y;
        d00.n().z();
        boolean z1 = d00.i();
        V v1 = this.o();
        v1.f0.b(v);
        if(!TextUtils.isEmpty(v1.o().v0.x())) {
            v1.v0.y(null);
        }
        v1.p0.b(0L);
        v1.q0.b(0L);
        Boolean boolean0 = ((d0)v1.Y).e0.z("firebase_analytics_collection_deactivated");
        if(boolean0 == null || !boolean0.booleanValue()) {
            v1.w(!z1);
        }
        v1.w0.y(null);
        v1.x0.b(0L);
        v1.y0.j(null);
        if(z) {
            P0 p00 = b.n(d00);
            zzo zzo0 = p00.J(false);
            ((d0)p00.Y).o().z();
            p00.z(new T0(p00, zzo0, 0));
        }
        this.t().d0.H();
        this.q0 = !z1;
    }

    public final void z(Bundle bundle0, int v, long v1) {
        Boolean boolean0;
        String s;
        this.u();
        p0[] arr_p0 = r0.Y.X;
        for(int v2 = 0; true; ++v2) {
            s = null;
            if(v2 >= arr_p0.length) {
                break;
            }
            p0 p00 = arr_p0[v2];
            if(bundle0.containsKey(p00.X)) {
                s = bundle0.getString(p00.X);
                if(s != null) {
                    if(s.equals("granted")) {
                        boolean0 = Boolean.TRUE;
                    }
                    else {
                        boolean0 = s.equals("denied") ? Boolean.FALSE : null;
                    }
                    if(boolean0 != null) {
                        continue;
                    }
                    break;
                }
            }
        }
        if(s != null) {
            this.b().j0.b(s, "Ignoring invalid consent setting");
            this.b().j0.d("Valid consent values are \'granted\', \'denied\'");
        }
        boolean z = this.c().B();
        q0 q00 = q0.b(v, bundle0);
        Iterator iterator0 = q00.a.values().iterator();
        while(true) {
            boolean z1 = iterator0.hasNext();
            s0 s00 = s0.Y;
            if(!z1) {
                break;
            }
            Object object0 = iterator0.next();
            if(((s0)object0) != s00) {
                this.C(q00, v1, z);
                break;
            }
        }
        l l0 = l.a(v, bundle0);
        for(Object object1: l0.e.values()) {
            if(((s0)object1) != s00) {
                this.A(l0, z);
                break;
            }
            if(false) {
                break;
            }
        }
        Boolean boolean1 = l.c(bundle0);
        if(boolean1 != null) {
            String s1 = v == -30 ? "tcf" : "app";
            if(((d0)this.Y).e0.B(null, s.S0) && z) {
                this.x(v1, boolean1.toString(), s1, "allow_personalized_ads");
                return;
            }
            this.K(s1, "allow_personalized_ads", boolean1.toString(), false, v1);
        }
    }
}

