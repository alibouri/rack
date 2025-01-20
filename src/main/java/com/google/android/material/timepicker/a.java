package com.google.android.material.timepicker;

import B6.k;
import android.text.Editable;
import android.text.TextUtils;
import java.util.Locale;

public final class a extends k {
    public final ChipTextInputComboView X;

    public a(ChipTextInputComboView chipTextInputComboView0) {
        this.X = chipTextInputComboView0;
    }

    @Override  // B6.k
    public final void afterTextChanged(Editable editable0) {
        boolean z = TextUtils.isEmpty(editable0);
        ChipTextInputComboView chipTextInputComboView0 = this.X;
        if(z) {
            Locale locale0 = chipTextInputComboView0.getResources().getConfiguration().locale;
            Object[] arr_object = {Integer.parseInt("00")};
            chipTextInputComboView0.b0.setText(String.format(locale0, "%02d", arr_object));
            return;
        }
        Locale locale1 = chipTextInputComboView0.getResources().getConfiguration().locale;
        chipTextInputComboView0.b0.setText(String.format(locale1, "%02d", Integer.parseInt(String.valueOf(editable0))));
    }
}

