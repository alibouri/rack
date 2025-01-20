package i;

import J1.N;
import J1.V;

public final class p implements Runnable {
    public final int X;
    public final B Y;

    public p(B b0, int v) {
        this.X = v;
        this.Y = b0;
        super();
    }

    @Override
    public final void run() {
        if(this.X != 0) {
            B b0 = this.Y;
            b0.u0.showAtLocation(b0.t0, 55, 0, 0);
            V v0 = b0.w0;
            if(v0 != null) {
                v0.b();
            }
            if(b0.x0 && (b0.y0 != null && b0.y0.isLaidOut())) {
                b0.t0.setAlpha(0.0f);
                V v1 = N.a(b0.t0);
                v1.a(1.0f);
                b0.w0 = v1;
                v1.d(new r(0, this));
                return;
            }
            b0.t0.setAlpha(1.0f);
            b0.t0.setVisibility(0);
            return;
        }
        B b1 = this.Y;
        if((b1.X0 & 1) != 0) {
            b1.v(0);
        }
        if((b1.X0 & 0x1000) != 0) {
            b1.v(108);
        }
        b1.W0 = false;
        b1.X0 = 0;
    }
}

