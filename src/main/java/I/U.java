package i;

import F1.f;
import V0.a;
import android.content.res.Configuration;
import android.os.LocaleList;

public abstract class u {
    public static void a(Configuration configuration0, Configuration configuration1, Configuration configuration2) {
        LocaleList localeList0 = configuration0.getLocales();
        LocaleList localeList1 = configuration1.getLocales();
        if(!a.y(localeList1, localeList0)) {
            configuration2.setLocales(localeList1);
            configuration2.locale = configuration1.locale;
        }
    }

    public static f b(Configuration configuration0) {
        return f.b(configuration0.getLocales().toLanguageTags());
    }

    public static void c(f f0) {
        LocaleList.setDefault(LocaleList.forLanguageTags(f0.a.a()));
    }

    public static void d(Configuration configuration0, f f0) {
        configuration0.setLocales(LocaleList.forLanguageTags(f0.a.a()));
    }
}

