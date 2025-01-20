package B;

import Nb.j;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

public final class f0 implements q0 {
    public final F0 a;
    public final Density b;

    public f0(F0 f00, Density density0) {
        this.a = f00;
        this.b = density0;
    }

    @Override  // B.q0
    public final float a() {
        int v = this.a.b(this.b);
        return this.b.i0(v);
    }

    @Override  // B.q0
    public final float b(LayoutDirection layoutDirection0) {
        int v = this.a.d(this.b, layoutDirection0);
        return this.b.i0(v);
    }

    @Override  // B.q0
    public final float c() {
        int v = this.a.a(this.b);
        return this.b.i0(v);
    }

    @Override  // B.q0
    public final float d(LayoutDirection layoutDirection0) {
        int v = this.a.c(this.b, layoutDirection0);
        return this.b.i0(v);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof f0 ? j.a(this.a, ((f0)object0).a) && j.a(this.b, ((f0)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.a + ", density=" + this.b + ')';
    }
}

