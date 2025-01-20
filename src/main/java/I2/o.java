package I2;

import Nb.j;
import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.Collections;

public final class o {
    public static final o a;
    public static final o b;
    public static final D c;
    public static final D d;

    static {
        o.a = new o();  // initializer: Ljava/lang/Object;-><init>()V
        o.b = new o();  // initializer: Ljava/lang/Object;-><init>()V
        o.c = new D(1);
        o.d = new D(0);
    }

    public o() {
        Collections.emptyList();
        Collections.emptyList();
    }

    public z a(Context context0, String s, WorkerParameters workerParameters0) {
        z z0;
        Class class0;
        j.f(context0, "appContext");
        j.f(s, "workerClassName");
        j.f(workerParameters0, "workerParameters");
        try {
            class0 = Class.forName(s).asSubclass(z.class);
            j.e(class0, "{\n                Class.…class.java)\n            }");
        }
        catch(Throwable throwable0) {
            A.e().d(L.a, "Invalid class: " + s, throwable0);
            throw throwable0;
        }
        try {
            Object object0 = class0.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context0, workerParameters0);
            j.e(object0, "{\n                val co…Parameters)\n            }");
            z0 = (z)object0;
        }
        catch(Throwable throwable1) {
            A.e().d(L.a, "Could not instantiate " + s, throwable1);
            throw throwable1;
        }
        if(z0.d) {
            throw new IllegalStateException("WorkerFactory (" + this.getClass().getName() + ") returned an instance of a ListenableWorker (" + s + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
        }
        return z0;
    }
}

