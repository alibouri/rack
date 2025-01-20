package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class l extends PickerFragment {
    public int Y0;
    public CalendarConstraints Z0;

    @Override  // androidx.fragment.app.Fragment
    public final void A(Bundle bundle0) {
        super.A(bundle0);
        if(bundle0 == null) {
            bundle0 = this.d0;
        }
        this.Y0 = bundle0.getInt("THEME_RES_ID_KEY");
        if(bundle0.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.Z0 = (CalendarConstraints)bundle0.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override  // androidx.fragment.app.Fragment
    public final View B(LayoutInflater layoutInflater0, ViewGroup viewGroup0) {
        layoutInflater0.cloneInContext(new ContextThemeWrapper(this.n(), this.Y0));
        throw null;
    }

    @Override  // androidx.fragment.app.Fragment
    public final void I(Bundle bundle0) {
        bundle0.putInt("THEME_RES_ID_KEY", this.Y0);
        bundle0.putParcelable("DATE_SELECTOR_KEY", null);
        bundle0.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.Z0);
    }
}

