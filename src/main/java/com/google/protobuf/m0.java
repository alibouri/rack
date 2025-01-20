package com.google.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

public abstract class m0 {
    public final Unsafe a;

    public m0(Unsafe unsafe0) {
        this.a = unsafe0;
    }

    public final int a(Class class0) {
        return this.a.arrayBaseOffset(class0);
    }

    public final int b(Class class0) {
        return this.a.arrayIndexScale(class0);
    }

    public abstract boolean c(long arg1, Object arg2);

    public abstract byte d(long arg1, Object arg2);

    public abstract double e(long arg1, Object arg2);

    public abstract float f(long arg1, Object arg2);

    public final int g(long v, Object object0) {
        return this.a.getInt(object0, v);
    }

    public final long h(long v, Object object0) {
        return this.a.getLong(object0, v);
    }

    public final Object i(long v, Object object0) {
        return this.a.getObject(object0, v);
    }

    public final long j(Field field0) {
        return this.a.objectFieldOffset(field0);
    }

    public abstract void k(Object arg1, long arg2, boolean arg3);

    public abstract void l(Object arg1, long arg2, byte arg3);

    public abstract void m(Object arg1, long arg2, double arg3);

    public abstract void n(Object arg1, long arg2, float arg3);

    public final void o(int v, long v1, Object object0) {
        this.a.putInt(object0, v1, v);
    }

    public final void p(long v, long v1, Object object0) {
        this.a.putLong(object0, v, v1);
    }

    public final void q(long v, Object object0, Object object1) {
        this.a.putObject(object0, v, object1);
    }

    public boolean r() {
        Class class0 = Class.class;
        Class class1 = Object.class;
        Unsafe unsafe0 = this.a;
        if(unsafe0 == null) {
            return false;
        }
        try {
            Class class2 = unsafe0.getClass();
            class2.getMethod("objectFieldOffset", Field.class);
            class2.getMethod("arrayBaseOffset", class0);
            class2.getMethod("arrayIndexScale", class0);
            Class class3 = Long.TYPE;
            class2.getMethod("getInt", class1, class3);
            class2.getMethod("putInt", class1, class3, Integer.TYPE);
            class2.getMethod("getLong", class1, class3);
            class2.getMethod("putLong", class1, class3, class3);
            class2.getMethod("getObject", class1, class3);
            class2.getMethod("putObject", class1, class3, class1);
            return true;
        }
        catch(Throwable throwable0) {
            n0.a(throwable0);
            return false;
        }
    }

    public abstract boolean s();
}

