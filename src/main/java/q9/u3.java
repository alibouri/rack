package q9;

import Nb.j;
import android.graphics.Rect;
import android.view.View.OnSystemUiVisibilityChangeListener;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;

public final class u3 implements View.OnSystemUiVisibilityChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    public int X;
    public final z3 Y;

    public u3(z3 z30) {
        this.Y = z30;
    }

    public final void a() {
        int v;
        boolean z = (this.X & 4) != 0;
        z3 z30 = this.Y;
        View view0 = z30.getWindow().getDecorView();
        j.e(view0, "getDecorView(...)");
        View view1 = z30.findViewById(0x1020002);
        FrameLayout frameLayout0 = view1 instanceof FrameLayout ? ((FrameLayout)view1) : null;
        if(frameLayout0 == null) {
            return;
        }
        if(z) {
            Rect rect0 = new Rect();
            view0.getWindowVisibleDisplayFrame(rect0);
            v = z30.getResources().getDisplayMetrics().heightPixels - rect0.bottom;
        }
        else {
            v = 0;
        }
        if(v > 0) {
            if(frameLayout0.getPaddingBottom() != v) {
                frameLayout0.setPadding(0, 0, 0, v);
            }
        }
        else if(frameLayout0.getPaddingBottom() != 0) {
            frameLayout0.setPadding(0, 0, 0, 0);
        }
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a();
    }

    @Override  // android.view.View$OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int v) {
        this.X = v;
        this.a();
    }
}

