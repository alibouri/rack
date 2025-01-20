package V6;

public final class p extends n {
    public final int Y;
    public final Object Z;

    public p(int v, Object object0) {
        this.Y = v;
        this.Z = object0;
        super();
    }

    @Override  // V6.n
    public final void b() {
        if(this.Y != 0) {
            a a0 = (a)((N6.p)this.Z).Y;
            a0.b.a("unlinkToDeath", new Object[0]);
            a0.n.asBinder().unlinkToDeath(a0.k, 0);
            a a1 = (a)((N6.p)this.Z).Y;
            a1.n = null;
            a1.g = false;
            return;
        }
        synchronized(((a)this.Z).f) {
            if(((a)this.Z).l.get() > 0 && ((a)this.Z).l.decrementAndGet() > 0) {
                ((a)this.Z).b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                return;
            }
            a a2 = (a)this.Z;
            if(a2.n != null) {
                a2.b.a("Unbind from service.", new Object[0]);
                ((a)this.Z).a.unbindService(((a)this.Z).m);
                ((a)this.Z).g = false;
                ((a)this.Z).n = null;
                ((a)this.Z).m = null;
            }
            ((a)this.Z).c();
        }
    }
}

