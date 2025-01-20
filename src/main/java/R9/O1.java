package R9;

import Nb.j;
import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.RecyclerView.OnScrollListener;
import androidx.recyclerview.widget.RecyclerView;
import com.sendwave.components.SimpleRecyclerView;
import com.wave.customer.PaymentListActivity;
import q9.r1;

public final class o1 extends OnScrollListener {
    public final PaymentListActivity a;
    public final SimpleRecyclerView b;

    public o1(PaymentListActivity paymentListActivity0, SimpleRecyclerView simpleRecyclerView0) {
        this.a = paymentListActivity0;
        this.b = simpleRecyclerView0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnScrollListener
    public final void a(RecyclerView recyclerView0, int v) {
        j.f(recyclerView0, "recyclerView");
        PaymentListActivity paymentListActivity0 = this.a;
        if(v == 1) {
            Object object0 = paymentListActivity0.getSystemService("input_method");
            j.d(object0, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager)object0).hideSoftInputFromWindow(this.b.getWindowToken(), 0);
        }
        paymentListActivity0.getClass();
        r1.b(paymentListActivity0).e().d("scroll list of payments", null);
    }
}

