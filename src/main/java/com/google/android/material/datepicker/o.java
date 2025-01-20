package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;

public final class o implements AdapterView.OnItemClickListener {
    public final MaterialCalendarGridView X;
    public final q Y;

    public o(q q0, MaterialCalendarGridView materialCalendarGridView0) {
        this.Y = q0;
        this.X = materialCalendarGridView0;
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        n n0 = this.X.a();
        if(v >= n0.X.g() && v <= n0.b() && ((long)this.X.a().a(v)) >= ((DateValidatorPointForward)this.Y.f.a.Z0.Z).X) {
            throw null;
        }
    }
}

