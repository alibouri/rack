package v;

import java.util.Arrays;
import m5.b;
import r.t;

public final class s {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public float h;
    public float i;
    public final float[] j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;
    public final float o;
    public final float p;
    public final boolean q;
    public final boolean r;
    public static float[] s;

    static {
    }

    public s(int v, float f, float f1, float f2, float f3, float f4, float f5) {
        boolean z1;
        float f18;
        float f17;
        boolean z;
        float f6 = f2;
        super();
        this.a = f;
        this.b = f1;
        this.c = f6;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        float f7 = f4 - f6;
        float f8 = f5 - f3;
        switch(v) {
            case 1: {
                z = true;
                break;
            }
            case 4: {
                z = f8 > 0.0f;
                break;
            }
            case 5: {
                z = f8 < 0.0f;
                break;
            }
            default: {
                z = false;
            }
        }
        this.q = z;
        float f9 = f1 - f;
        this.k = 1.0f / f9;
        if(3 == v || Math.abs(f7) < 0.001f || Math.abs(f8) < 0.001f) {
            float f20 = (float)Math.hypot(f8, f7);
            this.g = f20;
            this.p = f20 * (1.0f / f9);
            this.n = f7 / f9;
            this.o = f8 / f9;
            this.j = new float[101];
            this.l = NaNf;
            this.m = NaNf;
            z1 = true;
        }
        else {
            this.j = new float[101];
            this.l = ((float)(z ? -1 : 1)) * f7;
            this.m = f8 * ((float)(z ? 1 : -1));
            if(z) {
                f6 = f4;
            }
            this.n = f6;
            this.o = z ? f3 : f5;
            float f10 = f3 - f5;
            float[] arr_f = t.b();
            float f11 = 0.0f;
            float f13 = 0.0f;
            int v1 = 0;
            for(float f12 = 0.0f; v1 < arr_f.length; f12 = f15) {
                double f14 = (double)(((float)Math.toRadians(((double)v1) * 90.0 / ((double)(t.b().length - 1)))));
                float f15 = ((float)Math.sin(f14)) * f7;
                float f16 = ((float)Math.cos(f14)) * f10;
                if(v1 > 0) {
                    f17 = f10;
                    f18 = f16;
                    f11 += (float)Math.hypot(f15 - f12, f16 - f13);
                    t.b()[v1] = f11;
                }
                else {
                    f17 = f10;
                    f18 = f16;
                }
                ++v1;
                f10 = f17;
                f13 = f18;
            }
            this.g = f11;
            float[] arr_f1 = t.b();
            for(int v2 = 0; v2 < arr_f1.length; ++v2) {
                float[] arr_f2 = t.b();
                arr_f2[v2] /= f11;
            }
            float[] arr_f3 = this.j;
            for(int v3 = 0; v3 < arr_f3.length; ++v3) {
                float f19 = ((float)v3) / ((float)(arr_f3.length - 1));
                float[] arr_f4 = t.b();
                int v4 = Arrays.binarySearch(arr_f4, 0, arr_f4.length, f19);
                if(v4 >= 0) {
                    arr_f3[v3] = ((float)v4) / ((float)(t.b().length - 1));
                }
                else if(v4 == -1) {
                    arr_f3[v3] = 0.0f;
                }
                else {
                    arr_f3[v3] = ((f19 - t.b()[-v4 - 2]) / (t.b()[-v4 - 1] - t.b()[-v4 - 2]) + ((float)(-v4 - 2))) / ((float)(t.b().length - 1));
                }
            }
            this.p = this.g * this.k;
            z1 = 3 == v;
        }
        this.r = z1;
    }

    public final float a() {
        float f = this.l * this.i;
        float f1 = this.p / ((float)Math.hypot(f, -this.m * this.h));
        if(this.q) {
            f = -f;
        }
        return f * f1;
    }

    public final float b() {
        float f = -this.m * this.h;
        float f1 = this.p / ((float)Math.hypot(this.l * this.i, f));
        return this.q ? -f * f1 : f * f1;
    }

    public final void c(float f) {
        float f1 = (this.q ? this.b - f : f - this.a) * this.k;
        float f2 = 0.0f;
        if(f1 > 0.0f && f1 < 1.0f) {
            float f3 = f1 * ((float)(this.j.length - 1));
            float f4 = this.j[((int)f3)];
            f2 = b.o(this.j[((int)f3) + 1], f4, f3 - ((float)(((int)f3))), f4);
        }
        this.h = (float)Math.sin(f2 * 1.570796f);
        this.i = (float)Math.cos(f2 * 1.570796f);
    }
}

