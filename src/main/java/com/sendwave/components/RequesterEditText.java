package com.sendwave.components;

import Nb.j;
import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView.BufferType;
import androidx.appcompat.widget.AppCompatEditText;

public final class RequesterEditText extends AppCompatEditText {
    public RequestingInputFilter h0;

    public RequesterEditText(Context context0, AttributeSet attributeSet0) {
        j.f(context0, "context");
        j.f(attributeSet0, "attributeSet");
        super(context0, attributeSet0);
    }

    public final RequestingInputFilter getFilter$lib_productionOfficial() {
        return this.h0;
    }

    public final void setFilter$lib_productionOfficial(RequestingInputFilter requestingInputFilter0) {
        this.h0 = requestingInputFilter0;
    }

    public final void setOnRequest(RequestListener requestListener0) {
        if(requestListener0 == null) {
            this.h0 = null;
            this.setFilters(new InputFilter[0]);
            return;
        }
        RequestingInputFilter requestingInputFilter0 = new RequestingInputFilter(requestListener0);
        this.h0 = requestingInputFilter0;
        this.setFilters(new RequestingInputFilter[]{requestingInputFilter0});
    }

    @Override  // android.widget.EditText
    public final void setText(CharSequence charSequence0, TextView.BufferType textView$BufferType0) {
        RequestingInputFilter requestingInputFilter1;
        RequestingInputFilter requestingInputFilter0 = this.h0;
        if(requestingInputFilter0 != null) {
            requestingInputFilter0.b = true;
        }
        try {
            super.setText(charSequence0, textView$BufferType0);
            requestingInputFilter1 = this.h0;
        }
        catch(Throwable throwable0) {
            RequestingInputFilter requestingInputFilter2 = this.h0;
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

