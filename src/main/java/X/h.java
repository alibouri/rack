package x;

import T4.l;
import android.support.v4.media.session.a;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;

public final class h implements PopupPositionProvider {
    public final long a;

    public h(long v) {
        this.a = v;
    }

    @Override  // androidx.compose.ui.window.PopupPositionProvider
    public final long a(a1.h h0, long v, LayoutDirection layoutDirection0, long v1) {
        int v2 = h0.a + ((int)(this.a >> 0x20));
        return layoutDirection0 == LayoutDirection.X ? a.i(l.z(v2, ((int)(v1 >> 0x20)), ((int)(v >> 0x20)), true), l.z(h0.b + ((int)(this.a & 0xFFFFFFFFL)), ((int)(v1 & 0xFFFFFFFFL)), ((int)(v & 0xFFFFFFFFL)), true)) : a.i(l.z(v2, ((int)(v1 >> 0x20)), ((int)(v >> 0x20)), false), l.z(h0.b + ((int)(this.a & 0xFFFFFFFFL)), ((int)(v1 & 0xFFFFFFFFL)), ((int)(v & 0xFFFFFFFFL)), true));
    }
}

