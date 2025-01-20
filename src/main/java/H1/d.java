package h1;

import K.v;
import java.util.Arrays;

public final class d extends b {
    public e[] f;
    public e[] g;
    public int h;
    public v i;

    @Override  // h1.b
    public final e d(boolean[] arr_z) {
        int v1 = -1;
        for(int v = 0; v < this.h; ++v) {
            e[] arr_e = this.f;
            e e0 = arr_e[v];
            if(!arr_z[e0.Y]) {
                v v2 = this.i;
                v2.Y = e0;
                int v3 = 8;
                if(v1 == -1) {
                    while(v3 >= 0) {
                        float f = ((e)v2.Y).f0[v3];
                        if(f > 0.0f) {
                            break;
                        }
                        if(f < 0.0f) {
                            v1 = v;
                            break;
                        }
                        --v3;
                    }
                }
                else {
                    e e1 = arr_e[v1];
                    while(v3 >= 0) {
                        float f1 = e1.f0[v3];
                        float f2 = ((e)v2.Y).f0[v3];
                        if(f2 != f1) {
                            if(f2 >= f1) {
                                break;
                            }
                            v1 = v;
                            break;
                        }
                        --v3;
                    }
                }
            }
        }
        return v1 == -1 ? null : this.f[v1];
    }

    @Override  // h1.b
    public final boolean e() {
        return this.h == 0;
    }

    @Override  // h1.b
    public final void i(c c0, b b0, boolean z) {
        e e0 = b0.a;
        if(e0 == null) {
            return;
        }
        a a0 = b0.d;
        int v = a0.d();
        for(int v1 = 0; v1 < v; ++v1) {
            e e1 = a0.e(v1);
            float f = a0.f(v1);
            v v2 = this.i;
            v2.Y = e1;
            float[] arr_f = e0.f0;
            if(e1.X) {
                boolean z1 = true;
                for(int v3 = 0; v3 < 9; ++v3) {
                    float[] arr_f1 = ((e)v2.Y).f0;
                    float f1 = arr_f[v3] * f + arr_f1[v3];
                    arr_f1[v3] = f1;
                    if(Math.abs(f1) < 0.0001f) {
                        ((e)v2.Y).f0[v3] = 0.0f;
                    }
                    else {
                        z1 = false;
                    }
                }
                if(z1) {
                    ((d)v2.Z).k(((e)v2.Y));
                }
            }
            else {
                for(int v4 = 0; v4 < 9; ++v4) {
                    float f2 = arr_f[v4];
                    if(f2 == 0.0f) {
                        ((e)v2.Y).f0[v4] = 0.0f;
                    }
                    else {
                        ((e)v2.Y).f0[v4] = Math.abs(f2 * f) < 0.0001f ? 0.0f : f2 * f;
                    }
                }
                this.j(e1);
            }
            this.b = b0.b * f + this.b;
        }
        this.k(e0);
    }

    public final void j(e e0) {
        int v3;
        e[] arr_e = this.f;
        if(this.h + 1 > arr_e.length) {
            e[] arr_e1 = (e[])Arrays.copyOf(arr_e, arr_e.length * 2);
            this.f = arr_e1;
            this.g = (e[])Arrays.copyOf(arr_e1, arr_e1.length * 2);
        }
        e[] arr_e2 = this.f;
        int v = this.h;
        arr_e2[v] = e0;
        this.h = v + 1;
        if(v + 1 > 1 && arr_e2[v].Y > e0.Y) {
            for(int v2 = 0; true; ++v2) {
                v3 = this.h;
                if(v2 >= v3) {
                    break;
                }
                this.g[v2] = this.f[v2];
            }
            Arrays.sort(this.g, 0, v3, new E2.a(4));
            for(int v1 = 0; v1 < this.h; ++v1) {
                this.f[v1] = this.g[v1];
            }
        }
        e0.X = true;
        e0.a(this);
    }

    public final void k(e e0) {
        int v1;
        for(int v = 0; v < this.h; ++v) {
            if(this.f[v] == e0) {
                while(true) {
                    v1 = this.h;
                    if(v >= v1 - 1) {
                        break;
                    }
                    this.f[v] = this.f[v + 1];
                    ++v;
                }
                this.h = v1 - 1;
                e0.X = false;
                return;
            }
        }
    }

    @Override  // h1.b
    public final String toString() {
        String s = " goal -> (" + this.b + ") : ";
        for(int v = 0; v < this.h; ++v) {
            v v1 = this.i;
            v1.Y = this.f[v];
            s = s + v1 + " ";
        }
        return s;
    }
}

