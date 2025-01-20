package j3;

import Ab.t;
import android.view.ViewTreeObserver;
import kotlin.jvm.functions.Function1;

public final class j implements Function1 {
    public final f X;
    public final ViewTreeObserver Y;
    public final k Z;

    public j(f f0, ViewTreeObserver viewTreeObserver0, k k0) {
        this.X = f0;
        this.Y = viewTreeObserver0;
        this.Z = k0;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        Throwable throwable0 = (Throwable)object0;
        k k0 = this.Z;
        ViewTreeObserver viewTreeObserver0 = this.Y;
        if(viewTreeObserver0.isAlive()) {
            viewTreeObserver0.removeOnPreDrawListener(k0);
            return t.a;
        }
        this.X.X.getViewTreeObserver().removeOnPreDrawListener(k0);
        return t.a;
    }
}

