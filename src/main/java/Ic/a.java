package ic;

import java.util.concurrent.Executor;

public final class a implements Executor {
    public static final a X;

    static {
        a.X = new a();  // initializer: Ljava/lang/Object;-><init>()V
    }

    @Override
    public final void execute(Runnable runnable0) {
        runnable0.run();
    }
}

