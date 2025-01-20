package I2;

import Nb.j;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class d {
    public static final ExecutorService a(boolean z) {
        ExecutorService executorService0 = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new c(z));
        j.e(executorService0, "newFixedThreadPool(\n    …)),\n        factory\n    )");
        return executorService0;
    }
}

