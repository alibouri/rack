package M;

import Nb.k;
import U.l;
import U.p;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

public final class h extends k implements Function3 {
    public final Function0 X;
    public final boolean Y;

    public h(Function0 function00, boolean z) {
        this.X = function00;
        this.Y = z;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        ((Number)object2).intValue();
        ((p)object1).Q(0xF44568FA);
        long v = ((u0)((p)object1).k(v0.a)).a;
        boolean z = ((p)object1).e(v);
        Function0 function00 = this.X;
        boolean z1 = ((p)object1).f(function00);
        boolean z2 = this.Y;
        boolean z3 = ((p)object1).g(z2);
        Object object3 = ((p)object1).G();
        if((z | z1 | z3) != 0 || object3 == l.a) {
            object3 = new g(v, function00, z2);
            ((p)object1).a0(object3);
        }
        Object object4 = a.b(((Modifier)object0), ((Function1)object3));
        ((p)object1).p(false);
        return object4;
    }
}

