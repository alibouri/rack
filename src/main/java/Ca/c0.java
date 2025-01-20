package ca;

import R1.c;
import R1.g;
import android.view.View;
import android.widget.ProgressBar;
import com.sendwave.components.CustomKeyboardRequesterEditText;
import f9.A;

public abstract class c0 extends g {
    public final CustomKeyboardRequesterEditText q;
    public final ProgressBar r;
    public A s;

    public c0(c c0, View view0, CustomKeyboardRequesterEditText customKeyboardRequesterEditText0, ProgressBar progressBar0) {
        super(c0, view0, 2);
        this.q = customKeyboardRequesterEditText0;
        this.r = progressBar0;
    }

    public abstract void u(A arg1);
}

