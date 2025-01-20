package Q4;

import android.hardware.SensorManager;
import f5.a;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

public final class d {
    public static final d a;
    public static final m b;
    public static SensorManager c;
    public static l d;
    public static String e;
    public static final AtomicBoolean f;
    public static final AtomicBoolean g;
    public static volatile boolean h;

    static {
        d.a = new d();  // initializer: Ljava/lang/Object;-><init>()V
        d.b = new m();  // initializer: Ljava/lang/Object;-><init>()V
        d.f = new AtomicBoolean(true);
        d.g = new AtomicBoolean(false);
    }

    public static final String a() {
        Class class0 = d.class;
        if(a.b(class0)) {
            return null;
        }
        try {
            if(d.e == null) {
                d.e = UUID.randomUUID().toString();
            }
            String s = d.e;
            if(s == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            return s;
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, class0);
        return null;
    }
}

