package sa;

import Aa.a;
import Ab.t;
import a9.H5;
import ac.B0;
import ac.i;
import com.sendwave.backend.type.Currency.CFA;
import com.sendwave.backend.type.Currency;
import kotlin.coroutines.g;
import ra.c0;

public final class j implements i {
    public final m X;

    public j(m m0) {
        this.X = m0;
    }

    @Override  // ac.i
    public final Object c(Object object0, g g0) {
        B0 b00 = this.X.b0;
        do {
            Object object1 = b00.getValue();
            H5 h50 = ((c0)object0).f;
            Currency currency0 = h50 == null ? CFA.X : h50.b.c;
            String s = a.b(((sa.i)object1).e, ((sa.i)object1).c);
        }
        while(!b00.j(object1, sa.i.a(((sa.i)object1), false, currency0, (h50 == null ? null : h50.b.b), ((c0)object0).j, null, s, 17)));
        return t.a;
    }
}

