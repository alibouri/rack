package n7;

import java.util.concurrent.Executor;

public enum i implements Executor {
    INSTANCE;

    @Override
    public final void execute(Runnable runnable0) {
        runnable0.run();
    }
}

