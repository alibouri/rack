package Ec;

import java.io.Closeable;
import java.util.Arrays;
import m5.b;

public final class h implements Closeable {
    public j X;
    public boolean Y;
    public G Z;
    public long b0;
    public byte[] c0;
    public int d0;
    public int e0;

    public h() {
        this.b0 = -1L;
        this.d0 = -1;
        this.e0 = -1;
    }

    public final void a(long v) {
        j j0 = this.X;
        if(j0 == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if(!this.Y) {
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
        }
        long v1 = j0.Y;
        if(Long.compare(v, v1) <= 0) {
            if(v < 0L) {
                throw new IllegalArgumentException(b.t(v, "newSize < 0: ").toString());
            }
            long v2 = v1 - v;
            while(v2 > 0L) {
                G g0 = j0.X;
                Nb.j.c(g0);
                G g1 = g0.g;
                Nb.j.c(g1);
                int v3 = g1.c;
                long v4 = (long)(v3 - g1.b);
                if(v4 <= v2) {
                    j0.X = g1.a();
                    H.a(g1);
                    v2 -= v4;
                }
                else {
                    g1.c = v3 - ((int)v2);
                    if(true) {
                        break;
                    }
                }
            }
            this.Z = null;
            this.b0 = v;
            this.c0 = null;
            this.d0 = -1;
            this.e0 = -1;
        }
        else {
            long v5 = v - v1;
            boolean z = true;
            while(v5 > 0L) {
                G g2 = j0.d0(1);
                int v6 = (int)Math.min(v5, 0x2000 - g2.c);
                int v7 = g2.c + v6;
                g2.c = v7;
                v5 -= (long)v6;
                if(z) {
                    this.Z = g2;
                    this.b0 = v1;
                    this.c0 = g2.a;
                    this.d0 = v7 - v6;
                    this.e0 = v7;
                    z = false;
                }
            }
        }
        j0.Y = v;
    }

    public final int b(long v) {
        j j0 = this.X;
        if(j0 == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        int v1 = Long.compare(v, -1L);
        if(v1 >= 0) {
            long v2 = j0.Y;
            int v3 = Long.compare(v, v2);
            if(v3 <= 0) {
                if(v1 != 0 && v3 != 0) {
                    G g0 = j0.X;
                    G g1 = this.Z;
                    long v4 = 0L;
                    if(g1 == null) {
                        g1 = g0;
                    }
                    else {
                        long v5 = this.b0 - ((long)(this.d0 - g1.b));
                        if(v5 > v) {
                            v2 = v5;
                            G g2 = g1;
                            g1 = g0;
                            g0 = g2;
                        }
                        else {
                            v4 = v5;
                        }
                    }
                    if(v2 - v > v - v4) {
                        while(true) {
                            Nb.j.c(g1);
                            long v6 = ((long)(g1.c - g1.b)) + v4;
                            if(v < v6) {
                                break;
                            }
                            g1 = g1.f;
                            v4 = v6;
                        }
                    }
                    else {
                        while(v2 > v) {
                            Nb.j.c(g0);
                            g0 = g0.g;
                            Nb.j.c(g0);
                            v2 -= (long)(g0.c - g0.b);
                        }
                        g1 = g0;
                        v4 = v2;
                    }
                    if(this.Y) {
                        Nb.j.c(g1);
                        if(g1.d) {
                            byte[] arr_b = Arrays.copyOf(g1.a, g1.a.length);
                            Nb.j.e(arr_b, "copyOf(...)");
                            G g3 = new G(arr_b, g1.b, g1.c, false, true);
                            if(j0.X == g1) {
                                j0.X = g3;
                            }
                            g1.b(g3);
                            G g4 = g3.g;
                            Nb.j.c(g4);
                            g4.a();
                            g1 = g3;
                        }
                    }
                    this.Z = g1;
                    this.b0 = v;
                    Nb.j.c(g1);
                    this.c0 = g1.a;
                    int v7 = g1.b + ((int)(v - v4));
                    this.d0 = v7;
                    this.e0 = g1.c;
                    return g1.c - v7;
                }
                this.Z = null;
                this.b0 = v;
                this.c0 = null;
                this.d0 = -1;
                this.e0 = -1;
                return -1;
            }
        }
        throw new ArrayIndexOutOfBoundsException("offset=" + v + " > size=" + j0.Y);
    }

    @Override
    public final void close() {
        if(this.X == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        this.X = null;
        this.Z = null;
        this.b0 = -1L;
        this.c0 = null;
        this.d0 = -1;
        this.e0 = -1;
    }
}

