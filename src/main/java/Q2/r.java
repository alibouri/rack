package q2;

import Bb.F;
import Bb.p;
import Cb.l;
import E7.u;
import I2.J;
import Nb.j;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import jeb.synthetic.FIN;
import o.e0;
import q.f;
import x2.b;
import x2.g;
import yc.d;

public final class r {
    public final v a;
    public final HashMap b;
    public final HashMap c;
    public final LinkedHashMap d;
    public final String[] e;
    public final AtomicBoolean f;
    public volatile boolean g;
    public volatile g h;
    public final u i;
    public final f j;
    public final Object k;
    public final Object l;
    public final e0 m;
    public static final String[] n;

    static {
        r.n = new String[]{"UPDATE", "DELETE", "INSERT"};
    }

    public r(v v0, HashMap hashMap0, HashMap hashMap1, String[] arr_s) {
        String s3;
        this.a = v0;
        this.b = hashMap0;
        this.c = hashMap1;
        this.f = new AtomicBoolean(false);
        u u0 = new u();  // initializer: Ljava/lang/Object;-><init>()V
        u0.b = new long[arr_s.length];
        u0.c = new boolean[arr_s.length];
        u0.d = new int[arr_s.length];
        this.i = u0;
        j.e(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(IdentityHashMap())");
        this.j = new f();
        this.k = new Object();
        this.l = new Object();
        this.d = new LinkedHashMap();
        String[] arr_s1 = new String[arr_s.length];
        for(int v1 = 0; v1 < arr_s.length; ++v1) {
            String s = arr_s[v1];
            Locale locale0 = Locale.US;
            j.e(locale0, "US");
            String s1 = s.toLowerCase(locale0);
            j.e(s1, "this as java.lang.String).toLowerCase(locale)");
            this.d.put(s1, v1);
            String s2 = (String)this.b.get(arr_s[v1]);
            if(s2 == null) {
                s3 = null;
            }
            else {
                s3 = s2.toLowerCase(locale0);
                j.e(s3, "this as java.lang.String).toLowerCase(locale)");
            }
            if(s3 != null) {
                s1 = s3;
            }
            arr_s1[v1] = s1;
        }
        this.e = arr_s1;
        for(Object object0: this.b.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            String s4 = (String)map$Entry0.getValue();
            Locale locale1 = Locale.US;
            j.e(locale1, "US");
            String s5 = s4.toLowerCase(locale1);
            j.e(s5, "this as java.lang.String).toLowerCase(locale)");
            if(this.d.containsKey(s5)) {
                String s6 = ((String)map$Entry0.getKey()).toLowerCase(locale1);
                j.e(s6, "this as java.lang.String).toLowerCase(locale)");
                j.f(this.d, "<this>");
                Object object1 = F.B(s5, this.d);
                this.d.put(s6, object1);
            }
        }
        this.m = new e0(7, this);
    }

    public final void a(o o0) {
        String[] arr_s = o0.a;
        l l0 = new l();
        for(int v1 = 0; v1 < arr_s.length; ++v1) {
            String s = arr_s[v1];
            Locale locale0 = Locale.US;
            j.e(locale0, "US");
            String s1 = s.toLowerCase(locale0);
            j.e(s1, "this as java.lang.String).toLowerCase(locale)");
            HashMap hashMap0 = this.c;
            if(hashMap0.containsKey(s1)) {
                String s2 = s.toLowerCase(locale0);
                j.e(s2, "this as java.lang.String).toLowerCase(locale)");
                Object object0 = hashMap0.get(s2);
                j.c(object0);
                l0.addAll(((Collection)object0));
            }
            else {
                l0.add(s);
            }
        }
        String[] arr_s1 = (String[])d.g(l0).toArray(new String[0]);
        ArrayList arrayList0 = new ArrayList(arr_s1.length);
        for(int v = 0; v < arr_s1.length; ++v) {
            String s3 = arr_s1[v];
            Locale locale1 = Locale.US;
            j.e(locale1, "US");
            String s4 = s3.toLowerCase(locale1);
            j.e(s4, "this as java.lang.String).toLowerCase(locale)");
            Integer integer0 = (Integer)this.d.get(s4);
            if(integer0 == null) {
                throw new IllegalArgumentException("There is no table with name " + s3);
            }
            arrayList0.add(integer0);
        }
        int[] arr_v = p.P0(arrayList0);
        q2.p p0 = new q2.p(o0, arr_v, arr_s1);
        synchronized(this.j) {
            q2.p p1 = (q2.p)this.j.c(o0, p0);
        }
        if(p1 == null) {
            int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
            if(this.i.k(arr_v1)) {
                this.e();
            }
        }
    }

    public final boolean b() {
        if(!this.a.m()) {
            return false;
        }
        if(!this.g) {
            this.a.g().T();
        }
        if(!this.g) {
            Log.e("ROOM", "database is not initialized even though it is open");
            return false;
        }
        return true;
    }

    public final void c(o o0) {
        q2.p p0;
        synchronized(this.j) {
            p0 = (q2.p)this.j.d(o0);
        }
        if(p0 != null) {
            int[] arr_v = Arrays.copyOf(p0.b, p0.b.length);
            if(this.i.l(arr_v)) {
                this.e();
            }
        }
    }

    public final void d(b b0, int v) {
        b0.l("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + v + ", 0)");
        String s = this.e[v];
        String[] arr_s = r.n;
        for(int v1 = 0; v1 < 3; ++v1) {
            String s1 = arr_s[v1];
            String s2 = "CREATE TEMP TRIGGER IF NOT EXISTS " + J.E(s, s1) + " AFTER " + s1 + " ON `" + s + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + v + " AND invalidated = 0; END";
            j.e(s2, "StringBuilder().apply(builderAction).toString()");
            b0.l(s2);
        }
    }

    public final void e() {
        v v0 = this.a;
        if(!v0.m()) {
            return;
        }
        this.f(v0.g().T());
    }

    public final void f(b b0) {
        int v;
        ReentrantReadWriteLock.ReadLock reentrantReadWriteLock$ReadLock0;
        j.f(b0, "database");
        if(b0.r()) {
            return;
        }
        try {
            reentrantReadWriteLock$ReadLock0 = this.a.i.readLock();
            j.e(reentrantReadWriteLock$ReadLock0, "readWriteLock.readLock()");
            reentrantReadWriteLock$ReadLock0.lock();
        }
        catch(IllegalStateException illegalStateException0) {
            goto label_52;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_55;
        }
        try {
            Object object0 = this.k;
            __monitor_enter(object0);
            v = FIN.finallyOpen$NT();
            int[] arr_v = this.i.g();
            if(arr_v != null) {
                if(b0.v()) {
                    b0.b();
                }
                else {
                    b0.a();
                }
                try {
                    int v2 = 0;
                    for(int v3 = 0; v2 < arr_v.length; ++v3) {
                        switch(arr_v[v2]) {
                            case 1: {
                                this.d(b0, v3);
                                break;
                            }
                            case 2: {
                                String s = this.e[v3];
                                String[] arr_s = r.n;
                                for(int v4 = 0; v4 < 3; ++v4) {
                                    String s1 = "DROP TRIGGER IF EXISTS " + J.E(s, arr_s[v4]);
                                    j.e(s1, "StringBuilder().apply(builderAction).toString()");
                                    b0.l(s1);
                                }
                            }
                        }
                        ++v2;
                    }
                    b0.G();
                }
                finally {
                    b0.h();
                }
                FIN.finallyCodeBegin$NT(v);
                __monitor_exit(object0);
                FIN.finallyCodeEnd$NT(v);
                goto label_42;
            }
            goto label_44;
        }
        catch(Throwable throwable0) {
            goto label_47;
        }
        try {
        label_42:
            reentrantReadWriteLock$ReadLock0.unlock();
            return;
        }
        catch(IllegalStateException illegalStateException0) {
            goto label_52;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_55;
        }
        try {
        label_44:
            FIN.finallyExec$NT(v);
            goto label_49;
        }
        catch(Throwable throwable0) {
            try {
            label_47:
                reentrantReadWriteLock$ReadLock0.unlock();
                throw throwable0;
            label_49:
                reentrantReadWriteLock$ReadLock0.unlock();
                return;
            }
            catch(IllegalStateException illegalStateException0) {
            }
            catch(SQLiteException sQLiteException0) {
                goto label_55;
            }
        }
    label_52:
        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", illegalStateException0);
        return;
    label_55:
        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", sQLiteException0);
    }
}

