package R;

import Ab.t;
import B.r;
import D0.K;
import F0.i;
import F0.j;
import Nb.k;
import U.d;
import U.g0;
import U.p;
import a5.w;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import e1.c;
import g0.a;
import g0.b;
import g0.l;
import kotlin.jvm.functions.Function2;

public final class j0 extends k implements Function2 {
    public final int X;
    public final MutableState Y;

    public j0(MutableState mutableState0, int v) {
        this.X = v;
        this.Y = mutableState0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        l l0 = l.X;
        Object object2 = t.a;
        MutableState mutableState0 = this.Y;
        switch(this.X) {
            case 0: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                Modifier modifier0 = M0.k.a(l0, false, h.c0);
                K k0 = r.e(b.a, false);
                int v = ((p)object0).P;
                g0 g00 = ((p)object0).m();
                Modifier modifier1 = a.d(((p)object0), modifier0);
                F0.k.a.getClass();
                i i0 = j.b;
                ((p)object0).U();
                if(((p)object0).O) {
                    ((p)object0).l(i0);
                }
                else {
                    ((p)object0).d0();
                }
                d.K(((p)object0), k0, j.f);
                d.K(((p)object0), g00, j.e);
                F0.h h0 = j.g;
                if(((p)object0).O || !Nb.j.a(((p)object0).G(), v)) {
                    m5.b.F(v, ((p)object0), v, h0);
                }
                d.K(((p)object0), modifier1, j.d);
                ((Function2)mutableState0.getValue()).j(((p)object0), 0);
                ((p)object0).p(true);
                return object2;
            }
            case 1: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                ((Function2)mutableState0.getValue()).j(((p)object0), 0);
                return object2;
            }
            case 2: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                w.h(M0.k.a(l0, false, c.Y), c0.c.c(0xE030C439, new j0(mutableState0, 1), ((p)object0)), ((p)object0), 0x30);
                return object2;
            }
            default: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                ((Function2)mutableState0.getValue()).j(((p)object0), 0);
                return object2;
            }
        }
    }
}

