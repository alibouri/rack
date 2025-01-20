package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.gtm.zzev;

public final class AnalyticsReceiver extends BroadcastReceiver {
    public zzev a;

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        if(this.a == null) {
            this.a = new zzev();
        }
        this.a.zza(context0, intent0);
    }
}

