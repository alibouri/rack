package I;

import C3.i;
import O0.O;
import O0.f;
import O0.n;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;

public final class u0 {
    public final f a;
    public final O b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;
    public final Density g;
    public final FontFamily.Resolver h;
    public final List i;
    public i j;
    public LayoutDirection k;

    public u0(f f0, O o0, int v, int v1, boolean z, int v2, Density density0, FontFamily.Resolver fontFamily$Resolver0, List list0) {
        this.a = f0;
        this.b = o0;
        this.c = v;
        this.d = v1;
        this.e = z;
        this.f = v2;
        this.g = density0;
        this.h = fontFamily$Resolver0;
        this.i = list0;
        if(v <= 0) {
            throw new IllegalArgumentException("no maxLines");
        }
        if(v1 <= 0) {
            throw new IllegalArgumentException("no minLines");
        }
        if(v1 > v) {
            throw new IllegalArgumentException("minLines greater than maxLines");
        }
    }

    public final void a(LayoutDirection layoutDirection0) {
        i i0 = this.j;
        if(i0 == null || layoutDirection0 != this.k || i0.b()) {
            this.k = layoutDirection0;
            O o0 = n.h(this.b, layoutDirection0);
            i0 = new i(this.a, o0, this.i, this.g, this.h);
        }
        this.j = i0;
    }
}

