package J9;

import Ab.k;
import Nb.j;
import Vb.q;
import W5.f;
import a.a;
import ac.B0;
import ac.j0;
import ac.o0;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import com.sendwave.util.Country;
import java.util.Locale;
import q9.l1;

public final class c implements TextWatcher {
    public final Country X;
    public final String Y;
    public final int Z;
    public final B3.c b0;
    public String c0;
    public boolean d0;
    public boolean e0;
    public final B0 f0;
    public final j0 g0;
    public final B0 h0;
    public final j0 i0;

    public c(Country country0) {
        this.X = country0;
        Locale locale0 = Locale.getDefault();
        j.e(locale0, "getDefault(...)");
        String s = country0.Y.toUpperCase(locale0);
        j.e(s, "toUpperCase(...)");
        this.Y = s;
        this.Z = country0.f0;
        this.b0 = new B3.c(10, country0);
        this.c0 = "";
        this.e0 = true;
        B0 b00 = o0.c("");
        this.f0 = b00;
        this.g0 = new j0(b00);
        B0 b01 = o0.c(null);
        this.h0 = b01;
        this.i0 = new j0(b01);
    }

    @Override  // android.text.TextWatcher
    public final void afterTextChanged(Editable editable0) {
        synchronized(this) {
            j.f(editable0, "s");
            if(this.d0) {
                return;
            }
            if(!this.e0) {
                this.d0 = true;
                editable0.replace(0, editable0.length(), this.c0, 0, this.c0.length());
                this.d0 = false;
                this.e0 = true;
                return;
            }
            int v1 = Selection.getSelectionEnd(editable0);
            k k0 = a.m(this.b0, editable0, v1);
            String s = (String)k0.X;
            int v2 = ((Number)k0.Y).intValue();
            this.d0 = true;
            this.c0 = s;
            Phonenumber.PhoneNumber phonenumber$PhoneNumber0 = l1.i(s, this.Y);
            String s1 = phonenumber$PhoneNumber0 == null ? null : l1.e(phonenumber$PhoneNumber0);
            this.f0.k(this.c0);
            this.h0.k(s1);
            if(!j.a(editable0.toString(), s)) {
                editable0.replace(0, editable0.length(), s, 0, s.length());
            }
            if(s.equals(editable0.toString())) {
                Selection.setSelection(editable0, v2);
            }
            this.d0 = false;
        }
    }

    @Override  // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
        j.f(charSequence0, "s");
    }

    @Override  // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
        j.f(charSequence0, "s");
        if(this.d0) {
            return;
        }
        if(v2 - v1 > 0) {
            String s = this.c0;
            StringBuilder stringBuilder0 = new StringBuilder();
            int v3 = s.length();
            for(int v4 = 0; v4 < v3; ++v4) {
                int v5 = s.charAt(v4);
                if(Character.isDigit(((char)v5))) {
                    stringBuilder0.append(((char)v5));
                }
            }
            String s1 = stringBuilder0.toString();
            j.e(s1, "toString(...)");
            String s2 = q9.o0.x(this.X);
            if(s2 != null && q.O(s1, s2, false)) {
                s1 = s1.substring(s2.length());
                j.e(s1, "substring(...)");
            }
            if(s1.length() >= this.Z) {
                this.e0 = false;
            }
        }
        if(v2 > 0) {
            while(true) {
                boolean z = true;
                if(v >= v2 + v) {
                    break;
                }
                int v6 = charSequence0.charAt(v);
                if(!Character.isDigit(((char)v6)) && !f.J(((char)v6)) && v6 != 43) {
                    z = false;
                    break;
                }
                ++v;
            }
            if(!z) {
                this.e0 = false;
            }
        }
    }
}

