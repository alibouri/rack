package S2;

import I2.A;
import J2.I;
import J2.e;
import J2.k;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public final class j implements Runnable {
    public final int X;
    public boolean Y;
    public int Z;
    public final Object b0;
    public final Object c0;

    public j(e e0, k k0, boolean z, int v) {
        this.X = 0;
        Nb.j.f(e0, "processor");
        Nb.j.f(k0, "token");
        super();
        this.b0 = e0;
        this.c0 = k0;
        this.Y = z;
        this.Z = v;
    }

    public j(BottomSheetBehavior bottomSheetBehavior0, View view0, int v) {
        this.X = 1;
        super();
        this.c0 = bottomSheetBehavior0;
        this.b0 = view0;
        this.Z = v;
    }

    @Override
    public final void run() {
        I i0;
        boolean z;
        if(this.X != 0) {
            BottomSheetBehavior bottomSheetBehavior0 = (BottomSheetBehavior)this.c0;
            if(bottomSheetBehavior0.G == null || !bottomSheetBehavior0.G.f()) {
                bottomSheetBehavior0.C(this.Z);
            }
            else {
                ((View)this.b0).postOnAnimation(this);
            }
            this.Y = false;
            return;
        }
        if(this.Y) {
            int v = this.Z;
            ((e)this.b0).getClass();
            String s = ((k)this.c0).a.a;
            synchronized(((e)this.b0).k) {
                i0 = ((e)this.b0).b(s);
            }
            z = e.e(s, i0, v);
        }
        else {
            z = ((e)this.b0).i(((k)this.c0), this.Z);
        }
        A.e().a(A.g("StopWorkRunnable"), "StopWorkRunnable for " + ((k)this.c0).a.a + "; Processor.stopWork = " + z);
    }
}

