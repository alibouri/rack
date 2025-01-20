package ca;

import K9.q;
import R1.c;
import R1.g;
import R9.M;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.sendwave.components.SimpleRecyclerView;

public abstract class i extends g {
    public final ConstraintLayout q;
    public final TextInputEditText r;
    public final TextInputLayout s;
    public final SimpleRecyclerView t;
    public final Toolbar u;
    public M v;
    public q w;

    public i(c c0, View view0, ConstraintLayout constraintLayout0, TextInputEditText textInputEditText0, TextInputLayout textInputLayout0, SimpleRecyclerView simpleRecyclerView0, Toolbar toolbar0) {
        super(c0, view0, 1);
        this.q = constraintLayout0;
        this.r = textInputEditText0;
        this.s = textInputLayout0;
        this.t = simpleRecyclerView0;
        this.u = toolbar0;
    }

    public abstract void u(q arg1);

    public abstract void v(M arg1);
}

