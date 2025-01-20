package g8;

import java.lang.reflect.Method;

public final class p extends d {
    public final Method b;
    public final int c;

    public p(int v, Method method0) {
        this.b = method0;
        this.c = v;
    }

    @Override  // g8.d
    public final Object h(Class class0) {
        d.a(class0);
        return this.b.invoke(null, class0, ((int)this.c));
    }
}

