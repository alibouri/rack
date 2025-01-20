package E;

import F0.o;
import Nb.j;
import androidx.compose.foundation.lazy.layout.c;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import g0.n;
import java.util.ArrayList;
import q0.b;
import yc.d;

public final class w extends n implements o {
    public c l0;

    @Override  // F0.o
    public final void c(LayoutNodeDrawScope layoutNodeDrawScope0) {
        ArrayList arrayList0 = this.l0.i;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            u u0 = (u)arrayList0.get(v1);
            b b0 = u0.l;
            if(b0 != null) {
                float f = ((float)(((int)(u0.k >> 0x20)))) - ((float)(((int)(b0.s >> 0x20))));
                float f1 = ((float)(((int)(u0.k & 0xFFFFFFFFL)))) - ((float)(((int)(0xFFFFFFFFL & b0.s))));
                ((g3.b)layoutNodeDrawScope0.X.Y.Y).t(f, f1);
                try {
                    d.j(layoutNodeDrawScope0, b0);
                }
                finally {
                    ((g3.b)layoutNodeDrawScope0.X.Y.Y).t(-f, -f1);
                }
            }
        }
        layoutNodeDrawScope0.a();
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof w ? j.a(this.l0, ((w)object0).l0) : false;
    }

    @Override  // F0.o
    public final void f0() {
    }

    @Override
    public final int hashCode() {
        return this.l0.hashCode();
    }

    @Override  // g0.n
    public final void p0() {
        this.l0.j = this;
    }

    @Override  // g0.n
    public final void q0() {
        this.l0.f();
    }

    @Override
    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.l0 + ')';
    }
}

