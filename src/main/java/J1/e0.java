package J1;

import android.os.Build.VERSION;
import android.view.animation.Interpolator;

public final class e0 {
    public d0 a;

    public e0(int v, Interpolator interpolator0, long v1) {
        if(Build.VERSION.SDK_INT >= 30) {
            this.a = new c0(s.h(v, interpolator0, v1));
            return;
        }
        this.a = new a0(interpolator0, v1);  // initializer: LJ1/d0;-><init>(Landroid/view/animation/Interpolator;J)V
    }
}

