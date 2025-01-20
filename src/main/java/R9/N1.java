package R9;

import Nb.j;
import android.app.AlertDialog.Builder;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.material.textfield.TextInputEditText;
import com.wave.customer.PaymentListActivity;
import q9.j3;

public final class n1 extends j3 implements m1 {
    public final PaymentListActivity b;
    public final PaymentListActivity c;

    public n1(PaymentListActivity paymentListActivity0) {
        this.c = paymentListActivity0;
        super(paymentListActivity0);
        this.b = paymentListActivity0;
    }

    @Override  // R9.m1
    public final void d(boolean z) {
        PaymentListActivity paymentListActivity0 = this.c;
        View view0 = paymentListActivity0.findViewById(0x7F0A0095);  // id:bill_search
        j.d(view0, "null cannot be cast to non-null type com.google.android.material.textfield.TextInputEditText");
        Editable editable0 = ((TextInputEditText)view0).getText();
        if(editable0 != null) {
            editable0.clear();
        }
        if(z) {
            ((TextInputEditText)view0).clearFocus();
            Object object0 = paymentListActivity0.getSystemService("input_method");
            j.d(object0, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager)object0).hideSoftInputFromWindow(((TextInputEditText)view0).getWindowToken(), 0);
        }
    }

    @Override  // R9.m1
    public final void m() {
        try {
            View view0 = this.c.findViewById(0x7F0A0095);  // id:bill_search
            j.d(view0, "null cannot be cast to non-null type com.google.android.material.textfield.TextInputEditText");
            ((TextInputEditText)view0).requestFocus();
            Object object0 = this.c.getSystemService("input_method");
            j.d(object0, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager)object0).showSoftInput(((TextInputEditText)view0), 1);
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // R9.m1
    public final void s(String s) {
        j.f(s, "message");
        new AlertDialog.Builder(this.b).setTitle(0x7F1203ED).setMessage(s).setPositiveButton(0x7F1202DC, null).show();  // string:service_unavailable "Service unavailable"
    }
}

