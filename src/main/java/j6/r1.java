package j6;

import K5.c;
import M.J;
import N5.r;
import O7.g;
import U5.b;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import com.google.android.gms.internal.measurement.U;
import com.google.android.gms.measurement.internal.zzae;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzon;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

public final class r1 extends o0 {
    public SecureRandom b0;
    public final AtomicLong c0;
    public int d0;
    public MeasurementManagerFutures e0;
    public Boolean f0;
    public Integer g0;
    public static final String[] h0;
    public static final String[] i0;

    static {
        r1.h0 = new String[]{"firebase_", "google_", "ga_"};
        r1.i0 = new String[]{"_err"};
    }

    public r1(d0 d00) {
        super(d00);
        this.g0 = null;
        this.c0 = new AtomicLong(0L);
    }

    // This method was un-flattened
    public final Bundle A(String s, Bundle bundle0, List list0, boolean z) {
        int v3;
        String s2;
        int v2;
        r1 r10 = this;
        boolean z1 = r1.e0(s, t0.d);
        if(bundle0 != null) {
            Bundle bundle1 = new Bundle(bundle0);
            d0 d00 = (d0)r10.Y;
            int v = d00.e0.p().h0(201500000) ? 100 : 25;
            int v1 = 0;
            for(Object object0: new TreeSet(bundle0.keySet())) {
                String s1 = (String)object0;
                if(list0 == null || !list0.contains(s1)) {
                    if(!z) {
                        if(!r10.r0("event param", s1)) {
                            v2 = 3;
                            s2 = s1;
                            goto label_36;
                        }
                        else if(!r10.f0("event param", null, null, s1)) {
                            v2 = 14;
                            s2 = null;
                            goto label_36;
                        }
                        else if(!r10.W(40, "event param", s1)) {
                            v2 = 3;
                            s2 = s1;
                            goto label_36;
                        }
                    }
                    if(!r10.o0("event param", s1)) {
                        v2 = 3;
                        s2 = s1;
                    label_36:
                        r1.H(bundle1, v2, s1, s2);
                        bundle1.remove(s1);
                        v3 = v;
                    }
                    else if(!r10.f0("event param", null, null, s1)) {
                        v2 = 14;
                        s2 = null;
                        goto label_36;
                    }
                    else if(!r10.W(40, "event param", s1)) {
                        v2 = 3;
                        s2 = s1;
                        goto label_36;
                    }
                }
                else {
                    v3 = v;
                    int v4 = this.w(s, s1, bundle0.get(s1), bundle1, list0, z, z1);
                    if(v4 == 17) {
                        r1.H(bundle1, 17, s1, Boolean.FALSE);
                    }
                    else if(v4 != 0 && !"_ev".equals(s1)) {
                        r1.H(bundle1, v4, (v4 == 21 ? s : s1), bundle0.get(s1));
                        bundle1.remove(s1);
                        goto label_60;
                    }
                    if(r1.x0(s1)) {
                        if(v1 + 1 > v3) {
                            L l0 = this.b();
                            String s3 = d00.k0.c(s);
                            String s4 = d00.k0.a(bundle0);
                            l0.g0.c(s3, J.d(v3, "Event can\'t contain more than ", " params"), s4);
                            r1.m0(5, bundle1);
                            bundle1.remove(s1);
                        }
                        ++v1;
                    }
                }
            label_60:
                v = v3;
                r10 = this;
            }
            return bundle1;
        }
        return null;
    }

