package h8;

import e8.k;
import e8.n;
import e8.s;
import g8.m;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public final class b extends s {
    public final int a;
    public final Object b;
    public final Object c;
    public static final a d;

    static {
        b.d = new a(0);
    }

    public b(k k0, s s0, Class class0) {
        this.a = 0;
        super();
        this.b = new h8.k(k0, s0, class0);
        this.c = class0;
    }

    public b(k k0, Type type0, s s0, m m0) {
        this.a = 1;
        super();
        this.b = new h8.k(k0, s0, type0);
        this.c = m0;
    }

    public b(l l0, Class class0) {
        this.a = 2;
        super();
        this.b = l0;
        this.c = class0;
    }

    public b(Class class0) {
        this.a = 3;
        super();
        this.c = new HashMap();
        this.b = new HashMap();
        try {
            Enum[] arr_enum = (Enum[])class0.getEnumConstants();
            for(int v = 0; v < arr_enum.length; ++v) {
                Enum enum0 = arr_enum[v];
                String s = enum0.name();
                f8.b b0 = (f8.b)class0.getField(s).getAnnotation(f8.b.class);
                if(b0 != null) {
                    s = b0.value();
                    String[] arr_s = b0.alternate();
                    for(int v1 = 0; v1 < arr_s.length; ++v1) {
                        ((HashMap)this.c).put(arr_s[v1], enum0);
                    }
                }
                ((HashMap)this.c).put(s, enum0);
                ((HashMap)this.b).put(enum0, s);
            }
            return;
        }
        catch(NoSuchFieldException noSuchFieldException0) {
        }
        throw new AssertionError(noSuchFieldException0);
    }

    @Override  // e8.s
    public final Object a(l8.a a0) {
        switch(this.a) {
            case 0: {
                if(a0.O() == 9) {
                    a0.G();
                    return null;
                }
                ArrayList arrayList0 = new ArrayList();
                a0.a();
                while(a0.hasNext()) {
                    arrayList0.add(((h8.k)this.b).b.a(a0));
                }
                a0.l();
                int v = arrayList0.size();
                Object object0 = Array.newInstance(((Class)this.c), v);
                for(int v1 = 0; v1 < v; ++v1) {
                    Array.set(object0, v1, arrayList0.get(v1));
                }
                return object0;
            }
            case 1: {
                if(a0.O() == 9) {
                    a0.G();
                    return null;
                }
                Collection collection0 = (Collection)((m)this.c).r();
                a0.a();
                while(a0.hasNext()) {
                    collection0.add(((h8.k)this.b).b.a(a0));
                }
                a0.l();
                return collection0;
            }
            case 2: {
                Object object1 = ((l)this.b).Z.a(a0);
                if(object1 != null) {
                    Class class0 = (Class)this.c;
                    if(!class0.isInstance(object1)) {
                        throw new n("Expected a " + class0.getName() + " but was " + object1.getClass().getName());  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                    }
                }
                return object1;
            }
            default: {
                if(a0.O() == 9) {
                    a0.G();
                    return null;
                }
                String s = a0.nextString();
                return (Enum)((HashMap)this.c).get(s);
            }
        }
    }

    @Override  // e8.s
    public final void b(l8.b b0, Object object0) {
        switch(this.a) {
            case 0: {
                if(object0 == null) {
                    b0.z();
                    return;
                }
                b0.b();
                int v = Array.getLength(object0);
                for(int v1 = 0; v1 < v; ++v1) {
                    Object object1 = Array.get(object0, v1);
                    ((h8.k)this.b).b(b0, object1);
                }
                b0.l();
                return;
            }
            case 1: {
                if(((Collection)object0) == null) {
                    b0.z();
                    return;
                }
                b0.b();
                for(Object object2: ((Collection)object0)) {
                    ((h8.k)this.b).b(b0, object2);
                }
                b0.l();
                return;
            }
            case 2: {
                ((l)this.b).Z.b(b0, object0);
                return;
            }
            default: {
                b0.S((((Enum)object0) == null ? null : ((String)((HashMap)this.b).get(((Enum)object0)))));
            }
        }
    }
}

