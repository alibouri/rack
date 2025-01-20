package G0;

import android.view.MotionEvent;

public final class v0 {
    public static final v0 a;

    static {
        v0.a = new v0();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public final boolean a(MotionEvent motionEvent0, int v) {
        float f = motionEvent0.getRawX(v);
        if(!Float.isInfinite(f) && !Float.isNaN(f)) {
            float f1 = motionEvent0.getRawY(v);
            return !Float.isInfinite(f1) && !Float.isNaN(f1);
        }
        return false;
    }
}

