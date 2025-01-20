package j0;

import B.m0;
import Bb.F;
import F0.f;
import F0.m;
import F0.q0;
import Nb.j;
import Nb.w;
import android.view.DragEvent;
import g.a;
import g0.n;
import yc.d;

public final class c extends n implements m, q0 {
    public c l0;

    public final void A0(a a0) {
        c c1;
        q0 q00;
        c c0 = this.l0;
        if(c0 == null) {
        label_6:
            if(this.X.k0) {
                w w0 = new w();  // initializer: Ljava/lang/Object;-><init>()V
                f.z(this, new m0(w0, this, a0, 17));
                q00 = (q0)w0.X;
            }
            else {
                q00 = null;
            }
            c1 = (c)q00;
        }
        else {
            DragEvent dragEvent0 = (DragEvent)a0.Y;
            if(F.g(c0, d.d(dragEvent0.getX(), dragEvent0.getY()))) {
                c1 = c0;
                goto label_13;
            }
            goto label_6;
        }
    label_13:
        if(c1 != null && c0 == null) {
            c1.y0(a0);
            c1.A0(a0);
        }
        else if(c1 == null && c0 != null) {
            c0.z0(a0);
        }
        else if(!j.a(c1, c0)) {
            if(c1 != null) {
                c1.y0(a0);
                c1.A0(a0);
            }
            if(c0 != null) {
                c0.z0(a0);
            }
        }
        else if(c1 != null) {
            c1.A0(a0);
        }
        this.l0 = c1;
    }

    public final void B0(a a0) {
        c c0 = this.l0;
        if(c0 != null) {
            c0.B0(a0);
        }
    }

    @Override  // F0.q0
    public final Object p() {
        return b.a;
    }

    @Override  // g0.n
    public final void q0() {
        this.l0 = null;
    }

    public final boolean x0(a a0) {
        return this.l0 == null ? false : this.l0.x0(a0);
    }

    public final void y0(a a0) {
        c c0 = this.l0;
        if(c0 != null) {
            c0.y0(a0);
        }
    }

    public final void z0(a a0) {
        c c0 = this.l0;
        if(c0 != null) {
            c0.z0(a0);
        }
        this.l0 = null;
    }
}

