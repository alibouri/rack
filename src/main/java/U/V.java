package u;

import Ab.e;
import Nb.k;
import kotlin.jvm.functions.Function1;
import v.f0;

public final class v extends k implements Function1 {
    public final int X;
    public final C Y;
    public final D Z;

    public v(C c0, D d0, int v) {
        this.X = v;
        this.Y = c0;
        this.Z = d0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        Object object2;
        Object object1;
        switch(this.X) {
            case 0: {
                t t0 = t.Y;
                if(((f0)object0).a(t.X, t0)) {
                    E e0 = this.Y.a.a;
                    if(e0 != null) {
                        object1 = e0.b;
                        return object1 == null ? x.b : object1;
                    }
                    return x.b;
                }
                if(((f0)object0).a(t0, t.Z)) {
                    E e1 = this.Z.a.a;
                    if(e1 != null) {
                        object1 = e1.b;
                        if(object1 != null) {
                            return object1;
                        }
                    }
                    return x.b;
                }
                return x.b;
            }
            case 1: {
                float f1 = 1.0f;
                switch(((t)object0).ordinal()) {
                    case 0: {
                        E e3 = this.Y.a.a;
                        if(e3 != null) {
                            f1 = e3.a;
                        }
                        break;
                    }
                    case 1: {
                        break;
                    }
                    case 2: {
                        E e2 = this.Z.a.a;
                        return e2 == null ? 1.0f : ((float)e2.a);
                    }
                    default: {
                        throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                    }
                }
                return f1;
            }
            case 2: {
                t t1 = t.Y;
                if(((f0)object0).a(t.X, t1)) {
                    H h2 = this.Y.a.c;
                    if(h2 != null) {
                        object2 = h2.c;
                        return object2 == null ? x.b : object2;
                    }
                    return x.b;
                }
                if(((f0)object0).a(t1, t.Z)) {
                    H h3 = this.Z.a.c;
                    if(h3 != null) {
                        object2 = h3.c;
                        if(object2 != null) {
                            return object2;
                        }
                    }
                    return x.b;
                }
                return x.b;
            }
            default: {
                float f = 1.0f;
                switch(((t)object0).ordinal()) {
                    case 0: {
                        H h1 = this.Y.a.c;
                        if(h1 != null) {
                            f = h1.a;
                        }
                        break;
                    }
                    case 1: {
                        break;
                    }
                    case 2: {
                        H h0 = this.Z.a.c;
                        return h0 == null ? 1.0f : ((float)h0.a);
                    }
                    default: {
                        throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                    }
                }
                return f;
            }
        }
    }
}

