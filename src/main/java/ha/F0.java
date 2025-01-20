package ha;

import C.E;
import C.w;
import Y9.a;
import androidx.compose.ui.unit.Density;
import ia.c;
import ia.l;
import kotlin.jvm.functions.Function0;

public final class f0 implements Function0 {
    public final int X;
    public final E Y;
    public final m0 Z;
    public final Density b0;

    public f0(E e0, m0 m00, Density density0) {
        this.X = 1;
        super();
        this.Y = e0;
        this.Z = m00;
        this.b0 = density0;
    }

    public f0(Density density0, E e0, m0 m00) {
        this.X = 0;
        super();
        this.b0 = density0;
        this.Y = e0;
        this.Z = m00;
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.X != 0) {
            E e0 = this.Y;
            if(e0.d.b.k() <= 0) {
                Density density0 = this.b0;
                w w0 = e0.d;
                if(this.Z.m != null) {
                    return w0.c.k() <= density0.I(a.a + c.a) ? Boolean.valueOf(false) : Boolean.valueOf(true);
                }
                return w0.c.k() > density0.I(l0.b - l.a) ? Boolean.valueOf(true) : Boolean.valueOf(false);
            }
            return Boolean.valueOf(true);
        }
        int v = this.Z.m == null ? this.b0.I(l0.b - l.a) : this.b0.I(c.a + a.a);
        E e1 = this.Y;
        if(e1.d.b.k() == 0) {
            int v1 = e1.d.c.k();
            if(v1 <= v) {
                v = v1;
            }
        }
        return v;
    }
}

