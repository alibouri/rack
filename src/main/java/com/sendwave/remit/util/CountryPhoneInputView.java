package com.sendwave.remit.util;

import F0.A;
import J9.c;
import Nb.j;
import R9.Z1;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import com.sendwave.util.Country;
import h9.b;
import hb.h;
import java.util.Collections;
import java.util.List;
import q9.M0;
import q9.r1;

public class CountryPhoneInputView extends LinearLayout {
    public interface CountryChangedListener {
        void a(String arg1);
    }

    public interface MobileChangedListener {
        void a(String arg1);
    }

    public final String b0;
    public String c0;
    public String d0;
    public Country e0;
    public List f0;
    public boolean g0;
    public final AppCompatEditText h0;
    public CountryChangedListener i0;
    public c j0;
    public a k0;
    public final boolean l0;
    public boolean m0;
    public static final int n0;

    public CountryPhoneInputView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.b0 = "";
        this.c0 = "";
        this.d0 = "+1";
        this.i0 = null;
        this.j0 = null;
        this.k0 = null;
        View view0 = LayoutInflater.from(context0).inflate(0x7F0D0060, this, true);  // layout:item_country_phone_input
        AppCompatEditText appCompatEditText0 = (AppCompatEditText)this.findViewById(0x7F0A0243);  // id:phone_number
        this.h0 = appCompatEditText0;
        View view1 = this.findViewById(0x7F0A0240);  // id:phone_country_button
        view1.setOnFocusChangeListener(new n9.a(this));
        appCompatEditText0.setNextFocusDownId(view0.getNextFocusDownId());
        appCompatEditText0.setNextFocusForwardId(view0.getNextFocusForwardId());
        appCompatEditText0.setNextFocusRightId(view0.getNextFocusRightId());
        TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(attributeSet0, b.b, 0, 0);
        try {
            if(!typedArray0.getBoolean(2, true)) {
                view1.setVisibility(8);
            }
            this.l0 = typedArray0.getBoolean(0, true);
        }
        finally {
            typedArray0.recycle();
        }
        Collections.sort(((List)Country.Q0.getValue()), new A(11));
        this.b(((List)Country.Q0.getValue()));
        TextView textView0 = (TextView)this.findViewById(0x7F0A0241);  // id:phone_country_prefix
        ((ImageView)this.findViewById(0x7F0A00B9)).setColorFilter(textView0.getCurrentTextColor());  // id:caret
    }

    public final Country a(Phonenumber.PhoneNumber phonenumber$PhoneNumber0) {
        String s = "+" + phonenumber$PhoneNumber0.Y;
        for(Object object0: this.f0) {
            Country country0 = (Country)object0;
            if(country0.c0.equals(s)) {
                return country0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public final void b(List list0) {
        this.f0 = list0;
        View view0 = this.findViewById(0x7F0A0240);  // id:phone_country_button
        view0.setOnClickListener(new Z1(2, this));
        view0.setOnTouchListener(new n9.b(this));
        boolean z = true;
        this.g0 = true;
        if(this.f0 != null) {
            ((ImageView)this.findViewById(0x7F0A00B9)).setVisibility((this.f0.size() <= 1 ? 8 : 0));  // id:caret
            if(this.f0.size() <= 1) {
                z = false;
            }
            view0.setEnabled(z);
        }
    }

    public final void c(Country country0, boolean z) {
        if(country0.Y.toUpperCase().equals(this.c0)) {
            return;
        }
        if(this.e0 == null || country0.Y.toUpperCase().equals(this.c0)) {
            z = false;
        }
        AppCompatEditText appCompatEditText0 = this.h0;
        Editable editable0 = appCompatEditText0.getText();
        if(this.m0 && editable0 != null && editable0.toString().startsWith("+")) {
            try {
                Country country1 = this.a(this.getNumber());
                if(country1 != null) {
                    country0 = country1;
                }
            }
            catch(m8.a unused_ex) {
            }
            finally {
                this.m0 = false;
            }
        }
        this.e0 = country0;
        ImageView imageView0 = (ImageView)this.findViewById(0x7F0A0242);  // id:phone_flag
        TextView textView0 = (TextView)this.findViewById(0x7F0A0241);  // id:phone_country_prefix
        imageView0.setVisibility((this.g0 ? 0 : 8));
        textView0.setVisibility(0);
        String s = country0.Y;
        this.c0 = s.toUpperCase();
        imageView0.setImageDrawable(M0.e(country0, this.getContext()));
        this.d0 = country0.c0;
        textView0.setText(country0.c0);
        c c0 = this.j0;
        if(c0 != null) {
            appCompatEditText0.removeTextChangedListener(c0);
        }
        String s1 = this.c0;
        j.f(s1, "iso2");
        Country country2 = M0.b(s1);
        j.c(country2);
        c c1 = new c(country2);
        this.j0 = c1;
        appCompatEditText0.addTextChangedListener(c1);
        if(z) {
            appCompatEditText0.setText("");
        }
        else if(appCompatEditText0.getText() != null) {
            int v1 = appCompatEditText0.getSelectionStart();
            int v2 = appCompatEditText0.getSelectionEnd();
            int v3 = appCompatEditText0.getText().length();
            appCompatEditText0.setText(appCompatEditText0.getText().toString().replace(" ", ""));
            int v4 = appCompatEditText0.getText().length();
            if(v1 >= v3 / 2) {
                v1 = h.F(v4 - (v3 - v1), 0, v4);
            }
            if(v2 >= v3 / 2) {
                v2 = h.F(v4 - (v3 - v2), 0, v4);
            }
            appCompatEditText0.setSelection(v1, v2);
        }
        String s2 = country0.e0;
        if(s2.length() > 0) {
            appCompatEditText0.setHint(s2);
        }
        else {
            appCompatEditText0.setHint("Mobile");
        }
        CountryChangedListener countryPhoneInputView$CountryChangedListener0 = this.i0;
        if(countryPhoneInputView$CountryChangedListener0 != null) {
            countryPhoneInputView$CountryChangedListener0.a(s);
        }
    }

    public final void d() {
        Context context0 = this.getContext();
        List list0 = this.f0;
        String s = this.c0;
        J9.h h0 = new J9.h(2, this);
        AlertDialog.Builder alertDialog$Builder0 = new AlertDialog.Builder(context0).setTitle(r1.d(0x7F1203D7, new Object[0]));  // string:select_country "Select country"
        n9.c c0 = new n9.c();  // initializer: Landroid/widget/BaseAdapter;-><init>()V
        c0.Z = (LayoutInflater)context0.getSystemService("layout_inflater");
        c0.X = list0;
        c0.Y = context0;
        c0.b0 = s;
        c0.c0 = true;
        alertDialog$Builder0.setAdapter(c0, new m2.c(1, h0)).show();
    }

    @Override  // android.widget.LinearLayout
    public int getBaseline() {
        int v = this.h0.getTop();
        return this.h0.getBaseline() + v;
    }

    public Country getCountry() {
        return this.e0;
    }

    public CountryChangedListener getCountryChangedListener() {
        return this.i0;
    }

    public EditText getEditText() {
        return this.h0;
    }

    public Phonenumber.PhoneNumber getNumber() {
        return m8.b.d().p(this.getEditText().getText().toString(), this.c0);
    }

    public String getNumberAsString() {
        return this.d0 + this.getNumber().Z;
    }

    public String getValidationError() {
        return this.b0;
    }

    @Override  // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable0) {
        if(parcelable0 instanceof Bundle) {
            this.setCountry(((Bundle)parcelable0).getString("countryIso2"));
            parcelable0 = ((Bundle)parcelable0).getParcelable("instanceState");
        }
        super.onRestoreInstanceState(parcelable0);
    }

    @Override  // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new Bundle();
        ((Bundle)parcelable0).putParcelable("instanceState", super.onSaveInstanceState());
        Country country0 = this.e0;
        if(country0 != null) {
            ((BaseBundle)parcelable0).putString("countryIso2", country0.Y);
        }
        return parcelable0;
    }

    public void setCountry(Country country0) {
        this.c(country0, true);
    }

    public void setCountry(String s) {
        if(s != null) {
            Country country0 = M0.b(s);
            if(country0 != null) {
                this.setCountry(country0);
            }
        }
    }

    public void setCountryChangedListener(CountryChangedListener countryPhoneInputView$CountryChangedListener0) {
        this.i0 = countryPhoneInputView$CountryChangedListener0;
        Country country0 = this.e0;
        if(country0 != null) {
            countryPhoneInputView$CountryChangedListener0.a(country0.Y);
        }
    }

    public void setMobileChangedListener(MobileChangedListener countryPhoneInputView$MobileChangedListener0) {
        a a0 = this.k0;
        AppCompatEditText appCompatEditText0 = this.h0;
        if(a0 != null) {
            appCompatEditText0.removeTextChangedListener(a0);
            this.k0 = null;
        }
        if(countryPhoneInputView$MobileChangedListener0 == null) {
            return;
        }
        a a1 = new a(this, countryPhoneInputView$MobileChangedListener0);
        this.k0 = a1;
        appCompatEditText0.addTextChangedListener(a1);
        this.k0.onTextChanged(appCompatEditText0.getText(), 0, 0, 0);
    }

    public void setNationalNumber(String s) {
        this.h0.setText(s);
    }
}

