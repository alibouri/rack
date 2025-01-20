package ca;

import R1.c;
import R1.g;
import R9.q;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.sendwave.components.SimpleRecyclerView;

public abstract class e extends g {
    public final ConstraintLayout q;
    public final SimpleRecyclerView r;
    public final Button s;
    public final Toolbar t;
    public q u;
    public Adapter v;

    public e(c c0, View view0, ConstraintLayout constraintLayout0, SimpleRecyclerView simpleRecyclerView0, Button button0, Toolbar toolbar0) {
        super(c0, view0, 1);
        this.q = constraintLayout0;
        this.r = simpleRecyclerView0;
        this.s = button0;
        this.t = toolbar0;
    }

    public abstract void u(Adapter arg1);

    public abstract void v(q arg1);
}

