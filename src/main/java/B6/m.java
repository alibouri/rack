package B6;

import J1.C;
import R1.g;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;

public final class m implements View.OnAttachStateChangeListener {
    public final int X;

    public m(int v) {
        this.X = v;
        super();
    }

    private final void a(View view0) {
    }

    private final void b(View view0) {
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view0) {
        if(this.X != 0) {
            (view0 == null ? null : ((g)view0.getTag(0x7F0A0104))).a.run();  // id:dataBinding
            view0.removeOnAttachStateChangeListener(this);
            return;
        }
        view0.removeOnAttachStateChangeListener(this);
        C.c(view0);
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view0) {
    }
}

