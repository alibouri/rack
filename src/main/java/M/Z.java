package M;

import Ab.t;
import E.B;
import I.f0;
import Nb.j;
import Nb.k;
import U.F;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.jvm.functions.Function1;
import l0.p;
import m0.b;

public final class z extends k implements Function1 {
    public final int X;
    public final a0 Y;

    public z(a0 a00, int v) {
        this.X = v;
        this.Y = a00;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        switch(this.X) {
            case 0: {
                F f0 = (F)object0;
                return new B(5, this.Y);
            }
            case 1: {
                long v = ((Number)object0).longValue();
                a0 a00 = this.Y;
                if(a00.a.a().a(v)) {
                    a00.o();
                    a00.q();
                }
                return t.a;
            }
            case 2: {
                long v1 = ((Number)object0).longValue();
                a0 a01 = this.Y;
                if(a01.a.a().a(v1)) {
                    a01.i();
                    a01.m(null);
                }
                return t.a;
            }
            case 3: {
                long v2 = ((Number)object0).longValue();
                a0 a02 = this.Y;
                q q0 = a02.e();
                if(q0 != null && (q0.a != null && v2 == q0.a.c)) {
                    a02.n.setValue(null);
                }
                q q1 = a02.e();
                if(q1 != null && (q1.b != null && v2 == q1.b.c)) {
                    a02.o.setValue(null);
                }
                if(a02.a.a().a(v2)) {
                    a02.q();
                }
                return t.a;
            }
            case 4: {
                a0 a03 = this.Y;
                a03.k = (LayoutCoordinates)object0;
                if(a03.d() && a03.e() != null) {
                    b b0 = ((LayoutCoordinates)object0) == null ? null : new b(((LayoutCoordinates)object0).f(0L));
                    if(!j.a(a03.j, b0)) {
                        a03.j = b0;
                        a03.o();
                        a03.q();
                    }
                }
                return t.a;
            }
            case 5: {
                boolean z = ((p)object0).a();
                a0 a04 = this.Y;
                if(!z && a04.d()) {
                    a04.i();
                }
                Boolean boolean0 = Boolean.valueOf(((p)object0).a());
                a04.i.setValue(boolean0);
                return t.a;
            }
            case 6: {
                this.Y.l(((Boolean)object0).booleanValue());
                return t.a;
            }
            case 7: {
                if(f0.a.a(((x0.b)object0).a) == 17) {
                    this.Y.b();
                    return Boolean.valueOf(true);
                }
                return Boolean.valueOf(false);
            }
            default: {
                this.Y.m(((q)object0));
                return t.a;
            }
        }
    }
}

