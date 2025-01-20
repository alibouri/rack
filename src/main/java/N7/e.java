package n7;

import i.J;

public final class e implements Runnable {
    public final int X;
    public final f Y;
    public final Runnable Z;
    public final J b0;

    public e(f f0, Runnable runnable0, J j0, int v) {
        this.X = v;
        this.Y = f0;
        this.Z = runnable0;
        this.b0 = j0;
        super();
    }

    @Override
    public final void run() {
        switch(this.X) {
            case 0: {
                this.Y.getClass();
                c c1 = new c(this.Z, this.b0, 0);
                this.Y.X.execute(c1);
                return;
            }
            case 1: {
                this.Y.getClass();
                c c2 = new c(this.Z, this.b0, 2);
                this.Y.X.execute(c2);
                return;
            }
            default: {
                this.Y.getClass();
                c c0 = new c(this.Z, this.b0, 1);
                this.Y.X.execute(c0);
            }
        }
    }
}

