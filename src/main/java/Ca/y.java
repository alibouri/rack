package ca;

import R1.c;
import R1.g;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.sendwave.components.CodeEntryEditText;
import ma.F;

public abstract class y extends g {
    public final TextView q;
    public final CodeEntryEditText r;
    public final Toolbar s;
    public F t;

    public y(c c0, View view0, TextView textView0, CodeEntryEditText codeEntryEditText0, Toolbar toolbar0) {
        super(c0, view0, 1);
        this.q = textView0;
        this.r = codeEntryEditText0;
        this.s = toolbar0;
    }

    public abstract void u(F arg1);
}

