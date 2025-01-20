package F;

import Ab.t;
import F0.c0;
import F0.f;
import F0.m;
import Fb.c;
import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.functions.Function0;

public final class j implements a {
    public final m X;

    public j(m m0) {
        this.X = m0;
    }

    @Override  // F.a
    public final Object H(c0 c00, Function0 function00, c c0) {
        View view0 = f.x(this.X);
        long v = c00.F(0L);
        m0.c c1 = (m0.c)function00.invoke();
        m0.c c2 = c1 == null ? null : c1.i(v);
        if(c2 != null) {
            view0.requestRectangleOnScreen(new Rect(((int)c2.a), ((int)c2.b), ((int)c2.c), ((int)c2.d)), false);
        }
        return t.a;
    }
}

