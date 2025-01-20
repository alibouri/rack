package u;

import Bb.A;
import Bb.q;
import D0.J;
import D0.K;
import D0.L;
import D0.M;
import D0.V;
import D0.o;
import Sb.c;
import Sb.d;
import androidx.compose.ui.unit.IntSize;
import io.sentry.config.a;
import java.util.List;

public final class f implements K {
    public final k a;

    public f(k k0) {
        this.a = k0;
    }

    @Override  // D0.K
    public final int a(o o0, List list0, int v) {
        if(list0.isEmpty()) {
            return 0;
        }
        Integer integer0 = ((J)list0.get(0)).N(v);
        int v1 = q.y(list0);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                Integer integer1 = ((J)list0.get(v2)).N(v);
                if(integer1.compareTo(integer0) > 0) {
                    integer0 = integer1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return integer0 == null ? 0 : ((int)integer0);
    }

    @Override  // D0.K
    public final L b(M m0, List list0, long v) {
        V v11;
        int v10;
        h h0;
        int v1 = list0.size();
        V[] arr_v = new V[v1];
        int v2 = list0.size();
        long v3 = 0L;
        int v4 = 0;
        for(int v5 = 0; true; ++v5) {
            h0 = null;
            if(v5 >= v2) {
                break;
            }
            J j0 = (J)list0.get(v5);
            Object object0 = j0.g();
            if(object0 instanceof h) {
                h0 = (h)object0;
            }
            if(h0 != null && ((Boolean)h0.X.getValue()).booleanValue()) {
                V v6 = j0.a(v);
                long v7 = a.d(v6.X, v6.Y);
                arr_v[v5] = v6;
                v3 = v7;
            }
        }
        int v8 = list0.size();
        for(int v9 = 0; v9 < v8; ++v9) {
            J j1 = (J)list0.get(v9);
            if(arr_v[v9] == null) {
                arr_v[v9] = j1.a(v);
            }
        }
        if(m0.s()) {
            v10 = (int)(v3 >> 0x20);
        }
        else {
            if(v1 == 0) {
                v11 = null;
            }
            else {
                v11 = arr_v[0];
                if(v1 - 1 != 0) {
                    int v12 = v11 == null ? 0 : v11.X;
                    c c0 = new d(1, v1 - 1, 1).a();  // initializer: LSb/b;-><init>(III)V
                    while(c0.Z) {
                        V v13 = arr_v[c0.a()];
                        int v14 = v13 == null ? 0 : v13.X;
                        if(v12 < v14) {
                            v11 = v13;
                            v12 = v14;
                        }
                    }
                }
            }
            v10 = v11 == null ? 0 : v11.X;
        }
        if(m0.s()) {
            v4 = (int)(0xFFFFFFFFL & v3);
        }
        else {
            if(v1 != 0) {
                h0 = arr_v[0];
                if(v1 - 1 != 0) {
                    int v15 = h0 == null ? 0 : h0.Y;
                    c c1 = new d(1, v1 - 1, 1).a();  // initializer: LSb/b;-><init>(III)V
                    while(c1.Z) {
                        V v16 = arr_v[c1.a()];
                        int v17 = v16 == null ? 0 : v16.Y;
                        if(v15 < v17) {
                            h0 = v16;
                            v15 = v17;
                        }
                    }
                }
            }
            if(h0 != null) {
                v4 = h0.Y;
            }
        }
        if(!m0.s()) {
            this.a.c.setValue(new IntSize(a.d(v10, v4)));
        }
        N.a a0 = new N.a(arr_v, this, v10, v4);
        return m0.L(v10, v4, A.X, a0);
    }

    @Override  // D0.K
    public final int c(o o0, List list0, int v) {
        if(list0.isEmpty()) {
            return 0;
        }
        Integer integer0 = ((J)list0.get(0)).O(v);
        int v1 = q.y(list0);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                Integer integer1 = ((J)list0.get(v2)).O(v);
                if(integer1.compareTo(integer0) > 0) {
                    integer0 = integer1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return integer0 == null ? 0 : ((int)integer0);
    }

    @Override  // D0.K
    public final int d(o o0, List list0, int v) {
        if(list0.isEmpty()) {
            return 0;
        }
        Integer integer0 = ((J)list0.get(0)).H(v);
        int v1 = q.y(list0);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                Integer integer1 = ((J)list0.get(v2)).H(v);
                if(integer1.compareTo(integer0) > 0) {
                    integer0 = integer1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return integer0 == null ? 0 : ((int)integer0);
    }

    @Override  // D0.K
    public final int e(o o0, List list0, int v) {
        if(list0.isEmpty()) {
            return 0;
        }
        Integer integer0 = ((J)list0.get(0)).b(v);
        int v1 = q.y(list0);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                Integer integer1 = ((J)list0.get(v2)).b(v);
                if(integer1.compareTo(integer0) > 0) {
                    integer0 = integer1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return integer0 == null ? 0 : ((int)integer0);
    }
}

