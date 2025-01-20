package u8;

import B8.c;
import r8.i;
import r8.o;
import x8.b;
import x8.e;
import yc.d;

public final class a {
    public final b a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public static final int[] g;

    static {
        a.g = new int[]{0xEE0, 476, 2107, 0x707};
    }

    public a(b b0) {
        this.a = b0;
    }

    public final s8.a a(boolean z) {
        int v30;
        int v28;
        int v27;
        long v26;
        int v24;
        c c14;
        c c11;
        b b1;
        c c10;
        c c9;
        c c8;
        int v9;
        int v8;
        int v7;
        int v6;
        o o11;
        o o10;
        o o8;
        o o7;
        int v5;
        int v4;
        o o3;
        o o2;
        o o1;
        o o0;
        b b0;
        try {
            b0 = this.a;
            o[] arr_o = new y8.a(b0).b();
            o0 = arr_o[0];
            o1 = arr_o[1];
            o2 = arr_o[2];
            o3 = arr_o[3];
        }
        catch(i unused_ex) {
            int v = b0.X / 2 + 7;
            int v1 = b0.Y / 2 - 7;
            o o4 = this.e(new c(v, v1, 7), false, 1, -1).a();
            int v2 = b0.Y / 2 + 7;
            o o5 = this.e(new c(v, v2, 7), false, 1, 1).a();
            int v3 = b0.X / 2 - 7;
            o o6 = this.e(new c(v3, v2, 7), false, -1, 1).a();
            o3 = this.e(new c(v3, v1, 7), false, -1, -1).a();
            o2 = o6;
            o0 = o4;
            o1 = o5;
        }
        try {
            v4 = d.B((o0.a + o3.a + o1.a + o2.a) / 4.0f);
            v5 = d.B((o0.b + o3.b + o1.b + o2.b) / 4.0f);
            o[] arr_o1 = new y8.a(b0, 15, v4, v5).b();
            o7 = arr_o1[0];
            o8 = arr_o1[1];
            o o9 = arr_o1[2];
            o10 = arr_o1[3];
            o11 = o9;
        }
        catch(i unused_ex) {
            o o12 = this.e(new c(v4 + 7, v5 - 7, 7), false, 1, -1).a();
            o8 = this.e(new c(v4 + 7, v5 + 7, 7), false, 1, 1).a();
            o11 = this.e(new c(v4 - 7, v5 + 7, 7), false, -1, 1).a();
            o10 = this.e(new c(v4 - 7, v5 - 7, 7), false, -1, -1).a();
            o7 = o12;
        }
        c c0 = new c(d.B((o7.a + o10.a + o8.a + o11.a) / 4.0f), d.B((o7.b + o10.b + o8.b + o11.b) / 4.0f), 7);
        this.e = 1;
        boolean z1 = true;
        c c1 = c0;
        c c2 = c1;
        c c3 = c2;
        while(true) {
            v6 = c3.c;
            v7 = c3.b;
            v8 = c0.c;
            v9 = c0.b;
            if(this.e >= 9) {
                b1 = b0;
                c11 = c1;
                c10 = c2;
                break;
            }
            c c4 = this.e(c0, z1, 1, -1);
            c c5 = this.e(c1, z1, 1, 1);
            c c6 = this.e(c2, z1, -1, 1);
            c c7 = this.e(c3, z1, -1, -1);
            if(this.e > 2) {
                int v10 = c7.b;
                int v11 = c4.b;
                int v12 = c7.c;
                c8 = c7;
                int v13 = c4.c;
                c9 = c4;
                c10 = c2;
                b1 = b0;
                c11 = c1;
                double f = (double)(((float)Math.sqrt((v12 - v13) * (v12 - v13) + (v10 - v11) * (v10 - v11))) * ((float)this.e) / (((float)Math.sqrt((v6 - v8) * (v6 - v8) + (v7 - v9) * (v7 - v9))) * ((float)(this.e + 2))));
                if(f < 0.75 || f > 1.25) {
                    break;
                }
                c c12 = new c(v11 - 3, v13 + 3, 7);
                c c13 = new c(c5.b - 3, c5.c - 3, 7);
                c14 = c5;
                c c15 = new c(c6.b + 3, c6.c - 3, 7);
                c c16 = new c(v10 + 3, v12 + 3, 7);
                int v14 = this.c(c16, c12);
                if(v14 == 0 || this.c(c12, c13) != v14 || this.c(c13, c15) != v14 || this.c(c15, c16) != v14) {
                    break;
                }
            }
            else {
                b1 = b0;
                c9 = c4;
                c8 = c7;
                c14 = c5;
            }
            z1 = !z1;
            ++this.e;
            c2 = c6;
            c3 = c8;
            b0 = b1;
            c0 = c9;
            c1 = c14;
        }
        int v15 = this.e;
        if(v15 != 5 && v15 != 7) {
            throw i.Z;
        }
        this.b = v15 == 5;
        o[] arr_o2 = a.b(new o[]{new o(((float)v9) + 0.5f, ((float)v8) - 0.5f), new o(((float)c11.b) + 0.5f, ((float)c11.c) + 0.5f), new o(((float)c10.b) - 0.5f, ((float)c10.c) + 0.5f), new o(((float)v7) - 0.5f, ((float)v6) - 0.5f)}, v15 * 2 - 3, v15 * 2);
        if(z) {
            o o13 = arr_o2[0];
            arr_o2[0] = arr_o2[2];
            arr_o2[2] = o13;
        }
        if(!this.g(arr_o2[0]) || !this.g(arr_o2[1]) || !this.g(arr_o2[2]) || !this.g(arr_o2[3])) {
            throw i.Z;
        }
        int v16 = this.e * 2;
        int[] arr_v = {this.h(arr_o2[0], arr_o2[1], v16), this.h(arr_o2[1], arr_o2[2], v16), this.h(arr_o2[2], arr_o2[3], v16), this.h(arr_o2[3], arr_o2[0], v16)};
        int v18 = 0;
        for(int v19 = 0; v19 < 4; ++v19) {
            int v20 = arr_v[v19];
            v18 = (v18 << 3) + ((v20 >> v16 - 2 << 1) + (v20 & 1));
        }
        for(int v21 = 0; v21 < 4; ++v21) {
            if(Integer.bitCount(a.g[v21] ^ ((v18 & 1) << 11) + (v18 >> 1)) <= 2) {
                this.f = v21;
                long v22 = 0L;
                for(int v23 = 0; true; ++v23) {
                    v24 = 10;
                    if(v23 >= 4) {
                        break;
                    }
                    int v25 = arr_v[(this.f + v23) % 4];
                    if(this.b) {
                        v26 = v22 << 7;
                        v27 = v25 >> 1 & 0x7F;
                    }
                    else {
                        v26 = v22 << 10;
                        v27 = (v25 >> 2 & 0x3E0) + (v25 >> 1 & 0x1F);
                    }
                    v22 = v26 + ((long)v27);
                }
                if(this.b) {
                    v24 = 7;
                    v28 = 2;
                }
                else {
                    v28 = 4;
                }
                int[] arr_v1 = new int[v24];
                for(int v29 = v24 - 1; v29 >= 0; --v29) {
                    arr_v1[v29] = ((int)v22) & 15;
                    v22 >>= 4;
                }
                try {
                    new g.a(28, z8.a.k).t(arr_v1, v24 - v28);
                    v30 = 0;
                }
                catch(z8.c unused_ex) {
                    throw i.Z;
                }
                for(int v17 = 0; v17 < v28; ++v17) {
                    v30 = (v30 << 4) + arr_v1[v17];
                }
                if(this.b) {
                    this.c = (v30 >> 6) + 1;
                    this.d = (v30 & 0x3F) + 1;
                }
                else {
                    this.c = (v30 >> 11) + 1;
                    this.d = (v30 & 0x7FF) + 1;
                }
                int v31 = this.f;
                o o14 = arr_o2[v31 % 4];
                o o15 = arr_o2[(v31 + 1) % 4];
                o o16 = arr_o2[(v31 + 2) % 4];
                o o17 = arr_o2[(v31 + 3) % 4];
                int v32 = this.d();
                float f1 = ((float)v32) / 2.0f - ((float)this.e);
                float f2 = ((float)v32) / 2.0f + ((float)this.e);
                return new s8.a(a.a.y(b1, v32, v32, e.a(f1, f1, f2, f1, f2, f2, f1, f2, o14.a, o14.b, o15.a, o15.b, o16.a, o16.b, o17.a, o17.b)), a.b(arr_o2, this.e * 2, this.d()), this.b, this.d, this.c);
            }
        }
        throw i.Z;
    }

