package a3;

import Ec.l;
import Ec.q;
import I2.J;
import Nb.j;
import kotlin.jvm.functions.Function0;
import m3.g;

public final class r extends p {
    public final J X;
    public boolean Y;
    public final l Z;
    public final Function0 b0;

    public r(l l0, Function0 function00, J j0) {
        this.X = j0;
        this.Z = l0;
        this.b0 = function00;
    }

    @Override  // a3.p
    public final void close() {
        synchronized(this) {
            this.Y = true;
            l l0 = this.Z;
            if(l0 != null) {
                g.a(l0);
            }
        }
    }

    @Override  // a3.p
    public final J f() {
        return this.X;
    }

    @Override  // a3.p
    public final l h() {
        synchronized(this) {
            if(!this.Y) {
                l l0 = this.Z;
                if(l0 != null) {
                    return l0;
                }
                j.c(null);
                q.a.i(null);
                throw null;
            }
        }
        throw new IllegalStateException("closed");
    }
}

