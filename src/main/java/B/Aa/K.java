package Aa;

import Ab.t;
import J2.w;
import Pb.a;
import U.d;
import U.p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final class k implements Function2 {
    public final int X;
    public final String Y;
    public final boolean Z;
    public final Function0 b0;
    public final int c0;

    public k(String s, boolean z, Function0 function00, int v) {
        this.X = 1;
        super();
        this.Y = s;
        this.Z = z;
        this.b0 = function00;
        this.c0 = v;
    }

    public k(boolean z, Function0 function00, String s, int v) {
        this.X = 0;
        super();
        this.Z = z;
        this.b0 = function00;
        this.Y = s;
        this.c0 = v;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        if(this.X != 0) {
            w.k(d.O(this.c0 | 1), ((p)object0), this.Y, this.b0, this.Z);
            return t.a;
        }
        ((Integer)object1).getClass();
        a.f(d.O(this.c0 | 1), ((p)object0), this.Y, this.b0, this.Z);
        return t.a;
    }
}

