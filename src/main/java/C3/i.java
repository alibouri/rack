package c3;

import Ab.o;
import Nb.j;
import android.net.Uri;
import i3.m;

public final class i implements f {
    public final o a;
    public final o b;
    public final boolean c;

    public i(o o0, o o1, boolean z) {
        this.a = o0;
        this.b = o1;
        this.c = z;
    }

    @Override  // c3.f
    public final g a(Object object0, m m0) {
        return !j.a(((Uri)object0).getScheme(), "http") && !j.a(((Uri)object0).getScheme(), "https") ? null : new l(((Uri)object0).toString(), m0, this.a, this.b, this.c);
    }
}

