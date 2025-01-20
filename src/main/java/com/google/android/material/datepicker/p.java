package com.google.android.material.datepicker;

import J1.A;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.I;

public final class p extends I {
    public final TextView u;
    public final MaterialCalendarGridView v;

    public p(LinearLayout linearLayout0, boolean z) {
        super(linearLayout0);
        TextView textView0 = (TextView)linearLayout0.findViewById(0x7F0A01E1);  // id:month_title
        this.u = textView0;
        new A(0x7F0A02DE, Boolean.class, 0, 28, 3).f(textView0, Boolean.TRUE);  // id:tag_accessibility_heading
        this.v = (MaterialCalendarGridView)linearLayout0.findViewById(0x7F0A01DC);  // id:month_grid
        if(!z) {
            textView0.setVisibility(8);
        }
    }
}

