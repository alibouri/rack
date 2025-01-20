package K;

import java.util.function.IntConsumer;
import qb.a;
import y1.b;

public final class g implements Runnable {
    public final int X;
    public final int Y;
    public final Object Z;

    public g(int v, int v1, Object object0) {
        this.X = v1;
        this.Z = object0;
        this.Y = v;
        super();
    }

    @Override
    public final void run() {
        switch(this.X) {
            case 0: {
                ((IntConsumer)this.Z).accept(this.Y);
                return;
            }
            case 1: {
                ((a)this.Z).b0.getDecorView().setSystemUiVisibility(((a)this.Z).b0.getDecorView().getSystemUiVisibility() & 0xFFFFDFFF);
                ((a)this.Z).b0.setStatusBarColor(this.Y);
                return;
            }
            default: {
                ((b)this.Z).j(this.Y);
            }
        }
    }
}

