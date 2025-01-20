package R2;

import Ec.j;
import Ec.m;
import M6.k;
import N6.c;
import T8.a;
import T8.b;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.measurement.E;
import com.google.android.gms.internal.measurement.r;
import com.google.android.gms.internal.measurement.t;
import com.google.android.gms.internal.measurement.x1;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import com.journeyapps.barcodescanner.ViewfinderView;
import i.s;
import io.sentry.protocol.A;
import io.sentry.protocol.z;
import io.sentry.y1;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import k1.f;
import kotlin.jvm.functions.Function3;
import o6.h;
import p2.M;
import q2.C;
import r8.o;

public final class e implements c, a, V9.a, o6.a {
    public Object X;
    public Object Y;

    public e(int v, f f0) {
        this.X = f0;
        String s = "top";
        if(v != 0) {
            if(v == 1) {
                s = "bottom";
            }
            else {
                Log.e("CCL", "horizontalAnchorIndexToAnchorName: Unknown horizontal index");
            }
        }
        this.Y = s;
    }

    public e(Object object0, Object object1) {
        this.X = object0;
        this.Y = object1;
        super();
    }

    public e(Object object0, Object object1, boolean z) {
        this.Y = object0;
        this.X = object1;
        super();
    }

    public e(M m0) {
        this.X = m0;
        L8.a a0 = new L8.a();
        a0.b = 0;
        this.Y = a0;
    }

    public static e a(Context context0) {
        FileLock fileLock0;
        FileChannel fileChannel0;
        try {
            fileChannel0 = new RandomAccessFile(new File(context0.getFilesDir(), "generatefid.lock"), "rw").getChannel();
        }
        catch(IOException | Error | OverlappingFileLockException iOException0) {
            fileChannel0 = null;
            fileLock0 = null;
            goto label_13;
        }
        try {
            fileLock0 = fileChannel0.lock();
        }
        catch(IOException | Error | OverlappingFileLockException iOException0) {
            fileLock0 = null;
            goto label_13;
        }
        try {
            return new e(fileChannel0, fileLock0);
        }
        catch(IOException | Error | OverlappingFileLockException iOException0) {
        }
    label_13:
        Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", iOException0);
        if(fileLock0 != null) {
            try {
                fileLock0.release();
            }
            catch(IOException unused_ex) {
            }
        }
        if(fileChannel0 != null) {
            try {
                fileChannel0.close();
            }
            catch(IOException unused_ex) {
            }
        }
        return null;
    }

    public View b(int v, int v1, int v2, int v3) {
        M m0 = (M)this.X;
        int v4 = m0.d();
        int v5 = m0.a();
        View view0 = null;
        while(v != v1) {
            View view1 = m0.c(v);
            int v6 = m0.b(view1);
            int v7 = m0.e(view1);
            L8.a a0 = (L8.a)this.Y;
            a0.c = v4;
            a0.d = v5;
            a0.e = v6;
            a0.f = v7;
            if(v2 != 0) {
                a0.b = v2;
                if(a0.a()) {
                    return view1;
                }
            }
            if(v3 != 0) {
                a0.b = v3;
                if(a0.a()) {
                    view0 = view1;
                }
            }
            v += (v1 <= v ? -1 : 1);
        }
        return view0;
    }

    @Override  // V9.a
    public Function3 c() {
        return (W9.a)this.X;
    }

    @Override  // T8.a
    public void d(b b0) {
        ((B3.c)this.X).d(b0);
    }

    @Override  // T8.a
    public void e(List list0) {
        for(Object object0: list0) {
            o o0 = (o)object0;
            ViewfinderView viewfinderView0 = ((DecoratedBarcodeView)this.Y).c0;
            if(viewfinderView0.h0.size() < 20) {
                viewfinderView0.h0.add(o0);
            }
        }
    }

    public ArrayList f(Map map0, ArrayList arrayList0, boolean z) {
        Thread thread0 = Thread.currentThread();
        if(!map0.isEmpty()) {
            ArrayList arrayList1 = new ArrayList();
            if(!map0.containsKey(thread0)) {
                map0.put(thread0, thread0.getStackTrace());
            }
            for(Object object0: map0.entrySet()) {
                Thread thread1 = (Thread)((Map.Entry)object0).getKey();
                StackTraceElement[] arr_stackTraceElement = (StackTraceElement[])((Map.Entry)object0).getValue();
                Thread thread2 = (Thread)((Map.Entry)object0).getKey();
                A a0 = new A();  // initializer: Ljava/lang/Object;-><init>()V
                a0.Z = thread2.getName();
                a0.Y = thread2.getPriority();
                a0.X = thread2.getId();
                a0.e0 = Boolean.valueOf(thread2.isDaemon());
                a0.b0 = thread2.getState().name();
                a0.c0 = Boolean.valueOf(thread1 != thread0 && !z || arrayList0 != null && arrayList0.contains(thread1.getId()));
                ArrayList arrayList2 = ((s)this.X).C(arr_stackTraceElement, false);
                if(((y1)this.Y).isAttachStacktrace() && arrayList2 != null && !arrayList2.isEmpty()) {
                    z z1 = new z(arrayList2);
                    z1.Z = Boolean.TRUE;
                    a0.g0 = z1;
                }
                arrayList1.add(a0);
            }
            return arrayList1;
        }
        return null;
    }

