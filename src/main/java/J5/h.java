package J5;

import R2.c;
import Y6.b;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzd;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class h implements Runnable {
    public final int X;
    public final i Y;

    public h(i i0, int v) {
        this.X = v;
        this.Y = i0;
        super();
    }

    private final void a() {
        i i0 = this.Y;
        synchronized(i0) {
            if(i0.X == 1) {
                i0.a(1, "Timed out while binding");
            }
        }
    }

    @Override
    public final void run() {
        j j0;
        i i0;
        switch(this.X) {
            case 0: {
                while(true) {
                    i0 = this.Y;
                    synchronized(i0) {
                        if(i0.X != 2) {
                            break;
                        }
                        if(i0.b0.isEmpty()) {
                            i0.c();
                            return;
                        }
                        goto label_10;
                    }
                    return;
                label_10:
                    j0 = (j)i0.b0.poll();
                    i0.c0.put(j0.a, j0);
                    ((ScheduledExecutorService)i0.d0.d).schedule(new b(i0, 5, j0), 30L, TimeUnit.SECONDS);
                    if(Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending " + j0);
                    }
                    Context context0 = (Context)i0.d0.c;
                    Message message0 = Message.obtain();
                    message0.what = j0.c;
                    message0.arg1 = j0.a;
                    message0.replyTo = i0.Y;
                    Bundle bundle0 = new Bundle();
                    bundle0.putBoolean("oneWay", j0.a());
                    bundle0.putString("pkg", "com.wave.personal");
                    bundle0.putBundle("data", j0.d);
                    message0.setData(bundle0);
                    try {
                        c c0 = i0.Z;
                        Messenger messenger0 = (Messenger)c0.Y;
                        if(messenger0 == null) {
                            zzd zzd0 = (zzd)c0.Z;
                            if(zzd0 == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            zzd0.X.getClass();
                            zzd0.X.send(message0);
                            continue;
                        }
                        messenger0.send(message0);
                    }
                    catch(RemoteException remoteException0) {
                        i0.a(2, remoteException0.getMessage());
                    }
                }
                return;
            }
            case 1: {
                this.a();
                return;
            }
            default: {
                this.Y.a(2, "Service disconnected");
            }
        }
    }
}

