package g8;

import java.lang.reflect.Method;

public final class q extends d {
    public final Method b;

    public q(Method method0) {
        this.b = method0;
    }

    @Override  // g8.d
    public final Object h(Class class0) {
        d.a(class0);
        return this.b.invoke(null, class0, Object.class);
    }
}

