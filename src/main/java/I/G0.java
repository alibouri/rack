package I;

import Nb.j;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.platform.SoftwareKeyboardController;

public final class g0 {
    public final SoftwareKeyboardController a;
    public h0 b;
    public FocusOwner c;

    public g0(SoftwareKeyboardController softwareKeyboardController0) {
        this.a = softwareKeyboardController0;
    }

    public final h0 a() {
        h0 h00 = this.b;
        if(h00 != null) {
            return h00;
        }
        j.p("keyboardActions");
        throw null;
    }
}

