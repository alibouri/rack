package k2;

import Ab.t;
import Nb.j;
import Nb.k;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

public final class v extends k implements Function1 {
    public final int X;
    public static final v Y;
    public static final v Z;
    public static final v b0;
    public static final v c0;
    public static final v d0;

    static {
        v.Y = new v(1, 0);
        v.Z = new v(1, 1);
        v.b0 = new v(1, 2);
        v.c0 = new v(1, 3);
        v.d0 = new v(1, 4);
    }

    public v(int v, int v1) {
        this.X = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        switch(this.X) {
            case 0: {
                j.f(((V)object0), "it");
                if(((V)object0).X != 0) {
                    ((V)object0).Y.c();
                    return t.a;
                }
                ((V)object0).Y.c();
                return t.a;
            }
            case 1: {
                j.f(((WeakReference)object0), "it");
                return ((WeakReference)object0).get() == null ? Boolean.valueOf(true) : Boolean.valueOf(false);
            }
            case 2: {
                j.f(((WeakReference)object0), "it");
                return ((WeakReference)object0).get() == null ? Boolean.valueOf(true) : Boolean.valueOf(false);
            }
            case 3: {
                j.f(((WeakReference)object0), "it");
                return ((WeakReference)object0).get() == null ? Boolean.valueOf(true) : Boolean.valueOf(false);
            }
            default: {
                j.f(((Function0)object0), "it");
                ((Function0)object0).invoke();
                return t.a;
            }
        }
    }
}

