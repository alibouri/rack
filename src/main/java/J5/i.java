package J5;

import E7.B;
import R2.c;
import R5.a;
import Y6.b;
import a6.d;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.FIN;

public final class i implements ServiceConnection {
    public int X;
    public final Messenger Y;
    public c Z;
    public final ArrayDeque b0;
    public final SparseArray c0;
    public final k d0;

    public i(k k0) {
        this.d0 = k0;
        this.X = 0;
        d d0 = new d(Looper.getMainLooper(), new I6.c(1, this));  // initializer: Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V
        Looper.getMainLooper();
        this.Y = new Messenger(d0);
        this.b0 = new ArrayDeque();
        this.c0 = new SparseArray();
    }

    public final void a(int v, String s) {
        synchronized(this) {
            this.b(s, null);
        }
    }

    public final void b(String s, SecurityException securityException0) {
        synchronized(this) {
            if(Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: " + s);
            }
            int v1 = this.X;
            if(v1 != 0) {
                switch(v1) {
                    case 1: 
                    case 2: {
                        if(Log.isLoggable("MessengerIpcClient", 2)) {
                            Log.v("MessengerIpcClient", "Unbinding service");
                        }
                        this.X = 4;
                        a.b().c(((Context)this.d0.c), this);
                        B b0 = new B(s, securityException0);  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
                        for(Object object0: this.b0) {
                            ((j)object0).b(b0);
                        }
                        this.b0.clear();
                        for(int v2 = 0; v2 < this.c0.size(); ++v2) {
                            ((j)this.c0.valueAt(v2)).b(b0);
                        }
                        this.c0.clear();
                        return;
                    }
                    case 3: {
                        this.X = 4;
                        return;
                    }
                    default: {
                        return;
                    }
                }
            }
        }
        throw new IllegalStateException();
    }

    public final void c() {
        synchronized(this) {
            if(this.X == 2 && this.b0.isEmpty() && this.c0.size() == 0) {
                if(Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.X = 3;
                a.b().c(((Context)this.d0.c), this);
            }
        }
    }

    public final boolean d(j j0) {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        switch(this.X) {
            case 0: {
                this.b0.add(j0);
                if(this.X == 0) {
                    if(Log.isLoggable("MessengerIpcClient", 2)) {
                        Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                    }
                    this.X = 1;
                    Intent intent0 = new Intent("com.google.android.c2dm.intent.REGISTER");
                    intent0.setPackage("com.google.android.gms");
                    try {
                        if(a.b().a(((Context)this.d0.c), intent0, this, 1)) {
                            goto label_20;
                        }
                        else {
                            this.a(0, "Unable to bind to service");
                        }
                    }
                    catch(SecurityException securityException0) {
                        this.b("Unable to bind to service", securityException0);
                    }
                    goto label_21;
                label_20:
                    ((ScheduledExecutorService)this.d0.d).schedule(new h(this, 1), 30L, TimeUnit.SECONDS);
                label_21:
                    FIN.finallyExec$NT(v);
                    return true;
                }
                FIN.finallyExec$NT(v);
                throw new IllegalStateException();
            }
            case 1: {
                this.b0.add(j0);
                FIN.finallyExec$NT(v);
                return true;
            }
            case 2: {
                this.b0.add(j0);
                ((ScheduledExecutorService)this.d0.d).execute(new h(this, 0));
                FIN.finallyExec$NT(v);
                return true;
            }
            default: {
                FIN.finallyCodeBegin$NT(v);
                __monitor_exit(this);
                FIN.finallyCodeEnd$NT(v);
                return false;
            }
        }
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        if(Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService)this.d0.d).execute(new b(this, 4, iBinder0));
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        if(Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService)this.d0.d).execute(new h(this, 2));
    }
}

