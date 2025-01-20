package com.sendwave.remit.util;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import com.sendwave.util.Country;
import m8.b;

public final class a implements TextWatcher {
    public final MobileChangedListener X;
    public final CountryPhoneInputView Y;

    public a(CountryPhoneInputView countryPhoneInputView0, MobileChangedListener countryPhoneInputView$MobileChangedListener0) {
        this.Y = countryPhoneInputView0;
        this.X = countryPhoneInputView$MobileChangedListener0;
    }

    @Override  // android.text.TextWatcher
    public final void afterTextChanged(Editable editable0) {
    }

    @Override  // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
    }

    @Override  // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
        try {
            CountryPhoneInputView countryPhoneInputView0 = this.Y;
            String s = charSequence0.toString();
            Phonenumber.PhoneNumber phonenumber$PhoneNumber0 = b.d().p(s, countryPhoneInputView0.c0);
            if(s.trim().startsWith("+")) {
                Country country0 = countryPhoneInputView0.a(phonenumber$PhoneNumber0);
                if(country0 != null) {
                    countryPhoneInputView0.setCountry(country0);
                    countryPhoneInputView0.setNationalNumber(b.d().c(phonenumber$PhoneNumber0, 3));
                    return;
                }
            }
            String s1 = b.d().c(phonenumber$PhoneNumber0, 1);
            this.X.a(s1);
        }
        catch(m8.a unused_ex) {
        }
    }
}

