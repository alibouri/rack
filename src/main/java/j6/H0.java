package j6;

import G1.n;
import K5.g;
import N5.r;
import Q4.j;
import S5.b;
import S5.c;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.F;
import com.google.android.gms.internal.measurement.G;
import com.google.android.gms.measurement.internal.zzae;
import com.google.android.gms.measurement.internal.zzaj;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzo;
import com.google.android.gms.measurement.internal.zzon;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class h0 extends G implements C {
    public final k1 d;
    public Boolean e;
    public String f;

    public h0(k1 k10) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        r.j(k10);
        this.d = k10;
        this.f = null;
    }

    @Override  // j6.C
    public final byte[] A(zzbf zzbf0, String s) {
        r.f(s);
        r.j(zzbf0);
        this.e(s, true);
        k1 k10 = this.d;
        L l0 = k10.b();
        d0 d00 = k10.j0;
        String s1 = zzbf0.X;
        String s2 = d00.k0.c(s1);
        l0.l0.b(s2, "Log and bundle. event");
        ((b)k10.f()).getClass();
        long v = System.nanoTime();
        b0 b00 = k10.c().y(new j(this, zzbf0, s));
        try {
            byte[] arr_b = (byte[])b00.get();
            if(arr_b == null) {
                L l1 = k10.b();
                M m0 = L.u(s);
                l1.e0.b(m0, "Log and bundle returned null. appId");
                arr_b = new byte[0];
            }
            ((b)k10.f()).getClass();
            L l2 = k10.b();
            String s3 = d00.k0.c(s1);
            l2.l0.e("Log and bundle processed. event, size, time_ms", s3, ((int)arr_b.length), ((long)(System.nanoTime() / 1000000L - v / 1000000L)));
            return arr_b;
        }
        catch(InterruptedException | ExecutionException interruptedException0) {
        }
        L l3 = k10.b();
        M m1 = L.u(s);
        String s4 = d00.k0.c(s1);
        l3.e0.e("Failed to log and bundle. appId, event, error", m1, s4, interruptedException0);
        return null;
    }

    @Override  // j6.C
    public final void B(zzae zzae0, zzo zzo0) {
        r.j(zzae0);
        r.j(zzae0.Z);
        this.J(zzo0);
        zzae zzae1 = new zzae(zzae0);
        zzae1.X = zzo0.X;
        this.K(new n(this, zzae1, zzo0, 4));
    }

    @Override  // j6.C
    public final void C(long v, String s, String s1, String s2) {
        this.K(new k0(this, s1, s2, s, v, 0));
    }

    @Override  // j6.C
    public final void D(zzo zzo0) {
        this.J(zzo0);
        this.K(new j0(this, zzo0, 4));
    }

    @Override  // j6.C
    public final List E(String s, String s1, String s2) {
        this.e(s, true);
        k1 k10 = this.d;
        b0 b00 = k10.c().u(new l0(this, s, s1, s2, 2));
        try {
            return (List)b00.get();
        }
        catch(InterruptedException | ExecutionException interruptedException0) {
            k10.b().e0.b(interruptedException0, "Failed to get conditional user properties as");
            return Collections.emptyList();
        }
    }

    @Override  // j6.C
    public final void F(zzo zzo0) {
        this.J(zzo0);
        this.K(new j0(this, zzo0, 3));
    }

    @Override  // j6.C
    public final void I(zzbf zzbf0, zzo zzo0) {
        r.j(zzbf0);
        this.J(zzo0);
        this.K(new n(this, zzbf0, zzo0, 5));
    }

    public final void J(zzo zzo0) {
        r.j(zzo0);
        r.f(zzo0.X);
        this.e(zzo0.X, false);
        this.d.c0().b0(zzo0.Y, zzo0.o0);
    }

    public final void K(Runnable runnable0) {
        k1 k10 = this.d;
        if(k10.c().B()) {
            runnable0.run();
            return;
        }
        k10.c().z(runnable0);
    }

    public final void L(zzbf zzbf0, zzo zzo0) {
        this.d.d0();
        this.d.r(zzbf0, zzo0);
    }

    @Override  // com.google.android.gms.internal.measurement.G
    public final boolean b(int v, Parcel parcel0, Parcel parcel1) {
        ArrayList arrayList0 = null;
        k1 k10 = this.d;
        boolean z = false;
        switch(v) {
            case 1: {
                zzbf zzbf0 = (zzbf)F.a(parcel0, zzbf.CREATOR);
                zzo zzo0 = (zzo)F.a(parcel0, zzo.CREATOR);
                F.d(parcel0);
                this.I(zzbf0, zzo0);
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                zzon zzon0 = (zzon)F.a(parcel0, zzon.CREATOR);
                zzo zzo1 = (zzo)F.a(parcel0, zzo.CREATOR);
                F.d(parcel0);
                this.u(zzon0, zzo1);
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                zzo zzo2 = (zzo)F.a(parcel0, zzo.CREATOR);
                F.d(parcel0);
                this.j(zzo2);
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                zzbf zzbf1 = (zzbf)F.a(parcel0, zzbf.CREATOR);
                String s = parcel0.readString();
                parcel0.readString();
                F.d(parcel0);
                r.j(zzbf1);
                r.f(s);
                this.e(s, true);
                this.K(new n(this, zzbf1, s, 6));
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                zzo zzo3 = (zzo)F.a(parcel0, zzo.CREATOR);
                F.d(parcel0);
                this.F(zzo3);
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                zzo zzo4 = (zzo)F.a(parcel0, zzo.CREATOR);
                if(parcel0.readInt() != 0) {
                    z = true;
                }
                F.d(parcel0);
                this.J(zzo4);
                String s1 = zzo4.X;
                r.j(s1);
                b0 b00 = k10.c().u(new Ma.n(this, 2, s1));
                try {
                    List list0 = (List)b00.get();
                    ArrayList arrayList1 = new ArrayList(list0.size());
                    for(Object object0: list0) {
                        p1 p10 = (p1)object0;
                        if(z || !r1.w0(p10.c)) {
                            arrayList1.add(new zzon(p10));
                        }
                    }
                    arrayList0 = arrayList1;
                }
                catch(InterruptedException | ExecutionException interruptedException0) {
                    L l0 = k10.b();
                    M m0 = L.u(s1);
                    l0.e0.c(m0, "Failed to get user properties. appId", interruptedException0);
                }
                parcel1.writeNoException();
                parcel1.writeTypedList(arrayList0);
                return true;
            }
            case 9: {
                zzbf zzbf2 = (zzbf)F.a(parcel0, zzbf.CREATOR);
                String s2 = parcel0.readString();
                F.d(parcel0);
                byte[] arr_b = this.A(zzbf2, s2);
                parcel1.writeNoException();
                parcel1.writeByteArray(arr_b);
                return true;
            }
            case 10: {
                long v1 = parcel0.readLong();
                String s3 = parcel0.readString();
                String s4 = parcel0.readString();
                String s5 = parcel0.readString();
                F.d(parcel0);
                this.C(v1, s3, s4, s5);
                parcel1.writeNoException();
                return true;
            }
            case 11: {
                zzo zzo5 = (zzo)F.a(parcel0, zzo.CREATOR);
                F.d(parcel0);
                String s6 = this.x(zzo5);
                parcel1.writeNoException();
                parcel1.writeString(s6);
                return true;
            }
            case 12: {
                zzae zzae0 = (zzae)F.a(parcel0, zzae.CREATOR);
                zzo zzo6 = (zzo)F.a(parcel0, zzo.CREATOR);
                F.d(parcel0);
                this.B(zzae0, zzo6);
                parcel1.writeNoException();
                return true;
            }
            case 13: {
                zzae zzae1 = (zzae)F.a(parcel0, zzae.CREATOR);
                F.d(parcel0);
                r.j(zzae1);
                r.j(zzae1.Z);
                r.f(zzae1.X);
                this.e(zzae1.X, true);
                this.K(new Y6.b(29, this, new zzae(zzae1), false));
                parcel1.writeNoException();
                return true;
            }
            case 14: {
                String s7 = parcel0.readString();
                String s8 = parcel0.readString();
                if(parcel0.readInt() != 0) {
                    z = true;
                }
                zzo zzo7 = (zzo)F.a(parcel0, zzo.CREATOR);
                F.d(parcel0);
                List list1 = this.v(s7, s8, z, zzo7);
                parcel1.writeNoException();
                parcel1.writeTypedList(list1);
                return true;
            }
            case 15: {
                String s9 = parcel0.readString();
                String s10 = parcel0.readString();
                String s11 = parcel0.readString();
                if(parcel0.readInt() != 0) {
                    z = true;
                }
                F.d(parcel0);
                List list2 = this.q(s9, s10, s11, z);
                parcel1.writeNoException();
                parcel1.writeTypedList(list2);
                return true;
            }
            case 16: {
                String s12 = parcel0.readString();
                String s13 = parcel0.readString();
                zzo zzo8 = (zzo)F.a(parcel0, zzo.CREATOR);
                F.d(parcel0);
                List list3 = this.h(s12, s13, zzo8);
                parcel1.writeNoException();
                parcel1.writeTypedList(list3);
                return true;
            }
            case 17: {
                String s14 = parcel0.readString();
                String s15 = parcel0.readString();
                String s16 = parcel0.readString();
                F.d(parcel0);
                List list4 = this.E(s14, s15, s16);
                parcel1.writeNoException();
                parcel1.writeTypedList(list4);
                return true;
            }
            case 18: {
                zzo zzo9 = (zzo)F.a(parcel0, zzo.CREATOR);
                F.d(parcel0);
                this.s(zzo9);
                parcel1.writeNoException();
                return true;
            }
            case 19: {
                Bundle bundle0 = (Bundle)F.a(parcel0, Bundle.CREATOR);
                zzo zzo10 = (zzo)F.a(parcel0, zzo.CREATOR);
                F.d(parcel0);
                this.d(bundle0, zzo10);
                parcel1.writeNoException();
                return true;
            }
            case 20: {
                zzo zzo11 = (zzo)F.a(parcel0, zzo.CREATOR);
                F.d(parcel0);
                this.t(zzo11);
                parcel1.writeNoException();
                return true;
            }
            case 21: {
                zzo zzo12 = (zzo)F.a(parcel0, zzo.CREATOR);
                F.d(parcel0);
                zzaj zzaj0 = this.p(zzo12);
                parcel1.writeNoException();
                if(zzaj0 == null) {
                    parcel1.writeInt(0);
                    return true;
                }
                parcel1.writeInt(1);
                zzaj0.writeToParcel(parcel1, 1);
                return true;
            }
            case 24: {
                zzo zzo13 = (zzo)F.a(parcel0, zzo.CREATOR);
                Bundle bundle1 = (Bundle)F.a(parcel0, Bundle.CREATOR);
                F.d(parcel0);
                List list5 = this.d(bundle1, zzo13);
                parcel1.writeNoException();
                parcel1.writeTypedList(list5);
                return true;
            }
            case 25: {
                zzo zzo14 = (zzo)F.a(parcel0, zzo.CREATOR);
                F.d(parcel0);
                this.n(zzo14);
                parcel1.writeNoException();
                return true;
            }
            case 26: {
                zzo zzo15 = (zzo)F.a(parcel0, zzo.CREATOR);
                F.d(parcel0);
                this.z(zzo15);
                parcel1.writeNoException();
                return true;
            }
            case 27: {
                zzo zzo16 = (zzo)F.a(parcel0, zzo.CREATOR);
                F.d(parcel0);
                this.D(zzo16);
                parcel1.writeNoException();
                return true;
            }
            case 28: {
                Bundle bundle2 = (Bundle)F.a(parcel0, Bundle.CREATOR);
                zzo zzo17 = (zzo)F.a(parcel0, zzo.CREATOR);
                F.d(parcel0);
                if(k10.S().B(null, s.g1)) {
                    this.J(zzo17);
                    r.j(zzo17.X);
                    i0 i00 = new i0(0);
                    i00.Y = this;
                    i00.Z = bundle2;
                    i00.b0 = zzo17.X;
                    this.K(i00);
                }
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public final void c(Runnable runnable0) {
        k1 k10 = this.d;
        if(k10.c().B()) {
            runnable0.run();
            return;
        }
        k10.c().A(runnable0);
    }

    @Override  // j6.C
    public final List d(Bundle bundle0, zzo zzo0) {
        this.J(zzo0);
        String s = zzo0.X;
        r.j(s);
        k1 k10 = this.d;
        b0 b00 = k10.c().u(new m0(this, zzo0, bundle0));
        try {
            return (List)b00.get();
        }
        catch(InterruptedException | ExecutionException interruptedException0) {
            L l0 = k10.b();
            M m0 = L.u(s);
            l0.e0.c(m0, "Failed to get trigger URIs. appId", interruptedException0);
            return Collections.emptyList();
        }
    }

    @Override  // j6.C
    public final void d(Bundle bundle0, zzo zzo0) {
        this.J(zzo0);
        r.j(zzo0.X);
        i0 i00 = new i0(1);
        i00.Y = this;
        i00.Z = bundle0;
        i00.b0 = zzo0.X;
        this.K(i00);
    }

    public final void e(String s, boolean z) {
        boolean z2;
        boolean z1 = TextUtils.isEmpty(s);
        k1 k10 = this.d;
        if(!z1) {
            try {
                if(z) {
                    if(this.e == null) {
                        if("com.google.android.gms".equals(this.f)) {
                            z2 = true;
                        }
                        else {
                            int v = Binder.getCallingUid();
                            z2 = c.e(k10.j0.X, v) || g.a(k10.j0.X).b(Binder.getCallingUid());
                        }
                        this.e = Boolean.valueOf(z2);
                    }
                    if(!this.e.booleanValue()) {
                        goto label_15;
                    }
                    return;
                }
            label_15:
                if(this.f == null && c.g(Binder.getCallingUid(), k10.j0.X, s)) {
                    this.f = s;
                }
                if(!s.equals(this.f)) {
                    throw new SecurityException("Unknown calling package name \'" + s + "\'.");
                }
                return;
            }
            catch(SecurityException securityException0) {
            }
            L l0 = k10.b();
            M m0 = L.u(s);
            l0.e0.b(m0, "Measurement Service called with invalid calling package. appId");
            throw securityException0;
        }
        k10.b().e0.d("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    @Override  // j6.C
    public final List h(String s, String s1, zzo zzo0) {
        this.J(zzo0);
        r.j(zzo0.X);
        k1 k10 = this.d;
        b0 b00 = k10.c().u(new l0(this, zzo0.X, s, s1, 3));
        try {
            return (List)b00.get();
        }
        catch(InterruptedException | ExecutionException interruptedException0) {
            k10.b().e0.b(interruptedException0, "Failed to get conditional user properties");
            return Collections.emptyList();
        }
    }

    @Override  // j6.C
    public final void j(zzo zzo0) {
        this.J(zzo0);
        this.K(new j0(this, zzo0, 2));
    }

    @Override  // j6.C
    public final void n(zzo zzo0) {
        r.f(zzo0.X);
        r.j(zzo0.t0);
        j0 j00 = new j0(0);
        j00.Y = this;
        j00.Z = zzo0;
        this.c(j00);
    }

    @Override  // j6.C
    public final zzaj p(zzo zzo0) {
        this.J(zzo0);
        String s = zzo0.X;
        r.f(s);
        k1 k10 = this.d;
        b0 b00 = k10.c().y(new Ma.n(this, 1, zzo0));
        try {
            return (zzaj)b00.get(10000L, TimeUnit.MILLISECONDS);
        }
        catch(TimeoutException | InterruptedException | ExecutionException timeoutException0) {
            L l0 = k10.b();
            M m0 = L.u(s);
            l0.e0.c(m0, "Failed to get consent. appId", timeoutException0);
            return new zzaj(null);
        }
    }

    @Override  // j6.C
    public final List q(String s, String s1, String s2, boolean z) {
        this.e(s, true);
        k1 k10 = this.d;
        b0 b00 = k10.c().u(new l0(this, s, s1, s2, 0));
        try {
            List list0 = (List)b00.get();
            List list1 = new ArrayList(list0.size());
            for(Object object0: list0) {
                p1 p10 = (p1)object0;
                if(z || !r1.w0(p10.c)) {
                    ((ArrayList)list1).add(new zzon(p10));
                }
            }
            return list1;
        }
        catch(InterruptedException | ExecutionException interruptedException0) {
        }
        L l0 = k10.b();
        M m0 = L.u(s);
        l0.e0.c(m0, "Failed to get user properties as. appId", interruptedException0);
        return Collections.emptyList();
    }

    @Override  // j6.C
    public final void s(zzo zzo0) {
        r.f(zzo0.X);
        this.e(zzo0.X, false);
        this.K(new j0(this, zzo0, 6));
    }

    @Override  // j6.C
    public final void t(zzo zzo0) {
        r.f(zzo0.X);
        r.j(zzo0.t0);
        this.c(new j0(this, zzo0, 5));
    }

    @Override  // j6.C
    public final void u(zzon zzon0, zzo zzo0) {
        r.j(zzon0);
        this.J(zzo0);
        this.K(new n(this, zzon0, zzo0, 7));
    }

    @Override  // j6.C
    public final List v(String s, String s1, boolean z, zzo zzo0) {
        this.J(zzo0);
        String s2 = zzo0.X;
        r.j(s2);
        k1 k10 = this.d;
        b0 b00 = k10.c().u(new l0(this, s2, s, s1, 1));
        try {
            List list0 = (List)b00.get();
            List list1 = new ArrayList(list0.size());
            for(Object object0: list0) {
                p1 p10 = (p1)object0;
                if(z || !r1.w0(p10.c)) {
                    ((ArrayList)list1).add(new zzon(p10));
                }
            }
            return list1;
        }
        catch(InterruptedException | ExecutionException interruptedException0) {
        }
        L l0 = k10.b();
        M m0 = L.u(s2);
        l0.e0.c(m0, "Failed to query user properties. appId", interruptedException0);
        return Collections.emptyList();
    }

    @Override  // j6.C
    public final String x(zzo zzo0) {
        this.J(zzo0);
        k1 k10 = this.d;
        b0 b00 = k10.c().u(new Ma.n(k10, 3, zzo0));
        try {
            return (String)b00.get(30000L, TimeUnit.MILLISECONDS);
        }
        catch(TimeoutException | InterruptedException | ExecutionException timeoutException0) {
            L l0 = k10.b();
            M m0 = L.u(zzo0.X);
            l0.e0.c(m0, "Failed to get app instance id. appId", timeoutException0);
            return null;
        }
    }

    @Override  // j6.C
    public final void z(zzo zzo0) {
        r.f(zzo0.X);
        r.j(zzo0.t0);
        j0 j00 = new j0(1);
        j00.Y = this;
        j00.Z = zzo0;
        this.c(j00);
    }
}

