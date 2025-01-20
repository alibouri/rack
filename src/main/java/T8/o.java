package T8;

import io.sentry.g1;
import r8.f;
import r8.j;
import x8.d;

public final class o extends k {
    public boolean c;

    @Override  // T8.k
    public final g1 b(j j0) {
        if(this.c) {
            this.c = false;
            return new g1(16, new d(new f(j0)));
        }
        this.c = true;
        return new g1(16, new d(j0));
    }
}

