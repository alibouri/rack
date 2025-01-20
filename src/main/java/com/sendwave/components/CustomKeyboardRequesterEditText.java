package com.sendwave.components;

import Nb.j;
import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView.BufferType;
import com.google.android.material.textfield.TextInputEditText;

public final class CustomKeyboardRequesterEditText extends TextInputEditText {
    public RequestingInputFilter j0;

    public CustomKeyboardRequesterEditText(Context context0, AttributeSet attributeSet0) {
        j.f(context0, "context");
        j.f(attributeSet0, "attributeSet");
        j.f(context0, "context");
        j.f(attributeSet0, "attributeSet");
        super(context0, attributeSet0);
    }

    public final RequestingInputFilter getFilter$lib_productionOfficial() {
        return this.j0;
    }

    @Override  // android.widget.TextView
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        super.onTouchEvent(motionEvent0);
        Object object0 = this.getContext().getSystemService("input_method");
        j.d(object0, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager)object0).hideSoftInputFromWindow(this.getWindowToken(), 0);
        return true;
    }

    public final void setFilter$lib_productionOfficial(RequestingInputFilter requestingInputFilter0) {
        this.j0 = requestingInputFilter0;
    }

    public final void setOnRequest(RequestListener requestListener0) {
        if(requestListener0 == null) {
            this.j0 = null;
            this.setFilters(new InputFilter[0]);
            return;
        }
        RequestingInputFilter requestingInputFilter0 = new RequestingInputFilter(requestListener0);
        this.j0 = requestingInputFilter0;
        this.setFilters(new RequestingInputFilter[]{requestingInputFilter0});
    }

    @Override  // android.widget.EditText
    public final void setText(CharSequence charSequence0, TextView.BufferType textView$BufferType0) {
        RequestingInputFilter requestingInputFilter1;
        RequestingInputFilter requestingInputFilter0 = this.j0;
        if(requestingInputFilter0 != null) {
            requestingInputFilter0.b = true;
        }
        try {
            super.setText(charSequence0, textView$BufferType0);
            requestingInputFilter1 = this.j0;
        }
        catch(Throwable throwable0) {
            RequestingInputFilter requestingInputFilter2 = this.j0;
            if(requestingInputFilter2 != null) {
                requestingInputFilter2.b = false;
            }
            throw throwable0;
        }
        if(requestingInputFilter1 != null) {
            requestingInputFilter1.b = false;
        }
    }
}

