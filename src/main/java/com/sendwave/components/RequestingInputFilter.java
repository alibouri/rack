package com.sendwave.components;

import Nb.j;
import android.text.InputFilter;
import android.text.Spanned;

public final class RequestingInputFilter implements InputFilter {
    public final RequestListener a;
    public boolean b;

    public RequestingInputFilter(RequestListener requestListener0) {
        j.f(requestListener0, "publisher");
        super();
        this.a = requestListener0;
    }

    @Override  // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence0, int v, int v1, Spanned spanned0, int v2, int v3) {
        j.f(charSequence0, "source");
        j.f(spanned0, "dest");
        if(this.b) {
            return null;
        }
        String s = charSequence0.subSequence(v, v1).toString();
        this.a.w(v2, v3, s, spanned0.toString());
        return spanned0.subSequence(v2, v3);
    }
}

