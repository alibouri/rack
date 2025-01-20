package z0;

import Ab.t;
import Nb.j;
import Nb.k;
import android.view.MotionEvent;
import d1.c;
import kotlin.jvm.functions.Function1;

public final class q extends k implements Function1 {
    public final int X;
    public final r Y;

    public q(r r0, int v) {
        this.X = v;
        this.Y = r0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        if(this.X != 0) {
            c c0 = this.Y.X;
            if(c0 != null) {
                c0.n(((MotionEvent)object0));
                return t.a;
            }
            j.p("onTouchEvent");
            throw null;
        }
        c c1 = this.Y.X;
        if(c1 != null) {
            c1.n(((MotionEvent)object0));
            return t.a;
        }
        j.p("onTouchEvent");
        throw null;
    }
}

