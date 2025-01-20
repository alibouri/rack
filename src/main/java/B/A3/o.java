package a3;

import Ec.C;
import Ec.F;
import Ec.b;
import Ec.l;
import Ec.q;
import I2.J;
import java.io.Closeable;
import m3.g;

public final class o extends p {
    public final C X;
    public final q Y;
    public final String Z;
    public final Closeable b0;
    public boolean c0;
    public F d0;

    public o(C c0, q q0, String s, Closeable closeable0) {
        this.X = c0;
        this.Y = q0;
        this.Z = s;
        this.b0 = closeable0;
    }

    @Override  // a3.p
    public final void close() {
        synchronized(this) {
            this.c0 = true;
            F f0 = this.d0;
            if(f0 != null) {
                g.a(f0);
            }
            Closeable closeable0 = this.b0;
            if(closeable0 != null) {
                g.a(closeable0);
            }
        }
    }

    @Override  // a3.p
    public final J f() {
        return null;
    }

    @Override  // a3.p
    public final l h() {
        synchronized(this) {
            if(!this.c0) {
                l l0 = this.d0;
                if(l0 != null) {
                    return l0;
                }
                F f0 = b.c(this.Y.i(this.X));
                this.d0 = f0;
                return f0;
            }
        }
        throw new IllegalStateException("closed");
    }
}

