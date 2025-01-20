package q9;

import Ea.r;
import Nb.j;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

public final class q1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final r X;
    public boolean Y;
    public final Rect Z;
    public final ViewGroup b0;

    public q1(k3 k30, r r0) {
        this.X = r0;
        this.Z = new Rect();
        View view0 = k30.findViewById(0x1020002);
        j.e(view0, "findViewById(...)");
        this.b0 = (ViewGroup)view0;
        ((ViewGroup)view0).getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.b0.getWindowVisibleDisplayFrame(this.Z);
        int v = this.b0.getRootView().getHeight();
        boolean z = ((double)(v - this.Z.bottom)) > ((double)v) * 0.15;
        if(z != this.Y) {
            this.X.n(Boolean.valueOf(z));
        }
        this.Y = z;
    }
}

