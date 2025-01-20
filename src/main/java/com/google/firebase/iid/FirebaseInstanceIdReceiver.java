package com.google.firebase.iid;

import I2.J;
import J5.g;
import T5.a;
import android.app.PendingIntent.CanceledException;
import android.app.PendingIntent;
import android.content.BroadcastReceiver.PendingResult;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class FirebaseInstanceIdReceiver extends BroadcastReceiver {
    public static SoftReference a;
    public static SoftReference b;

    public static int a(Intent intent0) {
        PendingIntent pendingIntent0 = (PendingIntent)intent0.getParcelableExtra("pending_intent");
        if(pendingIntent0 != null) {
            try {
                pendingIntent0.send();
            }
            catch(PendingIntent.CanceledException unused_ex) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle bundle0 = intent0.getExtras();
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        else {
            bundle0.remove("pending_intent");
        }
        if(Objects.equals(intent0.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
            Intent intent1 = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle0);
            if(J.P(intent1)) {
                J.K("_nd", intent1.getExtras());
            }
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        ExecutorService executorService0;
        if(intent0 == null) {
            return;
        }
        boolean z = this.isOrderedBroadcast();
        BroadcastReceiver.PendingResult broadcastReceiver$PendingResult0 = this.goAsync();
        synchronized(FirebaseInstanceIdReceiver.class) {
            executorService0 = FirebaseInstanceIdReceiver.a == null ? null : ((ExecutorService)FirebaseInstanceIdReceiver.a.get());
            if(executorService0 == null) {
                executorService0 = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new a("firebase-iid-executor")));
                FirebaseInstanceIdReceiver.a = new SoftReference(executorService0);
            }
        }
        executorService0.execute(new g(this, intent0, context0, z, broadcastReceiver$PendingResult0));
    }
}

