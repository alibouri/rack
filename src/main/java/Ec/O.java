package Ec;

import Nb.j;
import java.util.concurrent.locks.ReentrantLock;
import m5.b;

public final class o implements L {
    public final x X;
    public long Y;
    public boolean Z;

    public o(x x0, long v) {
        j.f(x0, "fileHandle");
        super();
        this.X = x0;
        this.Y = v;
    }

    @Override  // Ec.L
    public final long M(Ec.j j0, long v) {
        long v8;
        int v7;
        int v6;
        j.f(j0, "sink");
        if(this.Z) {
            throw new IllegalStateException("closed");
        }
        x x0 = this.X;
        long v1 = this.Y;
        x0.getClass();
        if(v < 0L) {
            throw new IllegalArgumentException(b.t(v, "byteCount < 0: ").toString());
        }
        long v2 = v + v1;
        long v3 = v1;
        while(true) {
            if(v3 >= v2) {
                v8 = v3 - v1;
                break;
            }
            G g0 = j0.d0(1);
            byte[] arr_b = g0.a;
            int v4 = g0.c;
            int v5 = (int)Math.min(v2 - v3, 0x2000 - v4);
            synchronized(x0) {
                j.f(arr_b, "array");
                x0.b0.seek(v3);
                v6 = 0;
                while(true) {
                label_17:
                    if(v6 < v5) {
                        v7 = x0.b0.read(arr_b, v4, v5 - v6);
                        break;
                    }
                    goto label_30;
                }
            }
            if(v7 != -1) {
                v6 += v7;
                goto label_17;
            }
            else if(v6 == 0) {
                v6 = -1;
            }
        label_30:
            if(v6 == -1) {
                if(g0.b == g0.c) {
                    j0.X = g0.a();
                    H.a(g0);
                }
                v8 = v1 == v3 ? -1L : v3 - v1;
                break;
            }
            g0.c += v6;
            v3 += (long)v6;
            j0.Y += (long)v6;
        }
        if(v8 != -1L) {
            this.Y += v8;
        }
        return v8;
    }

    @Override
    public final void close() {
        if(this.Z) {
            return;
        }
        this.Z = true;
        x x0 = this.X;
        ReentrantLock reentrantLock0 = x0.Z;
        reentrantLock0.lock();
        int v = x0.Y - 1;
        x0.Y = v;
        if(v == 0 && x0.X) {
            reentrantLock0.unlock();
            synchronized(x0) {
                x0.b0.close();
            }
            return;
        }
        reentrantLock0.unlock();
    }

    @Override  // Ec.L
    public final N timeout() {
        return N.d;
    }
}

