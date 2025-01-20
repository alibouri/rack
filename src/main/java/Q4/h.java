package Q4;

import Nb.j;
import R4.c;
import R4.g;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;
import java.lang.ref.WeakReference;

public final class h implements View.OnTouchListener {
    public final c X;
    public final WeakReference Y;
    public final WeakReference Z;
    public final View.OnTouchListener b0;
    public final boolean c0;

    public h(c c0, View view0, View view1) {
        this.X = c0;
        this.Y = new WeakReference(view1);
        this.Z = new WeakReference(view0);
        this.b0 = g.f(view1);
        this.c0 = true;
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        j.f(view0, "view");
        j.f(motionEvent0, "motionEvent");
        View view1 = (View)this.Z.get();
        View view2 = (View)this.Y.get();
        if(view1 != null && view2 != null && motionEvent0.getAction() == 1) {
            Q4.c.c(this.X, view1, view2);
        }
        return this.b0 != null && this.b0.onTouch(view0, motionEvent0);
    }
}

