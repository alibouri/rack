package com.google.android.gms.internal.gtm;

import E5.k;
import N5.r;
import R5.a;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

public final class zzca implements ServiceConnection {
    final zzcb zza;
    private volatile boolean zzb;
    private volatile zzel zzc;

    public zzca(zzcb zzcb0) {
        this.zza = zzcb0;
        super();
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        zzel zzel0;
        r.e("AnalyticsServiceConnection.onServiceConnected");
        __monitor_enter(this);
        try {
            if(iBinder0 == null) {
                this.zza.zzI("Service connected with null binder");
                goto label_4;
            }
            goto label_7;
        }
        catch(Throwable throwable0) {
            goto label_30;
        }
        try {
        label_4:
            this.notifyAll();
        }
        catch(Throwable throwable1) {
            __monitor_exit(this);
            throw throwable1;
        }
        __monitor_exit(this);
        return;
        try {
            try {
            label_7:
                zzel0 = null;
                String s = iBinder0.getInterfaceDescriptor();
                if("com.google.android.gms.analytics.internal.IAnalyticsService".equals(s)) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
                    zzel0 = iInterface0 instanceof zzel ? ((zzel)iInterface0) : new zzel(iBinder0);
                    this.zza.zzN("Bound to IAnalyticsService interface");
                }
                else {
                    this.zza.zzJ("Got binder with a wrong descriptor", s);
                }
            }
            catch(RemoteException unused_ex) {
                this.zza.zzI("Service connect failed to get IAnalyticsService");
            }
            if(zzel0 == null) {
                try {
                    a.b().c(this.zza.zzo(), this.zza.zza);
                }
                catch(IllegalArgumentException unused_ex) {
                }
            }
            else if(this.zzb) {
                this.zzc = zzel0;
            }
            else {
                this.zza.zzQ("onServiceConnected received after the timeout limit");
                k k0 = this.zza.zzq();
                zzby zzby0 = new zzby(this, zzel0);
                k0.getClass();
                k0.b.submit(zzby0);
            }
            goto label_32;
        }
        catch(Throwable throwable0) {
            try {
            label_30:
                this.notifyAll();
                throw throwable0;
            label_32:
                this.notifyAll();
                goto label_37;
            }
            catch(Throwable throwable1) {
            }
        }
        __monitor_exit(this);
        throw throwable1;
    label_37:
        __monitor_exit(this);
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        r.e("AnalyticsServiceConnection.onServiceDisconnected");
        k k0 = this.zza.zzq();
        zzbz zzbz0 = new zzbz(this, componentName0);
        k0.getClass();
        k0.b.submit(zzbz0);
    }

    public final zzel zza() {
        k.a();
        Intent intent0 = new Intent("com.google.android.gms.analytics.service.START");
        intent0.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
        intent0.putExtra("app_package_name", "com.wave.personal");
        a a0 = a.b();
        synchronized(this) {
            this.zzc = null;
            this.zzb = true;
            boolean z = a0.a(this.zza.zzo(), intent0, this.zza.zza, 0x81);
            this.zza.zzO("Bind to service requested", Boolean.valueOf(z));
            if(!z) {
                this.zzb = false;
                return null;
            }
            try {
                this.wait(((long)(((Long)zzeh.zzB.zzb()))));
            }
            catch(InterruptedException unused_ex) {
                this.zza.zzQ("Wait for service connect was interrupted");
            }
            this.zzb = false;
            zzel zzel0 = this.zzc;
            this.zzc = null;
            if(zzel0 == null) {
                this.zza.zzI("Successfully bound to service but never got onServiceConnected callback");
            }
            return zzel0;
        }
    }
}