    public final long A0() {
        long v2;
        this.q();
        String s = ((d0)this.Y).n().x();
        String s1 = (String)s.e0.a(null);
        int v = 0;
        if(!s1.equals("*") && !Arrays.asList(s1.split(",")).contains(s)) {
            return 0L;
        }
        int v1 = Build.VERSION.SDK_INT;
        if(v1 < 30) {
            v2 = 4L;
        }
        else if(J1.t0.a() < 4) {
            v2 = 8L;
        }
        else {
            if(v1 >= 30 && J1.t0.a() > 3) {
                v = J1.t0.u();
            }
            v2 = v >= ((int)(((Integer)s.Y.a(null)))) ? 0L : 16L;
        }
        if(!this.t0("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            v2 |= 2L;
        }
        if(v2 == 0L && !this.G0()) {
            v2 = 0x40L;
        }
        return v2 == 0L ? 1L : v2;
    }

    public static Bundle B(List list0) {
        Bundle bundle0 = new Bundle();
        if(list0 == null) {
            return bundle0;
        }
        for(Object object0: list0) {
            zzon zzon0 = (zzon)object0;
            String s = zzon0.c0;
            String s1 = zzon0.Y;
            if(s == null) {
                Long long0 = zzon0.b0;
                if(long0 == null) {
                    Double double0 = zzon0.e0;
                    if(double0 != null) {
                        bundle0.putDouble(s1, ((double)double0));
                    }
                }
                else {
                    bundle0.putLong(s1, ((long)long0));
                }
            }
            else {
                bundle0.putString(s1, s);
            }
        }
        return bundle0;
    }

    public final long B0() {
        int v1;
        if(this.c0.get() == 0L) {
            synchronized(this.c0) {
                ((d0)this.Y).l0.getClass();
                v1 = this.d0 + 1;
                this.d0 = v1;
            }
            return new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong() + ((long)v1);
        }
        synchronized(this.c0) {
            this.c0.compareAndSet(-1L, 1L);
        }
        return this.c0.getAndIncrement();
    }

    public final Bundle C(boolean z, Uri uri0) {
        String s8;
        String s7;
        String s6;
        String s5;
        String s4;
        String s3;
        String s2;
        String s1;
        String s;
        if(uri0 == null) {
            return null;
        }
        try {
            if(uri0.isHierarchical()) {
                s = uri0.getQueryParameter("utm_campaign");
                s1 = uri0.getQueryParameter("utm_source");
                s2 = uri0.getQueryParameter("utm_medium");
                s3 = uri0.getQueryParameter("gclid");
                s4 = z ? uri0.getQueryParameter("gbraid") : null;
                s5 = uri0.getQueryParameter("utm_id");
                s6 = uri0.getQueryParameter("dclid");
                s7 = uri0.getQueryParameter("srsltid");
                s8 = uri0.getQueryParameter("sfmc_id");
            }
            else {
                s = null;
                s1 = null;
                s2 = null;
                s3 = null;
                s4 = null;
                s5 = null;
                s6 = null;
                s7 = null;
                s8 = null;
            }
        }
        catch(UnsupportedOperationException unsupportedOperationException0) {
            this.b().h0.b(unsupportedOperationException0, "Install referrer url isn\'t a hierarchical URI");
            return null;
        }
        if(TextUtils.isEmpty(s) && TextUtils.isEmpty(s1) && TextUtils.isEmpty(s2) && TextUtils.isEmpty(s3) && (!z || TextUtils.isEmpty(s4)) && TextUtils.isEmpty(s5) && TextUtils.isEmpty(s6) && TextUtils.isEmpty(s7) && TextUtils.isEmpty(s8)) {
            return null;
        }
        Bundle bundle0 = new Bundle();
        if(!TextUtils.isEmpty(s)) {
            bundle0.putString("campaign", s);
        }
        if(!TextUtils.isEmpty(s1)) {
            bundle0.putString("source", s1);
        }
        if(!TextUtils.isEmpty(s2)) {
            bundle0.putString("medium", s2);
        }
        if(!TextUtils.isEmpty(s3)) {
            bundle0.putString("gclid", s3);
        }
        if(z && !TextUtils.isEmpty(s4)) {
            bundle0.putString("gbraid", s4);
        }
        String s9 = uri0.getQueryParameter("gad_source");
        if(z && !TextUtils.isEmpty(s9)) {
            bundle0.putString("gad_source", s9);
        }
        String s10 = uri0.getQueryParameter("utm_term");
        if(!TextUtils.isEmpty(s10)) {
            bundle0.putString("term", s10);
        }
        String s11 = uri0.getQueryParameter("utm_content");
        if(!TextUtils.isEmpty(s11)) {
            bundle0.putString("content", s11);
        }
        String s12 = uri0.getQueryParameter("aclid");
        if(!TextUtils.isEmpty(s12)) {
            bundle0.putString("aclid", s12);
        }
        String s13 = uri0.getQueryParameter("cp1");
        if(!TextUtils.isEmpty(s13)) {
            bundle0.putString("cp1", s13);
        }
        String s14 = uri0.getQueryParameter("anid");
        if(!TextUtils.isEmpty(s14)) {
            bundle0.putString("anid", s14);
        }
        if(!TextUtils.isEmpty(s5)) {
            bundle0.putString("campaign_id", s5);
        }
        if(!TextUtils.isEmpty(s6)) {
            bundle0.putString("dclid", s6);
        }
        String s15 = uri0.getQueryParameter("utm_source_platform");
        if(!TextUtils.isEmpty(s15)) {
            bundle0.putString("source_platform", s15);
        }
        String s16 = uri0.getQueryParameter("utm_creative_format");
        if(!TextUtils.isEmpty(s16)) {
            bundle0.putString("creative_format", s16);
        }
        String s17 = uri0.getQueryParameter("utm_marketing_tactic");
        if(!TextUtils.isEmpty(s17)) {
            bundle0.putString("marketing_tactic", s17);
        }
        if(!TextUtils.isEmpty(s7)) {
            bundle0.putString("srsltid", s7);
        }
        if(!TextUtils.isEmpty(s8)) {
            bundle0.putString("sfmc_id", s8);
        }
        return bundle0;
    }

    public final MeasurementManagerFutures C0() {
        if(this.e0 == null) {
            this.e0 = MeasurementManagerFutures.from(this.zza());
        }
        return this.e0;
    }

    public final zzbf D(String s, Bundle bundle0, String s1, long v, boolean z) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        if(this.v(s) == 0) {
            Bundle bundle1 = bundle0 == null ? new Bundle() : new Bundle(bundle0);
            bundle1.putString("_o", s1);
            Bundle bundle2 = this.A(s, bundle1, Collections.singletonList("_o"), true);
            if(z) {
                bundle2 = this.z(bundle2);
            }
            r.j(bundle2);
            return new zzbf(s, new zzbe(bundle2), s1, v);
        }
        L l0 = this.b();
        String s2 = ((d0)this.Y).k0.g(s);
        l0.e0.b(s2, "Invalid conditional property event name");
        throw new IllegalArgumentException();
    }

    public final String D0() {
        byte[] arr_b = new byte[16];
        this.F0().nextBytes(arr_b);
        return String.format(Locale.US, "%032x", new BigInteger(1, arr_b));
    }

