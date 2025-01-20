package Ec;

import java.io.IOException;
import java.io.OutputStream;

public final class d implements J {
    public final int X;
    public final Object Y;
    public final Object Z;

    public d(Object object0, int v, Object object1) {
        this.X = v;
        this.Y = object0;
        this.Z = object1;
        super();
    }

    @Override  // Ec.J
    public final void close() {
        if(this.X != 0) {
            ((OutputStream)this.Y).close();
            return;
        }
        d d0 = (d)this.Z;
        K k0 = (K)this.Y;
        k0.i();
        try {
            try {
                d0.close();
            }
            catch(IOException iOException0) {
                if(k0.j()) {
                    iOException0 = k0.l(iOException0);
                }
                throw iOException0;
            }
        }
        catch(Throwable throwable0) {
            k0.j();
            throw throwable0;
        }
        if(k0.j()) {
            throw k0.l(null);
        }
    }

    @Override  // Ec.J
    public final void flush() {
        if(this.X != 0) {
            ((OutputStream)this.Y).flush();
            return;
        }
        d d0 = (d)this.Z;
        K k0 = (K)this.Y;
        k0.i();
        try {
            try {
                d0.flush();
            }
            catch(IOException iOException0) {
                if(k0.j()) {
                    iOException0 = k0.l(iOException0);
                }
                throw iOException0;
            }
        }
        catch(Throwable throwable0) {
            k0.j();
            throw throwable0;
        }
        if(k0.j()) {
            throw k0.l(null);
        }
    }

    @Override  // Ec.J
    public final N timeout() {
        return this.X != 0 ? ((N)this.Z) : ((K)this.Y);
    }

    @Override
    public final String toString() {
        return this.X == 0 ? "AsyncTimeout.sink(" + ((d)this.Z) + ')' : "sink(" + ((OutputStream)this.Y) + ')';
    }

    @Override  // Ec.J
    public final void write(j j0, long v) {
        if(this.X != 0) {
            Nb.j.f(j0, "source");
            b.e(j0.Y, 0L, v);
            while(v > 0L) {
                ((N)this.Z).f();
                G g0 = j0.X;
                Nb.j.c(g0);
                int v1 = (int)Math.min(v, g0.c - g0.b);
                ((OutputStream)this.Y).write(g0.a, g0.b, v1);
                int v2 = g0.b + v1;
                g0.b = v2;
                v -= (long)v1;
                j0.Y -= (long)v1;
                if(v2 == g0.c) {
                    j0.X = g0.a();
                    H.a(g0);
                }
            }
            return;
        }
        Nb.j.f(j0, "source");
        b.e(j0.Y, 0L, v);
        while(true) {
            long v3 = 0L;
            if(v <= 0L) {
                break;
            }
            G g1 = j0.X;
            Nb.j.c(g1);
            while(v3 < 0x10000L) {
                v3 += (long)(g1.c - g1.b);
                if(v3 >= v) {
                    v3 = v;
                    break;
                }
                g1 = g1.f;
                Nb.j.c(g1);
            }
            d d0 = (d)this.Z;
            K k0 = (K)this.Y;
            k0.i();
            try {
                try {
                    d0.write(j0, v3);
                }
                catch(IOException iOException0) {
                    if(k0.j()) {
                        iOException0 = k0.l(iOException0);
                    }
                    throw iOException0;
                }
            }
            catch(Throwable throwable0) {
                k0.j();
                throw throwable0;
            }
            if(k0.j()) {
                throw k0.l(null);
            }
            v -= v3;
        }
    }
}

