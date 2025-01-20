package ca;

import R1.c;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sendwave.util.CurrencyAmountView;

public abstract class g extends R1.g {
    public final TextView q;
    public final TextView r;
    public final View s;
    public final View t;
    public Object u;

    public g(c c0, View view0, ImageView imageView0, TextView textView0, ConstraintLayout constraintLayout0, TextView textView1) {
        super(c0, view0, 0);
        this.s = imageView0;
        this.q = textView0;
        this.t = constraintLayout0;
        this.r = textView1;
    }

    public g(c c0, View view0, CurrencyAmountView currencyAmountView0, CurrencyAmountView currencyAmountView1, TextView textView0, TextView textView1) {
        super(c0, view0, 0);
        this.s = currencyAmountView0;
        this.t = currencyAmountView1;
        this.q = textView0;
        this.r = textView1;
    }
}

