package Ba;

import Ab.t;
import U.d;
import U.p;
import android.support.v4.media.session.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class i implements Function2 {
    public final int X;
    public final k Y;
    public final Function0 Z;
    public final Function1 b0;
    public final Function0 c0;
    public final int d0;

    public i(k k0, Function0 function00, Function1 function10, Function0 function01, int v, int v1) {
        this.X = v1;
        this.Y = k0;
        this.Z = function00;
        this.b0 = function10;
        this.c0 = function01;
        this.d0 = v;
        super();
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        if(this.X != 0) {
            Integer integer0 = (Integer)object1;
            a.f(this.Y, this.Z, this.b0, this.c0, ((p)object0), d.O(this.d0 | 1));
            return t.a;
        }
        Integer integer1 = (Integer)object1;
        a.h(this.Y, this.Z, this.b0, this.c0, ((p)object0), d.O(this.d0 | 1));
        return t.a;
    }
}

