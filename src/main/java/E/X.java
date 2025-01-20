package E;

import D0.a0;
import Nb.j;
import a1.a;
import androidx.compose.foundation.lazy.layout.c;
import androidx.compose.ui.graphics.GraphicsContext;
import dc.e;
import java.util.Arrays;

public final class x {
    public u[] a;
    public a b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final c h;

    public x(c c0) {
        this.h = c0;
        this.a = A.a;
        this.e = 1;
    }

    public final void a(M m0, e e0, GraphicsContext graphicsContext0, int v, int v1, int v2) {
        u[] arr_u = this.a;
        for(int v4 = 0; true; ++v4) {
            if(v4 >= arr_u.length) {
                this.f = v;
                this.g = v1;
                break;
            }
            u u0 = arr_u[v4];
            if(u0 != null && u0.e) {
                break;
            }
        }
        for(int v5 = m0.b(); v5 < this.a.length; ++v5) {
            u u1 = this.a[v5];
            if(u1 != null) {
                u1.c();
            }
        }
        if(this.a.length != m0.b()) {
            Object[] arr_object = Arrays.copyOf(this.a, m0.b());
            j.e(arr_object, "copyOf(this, newSize)");
            this.a = (u[])arr_object;
        }
        this.b = new a(m0.k());
        this.c = v2;
        this.d = m0.j();
        this.e = m0.d();
        int v6 = m0.b();
        for(int v3 = 0; v3 < v6; ++v3) {
            Object object0 = m0.i(v3);
            g g0 = object0 instanceof g ? ((g)object0) : null;
            if(g0 == null) {
                u u2 = this.a[v3];
                if(u2 != null) {
                    u2.c();
                }
                this.a[v3] = null;
            }
            else {
                u u3 = this.a[v3];
                if(u3 == null) {
                    u3 = new u(e0, graphicsContext0, new a0(1, this.h));
                    this.a[v3] = u3;
                }
                u3.d = g0.l0;
            }
        }
    }

    public static void b(x x0, M m0, e e0, GraphicsContext graphicsContext0, int v, int v1) {
        x0.h.getClass();
        long v2 = m0.h(0);
        x0.a(m0, e0, graphicsContext0, v, v1, ((int)(m0.e() ? v2 >> 0x20 : v2 & 0xFFFFFFFFL)));
    }
}

