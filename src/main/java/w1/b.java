package w1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public abstract class b {
    public static Intent a(Context context0, BroadcastReceiver broadcastReceiver0, IntentFilter intentFilter0, String s, int v) {
        return (v & 4) == 0 || s != null ? context0.registerReceiver(broadcastReceiver0, intentFilter0, s, null, v & 1) : context0.registerReceiver(broadcastReceiver0, intentFilter0, c.d(context0), null);
    }

    public static Intent b(Context context0, BroadcastReceiver broadcastReceiver0, IntentFilter intentFilter0, String s, int v) {
        return context0.registerReceiver(broadcastReceiver0, intentFilter0, s, null, v);
    }

    public static void c(Context context0, Intent intent0) {
        context0.startForegroundService(intent0);
    }
}

