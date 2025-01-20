package T6;

import o6.i;

public abstract class f implements Runnable {
    public final i X;

    public f() {
        this.X = null;
    }

    public f(i i0) {
        this.X = i0;
    }

    public abstract void a();

    @Override
    public final void run() {
        try {
            this.a();
        }
        catch(Exception exception0) {
            i i0 = this.X;
            if(i0 != null) {
                i0.c(exception0);
            }
        }
    }
}

