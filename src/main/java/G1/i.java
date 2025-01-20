package g1;

import E7.w;
import U.t0;
import android.os.Handler;
import e0.s;
import java.util.ArrayList;

public final class i implements t0 {
    public final g X;
    public Handler Y;
    public final s Z;
    public boolean b0;
    public final h c0;
    public final ArrayList d0;

    public i(g g0) {
        this.X = g0;
        this.Z = new s(new h(this, 0));
        this.b0 = true;
        this.c0 = new h(this, 1);
        this.d0 = new ArrayList();
    }

    @Override  // U.t0
    public final void a() {
        this.Z.d();
    }

    @Override  // U.t0
    public final void c() {
    }

    @Override  // U.t0
    public final void d() {
        s s0 = this.Z;
        w w0 = s0.g;
        if(w0 != null) {
            w0.f();
        }
        s0.b();
    }
}

