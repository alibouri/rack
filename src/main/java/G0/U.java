package G0;

import Ab.k;
import M0.o;
import java.util.Comparator;
import m0.c;

public final class u implements Comparator {
    public final int X;
    public static final u Y;
    public static final u Z;
    public static final u b0;

    static {
        u.Y = new u(0);
        u.Z = new u(1);
        u.b0 = new u(2);
    }

    public u(int v) {
        this.X = v;
        super();
    }

    @Override
    public final int compare(Object object0, Object object1) {
        switch(this.X) {
            case 0: {
                c c0 = ((o)object0).f();
                c c1 = ((o)object1).f();
                int v1 = Float.compare(c0.a, c1.a);
                if(v1 == 0) {
                    v1 = Float.compare(c0.b, c1.b);
                    if(v1 == 0) {
                        v1 = Float.compare(c0.d, c1.d);
                        return v1 == 0 ? Float.compare(c0.c, c1.c) : v1;
                    }
                }
                return v1;
            }
            case 1: {
                c c2 = ((o)object0).f();
                c c3 = ((o)object1).f();
                int v2 = Float.compare(c3.c, c2.c);
                if(v2 == 0) {
                    v2 = Float.compare(c2.b, c3.b);
                    if(v2 == 0) {
                        v2 = Float.compare(c2.d, c3.d);
                        return v2 == 0 ? Float.compare(c3.a, c2.a) : v2;
                    }
                }
                return v2;
            }
            default: {
                int v = Float.compare(((c)((k)object0).X).b, ((c)((k)object1).X).b);
                return v == 0 ? Float.compare(((c)((k)object0).X).d, ((c)((k)object1).X).d) : v;
            }
        }
    }
}

