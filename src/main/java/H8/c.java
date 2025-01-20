package h8;

import e8.h;
import e8.i;
import e8.k;
import e8.s;
import e8.t;
import g8.d;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Calendar;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import k8.a;

public final class c implements t {
    public final int X;
    public final Object Y;

    public c(int v, Object object0) {
        this.X = v;
        this.Y = object0;
        super();
    }

    public static s a(io.sentry.internal.debugmeta.c c0, k k0, a a0, f8.a a1) {
        s s0;
        Object object0 = c0.e(new a(a1.value())).r();
        if(object0 instanceof s) {
            s0 = (s)object0;
        }
        else if(object0 instanceof t) {
            s0 = ((t)object0).b(k0, a0);
        }
        else {
            throw new IllegalArgumentException("Invalid attempt to bind an instance of " + object0.getClass().getName() + " as a @JsonAdapter for " + d.j(a0.b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
        }
        return s0 != null && a1.nullSafe() ? new i(s0, 2) : s0;
    }

    @Override  // e8.t
    public final s b(k k0, a a0) {
        Type type0 = Object.class;
        Object object0 = this.Y;
        switch(this.X) {
            case 0: {
                Class class0 = Collection.class;
                Class class1 = a0.a;
                if(class0.isAssignableFrom(class1)) {
                    Type type1 = a0.b instanceof WildcardType ? ((WildcardType)a0.b).getUpperBounds()[0] : a0.b;
                    d.c(class0.isAssignableFrom(class1));
                    Type type2 = d.i(type1, class1, d.f(type1, class1, class0), new HashSet());
                    if(type2 instanceof WildcardType) {
                        type2 = ((WildcardType)type2).getUpperBounds()[0];
                    }
                    if(type2 instanceof ParameterizedType) {
                        type0 = ((ParameterizedType)type2).getActualTypeArguments()[0];
                    }
                    return new b(k0, type0, k0.c(new a(type0)), ((io.sentry.internal.debugmeta.c)object0).e(a0));
                }
                return null;
            }
            case 1: {
                f8.a a1 = (f8.a)a0.a.getAnnotation(f8.a.class);
                return a1 == null ? null : c.a(((io.sentry.internal.debugmeta.c)object0), k0, a0, a1);
            }
            case 2: {
                Class class2 = Map.class;
                if(class2.isAssignableFrom(a0.a)) {
                    Type type3 = a0.b;
                    Class class3 = d.g(type3);
                    if(type3 == Properties.class) {
                        return String.class == Boolean.TYPE || String.class == Boolean.class ? new e(this, k0, String.class, n.c, String.class, k0.c(new a(String.class)), ((io.sentry.internal.debugmeta.c)object0).e(a0)) : new e(this, k0, String.class, k0.c(new a(String.class)), String.class, k0.c(new a(String.class)), ((io.sentry.internal.debugmeta.c)object0).e(a0));
                    }
                    if(type3 instanceof WildcardType) {
                        type3 = ((WildcardType)type3).getUpperBounds()[0];
                    }
                    d.c(class2.isAssignableFrom(class3));
                    Type type4 = d.i(type3, class3, d.f(type3, class3, class2), new HashSet());
                    if(type4 instanceof ParameterizedType) {
                        ((ParameterizedType)type4).getActualTypeArguments();
                    }
                    return class4 == Boolean.TYPE || class4 == Boolean.class ? new e(this, k0, class4, n.c, class5, k0.c(new a(class5)), ((io.sentry.internal.debugmeta.c)object0).e(a0)) : new e(this, k0, class4, k0.c(new a(class4)), class5, k0.c(new a(class5)), ((io.sentry.internal.debugmeta.c)object0).e(a0));
                }
                return null;
            }
            default: {
                return a0.a == Calendar.class || a0.a == GregorianCalendar.class ? ((h)object0) : null;
            }
        }
    }

    @Override
    public String toString() {
        return this.X == 3 ? "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((h)this.Y) + "]" : super.toString();
    }
}

