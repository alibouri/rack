package Ec;

import Nb.j;
import java.io.IOException;
import java.io.InputStream;
import m5.b;

public final class e implements L {
    public final int X;
    public final Object Y;
    public final Object Z;

    public e(K k0, e e0) {
        this.X = 0;
        super();
        this.Y = k0;
        this.Z = e0;
    }

    public e(InputStream inputStream0, N n0) {
        this.X = 1;
        j.f(inputStream0, "input");
        super();
        this.Y = inputStream0;
        this.Z = n0;
    }

    @Override  // Ec.L
    public final long M(Ec.j j0, long v) {
        long v3;
        if(this.X != 0) {
            j.f(j0, "sink");
            int v1 = Long.compare(v, 0L);
            if(v1 != 0) {
                if(v1 < 0) {
                    throw new IllegalArgumentException(b.t(v, "byteCount < 0: ").toString());
                }
                try {
                    ((N)this.Z).f();
                    G g0 = j0.d0(1);
                    int v2 = ((InputStream)this.Y).read(g0.a, g0.c, ((int)Math.min(v, 0x2000 - g0.c)));
                    if(v2 == -1) {
                        if(g0.b == g0.c) {
                            j0.X = g0.a();
                            H.a(g0);
                            return -1L;
                        }
                        return -1L;
                    }
                    g0.c += v2;
                    j0.Y += (long)v2;
                    return (long)v2;
                }
                catch(AssertionError assertionError0) {
                }
                if(Ec.b.f(assertionError0)) {
                    throw new IOException(assertionError0);
                }
                throw assertionError0;
            }
            return 0L;
        }
        j.f(j0, "sink");
        e e0 = (e)this.Z;
        K k0 = (K)this.Y;
        k0.i();
        try {
            try {
                v3 = e0.M(j0, v);
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
        return v3;
    }

    @Override
    public final void close() {
        if(this.X != 0) {
            ((InputStream)this.Y).close();
            return;
        }
        e e0 = (e)this.Z;
        K k0 = (K)this.Y;
        k0.i();
        try {
            try {
                e0.close();
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

    @Override  // Ec.L
    public final N timeout() {
        return this.X != 0 ? ((N)this.Z) : ((K)this.Y);
    }

    @Override
    public final String toString() {
        return this.X == 0 ? "AsyncTimeout.source(" + ((e)this.Z) + ')' : "source(" + ((InputStream)this.Y) + ')';
    }
}

