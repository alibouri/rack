package L;

import D0.J;
import D0.L;
import D0.M;
import F0.c0;
import F0.n;
import F0.o;
import F0.p;
import F0.x;
import M.i0;
import M.z;
import O0.O;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import java.util.List;
import kotlin.jvm.functions.Function1;
import n0.w;

public final class f extends n implements o, p, x {
    public h n0;
    public final Function1 o0;
    public final m p0;

    public f(O0.f f0, O o0, FontFamily.Resolver fontFamily$Resolver0, Function1 function10, int v, boolean z, int v1, int v2, List list0, Function1 function11, h h0, w w0) {
        this.n0 = h0;
        this.o0 = null;
        m m0 = new m(f0, o0, fontFamily$Resolver0, function10, v, z, v1, v2, list0, function11, h0, w0, null);
        this.x0(m0);
        this.p0 = m0;
        if(this.n0 == null) {
            throw new IllegalArgumentException("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        }
    }

    @Override  // F0.p
    public final void O(c0 c00) {
        h h0 = this.n0;
        if(h0 != null) {
            h0.b0 = j.a(h0.b0, c00, null, 2);
            ((i0)h0.Y).a = false;
            z z0 = ((i0)h0.Y).e;
            if(z0 != null) {
                z0.n(((long)h0.X));
            }
        }
    }

    @Override  // F0.x
    public final int a(F0.O o0, J j0, int v) {
        return this.p0.a(o0, j0, v);
    }

    @Override  // F0.x
    public final int b(F0.O o0, J j0, int v) {
        return this.p0.b(o0, j0, v);
    }

    @Override  // F0.o
    public final void c(LayoutNodeDrawScope layoutNodeDrawScope0) {
        this.p0.c(layoutNodeDrawScope0);
    }

    @Override  // F0.x
    public final L e(M m0, J j0, long v) {
        return this.p0.e(m0, j0, v);
    }

    @Override  // F0.x
    public final int f(F0.O o0, J j0, int v) {
        return this.p0.f(o0, j0, v);
    }

    @Override  // F0.o
    public final void f0() {
    }

    @Override  // F0.x
    public final int g(F0.O o0, J j0, int v) {
        return this.p0.g(o0, j0, v);
    }
}

