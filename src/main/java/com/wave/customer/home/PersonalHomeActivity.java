package com.wave.customer.home;

import Ab.k;
import Ab.o;
import B9.b;
import Bb.F;
import C3.i;
import E7.w;
import I2.B;
import I2.e;
import J2.u;
import J9.p;
import R9.Z0;
import Vb.q;
import W4.f;
import Xb.I0;
import Xb.J;
import Y8.N;
import Y8.R6;
import Y8.V;
import Ya.d;
import a5.c;
import ac.B0;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Base64;
import android.view.Menu;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import c2.I;
import com.sendwave.backend.FragmentHandle;
import com.sendwave.backend.fragment.AnnouncementFragment;
import com.wave.components.AssociateTokenWithUserWorker;
import com.wave.customer.accountswitcher.UpdateDeviceSessionsWorker;
import f.g;
import f9.E;
import ha.C0;
import ha.E0;
import ha.J0;
import ha.L0;
import ha.S2;
import ha.X0;
import ha.Z1;
import ha.a;
import ha.c2;
import ha.j;
import ha.r;
import ha.v;
import hb.n;
import io.sentry.Q0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import q9.A1;
import q9.C1;
import q9.C3;
import q9.D0;
import q9.W0;
import q9.W;
import q9.Y;
import q9.d0;
import q9.k3;
import q9.l;
import q9.m;
import q9.o0;
import q9.p0;
import q9.r1;
import q9.s1;
import q9.t1;
import q9.u1;
import q9.v1;
import q9.v2;
import q9.x1;
import q9.z1;

public final class PersonalHomeActivity extends k3 {
    public final o F0;
    public final o G0;
    public final o H0;
    public S2 I0;
    public final g J0;
    public final o K0;
    public g L0;
    public final o M0;
    public final o N0;
    public final o O0;
    public final c P0;
    public static final x1 Q0;
    public static final u1 R0;
    public static final v1 S0;

    static {
        PersonalHomeActivity.Q0 = new x1("FirstSeenInstallerPackage");  // initializer: LB4/e;-><init>(Ljava/lang/String;)V
        PersonalHomeActivity.R0 = new u1("ShowReverseTxAnnouncement", false);
        PersonalHomeActivity.S0 = new v1("TimesAnnouncementSeen");  // initializer: LB4/e;-><init>(Ljava/lang/String;)V
    }

    public PersonalHomeActivity() {
        this.F0 = f.A(new j(this, 0));
        this.G0 = f.A(new j(this, 1));
        this.H0 = f.A(new j(this, 2));
        this.J0 = (g)this.v(new I(3), new w(15, this));
        this.K0 = f.A(new j(this, 3));
        this.M0 = f.A(new j(this, 4));
        this.N0 = f.A(new j(this, 5));
        this.O0 = f.A(new j(this, 6));
        this.P0 = new c(6, this);
    }

    public final B9.f I() {
        return (B9.f)this.G0.getValue();
    }

