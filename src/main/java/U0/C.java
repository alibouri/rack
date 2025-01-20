package U0;

import O0.L;
import O0.s;
import android.view.inputmethod.CursorAnchorInfo.Builder;

public abstract class c {
    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder cursorAnchorInfo$Builder0, L l0, m0.c c0) {
        if(!c0.f()) {
            int v = l0.b.c(c0.b);
            s s0 = l0.b;
            int v1 = s0.c(c0.d);
            if(v <= v1) {
                while(true) {
                    cursorAnchorInfo$Builder0.addVisibleLineBounds(l0.g(v), s0.d(v), l0.h(v), s0.b(v));
                    if(v == v1) {
                        break;
                    }
                    ++v;
                }
            }
        }
        return cursorAnchorInfo$Builder0;
    }
}

