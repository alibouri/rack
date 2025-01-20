package q6;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import m5.b;

public abstract class a {
    public static final LinearInterpolator a;
    public static final e2.a b;
    public static final e2.a c;
    public static final e2.a d;
    public static final DecelerateInterpolator e;

    static {
        a.a = new LinearInterpolator();
        a.b = new e2.a(e2.a.d);  // initializer: Le2/b;-><init>([F)V
        a.c = new e2.a();
        a.d = new e2.a(e2.a.e);  // initializer: Le2/b;-><init>([F)V
        a.e = new DecelerateInterpolator();
    }

    public static float a(float f, float f1, float f2) {
        return b.o(f1, f, f2, f);
    }
}

