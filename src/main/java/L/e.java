package L;

import Bb.z;
import I.f0;
import Nb.j;
import O0.O;
import O0.a;
import O0.n;
import O0.w;
import W0.c;
import W5.f;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

public final class e {
    public String a;
    public O b;
    public FontFamily.Resolver c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public long h;
    public Density i;
    public a j;
    public boolean k;
    public long l;
    public b m;
    public w n;
    public LayoutDirection o;
    public long p;
    public int q;
    public int r;

    public e(String s, O o0, FontFamily.Resolver fontFamily$Resolver0, int v, boolean z, int v1, int v2) {
        this.a = s;
        this.b = o0;
        this.c = fontFamily$Resolver0;
        this.d = v;
        this.e = z;
        this.f = v1;
        this.g = v2;
        this.h = L.a.a;
        this.l = io.sentry.config.a.d(0, 0);
        this.p = f.u(0, 0, 0, 0);
        this.q = -1;
        this.r = -1;
    }

    public final int a(int v, LayoutDirection layoutDirection0) {
        int v1 = this.r;
        if(v == this.q && this.q != -1) {
            return v1;
        }
        int v2 = f0.p(this.b(f.b(0, v, 0, 0x7FFFFFFF), layoutDirection0).b());
        this.q = v;
        this.r = v2;
        return v2;
    }

    public final a b(long v, LayoutDirection layoutDirection0) {
        w w0 = this.d(layoutDirection0);
        long v1 = W4.f.w(v, this.e, this.d, w0.d());
        int v2 = this.f;
        if(!this.e && this.d == 2) {
            return new a(((c)w0), 1, this.d == 2, v1);
        }
        if(v2 < 1) {
            v2 = 1;
        }
        return new a(((c)w0), v2, this.d == 2, v1);
    }

    public final void c(Density density0) {
        Density density1 = this.i;
        long v = density0 == null ? L.a.a : L.a.a(density0.getDensity(), density0.n());
        if(density1 == null) {
            this.i = density0;
            this.h = v;
            return;
        }
        if(density0 == null || this.h != v) {
            this.i = density0;
            this.h = v;
            this.j = null;
            this.n = null;
            this.o = null;
            this.q = -1;
            this.r = -1;
            this.p = f.u(0, 0, 0, 0);
            this.l = io.sentry.config.a.d(0, 0);
            this.k = false;
        }
    }

    public final w d(LayoutDirection layoutDirection0) {
        w w0 = this.n;
        if(w0 == null || layoutDirection0 != this.o || w0.b()) {
            this.o = layoutDirection0;
            String s = this.a;
            O o0 = n.h(this.b, layoutDirection0);
            Density density0 = this.i;
            j.c(density0);
            w0 = new c(s, o0, z.X, z.X, this.c, density0);
        }
        this.n = w0;
        return w0;
    }

    @Override
    public final String toString() {
        return "ParagraphLayoutCache(paragraph=" + (this.j == null ? "null" : "<paragraph>") + ", lastDensity=" + ("InlineDensity(density=" + Float.intBitsToFloat(((int)(this.h >> 0x20))) + ", fontScale=" + Float.intBitsToFloat(((int)(this.h & 0xFFFFFFFFL))) + ')') + ')';
    }
}

