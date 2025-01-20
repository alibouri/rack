package i9;

import R1.c;
import R1.g;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sendwave.components.CustomKeyboardRequesterEditText;
import com.sendwave.components.KeypadView;
import com.sendwave.components.SimpleRecyclerView;
import f9.A;
import f9.d;
import f9.f;

public abstract class l0 extends g {
    public final CustomKeyboardRequesterEditText q;
    public final KeypadView r;
    public final TextView s;
    public final SimpleRecyclerView t;
    public final ProgressBar u;
    public final ConstraintLayout v;
    public final Toolbar w;
    public A x;
    public d y;
    public f z;

    public l0(c c0, View view0, CustomKeyboardRequesterEditText customKeyboardRequesterEditText0, KeypadView keypadView0, TextView textView0, SimpleRecyclerView simpleRecyclerView0, ProgressBar progressBar0, ConstraintLayout constraintLayout0, Toolbar toolbar0) {
        super(c0, view0, 2);
        this.q = customKeyboardRequesterEditText0;
        this.r = keypadView0;
        this.s = textView0;
        this.t = simpleRecyclerView0;
        this.u = progressBar0;
        this.v = constraintLayout0;
        this.w = toolbar0;
    }
}

