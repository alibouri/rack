package ia;

import Ab.t;
import J2.w;
import M6.b;
import U.p;
import kotlin.jvm.functions.Function2;

public final class f implements Function2 {
    public final int X;
    public static final f Y;
    public static final f Z;

    static {
        f.Y = new f(0);
        f.Z = new f(1);
    }

    public f(int v) {
        this.X = v;
        super();
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        if(this.X != 0) {
            if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                ((p)object0).K();
                return t.a;
            }
            b.e(b.W(0x7F080293, ((p)object0)), w.S(0x7F1203EF, ((p)object0)), null, null, null, ((p)object0), 0, 0x7C);  // drawable:ic_settings_white
            return t.a;
        }
        if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
            ((p)object0).K();
        }
        return t.a;
    }
}

