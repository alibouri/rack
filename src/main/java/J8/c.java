package j8;

import e8.n;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

public final class c extends b {
    public final Object b;
    public final Field c;
    public static Class d;

    public c() {
        Object object0;
        Field field0 = null;
        try {
            Class class0 = Class.forName("sun.misc.Unsafe");
            c.d = class0;
            Field field1 = class0.getDeclaredField("theUnsafe");
            field1.setAccessible(true);
            object0 = null;
            object0 = field1.get(null);
        }
        catch(Exception unused_ex) {
        }
        try {
            this.b = object0;
            field0 = AccessibleObject.class.getDeclaredField("override");
        }
        catch(NoSuchFieldException unused_ex) {
        }
        this.c = field0;
    }

    @Override  // j8.b
    public final void a(AccessibleObject accessibleObject0) {
        Object object0 = this.b;
        if(object0 != null) {
            Field field0 = this.c;
            if(field0 != null) {
                try {
                    Long long0 = (Long)c.d.getMethod("objectFieldOffset", Field.class).invoke(object0, field0);
                    long0.getClass();
                    c.d.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(object0, accessibleObject0, long0, Boolean.TRUE);
                    return;
                }
                catch(Exception unused_ex) {
                }
            }
        }
        try {
            accessibleObject0.setAccessible(true);
        }
        catch(SecurityException securityException0) {
            throw new n("Gson couldn\'t modify fields for " + accessibleObject0 + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", securityException0);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
        }
    }
}