    public Long g(String s) {
        Long long0 = null;
        C c0 = M6.b.o(1, "SELECT long_value FROM Preference where `key`=?");
        c0.c(1, s);
        WorkDatabase_Impl workDatabase_Impl0 = (WorkDatabase_Impl)this.X;
        workDatabase_Impl0.b();
        Cursor cursor0 = P4.c.O(workDatabase_Impl0, c0, false);
        try {
            if(cursor0.moveToFirst() && !cursor0.isNull(0)) {
                long0 = cursor0.getLong(0);
            }
            return long0;
        }
        finally {
            cursor0.close();
            c0.f();
        }
    }

    public void h(d d0) {
        WorkDatabase_Impl workDatabase_Impl0 = (WorkDatabase_Impl)this.X;
        workDatabase_Impl0.b();
        workDatabase_Impl0.c();
        try {
            ((R2.b)this.Y).f(d0);
            workDatabase_Impl0.q();
        }
        finally {
            workDatabase_Impl0.k();
        }
    }

    public boolean i(View view0) {
        M m0 = (M)this.X;
        int v = m0.d();
        int v1 = m0.a();
        int v2 = m0.b(view0);
        int v3 = m0.e(view0);
        ((L8.a)this.Y).c = v;
        ((L8.a)this.Y).d = v1;
        ((L8.a)this.Y).e = v2;
        ((L8.a)this.Y).f = v3;
        ((L8.a)this.Y).b = 0x6003;
        return ((L8.a)this.Y).a();
    }

    @Override  // o6.a
    public Object j(h h0) {
        J5.a a0 = (J5.a)this.X;
        a0.getClass();
        if(h0.h()) {
            Bundle bundle0 = (Bundle)h0.f();
            if(bundle0 != null && bundle0.containsKey("google.messenger")) {
                return a0.a(((Bundle)this.Y)).m(J5.f.Z, J5.c.b0);
            }
        }
        return h0;
    }

    public void k(g1.c c0, float f, float f1) {
        int v = c0.b;
        String s = "top";
        if(v != 0) {
            if(v == 1) {
                s = "bottom";
            }
            else {
                Log.e("CCL", "horizontalAnchorIndexToAnchorName: Unknown horizontal index");
            }
        }
        k1.a a0 = new k1.a(new char[0]);  // initializer: Lk1/b;-><init>([C)V
        a0.o(k1.h.o(c0.a.toString()));
        a0.o(k1.h.o(s));
        a0.o(new k1.e(f));
        a0.o(new k1.e(f1));
        ((f)this.X).G(((String)this.Y), a0);
    }

    public static e l(String[] arr_s) {
        String s2;
        int v3;
        int v2;
        String[] arr_s1;
        String s;
        try {
            m[] arr_m = new m[arr_s.length];
            j j0 = new j();  // initializer: Ljava/lang/Object;-><init>()V
            for(int v = 0; true; ++v) {
                if(v >= arr_s.length) {
                    return new e(((String[])arr_s.clone()), Ec.b.g(arr_m));
                }
                s = arr_s[v];
                arr_s1 = D3.b.c0;
                j0.h0(34);
                int v1 = s.length();
                v2 = 0;
                v3 = 0;
            label_11:
                if(v2 < v1) {
                    break;
                }
                if(v3 < v1) {
                    j0.l0(v3, v1, s);
                }
                j0.h0(34);
                j0.G();
                arr_m[v] = j0.N(j0.Y);
            }
            int v4 = s.charAt(v2);
            if(v4 < 0x80) {
                String s1 = arr_s1[v4];
                if(s1 != null) {
                    s2 = s1;
                    goto label_33;
                }
            }
            else {
                switch(v4) {
                    case 0x2028: {
                        s2 = "\\u2028";
                        break;
                    }
                    case 0x2029: {
                        s2 = "\\u2029";
                        break;
                    }
                    default: {
                        ++v2;
                        goto label_11;
                    }
                }
            label_33:
                if(v3 < v2) {
                    j0.l0(v3, v2, s);
                }
                j0.m0(s2);
                v3 = v2 + 1;
            }
            ++v2;
            goto label_11;
        }
        catch(IOException iOException0) {
        }
        throw new AssertionError(iOException0);
    }

    public void m() {
        try {
            ((FileLock)this.Y).release();
            ((FileChannel)this.X).close();
        }
        catch(IOException iOException0) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", iOException0);
        }
    }

    public com.google.android.gms.internal.measurement.o n(R2.h h0, com.google.android.gms.internal.measurement.o o0) {
        x1.h(h0);
        if(o0 instanceof r) {
            ArrayList arrayList0 = ((r)o0).Y;
            HashMap hashMap0 = (HashMap)this.X;
            String s = ((r)o0).X;
            return hashMap0.containsKey(s) ? ((t)hashMap0.get(s)).b(s, h0, arrayList0) : ((t)this.Y).b(s, h0, arrayList0);
        }
        return o0;
    }

    public void o(t t0) {
        for(Object object0: t0.a) {
            ((HashMap)this.X).put(((E)object0).toString(), t0);
        }
    }

    @Override  // N6.c
    public Object zza() {
        return new M6.j(((B1.b)((U7.c)this.X).Y).a, ((k)((c)this.Y).zza()));
    }
}

