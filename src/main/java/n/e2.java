package N;

import B.q0;
import Bb.A;
import D0.J;
import D0.K;
import D0.L;
import D0.M;
import D0.c;
import D0.o;
import Nb.j;
import W5.f;
import a1.a;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function2;

public final class e2 implements K {
    public final boolean a;
    public final float b;
    public final q0 c;

    public e2(boolean z, float f, q0 q00) {
        this.a = z;
        this.b = f;
        this.c = q00;
    }

    @Override  // D0.K
    public final int a(o o0, List list0, int v) {
        return e2.g(list0, v, V.h0);
    }

    @Override  // D0.K
    public final L b(M m0, List list0, long v) {
        Object object6;
        int v17;
        Object object4;
        Object object2;
        Object object0;
        e2 e20 = this;
        List list1 = list0;
        int v1 = m0.I(e20.c.c());
        int v2 = m0.I(e20.c.a());
        int v3 = m0.I(c2.a);
        long v4 = a.a(v, 0, 0, 0, 0, 10);
        int v5 = list0.size();
        for(int v6 = 0; true; ++v6) {
            object0 = null;
            if(v6 >= v5) {
                break;
            }
            Object object1 = list1.get(v6);
            if(j.a(androidx.compose.ui.layout.a.a(((J)object1)), "Leading")) {
                object0 = object1;
                break;
            }
        }
        D0.V v7 = ((J)object0) == null ? null : ((J)object0).a(v4);
        int v8 = Z1.e(v7);
        int v9 = list0.size();
        for(int v10 = 0; true; ++v10) {
            object2 = null;
            if(v10 >= v9) {
                break;
            }
            Object object3 = list1.get(v10);
            if(j.a(androidx.compose.ui.layout.a.a(((J)object3)), "Trailing")) {
                object2 = object3;
                break;
            }
        }
        D0.V v11 = ((J)object2) == null ? null : ((J)object2).a(f.K(-v8, v4, 0));
        int v12 = -(Z1.e(v11) + v8);
        long v13 = f.K(v12, v4, -v2);
        int v14 = list0.size();
        int v15 = 0;
        while(true) {
            object4 = null;
            if(v15 >= v14) {
                break;
            }
            Object object5 = list1.get(v15);
            if(j.a(androidx.compose.ui.layout.a.a(((J)object5)), "Label")) {
                object4 = object5;
                break;
            }
            ++v15;
            v14 = v14;
        }
        D0.V v16 = ((J)object4) == null ? null : ((J)object4).a(v13);
        if(v16 == null) {
            v17 = 0;
        }
        else {
            v17 = v16.Q(c.b);
            if(v17 == 0x80000000) {
                v17 = v16.Y;
            }
        }
        int v18 = Math.max(v17, v1);
        long v19 = f.K(v12, a.a(v, 0, 0, 0, 0, 11), (v16 == null ? -v1 - v2 : -v2 - v3 - v18));
        int v20 = list0.size();
        int v21 = 0;
        while(v21 < v20) {
            J j0 = (J)list1.get(v21);
            if(j.a(androidx.compose.ui.layout.a.a(j0), "TextField")) {
                D0.V v22 = j0.a(v19);
                long v23 = a.a(v19, 0, 0, 0, 0, 14);
                int v24 = list0.size();
                int v25 = 0;
                while(true) {
                    object6 = null;
                    if(v25 >= v24) {
                        break;
                    }
                    Object object7 = list1.get(v25);
                    if(j.a(androidx.compose.ui.layout.a.a(((J)object7)), "Hint")) {
                        object6 = object7;
                        break;
                    }
                    ++v25;
                    list1 = list0;
                }
                D0.V v26 = ((J)object6) == null ? null : ((J)object6).a(v23);
                int v27 = Math.max(Math.max(v22.X, Math.max(Z1.e(v16), Z1.e(v26))) + Z1.e(v7) + Z1.e(v11), a.j(v));
                int v28 = c2.b(v22.Y, v16 != null, v18, Z1.d(v7), Z1.d(v11), Z1.d(v26), v, m0.getDensity(), e20.c);
                d2 d20 = new d2(v16, v1, v17, v27, v28, v22, v26, v7, v11, this, v18, v3, m0);
                return m0.L(v27, v28, A.X, d20);
            }
            ++v21;
            e20 = this;
            list1 = list0;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override  // D0.K
    public final int c(o o0, List list0, int v) {
        return this.f(o0, list0, v, V.i0);
    }

    @Override  // D0.K
    public final int d(o o0, List list0, int v) {
        return e2.g(list0, v, V.j0);
    }

    @Override  // D0.K
    public final int e(o o0, List list0, int v) {
        return this.f(o0, list0, v, V.g0);
    }

    public final int f(o o0, List list0, int v, Function2 function20) {
        Object object5;
        int v8;
        Object object3;
        int v4;
        int v3;
        Object object1;
        Object object0;
        int v1 = list0.size();
        boolean z = false;
        for(int v2 = 0; true; ++v2) {
            object0 = null;
            object1 = null;
            if(v2 >= v1) {
                break;
            }
            Object object2 = list0.get(v2);
            if(j.a(Z1.c(((J)object2)), "Leading")) {
                object0 = object2;
                break;
            }
        }
        if(((J)object0) == null) {
            v3 = v;
            v4 = 0;
        }
        else {
            v3 = v == 0x7FFFFFFF ? 0x7FFFFFFF : v - ((J)object0).N(0x7FFFFFFF);
            v4 = ((Number)function20.j(((J)object0), v)).intValue();
        }
        int v5 = list0.size();
        for(int v6 = 0; true; ++v6) {
            object3 = null;
            if(v6 >= v5) {
                break;
            }
            Object object4 = list0.get(v6);
            if(j.a(Z1.c(((J)object4)), "Trailing")) {
                object3 = object4;
                break;
            }
        }
        if(((J)object3) == null) {
            v8 = 0;
        }
        else {
            int v7 = ((J)object3).N(0x7FFFFFFF);
            if(v3 != 0x7FFFFFFF) {
                v3 -= v7;
            }
            v8 = ((Number)function20.j(((J)object3), v)).intValue();
        }
        int v9 = list0.size();
        for(int v10 = 0; true; ++v10) {
            object5 = null;
            if(v10 >= v9) {
                break;
            }
            Object object6 = list0.get(v10);
            if(j.a(Z1.c(((J)object6)), "Label")) {
                object5 = object6;
                break;
            }
        }
        int v11 = ((J)object5) == null ? 0 : ((Number)function20.j(((J)object5), v3)).intValue();
        int v12 = list0.size();
        for(int v13 = 0; v13 < v12; ++v13) {
            Object object7 = list0.get(v13);
            if(j.a(Z1.c(((J)object7)), "TextField")) {
                int v14 = ((Number)function20.j(object7, v3)).intValue();
                int v15 = list0.size();
                for(int v16 = 0; v16 < v15; ++v16) {
                    Object object8 = list0.get(v16);
                    if(j.a(Z1.c(((J)object8)), "Hint")) {
                        object1 = object8;
                        break;
                    }
                }
                int v17 = ((J)object1) == null ? 0 : ((Number)function20.j(((J)object1), v3)).intValue();
                if(v11 > 0) {
                    z = true;
                }
                float f = o0.getDensity();
                return c2.b(v14, z, v11, v4, v8, v17, Z1.a, f, this.c);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static int g(List list0, int v, Function2 function20) {
        Object object6;
        Object object4;
        Object object2;
        Object object1;
        int v1 = list0.size();
        int v2 = 0;
        for(int v3 = 0; v3 < v1; ++v3) {
            Object object0 = list0.get(v3);
            if(j.a(Z1.c(((J)object0)), "TextField")) {
                int v4 = ((Number)function20.j(object0, v)).intValue();
                int v5 = list0.size();
                for(int v6 = 0; true; ++v6) {
                    object1 = null;
                    object2 = null;
                    if(v6 >= v5) {
                        break;
                    }
                    Object object3 = list0.get(v6);
                    if(j.a(Z1.c(((J)object3)), "Label")) {
                        object1 = object3;
                        break;
                    }
                }
                int v7 = ((J)object1) == null ? 0 : ((Number)function20.j(((J)object1), v)).intValue();
                int v8 = list0.size();
                for(int v9 = 0; true; ++v9) {
                    object4 = null;
                    if(v9 >= v8) {
                        break;
                    }
                    Object object5 = list0.get(v9);
                    if(j.a(Z1.c(((J)object5)), "Trailing")) {
                        object4 = object5;
                        break;
                    }
                }
                int v10 = ((J)object4) == null ? 0 : ((Number)function20.j(((J)object4), v)).intValue();
                int v11 = list0.size();
                for(int v12 = 0; true; ++v12) {
                    object6 = null;
                    if(v12 >= v11) {
                        break;
                    }
                    Object object7 = list0.get(v12);
                    if(j.a(Z1.c(((J)object7)), "Leading")) {
                        object6 = object7;
                        break;
                    }
                }
                int v13 = ((J)object6) == null ? 0 : ((Number)function20.j(((J)object6), v)).intValue();
                int v14 = list0.size();
                for(int v15 = 0; v15 < v14; ++v15) {
                    Object object8 = list0.get(v15);
                    if(j.a(Z1.c(((J)object8)), "Hint")) {
                        object2 = object8;
                        break;
                    }
                }
                if(((J)object2) != null) {
                    v2 = ((Number)function20.j(((J)object2), v)).intValue();
                }
                return Math.max(Math.max(v4, Math.max(v7, v2)) + v13 + v10, 0);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}

