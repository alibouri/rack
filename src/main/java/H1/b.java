package h1;

import M.J;
import a8.Q;
import java.util.ArrayList;

public class b {
    public e a;
    public float b;
    public final ArrayList c;
    public final a d;
    public boolean e;

    public b(Q q0) {
        this.a = null;
        this.b = 0.0f;
        this.c = new ArrayList();
        this.e = false;
        this.d = new a(this, q0);
    }

    public final void a(c c0, int v) {
        e e0 = c0.j(v);
        this.d.g(e0, 1.0f);
        e e1 = c0.j(v);
        this.d.g(e1, -1.0f);
    }

    public final void b(e e0, e e1, e e2, int v) {
        boolean z = false;
        if(v != 0) {
            if(v < 0) {
                v *= -1;
                z = true;
            }
            this.b = (float)v;
        }
        if(!z) {
            this.d.g(e0, -1.0f);
            this.d.g(e1, 1.0f);
            this.d.g(e2, 1.0f);
            return;
        }
        this.d.g(e0, 1.0f);
        this.d.g(e1, -1.0f);
        this.d.g(e2, -1.0f);
    }

    public final void c(e e0, e e1, e e2, int v) {
        boolean z = false;
        if(v != 0) {
            if(v < 0) {
                v *= -1;
                z = true;
            }
            this.b = (float)v;
        }
        if(!z) {
            this.d.g(e0, -1.0f);
            this.d.g(e1, 1.0f);
            this.d.g(e2, -1.0f);
            return;
        }
        this.d.g(e0, 1.0f);
        this.d.g(e1, -1.0f);
        this.d.g(e2, 1.0f);
    }

    public e d(boolean[] arr_z) {
        return this.f(arr_z, null);
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.d.d() == 0;
    }

    public final e f(boolean[] arr_z, e e0) {
        int v = this.d.d();
        e e1 = null;
        float f = 0.0f;
        for(int v1 = 0; v1 < v; ++v1) {
            float f1 = this.d.f(v1);
            if(f1 < 0.0f) {
                e e2 = this.d.e(v1);
                if((arr_z == null || !arr_z[e2.Y]) && e2 != e0 && (e2.j0 == 3 || e2.j0 == 4) && f1 >= f) {
                    f = f1;
                    e1 = e2;
                }
            }
        }
        return e1;
    }

    public final void g(e e0) {
        e e1 = this.a;
        if(e1 != null) {
            this.d.g(e1, -1.0f);
            this.a.Z = -1;
            this.a = null;
        }
        float f = this.d.h(e0, true);
        this.a = e0;
        if(f * -1.0f == 1.0f) {
            return;
        }
        this.b /= f * -1.0f;
        a a0 = this.d;
        int v = a0.h;
        for(int v1 = 0; v != -1 && v1 < a0.a; ++v1) {
            a0.g[v] /= f * -1.0f;
            v = a0.f[v];
        }
    }

    public final void h(c c0, e e0, boolean z) {
        if(e0 != null && e0.d0) {
            float f = this.d.c(e0);
            this.b = e0.c0 * f + this.b;
            this.d.h(e0, z);
            if(z) {
                e0.b(this);
            }
            if(this.d.d() == 0) {
                this.e = true;
                c0.b = true;
            }
        }
    }

    public void i(c c0, b b0, boolean z) {
        a a0 = this.d;
        a0.getClass();
        float f = a0.c(b0.a);
        a0.h(b0.a, z);
        a a1 = b0.d;
        int v = a1.d();
        for(int v1 = 0; v1 < v; ++v1) {
            e e0 = a1.e(v1);
            a0.a(e0, a1.c(e0) * f, z);
        }
        this.b = b0.b * f + this.b;
        if(z) {
            b0.a.b(this);
        }
        if(this.a != null && this.d.d() == 0) {
            this.e = true;
            c0.b = true;
        }
    }

    @Override
    public String toString() {
        boolean z;
        String s = (this.a == null ? "0" : "" + this.a) + " = ";
        if(Float.compare(this.b, 0.0f) == 0) {
            z = false;
        }
        else {
            StringBuilder stringBuilder0 = J.i(s);
            stringBuilder0.append(this.b);
            s = stringBuilder0.toString();
            z = true;
        }
        int v1 = this.d.d();
        for(int v = 0; v < v1; ++v) {
            e e0 = this.d.e(v);
            if(e0 != null) {
                float f = this.d.f(v);
                int v2 = Float.compare(f, 0.0f);
                if(v2 != 0) {
                    String s1 = e0.toString();
                    if(z) {
                        if(v2 > 0) {
                            s = s + " + ";
                        }
                        else {
                            s = s + " - ";
                            f *= -1.0f;
                        }
                    }
                    else if(f < 0.0f) {
                        s = s + "- ";
                        f *= -1.0f;
                    }
                    s = f == 1.0f ? s + s1 : s + f + " " + s1;
                    z = true;
                }
            }
        }
        return z ? s : s + "0.0";
    }
}

