package T6;

import N6.p;

public final class h extends f {
    public final int Y;
    public final Object Z;

    public h(int v, Object object0) {
        this.Y = v;
        this.Z = object0;
        super();
    }

    @Override  // T6.f
    public final void a() {
        if(this.Y != 0) {
            i i0 = (i)((p)this.Z).Y;
            i0.b.b("unlinkToDeath", new Object[0]);
            i0.m.asBinder().unlinkToDeath(i0.j, 0);
            i i1 = (i)((p)this.Z).Y;
            i1.m = null;
            i1.g = false;
            return;
        }
        synchronized(((i)this.Z).f) {
            if(((i)this.Z).k.get() > 0 && ((i)this.Z).k.decrementAndGet() > 0) {
                ((i)this.Z).b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                return;
            }
            i i2 = (i)this.Z;
            if(i2.m != null) {
                i2.b.b("Unbind from service.", new Object[0]);
                ((i)this.Z).a.unbindService(((i)this.Z).l);
                ((i)this.Z).g = false;
                ((i)this.Z).m = null;
                ((i)this.Z).l = null;
            }
            ((i)this.Z).c();
        }
    }
}

