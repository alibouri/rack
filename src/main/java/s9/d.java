package s9;

import Aa.r;
import Ab.t;
import Ea.b0;
import U.p;
import ha.l;
import hb.h;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import t9.a;

public final class d implements Function2 {
    public final int X;
    public final List Y;
    public final a Z;
    public final boolean b0;
    public final boolean c0;
    public final int d0;
    public final Function1 e0;
    public final Function0 f0;
    public final Function0 g0;

    public d(List list0, a a0, boolean z, boolean z1, Function1 function10, Function0 function00, Function0 function01, int v, int v1) {
        this.X = v1;
        this.Y = list0;
        this.Z = a0;
        this.b0 = z;
        this.c0 = z1;
        this.e0 = function10;
        this.f0 = function00;
        this.g0 = function01;
        this.d0 = v;
        super();
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        if(this.X != 0) {
            ((Integer)object1).getClass();
            h.w(this.Y, this.Z, this.b0, this.c0, ((r)this.e0), ((b0)this.f0), ((l)this.g0), ((p)object0), U.d.O(this.d0 | 1));
            return t.a;
        }
        Integer integer0 = (Integer)object1;
        android.support.v4.media.session.a.m(this.Y, this.Z, this.b0, this.c0, this.e0, this.f0, this.g0, ((p)object0), U.d.O(this.d0 | 1));
        return t.a;
    }
}

