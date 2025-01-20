package ca;

import R1.c;
import R1.g;
import R9.S;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

public abstract class m extends g {
    public final AppCompatImageView q;
    public final e0 r;
    public final ConstraintLayout s;
    public S t;
    public static final int u;

    public m(c c0, View view0, AppCompatImageView appCompatImageView0, e0 e00, ConstraintLayout constraintLayout0) {
        super(c0, view0, 2);
        this.q = appCompatImageView0;
        this.r = e00;
        this.s = constraintLayout0;
    }

    public abstract void u(S arg1);
}

