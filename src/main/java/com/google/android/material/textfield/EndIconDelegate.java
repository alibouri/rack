package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;

public abstract class EndIconDelegate {
    public final TextInputLayout a;
    public final Context b;
    public final CheckableImageButton c;

    public EndIconDelegate(TextInputLayout textInputLayout0) {
        this.a = textInputLayout0;
        this.b = textInputLayout0.getContext();
        this.c = textInputLayout0.getEndIconView();
    }

    public abstract void a();

    public boolean b(int v) {
        return true;
    }

    public void c(boolean z) {
    }
}

