package com.google.android.material.textfield;

import K1.d;
import android.os.Build.VERSION;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

public final class a extends AccessibilityDelegate {
    public final c e;

    public a(c c0, TextInputLayout textInputLayout0) {
        this.e = c0;
        super(textInputLayout0);
    }

    @Override  // com.google.android.material.textfield.TextInputLayout$AccessibilityDelegate
    public final void d(View view0, d d0) {
        super.d(view0, d0);
        if(!c.f(this.e.a.getEditText())) {
            d0.i("android.widget.Spinner");
        }
        if((Build.VERSION.SDK_INT < 26 ? d0.e(4) : d0.a.isShowingHintText())) {
            d0.l(null);
        }
    }

    @Override  // J1.b
    public final void e(View view0, AccessibilityEvent accessibilityEvent0) {
        super.e(view0, accessibilityEvent0);
        c c0 = this.e;
        EditText editText0 = c0.a.getEditText();
        if(!(editText0 instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        if(accessibilityEvent0.getEventType() == 1 && c0.n.isTouchExplorationEnabled() && !c.f(c0.a.getEditText())) {
            c.d(c0, ((AutoCompleteTextView)editText0));
        }
    }
}

