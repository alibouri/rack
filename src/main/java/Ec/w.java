package Ec;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import m5.b;

public final class w implements L {
    public final F X;
    public final Inflater Y;
    public int Z;
    public boolean b0;

    public w(F f0, Inflater inflater0) {
        this.X = f0;
        this.Y = inflater0;
    }

    @Override  // Ec.L
    public final long M(j j0, long v) {
        Nb.j.f(j0, "sink");
        while(true) {
            long v1 = this.a(j0, v);
            if(v1 > 0L) {
                return v1;
            }
            if(this.Y.finished() || this.Y.needsDictionary()) {
                break;
            }
            if(this.X.x()) {
                throw new EOFException("source exhausted prematurely");
            }
        }
        return -1L;
    }

    public final long a(j j0, long v) {
        Inflater inflater0 = this.Y;
        Nb.j.f(j0, "sink");
        int v1 = Long.compare(v, 0L);
        if(v1 < 0) {
            throw new IllegalArgumentException(b.t(v, "byteCount < 0: ").toString());
        }
        if(this.b0) {
            throw new IllegalStateException("closed");
        }
        if(v1 == 0) {
            return 0L;
        }
        try {
            G g0 = j0.d0(1);
            int v2 = (int)Math.min(v, 0x2000 - g0.c);
            boolean z = inflater0.needsInput();
            F f0 = this.X;
            if(z && !f0.x()) {
                G g1 = f0.Y.X;
                Nb.j.c(g1);
                int v3 = g1.c - g1.b;
                this.Z = v3;
                inflater0.setInput(g1.a, g1.b, v3);
            }
            int v4 = inflater0.inflate(g0.a, g0.c, v2);
            int v5 = this.Z;
            if(v5 != 0) {
                int v6 = v5 - inflater0.getRemaining();
                this.Z -= v6;
                f0.skip(((long)v6));
            }
            if(v4 > 0) {
                g0.c += v4;
                j0.Y += (long)v4;
                return (long)v4;
            }
            if(g0.b == g0.c) {
                j0.X = g0.a();
                H.a(g0);
            }
            return 0L;
        }
        catch(DataFormatException dataFormatException0) {
        }
        throw new IOException(dataFormatException0);
    }

    @Override
    public final void close() {
        if(this.b0) {
            return;
        }
        this.Y.end();
        this.b0 = true;
        this.X.close();
    }

    @Override  // Ec.L
    public final N timeout() {
        return this.X.X.timeout();
    }
}

