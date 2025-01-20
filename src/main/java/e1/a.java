package e1;

import a1.g;
import a1.h;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import g0.c;

public final class a implements PopupPositionProvider {
    public final c a;
    public final long b;

    public a(c c0, long v) {
        this.a = c0;
        this.b = v;
    }

    @Override  // androidx.compose.ui.window.PopupPositionProvider
    public final long a(h h0, long v, LayoutDirection layoutDirection0, long v1) {
        long v2 = this.a.a(0L, io.sentry.config.a.d(h0.c - h0.a, h0.d - h0.b), layoutDirection0);
        long v3 = this.a.a(0L, v1, layoutDirection0);
        return layoutDirection0 == LayoutDirection.X ? g.d(g.d(g.d(android.support.v4.media.session.a.i(h0.a, h0.b), v2), ((long)(-((int)(v3 & 0xFFFFFFFFL)))) & 0xFFFFFFFFL | ((long)(-((int)(v3 >> 0x20)))) << 0x20), android.support.v4.media.session.a.i(((int)(this.b >> 0x20)), ((int)(this.b & 0xFFFFFFFFL)))) : g.d(g.d(g.d(android.support.v4.media.session.a.i(h0.a, h0.b), v2), ((long)(-((int)(v3 & 0xFFFFFFFFL)))) & 0xFFFFFFFFL | ((long)(-((int)(v3 >> 0x20)))) << 0x20), android.support.v4.media.session.a.i(((int)(this.b >> 0x20)) * -1, ((int)(this.b & 0xFFFFFFFFL))));
    }
}

