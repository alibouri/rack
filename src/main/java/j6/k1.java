package j6;

import B1.b;
import E5.d;
import N5.r;
import android.app.AlarmManager;
import android.app.Service;
import android.app.job.JobInfo.Builder;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.SystemClock;
import android.os.UserHandle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.measurement.I0;
import com.google.android.gms.internal.measurement.M;
import com.google.android.gms.internal.measurement.Q0;
import com.google.android.gms.internal.measurement.R0;
import com.google.android.gms.internal.measurement.a1;
import com.google.android.gms.internal.measurement.c1;
import com.google.android.gms.internal.measurement.d1;
import com.google.android.gms.internal.measurement.g1;
import com.google.android.gms.internal.measurement.h1;
import com.google.android.gms.internal.measurement.k2;
import com.google.android.gms.measurement.internal.zzae;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzo;
import com.google.android.gms.measurement.internal.zzon;
import g.a;
import i.J;
import io.sentry.android.core.internal.util.c;
import io.sentry.android.core.o;
import io.sentry.hints.i;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import jeb.synthetic.FIN;
import jeb.synthetic.TWR;
import s.e;

public final class k1 implements n0 {
    public final HashMap A0;
    public final HashMap B0;
    public M0 C0;
    public String D0;
    public final J E0;
    public static volatile k1 F0;
    public final Y X;
    public final O Y;
    public g Z;
    public S b0;
    public f1 c0;
    public s1 d0;
    public final O e0;
    public O f0;
    public Z0 g0;
    public final i1 h0;
    public W i0;
    public final d0 j0;
    public boolean k0;
    public boolean l0;
    public long m0;
    public ArrayList n0;
    public final HashSet o0;
    public int p0;
    public int q0;
    public boolean r0;
    public boolean s0;
    public boolean t0;
    public FileLock u0;
    public FileChannel v0;
    public ArrayList w0;
    public ArrayList x0;
    public long y0;
    public final HashMap z0;

    public k1(b b0) {
        this.k0 = false;
        this.o0 = new HashSet();
        this.E0 = new J(10, this);
        this.j0 = d0.d(b0.a, null, null);
        this.y0 = -1L;
        this.h0 = new i1(this);  // initializer: Lj6/h1;-><init>(Lj6/k1;)V
        O o0 = new O(this, 2);
        o0.v();
        this.e0 = o0;
        O o1 = new O(this, 0);
        o1.v();
        this.Y = o1;
        Y y0 = new Y(this);
        y0.v();
        this.X = y0;
        this.z0 = new HashMap();
        this.A0 = new HashMap();
        this.B0 = new HashMap();
        this.c().z(new d(this, b0));
    }

    public final void A(boolean z, int v, IOException iOException0, byte[] arr_b, String s, List list0) {
        g g6;
        int v2;
        O o0 = this.Y;
        this.c().q();
        this.e0();
        try {
            byte[] arr_b1 = arr_b == null ? new byte[0] : arr_b;
            ArrayList arrayList0 = this.w0;
            r.j(arrayList0);
            this.w0 = null;
            if(!z || (v == 200 || v == 204) && iOException0 == null) {
                this.b().m0.b(v, "Network upload successful with code");
                try {
                    if(z) {
                        o o3 = this.g0.g0;
                        ((S5.b)this.f()).getClass();
                        o3.b(System.currentTimeMillis());
                    }
                    this.g0.h0.b(0L);
                    this.G();
                    if(z) {
                        this.b().m0.c(v, "Successful upload. Got network response. code, size", ((int)arr_b1.length));
                    }
                    else {
                        this.b().m0.d("Purged empty bundles");
                    }
                    g g1 = this.Z;
                    k1.v(g1);
                    g1.x0();
                    v2 = FIN.finallyOpen$NT();
                    if(this.S().B(null, s.B0)) {
                        for(Object object0: list0) {
                            g1 g10 = (g1)((Pair)object0).first;
                            l1 l10 = (l1)((Pair)object0).second;
                            g g2 = this.Z;
                            k1.v(g2);
                            String s2 = l10.a;
                            Map map0 = l10.b;
                            if(map0 == null) {
                                map0 = Collections.emptyMap();
                            }
                            g2.R(s, g10, s2, map0, l10.c);
                        }
                    }
                    Iterator iterator1 = arrayList0.iterator();
                    while(true) {
                    label_56:
                        if(!iterator1.hasNext()) {
                            g g3 = this.Z;
                            k1.v(g3);
                            g3.E0();
                            FIN.finallyCodeBegin$NT(v2);
                            g g4 = this.Z;
                            k1.v(g4);
                            g4.C0();
                            FIN.finallyCodeEnd$NT(v2);
                            this.x0 = null;
                            k1.v(o0);
                            if(o0.h0() && this.H()) {
                                this.f0();
                            }
                            else if(this.S().B(null, s.B0)) {
                                k1.v(o0);
                                if(o0.h0()) {
                                    g g5 = this.Z;
                                    k1.v(g5);
                                    if(g5.B0(s)) {
                                        this.U(s);
                                    }
                                    else {
                                        this.y0 = -1L;
                                        this.G();
                                    }
                                }
                                else {
                                    this.y0 = -1L;
                                    this.G();
                                }
                            }
                            else {
                                this.y0 = -1L;
                                this.G();
                            }
                            this.m0 = 0L;
                            return;
                        }
                        Object object1 = iterator1.next();
                        Long long0 = (Long)object1;
                        break;
                    }
                }
                catch(SQLiteException sQLiteException0) {
                    goto label_110;
                }
                try {
                    g6 = this.Z;
                    k1.v(g6);
                    g6.q();
                    g6.u();
                    SQLiteDatabase sQLiteDatabase0 = g6.y();
                }
                catch(SQLiteException sQLiteException1) {
                    goto label_105;
                }
                try {
                    if(sQLiteDatabase0.delete("queue", "rowid=?", new String[]{String.valueOf(((long)long0))}) == 1) {
                        goto label_56;
                    }
                    FIN.finallyExec$NT(v2);
                    throw new SQLiteException("Deleted fewer rows from queue than expected");
                }
                catch(SQLiteException sQLiteException2) {
                    try {
                        g6.b().e0.b(sQLiteException2, "Failed to delete a bundle in a queue table");
                        FIN.finallyExec$NT(v2);
                        throw sQLiteException2;
                    }
                    catch(SQLiteException sQLiteException1) {
                    }
                }
                try {
                label_105:
                    if(this.x0 == null || !this.x0.contains(long0)) {
                        FIN.finallyExec$NT(v2);
                        throw sQLiteException1;
                    }
                    goto label_115;
                }
                catch(SQLiteException sQLiteException0) {
                }
            label_110:
                this.b().e0.b(sQLiteException0, "Database error while trying to delete uploaded bundles");
                ((S5.b)this.f()).getClass();
                this.m0 = SystemClock.elapsedRealtime();
                this.b().m0.b(((long)this.m0), "Disable upload, time");
                return;
            label_115:
                goto label_56;
            }
            else {
                if(this.S().B(null, s.F0)) {
                    String s1 = new String(arr_b1, StandardCharsets.UTF_8);
                    this.b().j0.e("Network upload failed. Will retry later. code, error", v, iOException0, s1.substring(0, Math.min(0x20, s1.length())));
                }
                else {
                    this.b().m0.c(v, "Network upload failed. Will retry later. code, error", iOException0);
                }
                o o1 = this.g0.h0;
                ((S5.b)this.f()).getClass();
                o1.b(System.currentTimeMillis());
                if(v == 429 || v == 503) {
                    o o2 = this.g0.f0;
                    ((S5.b)this.f()).getClass();
                    o2.b(System.currentTimeMillis());
                }
                g g0 = this.Z;
                k1.v(g0);
                g0.X(arrayList0);
                this.G();
            }
        }
        finally {
            this.s0 = false;
            this.E();
        }
    }

