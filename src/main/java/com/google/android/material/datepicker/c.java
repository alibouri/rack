package com.google.android.material.datepicker;

import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

public final class c extends BaseAdapter {
    public final Calendar X;
    public final int Y;
    public final int Z;
    public static final int b0;

    static {
        c.b0 = Build.VERSION.SDK_INT < 26 ? 1 : 4;
    }

    public c() {
        Calendar calendar0 = t.c(null);
        this.X = calendar0;
        this.Y = calendar0.getMaximum(7);
        this.Z = calendar0.getFirstDayOfWeek();
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        return this.Y;
    }

    @Override  // android.widget.Adapter
    public final Object getItem(int v) {
        int v1 = this.Y;
        if(v >= v1) {
            return null;
        }
        int v2 = v + this.Z;
        return (int)(v2 <= v1 ? v + this.Z : v2 - v1);
    }

    @Override  // android.widget.Adapter
    public final long getItemId(int v) {
        return 0L;
    }

    @Override  // android.widget.Adapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        View view1 = (TextView)view0;
        if(view0 == null) {
            view1 = (TextView)LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0D0087, viewGroup0, false);  // layout:mtrl_calendar_day_of_week
        }
        int v1 = v + this.Z;
        int v2 = this.Y;
        if(v1 > v2) {
            v1 -= v2;
        }
        this.X.set(7, v1);
        Configuration configuration0 = view1.getResources().getConfiguration();
        ((TextView)view1).setText(this.X.getDisplayName(7, c.b0, configuration0.locale));
        Locale locale0 = Locale.getDefault();
        view1.setContentDescription(String.format("Column of days: %1$s", this.X.getDisplayName(7, 2, locale0)));
        return view1;
    }
}

