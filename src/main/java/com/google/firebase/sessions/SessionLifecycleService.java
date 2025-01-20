package com.google.firebase.sessions;

import K.i;
import Nb.j;
import a8.S;
import android.app.Service;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;

public final class SessionLifecycleService extends Service {
    public final HandlerThread X;
    public S Y;
    public Messenger Z;

    public SessionLifecycleService() {
        this.X = new HandlerThread("FirebaseSessions_HandlerThread");
    }

    @Override  // android.app.Service
    public final IBinder onBind(Intent intent0) {
        if(intent0 == null) {
            Log.d("SessionLifecycleService", "Service bound with null intent. Ignoring.");
            return null;
        }
        Log.d("SessionLifecycleService", "Service bound to new client on process " + intent0.getAction());
        Messenger messenger0 = Build.VERSION.SDK_INT < 33 ? ((Messenger)intent0.getParcelableExtra("ClientCallbackMessenger")) : ((Messenger)i.t(intent0));
        if(messenger0 != null) {
            Message message0 = Message.obtain(null, 4, 0, 0);
            message0.replyTo = messenger0;
            S s0 = this.Y;
            if(s0 != null) {
                s0.sendMessage(message0);
            }
        }
        return this.Z == null ? null : this.Z.getBinder();
    }

    @Override  // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.X.start();
        Looper looper0 = this.X.getLooper();
        j.e(looper0, "handlerThread.looper");
        this.Y = new S(looper0);
        this.Z = new Messenger(this.Y);
    }

    @Override  // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.X.quit();
    }
}