    public static o[] b(o[] arr_o, int v, int v1) {
        float f = ((float)v1) / (((float)v) * 2.0f);
        o o0 = arr_o[0];
        float f1 = arr_o[2].a;
        float f2 = o0.b - arr_o[2].b;
        float f3 = (o0.a + f1) / 2.0f;
        float f4 = (o0.b + arr_o[2].b) / 2.0f;
        float f5 = (o0.a - f1) * f;
        float f6 = f2 * f;
        o o1 = new o(f3 + f5, f4 + f6);
        o o2 = new o(f3 - f5, f4 - f6);
        o o3 = arr_o[1];
        float f7 = arr_o[3].a;
        float f8 = o3.b - arr_o[3].b;
        float f9 = (o3.a + f7) / 2.0f;
        float f10 = (o3.b + arr_o[3].b) / 2.0f;
        float f11 = (o3.a - f7) * f;
        return new o[]{o1, new o(f9 + f11, f10 + f * f8), o2, new o(f9 - f11, f10 - f * f8)};
    }

    public final int c(c c0, c c1) {
        int v = c0.b;
        int v1 = v - c1.b;
        int v2 = c0.c;
        int v3 = c1.c;
        float f = (float)Math.sqrt((v2 - v3) * (v2 - v3) + v1 * v1);
        float f1 = ((float)(c1.b - v)) / f;
        float f2 = (float)v;
        float f3 = (float)v2;
        b b0 = this.a;
        boolean z = b0.c(v, v2);
        int v4 = (int)Math.ceil(f);
        boolean z1 = false;
        int v6 = 0;
        for(int v5 = 0; v5 < v4; ++v5) {
            f2 += f1;
            f3 += ((float)(v3 - v2)) / f;
            if(b0.c(d.B(f2), d.B(f3)) != z) {
                ++v6;
            }
        }
        float f4 = ((float)v6) / f;
        if(f4 <= 0.1f && f4 >= 0.9f) {
            return 0;
        }
        if(Float.compare(f4, 0.1f) <= 0) {
            z1 = true;
        }
        return z1 == z ? 1 : -1;
    }

