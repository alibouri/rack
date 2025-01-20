package D;

import D0.V;
import E.M;
import androidx.compose.foundation.lazy.layout.c;
import androidx.compose.ui.unit.LayoutDirection;
import io.sentry.config.a;
import java.util.List;

public final class r implements M {
    public final int a;
    public final Object b;
    public final int c;
    public final boolean d;
    public final LayoutDirection e;
    public final int f;
    public final int g;
    public final List h;
    public final long i;
    public final Object j;
    public final c k;
    public final long l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public int q;
    public int r;
    public int s;
    public final long t;
    public long u;
    public int v;
    public int w;
    public boolean x;

    public r(int v, Object object0, int v1, int v2, boolean z, LayoutDirection layoutDirection0, int v3, int v4, List list0, long v5, Object object1, c c0, long v6, int v7, int v8) {
        this.a = v;
        this.b = object0;
        this.c = v1;
        this.d = z;
        this.e = layoutDirection0;
        this.f = v3;
        this.g = v4;
        this.h = list0;
        this.i = v5;
        this.j = object1;
        this.k = c0;
        this.l = v6;
        this.m = v7;
        this.n = v8;
        this.q = 0x80000000;
        int v9 = list0.size();
        int v10 = 0;
        int v12 = 0;
        for(int v11 = 0; v11 < v9; ++v11) {
            v12 = Math.max(v12, ((V)list0.get(v11)).Y);
        }
        this.o = v12;
        int v13 = v12 + v2;
        if(v13 >= 0) {
            v10 = v13;
        }
        this.p = v10;
        this.t = a.d(this.c, v12);
        this.u = 0L;
        this.v = -1;
        this.w = -1;
    }

    public final void a(int v, int v1, int v2, int v3, int v4, int v5) {
        this.q = v3;
        if(this.e == LayoutDirection.Y) {
            v1 = v2 - v1 - this.c;
        }
        this.u = android.support.v4.media.session.a.i(v1, v);
        this.v = v4;
        this.w = v5;
        this.r = -this.f;
        this.s = this.q + this.g;
    }

    @Override  // E.M
    public final int b() {
        return this.h.size();
    }

    @Override  // E.M
    public final int d() {
        return this.n;
    }

    @Override  // E.M
    public final boolean e() {
        return true;
    }

    @Override  // E.M
    public final void f() {
        this.x = true;
    }

    @Override  // E.M
    public final int g() {
        return this.p;
    }

    @Override  // E.M
    public final int getIndex() {
        return this.a;
    }

    @Override  // E.M
    public final Object getKey() {
        return this.b;
    }

    @Override  // E.M
    public final long h(int v) {
        return this.u;
    }

    @Override  // E.M
    public final Object i(int v) {
        return ((V)this.h.get(v)).g();
    }

    @Override  // E.M
    public final int j() {
        return this.m;
    }

    @Override  // E.M
    public final long k() {
        return this.l;
    }

    @Override  // E.M
    public final void l(int v, int v1, int v2, int v3) {
        this.a(v, v1, v2, v3, -1, -1);
    }
}

