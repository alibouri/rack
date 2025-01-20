package T8;

import io.sentry.g1;
import java.util.ArrayList;
import r8.h;
import r8.j;
import r8.o;
import r8.p;
import x8.d;

public class k implements p {
    public final h a;
    public final ArrayList b;

    public k(h h0) {
        this.b = new ArrayList();
        this.a = h0;
    }

    @Override  // r8.p
    public final void a(o o0) {
        this.b.add(o0);
    }

    public g1 b(j j0) {
        return new g1(16, new d(j0));
    }
}

