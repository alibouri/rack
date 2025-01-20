package h0;

import P0.f;
import android.view.autofill.AutofillManager;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.platform.AndroidComposeView;

public final class a implements Autofill {
    public final AndroidComposeView a;
    public final AutofillTree b;
    public final AutofillManager c;

    public a(AndroidComposeView androidComposeView0, AutofillTree autofillTree0) {
        this.a = androidComposeView0;
        this.b = autofillTree0;
        AutofillManager autofillManager0 = f.j(androidComposeView0.getContext().getSystemService(AutofillManager.class));
        if(autofillManager0 == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.c = autofillManager0;
        f.u(androidComposeView0);
    }
}