    public final Object E(int v, Object object0, boolean z, boolean z1) {
        if(object0 == null) {
            return null;
        }
        if(!(object0 instanceof Long) && !(object0 instanceof Double)) {
            if(object0 instanceof Integer) {
                return (long)(((int)(((Integer)object0))));
            }
            if(object0 instanceof Byte) {
                return (long)(((byte)(((Byte)object0))));
            }
            if(object0 instanceof Short) {
                return (long)(((short)(((Short)object0))));
            }
            if(object0 instanceof Boolean) {
                return ((Boolean)object0).booleanValue() ? 1L : 0L;
            }
            if(object0 instanceof Float) {
                return ((Float)object0).doubleValue();
            }
            if(!(object0 instanceof String) && !(object0 instanceof Character) && !(object0 instanceof CharSequence)) {
                if(z1 && (object0 instanceof Bundle[] || object0 instanceof Parcelable[])) {
                    ArrayList arrayList0 = new ArrayList();
                    for(int v1 = 0; v1 < ((Parcelable[])object0).length; ++v1) {
                        Parcelable parcelable0 = ((Parcelable[])object0)[v1];
                        if(parcelable0 instanceof Bundle) {
                            Bundle bundle0 = this.z(((Bundle)parcelable0));
                            if(!bundle0.isEmpty()) {
                                arrayList0.add(bundle0);
                            }
                        }
                    }
                    return arrayList0.toArray(new Bundle[arrayList0.size()]);
                }
                return null;
            }
            return r1.F(String.valueOf(object0), z, v);
        }
        return object0;
    }

    public static MessageDigest E0() {
        for(int v = 0; v < 2; ++v) {
            try {
                MessageDigest messageDigest0 = MessageDigest.getInstance("MD5");
                if(messageDigest0 != null) {
                    return messageDigest0;
                }
            }
            catch(NoSuchAlgorithmException unused_ex) {
            }
        }
        return null;
    }

    public static String F(String s, boolean z, int v) {
        if(s == null) {
            return null;
        }
        if(s.codePointCount(0, s.length()) > v) {
            return z ? s.substring(0, s.offsetByCodePoints(0, v)) + "..." : null;
        }
        return s;
    }

    public final SecureRandom F0() {
        this.q();
        if(this.b0 == null) {
            this.b0 = new SecureRandom();
        }
        return this.b0;
    }

    public final void G(g g0, int v) {
        int v1 = 0;
        for(Object object0: new TreeSet(((Bundle)g0.c0).keySet())) {
            String s = (String)object0;
            if(r1.x0(s)) {
                ++v1;
                if(v1 > v) {
                    L l0 = this.b();
                    d0 d00 = (d0)this.Y;
                    String s1 = d00.k0.c(((String)g0.Z));
                    Bundle bundle0 = (Bundle)g0.c0;
                    String s2 = d00.k0.a(bundle0);
                    l0.g0.c(s1, J.d(v, "Event can\'t contain more than ", " params"), s2);
                    r1.m0(5, bundle0);
                    bundle0.remove(s);
                }
            }
        }
    }

    public final boolean G0() {
        Integer integer0;
        if(this.f0 == null) {
            MeasurementManagerFutures measurementManagerFutures0 = this.C0();
            boolean z = false;
            if(measurementManagerFutures0 == null) {
                return false;
            }
            ListenableFuture listenableFuture0 = measurementManagerFutures0.getMeasurementApiStatusAsync();
            try {
                integer0 = (Integer)listenableFuture0.get(10000L, TimeUnit.MILLISECONDS);
            }
            catch(CancellationException | ExecutionException | InterruptedException | TimeoutException cancellationException0) {
                this.b().D().b(cancellationException0, "Measurement manager api exception");
                this.f0 = Boolean.FALSE;
                integer0 = null;
                this.b().C().b(integer0, "Measurement manager api status result");
                return this.f0.booleanValue();
            }
            if(integer0 != null && ((int)integer0) == 1) {
                z = true;
            }
            this.f0 = Boolean.valueOf(z);
            this.b().C().b(integer0, "Measurement manager api status result");
        }
        return this.f0.booleanValue();
    }

    public static void H(Bundle bundle0, int v, String s, Object object0) {
        if(r1.m0(v, bundle0)) {
            bundle0.putString("_ev", r1.F(s, true, 40));
            if(object0 != null && (object0 instanceof String || object0 instanceof CharSequence)) {
                bundle0.putLong("_el", ((long)String.valueOf(object0).length()));
            }
        }
    }

    public final void I(Bundle bundle0, long v) {
        long v1 = bundle0.getLong("_et");
        if(v1 != 0L) {
            this.b().h0.b(v1, "Params already contained engagement");
        }
        bundle0.putLong("_et", v + v1);
    }

    public final void J(Bundle bundle0, Bundle bundle1) {
        if(bundle1 == null) {
            return;
        }
        for(Object object0: bundle1.keySet()) {
            String s = (String)object0;
            if(!bundle0.containsKey(s)) {
                this.p().K(bundle0, s, bundle1.get(s));
            }
        }
    }

