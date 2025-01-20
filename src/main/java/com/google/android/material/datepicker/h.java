package com.google.android.material.datepicker;

import android.view.View.OnClickListener;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

public final class h implements View.OnClickListener {
    public final q X;
    public final j Y;

    public h(j j0, q q0) {
        this.Y = j0;
        this.X = q0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        j j0 = this.Y;
        int v = ((LinearLayoutManager)j0.e1.getLayoutManager()).J0();
        if(v + 1 < j0.e1.getAdapter().a()) {
            Calendar calendar0 = t.a(this.X.e.X.X);
            calendar0.add(2, v + 1);
            j0.U(new Month(calendar0));
        }
    }
}

