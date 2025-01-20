package h8;

import e8.k;
import e8.s;
import e8.t;
import g8.d;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

public final class a implements t {
    public final int X;

    public a(int v) {
        this.X = v;
        super();
    }

    @Override  // e8.t
    public final s b(k k0, k8.a a0) {
        Type type1;
        switch(this.X) {
            case 0: {
                Type type0 = a0.b;
                if(!(type0 instanceof GenericArrayType) && (!(type0 instanceof Class) || !((Class)type0).isArray())) {
                    return null;
                }
                if(type0 instanceof GenericArrayType) {
                    type1 = ((GenericArrayType)type0).getGenericComponentType();
                    return new b(k0, k0.c(new k8.a(type1)), d.g(type1));
                }
                type1 = ((Class)type0).getComponentType();
                return new b(k0, k0.c(new k8.a(type1)), d.g(type1));
            }
            case 1: {
                return a0.a == Date.class ? new h8.d() : null;
            }
            case 2: {
                return a0.a == Object.class ? new f(k0) : null;
            }
            case 3: {
                return a0.a == java.sql.Date.class ? new j(0) : null;
            }
            case 4: {
                return a0.a == Time.class ? new j(1) : null;
            }
            case 5: {
                if(a0.a != Timestamp.class) {
                    return null;
                }
                k0.getClass();
                return new h8.d(k0.c(new k8.a(Date.class)));
            }
            default: {
                Class class0 = a0.a;
                if(Enum.class.isAssignableFrom(class0) && class0 != Enum.class) {
                    if(!class0.isEnum()) {
                        class0 = class0.getSuperclass();
                    }
                    return new b(class0);
                }
                return null;
            }
        }
    }
}

