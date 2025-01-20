package ca;

import R1.c;
import R1.g;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import ma.x;

public abstract class w extends g {
    public final TextView q;
    public final TextView r;
    public final ImageView s;
    public final TextView t;
    public final Toolbar u;
    public x v;

    public w(c c0, View view0, TextView textView0, TextView textView1, ImageView imageView0, TextView textView2, Toolbar toolbar0) {
        super(c0, view0, 0);
        this.q = textView0;
        this.r = textView1;
        this.s = imageView0;
        this.t = textView2;
        this.u = toolbar0;
    }

    public abstract void u(x arg1);
}

