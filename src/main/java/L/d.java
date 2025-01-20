package L;

import Bb.z;
import C3.i;
import I.f0;
import Nb.j;
import O0.K;
import O0.L;
import O0.O;
import O0.f;
import O0.n;
import O0.s;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;

public final class d {
    public f a;
    public O b;
    public FontFamily.Resolver c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public List h;
    public b i;
    public long j;
    public Density k;
    public i l;
    public LayoutDirection m;
    public L n;
    public int o;
    public int p;

    public d(f f0, O o0, FontFamily.Resolver fontFamily$Resolver0, int v, boolean z, int v1, int v2, List list0) {
        this.a = f0;
        this.b = o0;
        this.c = fontFamily$Resolver0;
        this.d = v;
        this.e = z;
        this.f = v1;
        this.g = v2;
        this.h = list0;
        this.j = a.a;
        this.o = -1;
        this.p = -1;
    }

    public final int a(int v, LayoutDirection layoutDirection0) {
        int v1 = this.p;
        if(v == this.o && this.o != -1) {
            return v1;
        }
        int v2 = f0.p(this.b(W5.f.b(0, v, 0, 0x7FFFFFFF), layoutDirection0).e);
        this.o = v;
        this.p = v2;
        return v2;
    }

    public final s b(long v, LayoutDirection layoutDirection0) {
        i i0 = this.d(layoutDirection0);
        long v1 = W4.f.w(v, this.e, this.d, i0.d());
        int v2 = this.f;
        int v3 = 1;
        if(this.e || this.d != 2) {
            if(v2 < 1) {
                v2 = 1;
            }
            v3 = v2;
        }
        return new s(i0, v1, v3, this.d == 2);
    }

    public final void c(Density density0) {
        Density density1 = this.k;
        long v = density0 == null ? a.a : a.a(density0.getDensity(), density0.n());
        if(density1 == null) {
            this.k = density0;
            this.j = v;
            return;
        }
        if(density0 == null || this.j != v) {
            this.k = density0;
            this.j = v;
            this.l = null;
            this.n = null;
            this.p = -1;
            this.o = -1;
        }
    }

    public final i d(LayoutDirection layoutDirection0) {
        i i0 = this.l;
        if(i0 == null || layoutDirection0 != this.m || i0.b()) {
            this.m = layoutDirection0;
            f f0 = this.a;
            O o0 = n.h(this.b, layoutDirection0);
            Density density0 = this.k;
            j.c(density0);
            FontFamily.Resolver fontFamily$Resolver0 = this.c;
            List list0 = this.h;
            if(list0 == null) {
                list0 = z.X;
            }
            i0 = new i(f0, o0, list0, density0, fontFamily$Resolver0);
        }
        this.l = i0;
        return i0;
    }

    public final L e(LayoutDirection layoutDirection0, long v, s s0) {
        float f = Math.min(s0.a.d(), s0.d);
        f f1 = this.a;
        O o0 = this.b;
        List list0 = this.h;
        if(list0 == null) {
            list0 = z.X;
        }
        int v1 = this.f;
        boolean z = this.e;
        int v2 = this.d;
        Density density0 = this.k;
        j.c(density0);
        new K(f1, o0, list0, v1, z, v2, density0, layoutDirection0, this.c, v);
        return new L(null, s0, W5.f.q(v, io.sentry.config.a.d(f0.p(f), f0.p(s0.e))));
    }
}

