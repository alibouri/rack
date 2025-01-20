package pb;

import Ab.c;
import U.d;
import U.p;
import io.sentry.config.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class t implements Function2 {
    public final int X;
    public final boolean Y;
    public final int Z;
    public final int b0;
    public final c c0;

    public t(int v, int v1, Function0 function00, boolean z) {
        this.X = 1;
        super();
        this.c0 = function00;
        this.Y = z;
        this.Z = v;
        this.b0 = v1;
    }

    public t(int v, boolean z, Function1 function10, int v1) {
        this.X = 0;
        super();
        this.Z = v;
        this.Y = z;
        this.c0 = function10;
        this.b0 = v1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        if(this.X != 0) {
            a.j(((Function0)this.c0), this.Y, this.Z, ((p)object0), d.O(this.b0 | 1));
            return Ab.t.a;
        }
        ((Integer)object1).getClass();
        U5.a.g(this.Z, this.Y, ((Function1)this.c0), ((p)object0), d.O(this.b0 | 1));
        return Ab.t.a;
    }
}

