package J5;

import java.util.concurrent.Executor;

public final class f implements Executor {
    public final int X;
    public static final f Y;
    public static final f Z;

    static {
        f.Y = new f(0);
        f.Z = new f(1);
    }

    public f(int v) {
        this.X = v;
        super();
    }

    @Override
    public final void execute(Runnable runnable0) {
        if(this.X != 0) {
            runnable0.run();
            return;
        }
        runnable0.run();
    }
}

