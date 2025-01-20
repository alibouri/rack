package a3;

import Bb.q;
import Ec.l;
import I2.J;
import Vb.a;
import java.io.Closeable;
import java.nio.charset.Charset;
import pc.t;
import rc.b;

public abstract class p implements Closeable {
    public abstract long a();

    public abstract t b();

    @Override
    public void close() {
        b.c(this.h());
    }

    public abstract J f();

    public abstract l h();

    public String l() {
        String s1;
        String s;
        Charset charset0;
        l l0 = this.h();
        try {
            t t0 = this.b();
            if(t0 == null) {
                charset0 = a.a;
            }
            else {
                charset0 = a.a;
                String[] arr_s = t0.b;
                int v = 0;
                int v1 = q.z(0, arr_s.length - 1, 2);
                if(v1 >= 0) {
                    while(!Vb.q.J(arr_s[v], "charset")) {
                        if(v == v1) {
                            goto label_14;
                        }
                        v += 2;
                    }
                    s = arr_s[v + 1];
                }
                else {
                label_14:
                    s = null;
                }
                if(s != null) {
                    try {
                        charset0 = Charset.forName(s);
                    }
                    catch(IllegalArgumentException unused_ex) {
                    }
                }
                if(charset0 == null) {
                    charset0 = a.a;
                }
            }
            s1 = l0.W(b.s(l0, charset0));
        }
        catch(Throwable throwable0) {
            T4.l.F(l0, throwable0);
            throw throwable0;
        }
        T4.l.F(l0, null);
        return s1;
    }
}

