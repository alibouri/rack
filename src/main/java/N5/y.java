package N5;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Message;
import android.os.StrictMode.VmPolicy.Builder;
import android.os.StrictMode.VmPolicy;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.concurrent.Executor;

public final class y implements ServiceConnection {
    public final HashMap X;
    public int Y;
    public boolean Z;
    public IBinder b0;
    public final x c0;
    public ComponentName d0;
    public final z e0;

    public y(z z0, x x0) {
        this.e0 = z0;
        this.c0 = x0;
        this.X = new HashMap();
        this.Y = 2;
    }

    public final void a(String s, Executor executor0) {
        this.Y = 3;
        StrictMode.VmPolicy strictMode$VmPolicy0 = StrictMode.getVmPolicy();
        if(Build.VERSION.SDK_INT >= 0x1F) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(strictMode$VmPolicy0).permitUnsafeIntentLaunch().build());
        }
        try {
            Intent intent0 = this.c0.a(this.e0.b);
            boolean z = this.e0.d.d(this.e0.b, s, intent0, this, 0x1081, executor0);
            this.Z = z;
            if(z) {
                Message message0 = this.e0.c.obtainMessage(1, this.c0);
                this.e0.c.sendMessageDelayed(message0, this.e0.f);
            }
            else {
                try {
                    this.Y = 2;
                    this.e0.d.c(this.e0.b, this);
                }
                catch(IllegalArgumentException unused_ex) {
                }
            }
        }
        finally {
            StrictMode.setVmPolicy(strictMode$VmPolicy0);
        }
    }

    @Override  // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName0) {
        this.onServiceDisconnected(componentName0);
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        synchronized(this.e0.a) {
            this.e0.c.removeMessages(1, this.c0);
            this.b0 = iBinder0;
            this.d0 = componentName0;
            for(Object object0: this.X.values()) {
                ((ServiceConnection)object0).onServiceConnected(componentName0, iBinder0);
            }
            this.Y = 1;
        }
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        synchronized(this.e0.a) {
            this.e0.c.removeMessages(1, this.c0);
            this.b0 = null;
            this.d0 = componentName0;
            for(Object object0: this.X.values()) {
                ((ServiceConnection)object0).onServiceDisconnected(componentName0);
            }
            this.Y = 2;
        }
    }
}