    public final boolean B(long v, String s) {
        // ERROR - The method was not decompiled
        // Self interruption (operation timed-out, maximum duration allowed was 60000 ms)
    }

    public final boolean C(com.google.android.gms.internal.measurement.Z0 z00, com.google.android.gms.internal.measurement.Z0 z01) {
        r.b("_e".equals(z00.n()));
        this.b0();
        d1 d10 = O.D(((a1)z00.d()), "_sc");
        String s = null;
        String s1 = d10 == null ? null : d10.E();
        this.b0();
        d1 d11 = O.D(((a1)z01.d()), "_pc");
        if(d11 != null) {
            s = d11.E();
        }
        if(s != null && s.equals(s1)) {
            r.b("_e".equals(z00.n()));
            this.b0();
            d1 d12 = O.D(((a1)z00.d()), "_et");
            if(d12 != null && d12.I() && d12.A() > 0L) {
                long v = d12.A();
                this.b0();
                d1 d13 = O.D(((a1)z01.d()), "_et");
                if(d13 != null && d13.A() > 0L) {
                    v += d13.A();
                }
                this.b0();
                O.P(z01, "_et", v);
                this.b0();
                O.P(z00, "_fr", 1L);
            }
            return true;
        }
        return false;
    }

    public final void D(ArrayList arrayList0) {
        r.b(!arrayList0.isEmpty());
        if(this.w0 != null) {
            this.b().e0.d("Set uploading progress before finishing the previous upload");
            return;
        }
        this.w0 = new ArrayList(arrayList0);
    }

    public final void E() {
        this.c().q();
        if(!this.r0 && !this.s0 && !this.t0) {
            this.b().m0.d("Stopping uploading service(s)");
            ArrayList arrayList0 = this.n0;
            if(arrayList0 == null) {
                return;
            }
            for(Object object0: arrayList0) {
                ((Runnable)object0).run();
            }
            ArrayList arrayList1 = this.n0;
            r.j(arrayList1);
            arrayList1.clear();
            return;
        }
        this.b().m0.e("Not stopping services. fetch, network, upload", Boolean.valueOf(this.r0), Boolean.valueOf(this.s0), Boolean.valueOf(this.t0));
    }

    public final void F() {
        this.c().q();
        HashSet hashSet0 = this.o0;
        for(Object object0: hashSet0) {
            String s = (String)object0;
            if(this.S().B(s, s.H0)) {
                this.b().l0.b(s, "Notifying app that trigger URIs are available. App ID");
                Intent intent0 = new Intent();
                intent0.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intent0.setPackage(s);
                this.j0.X.sendBroadcast(intent0);
            }
        }
        hashSet0.clear();
    }

