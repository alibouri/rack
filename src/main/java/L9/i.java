package L9;

import R1.c;
import R1.g;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.sendwave.components.RequesterEditText;
import com.wave.components.sendmoney.d;

public abstract class i extends g {
    public final ImageView A;
    public final TextView B;
    public final TextInputLayout C;
    public final RequesterEditText D;
    public final Button E;
    public final Toolbar F;
    public d G;
    public final TextView q;
    public final TextView r;
    public final TextView s;
    public final ConstraintLayout t;
    public final TextView u;
    public final TextView v;
    public final L9.d w;
    public final TextInputLayout x;
    public final RequesterEditText y;
    public final TextView z;

    public i(c c0, View view0, TextView textView0, TextView textView1, TextView textView2, ConstraintLayout constraintLayout0, TextView textView3, TextView textView4, L9.d d0, TextInputLayout textInputLayout0, RequesterEditText requesterEditText0, TextView textView5, ImageView imageView0, TextView textView6, TextInputLayout textInputLayout1, RequesterEditText requesterEditText1, Button button0, Toolbar toolbar0) {
        super(c0, view0, 9);
        this.q = textView0;
        this.r = textView1;
        this.s = textView2;
        this.t = constraintLayout0;
        this.u = textView3;
        this.v = textView4;
        this.w = d0;
        this.x = textInputLayout0;
        this.y = requesterEditText0;
        this.z = textView5;
        this.A = imageView0;
        this.B = textView6;
        this.C = textInputLayout1;
        this.D = requesterEditText1;
        this.E = button0;
        this.F = toolbar0;
    }

    public abstract void u(d arg1);
}

