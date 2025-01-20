package V4;

import Nb.j;
import Nb.w;
import android.util.Log;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public final class m implements InvocationHandler {
    public final Object a;
    public final w b;
    public final ReentrantLock c;
    public final Condition d;

    public m(Object object0, w w0, ReentrantLock reentrantLock0, Condition condition0) {
        this.a = object0;
        this.b = w0;
        this.c = reentrantLock0;
        this.d = condition0;
    }

    @Override
    public final Object invoke(Object object0, Method method0, Object[] arr_object) {
        ReentrantLock reentrantLock0 = this.c;
        j.f(method0, "method");
        j.f(arr_object, "objects");
        try {
            if(j.a(method0.getName(), "onChecksumsReady") && arr_object.length == 1) {
                Object object1 = arr_object[0];
                if(object1 instanceof List) {
                    for(Object object2: ((List)object1)) {
                        if(object2 != null) {
                            Method method1 = object2.getClass().getMethod("getSplitName", null);
                            j.e(method1, "c.javaClass.getMethod(\"getSplitName\")");
                            Method method2 = object2.getClass().getMethod("getType", null);
                            j.e(method2, "c.javaClass.getMethod(\"getType\")");
                            if(method1.invoke(object2, null) == null && j.a(method2.invoke(object2, null), this.a)) {
                                Method method3 = object2.getClass().getMethod("getValue", null);
                                j.e(method3, "c.javaClass.getMethod(\"getValue\")");
                                Object object3 = method3.invoke(object2, null);
                                if(object3 != null) {
                                    this.b.X = new BigInteger(1, ((byte[])object3)).toString(16);
                                    reentrantLock0.lock();
                                    try {
                                        this.d.signalAll();
                                        return null;
                                    }
                                    finally {
                                        reentrantLock0.unlock();
                                    }
                                }
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
                            }
                        }
                    }
                }
            }
        }
        catch(Throwable throwable0) {
            Log.d("n", "Can\'t fetch checksum.", throwable0);
        }
        return null;
    }
}

