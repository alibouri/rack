package E5;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import m5.b;

public final class i implements ThreadFactory {
    public static final AtomicInteger a;

    static {
        i.a = new AtomicInteger();
    }

    @Override
    public final Thread newThread(Runnable runnable0) {
        return new j(runnable0, b.s(i.a.incrementAndGet(), "measurement-"));  // initializer: Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V
    }
}

