package Fb;

import Nb.j;
import W5.f;
import java.io.Serializable;
import java.lang.reflect.Field;
import kotlin.coroutines.g;

public abstract class a implements d, Serializable, g {
    public final g X;

    public a(g g0) {
        this.X = g0;
    }

    // Deobfuscation rating: LOW(20)
    @Override  // Fb.d
    public d g() {
        return this.X instanceof d ? ((d)this.X) : null;
    }

    @Override  // kotlin.coroutines.g
    public final void i(Object object0) {
        g g1;
        g g0 = this;
        while(true) {
            a a0 = (a)g0;
            g1 = a0.X;
            j.c(g1);
            try {
                object0 = a0.v(object0);
            }
            catch(Throwable throwable0) {
                object0 = f.v(throwable0);
                goto label_11;
            }
            if(object0 == Eb.a.X) {
                return;
            }
        label_11:
            a0.w();
            if(!(g1 instanceof a)) {
                break;
            }
            g0 = g1;
        }
        g1.i(object0);
    }

    public g t(Object object0, g g0) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Continuation at ");
        StackTraceElement stackTraceElement0 = this.u();
        if(stackTraceElement0 == null) {
            stackTraceElement0 = this.getClass().getName();
        }
        stringBuilder0.append(stackTraceElement0);
        return stringBuilder0.toString();
    }

    public StackTraceElement u() {
        int v3;
        int v2;
        int v1;
        e e0 = (e)this.getClass().getAnnotation(e.class);
        StackTraceElement stackTraceElement0 = null;
        if(e0 != null) {
            int v = e0.v();
            if(v > 1) {
                throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v + ". Please update the Kotlin standard library.").toString());
            }
            try {
                v1 = -1;
                Field field0 = this.getClass().getDeclaredField("label");
                field0.setAccessible(true);
                Object object0 = field0.get(this);
                Integer integer0 = object0 instanceof Integer ? ((Integer)object0) : null;
                v2 = integer0 == null ? 0 : ((int)integer0);
            }
            catch(Exception unused_ex) {
                v3 = -1;
                goto label_18;
            }
            v3 = v2 - 1;
        label_18:
            if(v3 >= 0) {
                v1 = e0.l()[v3];
            }
            Fb.f f0 = Fb.g.b;
            Fb.f f1 = Fb.g.a;
            if(f0 == null) {
                try {
                    Fb.f f2 = new Fb.f(Class.class.getDeclaredMethod("getModule", null), this.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), this.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                    Fb.g.b = f2;
                    f0 = f2;
                }
                catch(Exception unused_ex) {
                    Fb.g.b = f1;
                    f0 = f1;
                }
            }
            if(f0 != f1) {
                Object object1 = f0.a == null ? null : f0.a.invoke(this.getClass(), null);
                if(object1 != null) {
                    Object object2 = f0.b == null ? null : f0.b.invoke(object1, null);
                    if(object2 != null) {
                        Object object3 = f0.c == null ? null : f0.c.invoke(object2, null);
                        if(object3 instanceof String) {
                            stackTraceElement0 = (String)object3;
                        }
                    }
                }
            }
            return stackTraceElement0 == null ? new StackTraceElement(e0.c(), e0.m(), e0.f(), v1) : new StackTraceElement(((String)stackTraceElement0) + '/' + e0.c(), e0.m(), e0.f(), v1);
        }
        return null;
    }

    public abstract Object v(Object arg1);

    public void w() {
    }
}