    public final void J() {
        String s3;
        Uri uri0 = this.getIntent().getData();
        if(uri0 == null) {
            return;
        }
        S2 s20 = this.I0;
        if(s20 != null) {
            X0 x00 = new X0(uri0, s20, null);
            N.k(s20, s20.r0, false, x00);
            r1.b(this).e().d("receive deep link", F.J(new k("deep_link_url", uri0.toString())));
            if(Nb.j.a(uri0.getScheme(), "wave") && Nb.j.a(uri0.getHost(), "capture")) {
                String s = uri0.toString();
                Nb.j.e(s, "toString(...)");
                String s1 = s.substring(15);
                Nb.j.e(s1, "substring(...)");
                uri0 = Uri.parse(s1);
            }
            String s2 = uri0.getHost();
            if(s2 == null) {
                s3 = null;
            }
            else {
                Locale locale0 = Locale.getDefault();
                Nb.j.e(locale0, "getDefault(...)");
                s3 = s2.toLowerCase(locale0);
                Nb.j.e(s3, "toLowerCase(...)");
            }
            if(s3 != null && q.I(s3, ".wave.com", false)) {
                S2 s21 = this.I0;
                if(s21 != null) {
                    E0 e00 = new E0(uri0, s21, null);
                    N.k(s21, s21.r0, false, e00);
                    this.getIntent().setData(null);
                    return;
                }
                Nb.j.p("viewmodel");
                throw null;
            }
            else if(Nb.j.a(s3, "mm")) {
                S2 s22 = this.I0;
                if(s22 != null) {
                    C0 c00 = new C0(uri0, s22, null);
                    N.k(s22, s22.r0, false, c00);
                    this.getIntent().setData(null);
                    return;
                }
                Nb.j.p("viewmodel");
                throw null;
            }
            else if(!Nb.j.a(s3, "mm")) {
                Q0.b().p("Unexpected URL passed as intent data " + uri0);
            }
            this.getIntent().setData(null);
            return;
        }
        Nb.j.p("viewmodel");
        throw null;
    }

    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        AnnouncementFragment announcementFragment0;
        S2 s21;
        Bundle bundle1;
        if(bundle0 != null && Build.VERSION.SDK_INT == 29 && bundle0.containsKey("BadParcelableFix")) {
            CharSequence charSequence0 = bundle0.getCharSequence("BadParcelableFix");
            if(charSequence0 instanceof p0) {
                bundle1 = ((p0)charSequence0).X;
            }
            else {
                byte[] arr_b = Base64.decode(String.valueOf(charSequence0), 0);
                Nb.j.e(arr_b, "decode(...)");
                Parcel parcel0 = Parcel.obtain();
                Nb.j.e(parcel0, "obtain(...)");
                parcel0.unmarshall(arr_b, 0, arr_b.length);
                parcel0.setDataPosition(0);
                bundle1 = parcel0.readBundle(o0.class.getClassLoader());
                Nb.j.c(bundle1);
                parcel0.recycle();
            }
            bundle0.remove("BadParcelableFix");
            bundle0.putAll(bundle1);
        }
        super.onCreate(bundle0);
        if(Build.VERSION.SDK_INT <= 29) {
            R2.f.z(this.getWindow(), false);
        }
        if(!C1.a()) {
            return;
        }
        String s = this.I().h();
        b b0 = s == null ? null : this.I().a(s);
        LifecycleRegistry lifecycleRegistry0 = this.X;
        if(s == null || b0 == null) {
            String s1 = this.I().n;
            n.d("home created when user logged out", null, (s1 == null ? null : com.apollographql.apollo.api.b.t("logout_reason", s1)), false, 10);
            this.finish();
            s21 = null;
        }
        else {
            Ma.b b1 = new Ma.b(this);
            a a0 = new a(this);
            Context context0 = this.getApplicationContext();
            Nb.j.e(context0, "getApplicationContext(...)");
            S2 s20 = (S2)new ViewModelProvider(this, new ha.o(this, new v2(context0), new i(this), b1, s, a0, (t1.h0.Y ? new m(this, "DeviceApproval") : new m(t1.h0, this)), (t1.f0.Y ? new m(this, "ScratchCards") : new m(t1.f0, this)), new d(this, 1, r1.b(this).k()))).a(S2.class);
            ha.k k0 = new ha.k(this);
            s20.r0.c(this, k0);
            lifecycleRegistry0.a(s20.y0);
            new E(this, s20.y0.o0, null);
            s20.P0.getClass();
            s20.P0.c0 = s20.r0;
            lifecycleRegistry0.a(s20);
            this.C(s20.S0);
            s21 = s20;
        }
        if(s21 == null) {
            return;
        }
        this.I0 = s21;
        ha.m m0 = new ha.m(1, s21, S2.class, "onSignupLoginResult", "onSignupLoginResult(Lcom/wave/customer/SignupSuccess;)V", 0, 2);
        this.L0 = (g)this.v(new I(4), new w(m0));
        S2 s22 = this.I0;
        if(s22 != null) {
            int v = s22.l0.a.l(Ta.f.c);
            if(s22.l0.b < v) {
                Z1 z10 = new Z1(s22, null);
                N.k(s22, s22.r0, false, z10);
                return;
            }
            S2 s23 = this.I0;
            if(s23 != null) {
                c2 c20 = new c2(s23, null);
                N.k(s23, s23.r0, false, c20);
                S2 s24 = this.I0;
                if(s24 != null) {
                    d0 d00 = s24.y0;
                    String s2 = d00.Y.a.a(A1.h);
                    l l0 = new l(d00.Y.a);
                    l0.a(A1.h);
                    l0.commit();
                    hd.a a1 = hd.c.a;
                    a1.n("Announcements");
                    a1.d("Retrieving Splash Announcement, nodeId: " + s2, new Object[0]);
                    FragmentHandle fragmentHandle0 = s2 == null ? null : new FragmentHandle(new O3.b(s2), FragmentHandle.Z);
                    if(fragmentHandle0 != null) {
                        try {
                            Y y0 = new Y(d00, fragmentHandle0, null);
                            announcementFragment0 = (AnnouncementFragment)J.t(kotlin.coroutines.j.X, y0);
                        }
                        catch(V v1) {
                            hd.c.a.n("Announcements");
                            hd.c.a.e(v1, "Error while inflating fragment", new Object[0]);
                            goto label_84;
                        }
                        if(announcementFragment0 != null) {
                            a1.n("Announcements");
                            a1.g("Showing splash announcement " + announcementFragment0.getId(), new Object[0]);
                            W w0 = new W(announcementFragment0, d00, null);
                            N.j(d00, d00.c0, false, w0);
                        }
                    }
                label_84:
                    S2 s25 = this.I0;
                    if(s25 != null) {
                        r r0 = new r(this, 0);
                        o0.e(s25.u1, this, r0);
                        S2 s26 = this.I0;
                        if(s26 != null) {
                            r r1 = new r(this, 1);
                            o0.e(s26.y0.h0.g0, this, r1);
                            o0.R(this, new Ta.k(this, null));
                            J.q(LifecycleOwnerKt.a(this), null, null, new v(this, null), 3);
                            if(Build.VERSION.SDK_INT >= 33 && w1.c.a(this, "android.permission.POST_NOTIFICATIONS") != 0 && !this.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")) {
                                this.J0.a("android.permission.POST_NOTIFICATIONS");
                            }
                            Context context1 = this.getApplicationContext();
                            Nb.j.e(context1, "getApplicationContext(...)");
                            o o0 = this.F0;
                            R6 r60 = (R6)o0.getValue();
                            Nb.j.f(r60, "repo");
                            K3.b b2 = new K3.b(context1);
                            try {
                                b2.c(new R2.w(b2, context1, r60, 18));
                            }
                            catch(SecurityException unused_ex) {
                                hd.c.a.n("InstallReferrerClient");
                                hd.c.a.d("Unable to retrieve referrer because SecurityException", new Object[0]);
                            }
                            finally {
                                b2.a();
                            }
                            C3 c30 = ((p)Z0.a(this).u0.getValue()).a;
                            for(Object object0: c30.d().f()) {
                                u u0 = u.V(c30);
                                Nb.j.e(u0, "getInstance(context)");
                                Nb.j.f(((String)object0), "mobile");
                                E7.u u1 = new E7.u(AssociateTokenWithUserWorker.class);
                                LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                                linkedHashMap0.put("mobile", ((String)object0));
                                I2.m m1 = new I2.m(linkedHashMap0);
                                yc.d.H(m1);
                                ((R2.p)u1.c).e = m1;
                                e e0 = new e();
                                I2.J.O(e0);
                                ((R2.p)u1.c).j = e0.a();
                                u1.s(1, TimeUnit.MILLISECONDS);
                                u0.z("AssociateTokenWithUserWorker_" + ((String)object0), 1, u1.a());
                            }
                            this.J();
                            S2 s27 = this.I0;
                            if(s27 != null) {
                                J.q(ViewModelKt.a(s27), null, null, new ha.v1(s27, null), 3);
                                R6 r61 = (R6)o0.getValue();
                                S2 s28 = this.I0;
                                if(s28 != null) {
                                    lifecycleRegistry0.a(new xa.d(this, r61, s28));
                                    E9.a a2 = r1.b(this).e();
                                    k k1 = D0.b(this);
                                    String s3 = this.getPackageManager().getInstallerPackageName("com.wave.personal");
                                    m m2 = new m(this, "AmplitudeUserProps");
                                    x1 x10 = PersonalHomeActivity.Q0;
                                    String s4 = m2.a(x10);
                                    if(s4 == null) {
                                        s4 = this.getPackageManager().getInstallerPackageName("com.wave.personal");
                                        l l1 = new l(m2);
                                        o0.O(l1, x10, (s4 == null ? "null" : s4));
                                        l1.apply();
                                    }
                                    Cb.g g0 = new Cb.g();
                                    g0.put("app_version", r1.b(this).h());
                                    g0.put("cpu_abi", Build.CPU_ABI);
                                    PackageManager packageManager0 = r1.b(this).getPackageManager();
                                    Nb.j.e(packageManager0, "getPackageManager(...)");
                                    g0.put("is_play_store_installed", Boolean.valueOf(Bb.q.G(packageManager0, "com.android.vending")));
                                    PackageManager packageManager1 = r1.b(this).getPackageManager();
                                    Nb.j.e(packageManager1, "getPackageManager(...)");
                                    g0.put("is_huawei_app_gallery_installed", Boolean.valueOf(Bb.q.G(packageManager1, "com.huawei.appmarket")));
                                    g0.put("device_id", o0.u(this.getApplicationContext()));
                                    String[] arr_s = Build.SUPPORTED_ABIS;
                                    Nb.j.e(arr_s, "SUPPORTED_ABIS");
                                    g0.put("cpu_supported_abis", Bb.n.v0(arr_s));
                                    if(k1 != null) {
                                        g0.put("free_storage_mb", ((int)(((Number)k1.X).doubleValue() / 1024.0 / 1024.0)));
                                        g0.put("total_storage_mb", ((int)(((Number)k1.Y).doubleValue() / 1024.0 / 1024.0)));
                                    }
                                    if(s3 != null) {
                                        g0.put("installer_package", s3);
                                    }
                                    if(s4 != null) {
                                        g0.put("first_seen_installer_package", s4);
                                    }
                                    Configuration configuration0 = this.getResources().getConfiguration();
                                    g0.put("device_font_scale", ((float)configuration0.fontScale));
                                    int v3 = Build.VERSION.SDK_INT;
                                    if(v3 >= 0x1F) {
                                        g0.put("device_font_weight_adjustment", configuration0.fontWeightAdjustment);
                                    }
                                    g0.put("screen_width_dp", ((int)configuration0.screenWidthDp));
                                    g0.put("screen_height_dp", ((int)configuration0.screenHeightDp));
                                    g0.put("screen_density_dpi", ((int)configuration0.densityDpi));
                                    g0.put("display_logical_density", ((float)this.getResources().getDisplayMetrics().density));
                                    g0.put("dark_mode", Boolean.valueOf(this.getResources().getBoolean(0x7F050003)));  // bool:dark_mode
                                    S2 s29 = this.I0;
                                    if(s29 != null) {
                                        g0.put("hidden_tx", ((Collection)((B0)s29.F1.X).getValue()).size());
                                        if(v3 >= 33) {
                                            g0.put("push_notifications_enabled", Boolean.valueOf(w1.c.a(this, "android.permission.POST_NOTIFICATIONS") == 0));
                                        }
                                        g0.put("device_performance_class", ((W0)r1.b(this).e0.getValue()).X);
                                        a2.e(g0.b());
                                        r1.b(this).e().d("view home screen", null);
                                        o0.U(this, new c0.b(0x6588450A, new ha.p(this, 1), true));
                                        B9.f f0 = Z0.a(this).d();
                                        Iterable iterable0 = f0.f();
                                        ArrayList arrayList0 = new ArrayList();
                                        for(Object object1: iterable0) {
                                            b b3 = f0.a(((String)object1));
                                            if(b3 != null) {
                                                arrayList0.add(b3);
                                            }
                                        }
                                        LinkedHashMap linkedHashMap1 = new LinkedHashMap();
                                        for(Object object2: arrayList0) {
                                            String s5 = ((b)object2).d.Y;
                                            Object object3 = linkedHashMap1.get(s5);
                                            if(object3 == null) {
                                                object3 = new ArrayList();
                                                linkedHashMap1.put(s5, object3);
                                            }
                                            ((List)object3).add(object2);
                                        }
                                        ArrayList arrayList1 = new ArrayList();
                                        for(Object object4: linkedHashMap1.entrySet()) {
                                            Bb.v.f0(arrayList1, Bb.p.M0(((List)((Map.Entry)object4).getValue()), 1));
                                        }
                                        String s6 = UUID.randomUUID().toString();
                                        Nb.j.e(s6, "toString(...)");
                                        for(Object object5: arrayList1) {
                                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                            linkedHashMap2.put("mobile", ((b)object5).a);
                                            linkedHashMap2.put("reportID", s6);
                                            I2.m m3 = new I2.m(linkedHashMap2);
                                            yc.d.H(m3);
                                            u u2 = u.V(this);
                                            Nb.j.e(u2, "getInstance(context)");
                                            E7.u u3 = new E7.u(UpdateDeviceSessionsWorker.class);
                                            ((R2.p)u3.c).e = m3;
                                            e e1 = new e();
                                            I2.J.O(e1);
                                            ((R2.p)u3.c).j = e1.a();
                                            B b4 = u3.a();
                                            u2.z("updateDeviceSessions_" + ((b)object5).d.Y, 2, b4);
                                        }
                                        return;
                                    }
                                    Nb.j.p("viewmodel");
                                    throw null;
                                }
                                Nb.j.p("viewmodel");
                                throw null;
                            }
                            Nb.j.p("viewmodel");
                            throw null;
                        }
                        Nb.j.p("viewmodel");
                        throw null;
                    }
                    Nb.j.p("viewmodel");
                    throw null;
                }
                Nb.j.p("viewmodel");
                throw null;
            }
            Nb.j.p("viewmodel");
            throw null;
        }
        Nb.j.p("viewmodel");
        throw null;
    }

    @Override  // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu0) {
        Nb.j.f(menu0, "menu");
        super.onCreateOptionsMenu(menu0);
        return true;
    }

    @Override  // c.o
    public final void onNewIntent(Intent intent0) {
        Nb.j.f(intent0, "intent");
        super.onNewIntent(intent0);
        if(intent0.getData() != null) {
            this.setIntent(intent0);
        }
    }

    @Override  // c2.x
    public final void onPause() {
        super.onPause();
        i2.b.a(this).d(this.P0);
        this.getWindow().addFlags(0x2000);
        S2 s20 = this.I0;
        if(s20 != null) {
            I0 i00 = (I0)s20.y0.i0.b0;
            if(i00 != null) {
                i00.f(null);
            }
            S2 s21 = this.I0;
            if(s21 != null) {
                s21.y0.h0.i();
                return;
            }
            Nb.j.p("viewmodel");
            throw null;
        }
    }

    @Override  // q9.z3
    public final void onResume() {
        super.onResume();
        if(!C1.a()) {
            return;
        }
        S2 s20 = this.I0;
        if(s20 != null) {
            s20.C();
            this.J();
            i2.b b0 = i2.b.a(this);
            IntentFilter intentFilter0 = new IntentFilter("com.wave.components.NOTIFICATION_RECEIVED");
            b0.b(this.P0, intentFilter0);
            S2 s21 = this.I0;
            if(s21 != null) {
                L0 l00 = new L0(s21, null);
                N.k(s21, s21.r0, true, l00);
                S2 s22 = this.I0;
                if(s22 != null) {
                    J0 j00 = new J0(s22, null);
                    boolean z = false;
                    N.k(s22, s22.r0, false, j00);
                    b b1 = this.I().c();
                    u1 u10 = PersonalHomeActivity.R0;
                    if(b1 != null) {
                        z1 z10 = b1.d(t1.j0);
                        if(z10 != null) {
                            z = z10.k(u10);
                        }
                    }
                    o o0 = this.K0;
                    z1 z11 = (z1)o0.getValue();
                    v1 v10 = PersonalHomeActivity.S0;
                    int v = z11.l(v10);
                    if(z && v < 1) {
                        S2 s23 = this.I0;
                        if(s23 != null) {
                            Boolean boolean0 = Boolean.TRUE;
                            s23.a1.getClass();
                            s23.a1.l(null, boolean0);
                            r1.b(this).e().d("reverse tx bottom sheet announcement shown", null);
                            b b2 = this.I().c();
                            if(b2 != null) {
                                z1 z12 = b2.d(t1.j0);
                                if(z12 != null) {
                                    s1 s10 = z12.d();
                                    if(s10 != null) {
                                        s10.b(u10, Boolean.FALSE).apply();
                                    }
                                }
                            }
                            ((z1)o0.getValue()).d().b(v10, ((int)(v + 1))).apply();
                            return;
                        }
                        Nb.j.p("viewmodel");
                        throw null;
                    }
                    return;
                }
                Nb.j.p("viewmodel");
                throw null;
            }
            Nb.j.p("viewmodel");
            throw null;
        }
        Nb.j.p("viewmodel");
        throw null;
    }

    @Override  // c.o
    public final void onSaveInstanceState(Bundle bundle0) {
        Nb.j.f(bundle0, "outState");
        super.onSaveInstanceState(bundle0);
        if(Build.VERSION.SDK_INT == 29) {
            Bundle bundle1 = new Bundle();
            bundle1.putAll(bundle0);
            bundle0.clear();
            bundle0.putCharSequence("BadParcelableFix", new p0(bundle1));
        }
    }
}

