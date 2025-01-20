package Ba;

import Ab.t;
import B.y0;
import J2.w;
import N.m2;
import Nb.j;
import U.p;
import kotlin.jvm.functions.Function3;

public final class b implements Function3 {
    public final int X;
    public static final b Y;
    public static final b Z;

    static {
        b.Y = new b(0);
        b.Z = new b(1);
    }

    public b(int v) {
        this.X = v;
        super();
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        if(this.X != 0) {
            int v = ((Number)object2).intValue();
            j.f(((y0)object0), "$this$WavePrimaryButton");
            if((v & 17) == 16 && ((p)object1).x()) {
                ((p)object1).K();
                return t.a;
            }
            m2.b(w.S(0x7F1200E0, ((p)object1)), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, ((p)object1), 0, 0, 0x1FFFE);  // string:confirm "Confirm"
            return t.a;
        }
        int v1 = ((Number)object2).intValue();
        j.f(((y0)object0), "$this$WavePrimaryButton");
        if((v1 & 17) == 16 && ((p)object1).x()) {
            ((p)object1).K();
            return t.a;
        }
        m2.b(w.S(0x7F12035E, ((p)object1)), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, ((p)object1), 0, 0, 0x1FFFE);  // string:put_into_savings "Transfer in"
        return t.a;
    }
}

