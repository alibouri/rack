package J2;

import J8.j;
import android.content.Context;
import w2.a;
import w2.b;
import w2.c;
import x2.f;

public final class q implements b {
    public final Context a;

    public q(Context context0) {
        this.a = context0;
        super();
    }

    @Override  // w2.b
    public c a(a a0) {
        Context context0 = this.a;
        j j0 = a0.c;
        Nb.j.f(j0, "callback");
        String s = a0.b;
        if(s == null || s.length() == 0) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new f(context0, s, j0, true, true);
    }
}

