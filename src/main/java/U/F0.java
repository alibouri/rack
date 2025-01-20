package U;

import Ab.o;
import D0.a0;
import W4.f;
import java.util.ArrayList;
import s.s;

public final class f0 {
    public final ArrayList a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final s e;
    public final o f;

    public f0(int v, ArrayList arrayList0) {
        this.a = arrayList0;
        this.b = v;
        if(v >= 0) {
            this.d = new ArrayList();
            s s0 = new s();
            int v2 = arrayList0.size();
            int v3 = 0;
            for(int v1 = 0; v1 < v2; ++v1) {
                N n0 = (N)this.a.get(v1);
                I i0 = new I(v1, v3, n0.d);
                s0.i(n0.c, i0);
                v3 += n0.d;
            }
            this.e = s0;
            this.f = f.A(new a0(27, this));
            return;
        }
        d.M("Invalid start index");
        throw null;
    }

    public final boolean a(int v, int v1) {
        s s0 = this.e;
        I i0 = (I)s0.f(v);
        if(i0 != null) {
            int v2 = i0.b;
            int v3 = v1 - i0.c;
            i0.c = v1;
            if(v3 != 0) {
                Object[] arr_object = s0.c;
                long[] arr_v = s0.a;
                int v4 = arr_v.length - 2;
                if(v4 >= 0) {
                    int v5 = 0;
                    while(true) {
                        long v6 = arr_v[v5];
                        if((~v6 << 7 & v6 & 0x8080808080808080L) != 0x8080808080808080L) {
                            int v7 = 8 - (~(v5 - v4) >>> 0x1F);
                            for(int v8 = 0; v8 < v7; ++v8) {
                                if((0xFFL & v6) < 0x80L) {
                                    I i1 = (I)arr_object[(v5 << 3) + v8];
                                    if(i1.b >= v2 && !i1.equals(i0)) {
                                        int v9 = i1.b + v3;
                                        if(v9 >= 0) {
                                            i1.b = v9;
                                        }
                                    }
                                }
                                v6 >>= 8;
                            }
                            if(v7 == 8) {
                                goto label_27;
                            }
                            break;
                        }
                    label_27:
                        if(v5 == v4) {
                            break;
                        }
                        ++v5;
                    }
                }
            }
            return true;
        }
        return false;
    }
}

