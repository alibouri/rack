package T4;

import Nb.j;
import Vb.q;
import f5.a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public final class e implements InvocationHandler {
    public final int a;

    public e(int v) {
        this.a = v;
        super();
    }

    @Override
    public final Object invoke(Object object0, Method method0, Object[] arr_object) {
        if(this.a != 0) {
            if(!a.b(this)) {
                try {
                    j.f(object0, "proxy");
                    j.f(method0, "m");
                    return null;
                }
                catch(Throwable throwable0) {
                    a.a(throwable0, this);
                }
            }
            return null;
        }
        if(!a.b(this)) {
            try {
                j.f(object0, "proxy");
                j.f(method0, "m");
                if(j.a(method0.getName(), "onBillingSetupFinished")) {
                    d.c().set(true);
                    return null;
                }
                String s = method0.getName();
                j.e(s, "m.name");
                if(q.I(s, "onBillingServiceDisconnected", false)) {
                    d.c().set(false);
                    return null;
                }
                return null;
            }
            catch(Throwable throwable1) {
            }
            a.a(throwable1, this);
        }
        return null;
    }
}

