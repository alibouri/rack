package com.sendwave.components;

import Nb.j;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView.OnItemClickListener;
import f9.h;
import o.l;

public final class DropdownTextView extends l {
    public final h f0;
    public static final int g0;

    public DropdownTextView(Context context0, AttributeSet attributeSet0) {
        j.f(context0, "context");
        j.f(attributeSet0, "attributeSet");
        super(context0, attributeSet0, 0);
        h h0 = new h(this);
        this.f0 = h0;
        this.setShowSoftInputOnFocus(false);
        super.setOnItemClickListener(h0);
    }

    @Override  // android.widget.AutoCompleteTextView
    public final boolean enoughToFilter() {
        return true;
    }

    @Override  // android.widget.AutoCompleteTextView
    public AdapterView.OnItemClickListener getOnItemClickListener() {
        return (AdapterView.OnItemClickListener)this.f0.Y;
    }

    @Override  // android.widget.AutoCompleteTextView
    public final void onFocusChanged(boolean z, int v, Rect rect0) {
        super.onFocusChanged(z, v, rect0);
        if(z && this.getAdapter() != null) {
            this.performFiltering("", 0);
        }
        Object object0 = this.getContext().getSystemService("input_method");
        j.d(object0, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager)object0).hideSoftInputFromWindow(this.getWindowToken(), 0);
    }

    @Override  // android.widget.AutoCompleteTextView
    public void setOnItemClickListener(AdapterView.OnItemClickListener adapterView$OnItemClickListener0) {
        this.f0.Y = adapterView$OnItemClickListener0;
    }
}

