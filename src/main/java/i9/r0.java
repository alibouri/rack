package i9;

import R1.c;
import R1.g;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.sendwave.components.SimpleRecyclerView;
import o9.X;

public abstract class r0 extends g {
    public final LinearLayout q;
    public final SimpleRecyclerView r;
    public final Button s;
    public final Toolbar t;
    public X u;
    public Adapter v;

    public r0(c c0, View view0, LinearLayout linearLayout0, SimpleRecyclerView simpleRecyclerView0, Button button0, Toolbar toolbar0) {
        super(c0, view0, 1);
        this.q = linearLayout0;
        this.r = simpleRecyclerView0;
        this.s = button0;
        this.t = toolbar0;
    }

    public abstract void u(Adapter arg1);

    public abstract void v(X arg1);
}

