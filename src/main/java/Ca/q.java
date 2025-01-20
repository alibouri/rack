package ca;

import R1.c;
import R1.g;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.sendwave.components.SimpleRecyclerView;
import ma.p;

public abstract class q extends g {
    public final SimpleRecyclerView q;
    public final Button r;
    public final Toolbar s;
    public p t;
    public Adapter u;

    public q(c c0, View view0, SimpleRecyclerView simpleRecyclerView0, Button button0, Toolbar toolbar0) {
        super(c0, view0, 0);
        this.q = simpleRecyclerView0;
        this.r = button0;
        this.s = toolbar0;
    }

    public abstract void u(Adapter arg1);

    public abstract void v(p arg1);
}

