package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager.WakeLock;
import android.util.Log;
import android.util.SparseArray;
import f2.a;
import i.J;
import j6.K0;
import j6.L;
import j6.b1;
import j6.d0;
import j6.h0;
import j6.k1;
import j6.z0;

public final class AppMeasurementService extends Service implements b1 {
    public J X;

    @Override  // j6.b1
    public final void a(Intent intent0) {
        SparseArray sparseArray0;
        int v = intent0.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if(v != 0) {
            sparseArray0 = a.a;
            synchronized(sparseArray0) {
                PowerManager.WakeLock powerManager$WakeLock0 = (PowerManager.WakeLock)sparseArray0.get(v);
                if(powerManager$WakeLock0 != null) {
                    powerManager$WakeLock0.release();
                    sparseArray0.remove(v);
                    return;
                }
                Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + v);
            }
        }
    }

    @Override  // j6.b1
    public final boolean b(int v) {
        return this.stopSelfResult(v);
    }

    @Override  // j6.b1
    public final void c(JobParameters jobParameters0) {
        throw new UnsupportedOperationException();
    }

    public final J d() {
        if(this.X == null) {
            this.X = new J(9, this);
        }
        return this.X;
    }

    @Override  // android.app.Service
    public final IBinder onBind(Intent intent0) {
        J j0 = this.d();
        if(intent0 == null) {
            j0.u().e0.d("onBind called with null intent");
            return null;
        }
        j0.getClass();
        String s = intent0.getAction();
        if("com.google.android.gms.measurement.START".equals(s)) {
            return new h0(k1.i(((Service)j0.Y)));
        }
        j0.u().h0.b(s, "onBind received unknown action");
        return null;
    }

    @Override  // android.app.Service
    public final void onCreate() {
        super.onCreate();
        d0 d00 = d0.d(((Service)this.d().Y), null, null);
        d0.h(d00.g0);
        d00.g0.m0.d("Local AppMeasurementService is starting up");
    }

    @Override  // android.app.Service
    public final void onDestroy() {
        d0 d00 = d0.d(((Service)this.d().Y), null, null);
        d0.h(d00.g0);
        d00.g0.m0.d("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    @Override  // android.app.Service
    public final void onRebind(Intent intent0) {
        J j0 = this.d();
        if(intent0 == null) {
            j0.u().e0.d("onRebind called with null intent");
            return;
        }
        j0.getClass();
        String s = intent0.getAction();
        j0.u().m0.b(s, "onRebind called. action");
    }

    @Override  // android.app.Service
    public final int onStartCommand(Intent intent0, int v, int v1) {
        J j0 = this.d();
        L l0 = d0.d(((Service)j0.Y), null, null).g0;
        d0.h(l0);
        if(intent0 == null) {
            l0.h0.d("AppMeasurementService started with null intent");
            return 2;
        }
        String s = intent0.getAction();
        l0.m0.c(v1, "Local AppMeasurementService called. startId, action", s);
        if("com.google.android.gms.measurement.UPLOAD".equals(s)) {
            K0 k00 = new K0(1);
            k00.Z = j0;
            k00.Y = v1;
            k00.b0 = l0;
            k00.c0 = intent0;
            k1 k10 = k1.i(((Service)j0.Y));
            k10.c().z(new z0(k10, 8, k00));
        }
        return 2;
    }

    @Override  // android.app.Service
    public final boolean onUnbind(Intent intent0) {
        J j0 = this.d();
        if(intent0 == null) {
            j0.u().e0.d("onUnbind called with null intent");
            return true;
        }
        j0.getClass();
        String s = intent0.getAction();
        j0.u().m0.b(s, "onUnbind called for intent. action");
        return true;
    }
}

