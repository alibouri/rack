package M5;

import K5.b;
import K5.c;
import a6.d;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import java.util.concurrent.atomic.AtomicReference;
import s.f;

public final class o extends LifecycleCallback implements DialogInterface.OnCancelListener {
    public volatile boolean Y;
    public final AtomicReference Z;
    public final d b0;
    public final b c0;
    public final f d0;
    public final M5.f e0;

    public o(LifecycleFragment lifecycleFragment0, M5.f f0) {
        super(lifecycleFragment0);
        this.Z = new AtomicReference(null);
        this.b0 = new d(Looper.getMainLooper(), 0);
        this.c0 = b.d;
        this.d0 = new f(0);
        this.e0 = f0;
        lifecycleFragment0.b(this);
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void b(int v, int v1, Intent intent0) {
        int v2 = 13;
        AtomicReference atomicReference0 = this.Z;
        G g0 = (G)atomicReference0.get();
        M5.f f0 = this.e0;
    alab1:
        switch(v) {
            case 1: {
                switch(v1) {
                    case -1: {
                        atomicReference0.set(null);
                        Message message0 = f0.n.obtainMessage(3);
                        f0.n.sendMessage(message0);
                        return;
                    }
                    case 0: {
                        if(g0 != null) {
                            if(intent0 != null) {
                                v2 = intent0.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                            }
                            atomicReference0.set(null);
                            f0.h(new ConnectionResult(1, v2, null, g0.b.toString()), g0.a);
                            return;
                        }
                        break alab1;
                    }
                    default: {
                        goto label_27;
                    }
                }
            }
            case 2: {
                Activity activity0 = this.a();
                int v3 = this.c0.b(activity0, c.a);
                if(v3 == 0) {
                    atomicReference0.set(null);
                    Message message1 = f0.n.obtainMessage(3);
                    f0.n.sendMessage(message1);
                    return;
                }
                if(g0 == null || g0.b.Y == 18 && v3 == 18) {
                    return;
                }
            label_27:
                if(g0 != null) {
                    atomicReference0.set(null);
                    f0.h(g0.b, g0.a);
                }
                break;
            }
            default: {
                goto label_27;
            }
        }
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void c(Bundle bundle0) {
        if(bundle0 != null) {
            G g0 = bundle0.getBoolean("resolving_error", false) ? new G(new ConnectionResult(bundle0.getInt("failed_status"), ((PendingIntent)bundle0.getParcelable("failed_resolution"))), bundle0.getInt("failed_client_id", -1)) : null;
            this.Z.set(g0);
        }
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void d() {
        if(!this.d0.isEmpty()) {
            this.e0.a(this);
        }
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void e(Bundle bundle0) {
        G g0 = (G)this.Z.get();
        if(g0 == null) {
            return;
        }
        bundle0.putBoolean("resolving_error", true);
        bundle0.putInt("failed_client_id", g0.a);
        bundle0.putInt("failed_status", g0.b.Y);
        bundle0.putParcelable("failed_resolution", g0.b.Z);
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void f() {
        this.Y = true;
        if(!this.d0.isEmpty()) {
            this.e0.a(this);
        }
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void g() {
        this.Y = false;
        M5.f f0 = this.e0;
        f0.getClass();
        synchronized(M5.f.r) {
            if(f0.k == this) {
                f0.k = null;
                f0.l.clear();
            }
        }
    }

    @Override  // android.content.DialogInterface$OnCancelListener
    public final void onCancel(DialogInterface dialogInterface0) {
        ConnectionResult connectionResult0 = new ConnectionResult(13, null);
        G g0 = (G)this.Z.get();
        this.Z.set(null);
        this.e0.h(connectionResult0, (g0 == null ? -1 : g0.a));
    }
}

