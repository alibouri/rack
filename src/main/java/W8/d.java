package W8;

import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;
import l9.f;
import o.o0;

public final class d implements View.OnTouchListener {
    public final int X;
    public final Object Y;

    public d(int v, Object object0) {
        this.X = v;
        this.Y = object0;
        super();
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        if(this.X != 0) {
            int v = motionEvent0.getAction();
            int v1 = (int)motionEvent0.getX();
            int v2 = (int)motionEvent0.getY();
            o0 o00 = (o0)this.Y;
            if(v == 0 && (o00.w0 != null && o00.w0.isShowing() && v1 >= 0 && v1 < o00.w0.getWidth() && v2 >= 0 && v2 < o00.w0.getHeight())) {
                o00.s0.postDelayed(o00.o0, 0xFAL);
                return false;
            }
            if(v == 1) {
                o00.s0.removeCallbacks(o00.o0);
            }
            return false;
        }
        e e0 = (e)this.Y;
        if(e0.E0 != null) {
            f f0 = e0.J0;
            if(f0 != null) {
                f0.b();
            }
        }
        return true;
    }
}

