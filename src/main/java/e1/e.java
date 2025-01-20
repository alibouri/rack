package e1;

import B.l;
import Bb.A;
import Bb.q;
import D0.J;
import D0.K;
import D0.L;
import D0.M;
import D0.V;
import D0.X;
import D0.o;
import a1.a;
import java.util.ArrayList;
import java.util.List;

public final class e implements K {
    public final int a;
    public static final e b;
    public static final e c;

    static {
        e.b = new e(0);
        e.c = new e(1);
    }

    public e(int v) {
        this.a = v;
        super();
    }

    @Override  // D0.K
    public final int a(o o0, List list0, int v) {
        return A3.e.e(this, o0, list0, v);
    }

    @Override  // D0.K
    public final L b(M m0, List list0, long v) {
        Object object1;
        if(this.a != 0) {
            A a0 = A.X;
            switch(list0.size()) {
                case 0: {
                    return m0.L(0, 0, a0, c.d0);
                }
                case 1: {
                    V v8 = ((J)list0.get(0)).a(v);
                    return m0.L(v8.X, v8.Y, a0, new l(v8, 9));
                }
                default: {
                    ArrayList arrayList0 = new ArrayList(list0.size());
                    int v2 = list0.size();
                    for(int v3 = 0; v3 < v2; ++v3) {
                        arrayList0.add(((J)list0.get(v3)).a(v));
                    }
                    int v4 = q.y(arrayList0);
                    if(v4 >= 0) {
                        int v5 = 0;
                        int v6 = 0;
                        for(int v1 = 0; true; ++v1) {
                            V v7 = (V)arrayList0.get(v1);
                            v5 = Math.max(v5, v7.X);
                            v6 = Math.max(v6, v7.Y);
                            if(v1 == v4) {
                                break;
                            }
                        }
                        return m0.L(v5, v6, a0, new X(4, arrayList0));
                    }
                    return m0.L(0, 0, a0, new X(4, arrayList0));
                }
            }
        }
        ArrayList arrayList1 = new ArrayList(list0.size());
        int v9 = list0.size();
        for(int v10 = 0; v10 < v9; ++v10) {
            arrayList1.add(((J)list0.get(v10)).a(v));
        }
        Object object0 = null;
        if(arrayList1.isEmpty()) {
            object1 = null;
        }
        else {
            object1 = arrayList1.get(0);
            int v12 = ((V)object1).X;
            int v13 = q.y(arrayList1);
            if(1 <= v13) {
                for(int v14 = 1; true; ++v14) {
                    Object object2 = arrayList1.get(v14);
                    int v15 = ((V)object2).X;
                    if(v12 < v15) {
                        object1 = object2;
                        v12 = v15;
                    }
                    if(v14 == v13) {
                        break;
                    }
                }
            }
        }
        int v16 = ((V)object1) == null ? a.j(v) : ((V)object1).X;
        if(!arrayList1.isEmpty()) {
            Object object3 = arrayList1.get(0);
            int v17 = ((V)object3).Y;
            int v18 = q.y(arrayList1);
            if(1 <= v18) {
                for(int v11 = 1; true; ++v11) {
                    Object object4 = arrayList1.get(v11);
                    int v19 = ((V)object4).Y;
                    if(v17 < v19) {
                        object3 = object4;
                        v17 = v19;
                    }
                    if(v11 == v18) {
                        break;
                    }
                }
            }
            object0 = object3;
        }
        int v20 = ((V)object0) == null ? a.i(v) : ((V)object0).Y;
        X x0 = new X(3, arrayList1);
        return m0.L(v16, v20, A.X, x0);
    }

    @Override  // D0.K
    public final int c(o o0, List list0, int v) {
        return A3.e.h(this, o0, list0, v);
    }

    @Override  // D0.K
    public final int d(o o0, List list0, int v) {
        return A3.e.k(this, o0, list0, v);
    }

    @Override  // D0.K
    public final int e(o o0, List list0, int v) {
        return A3.e.b(this, o0, list0, v);
    }
}

