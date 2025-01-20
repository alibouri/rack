package I2;

import Nb.j;
import java.util.concurrent.Executor;

public enum p implements Executor {
    INSTANCE;

    @Override
    public final void execute(Runnable runnable0) {
        j.f(runnable0, "command");
        runnable0.run();
    }

    @Override
    public final String toString() {
        return "DirectExecutor";
    }
}

