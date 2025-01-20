package F0;

import D.j;
import D0.H;
import D0.L;
import D0.M;
import D0.V;
import D0.n;
import M6.b;
import Y8.o;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import s.x;

public abstract class O extends V implements M, U {
    public boolean d0;
    public boolean e0;
    public boolean f0;
    public final H g0;
    public x h0;
    public x i0;

    public O() {
        this.g0 = new H(0, this);
    }

    @Override  // F0.U
    public final void B(boolean z) {
        this.d0 = z;
    }

    @Override  // androidx.compose.ui.unit.Density
    public final int D(long v) {
        return Math.round(this.T(v));
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float E(long v) {
        return o.f(v, this);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final int I(float f) {
        return o.e(f, this);
    }

    @Override  // D0.M
    public final L L(int v, int v1, Map map0, Function1 function10) {
        if((v & 0xFF000000) == 0 && (0xFF000000 & v1) == 0) {
            return new F0.M(v, v1, map0, function10, this);
        }
        b.T(("Size(" + v + " x " + v1 + ") is out of range. Each dimension must be between 0 and 16777215."));
        throw null;
    }

    @Override  // androidx.compose.ui.unit.Density
    public final long P(long v) {
        return o.i(v, this);
    }

    @Override  // D0.V
    public final int Q(n n0) {
        if(!this.n0()) {
            return 0x80000000;
        }
        int v = this.f0(n0);
        return v == 0x80000000 ? 0x80000000 : v + ((int)(this.c0 & 0xFFFFFFFFL));
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float T(long v) {
        return o.h(v, this);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final long d0(float f) {
        return this.u(this.j0(f));
    }

    public abstract int f0(n arg1);

    public final void h0(l0 l00) {
        if(this.f0) {
            return;
        }
        if(l00.X.o() != null) {
            x x0 = this.i0;
            if(x0 == null) {
                x0 = new x();
                this.i0 = x0;
            }
            x x1 = this.h0;
            if(x1 == null) {
                x1 = new x();
                this.h0 = x1;
            }
            Object[] arr_object = x1.b;
            float[] arr_f = x1.c;
            long[] arr_v = x1.a;
            int v = arr_v.length - 2;
            if(v >= 0) {
                int v1 = 0;
                while(true) {
                    long v2 = arr_v[v1];
                    if((~v2 << 7 & v2 & 0x8080808080808080L) == 0x8080808080808080L) {
                        goto label_29;
                    }
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((v2 & 0xFFL) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            x0.e(arr_object[v5], arr_f[v5]);
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                    label_29:
                        if(v1 != v) {
                            ++v1;
                            continue;
                        }
                    }
                    goto label_32;
                }
            }
            else {
            label_32:
                x1.a();
                AndroidComposeView androidComposeView0 = this.o0().g0;
                if(androidComposeView0 != null) {
                    OwnerSnapshotObserver ownerSnapshotObserver0 = androidComposeView0.getSnapshotObserver();
                    if(ownerSnapshotObserver0 != null) {
                        j j0 = new j(l00, 5, this);
                        ownerSnapshotObserver0.a(l00, e.Z, j0);
                    }
                }
            }
            Object[] arr_object1 = x1.b;
            long[] arr_v1 = x1.a;
            int v6 = arr_v1.length - 2;
            if(v6 >= 0) {
                for(int v7 = 0; true; ++v7) {
                    long v8 = arr_v1[v7];
                    if((~v8 << 7 & v8 & 0x8080808080808080L) != 0x8080808080808080L) {
                        int v9 = 8 - (~(v7 - v6) >>> 0x1F);
                        for(int v10 = 0; v10 < v9; ++v10) {
                            if((v8 & 0xFFL) < 0x80L) {
                                if(arr_object1[(v7 << 3) + v10] != null) {
                                    throw new ClassCastException();
                                }
                                if(x0.c(null) < 0) {
                                    O o0 = this.q0();
                                    if(o0 != null) {
                                        for(O o1 = o0; o1.h0 == null || o1.h0.c(null) < 0; o1 = o2) {
                                            O o2 = o1.q0();
                                            if(o2 == null) {
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            v8 >>= 8;
                        }
                        if(v9 != 8) {
                            x0.a();
                            return;
                        }
                    }
                    if(v7 == v6) {
                        break;
                    }
                }
                x0.a();
                return;
            }
            x0.a();
        }
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float i0(int v) {
        return ((float)v) / this.getDensity();
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float j0(float f) {
        return f / this.getDensity();
    }

    public abstract O l0();

    public abstract LayoutCoordinates m0();

    public abstract boolean n0();

    public abstract LayoutNode o0();

    public abstract L p0();

    public abstract O q0();

    public abstract long r0();

    @Override  // D0.o
    public boolean s() {
        return false;
    }

    public static void s0(c0 c00) {
        LayoutNode layoutNode0 = c00.j0;
        if(!Nb.j.a((c00.k0 == null ? null : c00.k0.j0), layoutNode0)) {
            layoutNode0.v0.r.s0.f();
            return;
        }
        a a0 = layoutNode0.v0.r.k();
        if(a0 != null) {
            F f0 = ((J)a0).s0;
            if(f0 != null) {
                f0.f();
            }
        }
    }

    public abstract void t0();

    @Override  // androidx.compose.ui.unit.Density
    public final long u(float f) {
        return o.j(f, this);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final long v(long v) {
        return o.g(v, this);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float w(float f) {
        return this.getDensity() * f;
    }
}

