package o6;

import j6.z0;
import java.util.concurrent.Executor;

public final class m implements b, d, e, o {
    public final int X;
    public final Executor Y;
    public final a Z;
    public final p b0;

    public m(Executor executor0, a a0, p p0, int v) {
        this.X = v;
        this.Y = executor0;
        this.Z = a0;
        this.b0 = p0;
        super();
    }

    @Override  // o6.o
    public final void a(h h0) {
        if(this.X != 0) {
            z0 z00 = new z0(12, this, h0, false);
            this.Y.execute(z00);
            return;
        }
        z0 z01 = new z0(11, this, h0, false);
        this.Y.execute(z01);
    }

    @Override  // o6.b
    public void h() {
        this.b0.p();
    }

    @Override  // o6.e
    public void k(Object object0) {
        this.b0.o(object0);
    }

    @Override  // o6.d
    public void u(Exception exception0) {
        this.b0.n(exception0);
    }
}

