package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;

class ChipTextInputComboView extends FrameLayout implements Checkable {
    public final Chip b0;
    public final EditText c0;

    public ChipTextInputComboView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0, 0);
        LayoutInflater layoutInflater0 = LayoutInflater.from(context0);
        Chip chip0 = (Chip)layoutInflater0.inflate(0x7F0D007B, this, false);  // layout:material_time_chip
        this.b0 = chip0;
        TextInputLayout textInputLayout0 = (TextInputLayout)layoutInflater0.inflate(0x7F0D007C, this, false);  // layout:material_time_input
        EditText editText0 = textInputLayout0.getEditText();
        this.c0 = editText0;
        editText0.setVisibility(4);
        editText0.addTextChangedListener(new a(this));
        if(Build.VERSION.SDK_INT >= 24) {
            editText0.setImeHintLocales(this.getContext().getResources().getConfiguration().getLocales());
        }
        this.addView(chip0);
        this.addView(textInputLayout0);
        TextView textView0 = (TextView)this.findViewById(0x7F0A01C9);  // id:material_label
        editText0.setSaveEnabled(false);
    }

    @Override  // android.widget.Checkable
    public final boolean isChecked() {
        return this.b0.isChecked();
    }

    @Override  // android.view.View
    public final void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        if(Build.VERSION.SDK_INT >= 24) {
            LocaleList localeList0 = this.getContext().getResources().getConfiguration().getLocales();
            this.c0.setImeHintLocales(localeList0);
        }
    }

    @Override  // android.widget.Checkable
    public final void setChecked(boolean z) {
        Chip chip0 = this.b0;
        chip0.setChecked(z);
        int v = 0;
        EditText editText0 = this.c0;
        editText0.setVisibility((z ? 0 : 4));
        if(z) {
            v = 8;
        }
        chip0.setVisibility(v);
        if(chip0.isChecked()) {
            editText0.requestFocus();
            if(!TextUtils.isEmpty(editText0.getText())) {
                editText0.setSelection(editText0.getText().length());
            }
        }
    }

    @Override  // android.view.View
    public final void setOnClickListener(View.OnClickListener view$OnClickListener0) {
        this.b0.setOnClickListener(view$OnClickListener0);
    }

    @Override  // android.view.View
    public final void setTag(int v, Object object0) {
        this.b0.setTag(v, object0);
    }

    @Override  // android.widget.Checkable
    public final void toggle() {
        this.b0.toggle();
    }
}

