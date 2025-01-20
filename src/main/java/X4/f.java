package X4;

import M4.l;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import f5.a;
import i5.b;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class f {
    public static final f a;
    public static Boolean b;

    static {
        f.a = new f();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public final Intent a(Context context0) {
        if(a.b(this)) {
            return null;
        }
        try {
            PackageManager packageManager0 = context0.getPackageManager();
            if(packageManager0 == null) {
                return null;
            }
            Intent intent0 = new Intent("ReceiverService");
            intent0.setPackage("com.facebook.katana");
            if(packageManager0.resolveService(intent0, 0) != null && a5.f.a(context0, "com.facebook.katana")) {
                return intent0;
            }
            Intent intent1 = new Intent("ReceiverService");
            intent1.setPackage("com.facebook.wakizashi");
            return packageManager0.resolveService(intent1, 0) == null || !a5.f.a(context0, "com.facebook.wakizashi") ? null : intent1;
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
            return null;
        }
    }

    public final e b(c c0, String s, List list0) {
        if(a.b(this)) {
            return null;
        }
        try {
            e e0 = e.Y;
            Context context0 = l.a();
            Intent intent0 = this.a(context0);
            if(intent0 == null) {
                return e0;
            }
            d d0 = new d();
            boolean z = context0.bindService(intent0, d0, 1);
            e e1 = e.Z;
            if(z) {
                try {
                    d0.X.await(5L, TimeUnit.SECONDS);
                    IBinder iBinder0 = d0.Y;
                    if(iBinder0 != null) {
                        i5.c c1 = b.b(iBinder0);
                        Bundle bundle0 = X4.b.a(c0, s, list0);
                        if(bundle0 != null) {
                            ((i5.a)c1).b(bundle0);
                        }
                        e0 = e.X;
                    }
                    return e0;
                }
                catch(InterruptedException | RemoteException unused_ex) {
                    context0.unbindService(d0);
                    return e1;
                }
                finally {
                    context0.unbindService(d0);
                }
            }
            return e1;
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
            return null;
        }
    }
}

