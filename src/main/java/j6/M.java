package j6;

import com.apollographql.apollo.api.b;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class m extends o0 {
    public long b0;
    public String c0;

    @Override  // j6.o0
    public final boolean t() {
        Calendar calendar0 = Calendar.getInstance();
        TimeUnit timeUnit0 = TimeUnit.MINUTES;
        int v = calendar0.get(15);
        this.b0 = timeUnit0.convert(((long)(calendar0.get(16) + v)), TimeUnit.MILLISECONDS);
        Locale locale0 = Locale.getDefault();
        String s = locale0.getLanguage();
        Locale locale1 = Locale.ENGLISH;
        this.c0 = b.q(s.toLowerCase(locale1), "-", locale0.getCountry().toLowerCase(locale1));
        return false;
    }

    public final long u() {
        this.r();
        return this.b0;
    }

    public final String v() {
        this.r();
        return this.c0;
    }
}

