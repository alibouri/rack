package K9;

import L9.k;
import Nb.j;
import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.RecyclerView.OnScrollListener;
import androidx.recyclerview.widget.RecyclerView;

public final class r0 extends OnScrollListener {
    public final t0 a;

    public r0(t0 t00) {
        this.a = t00;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnScrollListener
    public final void a(RecyclerView recyclerView0, int v) {
        j.f(recyclerView0, "recyclerView");
        if(v == 1) {
            t0 t00 = this.a;
            k k0 = t00.F0;
            if(k0 != null) {
                k0.q.clearFocus();
                Object object0 = t00.getSystemService("input_method");
                j.d(object0, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager)object0).hideSoftInputFromWindow(recyclerView0.getWindowToken(), 0);
                return;
            }
            j.p("binding");
            throw null;
        }
    }
}

