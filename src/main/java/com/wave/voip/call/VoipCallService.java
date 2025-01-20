package com.wave.voip.call;

import Ab.o;
import a5.c;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.os.PowerManager.WakeLock;
import dc.e;
import rb.v;

public final class VoipCallService extends Service {
    public final e X;
    public final c Y;
    public PowerManager.WakeLock Z;
    public v b0;
    public NotificationManager c0;
    public boolean d0;
    public VoipCaller.CallParams e0;
    public final o f0;
    public static final String g0;
    public static final IntentFilter h0;

    static {
    }

    @Override  // android.app.Service
    public final IBinder onBind(Intent intent0) {
    }

    @Override  // android.app.Service
    public final void onCreate() {
    }

    @Override  // android.app.Service
    public final void onDestroy() {
    }
}

