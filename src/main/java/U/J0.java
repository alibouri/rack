package U;

import Nb.j;
import kotlin.jvm.functions.Function0;

public abstract class j0 {
    public final P a;

    public j0(Function0 function00) {
        this.a = new P(function00);
    }

    public abstract k0 a(Object arg1);

    public Q0 b() {
        return this.a;
    }

    public final Q0 c(k0 k00, Q0 q00) {
        Q0 q01 = null;
        if(!(q00 instanceof G)) {
            if(!(q00 instanceof P0)) {
                if(q00 instanceof y) {
                    k00.getClass();
                    ((y)q00).getClass();
                }
            }
            else if((k00.b || k00.e != null) && !k00.d && j.a(k00.a(), ((P0)q00).a)) {
                q01 = (P0)q00;
            }
        }
        else if(k00.d) {
            q01 = (G)q00;
            Object object0 = k00.a();
            q01.a.setValue(object0);
        }
        if(q01 == null) {
            if(k00.d) {
                G0 g00 = k00.c;
                if(g00 == null) {
                    g00 = Z.e;
                }
                return new G(d.D(k00.e, g00));
            }
            return new P0(k00.a());
        }
        return q01;
    }
}

