package z6;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewConfiguration;

public final class a implements View.OnTouchListener {
    public final Dialog X;
    public final int Y;
    public final int Z;
    public final int b0;

    public a(Dialog dialog0, Rect rect0) {
        this.X = dialog0;
        this.Y = rect0.left;
        this.Z = rect0.top;
        this.b0 = ViewConfiguration.get(dialog0.getContext()).getScaledWindowTouchSlop();
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        View view1 = view0.findViewById(0x1020002);
        int v = view1.getLeft() + this.Y;
        int v1 = view1.getWidth();
        int v2 = view1.getTop() + this.Z;
        if(new RectF(((float)v), ((float)v2), ((float)(v1 + v)), ((float)(view1.getHeight() + v2))).contains(motionEvent0.getX(), motionEvent0.getY())) {
            return false;
        }
        MotionEvent motionEvent1 = MotionEvent.obtain(motionEvent0);
        if(motionEvent0.getAction() == 1) {
            motionEvent1.setAction(4);
        }
        if(Build.VERSION.SDK_INT < 28) {
            motionEvent1.setAction(0);
            motionEvent1.setLocation(((float)(-this.b0 - 1)), ((float)(-this.b0 - 1)));
        }
        view0.performClick();
        return this.X.onTouchEvent(motionEvent1);
    }
}

