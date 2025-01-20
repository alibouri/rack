package i9;

import R1.c;
import R1.g;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import o9.X;

public abstract class p0 extends g {
    public final ConstraintLayout q;
    public final Button r;
    public final Toolbar s;
    public X t;

    public p0(c c0, View view0, ConstraintLayout constraintLayout0, Button button0, Toolbar toolbar0) {
        super(c0, view0, 0);
        this.q = constraintLayout0;
        this.r = button0;
        this.s = toolbar0;
    }

    public abstract void u(X arg1);
}

