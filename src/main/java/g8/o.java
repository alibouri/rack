package g8;

import java.lang.reflect.Method;

public final class o extends d {
    public final Method b;
    public final Object c;

    public o(Method method0, Object object0) {
        this.b = method0;
        this.c = object0;
    }

    @Override  // g8.d
    public final Object h(Class class0) {
        d.a(class0);
        return this.b.invoke(this.c, class0);
    }
}

