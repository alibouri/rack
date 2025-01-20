package E7;

import T5.a;
import U7.c;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n2.b;
import o6.p;

public abstract class i extends Service {
    public final ExecutorService X;
    public O Y;
    public final Object Z;
    public int b0;
    public int c0;

    public i() {
        a a0 = new a("Firebase-Messaging-Intent-Handle");
        ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), a0);
        threadPoolExecutor0.allowCoreThreadTimeOut(true);
        this.X = Executors.unconfigurableExecutorService(threadPoolExecutor0);
        this.Z = new Object();
        this.c0 = 0;
    }

    public final void a(Intent intent0) {
        if(intent0 != null) {
            N.a(intent0);
        }
        synchronized(this.Z) {
            int v1 = this.c0 - 1;
            this.c0 = v1;
            if(v1 == 0) {
                this.stopSelfResult(this.b0);
            }
        }
    }

    public abstract void b(Intent arg1);

    @Override  // android.app.Service
    public final IBinder onBind(Intent intent0) {
        synchronized(this) {
            if(Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if(this.Y == null) {
                this.Y = new O(new c(2, this));
            }
            return this.Y;
        }
    }

    @Override  // android.app.Service
    public final void onDestroy() {
        this.X.shutdown();
        super.onDestroy();
    }

    @Override  // android.app.Service
    public final int onStartCommand(Intent intent0, int v, int v1) {
        synchronized(this.Z) {
            this.b0 = v1;
            ++this.c0;
        }
        Intent intent1 = (Intent)((ArrayDeque)C.D().b0).poll();
        if(intent1 == null) {
            this.a(intent0);
            return 2;
        }
        o6.i i0 = new o6.i();
        h h0 = new h(this, intent1, i0, 0);
        this.X.execute(h0);
        p p0 = i0.a;
        if(p0.g()) {
            this.a(intent0);
            return 2;
        }
        p0.i(new b(0), new g(this, 0, intent0));
        return 3;
    }
}