    public final void G() {
        JobScheduler jobScheduler1;
        int v18;
        long v11;
        long v3;
        boolean z;
        this.c().q();
        this.e0();
        if(this.m0 > 0L) {
            ((S5.b)this.f()).getClass();
            long v = Math.abs(SystemClock.elapsedRealtime() - this.m0);
            if(3600000L - v > 0L) {
                this.b().m0.b(((long)(3600000L - v)), "Upload has been suspended. Will update scheduling later in approximately ms");
                this.h0().a();
                f1 f10 = this.c0;
                k1.v(f10);
                f10.x();
                return;
            }
            this.m0 = 0L;
        }
        if(this.j0.j() && this.H()) {
            ((S5.b)this.f()).getClass();
            long v1 = System.currentTimeMillis();
            this.S();
            long v2 = Math.max(0L, ((long)(((Long)s.C.a(null)))));
            g g0 = this.Z;
            k1.v(g0);
            if(g0.g0("select count(1) > 0 from raw_events where realtime = 1", null) == 0L) {
                g g1 = this.Z;
                k1.v(g1);
                z = g1.g0("select count(1) > 0 from queue where has_realtime = 1", null) == 0L ? false : true;
            }
            else {
                z = true;
            }
            if(z) {
                String s = this.S().s("debug.firebase.analytics.app");
                if(TextUtils.isEmpty(s) || ".none.".equals(s)) {
                    this.S();
                    v3 = Math.max(0L, ((long)(((Long)s.w.a(null)))));
                }
                else {
                    this.S();
                    v3 = Math.max(0L, ((long)(((Long)s.x.a(null)))));
                }
            }
            else {
                this.S();
                v3 = Math.max(0L, ((long)(((Long)s.v.a(null)))));
            }
            long v4 = this.g0.g0.a();
            long v5 = this.g0.h0.a();
            g g2 = this.Z;
            k1.v(g2);
            long v6 = g2.C("select max(bundle_end_timestamp) from queue", null, 0L);
            g g3 = this.Z;
            k1.v(g3);
            long v7 = Math.max(v6, g3.C("select max(timestamp) from raw_events", null, 0L));
            O o0 = this.e0;
            if(Long.compare(v7, 0L) == 0) {
                v11 = 0L;
            }
            else {
                long v8 = v1 - Math.abs(v7 - v1);
                long v9 = v1 - Math.abs(v5 - v1);
                long v10 = Math.max(v1 - Math.abs(v4 - v1), v9);
                v11 = !z || v10 <= 0L ? v2 + v8 : Math.min(v8, v10) + v3;
                k1.v(o0);
                if(!o0.Y(v10, v3)) {
                    v11 = v10 + v3;
                }
                if(v9 != 0L && v9 >= v8) {
                    int v12 = 0;
                    while(true) {
                        this.S();
                        if(v12 >= Math.min(20, Math.max(0, ((int)(((Integer)s.E.a(null))))))) {
                            break;
                        }
                        this.S();
                        v11 += Math.max(0L, ((long)(((Long)s.D.a(null))))) * (1L << v12);
                        if(v11 > v9) {
                            goto label_69;
                        }
                        ++v12;
                    }
                    v11 = 0L;
                }
            }
        label_69:
            if(v11 == 0L) {
                this.b().m0.d("Next upload time is 0");
                this.h0().a();
                f1 f11 = this.c0;
                k1.v(f11);
                f11.x();
                return;
            }
            k1.v(this.Y);
            if(!this.Y.h0()) {
                this.b().m0.d("No network");
                S s1 = this.h0();
                k1 k10 = s1.a;
                k10.e0();
                k10.c().q();
                if(!s1.b) {
                    IntentFilter intentFilter0 = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
                    k10.j0.X.registerReceiver(s1, intentFilter0);
                    k1.v(k10.Y);
                    s1.c = k10.Y.h0();
                    k10.b().m0.b(Boolean.valueOf(s1.c), "Registering connectivity change receiver. Network connected");
                    s1.b = true;
                }
                f1 f12 = this.c0;
                k1.v(f12);
                f12.x();
                return;
            }
            long v13 = this.g0.f0.a();
            this.S();
            long v14 = Math.max(0L, ((long)(((Long)s.t.a(null)))));
            k1.v(o0);
            if(!o0.Y(v13, v14)) {
                v11 = Math.max(v11, v13 + v14);
            }
            this.h0().a();
            ((S5.b)this.f()).getClass();
            long v15 = v11 - System.currentTimeMillis();
            if(v15 <= 0L) {
                this.S();
                v15 = Math.max(0L, ((long)(((Long)s.y.a(null)))));
                o o1 = this.g0.g0;
                ((S5.b)this.f()).getClass();
                o1.b(System.currentTimeMillis());
            }
            this.b().m0.b(v15, "Upload scheduled in approximately ms");
            f1 f13 = this.c0;
            k1.v(f13);
            f13.u();
            d0 d00 = (d0)f13.Y;
            Context context0 = d00.X;
            if(!r1.X(context0)) {
                f13.b().l0.d("Receiver not registered/enabled");
            }
            if(!r1.i0(context0)) {
                f13.b().l0.d("Service not registered/enabled");
            }
            f13.x();
            f13.b().m0.b(v15, "Scheduling upload, millis");
            d00.l0.getClass();
            long v16 = SystemClock.elapsedRealtime();
            if(v15 < Math.max(0L, ((long)(((Long)s.z.a(null))))) && f13.A().c == 0L) {
                f13.A().b(v15);
            }
            if(Build.VERSION.SDK_INT >= 24) {
                ComponentName componentName0 = new ComponentName(d00.X, "com.google.android.gms.measurement.AppMeasurementJobService");
                int v17 = f13.y();
                PersistableBundle persistableBundle0 = new PersistableBundle();
                persistableBundle0.putString("action", "com.google.android.gms.measurement.UPLOAD");
                JobInfo jobInfo0 = new JobInfo.Builder(v17, componentName0).setMinimumLatency(v15).setOverrideDeadline(v15 << 1).setExtras(persistableBundle0).build();
                JobScheduler jobScheduler0 = (JobScheduler)d00.X.getSystemService("jobscheduler");
                jobScheduler0.getClass();
                Method method0 = M.b;
                if(method0 != null && d00.X.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") == 0) {
                    M m0 = new M(jobScheduler0);
                    Method method1 = M.c;
                    if(method1 != null) {
                        try {
                            Integer integer0 = (Integer)method1.invoke(UserHandle.class, null);
                            if(integer0 == null) {
                                goto label_147;
                            }
                            else {
                                v18 = (int)integer0;
                            }
                        }
                        catch(IllegalAccessException | InvocationTargetException illegalAccessException0) {
                            if(Log.isLoggable("JobSchedulerCompat", 6)) {
                                Log.e("JobSchedulerCompat", "myUserId invocation illegal", illegalAccessException0);
                            }
                            v18 = 0;
                        }
                        goto label_150;
                    }
                label_147:
                    v18 = 0;
                    try {
                    label_150:
                        jobScheduler1 = m0.a;
                        Integer integer1 = (Integer)method0.invoke(jobScheduler1, jobInfo0, "com.google.android.gms", v18, "UploadAlarm");
                    }
                    catch(IllegalAccessException | InvocationTargetException illegalAccessException1) {
                        Log.e("UploadAlarm", "error calling scheduleAsPackage", illegalAccessException1);
                        jobScheduler1.schedule(jobInfo0);
                    }
                    return;
                }
                jobScheduler0.schedule(jobInfo0);
                return;
            }
            AlarmManager alarmManager0 = f13.c0;
            if(alarmManager0 != null) {
                alarmManager0.setInexactRepeating(2, v16 + v15, Math.max(((long)(((Long)s.u.a(null)))), v15), f13.z());
            }
            return;
        }
        this.b().m0.d("Nothing to upload or uploading impossible");
        this.h0().a();
        f1 f14 = this.c0;
        k1.v(f14);
        f14.x();
    }

