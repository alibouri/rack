package y7;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import v7.d;
import z7.a;

public final class j {
    public final d a;
    public static final long b;
    public static final Pattern c;
    public static j d;

    static {
        j.b = TimeUnit.HOURS.toSeconds(1L);
        j.c = Pattern.compile("\\AA[\\w-]{38}\\z");
    }

    public j(d d0) {
        this.a = d0;
    }

    public final boolean a(a a0) {
        if(TextUtils.isEmpty(a0.c)) {
            return true;
        }
        TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
        this.a.getClass();
        return a0.f + a0.e < timeUnit0.toSeconds(System.currentTimeMillis()) + j.b;
    }
}

