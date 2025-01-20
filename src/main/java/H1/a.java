package h1;

import M.J;
import a8.Q;
import java.util.Arrays;

public final class a {
    public int a;
    public final b b;
    public final Q c;
    public int d;
    public int[] e;
    public int[] f;
    public float[] g;
    public int h;
    public int i;
    public boolean j;

    public a(b b0, Q q0) {
        this.a = 0;
        this.d = 8;
        this.e = new int[8];
        this.f = new int[8];
        this.g = new float[8];
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.b = b0;
        this.c = q0;
    }

    public final void a(e e0, float f, boolean z) {
        if(Float.compare(f, -0.001f) > 0 && f >= 0.001f) {
            return;
        }
        int v = this.h;
        b b0 = this.b;
        if(v == -1) {
            this.h = 0;
            this.g[0] = f;
            this.e[0] = e0.Y;
            this.f[0] = -1;
            ++e0.i0;
            e0.a(b0);
            ++this.a;
            if(!this.j) {
                int v1 = this.i + 1;
                this.i = v1;
                int[] arr_v = this.e;
                if(v1 >= arr_v.length) {
                    this.j = true;
                    this.i = arr_v.length - 1;
                }
            }
            return;
        }
        int v3 = -1;
        for(int v2 = 0; v != -1 && v2 < this.a; ++v2) {
            int v4 = this.e[v];
            int v5 = e0.Y;
            if(v4 == v5) {
                float[] arr_f = this.g;
                float f1 = arr_f[v] + f;
                if(Float.compare(f1, -0.001f) > 0 && f1 >= 0.001f) {
                    f1 = 0.0f;
                }
                arr_f[v] = f1;
                if(f1 == 0.0f) {
                    if(v == this.h) {
                        this.h = this.f[v];
                    }
                    else {
                        this.f[v3] = this.f[v];
                    }
                    if(z) {
                        e0.b(b0);
                    }
                    if(this.j) {
                        this.i = v;
                    }
                    --e0.i0;
                    --this.a;
                }
                return;
            }
            if(v4 < v5) {
                v3 = v;
            }
            v = this.f[v];
        }
        int v6 = this.i;
        if(this.j) {
            int[] arr_v1 = this.e;
            if(arr_v1[v6] != -1) {
                v6 = arr_v1.length;
            }
        }
        else {
            ++v6;
        }
        if(v6 >= this.e.length && this.a < this.e.length) {
            for(int v7 = 0; true; ++v7) {
                int[] arr_v2 = this.e;
                if(v7 >= arr_v2.length) {
                    break;
                }
                if(arr_v2[v7] == -1) {
                    v6 = v7;
                    break;
                }
            }
        }
        int[] arr_v3 = this.e;
        if(v6 >= arr_v3.length) {
            v6 = arr_v3.length;
            int v8 = this.d * 2;
            this.d = v8;
            this.j = false;
            this.i = v6 - 1;
            this.g = Arrays.copyOf(this.g, v8);
            this.e = Arrays.copyOf(this.e, this.d);
            this.f = Arrays.copyOf(this.f, this.d);
        }
        this.e[v6] = e0.Y;
        this.g[v6] = f;
        if(v3 == -1) {
            this.f[v6] = this.h;
            this.h = v6;
        }
        else {
            int[] arr_v4 = this.f;
            arr_v4[v6] = arr_v4[v3];
            arr_v4[v3] = v6;
        }
        ++e0.i0;
        e0.a(b0);
        ++this.a;
        if(!this.j) {
            ++this.i;
        }
        int[] arr_v5 = this.e;
        if(this.i >= arr_v5.length) {
            this.j = true;
            this.i = arr_v5.length - 1;
        }
    }

    public final void b() {
        int v = this.h;
        for(int v1 = 0; v != -1 && v1 < this.a; ++v1) {
            e e0 = ((e[])this.c.b0)[this.e[v]];
            if(e0 != null) {
                e0.b(this.b);
            }
            v = this.f[v];
        }
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.a = 0;
    }

    public final float c(e e0) {
        int v = this.h;
        for(int v1 = 0; v != -1 && v1 < this.a; ++v1) {
            if(this.e[v] == e0.Y) {
                return this.g[v];
            }
            v = this.f[v];
        }
        return 0.0f;
    }

    public final int d() {
        return this.a;
    }

