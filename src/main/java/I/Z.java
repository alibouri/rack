package i;

import Bb.q;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.view.c;
import androidx.appcompat.widget.ContentFrameLayout;

public final class z extends ContentFrameLayout {
    public final B j0;

    public z(B b0, c c0) {
        this.j0 = b0;
        super(c0, null);
    }

    // Deobfuscation rating: LOW(20)
    @Override  // android.view.ViewGroup
    public final boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        return this.j0.u(keyEvent0) || super.dispatchKeyEvent(keyEvent0);
    }

    @Override  // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        if(motionEvent0.getAction() == 0) {
            int v = (int)motionEvent0.getX();
            int v1 = (int)motionEvent0.getY();
            if(v < -5 || v1 < -5 || v > this.getWidth() + 5 || v1 > this.getHeight() + 5) {
                A a0 = this.j0.A(0);
                this.j0.s(a0, true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent0);
    }

    @Override  // android.view.View
    public final void setBackgroundResource(int v) {
        this.setBackgroundDrawable(q.v(this.getContext(), v));
    }
}

