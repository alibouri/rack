package K6;

import Nb.j;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.FrameLayout;
import com.google.android.material.textfield.c;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.OnBalloonOutsideTouchListener;
import hb.h;
import o.N0;

public final class l implements View.OnTouchListener {
    public final int X;
    public final Object Y;
    public final Object Z;

    public l(c c0, AutoCompleteTextView autoCompleteTextView0) {
        this.X = 0;
        super();
        this.Z = c0;
        this.Y = autoCompleteTextView0;
    }

    public l(Balloon balloon0, OnBalloonOutsideTouchListener onBalloonOutsideTouchListener0) {
        this.X = 1;
        super();
        this.Y = balloon0;
        this.Z = onBalloonOutsideTouchListener0;
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        if(this.X != 0) {
            j.f(view0, "view");
            j.f(motionEvent0, "event");
            int v = motionEvent0.getAction();
            OnBalloonOutsideTouchListener onBalloonOutsideTouchListener0 = (OnBalloonOutsideTouchListener)this.Z;
            Balloon balloon0 = (Balloon)this.Y;
            if(v == 4) {
                if(balloon0.Y.B) {
                    balloon0.d();
                }
                if(onBalloonOutsideTouchListener0 == null) {
                    return true;
                }
                onBalloonOutsideTouchListener0.b(view0, motionEvent0);
                return true;
            }
            if(balloon0.Y.C && motionEvent0.getAction() == 1) {
                N0 n00 = balloon0.Z;
                if(((float)h.U(((FrameLayout)n00.f0)).x) > motionEvent0.getRawX()) {
                    goto label_17;
                }
                int v1 = h.U(((FrameLayout)n00.f0)).x;
                if(((float)(((FrameLayout)n00.f0).getMeasuredWidth() + v1)) < motionEvent0.getRawX()) {
                label_17:
                    if(balloon0.Y.B) {
                        balloon0.d();
                    }
                    if(onBalloonOutsideTouchListener0 != null) {
                        onBalloonOutsideTouchListener0.b(view0, motionEvent0);
                        return true;
                    }
                    return true;
                }
            }
            return false;
        }
        if(motionEvent0.getAction() == 1) {
            c c0 = (c)this.Z;
            c0.getClass();
            long v2 = System.currentTimeMillis() - c0.k;
            if(v2 < 0L || v2 > 300L) {
                c0.i = false;
            }
            c.d(c0, ((AutoCompleteTextView)this.Y));
        }
        return false;
    }
}

