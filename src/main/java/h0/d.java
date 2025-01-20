package h0;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;

public final class d {
    public static final d a;

    static {
        d.a = new d();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public final AutofillId a(ViewStructure viewStructure0) {
        return viewStructure0.getAutofillId();
    }

    public final boolean b(AutofillValue autofillValue0) {
        return c.u(autofillValue0);
    }

    public final boolean c(AutofillValue autofillValue0) {
        return autofillValue0.isList();
    }

    public final boolean d(AutofillValue autofillValue0) {
        return autofillValue0.isText();
    }

    public final boolean e(AutofillValue autofillValue0) {
        return autofillValue0.isToggle();
    }

    public final void f(ViewStructure viewStructure0, String[] arr_s) {
        c.q(viewStructure0, arr_s);
    }

    public final void g(ViewStructure viewStructure0, AutofillId autofillId0, int v) {
        viewStructure0.setAutofillId(autofillId0, v);
    }

    public final void h(ViewStructure viewStructure0, int v) {
        viewStructure0.setAutofillType(v);
    }

    public final CharSequence i(AutofillValue autofillValue0) {
        return autofillValue0.getTextValue();
    }
}

