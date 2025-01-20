package U;

import Bb.p;
import java.util.ArrayList;
import java.util.List;
import o6.a;
import o6.h;
import o6.k;

public final class h0 implements a {
    public final List X;

    public h0() {
        ArrayList arrayList0 = new ArrayList();
        super();
        this.X = arrayList0;
    }

    public h0(List list0) {
        this.X = list0;
    }

    public void a(int v) {
        List list0 = this.X;
        if(!list0.isEmpty() && (((Number)list0.get(0)).intValue() == v || ((Number)list0.get(list0.size() - 1)).intValue() == v)) {
            return;
        }
        int v1 = list0.size();
        list0.add(v);
        while(v1 > 0) {
            int v2 = (v1 + 1 >>> 1) - 1;
            int v3 = ((Number)list0.get(v2)).intValue();
            if(v <= v3) {
                break;
            }
            list0.set(v1, v3);
            v1 = v2;
        }
        list0.set(v1, v);
    }

    public int b() {
        List list0 = this.X;
        if(list0.size() > 0) {
            int v = ((Number)list0.get(0)).intValue();
        label_3:
            while(!list0.isEmpty() && ((Number)list0.get(0)).intValue() == v) {
                list0.set(0, p.w0(list0));
                list0.remove(list0.size() - 1);
                int v1 = list0.size();
                int v2 = list0.size();
                int v3 = 0;
                while(v3 < v2 >>> 1) {
                    int v4 = ((Number)list0.get(v3)).intValue();
                    int v5 = (v3 + 1) * 2;
                    int v6 = v5 - 1;
                    int v7 = ((Number)list0.get(v6)).intValue();
                    if(v5 < v1) {
                        int v8 = ((Number)list0.get(v5)).intValue();
                        if(v8 > v7) {
                            if(v8 <= v4) {
                                continue label_3;
                            }
                            list0.set(v3, v8);
                            list0.set(v5, v4);
                            v3 = v5;
                            continue;
                        }
                    }
                    if(v7 > v4) {
                        list0.set(v3, v7);
                        list0.set(v6, v4);
                        v3 = v6;
                        continue;
                    }
                    continue label_3;
                }
            }
            return v;
        }
        d.p("Set is empty");
        throw null;
    }

    @Override  // o6.a
    public Object j(h h0) {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.addAll(this.X);
        return k.e(arrayList0);
    }
}

