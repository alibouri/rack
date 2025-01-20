package E3;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class e implements ThreadFactory {
    public final ThreadGroup a;
    public final AtomicInteger b;
    public final String c;
    public static final AtomicInteger d;

    static {
        e.d = new AtomicInteger(1);
    }

    public e() {
        this.b = new AtomicInteger(1);
        SecurityManager securityManager0 = System.getSecurityManager();
        this.a = securityManager0 == null ? Thread.currentThread().getThreadGroup() : securityManager0.getThreadGroup();
        this.c = "lottie-" + e.d.getAndIncrement() + "-thread-";
    }

    @Override
    public final Thread newThread(Runnable runnable0) {
        Thread thread0 = new Thread(this.a, runnable0, this.c + this.b.getAndIncrement(), 0L);
        thread0.setDaemon(false);
        thread0.setPriority(10);
        return thread0;
    }
}

