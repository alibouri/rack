package q9;

import Nb.w;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import i.g;
import kotlin.jvm.functions.Function1;

public final class x3 implements TextWatcher {
    public final w X;
    public final Function1 Y;

    public x3(w w0, Function1 function10) {
        this.X = w0;
        this.Y = function10;
    }

    @Override  // android.text.TextWatcher
    public final void afterTextChanged(Editable editable0) {
    }

    @Override  // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
    }

    @Override  // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
        String s;
        g g0 = (g)this.X.X;
        if(g0 != null) {
            Button button0 = g0.j(-1);
            if(charSequence0 == null) {
                s = "";
            }
            else {
                s = charSequence0.toString();
                if(s == null) {
                    s = "";
                }
            }
            button0.setEnabled(((Boolean)this.Y.n(s)).booleanValue());
        }
    }
}

