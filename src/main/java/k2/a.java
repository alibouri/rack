package k2;

import I2.J;
import Nb.j;
import Sb.d;
import androidx.recyclerview.widget.c;
import java.util.Collection;
import p2.b;

public final class a implements Runnable {
    public final c1 X;
    public final c1 Y;
    public final g Z;
    public final int b0;
    public final c1 c0;
    public final C1 d0;

    public a(c1 c10, c1 c11, g g0, int v, c1 c12, C1 c13) {
        this.X = c10;
        this.Y = c11;
        this.Z = g0;
        this.b0 = v;
        this.c0 = c12;
        this.d0 = c13;
    }

    @Override
    public final void run() {
        c1 c10 = this.Y;
        g g0 = this.Z;
        j.f(g0, "this$0");
        C1 c11 = this.d0;
        c1 c12 = this.X;
        b b0 = (b)g0.b.Z;
        j.f(c12.b0, "<this>");
        j.f(c10.b0, "newList");
        c c0 = b.e(new B1(c12.b0, c10.b0, b0, c12.b0.d0, c10.b0.d0));
        boolean z = false;
        d d0 = J.R(0, c12.b0.d0);
        if(!(d0 instanceof Collection) || !((Collection)d0).isEmpty()) {
            Sb.c c1 = d0.a();
            while(c1.Z) {
                if(c0.a(c1.a()) != -1) {
                    z = true;
                    break;
                }
                if(false) {
                    break;
                }
            }
        }
        F1.c c2 = new F1.c(z, c0);
        k2.b b1 = new k2.b(g0, this.b0, this.c0, c10, c2, c11, c12);
        p.a.V().W(b1);
    }
}

