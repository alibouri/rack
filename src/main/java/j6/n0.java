package j6;

public final class N0 implements Runnable {
    public final int X;
    public final L0 Y;

    public N0(L0 l00, int v) {
        this.X = v;
        this.Y = l00;
        super();
    }

    @Override
    public final void run() {
        if(this.X != 0) {
            this.Y.i0 = null;
            return;
        }
        this.Y.d0 = this.Y.i0;
    }
}

