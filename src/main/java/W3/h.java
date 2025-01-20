package W3;

import Ab.t;
import Fb.j;
import Nb.w;
import W5.f;
import Xb.G;
import Xb.H;
import Y8.m2;
import ac.i;
import android.app.NotificationManager;
import com.sendwave.backend.fragment.CustomerHomeFragment;
import com.wave.voip.call.VoipCallService;
import hd.c;
import k2.i0;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function3;

public final class h extends j implements Function3 {
    public final int c0;
    public Object d0;

    public h(int v, g g0) {
        this.c0 = 1;
        super(v, g0);
    }

    public h(Object object0, g g0, int v) {
        this.c0 = v;
        this.d0 = object0;
        super(3, g0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        switch(this.c0) {
            case 0: {
                i i1 = (i)object0;
                Throwable throwable1 = (Throwable)object1;
                new h(((w)this.d0), ((g)object2), 0).v(t.a);
                return t.a;
            }
            case 1: {
                ((Number)object1).longValue();
                h h0 = new h(3, ((g)object2));
                h0.d0 = (m2)object0;
                return h0.v(t.a);
            }
            case 2: {
                i i2 = (i)object0;
                Throwable throwable2 = (Throwable)object1;
                new h(((i0)this.d0), ((g)object2), 2).v(t.a);
                return t.a;
            }
            case 3: {
                i i3 = (i)object0;
                Throwable throwable3 = (Throwable)object1;
                new h(((VoipCallService)this.d0), ((g)object2), 3).v(t.a);
                return t.a;
            }
            default: {
                i i0 = (i)object0;
                Throwable throwable0 = (Throwable)object1;
                new h(((G)this.d0), ((g)object2), 4).v(t.a);
                return t.a;
            }
        }
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = t.a;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                w w0 = (w)this.d0;
                try {
                    W3.j j0 = (W3.j)w0.X;
                    if(j0 != null) {
                        j0.close();
                        return object1;
                    }
                }
                catch(Throwable throwable0) {
                    f.v(throwable0);
                }
                return object1;
            }
            case 1: {
                f.b0(object0);
                return ((CustomerHomeFragment)((m2)this.d0).a).f.d.a;
            }
            case 2: {
                f.b0(object0);
                ((i0)this.d0).getClass();
                return object1;
            }
            case 3: {
                f.b0(object0);
                NotificationManager notificationManager0 = ((VoipCallService)this.d0).c0;
                if(notificationManager0 != null) {
                    notificationManager0.cancel(1);
                    return object1;
                }
                Nb.j.p("notificationManager");
                throw null;
            }
            default: {
                f.b0(object0);
                c.a.n("VoipCallNetworkMetrics");
                c.a.a("Done reporting metrics.", new Object[0]);
                H.b(((G)this.d0), null);
                return object1;
            }
        }
    }
}

