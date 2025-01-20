package i9;

import R1.c;
import R1.g;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.sendwave.components.SimpleRecyclerView;
import q9.i;

public abstract class j extends g {
    public final ConstraintLayout q;
    public final SimpleRecyclerView r;
    public final ImageView s;
    public final ProgressBar t;
    public final EditText u;
    public i v;
    public Adapter w;

    public j(c c0, View view0, ConstraintLayout constraintLayout0, SimpleRecyclerView simpleRecyclerView0, ImageView imageView0, ProgressBar progressBar0, EditText editText0) {
        super(c0, view0, 1);
        this.q = constraintLayout0;
        this.r = simpleRecyclerView0;
        this.s = imageView0;
        this.t = progressBar0;
        this.u = editText0;
    }

    public abstract void u(Adapter arg1);

    public abstract void v(i arg1);
}