    public final boolean H() {
        this.c().q();
        this.e0();
        g g0 = this.Z;
        k1.v(g0);
        if(g0.g0("select count(1) > 0 from raw_events", null) == 0L) {
            g g1 = this.Z;
            k1.v(g1);
            return !TextUtils.isEmpty(g1.z());
        }
        return true;
    }

    public final q0 I(String s) {
        this.c().q();
        this.e0();
        HashMap hashMap0 = this.z0;
        q0 q00 = (q0)hashMap0.get(s);
        if(q00 == null) {
            g g0 = this.Z;
            k1.v(g0);
            q00 = g0.t0(s);
            if(q00 == null) {
                q00 = q0.c;
            }
            this.c().q();
            this.e0();
            hashMap0.put(s, q00);
            g g1 = this.Z;
            k1.v(g1);
            g1.j0(s, q00);
        }
        return q00;
    }

    public final void J(zzae zzae0, zzo zzo0) {
        r.f(zzae0.X);
        r.j(zzae0.Y);
        r.j(zzae0.Z);
        r.f(zzae0.Z.Y);
        this.c().q();
        this.e0();
        if(!k1.a0(zzo0)) {
            return;
        }
        if(!zzo0.f0) {
            this.h(zzo0);
            return;
        }
        zzae zzae1 = new zzae(zzae0);
        boolean z = false;
        zzae1.c0 = false;
        g g0 = this.Z;
        k1.v(g0);
        g0.x0();
        try {
            g g1 = this.Z;
            k1.v(g1);
            String s = zzae1.X;
            r.j(s);
            zzae zzae2 = g1.n0(s, zzae1.Z.Y);
            d0 d00 = this.j0;
            if(zzae2 != null && !zzae2.Y.equals(zzae1.Y)) {
                L l0 = this.b();
                String s1 = d00.k0.g(zzae1.Z.Y);
                l0.h0.e("Updating a conditional user property with different origin. name, origin, origin (from DB)", s1, zzae1.Y, zzae2.Y);
            }
            if(zzae2 == null) {
            label_40:
                if(TextUtils.isEmpty(zzae1.d0)) {
                    Object object1 = zzae1.Z.zza();
                    zzae1.Z = new zzon(zzae1.b0, object1, zzae1.Z.Y, zzae1.Z.d0);
                    z = true;
                    zzae1.c0 = true;
                }
            }
            else {
                boolean z1 = zzae2.c0;
                if(z1) {
                    zzae1.Y = zzae2.Y;
                    zzae1.b0 = zzae2.b0;
                    zzae1.f0 = zzae2.f0;
                    zzae1.d0 = zzae2.d0;
                    zzae1.g0 = zzae2.g0;
                    zzae1.c0 = z1;
                    Object object0 = zzae1.Z.zza();
                    zzae1.Z = new zzon(zzae2.Z.Z, object0, zzae1.Z.Y, zzae2.Z.d0);
                    goto label_45;
                }
                goto label_40;
            }
        label_45:
            if(zzae1.c0) {
                zzon zzon0 = zzae1.Z;
                String s2 = zzae1.X;
                r.j(s2);
                String s3 = zzae1.Y;
                Object object2 = zzon0.zza();
                r.j(object2);
                p1 p10 = new p1(s2, s3, zzon0.Y, zzon0.Z, object2);
                Object object3 = p10.e;
                String s4 = p10.c;
                g g2 = this.Z;
                k1.v(g2);
                if(g2.a0(p10)) {
                    L l1 = this.b();
                    String s5 = zzae1.X;
                    String s6 = d00.k0.g(s4);
                    l1.l0.e("User property updated immediately", s5, s6, object3);
                }
                else {
                    L l2 = this.b();
                    j6.M m0 = L.u(zzae1.X);
                    String s7 = d00.k0.g(s4);
                    l2.e0.e("(2)Too many active user properties, ignoring", m0, s7, object3);
                }
                if(z) {
                    zzbf zzbf0 = zzae1.g0;
                    if(zzbf0 != null) {
                        this.P(new zzbf(zzbf0, zzae1.b0), zzo0);
                    }
                }
            }
            g g3 = this.Z;
            k1.v(g3);
            if(g3.Y(zzae1)) {
                L l3 = this.b();
                String s8 = zzae1.X;
                String s9 = d00.k0.g(zzae1.Z.Y);
                Object object4 = zzae1.Z.zza();
                l3.l0.e("Conditional property added", s8, s9, object4);
            }
            else {
                L l4 = this.b();
                j6.M m1 = L.u(zzae1.X);
                String s10 = d00.k0.g(zzae1.Z.Y);
                Object object5 = zzae1.Z.zza();
                l4.e0.e("Too many conditional properties, ignoring", m1, s10, object5);
            }
            g g4 = this.Z;
            k1.v(g4);
            g4.E0();
        }
        finally {
            g g5 = this.Z;
            k1.v(g5);
            g5.C0();
        }
    }

