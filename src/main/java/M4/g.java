package M4;

import J2.w;
import g5.a;
import io.sentry.M0;
import io.sentry.M;

public final class g implements a5.g, M0 {
    public final String X;

    public g(String s) {
        this.X = s;
        super();
    }

    @Override  // io.sentry.M0
    public void e(M m0) {
        m0.D(this.X);
    }

    @Override  // a5.g
    public void k(boolean z) {
        String s = this.X;
        if(z) {
            try {
                a a0 = new a(s);
                if(a0.b != null && a0.c != null) {
                    w.U(a0.a, a0.toString());
                }
            }
            catch(Exception unused_ex) {
            }
        }
    }
}

