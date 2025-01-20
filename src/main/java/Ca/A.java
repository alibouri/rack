package ca;

import R1.c;
import R1.g;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sendwave.components.CustomKeyboardRequesterEditText;
import com.sendwave.components.KeypadView;

public abstract class a extends g {
    public final View q;
    public final View r;
    public final View s;
    public final View t;
    public final View u;
    public Object v;
    public Object w;

    public a(c c0, View view0, ImageView imageView0, ConstraintLayout constraintLayout0, AppCompatImageView appCompatImageView0, TextView textView0, TextView textView1) {
        super(c0, view0, 0);
        this.r = imageView0;
        this.s = constraintLayout0;
        this.q = appCompatImageView0;
        this.t = textView0;
        this.u = textView1;
    }

    public a(c c0, View view0, CustomKeyboardRequesterEditText customKeyboardRequesterEditText0, AppCompatImageView appCompatImageView0, AppCompatImageView appCompatImageView1, KeypadView keypadView0, Button button0) {
        super(c0, view0, 2);
        this.r = customKeyboardRequesterEditText0;
        this.q = appCompatImageView0;
        this.s = appCompatImageView1;
        this.t = keypadView0;
        this.u = button0;
    }

    public a(c c0, View view0, CustomKeyboardRequesterEditText customKeyboardRequesterEditText0, KeypadView keypadView0, ProgressBar progressBar0, ConstraintLayout constraintLayout0, Toolbar toolbar0) {
        super(c0, view0, 3);
        this.r = customKeyboardRequesterEditText0;
        this.t = keypadView0;
        this.q = progressBar0;
        this.s = constraintLayout0;
        this.u = toolbar0;
    }
}

