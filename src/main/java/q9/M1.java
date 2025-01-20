package q9;

import C3.i;
import D.x;
import b4.A0;
import io.sentry.config.a;
import pc.p;
import pc.s;
import pc.y;

public final class m1 implements s {
    @Override  // pc.s
    public final y a(x x0) {
        A0 a00 = (A0)x0.i;
        if(((a)a00.e) != null && ((p)a00.d).a("Content-Encoding") == null) {
            i i0 = a00.N();
            i0.v("Content-Encoding", "gzip");
            Y3.p p0 = new Y3.p(1, ((a)a00.e));
            i0.z(((String)a00.c), p0);
            return x0.f(i0.j());
        }
        return x0.f(a00);
    }
}

