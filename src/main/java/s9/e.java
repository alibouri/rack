package s9;

import Aa.r;
import Ab.t;
import B.C;
import Ea.b0;
import Nb.j;
import U.p;
import hb.h;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import t9.a;

public final class e implements Function3 {
    public final int X;
    public final List Y;
    public final a Z;
    public final boolean b0;
    public final Function1 c0;
    public final Function0 d0;

    public e(List list0, a a0, boolean z, Function1 function10, Function0 function00, int v) {
        this.X = v;
        this.Y = list0;
        this.Z = a0;
        this.b0 = z;
        this.c0 = function10;
        this.d0 = function00;
        super();
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        if(this.X != 0) {
            int v = ((Number)object2).intValue();
            j.f(((C)object0), "$this$BottomSheetLayout");
            if((v & 17) == 16 && ((p)object1).x()) {
                ((p)object1).K();
                return t.a;
            }
            h.x(this.Y, this.Z, this.b0, ((r)this.c0), ((b0)this.d0), ((p)object1), 0);
            return t.a;
        }
        int v1 = ((Number)object2).intValue();
        j.f(((C)object0), "$this$BottomSheetLayout");
        if((v1 & 17) == 16 && ((p)object1).x()) {
            ((p)object1).K();
            return t.a;
        }
        h.x(this.Y, this.Z, this.b0, this.c0, this.d0, ((p)object1), 0);
        return t.a;
    }
}

