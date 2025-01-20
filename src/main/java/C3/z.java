package C3;

import D3.b;
import E3.g;
import R2.e;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import x3.a;
import z3.k;

public final class z implements F {
    public static final z X;
    public static final e Y;

    static {
        z.X = new z();  // initializer: Ljava/lang/Object;-><init>()V
        z.Y = e.l(new String[]{"c", "v", "i", "o"});
    }

    @Override  // C3.F
    public final Object c(b b0, float f) {
        if(b0.l() == 1) {
            b0.a();
        }
        b0.b();
        ArrayList arrayList0 = null;
        ArrayList arrayList1 = null;
        ArrayList arrayList2 = null;
        boolean z = false;
        while(b0.hasNext()) {
            int v = b0.r(z.Y);
            switch(v) {
                case 0: {
                    z = b0.nextBoolean();
                    break;
                }
                case 1: {
                    arrayList0 = p.c(b0, f);
                    break;
                }
                case 2: {
                    arrayList1 = p.c(b0, f);
                    break;
                }
                default: {
                    if(v == 3) {
                        arrayList2 = p.c(b0, f);
                        break;
                    }
                    else {
                        b0.v();
                        b0.skipValue();
                        continue;
                    }
                    z = b0.nextBoolean();
                    break;
                }
            }
        }
        b0.h();
        if(b0.l() == 2) {
            b0.f();
        }
        if(arrayList0 == null || arrayList1 == null || arrayList2 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if(arrayList0.isEmpty()) {
            return new k(new PointF(), false, Collections.emptyList());
        }
        int v1 = arrayList0.size();
        PointF pointF0 = (PointF)arrayList0.get(0);
        ArrayList arrayList3 = new ArrayList(v1);
        for(int v2 = 1; v2 < v1; ++v2) {
            PointF pointF1 = (PointF)arrayList0.get(v2);
            PointF pointF2 = (PointF)arrayList0.get(v2 - 1);
            PointF pointF3 = (PointF)arrayList2.get(v2 - 1);
            PointF pointF4 = (PointF)arrayList1.get(v2);
            arrayList3.add(new a(g.a(pointF2, pointF3), g.a(pointF1, pointF4), pointF1));
        }
        if(z) {
            PointF pointF5 = (PointF)arrayList0.get(0);
            PointF pointF6 = (PointF)arrayList0.get(v1 - 1);
            PointF pointF7 = (PointF)arrayList2.get(v1 - 1);
            PointF pointF8 = (PointF)arrayList1.get(0);
            arrayList3.add(new a(g.a(pointF6, pointF7), g.a(pointF5, pointF8), pointF5));
        }
        return new k(pointF0, z, arrayList3);
    }
}