    public final void K(Bundle bundle0, String s, Object object0) {
        if(bundle0 == null) {
            return;
        }
        if(object0 instanceof Long) {
            bundle0.putLong(s, ((long)(((Long)object0))));
            return;
        }
        if(object0 instanceof String) {
            bundle0.putString(s, String.valueOf(object0));
            return;
        }
        if(object0 instanceof Double) {
            bundle0.putDouble(s, ((double)(((Double)object0))));
            return;
        }
        if(object0 instanceof Bundle[]) {
            bundle0.putParcelableArray(s, ((Bundle[])object0));
            return;
        }
        if(s != null) {
            String s1 = object0 == null ? null : object0.getClass().getSimpleName();
            L l0 = this.b();
            String s2 = ((d0)this.Y).k0.f(s);
            l0.j0.c(s2, "Not putting event parameter. Invalid value type. name, type", s1);
        }
    }

    public final void L(U u0, int v) {
        Bundle bundle0 = new Bundle();
        bundle0.putInt("r", v);
        try {
            u0.f(bundle0);
        }
        catch(RemoteException remoteException0) {
            L l0 = ((d0)this.Y).g0;
            d0.h(l0);
            l0.h0.b(remoteException0, "Error returning int value to wrapper");
        }
    }

    public final void M(U u0, long v) {
        Bundle bundle0 = new Bundle();
        bundle0.putLong("r", v);
        try {
            u0.f(bundle0);
        }
        catch(RemoteException remoteException0) {
            L l0 = ((d0)this.Y).g0;
            d0.h(l0);
            l0.h0.b(remoteException0, "Error returning long value to wrapper");
        }
    }

    public final void N(U u0, Bundle bundle0) {
        try {
            u0.f(bundle0);
        }
        catch(RemoteException remoteException0) {
            L l0 = ((d0)this.Y).g0;
            d0.h(l0);
            l0.h0.b(remoteException0, "Error returning bundle value to wrapper");
        }
    }

    public final void O(U u0, ArrayList arrayList0) {
        Bundle bundle0 = new Bundle();
        bundle0.putParcelableArrayList("r", arrayList0);
        try {
            u0.f(bundle0);
        }
        catch(RemoteException remoteException0) {
            L l0 = ((d0)this.Y).g0;
            d0.h(l0);
            l0.h0.b(remoteException0, "Error returning bundle list to wrapper");
        }
    }

    public final void P(U u0, boolean z) {
        Bundle bundle0 = new Bundle();
        bundle0.putBoolean("r", z);
        try {
            u0.f(bundle0);
        }
        catch(RemoteException remoteException0) {
            L l0 = ((d0)this.Y).g0;
            d0.h(l0);
            l0.h0.b(remoteException0, "Error returning boolean value to wrapper");
        }
    }

    public final void Q(U u0, byte[] arr_b) {
        Bundle bundle0 = new Bundle();
        bundle0.putByteArray("r", arr_b);
        try {
            u0.f(bundle0);
        }
        catch(RemoteException remoteException0) {
            L l0 = ((d0)this.Y).g0;
            d0.h(l0);
            l0.h0.b(remoteException0, "Error returning byte array to wrapper");
        }
    }

    public static void R(M0 m00, Bundle bundle0, boolean z) {
        if(bundle0 != null && m00 != null && (!bundle0.containsKey("_sc") || z)) {
            String s = m00.a;
            if(s == null) {
                bundle0.remove("_sn");
            }
            else {
                bundle0.putString("_sn", s);
            }
            String s1 = m00.b;
            if(s1 == null) {
                bundle0.remove("_sc");
            }
            else {
                bundle0.putString("_sc", s1);
            }
            bundle0.putLong("_si", m00.c);
            return;
        }
        if(bundle0 != null && m00 == null && z) {
            bundle0.remove("_sn");
            bundle0.remove("_sc");
            bundle0.remove("_si");
        }
    }

    public static void S(q1 q10, String s, int v, String s1, String s2, int v1) {
        Bundle bundle0 = new Bundle();
        r1.m0(v, bundle0);
        if(!TextUtils.isEmpty(s1) && !TextUtils.isEmpty(s2)) {
            bundle0.putString(s1, s2);
        }
        if(v == 2 || v == 6 || v == 7) {
            bundle0.putLong("_el", ((long)v1));
        }
        q10.g(s, "_err", bundle0);
    }

    public final void T(String s, U u0) {
        Bundle bundle0 = new Bundle();
        bundle0.putString("r", s);
        try {
            u0.f(bundle0);
        }
        catch(RemoteException remoteException0) {
            L l0 = ((d0)this.Y).g0;
            d0.h(l0);
            l0.h0.b(remoteException0, "Error returning string value to wrapper");
        }
    }

