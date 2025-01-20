package o;

public final class m0 implements Runnable {
    public final int X;
    public final o0 Y;

    public m0(o0 o00, int v) {
        this.X = v;
        this.Y = o00;
        super();
    }

    @Override
    public final void run() {
        if(this.X != 0) {
            o0 o00 = this.Y;
            if(o00.Z != null && o00.Z.isAttachedToWindow() && o00.Z.getCount() > o00.Z.getChildCount() && o00.Z.getChildCount() <= o00.k0) {
                o00.w0.setInputMethodMode(2);
                o00.a();
            }
            return;
        }
        f0 f00 = this.Y.Z;
        if(f00 != null) {
            f00.setListSelectionHidden(true);
            f00.requestLayout();
        }
    }
}

