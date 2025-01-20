package o;

import android.widget.AbsListView.OnScrollListener;
import android.widget.AbsListView;

public final class n0 implements AbsListView.OnScrollListener {
    public final o0 a;

    public n0(o0 o00) {
        this.a = o00;
    }

    @Override  // android.widget.AbsListView$OnScrollListener
    public final void onScroll(AbsListView absListView0, int v, int v1, int v2) {
    }

    @Override  // android.widget.AbsListView$OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView0, int v) {
        if(v == 1) {
            o0 o00 = this.a;
            if(o00.w0.getInputMethodMode() != 2 && o00.w0.getContentView() != null) {
                o00.s0.removeCallbacks(o00.o0);
                o00.o0.run();
            }
        }
    }
}

