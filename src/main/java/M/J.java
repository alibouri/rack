package M;

import a1.g;
import a1.h;
import android.support.v4.media.session.a;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import g0.c;
import yc.d;

public final class j implements PopupPositionProvider {
    public final c a;
    public final n b;
    public long c;

    public j(c c0, n n0) {
        this.a = c0;
        this.b = n0;
        this.c = 0L;
    }

    @Override  // androidx.compose.ui.window.PopupPositionProvider
    public final long a(h h0, long v, LayoutDirection layoutDirection0, long v1) {
        long v2 = this.b.b();
        if(!d.o(v2)) {
            v2 = this.c;
        }
        this.c = v2;
        long v3 = this.a.a(v1, 0L, layoutDirection0);
        return g.d(g.d(a.i(h0.a, h0.b), a.L(v2)), v3);
    }
}

