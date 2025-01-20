package com.google.android.material.datepicker;

import H6.f;
import V0.a;
import V4.o;
import a8.Q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.icu.text.DateFormat;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public final class n extends BaseAdapter {
    public final Month X;
    public Q Y;
    public final CalendarConstraints Z;
    public static final int b0;

    static {
        n.b0 = t.c(null).getMaximum(4);
    }

    public n(Month month0, CalendarConstraints calendarConstraints0) {
        this.X = month0;
        this.Z = calendarConstraints0;
        throw null;
    }

    public final Long a(int v) {
        Month month0 = this.X;
        if(v >= month0.g() && v <= this.b()) {
            int v1 = month0.g();
            Calendar calendar0 = t.a(month0.X);
            calendar0.set(5, v - v1 + 1);
            return calendar0.getTimeInMillis();
        }
        return null;
    }

    public final int b() {
        return this.X.g() + this.X.c0 - 1;
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        int v = this.X.g();
        return this.X.c0 + v;
    }

    @Override  // android.widget.Adapter
    public final Object getItem(int v) {
        return this.a(v);
    }

    @Override  // android.widget.Adapter
    public final long getItemId(int v) {
        return (long)(v / this.X.b0);
    }

    @Override  // android.widget.Adapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        String s1;
        String s;
        Context context0 = viewGroup0.getContext();
        if(this.Y == null) {
            this.Y = new Q(context0);
        }
        View view1 = (TextView)view0;
        if(view0 == null) {
            view1 = (TextView)LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0D0086, viewGroup0, false);  // layout:mtrl_calendar_day
        }
        Month month0 = this.X;
        int v1 = v - month0.g();
        if(v1 < 0 || v1 >= month0.c0) {
            view1.setVisibility(8);
            ((TextView)view1).setEnabled(false);
        }
        else {
            view1.setTag(month0);
            ((TextView)view1).setText(String.format(view1.getResources().getConfiguration().locale, "%d", ((int)(v1 + 1))));
            Calendar calendar0 = t.a(month0.X);
            calendar0.set(5, v1 + 1);
            long v2 = calendar0.getTimeInMillis();
            Month month1 = new Month(t.b());
            if(month0.Z == month1.Z) {
                Locale locale0 = Locale.getDefault();
                if(Build.VERSION.SDK_INT >= 24) {
                    DateFormat dateFormat0 = DateFormat.getInstanceForSkeleton("MMMEd", locale0);
                    dateFormat0.setTimeZone(a.f());
                    s = dateFormat0.format(new Date(v2));
                }
                else {
                    java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0, locale0);
                    dateFormat1.setTimeZone(TimeZone.getTimeZone("UTC"));
                    s = dateFormat1.format(new Date(v2));
                }
                view1.setContentDescription(s);
            }
            else {
                Locale locale1 = Locale.getDefault();
                if(Build.VERSION.SDK_INT >= 24) {
                    DateFormat dateFormat2 = DateFormat.getInstanceForSkeleton("yMMMEd", locale1);
                    dateFormat2.setTimeZone(a.f());
                    s1 = dateFormat2.format(new Date(v2));
                }
                else {
                    java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance(0, locale1);
                    dateFormat3.setTimeZone(TimeZone.getTimeZone("UTC"));
                    s1 = dateFormat3.format(new Date(v2));
                }
                view1.setContentDescription(s1);
            }
            view1.setVisibility(0);
            ((TextView)view1).setEnabled(true);
        }
        Long long0 = this.a(v);
        if(long0 != null) {
            if(((long)long0) < ((DateValidatorPointForward)this.Z.Z).X) {
                ((TextView)view1).setEnabled(false);
                o o0 = (o)this.Y.b0;
                o0.getClass();
                MaterialShapeDrawable materialShapeDrawable0 = new MaterialShapeDrawable();
                MaterialShapeDrawable materialShapeDrawable1 = new MaterialShapeDrawable();
                ShapeAppearanceModel shapeAppearanceModel0 = (ShapeAppearanceModel)o0.f;
                materialShapeDrawable0.setShapeAppearanceModel(shapeAppearanceModel0);
                materialShapeDrawable1.setShapeAppearanceModel(shapeAppearanceModel0);
                materialShapeDrawable0.j(((ColorStateList)o0.d));
                materialShapeDrawable0.X.j = (float)o0.a;
                materialShapeDrawable0.invalidateSelf();
                f f0 = materialShapeDrawable0.X;
                ColorStateList colorStateList0 = f0.d;
                ColorStateList colorStateList1 = (ColorStateList)o0.e;
                if(colorStateList0 != colorStateList1) {
                    f0.d = colorStateList1;
                    materialShapeDrawable0.onStateChange(materialShapeDrawable0.getState());
                }
                ColorStateList colorStateList2 = (ColorStateList)o0.c;
                ((TextView)view1).setTextColor(colorStateList2);
                view1.setBackground(new InsetDrawable(new RippleDrawable(colorStateList2.withAlpha(30), materialShapeDrawable0, materialShapeDrawable1), ((Rect)o0.b).left, ((Rect)o0.b).top, ((Rect)o0.b).right, ((Rect)o0.b).bottom));
                return view1;
            }
            ((TextView)view1).setEnabled(true);
            throw null;
        }
        return view1;
    }

    @Override  // android.widget.BaseAdapter
    public final boolean hasStableIds() {
        return true;
    }
}

