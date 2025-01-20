package i9;

import R1.c;
import R1.g;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import q9.C;

public abstract class o extends g {
    public final l q;
    public final Button r;
    public final Button s;
    public final ImageButton t;
    public final TextView u;
    public final ImageView v;
    public final Toolbar w;
    public C x;

    public o(c c0, View view0, l l0, Button button0, Button button1, ImageButton imageButton0, TextView textView0, ImageView imageView0, Toolbar toolbar0) {
        super(c0, view0, 1);
        this.q = l0;
        this.r = button0;
        this.s = button1;
        this.t = imageButton0;
        this.u = textView0;
        this.v = imageView0;
        this.w = toolbar0;
    }

    public abstract void u(C arg1);
}

