package i9;

import R1.c;
import R1.g;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.sendwave.components.SimpleRecyclerView;
import com.sendwave.models.CurrencyAmount;
import q9.u0;

public abstract class q extends g {
    public final SimpleRecyclerView q;
    public CurrencyAmount r;
    public Adapter s;
    public String t;
    public String u;
    public u0 v;

    public q(c c0, View view0, SimpleRecyclerView simpleRecyclerView0) {
        super(c0, view0, 0);
        this.q = simpleRecyclerView0;
    }

    public abstract void u(CurrencyAmount arg1);

    public abstract void v(String arg1);

    public abstract void w(u0 arg1);

    public abstract void x(Adapter arg1);

    public abstract void y(String arg1);
}

