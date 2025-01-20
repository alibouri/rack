package E5;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class h extends ThreadPoolExecutor {
    public final k X;

    public h(k k0) {
        this.X = k0;
        super(1, 1, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue());
        this.setThreadFactory(new i());  // initializer: Ljava/lang/Object;-><init>()V
        this.allowCoreThreadTimeOut(true);
    }

    @Override
    public final RunnableFuture newTaskFor(Runnable runnable0, Object object0) {
        return new g(this, runnable0, object0);
    }
}

