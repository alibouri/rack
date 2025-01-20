package Ec;

import java.util.zip.CRC32;
import java.util.zip.Deflater;

public final class u implements J {
    public final E X;
    public final Deflater Y;
    public final n Z;
    public boolean b0;
    public final CRC32 c0;

    public u(k k0) {
        E e0 = new E(k0);
        this.X = e0;
        Deflater deflater0 = new Deflater(-1, true);
        this.Y = deflater0;
        this.Z = new n(e0, deflater0);
        this.c0 = new CRC32();
        e0.Y.k0(8075);
        e0.Y.h0(8);
        e0.Y.h0(0);
        e0.Y.j0(0);
        e0.Y.h0(0);
        e0.Y.h0(0);
    }

    @Override  // Ec.J
    public final void close() {
        Deflater deflater0 = this.Y;
        E e0 = this.X;
        if(this.b0) {
            return;
        }
        try {
            ((Deflater)this.Z.b0).finish();
            this.Z.a(false);
            int v = (int)this.c0.getValue();
            if(e0.Z) {
                throw new IllegalStateException("closed");
            }
            j j0 = e0.Y;
            j0.j0(b.h(v));
            e0.a();
            int v1 = (int)deflater0.getBytesRead();
            if(e0.Z) {
                throw new IllegalStateException("closed");
            }
            j0.j0(b.h(v1));
            e0.a();
            throwable0 = null;
        }
        catch(Throwable throwable0) {
        }
        try {
            deflater0.end();
        }
        catch(Throwable throwable1) {
            if(throwable0 == null) {
                throwable0 = throwable1;
            }
        }
        try {
            e0.close();
        }
        catch(Throwable throwable2) {
            if(throwable0 == null) {
                throwable0 = throwable2;
            }
        }
        this.b0 = true;
        if(throwable0 != null) {
            throw throwable0;
        }
    }

    @Override  // Ec.J
    public final void flush() {
        this.Z.flush();
    }

    @Override  // Ec.J
    public final N timeout() {
        return this.X.X.timeout();
    }

    @Override  // Ec.J
    public final void write(j j0, long v) {
        Nb.j.f(j0, "source");
        int v1 = Long.compare(v, 0L);
        if(v1 < 0) {
            throw new IllegalArgumentException(m5.b.t(v, "byteCount < 0: ").toString());
        }
        if(v1 == 0) {
            return;
        }
        G g0 = j0.X;
        Nb.j.c(g0);
        long v2 = v;
        while(v2 > 0L) {
            int v3 = (int)Math.min(v2, g0.c - g0.b);
            this.c0.update(g0.a, g0.b, v3);
            v2 -= (long)v3;
            g0 = g0.f;
            Nb.j.c(g0);
        }
        this.Z.write(j0, v);
    }
}

