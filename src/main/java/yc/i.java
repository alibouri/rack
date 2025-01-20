package yc;

import Nb.j;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class i implements InvocationHandler {
    public final ArrayList a;
    public boolean b;
    public String c;

    public i(ArrayList arrayList0) {
        this.a = arrayList0;
    }

    @Override
    public final Object invoke(Object object0, Method method0, Object[] arr_object) {
        j.f(object0, "proxy");
        j.f(method0, "method");
        if(arr_object == null) {
            arr_object = new Object[0];
        }

        String s = method0.getName();
        Class class0 = method0.getReturnType();
        if(j.a(s, "supports") && j.a(Boolean.TYPE, class0)) {
            return Boolean.TRUE;
        }

        if(j.a(s, "unsupported") && j.a(Void.TYPE, class0)) {
            this.b = true;
            return null;
        }

        boolean z = j.a(s, "protocols");
        Object object1 = this.a;
        if(z && arr_object.length == 0) {
            return object1;
        }

        if((j.a(s, "selectProtocol") || j.a(s, "select")) && String.class.equals(class0) && arr_object.length == 1) {
            Object object2 = arr_object[0];
            if(object2 instanceof List) {
                j.d(object2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                int v = ((List)object2).size();
                if(v >= 0) {
                    for(int v1 = 0; true; ++v1) {
                        Object object3 = ((List)object2).get(v1);
                        j.d(object3, "null cannot be cast to non-null type kotlin.String");
                        String s1 = (String)object3;
                        if(((ArrayList)object1).contains(s1)) {
                            this.c = s1;
                            return s1;
                        }

                        if(v1 == v) {
                            break;
                        }
                    }
                }

                String s2 = (String)((ArrayList)object1).get(0);
                this.c = s2;
                return s2;
            }
        }

        if((j.a(s, "protocolSelected") || j.a(s, "selected")) && arr_object.length == 1) {
            Object object4 = arr_object[0];
            j.d(object4, "null cannot be cast to non-null type kotlin.String");
            this.c = (String)object4;
            return null;
        }

        return method0.invoke(this, Arrays.copyOf(arr_object, arr_object.length));
    }
}

