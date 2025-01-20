package y;

import Ab.t;
import Eb.a;
import Fb.c;
import W5.f;
import androidx.compose.ui.unit.Density;
import hc.d;

public final class t0 implements Density {
    public final Density X;
    public boolean Y;
    public boolean Z;
    public final d b0;

    public t0(Density density0) {
        this.X = density0;
        this.b0 = new d(false);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float E(long v) {
        return this.X.E(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final int I(float f) {
        return this.X.I(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final long P(long v) {
        return this.X.P(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float T(long v) {
        return this.X.T(v);
    }

    public final Object a(c c0) {
        t0 t00;
        r0 r00;
        if(c0 instanceof r0) {
            r00 = (r0)c0;
            int v = r00.e0;
            if((v & 0x80000000) == 0) {
                r00 = new r0(this, c0);
            }
            else {
                r00.e0 = v ^ 0x80000000;
            }
        }
        else {
            r00 = new r0(this, c0);
        }
        Object object0 = r00.c0;
        Object object1 = a.X;
        switch(r00.e0) {
            case 0: {
                f.b0(object0);
                r00.b0 = this;
                r00.e0 = 1;
                if(this.b0.d(null, r00) == object1) {
                    return object1;
                }
                t00 = this;
                break;
            }
            case 1: {
                t00 = r00.b0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        t00.Y = false;
        t00.Z = false;
        return t.a;
    }

    public final Object b(c c0) {
        t0 t00;
        s0 s00;
        if(c0 instanceof s0) {
            s00 = (s0)c0;
            int v = s00.e0;
            if((v & 0x80000000) == 0) {
                s00 = new s0(this, c0);
            }
            else {
                s00.e0 = v ^ 0x80000000;
            }
        }
        else {
            s00 = new s0(this, c0);
        }
        Object object0 = s00.c0;
        Object object1 = a.X;
        switch(s00.e0) {
            case 0: {
                f.b0(object0);
                if(!this.Y && !this.Z) {
                    s00.b0 = this;
                    s00.e0 = 1;
                    if(this.b0.d(null, s00) == object1) {
                        return object1;
                    }
                    t00 = this;
                    break;
                }
                return Boolean.valueOf(this.Y);
            }
            case 1: {
                t00 = s00.b0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        t00.b0.f(null);
        return Boolean.valueOf(t00.Y);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final long d0(float f) {
        return this.X.d0(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.X.getDensity();
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float i0(int v) {
        return this.X.i0(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float j0(float f) {
        return this.X.j0(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float n() {
        return this.X.n();
    }

    @Override  // androidx.compose.ui.unit.Density
    public final long u(float f) {
        return this.X.u(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final long v(long v) {
        return this.X.v(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float w(float f) {
        return this.X.w(f);
    }
}

