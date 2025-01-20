package com.google.android.material.datepicker;

import Bb.q;
import J1.E;
import J1.N;
import K6.e;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.LinkedHashSet;
import z6.a;

public final class k extends DialogFragment {
    public final LinkedHashSet n1;
    public final LinkedHashSet o1;
    public int p1;
    public PickerFragment q1;
    public CalendarConstraints r1;
    public j s1;
    public int t1;
    public CharSequence u1;
    public boolean v1;
    public int w1;
    public CheckableImageButton x1;
    public MaterialShapeDrawable y1;
    public Button z1;

    public k() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.n1 = new LinkedHashSet();
        this.o1 = new LinkedHashSet();
    }

    @Override  // androidx.fragment.app.DialogFragment
    public final void A(Bundle bundle0) {
        super.A(bundle0);
        if(bundle0 == null) {
            bundle0 = this.d0;
        }
        this.p1 = bundle0.getInt("OVERRIDE_THEME_RES_ID");
        if(bundle0.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.r1 = (CalendarConstraints)bundle0.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.t1 = bundle0.getInt("TITLE_TEXT_RES_ID_KEY");
        this.u1 = bundle0.getCharSequence("TITLE_TEXT_KEY");
        this.w1 = bundle0.getInt("INPUT_MODE_KEY");
    }

    @Override  // androidx.fragment.app.Fragment
    public final View B(LayoutInflater layoutInflater0, ViewGroup viewGroup0) {
        View view0 = layoutInflater0.inflate((this.v1 ? 0x7F0D0095 : 0x7F0D0094), viewGroup0);  // layout:mtrl_picker_fullscreen
        Context context0 = view0.getContext();
        boolean z = true;
        if(this.v1) {
            view0.findViewById(0x7F0A01E8).setLayoutParams(new LinearLayout.LayoutParams(k.X(context0), -2));  // id:mtrl_calendar_frame
        }
        else {
            View view1 = view0.findViewById(0x7F0A01E9);  // id:mtrl_calendar_main_pane
            View view2 = view0.findViewById(0x7F0A01E8);  // id:mtrl_calendar_frame
            view1.setLayoutParams(new LinearLayout.LayoutParams(k.X(context0), -1));
            Resources resources0 = this.P().getResources();
            int v = resources0.getDimensionPixelSize(0x7F07014D);  // dimen:mtrl_calendar_navigation_height
            int v1 = resources0.getDimensionPixelOffset(0x7F07014E);  // dimen:mtrl_calendar_navigation_top_padding
            int v2 = resources0.getDimensionPixelOffset(0x7F07014C);  // dimen:mtrl_calendar_navigation_bottom_padding
            int v3 = resources0.getDimensionPixelSize(0x7F07013D);  // dimen:mtrl_calendar_days_of_week_height
            int v4 = resources0.getDimensionPixelSize(0x7F070138);  // dimen:mtrl_calendar_day_height
            int v5 = resources0.getDimensionPixelOffset(0x7F07014B);  // dimen:mtrl_calendar_month_vertical_padding
            int v6 = resources0.getDimensionPixelOffset(0x7F070135);  // dimen:mtrl_calendar_bottom_padding
            view2.setMinimumHeight(v2 + (v1 + v) + v3 + (v5 * (n.b0 - 1) + v4 * n.b0) + v6);
        }
        ((TextView)view0.findViewById(0x7F0A01F4)).setAccessibilityLiveRegion(1);  // id:mtrl_picker_header_selection_text
        this.x1 = (CheckableImageButton)view0.findViewById(0x7F0A01F6);  // id:mtrl_picker_header_toggle
        TextView textView0 = (TextView)view0.findViewById(0x7F0A01FA);  // id:mtrl_picker_title_text
        CharSequence charSequence0 = this.u1;
        if(charSequence0 == null) {
            textView0.setText(this.t1);
        }
        else {
            textView0.setText(charSequence0);
        }
        this.x1.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton0 = this.x1;
        StateListDrawable stateListDrawable0 = new StateListDrawable();
        Drawable drawable0 = q.v(context0, 0x7F0802DD);  // drawable:material_ic_calendar_black_24dp
        stateListDrawable0.addState(new int[]{0x10100A0}, drawable0);
        Drawable drawable1 = q.v(context0, 0x7F0802DF);  // drawable:material_ic_edit_black_24dp
        stateListDrawable0.addState(new int[0], drawable1);
        checkableImageButton0.setImageDrawable(stateListDrawable0);
        CheckableImageButton checkableImageButton1 = this.x1;
        if(this.w1 == 0) {
            z = false;
        }
        checkableImageButton1.setChecked(z);
        N.k(this.x1, null);
        this.x1.setContentDescription((this.x1.e0 ? "Switch to calendar input mode" : "Switch to text input mode"));
        this.x1.setOnClickListener(new e(4, this));
        this.z1 = (Button)view0.findViewById(0x7F0A00DE);  // id:confirm_button
        throw null;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public final void I(Bundle bundle0) {
        super.I(bundle0);
        bundle0.putInt("OVERRIDE_THEME_RES_ID", this.p1);
        Month month0 = null;
        bundle0.putParcelable("DATE_SELECTOR_KEY", null);
        CalendarConstraints calendarConstraints0 = this.r1;
        b b0 = new b();  // initializer: Ljava/lang/Object;-><init>()V
        long v = calendarConstraints0.X.d0;
        long v1 = calendarConstraints0.Y.d0;
        b0.a = (long)calendarConstraints0.b0.d0;
        Month month1 = this.s1.a1;
        if(month1 != null) {
            b0.a = (long)month1.d0;
        }
        Bundle bundle1 = new Bundle();
        bundle1.putParcelable("DEEP_COPY_VALIDATOR_KEY", calendarConstraints0.Z);
        Month month2 = Month.f(v);
        Month month3 = Month.f(v1);
        DateValidator calendarConstraints$DateValidator0 = (DateValidator)bundle1.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long long0 = b0.a;
        if(long0 != null) {
            month0 = Month.f(((long)long0));
        }
        bundle0.putParcelable("CALENDAR_CONSTRAINTS_KEY", new CalendarConstraints(month2, month3, calendarConstraints$DateValidator0, month0));
        bundle0.putInt("TITLE_TEXT_RES_ID_KEY", this.t1);
        bundle0.putCharSequence("TITLE_TEXT_KEY", this.u1);
    }

    @Override  // androidx.fragment.app.DialogFragment
    public final void J() {
        super.J();
        Dialog dialog0 = this.i1;
        if(dialog0 == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window0 = dialog0.getWindow();
        if(this.v1) {
            window0.setLayout(-1, -1);
            window0.setBackgroundDrawable(this.y1);
        }
        else {
            window0.setLayout(-2, -2);
            int v = this.P().getResources().getDimensionPixelOffset(0x7F07013E);  // dimen:mtrl_calendar_dialog_background_inset
            Rect rect0 = new Rect(v, v, v, v);
            window0.setBackgroundDrawable(new InsetDrawable(this.y1, v, v, v, v));
            View view0 = window0.getDecorView();
            Dialog dialog1 = this.i1;
            if(dialog1 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            view0.setOnTouchListener(new a(dialog1, rect0));
        }
        this.P();
        int v1 = this.p1;
        if(v1 == 0) {
            throw null;
        }
        CalendarConstraints calendarConstraints0 = this.r1;
        j j0 = new j();
        Bundle bundle0 = new Bundle();
        bundle0.putInt("THEME_RES_ID_KEY", v1);
        bundle0.putParcelable("GRID_SELECTOR_KEY", null);
        bundle0.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints0);
        bundle0.putParcelable("CURRENT_MONTH_KEY", calendarConstraints0.b0);
        j0.S(bundle0);
        this.s1 = j0;
        if(this.x1.e0) {
            CalendarConstraints calendarConstraints1 = this.r1;
            j0 = new l();
            Bundle bundle1 = new Bundle();
            bundle1.putInt("THEME_RES_ID_KEY", v1);
            bundle1.putParcelable("DATE_SELECTOR_KEY", null);
            bundle1.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints1);
            j0.S(bundle1);
        }
        this.q1 = j0;
        throw null;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public final void K() {
        this.q1.X0.clear();
        super.K();
    }

    @Override  // androidx.fragment.app.DialogFragment
    public final Dialog V() {
        Context context0 = this.P();
        this.P();
        int v = this.p1;
        if(v == 0) {
            throw null;
        }
        Dialog dialog0 = new Dialog(context0, v);
        Context context1 = dialog0.getContext();
        this.v1 = k.Y(context1, 0x101020D);
        MaterialShapeDrawable materialShapeDrawable0 = new MaterialShapeDrawable(context1, null, 0x7F0402C3, 0x7F13030C);  // attr:materialCalendarStyle
        this.y1 = materialShapeDrawable0;
        materialShapeDrawable0.h(context1);
        this.y1.j(ColorStateList.valueOf(q.X(0x7F040101, context1, k.class.getCanonicalName())));  // attr:colorSurface
        this.y1.i(E.e(dialog0.getWindow().getDecorView()));
        return dialog0;
    }

    public static int X(Context context0) {
        Resources resources0 = context0.getResources();
        int v = resources0.getDimensionPixelOffset(0x7F070136);  // dimen:mtrl_calendar_content_padding
        Month month0 = new Month(t.b());
        int v1 = resources0.getDimensionPixelSize(0x7F07013C);  // dimen:mtrl_calendar_day_width
        int v2 = resources0.getDimensionPixelOffset(0x7F07014A);  // dimen:mtrl_calendar_month_horizontal_padding
        return (month0.b0 - 1) * v2 + (v1 * month0.b0 + v * 2);
    }

    public static boolean Y(Context context0, int v) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(q.X(0x7F0402C3, context0, j.class.getCanonicalName()), new int[]{v});  // attr:materialCalendarStyle
        boolean z = typedArray0.getBoolean(0, false);
        typedArray0.recycle();
        return z;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public final void onCancel(DialogInterface dialogInterface0) {
        for(Object object0: this.n1) {
            ((DialogInterface.OnCancelListener)object0).onCancel(dialogInterface0);
        }
    }

    @Override  // androidx.fragment.app.DialogFragment
    public final void onDismiss(DialogInterface dialogInterface0) {
        for(Object object0: this.o1) {
            ((DialogInterface.OnDismissListener)object0).onDismiss(dialogInterface0);
        }
        ViewGroup viewGroup0 = (ViewGroup)this.F0;
        if(viewGroup0 != null) {
            viewGroup0.removeAllViews();
        }
        super.onDismiss(dialogInterface0);
    }
}

