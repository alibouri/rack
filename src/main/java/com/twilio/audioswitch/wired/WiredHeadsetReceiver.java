package com.twilio.audioswitch.wired;

import Nb.j;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.twilio.audioswitch.android.Logger;

public final class WiredHeadsetReceiver extends BroadcastReceiver {
    private final Context context;
    private WiredDeviceConnectionListener deviceListener;
    private final Logger logger;

    public WiredHeadsetReceiver(Context context0, Logger logger0) {
        j.f(context0, "context");
        j.f(logger0, "logger");
        super();
        this.context = context0;
        this.logger = logger0;
    }

    public final WiredDeviceConnectionListener getDeviceListener$audioswitch_release() {
        return this.deviceListener;
    }

    @Override  // android.content.BroadcastReceiver
    public void onReceive(Context context0, Intent intent0) {
        j.f(context0, "context");
        j.f(intent0, "intent");
        String s = "";
        if(intent0.getIntExtra("state", 0) == 1) {
            String s1 = intent0.getStringExtra("name");
            Logger logger0 = this.logger;
            StringBuilder stringBuilder0 = new StringBuilder("Wired headset device ");
            if(s1 != null) {
                s = s1;
            }
            stringBuilder0.append(s);
            stringBuilder0.append(" connected");
            logger0.d("WiredHeadsetReceiver", stringBuilder0.toString());
            WiredDeviceConnectionListener wiredDeviceConnectionListener0 = this.deviceListener;
            if(wiredDeviceConnectionListener0 != null) {
                wiredDeviceConnectionListener0.onDeviceConnected();
            }
        }
        else {
            String s2 = intent0.getStringExtra("name");
            Logger logger1 = this.logger;
            StringBuilder stringBuilder1 = new StringBuilder("Wired headset device ");
            if(s2 != null) {
                s = s2;
            }
            stringBuilder1.append(s);
            stringBuilder1.append(" disconnected");
            logger1.d("WiredHeadsetReceiver", stringBuilder1.toString());
            WiredDeviceConnectionListener wiredDeviceConnectionListener1 = this.deviceListener;
            if(wiredDeviceConnectionListener1 != null) {
                wiredDeviceConnectionListener1.onDeviceDisconnected();
            }
        }
    }

    public final void setDeviceListener$audioswitch_release(WiredDeviceConnectionListener wiredDeviceConnectionListener0) {
        this.deviceListener = wiredDeviceConnectionListener0;
    }

    public final void start(WiredDeviceConnectionListener wiredDeviceConnectionListener0) {
        j.f(wiredDeviceConnectionListener0, "deviceListener");
        this.deviceListener = wiredDeviceConnectionListener0;
        IntentFilter intentFilter0 = new IntentFilter("android.intent.action.HEADSET_PLUG");
        this.context.registerReceiver(this, intentFilter0);
    }

    public final void stop() {
        this.deviceListener = null;
        this.context.unregisterReceiver(this);
    }
}

