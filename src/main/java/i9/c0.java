package i9;

import R1.c;
import R1.g;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import o9.w1;

public abstract class c0 extends g {
    public final S q;
    public final ConstraintLayout r;
    public w1 s;
    public Adapter t;

    public c0(c c0, View view0, S s0, ConstraintLayout constraintLayout0) {
        super(c0, view0, 2);
        this.q = s0;
        this.r = constraintLayout0;
    }

    public abstract void u(Adapter arg1);

    public abstract void v(w1 arg1);
}

