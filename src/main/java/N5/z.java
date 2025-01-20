package N5;

import I6.c;
import R5.a;
import a6.d;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.HashMap;
import java.util.concurrent.Executor;

public final class z {
    public final HashMap a;
    public final Context b;
    public volatile d c;
    public final a d;
    public final long e;
    public final long f;
    public static final Object g;
    public static z h;
    public static HandlerThread i;

    static {
        z.g = new Object();
    }

    public z(Context context0, Looper looper0) {
        this.a = new HashMap();
        c c0 = new c(2, this);
        this.b = context0.getApplicationContext();
        d d0 = new d(looper0, c0);  // initializer: Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V
        Looper.getMainLooper();
        this.c = d0;
        this.d = a.b();
        this.e = 5000L;
        this.f = 300000L;
    }

    public static z a(Context context0) {
        synchronized(z.g) {
            if(z.h == null) {
                z.h = new z(context0.getApplicationContext(), context0.getMainLooper());
            }
            return z.h;
        }
    }

    public static HandlerThread b() {
        synchronized(z.g) {
            HandlerThread handlerThread0 = z.i;
            if(handlerThread0 != null) {
                return handlerThread0;
            }
            HandlerThread handlerThread1 = new HandlerThread("GoogleApiHandler", 9);
            z.i = handlerThread1;
            handlerThread1.start();
            return z.i;
        }
    }

    public final void c(String s, ServiceConnection serviceConnection0, boolean z) {
        x x0 = new x(s, z);
        r.k(serviceConnection0, "ServiceConnection must not be null");
        synchronized(this.a) {
            y y0 = (y)this.a.get(x0);
            if(y0 != null) {
                if(!y0.X.containsKey(serviceConnection0)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + x0.toString());
                }
                y0.X.remove(serviceConnection0);
                if(y0.X.isEmpty()) {
                    Message message0 = this.c.obtainMessage(0, x0);
                    this.c.sendMessageDelayed(message0, this.e);
                }
                return;
            }
        }
        throw new IllegalStateException("Nonexistent connection status for service config: " + x0.toString());
    }

    public final boolean d(x x0, u u0, String s, Executor executor0) {
        synchronized(this.a) {
            y y0 = (y)this.a.get(x0);
            if(executor0 == null) {
                executor0 = null;
            }
            if(y0 == null) {
                y0 = new y(this, x0);
                y0.X.put(u0, u0);
                y0.a(s, executor0);
                this.a.put(x0, y0);
                return y0.Z;
            }
            this.c.removeMessages(0, x0);
            if(!y0.X.containsKey(u0)) {
                y0.X.put(u0, u0);
                switch(y0.Y) {
                    case 1: {
                        u0.onServiceConnected(y0.d0, y0.b0);
                        break;
                    }
                    case 2: {
                        y0.a(s, executor0);
                    }
                }
                return y0.Z;
            }
        }
        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + x0.toString());
    }
}

