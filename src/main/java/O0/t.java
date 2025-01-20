package O0;

import Bb.q;
import C3.i;
import Nb.k;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

public final class t extends k implements Function0 {
    public final int X;
    public final i Y;

    public t(i i0, int v) {
        this.X = v;
        this.Y = i0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.X != 0) {
            ArrayList arrayList0 = (ArrayList)this.Y.c0;
            if(arrayList0.isEmpty()) {
                return 0.0f;
            }
            Object object0 = arrayList0.get(0);
            float f = ((v)object0).a.a();
            int v = q.y(arrayList0);
            if(1 <= v) {
                for(int v1 = 1; true; ++v1) {
                    Object object1 = arrayList0.get(v1);
                    float f1 = ((v)object1).a.a();
                    if(Float.compare(f, f1) < 0) {
                        object0 = object1;
                        f = f1;
                    }
                    if(v1 == v) {
                        break;
                    }
                }
            }
            return ((v)object0) == null ? 0.0f : ((v)object0).a.a();
        }
        ArrayList arrayList1 = (ArrayList)this.Y.c0;
        if(arrayList1.isEmpty()) {
            return 0.0f;
        }
        Object object2 = arrayList1.get(0);
        float f2 = ((v)object2).a.g0.b();
        int v2 = q.y(arrayList1);
        if(1 <= v2) {
            for(int v3 = 1; true; ++v3) {
                Object object3 = arrayList1.get(v3);
                float f3 = ((v)object3).a.g0.b();
                if(Float.compare(f2, f3) < 0) {
                    object2 = object3;
                    f2 = f3;
                }
                if(v3 == v2) {
                    break;
                }
            }
        }
        return ((v)object2) == null ? 0.0f : ((v)object2).a.g0.b();
    }
}

