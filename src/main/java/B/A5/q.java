package a5;

import M4.l;
import N4.j;
import io.sentry.hints.i;
import java.util.HashMap;

public final class q {
    public final String a;
    public StringBuilder b;
    public static final i c;
    public static final HashMap d;

    static {
        q.c = new i(16);
        q.d = new HashMap();
    }

    public q() {
        j.D("Request", "tag");
        this.a = "FacebookSDK.Request";
        this.b = new StringBuilder();
    }

    public final void a(Object object0, String s) {
        Nb.j.f(s, "key");
        Nb.j.f(object0, "value");
    }

    public final void b() {
        synchronized(l.b) {
        }
    }
}

