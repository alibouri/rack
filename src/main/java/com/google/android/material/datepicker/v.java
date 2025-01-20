package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.I;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import java.util.Locale;

public final class v extends Adapter {
    public final j d;

    public v(j j0) {
        this.d = j0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final int a() {
        return this.d.Z0.c0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final void i(I i0, int v) {
        int v1 = this.d.Z0.X.Z + v;
        Locale locale0 = Locale.getDefault();
        ((u)i0).u.setText(String.format(locale0, "%d", v1));
        ((u)i0).u.setContentDescription(String.format("Navigate to year %1$s", v1));
        boolean z = t.b().get(1) != v1;
        throw null;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final I j(ViewGroup viewGroup0, int v) {
        return new u(((TextView)LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0D008F, viewGroup0, false)));  // layout:mtrl_calendar_year
    }
}

