package E;

import U.t0;
import W.d;
import android.view.Choreographer.FrameCallback;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;

public final class b implements i0, t0, Choreographer.FrameCallback, Runnable {
    public final View X;
    public final d Y;
    public boolean Z;
    public final Choreographer b0;
    public boolean c0;
    public long d0;
    public static long e0;

    public b(View view0) {
        float f;
        this.X = view0;
        this.Y = new d(new g0[16]);
        this.b0 = Choreographer.getInstance();
        if(b.e0 == 0L) {
            Display display0 = view0.getDisplay();
            if(view0.isInEditMode() || display0 == null) {
                f = 60.0f;
            }
            else {
                f = display0.getRefreshRate();
                if(f < 30.0f) {
                    f = 60.0f;
                }
            }
            b.e0 = (long)(1000000000.0f / f);
        }
    }

    @Override  // U.t0
    public final void a() {
        this.c0 = true;
    }

    @Override  // E.i0
    public final void b(g0 g00) {
        this.Y.c(g00);
        if(!this.Z) {
            this.Z = true;
            this.X.post(this);
        }
    }

    @Override  // U.t0
    public final void c() {
    }

    @Override  // U.t0
    public final void d() {
        this.c0 = false;
        this.X.removeCallbacks(this);
        this.b0.removeFrameCallback(this);
    }

    @Override  // android.view.Choreographer$FrameCallback
    public final void doFrame(long v) {
        if(this.c0) {
            this.d0 = v;
            this.X.post(this);
        }
    }

    @Override
    public final void run() {
        d d0 = this.Y;
        if(!d0.m() && this.Z && this.c0 && this.X.getWindowVisibility() == 0) {
            a a0 = new a(this.d0 + b.e0);
            boolean z = false;
            while(d0.n() && !z) {
                if(Long.compare(a0.a(), 0L) <= 0 || ((g0)d0.X[0]).b(a0)) {
                    z = true;
                }
                else {
                    d0.p(0);
                }
            }
            if(z) {
                this.b0.postFrameCallback(this);
                return;
            }
            this.Z = false;
            return;
        }
        this.Z = false;
    }
}

