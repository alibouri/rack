package com.google.android.material.datepicker;

import B6.a;
import J1.N;
import M1.e;
import a8.Q;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.google.android.material.button.MaterialButton;

public final class j extends PickerFragment {
    public int Y0;
    public CalendarConstraints Z0;
    public Month a1;
    public int b1;
    public Q c1;
    public RecyclerView d1;
    public RecyclerView e1;
    public View f1;
    public View g1;

    @Override  // androidx.fragment.app.Fragment
    public final void A(Bundle bundle0) {
        super.A(bundle0);
        if(bundle0 == null) {
            bundle0 = this.d0;
        }
        this.Y0 = bundle0.getInt("THEME_RES_ID_KEY");
        if(bundle0.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.Z0 = (CalendarConstraints)bundle0.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.a1 = (Month)bundle0.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override  // androidx.fragment.app.Fragment
    public final View B(LayoutInflater layoutInflater0, ViewGroup viewGroup0) {
        int v1;
        int v;
        ContextThemeWrapper contextThemeWrapper0 = new ContextThemeWrapper(this.n(), this.Y0);
        this.c1 = new Q(contextThemeWrapper0);
        LayoutInflater layoutInflater1 = layoutInflater0.cloneInContext(contextThemeWrapper0);
        Month month0 = this.Z0.X;
        if(k.Y(contextThemeWrapper0, 0x101020D)) {
            v = 0x7F0D008E;  // layout:mtrl_calendar_vertical
            v1 = 1;
        }
        else {
            v = 0x7F0D0089;  // layout:mtrl_calendar_horizontal
            v1 = 0;
        }
        View view0 = layoutInflater1.inflate(v, viewGroup0, false);
        GridView gridView0 = (GridView)view0.findViewById(0x7F0A01E7);  // id:mtrl_calendar_days_of_week
        N.k(gridView0, new e(1));
        gridView0.setAdapter(new c());
        gridView0.setNumColumns(month0.b0);
        gridView0.setEnabled(false);
        this.e1 = (RecyclerView)view0.findViewById(0x7F0A01EA);  // id:mtrl_calendar_months
        d d0 = new d(this, v1, v1);
        this.e1.setLayoutManager(d0);
        this.e1.setTag("MONTHS_VIEW_GROUP_TAG");
        q q0 = new q(contextThemeWrapper0, this.Z0, new com.google.android.material.datepicker.e(this));
        this.e1.setAdapter(q0);
        int v2 = contextThemeWrapper0.getResources().getInteger(0x7F0B0017);  // integer:mtrl_calendar_year_selector_span
        RecyclerView recyclerView0 = (RecyclerView)view0.findViewById(0x7F0A01ED);  // id:mtrl_calendar_year_selector_frame
        this.d1 = recyclerView0;
        if(recyclerView0 != null) {
            recyclerView0.setHasFixedSize(true);
            this.d1.setLayoutManager(new GridLayoutManager(v2));
            this.d1.setAdapter(new v(this));
            this.d1.i(new f(this));
        }
        if(view0.findViewById(0x7F0A01DE) != null) {  // id:month_navigation_fragment_toggle
            MaterialButton materialButton0 = (MaterialButton)view0.findViewById(0x7F0A01DE);  // id:month_navigation_fragment_toggle
            materialButton0.setTag("SELECTOR_TOGGLE_TAG");
            N.k(materialButton0, new a(2, this));
            MaterialButton materialButton1 = (MaterialButton)view0.findViewById(0x7F0A01E0);  // id:month_navigation_previous
            materialButton1.setTag("NAVIGATION_PREV_TAG");
            MaterialButton materialButton2 = (MaterialButton)view0.findViewById(0x7F0A01DF);  // id:month_navigation_next
            materialButton2.setTag("NAVIGATION_NEXT_TAG");
            this.f1 = view0.findViewById(0x7F0A01ED);  // id:mtrl_calendar_year_selector_frame
            this.g1 = view0.findViewById(0x7F0A01E6);  // id:mtrl_calendar_day_selector_frame
            this.V(1);
            materialButton0.setText(this.a1.h(view0.getContext()));
            this.e1.j(new g(this, q0, materialButton0));
            materialButton0.setOnClickListener(new K6.e(3, this));
            materialButton2.setOnClickListener(new h(this, q0));
            materialButton1.setOnClickListener(new i(this, q0));
        }
        if(!k.Y(contextThemeWrapper0, 0x101020D)) {
            new r().b(this.e1);  // initializer: Landroidx/recyclerview/widget/N;-><init>()V
        }
        this.e1.h0(q0.e.X.j(this.a1));
        return view0;
    }

    @Override  // androidx.fragment.app.Fragment
    public final void I(Bundle bundle0) {
        bundle0.putInt("THEME_RES_ID_KEY", this.Y0);
        bundle0.putParcelable("GRID_SELECTOR_KEY", null);
        bundle0.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.Z0);
        bundle0.putParcelable("CURRENT_MONTH_KEY", this.a1);
    }

    public final void U(Month month0) {
        q q0 = (q)this.e1.getAdapter();
        int v = q0.e.X.j(month0);
        int v1 = v - q0.e.X.j(this.a1);
        boolean z = false;
        boolean z1 = Math.abs(v1) > 3;
        if(v1 > 0) {
            z = true;
        }
        this.a1 = month0;
        if(z1 && z) {
            this.e1.h0(v - 3);
            this.e1.post(new G1.a(v, 4, this));
            return;
        }
        if(z1) {
            this.e1.h0(v + 3);
            this.e1.post(new G1.a(v, 4, this));
            return;
        }
        this.e1.post(new G1.a(v, 4, this));
    }

    public final void V(int v) {
        this.b1 = v;
        if(v == 2) {
            this.d1.getLayoutManager().m0(this.a1.Z - ((v)this.d1.getAdapter()).d.Z0.X.Z);
            this.f1.setVisibility(0);
            this.g1.setVisibility(8);
            return;
        }
        if(v == 1) {
            this.f1.setVisibility(8);
            this.g1.setVisibility(0);
            this.U(this.a1);
        }
    }
}

