package I2;

import android.content.Context;
import androidx.work.WorkerParameters;
import f1.l;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class z {
    public final Context a;
    public final WorkerParameters b;
    public final AtomicInteger c;
    public boolean d;

    public z(Context context0, WorkerParameters workerParameters0) {
        this.c = new AtomicInteger(0xFFFFFF00);
        if(context0 == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if(workerParameters0 == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.a = context0;
        this.b = workerParameters0;
    }

    public abstract l a();

    public abstract l b();
}

