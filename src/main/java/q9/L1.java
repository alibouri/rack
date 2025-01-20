package q9;

import Ab.o;
import B3.c;
import Ea.e0;
import Vb.j;
import Vb.q;
import W4.f;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import com.sendwave.util.Country;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import m8.b;

public final class l1 {
    public static final o a;
    public static final List b;
    public static final o c;

    static {
        l1.a = f.A(new e0(21));
        l1.b = j.f0("SN - 76 12X XX 91\nCI - 05 31 2X XX 87\nBF - 79 3X XX 23\nML - 70 3X XX 12\nUG - 0781 1XX X75\nGM - 532 XXX8");
        l1.c = f.A(new e0(22));
    }

    public static String a(Phonenumber.PhoneNumber phonenumber$PhoneNumber0) {
        String s = l1.e(phonenumber$PhoneNumber0);
        Country country0 = M0.c(s);
        Nb.j.c(country0);
        String s1 = new c(10, country0).m(s, true);
        return q.M((country0.c0 + " " + s1), " ", " ");
    }

    public static String b(String s) {
        Nb.j.f(s, "mobile");
        Country country0 = M0.c(s);
        Nb.j.c(country0);
        Phonenumber.PhoneNumber phonenumber$PhoneNumber0 = l1.h(s, null);
        if(phonenumber$PhoneNumber0 != null) {
            s = l1.e(phonenumber$PhoneNumber0);
        }
        if(Nb.j.a(M0.c(s), country0)) {
            return l1.d(s, null);
        }
        Phonenumber.PhoneNumber phonenumber$PhoneNumber1 = l1.h(s, null);
        return phonenumber$PhoneNumber1 == null ? s : l1.a(phonenumber$PhoneNumber1);
    }

    public static String c(Phonenumber.PhoneNumber phonenumber$PhoneNumber0) {
        String s = l1.e(phonenumber$PhoneNumber0);
        Country country0 = M0.c(s);
        Nb.j.c(country0);
        return q.M(new c(10, country0).m(s, true), " ", " ");
    }

    public static String d(String s, String s1) {
        Nb.j.f(s, "mobile");
        Phonenumber.PhoneNumber phonenumber$PhoneNumber0 = l1.h(s, s1);
        return phonenumber$PhoneNumber0 == null ? s : l1.c(phonenumber$PhoneNumber0);
    }

    public static String e(Phonenumber.PhoneNumber phonenumber$PhoneNumber0) {
        String s = l1.f().c(phonenumber$PhoneNumber0, 1);
        Nb.j.e(s, "format(...)");
        return s;
    }

    public static b f() {
        Object object0 = l1.a.getValue();
        Nb.j.e(object0, "getValue(...)");
        return (b)object0;
    }

    public static boolean g(Phonenumber.PhoneNumber phonenumber$PhoneNumber0, String s) {
        Locale locale0 = Locale.getDefault();
        Nb.j.e(locale0, "getDefault(...)");
        String s1 = s.toLowerCase(locale0);
        Nb.j.e(s1, "toLowerCase(...)");
        Country country0 = M0.b(s1);
        if(country0 != null) {
            String s2 = l1.f().c(phonenumber$PhoneNumber0, 2);
            Nb.j.e(s2, "format(...)");
            String s3 = q.M(s2, " ", "");
            return Pattern.matches(country0.h0, s3);
        }
        return false;
    }

    public static Phonenumber.PhoneNumber h(String s, String s1) {
        String s2;
        Nb.j.f(s, "mobile");
        if(s1 == null) {
            s2 = null;
        }
        else {
            Locale locale0 = Locale.getDefault();
            Nb.j.e(locale0, "getDefault(...)");
            s2 = s1.toUpperCase(locale0);
            Nb.j.e(s2, "toUpperCase(...)");
        }
        try {
            Phonenumber.PhoneNumber phonenumber$PhoneNumber0 = l1.f().p(s, s2);
            if(l1.f().k(phonenumber$PhoneNumber0)) {
                return phonenumber$PhoneNumber0;
            }
        }
        catch(Throwable unused_ex) {
        }
        return null;
    }

    public static Phonenumber.PhoneNumber i(String s, String s1) {
        Nb.j.f(s, "mobile");
        Nb.j.f(s1, "regionIso2");
        Locale locale0 = Locale.getDefault();
        Nb.j.e(locale0, "getDefault(...)");
        String s2 = s1.toUpperCase(locale0);
        Nb.j.e(s2, "toUpperCase(...)");
        try {
            Phonenumber.PhoneNumber phonenumber$PhoneNumber0 = l1.f().p(s, s2);
            if(l1.g(phonenumber$PhoneNumber0, s2)) {
                return phonenumber$PhoneNumber0;
            }
        }
        catch(Throwable unused_ex) {
        }
        return null;
    }
}