    public final int d() {
        if(this.b) {
            return this.c * 4 + 11;
        }
        return this.c > 4 ? (this.c - 4) / 8 * 2 + this.c * 4 + 17 : this.c * 4 + 15;
    }

    public final c e(c c0, boolean z, int v, int v1) {
        int v2 = c0.b + v;
        int v3 = c0.c;
        while(true) {
            v3 += v1;
            b b0 = this.a;
            if(!this.f(v2, v3) || b0.c(v2, v3) != z) {
                break;
            }
            v2 += v;
        }
        int v4 = v2 - v;
        int v5 = v3 - v1;
        while(this.f(v4, v5) && b0.c(v4, v5) == z) {
            v4 += v;
        }
        int v6 = v4 - v;
        while(this.f(v6, v5) && b0.c(v6, v5) == z) {
            v5 += v1;
        }
        return new c(v6, v5 - v1, 7);
    }

    public final boolean f(int v, int v1) {
        return v >= 0 && (v < this.a.X && v1 > 0 && v1 < this.a.Y);
    }

    public final boolean g(o o0) {
        return this.f(d.B(o0.a), d.B(o0.b));
    }

    public final int h(o o0, o o1, int v) {
        float f = o0.a - o1.a;
        float f1 = o0.b;
        float f2 = f1 - o1.b;
        float f3 = (float)Math.sqrt(f2 * f2 + f * f);
        float f4 = f3 / ((float)v);
        float f5 = o0.a;
        float f6 = (o1.a - f5) * f4 / f3;
        float f7 = (o1.b - f1) * f4 / f3;
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            if(this.a.c(d.B(((float)v1) * f6 + f5), d.B(((float)v1) * f7 + f1))) {
                v2 |= 1 << v - v1 - 1;
            }
        }
        return v2;
    }
}

