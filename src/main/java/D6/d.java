package d6;

import java.util.concurrent.Executor;

public final class d implements Executor {
    public final int X;
    public static final d Y;

    static {
        d.Y = new d(0);
    }

    public d(int v) {
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
                runnable0.run();
                return;
            }
            case 2: {
                new Thread(runnable0).start();
                return;
            }
            default: {
                runnable0.run();
            }
        }
    }
}

