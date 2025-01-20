package i9;

import R1.c;
import R1.g;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.sendwave.components.SimpleRecyclerView;
import p9.U;

public abstract class f0 extends g {
    public final SimpleRecyclerView q;
    public final TextView r;
    public final Toolbar s;
    public Adapter t;
    public U u;

    public f0(c c0, View view0, SimpleRecyclerView simpleRecyclerView0, TextView textView0, Toolbar toolbar0) {
        super(c0, view0, 2);
        this.q = simpleRecyclerView0;
        this.r = textView0;
        this.s = toolbar0;
    }

    public abstract void u(Adapter arg1);

    public abstract void v(U arg1);
}

