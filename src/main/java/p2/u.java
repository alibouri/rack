package p2;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.I;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.j;
import com.sendwave.components.SimpleRecyclerView;

public final class u extends GestureDetector.SimpleOnGestureListener {
    public boolean a;
    public final j b;

    public u(j j0) {
        this.b = j0;
        super();
        this.a = true;
    }

    @Override  // android.view.GestureDetector$SimpleOnGestureListener
    public final boolean onDown(MotionEvent motionEvent0) {
        return true;
    }

    @Override  // android.view.GestureDetector$SimpleOnGestureListener
    public final void onLongPress(MotionEvent motionEvent0) {
        if(!this.a) {
            return;
        }
        j j0 = this.b;
        View view0 = j0.m(motionEvent0);
        if(view0 != null) {
            I i0 = j0.r.L(view0);
            if(i0 != null) {
                SimpleRecyclerView simpleRecyclerView0 = j0.r;
                if((i.a(j0.m.f(simpleRecyclerView0, i0), simpleRecyclerView0.getLayoutDirection()) & 0xFF0000) != 0) {
                    int v = motionEvent0.getPointerId(0);
                    int v1 = j0.l;
                    if(v == v1) {
                        int v2 = motionEvent0.findPointerIndex(v1);
                        float f = motionEvent0.getX(v2);
                        float f1 = motionEvent0.getY(v2);
                        j0.d = f;
                        j0.e = f1;
                        j0.i = 0.0f;
                        j0.h = 0.0f;
                        j0.m.getClass();
                        j0.r(i0, 2);
                    }
                }
            }
        }
    }
}