    public final e e(int v) {
        int v1 = this.h;
        for(int v2 = 0; v1 != -1 && v2 < this.a; ++v2) {
            if(v2 == v) {
                return ((e[])this.c.b0)[this.e[v1]];
            }
            v1 = this.f[v1];
        }
        return null;
    }

    public final float f(int v) {
        int v1 = this.h;
        for(int v2 = 0; v1 != -1 && v2 < this.a; ++v2) {
            if(v2 == v) {
                return this.g[v1];
            }
            v1 = this.f[v1];
        }
        return 0.0f;
    }

    public final void g(e e0, float f) {
        if(Float.compare(f, 0.0f) == 0) {
            this.h(e0, true);
            return;
        }
        int v = this.h;
        b b0 = this.b;
        if(v == -1) {
            this.h = 0;
            this.g[0] = f;
            this.e[0] = e0.Y;
            this.f[0] = -1;
            ++e0.i0;
            e0.a(b0);
            ++this.a;
            if(!this.j) {
                int v1 = this.i + 1;
                this.i = v1;
                int[] arr_v = this.e;
                if(v1 >= arr_v.length) {
                    this.j = true;
                    this.i = arr_v.length - 1;
                }
            }
            return;
        }
        int v3 = -1;
        for(int v2 = 0; v != -1 && v2 < this.a; ++v2) {
            int v4 = this.e[v];
            int v5 = e0.Y;
            if(v4 == v5) {
                this.g[v] = f;
                return;
            }
            if(v4 < v5) {
                v3 = v;
            }
            v = this.f[v];
        }
        int v6 = this.i;
        if(this.j) {
            int[] arr_v1 = this.e;
            if(arr_v1[v6] != -1) {
                v6 = arr_v1.length;
            }
        }
        else {
            ++v6;
        }
        if(v6 >= this.e.length && this.a < this.e.length) {
            for(int v7 = 0; true; ++v7) {
                int[] arr_v2 = this.e;
                if(v7 >= arr_v2.length) {
                    break;
                }
                if(arr_v2[v7] == -1) {
                    v6 = v7;
                    break;
                }
            }
        }
        int[] arr_v3 = this.e;
        if(v6 >= arr_v3.length) {
            v6 = arr_v3.length;
            int v8 = this.d * 2;
            this.d = v8;
            this.j = false;
            this.i = v6 - 1;
            this.g = Arrays.copyOf(this.g, v8);
            this.e = Arrays.copyOf(this.e, this.d);
            this.f = Arrays.copyOf(this.f, this.d);
        }
        this.e[v6] = e0.Y;
        this.g[v6] = f;
        if(v3 == -1) {
            this.f[v6] = this.h;
            this.h = v6;
        }
        else {
            int[] arr_v4 = this.f;
            arr_v4[v6] = arr_v4[v3];
            arr_v4[v3] = v6;
        }
        ++e0.i0;
        e0.a(b0);
        int v9 = this.a + 1;
        this.a = v9;
        if(!this.j) {
            ++this.i;
        }
        int[] arr_v5 = this.e;
        if(v9 >= arr_v5.length) {
            this.j = true;
        }
        if(this.i >= arr_v5.length) {
            this.j = true;
            this.i = arr_v5.length - 1;
        }
    }

    public final float h(e e0, boolean z) {
        int v = this.h;
        if(v == -1) {
            return 0.0f;
        }
        int v1 = 0;
        int v2 = -1;
        while(v != -1 && v1 < this.a) {
            if(this.e[v] == e0.Y) {
                if(v == this.h) {
                    this.h = this.f[v];
                }
                else {
                    this.f[v2] = this.f[v];
                }
                if(z) {
                    e0.b(this.b);
                }
                --e0.i0;
                --this.a;
                this.e[v] = -1;
                if(this.j) {
                    this.i = v;
                }
                return this.g[v];
            }
            ++v1;
            v2 = v;
            v = this.f[v];
        }
        return 0.0f;
    }

    @Override
    public final String toString() {
        int v = this.h;
        String s = "";
        for(int v1 = 0; v != -1 && v1 < this.a; ++v1) {
            StringBuilder stringBuilder0 = J.i((s + " -> "));
            stringBuilder0.append(this.g[v]);
            stringBuilder0.append(" : ");
            StringBuilder stringBuilder1 = J.i(stringBuilder0.toString());
            stringBuilder1.append(((e[])this.c.b0)[this.e[v]]);
            s = stringBuilder1.toString();
            v = this.f[v];
        }
        return s;
    }
}

