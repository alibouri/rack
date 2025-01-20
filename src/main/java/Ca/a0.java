package ca;

import R1.c;
import R1.g;
import R9.e3;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sendwave.remit.util.CountryPhoneInputView;

public abstract class a0 extends g {
    public final ImageView q;
    public final CountryPhoneInputView r;
    public final Button s;
    public final ConstraintLayout t;
    public final Toolbar u;
    public final TextView v;
    public e3 w;

    public a0(c c0, View view0, ImageView imageView0, CountryPhoneInputView countryPhoneInputView0, Button button0, ConstraintLayout constraintLayout0, Toolbar toolbar0, TextView textView0) {
        super(c0, view0, 0);
        this.q = imageView0;
        this.r = countryPhoneInputView0;
        this.s = button0;
        this.t = constraintLayout0;
        this.u = toolbar0;
        this.v = textView0;
    }

    public abstract void u(e3 arg1);
}

