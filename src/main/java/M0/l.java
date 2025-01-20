package M0;

import Ab.t;
import Nb.k;
import Tb.e;
import kotlin.jvm.functions.Function1;

public final class l extends k implements Function1 {
    public final int X;
    public final String Y;

    public l(String s, int v) {
        this.X = v;
        this.Y = s;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        Object object1 = t.a;
        String s = this.Y;
        switch(this.X) {
            case 0: {
                s.d(((j)object0), s);
                return object1;
            }
            case 1: {
                s.d(((j)object0), s);
                s.e(((j)object0), 5);
                return object1;
            }
            case 2: {
                s.d(((j)object0), s);
                return object1;
            }
            case 3: {
                s.d(((j)object0), s);
                s.e(((j)object0), 5);
                return object1;
            }
            case 4: {
                e e0 = s.a[2];
                q.d.a(((j)object0), s);
                e e1 = s.a[9];
                q.n.a(((j)object0), 0.0f);
                return object1;
            }
            default: {
                s.d(((j)object0), s);
                s.e(((j)object0), 5);
                return object1;
            }
        }
    }
}