    public final void K(zzbf zzbf0, zzo zzo0) {
        a1 a10;
        Cursor cursor1;
        r.f(zzo0.X);
        O7.g g0 = O7.g.c(zzbf0);
        r1 r10 = this.c0();
        g g1 = this.Z;
        k1.v(g1);
        String s = zzo0.X;
        g1.q();
        g1.u();
        Cursor cursor0 = null;
        try {
            cursor1 = null;
            cursor1 = g1.y().rawQuery("select parameters from default_event_params where app_id=?", new String[]{s});
            goto label_15;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_30;
        }
        catch(Throwable throwable0) {
        }
        TWR.safeClose$NT(null, throwable0);
        throw throwable0;
        try {
            try {
            label_15:
                if(cursor1.moveToFirst()) {
                    byte[] arr_b = cursor1.getBlob(0);
                    try {
                        a10 = (a1)((com.google.android.gms.internal.measurement.Z0)O.E(a1.B(), arr_b)).d();
                    }
                    catch(IOException iOException0) {
                        L l0 = g1.b();
                        j6.M m0 = L.u(s);
                        l0.e0.c(m0, "Failed to retrieve default event parameters. appId", iOException0);
                        goto label_36;
                    }
                    g1.r();
                    cursor0 = O.z(a10.D());
                }
                else {
                    g1.b().m0.d("Default event parameters not found");
                }
                goto label_36;
            }
            catch(SQLiteException sQLiteException0) {
            label_30:
                g1.b().e0.b(sQLiteException0, "Error selecting default event parameters");
                if(cursor1 != null) {
                    goto label_36;
                }
            }
            goto label_37;
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor1, throwable0);
            throw throwable0;
        }
    label_36:
        cursor1.close();
    label_37:
        r10.J(((Bundle)g0.c0), ((Bundle)cursor0));
        r1 r11 = this.c0();
        j6.d d0 = this.S();
        d0.getClass();
        r11.G(g0, Math.max(Math.min(d0.v(s, s.L), 100), 25));
        zzbf zzbf1 = g0.d();
        if("_cmp".equals(zzbf1.X)) {
            zzbe zzbe0 = zzbf1.Y;
            if("referrer API v2".equals(zzbe0.X.getString("_cis"))) {
                String s1 = zzbe0.X.getString("gclid");
                if(!TextUtils.isEmpty(s1)) {
                    this.t(new zzon(zzbf1.b0, s1, "_lgclid", "auto"), zzo0);
                }
            }
        }
        this.r(zzbf1, zzo0);
    }

    public final void L(B b0) {
        this.c().q();
        if(TextUtils.isEmpty(b0.j()) && TextUtils.isEmpty(b0.d())) {
            String s = b0.f();
            r.j(s);
            this.N(s, 204, null, null, null);
            return;
        }
        e e0 = null;
        boolean z = this.S().B(null, s.F0);
        O o0 = this.Y;
        Y y0 = this.X;
        if(z) {
            String s1 = b0.f();
            r.j(s1);
            this.b().m0.b(s1, "Fetching remote configuration");
            k1.v(y0);
            I0 i00 = y0.H(s1);
            k1.v(y0);
            y0.q();
            String s2 = (String)y0.l0.get(s1);
            if(i00 != null) {
                if(!TextUtils.isEmpty(s2)) {
                    e0 = new e(0);  // initializer: Ls/J;-><init>(I)V
                    e0.put("If-Modified-Since", s2);
                }
                k1.v(y0);
                y0.q();
                String s3 = (String)y0.m0.get(s1);
                if(!TextUtils.isEmpty(s3)) {
                    if(e0 == null) {
                        e0 = new e(0);  // initializer: Ls/J;-><init>(I)V
                    }
                    e0.put("If-None-Match", s3);
                }
            }
            this.r0 = true;
            k1.v(o0);
            g3.b b1 = new g3.b(7, false);
            b1.Y = this;
            o0.q();
            o0.u();
            o0.Z.h0.getClass();
            String s4 = i1.v(b0);
            try {
                URL uRL0 = new URI(s4).toURL();
                o0.c().x(new Q(o0, b0.f(), uRL0, null, e0, b1));
            }
            catch(IllegalArgumentException | MalformedURLException | URISyntaxException unused_ex) {
                L l0 = o0.b();
                j6.M m0 = L.u(b0.f());
                l0.e0.c(m0, "Failed to parse config URL. Not fetching. appId", s4);
            }
            return;
        }
        this.h0.getClass();
        String s5 = i1.v(b0);
        try {
            String s6 = b0.f();
            r.j(s6);
            URL uRL1 = new URL(s5);
            this.b().m0.b(s6, "Fetching remote configuration");
            k1.v(y0);
            I0 i01 = y0.H(s6);
            k1.v(y0);
            y0.q();
            String s7 = (String)y0.l0.get(s6);
            if(i01 != null) {
                if(!TextUtils.isEmpty(s7)) {
                    e0 = new e(0);  // initializer: Ls/J;-><init>(I)V
                    e0.put("If-Modified-Since", s7);
                }
                k1.v(y0);
                y0.q();
                String s8 = (String)y0.m0.get(s6);
                if(!TextUtils.isEmpty(s8)) {
                    if(e0 == null) {
                        e0 = new e(0);  // initializer: Ls/J;-><init>(I)V
                    }
                    e0.put("If-None-Match", s8);
                }
            }
            this.r0 = true;
            k1.v(o0);
            a a0 = new a(12, this);
            o0.q();
            o0.u();
            o0.c().x(new Q(o0, s6, uRL1, null, e0, a0));
        }
        catch(MalformedURLException unused_ex) {
            L l1 = this.b();
            j6.M m1 = L.u(b0.f());
            l1.e0.c(m1, "Failed to parse config URL. Not fetching. appId", s5);
        }
    }

    public final void M(B b0, h1 h10) {
        this.c().q();
        this.e0();
        Q0 q00 = R0.y();
        d0 d00 = b0.a;
        d0.h(d00.h0);
        d00.h0.q();
        byte[] arr_b = b0.I;
        if(arr_b != null) {
            try {
                q00 = (Q0)O.E(q00, arr_b);
            }
            catch(k2 unused_ex) {
                L l0 = this.b();
                j6.M m0 = L.u(b0.f());
                l0.h0.b(m0, "Failed to parse locally stored ad campaign info. appId");
            }
        }
        for(Object object0: h10.p()) {
            a1 a10 = (a1)object0;
            if(a10.C().equals("_cmp")) {
                Serializable serializable0 = O.b0(a10, "gclid");
                Serializable serializable1 = "";
                if(serializable0 == null) {
                    serializable0 = "";
                }
                Serializable serializable2 = O.b0(a10, "gbraid");
                if(serializable2 == null) {
                    serializable2 = "";
                }
                Serializable serializable3 = O.b0(a10, "gad_source");
                if(serializable3 != null) {
                    serializable1 = serializable3;
                }
                if(!((String)serializable0).isEmpty() || !((String)serializable2).isEmpty()) {
                    Serializable serializable4 = 0L;
                    Serializable serializable5 = O.b0(a10, "click_timestamp");
                    if(serializable5 != null) {
                        serializable4 = serializable5;
                    }
                    long v = (long)(((Long)serializable4));
                    if(v <= 0L) {
                        v = a10.A();
                    }
                    if("referrer API v2".equals(O.b0(a10, "_cis"))) {
                        if(v <= ((R0)q00.Y).s()) {
                            continue;
                        }
                        if(((String)serializable0).isEmpty()) {
                            q00.f();
                            R0.F(((R0)q00.Y));
                        }
                        else {
                            q00.f();
                            R0.G(((R0)q00.Y), ((String)serializable0));
                        }
                        if(((String)serializable2).isEmpty()) {
                            q00.f();
                            R0.C(((R0)q00.Y));
                        }
                        else {
                            q00.f();
                            R0.D(((R0)q00.Y), ((String)serializable2));
                        }
                        if(((String)serializable1).isEmpty()) {
                            q00.f();
                            R0.z(((R0)q00.Y));
                        }
                        else {
                            q00.f();
                            R0.A(((R0)q00.Y), ((String)serializable1));
                        }
                        q00.f();
                        R0.u(((R0)q00.Y), v);
                    }
                    else if(v > ((R0)q00.Y).o()) {
                        if(((String)serializable0).isEmpty()) {
                            q00.f();
                            R0.w(((R0)q00.Y));
                        }
                        else {
                            q00.f();
                            R0.x(((R0)q00.Y), ((String)serializable0));
                        }
                        if(((String)serializable2).isEmpty()) {
                            q00.f();
                            R0.t(((R0)q00.Y));
                        }
                        else {
                            q00.f();
                            R0.v(((R0)q00.Y), ((String)serializable2));
                        }
                        if(((String)serializable1).isEmpty()) {
                            q00.f();
                            R0.p(((R0)q00.Y));
                        }
                        else {
                            q00.f();
                            R0.r(((R0)q00.Y), ((String)serializable1));
                        }
                        q00.f();
                        R0.q(((R0)q00.Y), v);
                    }
                }
            }
        }
        if(!((R0)q00.d()).equals(R0.B())) {
            R0 r00 = (R0)q00.d();
            h10.f();
            com.google.android.gms.internal.measurement.i1.v(((com.google.android.gms.internal.measurement.i1)h10.Y), r00);
        }
        byte[] arr_b1 = ((R0)q00.d()).c();
        d0.h(d00.h0);
        d00.h0.q();
        b0.Q |= b0.I != arr_b1;
        b0.I = arr_b1;
        if(b0.n()) {
            g g0 = this.Z;
            k1.v(g0);
            g0.O(b0, false);
        }
    }

    public final void N(String s, int v, IOException iOException0, byte[] arr_b, Map map0) {
        String s2;
        String s1;
        O o0 = this.Y;
        this.c().q();
        this.e0();
        r.f(s);
        try {
            if(arr_b == null) {
                arr_b = new byte[0];
            }
            this.b().m0.b(((int)arr_b.length), "onConfigFetched. Response size");
            g g0 = this.Z;
            k1.v(g0);
            g0.x0();
            try {
                g g1 = this.Z;
                k1.v(g1);
                B b0 = g1.p0(s);
                if(b0 == null) {
                    L l0 = this.b();
                    j6.M m0 = L.u(s);
                    l0.h0.b(m0, "App does not exist in onConfigFetched. appId");
                }
                else {
                    Y y0 = this.X;
                    if((v == 200 || (v == 204 || v == 304)) && iOException0 == null || v == 404) {
                        if(this.S().B(null, s.F0)) {
                            s1 = k1.l("Last-Modified", map0);
                            s2 = k1.l("ETag", map0);
                        }
                        else {
                            List list0 = map0 == null ? null : ((List)map0.get("Last-Modified"));
                            s1 = list0 == null || list0.isEmpty() ? null : ((String)list0.get(0));
                            List list1 = map0 == null ? null : ((List)map0.get("ETag"));
                            s2 = list1 == null || list1.isEmpty() ? null : ((String)list1.get(0));
                        }
                        if(v == 304 || v == 404) {
                            k1.v(y0);
                            if(y0.H(s) == null) {
                                k1.v(y0);
                                y0.E(s, null, null, null);
                            }
                        }
                        else {
                            k1.v(y0);
                            y0.E(s, arr_b, s1, s2);
                        }
                        ((S5.b)this.f()).getClass();
                        b0.w(System.currentTimeMillis());
                        g g3 = this.Z;
                        k1.v(g3);
                        g3.O(b0, false);
                        if(v == 404) {
                            this.b().j0.b(s, "Config not found. Using empty config. appId");
                        }
                        else {
                            this.b().m0.c(v, "Successfully fetched config. Got network response. code, size", ((int)arr_b.length));
                        }
                        k1.v(o0);
                        if(o0.h0() && this.H()) {
                            this.f0();
                        }
                        else if(this.S().B(null, s.B0)) {
                            k1.v(o0);
                            if(o0.h0()) {
                                g g4 = this.Z;
                                k1.v(g4);
                                if(g4.B0(b0.f())) {
                                    this.U(b0.f());
                                }
                                else {
                                    this.G();
                                }
                            }
                            else {
                                this.G();
                            }
                        }
                        else {
                            this.G();
                        }
                    }
                    else {
                        ((S5.b)this.f()).getClass();
                        b0.L(System.currentTimeMillis());
                        g g2 = this.Z;
                        k1.v(g2);
                        g2.O(b0, false);
                        this.b().m0.c(v, "Fetching config failed. code, error", iOException0);
                        k1.v(y0);
                        y0.q();
                        y0.l0.put(s, null);
                        o o1 = this.g0.h0;
                        ((S5.b)this.f()).getClass();
                        o1.b(System.currentTimeMillis());
                        if(v == 429 || v == 503) {
                            o o2 = this.g0.f0;
                            ((S5.b)this.f()).getClass();
                            o2.b(System.currentTimeMillis());
                        }
                        this.G();
                    }
                }
                g g5 = this.Z;
                k1.v(g5);
                g5.E0();
            }
            finally {
                g g6 = this.Z;
                k1.v(g6);
                g6.C0();
            }
        }
        finally {
            this.r0 = false;
            this.E();
        }
    }

    public final zzo O(String s) {
        g g0 = this.Z;
        k1.v(g0);
        B b0 = g0.p0(s);
        if(b0 != null && !TextUtils.isEmpty(b0.h())) {
            Boolean boolean0 = this.j(b0);
            if(boolean0 != null && !boolean0.booleanValue()) {
                L l0 = this.b();
                j6.M m0 = L.u(s);
                l0.e0.b(m0, "App version does not match; dropping. appId");
                return null;
            }
            String s1 = b0.j();
            String s2 = b0.h();
            long v = b0.y();
            d0.h(b0.a.h0);
            b0.a.h0.q();
            String s3 = b0.l;
            d0.h(b0.a.h0);
            b0.a.h0.q();
            long v1 = b0.m;
            d0.h(b0.a.h0);
            b0.a.h0.q();
            long v2 = b0.n;
            d0.h(b0.a.h0);
            b0.a.h0.q();
            boolean z = b0.o;
            String s4 = b0.i();
            d0.h(b0.a.h0);
            b0.a.h0.q();
            d0.h(b0.a.h0);
            b0.a.h0.q();
            boolean z1 = b0.p;
            String s5 = b0.d();
            Boolean boolean1 = b0.U();
            long v3 = b0.N();
            d0.h(b0.a.h0);
            b0.a.h0.q();
            ArrayList arrayList0 = b0.t;
            String s6 = this.I(s).m();
            boolean z2 = b0.o();
            d0.h(b0.a.h0);
            b0.a.h0.q();
            long v4 = b0.w;
            q0 q00 = this.I(s);
            l l1 = this.Q(s);
            d0.h(b0.a.h0);
            b0.a.h0.q();
            int v5 = b0.y;
            d0.h(b0.a.h0);
            b0.a.h0.q();
            long v6 = b0.C;
            String s7 = b0.l();
            String s8 = b0.k();
            return new zzo(s, s1, s2, v, s3, v1, v2, null, z, false, s4, 0L, 0, z1, false, s5, boolean1, v3, arrayList0, s6, "", null, z2, v4, q00.b, l1.b, v5, v6, s7, s8);
        }
        this.b().l0.b(s, "No app data available; dropping");
        return null;
    }

    public final void P(zzbf zzbf0, zzo zzo0) {
        // ERROR - The method was not decompiled
        // External interruption
    }

    public final l Q(String s) {
    }

    public final void R(zzo zzo0) {
    }

    public final j6.d S() {
    }

    public final void T(zzo zzo0) {
    }

    public final void U(String s) {
    }

    public final g V() {
    }

    public final void W(zzo zzo0) {
    }

    public final void X(zzo zzo0) {
    }

    public static Boolean Y(zzo zzo0) {
        Boolean boolean0 = zzo0.p0;
        String s = zzo0.D0;
        if(!TextUtils.isEmpty(s)) {
            switch(n1.a[((s0)i.s.G(s).X).ordinal()]) {
                case 2: {
                    return Boolean.FALSE;
                }
                case 3: {
                    return Boolean.TRUE;
                }
                case 1: 
                case 4: {
                    return null;
                }
                default: {
                    return boolean0;
                }
            }
        }
        return boolean0;
    }

    public final Y Z() {
    }

    @Override  // j6.n0
    public final i a() {
    }

    // Deobfuscation rating: LOW(20)
    public static boolean a0(zzo zzo0) {
        return !TextUtils.isEmpty(zzo0.Y) || !TextUtils.isEmpty(zzo0.o0);
    }

    @Override  // j6.n0
    public final L b() {
    }

    public final O b0() {
    }

    @Override  // j6.n0
    public final a0 c() {
    }

    public final r1 c0() {
    }

    public final int d(String s, J j0) {
    }

    public final void d0() {
    }

    // This method was un-flattened
    public final Bundle e(String s) {
    }

    public final void e0() {
    }

    @Override  // j6.n0
    public final S5.a f() {
    }

    public final void f0() {
    }

    public final l g(String s, l l0, q0 q00, J j0) {
    }

    public final long g0() {
    }

    public final B h(zzo zzo0) {
    }

    public final S h0() {
    }

    public static k1 i(Service service0) {
        r.j(service0);
        r.j(service0.getApplicationContext());
        if(k1.F0 == null) {
            synchronized(k1.class) {
                if(k1.F0 == null) {
                    k1.F0 = new k1(new b(service0));
                }
            }
        }
        return k1.F0;
    }

    public final Boolean j(B b0) {
    }

    public final String k(q0 q00) {
    }

    public static String l(String s, Map map0) {
        if(map0 == null) {
            return null;
        }
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(s.equalsIgnoreCase(((String)map$Entry0.getKey()))) {
                return ((List)map$Entry0.getValue()).isEmpty() ? null : ((String)((List)map$Entry0.getValue()).get(0));
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public static void m(com.google.android.gms.internal.measurement.Z0 z00, int v, String s) {
        List list0 = z00.o();
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            if("_err".equals(((d1)list0.get(v1)).D())) {
                return;
            }
        }
        c1 c10 = d1.C();
        c10.i("_err");
        c10.h(((long)v));
        d1 d10 = (d1)c10.d();
        c1 c11 = d1.C();
        c11.i("_ev");
        c11.j(s);
        d1 d11 = (d1)c11.d();
        z00.i(d10);
        z00.i(d11);
    }

    public static void n(com.google.android.gms.internal.measurement.Z0 z00, String s) {
        List list0 = z00.o();
        for(int v = 0; v < list0.size(); ++v) {
            if(s.equals(((d1)list0.get(v)).D())) {
                z00.f();
                a1.q(v, ((a1)z00.Y));
                return;
            }
        }
    }

    public final void o(h1 h10, long v, boolean z) {
    }

    public final void p(h1 h10, String s) {
    }

    public final void q(zzae zzae0, zzo zzo0) {
    }

    public final void r(zzbf zzbf0, zzo zzo0) {
    }

    public final void s(zzbf zzbf0, String s) {
    }

    public final void t(zzon zzon0, zzo zzo0) {
    }

    public final void u(B b0, h1 h10) {
    }

    public static void v(j6.g1 g10) {
        if(g10 == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if(!g10.b0) {
            throw new IllegalStateException("Component not initialized: " + g10.getClass());
        }
    }

    public final void w(String s, int v, IOException iOException0, byte[] arr_b, c c0) {
    }

    public final void x(String s, c1 c10, Bundle bundle0, String s1) {
    }

    public final void y(String s, zzo zzo0) {
    }

    public final void z(String s, boolean z, Long long0, Long long1) {
    }

    @Override  // j6.n0
    public final Context zza() {
    }
}

