package J2;

import I2.A;
import I2.b;
import I2.o;
import R2.p;
import R2.u;
import android.os.Build.VERSION;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;

public abstract class j {
    public static final String a;

    static {
        j.a = A.g("Schedulers");
    }

    public static void a(u u0, o o0, ArrayList arrayList0) {
        if(arrayList0.size() > 0) {
            o0.getClass();
            long v = System.currentTimeMillis();
            for(Object object0: arrayList0) {
                u0.l(v, ((p)object0).a);
            }
        }
    }

    public static void b(b b0, WorkDatabase workDatabase0, List list0) {
        ArrayList arrayList2;
        ArrayList arrayList1;
        ArrayList arrayList0;
        if(list0 != null && list0.size() != 0) {
            u u0 = workDatabase0.x();
            workDatabase0.c();
            try {
                if(Build.VERSION.SDK_INT >= 24) {
                    arrayList0 = u0.f();
                    j.a(u0, b0.d, arrayList0);
                }
                else {
                    arrayList0 = null;
                }
                arrayList1 = u0.e(b0.l);
                j.a(u0, b0.d, arrayList1);
                if(arrayList0 != null) {
                    arrayList1.addAll(arrayList0);
                }
                arrayList2 = u0.d();
                workDatabase0.q();
            }
            finally {
                workDatabase0.k();
            }
            if(arrayList1.size() > 0) {
                p[] arr_p = (p[])arrayList1.toArray(new p[arrayList1.size()]);
                for(Object object0: list0) {
                    g g0 = (g)object0;
                    if(g0.e()) {
                        g0.c(arr_p);
                    }
                }
            }
            if(arrayList2.size() > 0) {
                p[] arr_p1 = (p[])arrayList2.toArray(new p[arrayList2.size()]);
                for(Object object1: list0) {
                    g g1 = (g)object1;
                    if(!g1.e()) {
                        g1.c(arr_p1);
                    }
                }
            }
        }
    }
}

