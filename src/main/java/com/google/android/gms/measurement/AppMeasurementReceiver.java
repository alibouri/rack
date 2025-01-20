package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager.WakeLock;
import android.os.PowerManager;
import android.util.SparseArray;
import f2.a;
import j6.L;
import j6.d0;

public final class AppMeasurementReceiver extends a {
    public g.a c;

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        if(this.c == null) {
            this.c = new g.a(10, this);
        }
        g.a a0 = this.c;
        a0.getClass();
        L l0 = d0.d(context0, null, null).g0;
        d0.h(l0);
        if(intent0 == null) {
            l0.h0.d("Receiver called with null intent");
            return;
        }
        String s = intent0.getAction();
        l0.m0.b(s, "Local receiver got");
        if("com.google.android.gms.measurement.UPLOAD".equals(s)) {
            Intent intent1 = new Intent().setClassName(context0, "com.google.android.gms.measurement.AppMeasurementService");
            intent1.setAction("com.google.android.gms.measurement.UPLOAD");
            l0.m0.d("Starting wakeful intent.");
            ((AppMeasurementReceiver)a0.Y).getClass();
            SparseArray sparseArray0 = a.a;
            synchronized(sparseArray0) {
                int v1 = a.b;
                a.b = v1 + 1;
                if(v1 + 1 <= 0) {
                    a.b = 1;
                }
                intent1.putExtra("androidx.contentpager.content.wakelockid", v1);
                ComponentName componentName0 = context0.startService(intent1);
                if(componentName0 == null) {
                    return;
                }
                PowerManager.WakeLock powerManager$WakeLock0 = ((PowerManager)context0.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentName0.flattenToShortString());
                powerManager$WakeLock0.setReferenceCounted(false);
                powerManager$WakeLock0.acquire(60000L);
                sparseArray0.put(v1, powerManager$WakeLock0);
            }
            return;
        }
        if("com.android.vending.INSTALL_REFERRER".equals(s)) {
            l0.h0.d("Install Referrer Broadcasts are deprecated");
        }
    }
}

