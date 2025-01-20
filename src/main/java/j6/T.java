package j6;

public final class t implements Runnable {
    public final int X;
    public final long Y;
    public final y Z;

    public t(y y0, long v, int v1) {
        this.X = v1;
        this.Y = v;
        this.Z = y0;
        super();
    }

    @Override
    public final void run() {
        if(this.X != 0) {
            ((d0)((L0)this.Z).Y).l().u(this.Y);
            ((L0)this.Z).d0 = null;
            return;
        }
        ((n)this.Z).y(this.Y);
    }
}

