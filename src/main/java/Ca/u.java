package ca;

import R1.c;
import R1.g;
import R9.P0;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;

public abstract class u extends g {
    public final ConstraintLayout q;
    public final Button r;
    public final TextView s;
    public final Toolbar t;
    public final EditText u;
    public P0 v;

    public u(c c0, View view0, ConstraintLayout constraintLayout0, Button button0, TextView textView0, Toolbar toolbar0, EditText editText0) {
        super(c0, view0, 0);
        this.q = constraintLayout0;
        this.r = button0;
        this.s = textView0;
        this.t = toolbar0;
        this.u = editText0;
    }

    public abstract void u(P0 arg1);
}

