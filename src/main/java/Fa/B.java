package fa;

import Nb.j;
import R9.e3;
import ca.b0;
import com.sendwave.remit.util.CountryPhoneInputView.MobileChangedListener;

public final class b implements MobileChangedListener {
    public final b0 a;

    public b(b0 b00) {
        this.a = b00;
    }

    @Override  // com.sendwave.remit.util.CountryPhoneInputView$MobileChangedListener
    public final void a(String s) {
        e3 e30 = this.a.w;
        if(e30 != null) {
            j.f(s, "e164");
            e30.g0.getClass();
            e30.g0.l(null, s);
        }
    }
}

