package o;

import i.s;

public class L extends s {
    public final N Y;

    public L(N n0) {
        this.Y = n0;
        super(n0);
    }

    @Override  // i.s
    public final void e(int v) {
        this.Y.setLastBaselineToBottomHeight(v);
    }

    @Override  // i.s
    public final void t(int v) {
        this.Y.setFirstBaselineToTopHeight(v);
    }
}

