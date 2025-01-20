package R9;

import Nb.j;
import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.RecyclerView.OnScrollListener;
import androidx.recyclerview.widget.RecyclerView;
import ca.i;
import com.wave.customer.BuyAirtimeSelectActivity;

public final class x extends OnScrollListener {
    public final BuyAirtimeSelectActivity a;

    public x(BuyAirtimeSelectActivity buyAirtimeSelectActivity0) {
        this.a = buyAirtimeSelectActivity0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnScrollListener
    public final void a(RecyclerView recyclerView0, int v) {
        j.f(recyclerView0, "recyclerView");
        if(v == 1) {
            BuyAirtimeSelectActivity buyAirtimeSelectActivity0 = this.a;
            i i0 = buyAirtimeSelectActivity0.F0;
            if(i0 != null) {
                i0.r.clearFocus();
                Object object0 = buyAirtimeSelectActivity0.getSystemService("input_method");
                j.d(object0, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager)object0).hideSoftInputFromWindow(recyclerView0.getWindowToken(), 0);
                return;
            }
            j.p("binding");
            throw null;
        }
    }
}

