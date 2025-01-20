package z0;

import android.view.MotionEvent;

public final class d {
    public static final d a;

    static {
        d.a = new d();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public final long a(MotionEvent motionEvent0, int v) {
        return yc.d.d(motionEvent0.getRawX(v), motionEvent0.getRawY(v));
    }
}

