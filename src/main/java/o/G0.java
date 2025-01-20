package o;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

public final class g0 implements Runnable {
    public final int X;
    public final h0 Y;

    public g0(h0 h00, int v) {
        this.X = v;
        this.Y = h00;
        super();
    }

    @Override
    public final void run() {
        if(this.X != 0) {
            h0 h00 = this.Y;
            h00.a();
            View view0 = h00.b0;
            if(view0.isEnabled() && !view0.isLongClickable() && h00.c()) {
                view0.getParent().requestDisallowInterceptTouchEvent(true);
                long v = SystemClock.uptimeMillis();
                MotionEvent motionEvent0 = MotionEvent.obtain(v, v, 3, 0.0f, 0.0f, 0);
                view0.onTouchEvent(motionEvent0);
                motionEvent0.recycle();
                h00.e0 = true;
            }
            return;
        }
        ViewParent viewParent0 = this.Y.b0.getParent();
        if(viewParent0 != null) {
            viewParent0.requestDisallowInterceptTouchEvent(true);
        }
    }
}

