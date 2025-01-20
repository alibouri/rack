package N6;

import F0.W;
import S6.b;
import T6.h;
import T6.i;
import V6.a;
import Xb.H;
import Xb.J0;
import Xb.J;
import a8.P;
import a8.Q;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;
import android.util.Log;
import dc.e;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.coroutines.CoroutineContext.Element.DefaultImpls;
import kotlin.coroutines.CoroutineContext;
import pb.I;

public final class p implements ServiceConnection {
    public final int X;
    public final Object Y;

    public p(int v, Object object0) {
        this.X = v;
        this.Y = object0;
        super();
    }

    private final void a(ComponentName componentName0) {
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        Object object0 = this.Y;
        switch(this.X) {
            case 0: {
                ((q)object0).b.e("ServiceConnectionImpl.onServiceConnected(%s)", new Object[]{componentName0});
                o o0 = new o(this, iBinder0);
                ((q)object0).a().post(o0);
                return;
            }
            case 1: {
                ((i)object0).b.b("ServiceConnectionImpl.onServiceConnected(%s)", new Object[]{componentName0});
                b b0 = new b(this, iBinder0);
                ((i)object0).a().post(b0);
                return;
            }
            case 2: {
                ((a)object0).b.a("ServiceConnectionImpl.onServiceConnected(%s)", new Object[]{componentName0});
                V6.q q1 = new V6.q(this, iBinder0);
                ((a)object0).a().post(q1);
                return;
            }
            case 3: {
                Log.d("SessionLifecycleClient", "Connected to SessionLifecycleService. Queue size " + ((LinkedBlockingDeque)((Q)object0).Z).size());
                new Messenger(iBinder0);
                ArrayList arrayList0 = new ArrayList();
                ((LinkedBlockingDeque)((Q)object0).Z).drainTo(arrayList0);
                J.q(H.a(((CoroutineContext)((Q)object0).Y)), null, null, new P(((Q)object0), arrayList0, null), 3);
                return;
            }
            default: {
                ((W)object0).getClass();
                rb.q q0 = iBinder0 instanceof rb.q ? ((rb.q)iBinder0) : null;
                if(q0 != null) {
                    ((W)object0).g = q0;
                    J0 j00 = J.c();
                    dc.o.a.getClass();
                    e e0 = H.a(DefaultImpls.d(dc.o.a, j00));
                    ((W)object0).e = e0;
                    J.q(e0, null, null, new I(q0, ((W)object0), null), 3);
                }
            }
        }
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        Object object0 = this.Y;
        switch(this.X) {
            case 0: {
                ((q)object0).b.e("ServiceConnectionImpl.onServiceDisconnected(%s)", new Object[]{componentName0});
                n n0 = new n(1, this);
                ((q)object0).a().post(n0);
                return;
            }
            case 1: {
                ((i)object0).b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", new Object[]{componentName0});
                h h0 = new h(1, this);
                ((i)object0).a().post(h0);
                return;
            }
            case 2: {
                ((a)object0).b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", new Object[]{componentName0});
                V6.p p0 = new V6.p(1, this);
                ((a)object0).a().post(p0);
                return;
            }
            case 3: {
                Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
                ((Q)object0).getClass();
            }
        }
    }
}

