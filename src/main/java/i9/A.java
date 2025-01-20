package i9;

import R1.c;
import R1.g;
import W8.e;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.widget.AppCompatImageView;

public abstract class a extends g {
    public final AppCompatImageView q;
    public final AppCompatImageView r;
    public final ImageButton s;
    public final ImageButton t;
    public final ImageButton u;
    public final Button v;
    public final Button w;
    public final ImageButton x;
    public final Button y;
    public e z;

    public a(c c0, View view0, AppCompatImageView appCompatImageView0, AppCompatImageView appCompatImageView1, ImageButton imageButton0, ImageButton imageButton1, ImageButton imageButton2, Button button0, Button button1, ImageButton imageButton3, Button button2) {
        super(c0, view0, 0);
        this.q = appCompatImageView0;
        this.r = appCompatImageView1;
        this.s = imageButton0;
        this.t = imageButton1;
        this.u = imageButton2;
        this.v = button0;
        this.w = button1;
        this.x = imageButton3;
        this.y = button2;
    }

    public abstract void u(e arg1);
}

