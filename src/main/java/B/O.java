package B;

import Ab.t;
import D.i;
import E.f;
import G0.e0;
import I.T0;
import I.f0;
import M.o0;
import Nb.k;
import R.M;
import U.d;
import U.p;
import androidx.compose.ui.Modifier;
import e1.u;
import kotlin.jvm.functions.Function2;
import v.K;

public final class o extends k implements Function2 {
    public final int X;
    public final int Y;
    public final Object Z;

    public o(int v, int v1, Object object0) {
        this.X = v1;
        this.Z = object0;
        this.Y = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        switch(this.X) {
            case 0: {
                ((Number)object1).intValue();
                r.a(((Modifier)this.Z), ((p)object0), d.O(this.Y | 1));
                return t.a;
            }
            case 1: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return t.a;
                }
                f f0 = ((C.k)this.Z).b.a.i(this.Y);
                ((C.f)f0.c).c.r(((C.k)this.Z).c, ((int)(this.Y - f0.a)), ((p)object0), 0);
                return t.a;
            }
            case 2: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return t.a;
                }
                f f1 = ((i)this.Z).b.b.i(this.Y);
                ((D.f)f1.c).d.r(D.k.a, ((int)(this.Y - f1.a)), ((p)object0), 6);
                return t.a;
            }
            case 3: {
                ((Number)object1).intValue();
                ((e0)this.Z).b(d.O(this.Y | 1), ((p)object0));
                return t.a;
            }
            case 4: {
                ((Number)object1).intValue();
                f0.i(((o0)this.Z), ((p)object0), d.O(this.Y | 1));
                return t.a;
            }
            case 5: {
                ((Number)object1).intValue();
                ((T0)this.Z).a(d.O(this.Y | 1), ((p)object0));
                return t.a;
            }
            case 6: {
                ((Number)object1).intValue();
                ((M)this.Z).b(d.O(this.Y | 1), ((p)object0));
                return t.a;
            }
            case 7: {
                ((Number)object1).intValue();
                ((e1.p)this.Z).b(d.O(this.Y | 1), ((p)object0));
                return t.a;
            }
            case 8: {
                ((Number)object1).intValue();
                ((u)this.Z).b(d.O(this.Y | 1), ((p)object0));
                return t.a;
            }
            default: {
                ((Number)object1).intValue();
                ((K)this.Z).a(d.O(this.Y | 1), ((p)object0));
                return t.a;
            }
        }
    }
}

