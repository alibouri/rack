package E7;

import E3.h;
import M6.b;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.os.Binder;
import android.util.Log;
import o6.i;

public final class z implements Runnable {
    public final Context X;
    public final boolean Y;
    public final i Z;

    public z(Context context0, boolean z, i i0) {
        this.X = context0;
        this.Y = z;
        this.Z = i0;
    }

    @Override
    public final void run() {
        i i0;
        try {
            Context context0 = this.X;
            i0 = this.Z;
            if(Binder.getCallingUid() == context0.getApplicationInfo().uid) {
                SharedPreferences.Editor sharedPreferences$Editor0 = b.F(context0).edit();
                sharedPreferences$Editor0.putBoolean("proxy_notification_initialized", true);
                sharedPreferences$Editor0.apply();
                NotificationManager notificationManager0 = (NotificationManager)context0.getSystemService(NotificationManager.class);
                if(this.Y) {
                    h.h(notificationManager0);
                }
                else if("com.google.android.gms".equals(notificationManager0.getNotificationDelegate())) {
                    h.r(notificationManager0);
                }
            }
            else {
                Log.e("FirebaseMessaging", "error configuring notification delegate for package com.wave.personal");
            }
        }
        finally {
            i0.d(null);
        }
    }
}

