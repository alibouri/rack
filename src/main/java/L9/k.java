package L9;

import K9.J0;
import K9.q;
import R1.c;
import R1.g;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.sendwave.components.SimpleRecyclerView;

public abstract class k extends g {
    public final TextInputEditText q;
    public final TextInputLayout r;
    public final d s;
    public final SimpleRecyclerView t;
    public final ConstraintLayout u;
    public final Toolbar v;
    public J0 w;
    public q x;

    public k(c c0, View view0, TextInputEditText textInputEditText0, TextInputLayout textInputLayout0, d d0, SimpleRecyclerView simpleRecyclerView0, ConstraintLayout constraintLayout0, Toolbar toolbar0) {
        super(c0, view0, 2);
        this.q = textInputEditText0;
        this.r = textInputLayout0;
        this.s = d0;
        this.t = simpleRecyclerView0;
        this.u = constraintLayout0;
        this.v = toolbar0;
    }

    public abstract void u(q arg1);

    public abstract void v(J0 arg1);
}

