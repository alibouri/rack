package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.OnScrollListener;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;

public final class g extends OnScrollListener {
    public final q a;
    public final MaterialButton b;
    public final j c;

    public g(j j0, q q0, MaterialButton materialButton0) {
        this.c = j0;
        this.a = q0;
        this.b = materialButton0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnScrollListener
    public final void a(RecyclerView recyclerView0, int v) {
        if(v == 0) {
            recyclerView0.announceForAccessibility(this.b.getText());
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnScrollListener
    public final void b(RecyclerView recyclerView0, int v, int v1) {
        int v2 = v >= 0 ? ((LinearLayoutManager)this.c.e1.getLayoutManager()).K0() : ((LinearLayoutManager)this.c.e1.getLayoutManager()).J0();
        Calendar calendar0 = t.a(this.a.e.X.X);
        calendar0.add(2, v2);
        this.c.a1 = new Month(calendar0);
        Calendar calendar1 = t.a(this.a.e.X.X);
        calendar1.add(2, v2);
        String s = new Month(calendar1).h(this.a.d);
        this.b.setText(s);
    }
}

