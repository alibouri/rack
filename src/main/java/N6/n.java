package N6;

public final class n extends l {
    public final int Y;
    public final Object Z;

    public n(int v, Object object0) {
        this.Y = v;
        this.Z = object0;
        super();
    }

    @Override  // N6.l
    public final void a() {
        if(this.Y != 0) {
            q q0 = (q)((p)this.Z).Y;
            q0.b.e("unlinkToDeath", new Object[0]);
            q0.m.asBinder().unlinkToDeath(q0.j, 0);
            q q1 = (q)((p)this.Z).Y;
            q1.m = null;
            q1.g = false;
            return;
        }
        synchronized(((q)this.Z).f) {
            if(((q)this.Z).k.get() > 0 && ((q)this.Z).k.decrementAndGet() > 0) {
                ((q)this.Z).b.e("Leaving the connection open for other ongoing calls.", new Object[0]);
                return;
            }
            q q2 = (q)this.Z;
            if(q2.m != null) {
                q2.b.e("Unbind from service.", new Object[0]);
                ((q)this.Z).a.unbindService(((q)this.Z).l);
                ((q)this.Z).g = false;
                ((q)this.Z).m = null;
                ((q)this.Z).l = null;
            }
            ((q)this.Z).d();
        }
    }
}

