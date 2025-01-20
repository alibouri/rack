package W7;

import V7.h;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

public final class i {
    public final HashSet a;
    public final Executor b;
    public final c c;
    public final c d;
    public static final Pattern e;
    public static final Pattern f;

    static {
        Charset.forName("UTF-8");
        i.e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        i.f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public i(Executor executor0, c c0, c c1) {
        this.a = new HashSet();
        this.b = executor0;
        this.c = c0;
        this.d = c1;
    }

    public final void a(h h0) {
        synchronized(this.a) {
            this.a.add(h0);
        }
    }

    public static HashSet b(c c0) {
        HashSet hashSet0 = new HashSet();
        e e0 = c0.c();
        if(e0 == null) {
            return hashSet0;
        }
        Iterator iterator0 = e0.b.keys();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            hashSet0.add(((String)object0));
        }
        return hashSet0;
    }
}

