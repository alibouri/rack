package com.google.android.gms.internal.measurement;

import W6.a;
import W6.b;
import W6.d;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.RemoteException;
import android.util.Log;
import io.sentry.android.core.internal.util.g;
import java.util.Collections;
import java.util.HashMap;
import s.e;

public final class q2 implements d, t2 {
    public Object X;
    public static final d2 Y;

    static {
        q2.Y = new d2(8);
    }

    @Override  // com.google.android.gms.internal.measurement.t2
    public B2 a(Class class0) {
        t2[] arr_t2 = (t2[])this.X;
        for(int v = 0; v < arr_t2.length; ++v) {
            t2 t20 = arr_t2[v];
            if(t20.b(class0)) {
                return t20.a(class0);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: " + class0.getName());
    }

    @Override  // com.google.android.gms.internal.measurement.t2
    public boolean b(Class class0) {
        t2[] arr_t2 = (t2[])this.X;
        for(int v = 0; v < arr_t2.length; ++v) {
            if(arr_t2[v].b(class0)) {
                return true;
            }
        }
        return false;
    }

    public Object c() {
        e e0;
        A1 a10 = (A1)this.X;
        ContentProviderClient contentProviderClient0 = a10.X.acquireUnstableContentProviderClient(a10.Y);
        if(contentProviderClient0 == null) {
            Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
            return Collections.emptyMap();
        }
        try(Cursor cursor0 = contentProviderClient0.query(a10.Y, A1.g0, null, null, null)) {
            if(cursor0 != null) {
                int v1 = cursor0.getCount();
                if(v1 == 0) {
                    return Collections.emptyMap();
                }
                e0 = v1 <= 0x100 ? new e(v1) : new HashMap(v1, 1.0f);  // initializer: Ls/J;-><init>(I)V
                while(true) {
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                    e0.put(cursor0.getString(0), cursor0.getString(1));
                }
                if(!cursor0.isAfterLast()) {
                    Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                    return Collections.emptyMap();
                }
                return e0;
            }
            Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
            return Collections.emptyMap();
        }
        catch(RemoteException remoteException0) {
            Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", remoteException0);
            return Collections.emptyMap();
        }
        finally {
            contentProviderClient0.release();
        }
    }

    public void d(int v, double f) {
        U1 u10 = (U1)this.X;
        u10.getClass();
        u10.n(v, Double.doubleToRawLongBits(f));
    }

    public void e(int v, float f) {
        U1 u10 = (U1)this.X;
        u10.getClass();
        u10.m(v, Float.floatToRawIntBits(f));
    }

    public void f(int v, int v1) {
        ((U1)this.X).w(v, v1);
    }

    public void g(int v, long v1) {
        ((U1)this.X).n(v, v1);
    }

    @Override  // W6.d
    public Object get() {
        b b0;
        Context context0 = (Context)this.X;
        Object object0 = G1.a;
        if(object0 == null) {
            synchronized(G1.class) {
                object0 = G1.a;
                if(object0 == null) {
                    if((Build.TYPE.equals("eng") || Build.TYPE.equals("userdebug")) && (Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys"))) {
                        if(y1.a() && !context0.isDeviceProtectedStorage()) {
                            context0 = g.f(context0);
                        }
                        b0 = G1.e(context0);
                    }
                    else {
                        b0 = a.X;
                    }
                    G1.a = b0;
                    object0 = b0;
                }
            }
        }
        return object0;
    }

    public void h(int v, T1 t10) {
        U1 u10 = (U1)this.X;
        u10.C(v, 2);
        u10.B(t10.g());
        int v1 = t10.g();
        u10.D(t10.Y, t10.i(), v1);
    }

    public void i(int v, Object object0, C2 c20) {
        U1 u10 = (U1)this.X;
        u10.C(v, 3);
        c20.h(((N1)object0), u10.b);
        u10.C(v, 4);
    }

    public void j(int v, boolean z) {
        U1 u10 = (U1)this.X;
        u10.C(v, 0);
        u10.k(((byte)z));
    }

    public void k(int v, int v1) {
        ((U1)this.X).m(v, v1);
    }

    public void l(int v, long v1) {
        ((U1)this.X).x(v, v1);
    }

    public void m(int v, Object object0, C2 c20) {
        U1 u10 = (U1)this.X;
        u10.C(v, 2);
        u10.B(((N1)object0).a(c20));
        c20.h(((N1)object0), u10.b);
    }

    public void n(int v, int v1) {
        ((U1)this.X).w(v, v1);
    }

    public void o(int v, long v1) {
        ((U1)this.X).n(v, v1);
    }

    public void p(int v, int v1) {
        ((U1)this.X).m(v, v1);
    }

    public void q(int v, long v1) {
        ((U1)this.X).x(v, v1 >> 0x3F ^ v1 << 1);
    }

    public void r(int v, int v1) {
        ((U1)this.X).F(v, v1 >> 0x1F ^ v1 << 1);
    }

    public void s(int v, long v1) {
        ((U1)this.X).x(v, v1);
    }

    public void t(int v, int v1) {
        ((U1)this.X).F(v, v1);
    }
}

