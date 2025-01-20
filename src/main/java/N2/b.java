package n2;

import java.util.concurrent.Executor;
import p.a;

public final class b implements Executor {
    public final int X;

    public b(int v) {
        this.X = v;
        super();
    }

    @Override
    public final void execute(Runnable runnable0) {
        switch(this.X) {
            case 0: {
                runnable0.run();
                return;
            }
            case 1: {
                a.V().W(runnable0);
                return;
            }
            default: {
                a.V().a.b.execute(runnable0);
            }
        }
    }
}