    // This method was un-flattened
    public final void U(String s, String s1, Bundle bundle0, List list0, boolean z) {
        String s3;
        int v2;
        if(bundle0 == null) {
            return;
        }
        d0 d00 = (d0)this.Y;
        int v = d00.e0.p().h0(231100000) ? 35 : 0;
        int v1 = 0;
        for(Object object0: new TreeSet(bundle0.keySet())) {
            String s2 = (String)object0;
            if(list0 == null || !list0.contains(s2)) {
                if(!z) {
                    if(!this.r0("event param", s2)) {
                        r1.H(bundle0, 3, s2, s2);
                        bundle0.remove(s2);
                        continue;
                    }
                    else if(!this.f0("event param", null, null, s2)) {
                        r1.H(bundle0, 14, s2, null);
                        bundle0.remove(s2);
                        continue;
                    }
                    else if(!this.W(40, "event param", s2)) {
                        r1.H(bundle0, 3, s2, s2);
                        bundle0.remove(s2);
                        continue;
                    }
                }
                if(!this.o0("event param", s2)) {
                    r1.H(bundle0, 3, s2, s2);
                    bundle0.remove(s2);
                    continue;
                }
                else if(!this.f0("event param", null, null, s2)) {
                    r1.H(bundle0, 14, s2, null);
                    bundle0.remove(s2);
                    continue;
                }
                else if(!this.W(40, "event param", s2)) {
                    r1.H(bundle0, 3, s2, s2);
                    bundle0.remove(s2);
                    continue;
                }
            }
            if(r1.Z(bundle0.get(s2))) {
                this.b().j0.e("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", s, s1, s2);
                v2 = 22;
                s3 = s2;
            }
            else {
                s3 = s2;
                v2 = this.w(s, s2, bundle0.get(s2), bundle0, list0, z, false);
            }
            if(v2 != 0 && !"_ev".equals(s3)) {
                r1.H(bundle0, v2, s3, bundle0.get(s3));
                bundle0.remove(s3);
            }
            else if(r1.x0(s3) && !r1.e0(s3, t0.j)) {
                boolean z1 = this.h0(231100000);
                G g0 = d00.k0;
                if(!z1) {
                    L l0 = this.b();
                    String s4 = g0.c(s);
                    String s5 = g0.a(bundle0);
                    l0.g0.c(s4, "Item array not supported on client\'s version of Google Play Services (Android Only)", s5);
                    r1.m0(23, bundle0);
                    bundle0.remove(s3);
                }
                else if(v1 + 1 > v) {
                    L l1 = this.b();
                    String s6 = g0.c(s);
                    String s7 = g0.a(bundle0);
                    l1.g0.c(s6, J.d(v, "Item can\'t contain more than ", " item-scoped custom params"), s7);
                    r1.m0(28, bundle0);
                    bundle0.remove(s3);
                }
                ++v1;
            }
        }
    }

    public final void V(Parcelable[] arr_parcelable, int v) {
        r.j(arr_parcelable);
        for(int v1 = 0; v1 < arr_parcelable.length; ++v1) {
            Bundle bundle0 = (Bundle)arr_parcelable[v1];
            int v2 = 0;
            for(Object object0: new TreeSet(bundle0.keySet())) {
                String s = (String)object0;
                if(r1.x0(s) && !r1.e0(s, t0.j)) {
                    ++v2;
                    if(v2 > v) {
                        L l0 = this.b();
                        d0 d00 = (d0)this.Y;
                        String s1 = d00.k0.f(s);
                        String s2 = d00.k0.a(bundle0);
                        l0.g0.c(s1, J.d(v, "Param can\'t contain more than ", " item-scoped custom parameters"), s2);
                        r1.m0(28, bundle0);
                        bundle0.remove(s);
                    }
                }
            }
        }
    }

    public final boolean W(int v, String s, String s1) {
        if(s1 == null) {
            this.b().g0.b(s, "Name is required and can\'t be null. Type");
            return false;
        }
        if(s1.codePointCount(0, s1.length()) > v) {
            this.b().g0.e("Name is too long. Type, maximum supported length, name", s, v, s1);
            return false;
        }
        return true;
    }

