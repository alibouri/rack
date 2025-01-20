package c2;

import Nb.j;
import Y8.o;
import android.view.View;

public final class b implements Runnable {
    public final int X;
    public final k Y;
    public final X Z;

    public b(k k0, X x0, int v) {
        this.X = v;
        this.Y = k0;
        this.Z = x0;
        super();
    }

    @Override
    public final void run() {
        switch(this.X) {
            case 0: {
                j.f(this.Y, "this$0");
                j.f(this.Z, "$operation");
                this.Y.a(this.Z);
                return;
            }
            case 1: {
                k k0 = this.Y;
                j.f(k0, "this$0");
                X x0 = this.Z;
                if(k0.b.contains(x0)) {
                    int v = x0.a;
                    View view0 = x0.c.F0;
                    j.e(view0, "operation.fragment.mView");
                    o.k(v, view0, k0.a);
                }
                return;
            }
            default: {
                j.f(this.Y, "this$0");
                this.Y.b.remove(this.Z);
                this.Y.c.remove(this.Z);
            }
        }
    }
}

