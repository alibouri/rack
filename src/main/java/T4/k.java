package T4;

import f5.a;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public final class k {
    public final Class a;
    public final Class b;
    public final Method c;
    public final Method d;
    public final Method e;
    public final Method f;
    public static k g;
    public static final AtomicBoolean h;

    static {
        k.h = new AtomicBoolean(false);
    }

    public k(Class class0, Class class1, Method method0, Method method1, Method method2, Method method3) {
        this.a = class0;
        this.b = class1;
        this.c = method0;
        this.d = method1;
        this.e = method2;
        this.f = method3;
    }

    public final Object a(ArrayList arrayList0) {
        Class class0 = this.b;
        if(a.b(this)) {
            return null;
        }
        try {
            Object object0 = l.O(this.a, this.c, null, new Object[0]);
            if(object0 == null) {
                return null;
            }
            Object object1 = l.O(class0, this.d, object0, new Object[]{"inapp"});
            if(object1 == null) {
                return null;
            }
            Object object2 = l.O(class0, this.e, object1, new Object[]{arrayList0});
            return object2 == null ? null : l.O(class0, this.f, object2, new Object[0]);
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
            return null;
        }
    }
}

