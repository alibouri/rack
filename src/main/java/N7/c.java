package n7;

import i.J;

public final class c implements Runnable {
    public final int X;
    public final Runnable Y;
    public final J Z;

    public c(Runnable runnable0, J j0, int v) {
        this.X = v;
        this.Y = runnable0;
        this.Z = j0;
        super();
    }

    @Override
    public final void run() {
        switch(this.X) {
            case 0: {
                try {
                    this.Y.run();
                    return;
                }
                catch(Exception exception1) {
                    ((h)this.Z.Y).k(exception1);
                    throw exception1;
                }
            }
            case 1: {
                try {
                    this.Y.run();
                }
                catch(Exception exception2) {
                    ((h)this.Z.Y).k(exception2);
                }
                return;
            }
            default: {
                h h0 = (h)this.Z.Y;
                try {
                    this.Y.run();
                    h0.j(null);
                }
                catch(Exception exception0) {
                    h0.k(exception0);
                }
            }
        }
    }
}

