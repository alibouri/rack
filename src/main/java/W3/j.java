package W3;

import Ec.B;
import Ec.G;
import Ec.b;
import Ec.l;
import Ec.m;
import Fc.a;
import java.io.Closeable;
import v7.d;

public final class j implements Closeable {
    public final l X;
    public final m Y;
    public final m Z;
    public int b0;
    public boolean c0;
    public boolean d0;
    public i e0;
    public final B f0;

    public j(l l0, String s) {
        this.X = l0;
        Ec.j j0 = new Ec.j();  // initializer: Ljava/lang/Object;-><init>()V
        j0.m0("--");
        j0.m0(s);
        this.Y = j0.N(j0.Y);
        Ec.j j1 = new Ec.j();  // initializer: Ljava/lang/Object;-><init>()V
        j1.m0("\r\n--");
        j1.m0(s);
        this.Z = j1.N(j1.Y);
        m m0 = d.l("\r\n");
        m m1 = d.l("--");
        m m2 = d.l(" ");
        m m3 = d.l("\t");
        this.f0 = b.g(new m[]{d.l(("\r\n--" + s + "--")), m0, m1, m2, m3});
    }

    public final long a(long v) {
        long v9;
        long v1 = 0L;
        m m0 = this.Z;
        l l0 = this.X;
        l0.Q(((long)m0.e()));
        Ec.j j0 = l0.w();
        j0.getClass();
        j0.getClass();
        Nb.j.f(m0, "bytes");
        if(m0.e() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        G g0 = j0.X;
        if(g0 != null) {
            long v2 = j0.Y;
            if(Long.compare(v2, 0L) < 0) {
                while(v2 > 0L) {
                    g0 = g0.g;
                    Nb.j.c(g0);
                    v2 -= (long)(g0.c - g0.b);
                }
                byte[] arr_b = m0.i();
                int v3 = arr_b[0];
                int v4 = m0.e();
                long v5 = j0.Y - ((long)v4) + 1L;
                long v6 = 0L;
                while(v2 < v5) {
                    int v7 = (int)Math.min(g0.c, ((long)g0.b) + v5 - v2);
                    for(int v8 = (int)(((long)g0.b) + v6 - v2); v8 < v7; ++v8) {
                        if(g0.a[v8] == v3 && a.a(g0, v8 + 1, arr_b, v4)) {
                            v9 = ((long)(v8 - g0.b)) + v2;
                            return v9 == -1L ? Math.min(v, l0.w().Y - ((long)m0.e()) + 1L) : Math.min(v, v9);
                        }
                    }
                    v2 += (long)(g0.c - g0.b);
                    g0 = g0.f;
                    Nb.j.c(g0);
                    v6 = v2;
                    v5 = v5;
                }
                return Math.min(v, l0.w().Y - ((long)m0.e()) + 1L);
            }
            long v10;
            while((v10 = ((long)(g0.c - g0.b)) + v1) <= 0L) {
                g0 = g0.f;
                Nb.j.c(g0);
                v1 = v10;
            }
            byte[] arr_b1 = m0.i();
            int v11 = arr_b1[0];
            int v12 = m0.e();
            long v13 = j0.Y - ((long)v12) + 1L;
            for(long v14 = 0L; v1 < v13; v14 = v1) {
                int v15 = (int)Math.min(g0.c, ((long)g0.b) + v13 - v1);
                for(int v16 = (int)(((long)g0.b) + v14 - v1); v16 < v15; ++v16) {
                    if(g0.a[v16] == v11 && a.a(g0, v16 + 1, arr_b1, v12)) {
                        v9 = ((long)(v16 - g0.b)) + v1;
                        return v9 == -1L ? Math.min(v, l0.w().Y - ((long)m0.e()) + 1L) : Math.min(v, v9);
                    }
                }
                v1 += (long)(g0.c - g0.b);
                g0 = g0.f;
                Nb.j.c(g0);
            }
        }
        return Math.min(v, l0.w().Y - ((long)m0.e()) + 1L);
    }

    @Override
    public final void close() {
        if(this.c0) {
            return;
        }
        this.c0 = true;
        this.e0 = null;
        this.X.close();
    }
}

