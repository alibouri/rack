package M6;

import N6.h;
import N6.k;
import N6.l;
import N6.q;
import R2.c;
import android.os.Bundle;
import android.os.RemoteException;
import o6.i;

public final class f extends l {
    public final int Y;
    public final i Z;
    public final Object b0;
    public final Object c0;

    public f(j j0, i i0, String s, i i1) {
        this.Y = 0;
        this.c0 = j0;
        this.b0 = s;
        this.Z = i1;
        super(i0);
    }

    public f(Object object0, i i0, i i1, Object object1, int v) {
        this.Y = v;
        this.c0 = object0;
        this.Z = i1;
        this.b0 = object1;
        super(i0);
    }

    @Override  // N6.l
    public final void a() {
        switch(this.Y) {
            case 0: {
                i i0 = this.Z;
                j j0 = (j)this.c0;
                String s = (String)this.b0;
                try {
                    h h0 = j0.a.m;
                    Bundle bundle0 = j.a(j0, s);
                    M6.i i1 = new M6.i(j0, i0, s);
                    h0.y(j0.b, bundle0, i1);
                }
                catch(RemoteException remoteException0) {
                    j.e.c(remoteException0, "requestUpdateInfo(%s)", new Object[]{s});
                    i0.c(new RuntimeException(remoteException0));
                }
                return;
            }
            case 1: {
                i i2 = this.Z;
                j j1 = (j)this.c0;
                try {
                    h h1 = j1.a.m;
                    Bundle bundle1 = j.b();
                    M6.h h2 = new M6.h(j1, new k("OnCompleteUpdateCallback"), i2);  // initializer: LM6/g;-><init>(LM6/j;LN6/k;Lo6/i;)V
                    h1.m(j1.b, bundle1, h2);
                }
                catch(RemoteException remoteException1) {
                    j.e.c(remoteException1, "completeUpdate(%s)", new Object[]{((String)this.b0)});
                    i2.c(new RuntimeException(remoteException1));
                }
                return;
            }
            default: {
                Object object0 = ((q)this.c0).f;
                synchronized(object0) {
                    ((q)this.c0).e.add(this.Z);
                    c c0 = new c(6, ((q)this.c0), this.Z, false);
                    this.Z.a.j(c0);
                    if(((q)this.c0).k.getAndIncrement() > 0) {
                        ((q)this.c0).b.e("Already connected to the service.", new Object[0]);
                    }
                    q.b(((q)this.c0), ((l)this.b0));
                }
            }
        }
    }
}

