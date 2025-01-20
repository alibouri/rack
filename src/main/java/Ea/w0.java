package Ea;

import Ab.t;
import C3.i;
import Fa.C;
import Fa.m;
import Mb.e;
import Nb.k;
import U.l;
import U.p;
import java.util.List;
import kotlin.jvm.functions.Function0;

public final class w0 extends k implements e {
    public final List X;
    public final dc.e Y;
    public final f0 Z;
    public final C b0;
    public final i c0;

    public w0(List list0, dc.e e0, f0 f00, C c0, i i0) {
        this.X = list0;
        this.Y = e0;
        this.Z = f00;
        this.b0 = c0;
        this.c0 = i0;
        super(4);
    }

    @Override  // Mb.e
    public final Object r(Object object0, Object object1, Object object2, Object object3) {
        int v = ((Number)object1).intValue();
        int v1 = ((Number)object3).intValue();
        int v2 = (v1 & 6) == 0 ? (((p)object2).f(((D.k)object0)) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (((p)object2).d(v) ? 0x20 : 16);
        }
        if((v2 & 0x93) == 0x92 && ((p)object2).x()) {
            ((p)object2).K();
            return t.a;
        }
        Object object4 = this.X.get(v);
        ((p)object2).Q(-2136005906);
        ((p)object2).Q(1455119908);
        dc.e e0 = this.Y;
        boolean z = ((p)object2).h(e0);
        f0 f00 = this.Z;
        boolean z1 = ((p)object2).f(f00);
        C c0 = this.b0;
        boolean z2 = ((p)object2).f(c0);
        boolean z3 = ((p)object2).h(((Q)object4));
        Object object5 = ((p)object2).G();
        if((z | z1 | z2 | z3) != 0 || object5 == l.a) {
            object5 = new v0(((Q)object4), e0, f00, c0);
            ((p)object2).a0(object5);
        }
        ((p)object2).p(false);
        m.h(((Q)object4), null, ((Function0)object5), this.c0, ((p)object2), 0, 2);
        ((p)object2).p(false);
        return t.a;
    }
}

