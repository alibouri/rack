package Ec;

import java.io.IOException;
import java.util.zip.Deflater;
import uc.l;

public final class n implements J {
    public final int X;
    public boolean Y;
    public final Object Z;
    public final Object b0;

    public n(E e0, Deflater deflater0) {
        this.X = 0;
        super();
        this.Z = e0;
        this.b0 = deflater0;
    }

    public n(l l0) {
        this.X = 1;
        super();
        this.b0 = l0;
        this.Z = new t(((E)l0.e).X.timeout());
    }

    public void a(boolean z) {
        int v;
        G g0;
        E e0 = (E)this.Z;
        j j0 = e0.Y;
        while(true) {
            g0 = j0.d0(1);
            Deflater deflater0 = (Deflater)this.b0;
            byte[] arr_b = g0.a;
            try {
                v = z ? deflater0.deflate(arr_b, g0.c, 0x2000 - g0.c, 2) : deflater0.deflate(arr_b, g0.c, 0x2000 - g0.c);
            }
            catch(NullPointerException nullPointerException0) {
                throw new IOException("Deflater already closed", nullPointerException0);
            }
            if(v > 0) {
                g0.c += v;
                j0.Y += (long)v;
                e0.a();
            }
            else if(deflater0.needsInput()) {
                break;
            }
        }
        if(g0.b == g0.c) {
            j0.X = g0.a();
            H.a(g0);
        }
    }

    @Override  // Ec.J
    public final void close() {
        if(this.X != 0) {
            if(!this.Y) {
                this.Y = true;
                ((l)this.b0).getClass();
                N n0 = ((t)this.Z).e;
                ((t)this.Z).e = N.d;
                n0.a();
                n0.b();
                ((l)this.b0).a = 3;
            }
            return;
        }
        Deflater deflater0 = (Deflater)this.b0;
        if(!this.Y) {
            try {
                deflater0.finish();
                this.a(false);
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
                ((E)this.Z).close();
            }
            catch(Throwable throwable2) {
                if(throwable0 == null) {
                    throwable0 = throwable2;
                }
            }
            this.Y = true;
            if(throwable0 != null) {
                throw throwable0;
            }
        }
    }

    @Override  // Ec.J
    public final void flush() {
        if(this.X != 0) {
            if(!this.Y) {
                ((E)((l)this.b0).e).flush();
            }
            return;
        }
        this.a(true);
        ((E)this.Z).flush();
    }

    @Override  // Ec.J
    public final N timeout() {
        return this.X != 0 ? ((t)this.Z) : ((E)this.Z).X.timeout();
    }

    @Override
    public String toString() {
        return this.X == 0 ? "DeflaterSink(" + ((E)this.Z) + ')' : super.toString();
    }

    @Override  // Ec.J
    public final void write(j j0, long v) {
        Object object0 = this.b0;
        Nb.j.f(j0, "source");
        if(this.X != 0) {
            if(this.Y) {
                throw new IllegalStateException("closed");
            }
            if(v < 0L || 0L > j0.Y || j0.Y < v) {
                throw new ArrayIndexOutOfBoundsException();
            }
            ((E)((l)object0).e).write(j0, v);
            return;
        }
        b.e(j0.Y, 0L, v);
        while(v > 0L) {
            G g0 = j0.X;
            Nb.j.c(g0);
            int v1 = (int)Math.min(v, g0.c - g0.b);
            ((Deflater)object0).setInput(g0.a, g0.b, v1);
            this.a(false);
            j0.Y -= (long)v1;
            int v2 = g0.b + v1;
            g0.b = v2;
            if(v2 == g0.c) {
                j0.X = g0.a();
                H.a(g0);
            }
            v -= (long)v1;
        }
    }
}

