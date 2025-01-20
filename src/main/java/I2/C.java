package I2;

import M.J;
import Nb.j;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class c implements ThreadFactory {
    public final AtomicInteger a;
    public final boolean b;

    public c(boolean z) {
        this.b = z;
        this.a = new AtomicInteger(0);
    }

    @Override
    public final Thread newThread(Runnable runnable0) {
        j.f(runnable0, "runnable");
        StringBuilder stringBuilder0 = J.i((this.b ? "WM.task-" : "androidx.work-"));
        stringBuilder0.append(this.a.incrementAndGet());
        return new Thread(runnable0, stringBuilder0.toString());
    }
}

