package Ec;

import A3.e;
import Nb.j;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import m5.b;

public final class v implements L {
    public byte X;
    public final F Y;
    public final Inflater Z;
    public final w b0;
    public final CRC32 c0;

    public v(L l0) {
        j.f(l0, "source");
        super();
        F f0 = new F(l0);
        this.Y = f0;
        Inflater inflater0 = new Inflater(true);
        this.Z = inflater0;
        this.b0 = new w(f0, inflater0);
        this.c0 = new CRC32();
    }

    @Override  // Ec.L
    public final long M(Ec.j j0, long v) {
        F f1;
        Ec.j j2;
        long v4;
        j.f(j0, "sink");
        int v1 = Long.compare(v, 0L);
        if(v1 < 0) {
            throw new IllegalArgumentException(b.t(v, "byteCount < 0: ").toString());
        }
        if(v1 == 0) {
            return 0L;
        }
        CRC32 cRC320 = this.c0;
        F f0 = this.Y;
        if(this.X == 0) {
            f0.Q(10L);
            Ec.j j1 = f0.Y;
            int v2 = j1.q(3L);
            boolean z = (v2 >> 1 & 1) == 1;
            if(z) {
                this.b(j1, 0L, 10L);
            }
            v.a(8075, f0.v(), "ID1ID2");
            f0.skip(8L);
            if((v2 >> 2 & 1) == 1) {
                f0.Q(2L);
                if(z) {
                    this.b(j1, 0L, 2L);
                }
                int v3 = j1.Z();
                f0.Q(((long)(v3 & 0xFFFF)));
                if(z) {
                    this.b(j1, 0L, ((long)(v3 & 0xFFFF)));
                }
                v4 = (long)(v3 & 0xFFFF);
                f0.skip(v4);
            }
            if((v2 >> 3 & 1) == 1) {
                j2 = j1;
                long v5 = f0.D(0, 0L, 0x7FFFFFFFFFFFFFFFL);
                if(v5 == -1L) {
                    throw new EOFException();
                }
                if(z) {
                    f1 = f0;
                    this.b(j2, 0L, v5 + 1L);
                }
                else {
                    f1 = f0;
                }
                f1.skip(v5 + 1L);
            }
            else {
                j2 = j1;
                f1 = f0;
            }
            if((v2 >> 4 & 1) == 1) {
                long v6 = f1.D(0, 0L, 0x7FFFFFFFFFFFFFFFL);
                if(v6 == -1L) {
                    throw new EOFException();
                }
                if(z) {
                    this.b(j2, 0L, v6 + 1L);
                }
                f1.skip(v6 + 1L);
            }
            if(z) {
                v.a(f1.z(), ((short)(((int)cRC320.getValue()))), "FHCRC");
                cRC320.reset();
            }
            this.X = 1;
        }
        else {
            f1 = f0;
        }
        if(this.X == 1) {
            long v7 = j0.Y;
            long v8 = this.b0.M(j0, v);
            if(v8 != -1L) {
                this.b(j0, v7, v8);
                return v8;
            }
            this.X = 2;
        }
        if(this.X == 2) {
            v.a(f1.q(), ((int)cRC320.getValue()), "CRC");
            v.a(f1.q(), ((int)this.Z.getBytesWritten()), "ISIZE");
            this.X = 3;
            if(!f1.x()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    public static void a(int v, int v1, String s) {
        if(v1 == v) {
            return;
        }
        StringBuilder stringBuilder0 = e.w(s, ": actual 0x");
        stringBuilder0.append(Vb.j.g0(Ec.b.m(v1), 8, '0'));
        stringBuilder0.append(" != expected 0x");
        stringBuilder0.append(Vb.j.g0(Ec.b.m(v), 8, '0'));
        throw new IOException(stringBuilder0.toString());
    }

    public final void b(Ec.j j0, long v, long v1) {
        G g0 = j0.X;
        j.c(g0);
        while(true) {
            int v2 = g0.c;
            int v3 = g0.b;
            if(v < ((long)(v2 - v3))) {
                break;
            }
            v -= (long)(v2 - v3);
            g0 = g0.f;
            j.c(g0);
        }
        while(v1 > 0L) {
            int v4 = (int)(((long)g0.b) + v);
            int v5 = (int)Math.min(g0.c - v4, v1);
            this.c0.update(g0.a, v4, v5);
            v1 -= (long)v5;
            g0 = g0.f;
            j.c(g0);
            v = 0L;
        }
    }

    @Override
    public final void close() {
        this.b0.close();
    }

    @Override  // Ec.L
    public final N timeout() {
        return this.Y.X.timeout();
    }
}

