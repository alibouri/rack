package H;

import Bb.q;
import Nb.j;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import m0.d;
import n0.I;
import n0.J;
import n0.K;
import n0.S;
import yc.l;

public final class e implements S {
    public final a X;
    public final a Y;
    public final a Z;
    public final a b0;

    public e(a a0, a a1, a a2, a a3) {
        this.X = a0;
        this.Y = a1;
        this.Z = a2;
        this.b0 = a3;
    }

    public static e a(e e0, c c0, a a0, a a1, int v) {
        if((v & 1) != 0) {
            c0 = e0.X;
        }
        a a2 = e0.Y;
        if((v & 4) != 0) {
            a0 = e0.Z;
        }
        e0.getClass();
        return new e(c0, a2, a0, a1);
    }

    @Override  // n0.S
    public final K d(long v, LayoutDirection layoutDirection0, Density density0) {
        float f = this.X.b(v, density0);
        float f1 = this.Y.b(v, density0);
        float f2 = this.Z.b(v, density0);
        float f3 = this.b0.b(v, density0);
        float f4 = m0.e.c(v);
        float f5 = f + f3;
        if(f5 > f4) {
            float f6 = f4 / f5;
            f *= f6;
            f3 *= f6;
        }
        float f7 = f1 + f2;
        if(f7 > f4) {
            float f8 = f4 / f7;
            f1 *= f8;
            f2 *= f8;
        }
        if(f >= 0.0f || f1 >= 0.0f || f2 >= 0.0f || f3 >= 0.0f) {
            throw new IllegalArgumentException(("Corner size in Px can\'t be negative(topStart = " + f + ", topEnd = " + f1 + ", bottomEnd = " + f2 + ", bottomStart = " + f3 + ")!").toString());
        }
        if(Float.compare(f + f1 + f2 + f3, 0.0f) == 0) {
            return new I(l.g(0L, v));
        }
        m0.c c0 = l.g(0L, v);
        LayoutDirection layoutDirection1 = LayoutDirection.X;
        float f9 = layoutDirection0 == layoutDirection1 ? f : f1;
        long v1 = q.a(f9, f9);
        if(layoutDirection0 == layoutDirection1) {
            f = f1;
        }
        long v2 = q.a(f, f);
        float f10 = layoutDirection0 == layoutDirection1 ? f2 : f3;
        long v3 = q.a(f10, f10);
        if(layoutDirection0 != layoutDirection1) {
            f3 = f2;
        }
        return new J(new d(c0.a, c0.b, c0.c, c0.d, v1, v2, v3, q.a(f3, f3)));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof e)) {
            return false;
        }
        if(!j.a(this.X, ((e)object0).X)) {
            return false;
        }
        if(!j.a(this.Y, ((e)object0).Y)) {
            return false;
        }
        return j.a(this.Z, ((e)object0).Z) ? j.a(this.b0, ((e)object0).b0) : false;
    }

    @Override
    public final int hashCode() {
        return this.b0.hashCode() + (this.Z.hashCode() + (this.Y.hashCode() + this.X.hashCode() * 0x1F) * 0x1F) * 0x1F;
    }

    @Override
    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.X + ", topEnd = " + this.Y + ", bottomEnd = " + this.Z + ", bottomStart = " + this.b0 + ')';
    }
}

