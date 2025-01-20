package p2;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.recyclerview.widget.I;
import androidx.recyclerview.widget.j;
import java.util.ArrayList;

public final class s implements G {
    public final j a;

    public s(j j0) {
        this.a = j0;
    }

    @Override  // p2.G
    public final void b(MotionEvent motionEvent0) {
        j j0 = this.a;
        j0.x.a.onTouchEvent(motionEvent0);
        VelocityTracker velocityTracker0 = j0.t;
        if(velocityTracker0 != null) {
            velocityTracker0.addMovement(motionEvent0);
        }
        if(j0.l == -1) {
            return;
        }
        int v = motionEvent0.getActionMasked();
        int v1 = motionEvent0.findPointerIndex(j0.l);
        if(v1 >= 0) {
            j0.j(v, v1, motionEvent0);
        }
        int v2 = 0;
        I i0 = j0.c;
        if(i0 == null) {
            return;
        }
        switch(v) {
            case 1: {
                j0.r(null, 0);
                j0.l = -1;
                return;
            }
            case 2: {
                if(v1 >= 0) {
                    j0.s(j0.o, v1, motionEvent0);
                    j0.p(i0);
                    j0.r.removeCallbacks(j0.s);
                    j0.s.run();
                    j0.r.invalidate();
                    return;
                }
                break;
            }
            case 3: {
                VelocityTracker velocityTracker1 = j0.t;
                if(velocityTracker1 != null) {
                    velocityTracker1.clear();
                }
                j0.r(null, 0);
                j0.l = -1;
                return;
            }
            case 6: {
                int v3 = motionEvent0.getActionIndex();
                if(motionEvent0.getPointerId(v3) == j0.l) {
                    if(v3 == 0) {
                        v2 = 1;
                    }
                    j0.l = motionEvent0.getPointerId(v2);
                    j0.s(j0.o, v3, motionEvent0);
                    return;
                }
                break;
            }
        }
    }

    @Override  // p2.G
    public final boolean c(MotionEvent motionEvent0) {
        j j0 = this.a;
        j0.x.a.onTouchEvent(motionEvent0);
        int v = motionEvent0.getActionMasked();
        t t0 = null;
        if(v == 0) {
            j0.l = motionEvent0.getPointerId(0);
            j0.d = motionEvent0.getX();
            j0.e = motionEvent0.getY();
            VelocityTracker velocityTracker0 = j0.t;
            if(velocityTracker0 != null) {
                velocityTracker0.recycle();
            }
            j0.t = VelocityTracker.obtain();
            if(j0.c == null) {
                ArrayList arrayList0 = j0.p;
                if(!arrayList0.isEmpty()) {
                    View view0 = j0.m(motionEvent0);
                    for(int v1 = arrayList0.size() - 1; v1 >= 0; --v1) {
                        t t1 = (t)arrayList0.get(v1);
                        if(t1.e.a == view0) {
                            t0 = t1;
                            break;
                        }
                    }
                }
                if(t0 != null) {
                    j0.d -= t0.i;
                    j0.e -= t0.j;
                    I i0 = t0.e;
                    j0.l(i0, true);
                    if(j0.a.remove(i0.a)) {
                        j0.m.d(j0.r, i0);
                    }
                    j0.r(i0, t0.f);
                    j0.s(j0.o, 0, motionEvent0);
                }
            }
        }
        else if(v == 1 || v == 3) {
            j0.l = -1;
            j0.r(null, 0);
        }
        else {
            int v2 = j0.l;
            if(v2 != -1) {
                int v3 = motionEvent0.findPointerIndex(v2);
                if(v3 >= 0) {
                    j0.j(v, v3, motionEvent0);
                }
            }
        }
        VelocityTracker velocityTracker1 = j0.t;
        if(velocityTracker1 != null) {
            velocityTracker1.addMovement(motionEvent0);
        }
        return j0.c != null;
    }

    @Override  // p2.G
    public final void e(boolean z) {
        if(!z) {
            return;
        }
        this.a.r(null, 0);
    }
}

