package B;

import Bb.A;
import D0.J;
import D0.K;
import D0.L;
import D0.M;
import D0.V;
import D0.o;
import Nb.j;
import a1.a;
import androidx.compose.ui.unit.LayoutDirection;
import g0.f;
import java.io.Serializable;
import java.util.List;

public final class x0 implements t0, K {
    public final g a;
    public final f b;

    public x0(g g0, f f0) {
        this.a = g0;
        this.b = f0;
    }

    @Override  // D0.K
    public final int a(o o0, List list0, int v) {
        int v1 = o0.I(this.a.a());
        if(!list0.isEmpty()) {
            int v3 = list0.size();
            int v4 = 0;
            int v5 = 0;
            float f = 0.0f;
            for(int v2 = 0; v2 < v3; ++v2) {
                J j0 = (J)list0.get(v2);
                float f1 = e.h(e.g(j0));
                int v6 = j0.N(v);
                if(f1 == 0.0f) {
                    v5 += v6;
                }
                else if(f1 > 0.0f) {
                    f += f1;
                    v4 = Math.max(v4, Math.round(((float)v6) / f1));
                }
            }
            return (list0.size() - 1) * v1 + (Math.round(((float)v4) * f) + v5);
        }
        return 0;
    }

    @Override  // D0.K
    public final L b(M m0, List list0, long v) {
        return e.i(this, a.j(v), a.i(v), a.h(v), a.g(v), m0.I(this.a.a()), m0, list0, new V[list0.size()], 0, list0.size(), null, 0);
    }

    @Override  // D0.K
    public final int c(o o0, List list0, int v) {
        int v8;
        int v1 = o0.I(this.a.a());
        if(!list0.isEmpty()) {
            int v3 = Math.min((list0.size() - 1) * v1, v);
            int v4 = list0.size();
            int v6 = 0;
            float f = 0.0f;
            for(int v5 = 0; v5 < v4; ++v5) {
                J j0 = (J)list0.get(v5);
                float f1 = e.h(e.g(j0));
                if(f1 == 0.0f) {
                    int v7 = Math.min(j0.N(0x7FFFFFFF), (v == 0x7FFFFFFF ? 0x7FFFFFFF : v - v3));
                    v3 += v7;
                    v6 = Math.max(v6, j0.O(v7));
                }
                else if(f1 > 0.0f) {
                    f += f1;
                }
            }
            if(f == 0.0f) {
                v8 = 0;
            }
            else {
                v8 = v == 0x7FFFFFFF ? 0x7FFFFFFF : Math.round(((float)Math.max(v - v3, 0)) / f);
            }
            int v9 = list0.size();
            for(int v2 = 0; v2 < v9; ++v2) {
                J j1 = (J)list0.get(v2);
                float f2 = e.h(e.g(j1));
                if(f2 > 0.0f) {
                    v6 = Math.max(v6, j1.O((v8 == 0x7FFFFFFF ? 0x7FFFFFFF : Math.round(((float)v8) * f2))));
                }
            }
            return v6;
        }
        return 0;
    }

    @Override  // D0.K
    public final int d(o o0, List list0, int v) {
        int v1 = o0.I(this.a.a());
        if(!list0.isEmpty()) {
            int v3 = list0.size();
            int v4 = 0;
            int v5 = 0;
            float f = 0.0f;
            for(int v2 = 0; v2 < v3; ++v2) {
                J j0 = (J)list0.get(v2);
                float f1 = e.h(e.g(j0));
                int v6 = j0.H(v);
                if(f1 == 0.0f) {
                    v5 += v6;
                }
                else if(f1 > 0.0f) {
                    f += f1;
                    v4 = Math.max(v4, Math.round(((float)v6) / f1));
                }
            }
            return (list0.size() - 1) * v1 + (Math.round(((float)v4) * f) + v5);
        }
        return 0;
    }

    @Override  // D0.K
    public final int e(o o0, List list0, int v) {
        int v8;
        int v1 = o0.I(this.a.a());
        if(!list0.isEmpty()) {
            int v3 = Math.min((list0.size() - 1) * v1, v);
            int v4 = list0.size();
            int v6 = 0;
            float f = 0.0f;
            for(int v5 = 0; v5 < v4; ++v5) {
                J j0 = (J)list0.get(v5);
                float f1 = e.h(e.g(j0));
                if(f1 == 0.0f) {
                    int v7 = Math.min(j0.N(0x7FFFFFFF), (v == 0x7FFFFFFF ? 0x7FFFFFFF : v - v3));
                    v3 += v7;
                    v6 = Math.max(v6, j0.b(v7));
                }
                else if(f1 > 0.0f) {
                    f += f1;
                }
            }
            if(f == 0.0f) {
                v8 = 0;
            }
            else {
                v8 = v == 0x7FFFFFFF ? 0x7FFFFFFF : Math.round(((float)Math.max(v - v3, 0)) / f);
            }
            int v9 = list0.size();
            for(int v2 = 0; v2 < v9; ++v2) {
                J j1 = (J)list0.get(v2);
                float f2 = e.h(e.g(j1));
                if(f2 > 0.0f) {
                    v6 = Math.max(v6, j1.b((v8 == 0x7FFFFFFF ? 0x7FFFFFFF : Math.round(((float)v8) * f2))));
                }
            }
            return v6;
        }
        return 0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof x0)) {
            return false;
        }
        return j.a(this.a, ((x0)object0).a) ? j.a(this.b, ((x0)object0).b) : false;
    }

    @Override  // B.t0
    public final L f(V[] arr_v, M m0, int[] arr_v1, int v, int v1, int[] arr_v2, int v2, int v3, int v4) {
        w0 w00 = new w0(arr_v, this, v1, ((Serializable)arr_v1), 0);
        return m0.L(v, v1, A.X, w00);
    }

    @Override  // B.t0
    public final void g(int v, int[] arr_v, int[] arr_v1, M m0) {
        LayoutDirection layoutDirection0 = m0.getLayoutDirection();
        this.a.c(m0, v, arr_v, layoutDirection0, arr_v1);
    }

    @Override  // B.t0
    public final long h(int v, int v1, int v2, boolean z) {
        return v0.a(v, v1, v2, z);
    }

    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.b.a) + this.a.hashCode() * 0x1F;
    }

    @Override  // B.t0
    public final int i(V v0) {
        return v0.Y;
    }

    @Override  // B.t0
    public final int j(V v0) {
        return v0.X;
    }

    @Override
    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.a + ", verticalAlignment=" + this.b + ')';
    }
}

