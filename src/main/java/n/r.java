package n;

import R2.h;
import android.widget.PopupWindow.OnDismissListener;
import q9.K0;

public final class r implements PopupWindow.OnDismissListener {
    public final int X;
    public final Object Y;

    public r(int v, Object object0) {
        this.X = v;
        this.Y = object0;
        super();
    }

    @Override  // android.widget.PopupWindow$OnDismissListener
    public final void onDismiss() {
        if(this.X != 0) {
            K0 k00 = (K0)((h)this.Y).d;
            if(k00 != null) {
                k00.a.i(null);
            }
            return;
        }
        ((s)this.Y).c();
    }
}

