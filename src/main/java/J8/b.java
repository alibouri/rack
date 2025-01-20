package j8;

import g8.g;
import java.lang.reflect.AccessibleObject;

public abstract class b {
    public static final b a;

    static {
        a a0 = g.a < 9 ? new a() : new c();  // initializer: Ljava/lang/Object;-><init>()V
        b.a = a0;
    }

    public abstract void a(AccessibleObject arg1);
}

