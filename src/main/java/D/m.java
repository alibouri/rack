package D;

import E.L;
import E.M;
import E.N;
import a1.a;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;

public final class m implements N {
    public final i a;
    public final L b;
    public final int c;
    public final L d;
    public final A e;
    public final boolean f;
    public final int g;
    public final int h;
    public final long i;

    public m(i i0, L l0, int v, A a0, boolean z, int v1, int v2, long v3) {
        this.d = l0;
        this.e = a0;
        this.f = z;
        this.g = v1;
        this.h = v2;
        this.i = v3;
        this.a = i0;
        this.b = l0;
        this.c = v;
    }

    @Override  // E.N
    public final M a(int v, int v1, int v2, long v3) {
        return this.b(v, v3, v1, v2, this.c);
    }

    public final r b(int v, long v1, int v2, int v3, int v4) {
        int v5;
        Object object0 = this.a.c(v);
        Object object1 = this.a.b.a(v);
        List list0 = this.b.a(v, v1);
        if(a.f(v1)) {
            v5 = a.j(v1);
        }
        else if(a.e(v1)) {
            v5 = a.i(v1);
        }
        else {
            throw new IllegalArgumentException("does not have fixed height");
        }
        LayoutDirection layoutDirection0 = this.d.Y.getLayoutDirection();
        return new r(v, object0, v5, v4, this.f, layoutDirection0, this.g, this.h, list0, this.i, object1, this.e.k, v1, v2, v3);
    }
}

