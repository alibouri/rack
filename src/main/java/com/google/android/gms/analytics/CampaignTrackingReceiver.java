package com.google.android.gms.analytics;

import E5.d;
import N5.r;
import android.content.BroadcastReceiver.PendingResult;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.internal.gtm.zzbu;
import com.google.android.gms.internal.gtm.zzcs;
import com.google.android.gms.internal.gtm.zzeo;
import com.google.android.gms.internal.gtm.zzff;

public class CampaignTrackingReceiver extends BroadcastReceiver {
    static Boolean zza;

    @Override  // android.content.BroadcastReceiver
    public void onReceive(Context context0, Intent intent0) {
        zzbu zzbu0 = zzbu.zzg(context0);
        zzeo zzeo0 = zzbu0.zzm();
        if(intent0 == null) {
            zzeo0.zzQ("CampaignTrackingReceiver received null intent");
            return;
        }
        String s = intent0.getStringExtra("referrer");
        String s1 = intent0.getAction();
        zzeo0.zzO("CampaignTrackingReceiver received", s1);
        if("com.android.vending.INSTALL_REFERRER".equals(s1) && !TextUtils.isEmpty(s)) {
            int v = zzcs.zzf();
            if(s.length() > v) {
                zzeo0.zzS("Campaign data exceed the maximum supported size and will be clipped. size, limit", s.length(), v);
                s = s.substring(0, v);
            }
            BroadcastReceiver.PendingResult broadcastReceiver$PendingResult0 = this.goAsync();
            zzbu0.zzf().zzf(s, new d(0, broadcastReceiver$PendingResult0));
            return;
        }
        zzeo0.zzQ("CampaignTrackingReceiver received unexpected intent without referrer extra");
    }

    public static boolean zzb(Context context0) {
        r.j(context0);
        Boolean boolean0 = CampaignTrackingReceiver.zza;
        if(boolean0 != null) {
            return boolean0.booleanValue();
        }
        boolean z = zzff.zzi(context0, "com.google.android.gms.analytics.CampaignTrackingReceiver", true);
        CampaignTrackingReceiver.zza = Boolean.valueOf(z);
        return z;
    }
}

