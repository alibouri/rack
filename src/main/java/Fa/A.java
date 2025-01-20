package fa;

import R9.a3;
import R9.e3;
import Y8.N;
import ca.b0;
import com.sendwave.remit.util.CountryPhoneInputView.CountryChangedListener;
import com.sendwave.util.Country;
import q9.M0;

public final class a implements CountryChangedListener {
    public final b0 a;

    public a(b0 b00) {
        this.a = b00;
    }

    @Override  // com.sendwave.remit.util.CountryPhoneInputView$CountryChangedListener
    public final void a(String s) {
        e3 e30 = this.a.w;
        if(e30 != null) {
            Country country0 = M0.b(s);
            if(country0 != null) {
                e30.m0.getClass();
                e30.m0.l(null, country0);
                a3 a30 = new a3(e30, country0, null);
                N.k(e30, e30.i0, false, a30);
            }
        }
    }
}

