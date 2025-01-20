package B;

import Bb.A;
import D0.J;
import D0.L;
import D0.M;
import D0.V;
import F0.O;
import F0.x;
import W5.f;
import a1.a;
import a5.w;
import androidx.compose.ui.unit.IntSize;
import g0.n;

public final class m extends n implements x {
    public float l0;
    public boolean m0;

    public final long A0(long v, boolean z) {
        int v1 = a.j(v);
        int v2 = Math.round(((float)v1) / this.l0);
        if(v2 > 0) {
            long v3 = io.sentry.config.a.d(v1, v2);
            return z && !f.I(v, v3) ? 0L : v3;
        }
        return 0L;
    }

    @Override  // F0.x
    public final int a(O o0, J j0, int v) {
        return v == 0x7FFFFFFF ? j0.N(0x7FFFFFFF) : Math.round(((float)v) * this.l0);
    }

    @Override  // F0.x
    public final int b(O o0, J j0, int v) {
        return v == 0x7FFFFFFF ? j0.b(0x7FFFFFFF) : Math.round(((float)v) / this.l0);
    }

    @Override  // F0.x
    public final L e(M m0, J j0, long v) {
        long v1;
        if(this.m0) {
            v1 = this.x0(v, true);
            if(IntSize.a(v1, 0L)) {
                v1 = this.y0(v, true);
                if(IntSize.a(v1, 0L)) {
                    v1 = this.z0(v, true);
                    if(IntSize.a(v1, 0L)) {
                        v1 = this.A0(v, true);
                        if(IntSize.a(v1, 0L)) {
                            v1 = this.x0(v, false);
                            if(IntSize.a(v1, 0L)) {
                                v1 = this.y0(v, false);
                                if(IntSize.a(v1, 0L)) {
                                    v1 = this.z0(v, false);
                                    if(IntSize.a(v1, 0L)) {
                                        v1 = this.A0(v, false);
                                        if(IntSize.a(v1, 0L)) {
                                            v1 = 0L;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        else {
            v1 = this.y0(v, true);
            if(IntSize.a(v1, 0L)) {
                v1 = this.x0(v, true);
                if(IntSize.a(v1, 0L)) {
                    v1 = this.A0(v, true);
                    if(IntSize.a(v1, 0L)) {
                        v1 = this.z0(v, true);
                        if(IntSize.a(v1, 0L)) {
                            v1 = this.y0(v, false);
                            if(IntSize.a(v1, 0L)) {
                                v1 = this.x0(v, false);
                                if(IntSize.a(v1, 0L)) {
                                    v1 = this.A0(v, false);
                                    if(IntSize.a(v1, 0L)) {
                                        v1 = this.z0(v, false);
                                        if(IntSize.a(v1, 0L)) {
                                            v1 = 0L;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if(!IntSize.a(v1, 0L)) {
            int v2 = (int)(v1 >> 0x20);
            int v3 = (int)(0xFFFFFFFFL & v1);
            if(v2 >= 0 && v3 >= 0) {
                v = f.u(v2, v2, v3, v3);
                goto label_44;
            }
            w.k0(("width(" + v2 + ") and height(" + v3 + ") must be >= 0"));
            throw null;
        }
    label_44:
        V v4 = j0.a(v);
        int v5 = v4.X;
        int v6 = v4.Y;
        l l0 = new l(v4, 0);
        return m0.L(v5, v6, A.X, l0);
    }

    @Override  // F0.x
    public final int f(O o0, J j0, int v) {
        return v == 0x7FFFFFFF ? j0.O(0x7FFFFFFF) : Math.round(((float)v) / this.l0);
    }

    @Override  // F0.x
    public final int g(O o0, J j0, int v) {
        return v == 0x7FFFFFFF ? j0.H(0x7FFFFFFF) : Math.round(((float)v) * this.l0);
    }

    public final long x0(long v, boolean z) {
        int v1 = a.g(v);
        if(v1 != 0x7FFFFFFF) {
            int v2 = Math.round(((float)v1) * this.l0);
            if(v2 > 0) {
                long v3 = io.sentry.config.a.d(v2, v1);
                return z && !f.I(v, v3) ? 0L : v3;
            }
        }
        return 0L;
    }

    public final long y0(long v, boolean z) {
        int v1 = a.h(v);
        if(v1 != 0x7FFFFFFF) {
            int v2 = Math.round(((float)v1) / this.l0);
            if(v2 > 0) {
                long v3 = io.sentry.config.a.d(v1, v2);
                return z && !f.I(v, v3) ? 0L : v3;
            }
        }
        return 0L;
    }

    public final long z0(long v, boolean z) {
        int v1 = a.i(v);
        int v2 = Math.round(((float)v1) * this.l0);
        if(v2 > 0) {
            long v3 = io.sentry.config.a.d(v2, v1);
            return z && !f.I(v, v3) ? 0L : v3;
        }
        return 0L;
    }
}

