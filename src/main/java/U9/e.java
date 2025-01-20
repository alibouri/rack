package u9;

import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;
import kotlin.jvm.functions.Function2;

public final class e implements View.OnTouchListener {
    public final Function2 X;

    public e(Function2 function20) {
        this.X = function20;
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        return ((Boolean)this.X.j(view0, motionEvent0)).booleanValue();
    }
}

