package p;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class b implements ThreadFactory {
    public final AtomicInteger a;

    public b() {
        this.a = new AtomicInteger(0);
    }

    @Override
    public final Thread newThread(Runnable runnable0) {
        Thread thread0 = new Thread(runnable0);
        thread0.setName("arch_disk_io_" + this.a.getAndIncrement());
        return thread0;
    }
}

