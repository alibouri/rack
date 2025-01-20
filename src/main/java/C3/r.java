package C3;

import D3.b;
import R2.e;
import java.util.ArrayList;
import r3.a;
import u3.j;

public abstract class r {
    public static final e a;

    static {
        r.a = e.l(new String[]{"k"});
    }

    public static ArrayList a(b b0, a a0, float f, F f1, boolean z) {
        ArrayList arrayList0 = new ArrayList();
        if(b0.l() == 6) {
            a0.a("Lottie doesn\'t support expressions.");
            return arrayList0;
        }
        b0.b();
        while(b0.hasNext()) {
            if(b0.r(r.a) != 0) {
                b0.skipValue();
            }
            else if(b0.l() == 1) {
                b0.a();
                if(b0.l() == 7) {
                    arrayList0.add(q.b(b0, a0, f, f1, false, z));
                }
                else {
                    while(b0.hasNext()) {
                        arrayList0.add(q.b(b0, a0, f, f1, true, z));
                    }
                }
                b0.f();
            }
            else {
                arrayList0.add(q.b(b0, a0, f, f1, false, z));
            }
        }
        b0.h();
        r.b(arrayList0);
        return arrayList0;
    }

    public static void b(ArrayList arrayList0) {
        int v = arrayList0.size();
        int v1 = 0;
        while(v1 < v - 1) {
            F3.a a0 = (F3.a)arrayList0.get(v1);
            ++v1;
            F3.a a1 = (F3.a)arrayList0.get(v1);
            a0.h = (float)a1.g;
            if(a0.c == null) {
                Object object0 = a1.b;
                if(object0 != null) {
                    a0.c = object0;
                    if(a0 instanceof j) {
                        ((j)a0).d();
                    }
                }
            }
        }
        F3.a a2 = (F3.a)arrayList0.get(v - 1);
        if((a2.b == null || a2.c == null) && arrayList0.size() > 1) {
            arrayList0.remove(a2);
        }
    }
}

