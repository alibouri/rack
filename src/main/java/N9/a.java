package n9;

import android.view.View.OnFocusChangeListener;
import android.view.View;
import com.sendwave.remit.util.CountryPhoneInputView;

public final class a implements View.OnFocusChangeListener {
    public final CountryPhoneInputView a;

    public a(CountryPhoneInputView countryPhoneInputView0) {
        this.a = countryPhoneInputView0;
    }

    @Override  // android.view.View$OnFocusChangeListener
    public final void onFocusChange(View view0, boolean z) {
        CountryPhoneInputView countryPhoneInputView0 = this.a;
        if(z) {
            if(countryPhoneInputView0.e0 == null) {
                countryPhoneInputView0.d();
                return;
            }
            countryPhoneInputView0.h0.requestFocus();
            return;
        }
        countryPhoneInputView0.getClass();
    }
}

