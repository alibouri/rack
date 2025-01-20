package com.google.android.gms.internal.gtm;

import E5.k;
import N5.r;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import w1.c;

final class zzep extends BroadcastReceiver {
    static final String zza = "com.google.android.gms.internal.gtm.zzep";
    private final zzbu zzb;
    private boolean zzc;
    private boolean zzd;

    public zzep(zzbu zzbu0) {
        r.j(zzbu0);
        this.zzb = zzbu0;
    }

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        this.zzb.zzm();
        this.zzb.zzf();
        String s = intent0.getAction();
        this.zzb.zzm().zzO("NetworkBroadcastReceiver received action", s);
        if("android.net.conn.CONNECTIVITY_CHANGE".equals(s)) {
            boolean z = this.zze();
            if(this.zzd == z) {
                return;
            }
            this.zzd = z;
            zzbp zzbp0 = this.zzb.zzf();
            zzbp0.zzO("Network connectivity status changed", Boolean.valueOf(z));
            k k0 = zzbp0.zzq();
            zzbi zzbi0 = new zzbi(zzbp0, z);
            k0.getClass();
            k0.b.submit(zzbi0);
            return;
        }
        if("com.google.analytics.RADIO_POWERED".equals(s)) {
            if(!intent0.hasExtra("com.google.android.gms.internal.gtm.zzep")) {
                zzbp zzbp1 = this.zzb.zzf();
                zzbp1.zzN("Radio powered up");
                zzbp1.zzc();
            }
            return;
        }
        this.zzb.zzm().zzR("NetworkBroadcastReceiver received unknown action", s);
    }

    public final void zza() {
        this.zzb.zzm();
        this.zzb.zzf();
        if(this.zzc) {
            return;
        }
        Context context0 = this.zzb.zza();
        c.e(context0, this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), null, 4);
        IntentFilter intentFilter0 = new IntentFilter("com.google.analytics.RADIO_POWERED");
        intentFilter0.addCategory("com.wave.personal");
        c.e(context0, this, intentFilter0, null, 4);
        this.zzd = this.zze();
        this.zzb.zzm().zzO("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.zzd));
        this.zzc = true;
    }

    public final void zzb() {
        Intent intent0 = new Intent("com.google.analytics.RADIO_POWERED");
        intent0.addCategory("com.wave.personal");
        intent0.putExtra(zzep.zza, true);
        this.zzb.zza().sendOrderedBroadcast(intent0, null);
    }

    public final void zzc() {
        if(!this.zzc) {
            return;
        }
        this.zzb.zzm().zzN("Unregistering connectivity change receiver");
        this.zzc = false;
        this.zzd = false;
        try {
            this.zzb.zza().unregisterReceiver(this);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            this.zzb.zzm().zzJ("Failed to unregister the network broadcast receiver", illegalArgumentException0);
        }
    }

    public final boolean zzd() {
        if(!this.zzc) {
            this.zzb.zzm().zzQ("Connectivity unknown. Receiver not registered");
        }
        return this.zzd;
    }

    public final boolean zze() {
        ConnectivityManager connectivityManager0 = (ConnectivityManager)this.zzb.zza().getSystemService("connectivity");
        try {
            NetworkInfo networkInfo0 = connectivityManager0.getActiveNetworkInfo();
            if(networkInfo0 != null && networkInfo0.isConnected()) {
                return true;
            }
        }
        catch(SecurityException unused_ex) {
        }
        return false;
    }
}

