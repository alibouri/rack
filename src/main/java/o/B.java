package o;

import androidx.appcompat.widget.ActionBarOverlayLayout;

public final class b implements Runnable {
    public final int X;
    public final ActionBarOverlayLayout Y;

    public b(ActionBarOverlayLayout actionBarOverlayLayout0, int v) {
        this.X = v;
        this.Y = actionBarOverlayLayout0;
        super();
    }

    @Override
    public final void run() {
        if(this.X != 0) {
            this.Y.e();
            this.Y.x0 = this.Y.e0.animate().translationY(((float)(-this.Y.e0.getHeight()))).setListener(this.Y.y0);
            return;
        }
        this.Y.e();
        this.Y.x0 = this.Y.e0.animate().translationY(0.0f).setListener(this.Y.y0);
    }
}

