package J1;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

public final class r implements Runnable {
    public final int X;
    public final View Y;

    public r(View view0, int v) {
        this.X = v;
        this.Y = view0;
        super();
    }

    @Override
    public final void run() {
        if(this.X != 0) {
            this.Y.setEnabled(true);
            return;
        }
        ((InputMethodManager)this.Y.getContext().getSystemService("input_method")).showSoftInput(this.Y, 0);
    }
}

