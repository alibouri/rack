package I6;

import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;

public final class a implements View.OnTouchListener {
    public final int X;

    public a(int v) {
        this.X = v;
        super();
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        return true;
    }
}

