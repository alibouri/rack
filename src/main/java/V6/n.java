package V6;

import o6.i;

public abstract class n implements Runnable {
    public final i X;

    public n() {
        this.X = null;
    }

    public n(i i0) {
        this.X = i0;
    }

    public void a(Exception exception0) {
        i i0 = this.X;
        if(i0 != null) {
            i0.c(exception0);
        }
    }

    public abstract void b();

    @Override
    public final void run() {
        try {
            this.b();
        }
        catch(Exception exception0) {
            this.a(exception0);
        }
    }
}

