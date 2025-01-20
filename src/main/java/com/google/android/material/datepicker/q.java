package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.I;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import java.util.Calendar;
import p2.E;

public final class q extends Adapter {
    public final ContextThemeWrapper d;
    public final CalendarConstraints e;
    public final e f;
    public final int g;

    public q(ContextThemeWrapper contextThemeWrapper0, CalendarConstraints calendarConstraints0, e e0) {
        Month month0 = calendarConstraints0.b0;
        if(calendarConstraints0.X.b(month0) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if(month0.b(calendarConstraints0.Y) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        int v = contextThemeWrapper0.getResources().getDimensionPixelSize(0x7F070138) * n.b0;  // dimen:mtrl_calendar_day_height
        int v1 = k.Y(contextThemeWrapper0, 0x101020D) ? contextThemeWrapper0.getResources().getDimensionPixelSize(0x7F070138) : 0;  // dimen:mtrl_calendar_day_height
        this.d = contextThemeWrapper0;
        this.g = v + v1;
        this.e = calendarConstraints0;
        this.f = e0;
        this.p(true);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final int a() {
        return this.e.d0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final long b(int v) {
        Calendar calendar0 = t.a(this.e.X.X);
        calendar0.add(2, v);
        return new Month(calendar0).X.getTimeInMillis();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final void i(I i0, int v) {
        CalendarConstraints calendarConstraints0 = this.e;
        Calendar calendar0 = t.a(calendarConstraints0.X.X);
        calendar0.add(2, v);
        Month month0 = new Month(calendar0);
        String s = month0.h(((p)i0).a.getContext());
        ((p)i0).u.setText(s);
        MaterialCalendarGridView materialCalendarGridView0 = (MaterialCalendarGridView)((p)i0).v.findViewById(0x7F0A01DC);  // id:month_grid
        if(materialCalendarGridView0.a() != null && month0.equals(materialCalendarGridView0.a().X)) {
            materialCalendarGridView0.invalidate();
            materialCalendarGridView0.a().getClass();
            throw null;
        }
        new n(month0, calendarConstraints0);
        throw null;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final I j(ViewGroup viewGroup0, int v) {
        LinearLayout linearLayout0 = (LinearLayout)LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0D008B, viewGroup0, false);  // layout:mtrl_calendar_month_labeled
        if(k.Y(viewGroup0.getContext(), 0x101020D)) {
            linearLayout0.setLayoutParams(new E(-1, this.g));
            return new p(linearLayout0, true);
        }
        return new p(linearLayout0, false);
    }
}

