package N6;

import T6.f;
import V6.a;
import V6.n;
import android.os.IBinder.DeathRecipient;
import android.os.RemoteException;
import o6.i;

public final class m implements IBinder.DeathRecipient {
    public final int a;
    public final Object b;

    public m(int v, Object object0) {
        this.a = v;
        this.b = object0;
        super();
    }

    private final void a() {
        q q0 = (q)this.b;
        q0.b.e("reportBinderDeath", new Object[0]);
        if(q0.i.get() != null) {
            throw new ClassCastException();
        }
        q0.b.e("%s : Binder has died.", new Object[]{q0.c});
        for(Object object0: q0.d) {
            RemoteException remoteException0 = new RemoteException(q0.c + " : Binder has died.");
            i i0 = ((l)object0).X;
            if(i0 != null) {
                i0.c(remoteException0);
            }
        }
        q0.d.clear();
        synchronized(q0.f) {
            q0.d();
        }
    }

    private final void b() {
        T6.i i0 = (T6.i)this.b;
        i0.b.b("reportBinderDeath", new Object[0]);
        if(i0.i.get() != null) {
            throw new ClassCastException();
        }
        i0.b.b("%s : Binder has died.", new Object[]{i0.c});
        for(Object object0: i0.d) {
            RemoteException remoteException0 = new RemoteException(i0.c + " : Binder has died.");
            i i1 = ((f)object0).X;
            if(i1 != null) {
                i1.c(remoteException0);
            }
        }
        i0.d.clear();
        synchronized(i0.f) {
            i0.c();
        }
    }

    @Override  // android.os.IBinder$DeathRecipient
    public final void binderDied() {
        switch(this.a) {
            case 0: {
                this.a();
                return;
            }
            case 1: {
                this.b();
                return;
            }
            default: {
                a a0 = (a)this.b;
                a0.b.a("reportBinderDeath", new Object[0]);
                if(a0.j.get() != null) {
                    throw new ClassCastException();
                }
                a0.b.a("%s : Binder has died.", new Object[]{a0.c});
                for(Object object0: a0.d) {
                    ((n)object0).a(new RemoteException(a0.c + " : Binder has died."));
                }
                a0.d.clear();
                synchronized(a0.f) {
                    a0.c();
                }
            }
        }
    }
}