    public static boolean X(Context context0) {
        r.j(context0);
        try {
            PackageManager packageManager0 = context0.getPackageManager();
            if(packageManager0 == null) {
                return false;
            }
            ActivityInfo activityInfo0 = packageManager0.getReceiverInfo(new ComponentName(context0, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0);
            if(activityInfo0 != null) {
                return activityInfo0.enabled;
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        return false;
    }

    public static boolean Y(Intent intent0) {
        String s = intent0.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(s) || "https://www.google.com".equals(s) || "android-app://com.google.appcrawler".equals(s);
    }

    // Deobfuscation rating: LOW(30)
    public static boolean Z(Object object0) {
        return object0 instanceof Parcelable[] || object0 instanceof ArrayList || object0 instanceof Bundle;
    }

    public final boolean a0(String s, double f) {
        try {
            SharedPreferences.Editor sharedPreferences$Editor0 = ((d0)this.Y).X.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            sharedPreferences$Editor0.putString("deeplink", s);
            sharedPreferences$Editor0.putLong("timestamp", Double.doubleToRawLongBits(f));
            return sharedPreferences$Editor0.commit();
        }
        catch(RuntimeException runtimeException0) {
            this.b().e0.b(runtimeException0, "Failed to persist Deferred Deep Link. exception");
            return false;
        }
    }

    public final boolean b0(String s, String s1) {
        boolean z = TextUtils.isEmpty(s);
        d0 d00 = (d0)this.Y;
        if(!z) {
            r.j(s);
            if(s.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                return true;
            }
            if(TextUtils.isEmpty(d00.Y)) {
                L l0 = this.b();
                M m0 = L.u(s);
                l0.g0.b(m0, "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
            }
            return false;
        }
        if(!TextUtils.isEmpty(s1)) {
            r.j(s1);
            if(!s1.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                L l1 = this.b();
                M m1 = L.u(s1);
                l1.g0.b(m1, "Invalid admob_app_id. Analytics disabled.");
                return false;
            }
            return true;
        }
        if(TextUtils.isEmpty(d00.Y)) {
            this.b().g0.d("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
        }
        return false;
    }

    public final boolean c0(String s, String s1, int v, Object object0) {
        if(object0 == null) {
            return true;
        }
        if(!(object0 instanceof Long) && !(object0 instanceof Float) && !(object0 instanceof Integer) && !(object0 instanceof Byte) && !(object0 instanceof Short) && !(object0 instanceof Boolean) && !(object0 instanceof Double)) {
            if(!(object0 instanceof String) && !(object0 instanceof Character) && !(object0 instanceof CharSequence)) {
                return false;
            }
            String s2 = String.valueOf(object0);
            if(s2.codePointCount(0, s2.length()) > v) {
                this.b().j0.e("Value is too long; discarded. Value kind, name, value length", s, s1, s2.length());
                return false;
            }
        }
        return true;
    }

    // Deobfuscation rating: LOW(20)
    public static boolean d0(String s, String s1, String s2, String s3) {
        boolean z = TextUtils.isEmpty(s);
        boolean z1 = TextUtils.isEmpty(s1);
        if(!z && !z1) {
            r.j(s);
            return !s.equals(s1);
        }
        if(z && z1) {
            return TextUtils.isEmpty(s2) || TextUtils.isEmpty(s3) ? !TextUtils.isEmpty(s3) : !s2.equals(s3);
        }
        return z || !z1 || !TextUtils.isEmpty(s3) ? TextUtils.isEmpty(s2) || !s2.equals(s3) : false;
    }

    public static boolean e0(String s, String[] arr_s) {
        r.j(arr_s);
        for(int v = 0; v < arr_s.length; ++v) {
            if(Objects.equals(s, arr_s[v])) {
                return true;
            }
        }
        return false;
    }

    public final boolean f0(String s, String[] arr_s, String[] arr_s1, String s1) {
        if(s1 == null) {
            this.b().g0.b(s, "Name is required and can\'t be null. Type");
            return false;
        }
        String[] arr_s2 = r1.h0;
        for(int v = 0; v < 3; ++v) {
            if(s1.startsWith(arr_s2[v])) {
                this.b().g0.c(s, "Name starts with reserved prefix. Type, name", s1);
                return false;
            }
        }
        if(arr_s != null && r1.e0(s1, arr_s) && (arr_s1 == null || !r1.e0(s1, arr_s1))) {
            this.b().g0.c(s, "Name is reserved. Type, name", s1);
            return false;
        }
        return true;
    }

    public static byte[] g0(Parcelable parcelable0) {
        if(parcelable0 == null) {
            return null;
        }
        Parcel parcel0 = Parcel.obtain();
        try {
            parcelable0.writeToParcel(parcel0, 0);
            return parcel0.marshall();
        }
        finally {
            parcel0.recycle();
        }
    }

    public final boolean h0(int v) {
        Boolean boolean0 = ((d0)this.Y).q().d0;
        return this.v0() >= v / 1000 || boolean0 != null && !boolean0.booleanValue();
    }

    public static boolean i0(Context context0) {
        r.j(context0);
        return Build.VERSION.SDK_INT < 24 ? r1.q0(context0, "com.google.android.gms.measurement.AppMeasurementService") : r1.q0(context0, "com.google.android.gms.measurement.AppMeasurementJobService");
    }

    public final int j0(String s) {
        if(!this.o0("user property", s)) {
            return 6;
        }
        if(!this.f0("user property", t0.e, null, s)) {
            return 15;
        }
        return this.W(24, "user property", s) ? 0 : 6;
    }

    public final Object k0(Object object0, String s) {
        d0 d00 = (d0)this.Y;
        if("_ev".equals(s)) {
            d00.e0.getClass();
            return this.E(Math.max(500, 0x100), object0, true, true);
        }
        if(r1.w0(s)) {
            d00.e0.getClass();
            return this.E(Math.max(500, 0x100), object0, false, true);
        }
        d00.e0.getClass();
        return this.E(500, object0, false, true);
    }

    public static ArrayList l0(List list0) {
        if(list0 == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList0 = new ArrayList(list0.size());
        for(Object object0: list0) {
            Bundle bundle0 = new Bundle();
            bundle0.putString("app_id", ((zzae)object0).X);
            bundle0.putString("origin", ((zzae)object0).Y);
            bundle0.putLong("creation_timestamp", ((zzae)object0).b0);
            bundle0.putString("name", ((zzae)object0).Z.Y);
            Object object1 = ((zzae)object0).Z.zza();
            r.j(object1);
            t0.e(bundle0, object1);
            bundle0.putBoolean("active", ((zzae)object0).c0);
            String s = ((zzae)object0).d0;
            if(s != null) {
                bundle0.putString("trigger_event_name", s);
            }
            zzbf zzbf0 = ((zzae)object0).e0;
            if(zzbf0 != null) {
                bundle0.putString("timed_out_event_name", zzbf0.X);
                zzbe zzbe0 = zzbf0.Y;
                if(zzbe0 != null) {
                    bundle0.putBundle("timed_out_event_params", zzbe0.l());
                }
            }
            bundle0.putLong("trigger_timeout", ((zzae)object0).f0);
            zzbf zzbf1 = ((zzae)object0).g0;
            if(zzbf1 != null) {
                bundle0.putString("triggered_event_name", zzbf1.X);
                zzbe zzbe1 = zzbf1.Y;
                if(zzbe1 != null) {
                    bundle0.putBundle("triggered_event_params", zzbe1.l());
                }
            }
            bundle0.putLong("triggered_timestamp", ((zzae)object0).Z.Z);
            bundle0.putLong("time_to_live", ((zzae)object0).h0);
            zzbf zzbf2 = ((zzae)object0).i0;
            if(zzbf2 != null) {
                bundle0.putString("expired_event_name", zzbf2.X);
                zzbe zzbe2 = zzbf2.Y;
                if(zzbe2 != null) {
                    bundle0.putBundle("expired_event_params", zzbe2.l());
                }
            }
            arrayList0.add(bundle0);
        }
        return arrayList0;
    }

    public static boolean m0(int v, Bundle bundle0) {
        if(bundle0 == null) {
            return false;
        }
        if(bundle0.getLong("_err") == 0L) {
            bundle0.putLong("_err", ((long)v));
            return true;
        }
        return false;
    }

    public final boolean n0(Context context0, String s) {
        X500Principal x500Principal0 = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo0 = b.a(context0).c(0x40, s);
            if(packageInfo0 != null) {
                Signature[] arr_signature = packageInfo0.signatures;
                if(arr_signature != null && arr_signature.length > 0) {
                    Signature signature0 = arr_signature[0];
                    return ((X509Certificate)CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signature0.toByteArray()))).getSubjectX500Principal().equals(x500Principal0);
                }
            }
        }
        catch(CertificateException certificateException0) {
            this.b().e0.b(certificateException0, "Error obtaining certificate");
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            this.b().e0.b(packageManager$NameNotFoundException0, "Package name not found");
        }
        return true;
    }

    public final boolean o0(String s, String s1) {
        if(s1 == null) {
            this.b().g0.b(s, "Name is required and can\'t be null. Type");
            return false;
        }
        if(s1.length() == 0) {
            this.b().g0.b(s, "Name is required and can\'t be empty. Type");
            return false;
        }
        int v = s1.codePointAt(0);
        if(!Character.isLetter(v) && v != 0x5F) {
            this.b().g0.c(s, "Name must start with a letter or _ (underscore). Type, name", s1);
            return false;
        }
        int v1 = s1.length();
        for(int v2 = Character.charCount(v); v2 < v1; v2 += Character.charCount(v3)) {
            int v3 = s1.codePointAt(v2);
            if(v3 != 0x5F && !Character.isLetterOrDigit(v3)) {
                this.b().g0.c(s, "Name must consist of letters, digits or _ (underscores). Type, name", s1);
                return false;
            }
        }
        return true;
    }

    // Deobfuscation rating: LOW(20)
    public final Object p0(Object object0, String s) {
        return "_ldl".equals(s) ? this.E(r1.z0(s), object0, true, false) : this.E(r1.z0(s), object0, false, false);
    }

    public static boolean q0(Context context0, String s) {
        try {
            PackageManager packageManager0 = context0.getPackageManager();
            if(packageManager0 == null) {
                return false;
            }
            ServiceInfo serviceInfo0 = packageManager0.getServiceInfo(new ComponentName(context0, s), 0);
            if(serviceInfo0 != null) {
                return serviceInfo0.enabled;
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        return false;
    }

    public final boolean r0(String s, String s1) {
        if(s1 == null) {
            this.b().g0.b(s, "Name is required and can\'t be null. Type");
            return false;
        }
        if(s1.length() == 0) {
            this.b().g0.b(s, "Name is required and can\'t be empty. Type");
            return false;
        }
        int v = s1.codePointAt(0);
        if(!Character.isLetter(v)) {
            this.b().g0.c(s, "Name must start with a letter. Type, name", s1);
            return false;
        }
        int v1 = s1.length();
        for(int v2 = Character.charCount(v); v2 < v1; v2 += Character.charCount(v3)) {
            int v3 = s1.codePointAt(v2);
            if(v3 != 0x5F && !Character.isLetterOrDigit(v3)) {
                this.b().g0.c(s, "Name must consist of letters, digits or _ (underscores). Type, name", s1);
                return false;
            }
        }
        return true;
    }

    public final boolean s0(String s, String s1) {
        d0 d00 = (d0)this.Y;
        if(d00.e0.B(null, s.y0) && !TextUtils.isEmpty(s1)) {
            return true;
        }
        return TextUtils.isEmpty(s) ? false : d00.e0.s("debug.firebase.analytics.app").equals(s);
    }

    @Override  // j6.o0
    public final boolean t() {
        return true;
    }

    public final boolean t0(String s) {
        this.q();
        if(b.a(((d0)this.Y).X).a.checkCallingOrSelfPermission(s) == 0) {
            return true;
        }
        this.b().l0.b(s, "Permission not granted");
        return false;
    }

    // Deobfuscation rating: LOW(40)
    public final int u(Object object0, String s) {
        return ("_ldl".equals(s) ? this.c0("user property referrer", s, r1.z0(s), object0) : this.c0("user property", s, r1.z0(s), object0)) ? 0 : 7;
    }

    public static boolean u0(String s) {
        String s1 = (String)s.A0.a(null);
        return s1.equals("*") || Arrays.asList(s1.split(",")).contains(s);
    }

    public final int v(String s) {
        if(!this.o0("event", s)) {
            return 2;
        }
        if(!this.f0("event", t0.a, t0.b, s)) {
            return 13;
        }
        return this.W(40, "event", s) ? 0 : 2;
    }

    public final int v0() {
        if(this.g0 == null) {
            Context context0 = ((d0)this.Y).X;
            c.b.getClass();
            int v = 0;
            try {
                v = context0.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            }
            this.g0 = (int)(v / 1000);
        }
        return (int)this.g0;
    }

    public final int w(String s, String s1, Object object0, Bundle bundle0, List list0, boolean z, boolean z1) {
        int v2;
        int v1;
        this.q();
        d0 d00 = (d0)this.Y;
        if(r1.Z(object0)) {
            if(!z1) {
                return 21;
            }
            if(!r1.e0(s1, t0.i)) {
                return 20;
            }
            P0 p00 = com.apollographql.apollo.api.b.n(d00);
            if(p00.G() && p00.p().v0() < 200900) {
                return 25;
            }
            if(object0 instanceof Parcelable[]) {
                v1 = ((Parcelable[])object0).length;
                goto label_14;
            }
            else if(object0 instanceof ArrayList) {
                v1 = ((ArrayList)object0).size();
            label_14:
                if(v1 > 200) {
                    this.b().j0.e("Parameter array is too long; discarded. Value kind, name, array length", "param", s1, v1);
                    if(!(object0 instanceof Parcelable[])) {
                        if(object0 instanceof ArrayList && ((ArrayList)object0).size() > 200) {
                            bundle0.putParcelableArrayList(s1, new ArrayList(((ArrayList)object0).subList(0, 200)));
                        }
                    }
                    else if(((Parcelable[])object0).length > 200) {
                        bundle0.putParcelableArray(s1, ((Parcelable[])Arrays.copyOf(((Parcelable[])object0), 200)));
                    }
                    v2 = 17;
                }
                else {
                    v2 = 0;
                }
            }
            else {
                v2 = 0;
            }
        }
        else {
            v2 = 0;
        }
        int v3 = 500;
        if(r1.w0(s) || r1.w0(s1)) {
            d00.e0.getClass();
            v3 = Math.max(500, 0x100);
        }
        else {
            d00.e0.getClass();
        }
        if(this.c0("param", s1, v3, object0)) {
            return v2;
        }
        if(z1) {
            if(object0 instanceof Bundle) {
                this.U(s, s1, ((Bundle)object0), list0, z);
                return v2;
            }
            if(object0 instanceof Parcelable[]) {
                for(int v4 = 0; v4 < ((Parcelable[])object0).length; ++v4) {
                    Parcelable parcelable0 = ((Parcelable[])object0)[v4];
                    if(!(parcelable0 instanceof Bundle)) {
                        L l0 = this.b();
                        Class class0 = parcelable0.getClass();
                        l0.j0.c(class0, "All Parcelable[] elements must be of type Bundle. Value type, name", s1);
                        return 4;
                    }
                    this.U(s, s1, ((Bundle)parcelable0), list0, z);
                }
                return v2;
            }
            if(object0 instanceof ArrayList) {
                int v5 = ((ArrayList)object0).size();
                for(int v = 0; v < v5; ++v) {
                    Object object1 = ((ArrayList)object0).get(v);
                    if(!(object1 instanceof Bundle)) {
                        L l1 = this.b();
                        Class class1 = object1 == null ? "null" : object1.getClass();
                        l1.j0.c(class1, "All ArrayList elements must be of type Bundle. Value type, name", s1);
                        return 4;
                    }
                    this.U(s, s1, ((Bundle)object1), list0, z);
                }
                return v2;
            }
        }
        return 4;
    }

    // Deobfuscation rating: LOW(20)
    public static boolean w0(String s) {
        return !TextUtils.isEmpty(s) && s.startsWith("_");
    }

    public static long x(zzbe zzbe0) {
        long v = 0L;
        if(zzbe0 == null) {
            return 0L;
        }
        Bundle bundle0 = zzbe0.X;
        for(Object object0: bundle0.keySet()) {
            Object object1 = bundle0.get(((String)object0));
            if(object1 instanceof Parcelable[]) {
                v += (long)((Parcelable[])object1).length;
            }
        }
        return v;
    }

    public static boolean x0(String s) {
        r.f(s);
        return s.charAt(0) != 0x5F || s.equals("_ep");
    }

    public static long y(byte[] arr_b) {
        r.j(arr_b);
        if(arr_b.length <= 0) {
            throw new IllegalStateException();
        }
        int v = arr_b.length - 1;
        int v1 = 0;
        long v2 = 0L;
        while(v >= 0 && v >= arr_b.length - 8) {
            v2 += (((long)arr_b[v]) & 0xFFL) << v1;
            v1 += 8;
            --v;
        }
        return v2;
    }

    public final boolean y0(String s) {
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        List list0 = ((d0)this.Y).X.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(s)), 0);
        return list0 != null && !list0.isEmpty();
    }

    public final Bundle z(Bundle bundle0) {
        Bundle bundle1 = new Bundle();
        if(bundle0 != null) {
            for(Object object0: bundle0.keySet()) {
                String s = (String)object0;
                Object object1 = this.k0(bundle0.get(s), s);
                if(object1 == null) {
                    L l0 = this.b();
                    String s1 = ((d0)this.Y).k0.f(s);
                    l0.j0.b(s1, "Param value can\'t be null");
                }
                else {
                    this.K(bundle1, s, object1);
                }
            }
        }
        return bundle1;
    }

    public static int z0(String s) {
        if("_ldl".equals(s)) {
            return 0x800;
        }
        if("_id".equals(s)) {
            return 0x100;
        }
        return "_lgclid".equals(s) ? 100 : 36;
    }
}

