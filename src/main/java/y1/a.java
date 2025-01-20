package y1;

import android.graphics.Color;

public final class a {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public a(float f, float f1, float f2, float f3, float f4, float f5) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
    }

    public static a a(int v) {
        l l0 = l.k;
        float f = b.h(Color.red(v));
        float f1 = b.h(Color.green(v));
        float f2 = b.h(Color.blue(v));
        float[] arr_f = b.d[0];
        float f3 = arr_f[2] * f2 + (arr_f[1] * f1 + arr_f[0] * f);
        float[] arr_f1 = b.d[1];
        float f4 = arr_f1[2] * f2 + (arr_f1[1] * f1 + arr_f1[0] * f);
        float[] arr_f2 = b.d[2];
        float f5 = f2 * arr_f2[2] + (f1 * arr_f2[1] + f * arr_f2[0]);
        float[] arr_f3 = b.a[0];
        float f6 = arr_f3[2] * f5 + (arr_f3[1] * f4 + arr_f3[0] * f3);
        float[] arr_f4 = b.a[1];
        float f7 = arr_f4[2] * f5 + (arr_f4[1] * f4 + arr_f4[0] * f3);
        float[] arr_f5 = b.a[2];
        float f8 = f5 * arr_f5[2] + (f4 * arr_f5[1] + f3 * arr_f5[0]);
        float f9 = l0.g[0] * f6;
        float f10 = l0.g[1] * f7;
        float f11 = l0.g[2] * f8;
        float f12 = (float)Math.pow(((double)(Math.abs(f9) * l0.h)) / 100.0, 0.42);
        float f13 = (float)Math.pow(((double)(Math.abs(f10) * l0.h)) / 100.0, 0.42);
        float f14 = (float)Math.pow(((double)(Math.abs(f11) * l0.h)) / 100.0, 0.42);
        float f15 = Math.signum(f9) * 400.0f * f12 / (f12 + 27.129999f);
        float f16 = Math.signum(f10) * 400.0f * f13 / (f13 + 27.129999f);
        float f17 = Math.signum(f11) * 400.0f * f14 / (f14 + 27.129999f);
        float f18 = ((float)(((double)f16) * -12.0 + ((double)f15) * 11.0 + ((double)f17))) / 11.0f;
        float f19 = ((float)(((double)(f15 + f16)) - ((double)f17) * 2.0)) / 9.0f;
        float f20 = ((float)Math.atan2(f19, f18)) * 180.0f / 3.141593f;
        if(Float.compare(f20, 0.0f) < 0) {
            f20 += 360.0f;
        }
        else if(f20 >= 360.0f) {
            f20 -= 360.0f;
        }
        float f21 = ((float)Math.pow((f15 * 40.0f + f16 * 20.0f + f17) / 20.0f * l0.b / l0.a, l0.j * l0.d)) * 100.0f;
        float f22 = ((float)Math.pow(1.64 - Math.pow(0.29, l0.f), 0.73)) * ((float)Math.pow(((float)(Math.cos(((double)(((double)f20) < 20.14 ? 360.0f + f20 : f20)) * 3.141593 / 180.0 + 2.0) + 3.8)) * 961.538452f * l0.e * l0.c * ((float)Math.sqrt(f19 * f19 + f18 * f18)) / ((21.0f * f17 + (f15 * 20.0f + f16 * 20.0f)) / 20.0f + 0.305f), 0.9));
        float f23 = f22 * ((float)Math.sqrt(((double)f21) / 100.0));
        float f24 = f22 * l0.d / (l0.a + 4.0f);
        float f25 = ((float)Math.log(l0.i * f23 * 0.0228f + 1.0f)) * 43.85965f;
        double f26 = (double)(3.141593f * f20 / 180.0f);
        return new a(f20, f23, f21, 1.7f * f21 / (0.007f * f21 + 1.0f), f25 * ((float)Math.cos(f26)), f25 * ((float)Math.sin(f26)));
    }

    public static a b(float f, float f1, float f2) {
        float f3 = f1 / ((float)Math.sqrt(((double)f) / 100.0)) * l.k.d / (l.k.a + 4.0f);
        float f4 = ((float)Math.log(((double)(l.k.i * f1)) * 0.0228 + 1.0)) * 43.85965f;
        double f5 = (double)(3.141593f * f2 / 180.0f);
        return new a(f2, f1, f, 1.7f * f / (0.007f * f + 1.0f), f4 * ((float)Math.cos(f5)), f4 * ((float)Math.sin(f5)));
    }

    public final int c(l l0) {
        float f = (float)Math.pow(((double)(Double.compare(this.b, 0.0) == 0 || ((double)this.c) == 0.0 ? 0.0f : this.b / ((float)Math.sqrt(((double)this.c) / 100.0)))) / Math.pow(1.64 - Math.pow(0.29, l0.f), 0.73), 1.111111);
        double f1 = (double)(this.a * 3.141593f / 180.0f);
        float f2 = l0.a * ((float)Math.pow(((double)this.c) / 100.0, 1.0 / ((double)l0.d) / ((double)l0.j))) / l0.b;
        float f3 = (float)Math.sin(f1);
        float f4 = (float)Math.cos(f1);
        float f5 = (0.305f + f2) * 23.0f * f / (f * 108.0f * f3 + (11.0f * f * f4 + ((float)(Math.cos(2.0 + f1) + 3.8)) * 961.538452f * l0.e * l0.c * 23.0f));
        float f6 = f4 * f5;
        float f7 = f5 * f3;
        float f8 = (288.0f * f7 + (451.0f * f6 + f2 * 460.0f)) / 1403.0f;
        float f9 = (f2 * 460.0f - 891.0f * f6 - 261.0f * f7) / 1403.0f;
        float f10 = (f2 * 460.0f - f6 * 220.0f - f7 * 6300.0f) / 1403.0f;
        float f11 = Math.signum(f8) * (100.0f / l0.h) * ((float)Math.pow(((float)Math.max(0.0, ((double)Math.abs(f8)) * 27.13 / (400.0 - ((double)Math.abs(f8))))), 2.380952)) / l0.g[0];
        float f12 = Math.signum(f9) * (100.0f / l0.h) * ((float)Math.pow(((float)Math.max(0.0, ((double)Math.abs(f9)) * 27.13 / (400.0 - ((double)Math.abs(f9))))), 2.380952)) / l0.g[1];
        float f13 = Math.signum(f10) * (100.0f / l0.h) * ((float)Math.pow(((float)Math.max(0.0, ((double)Math.abs(f10)) * 27.13 / (400.0 - ((double)Math.abs(f10))))), 2.380952)) / l0.g[2];
        float[] arr_f = b.b[0];
        float f14 = arr_f[2] * f13 + (arr_f[1] * f12 + arr_f[0] * f11);
        float[] arr_f1 = b.b[1];
        float f15 = arr_f1[2] * f13 + (arr_f1[1] * f12 + arr_f1[0] * f11);
        float[] arr_f2 = b.b[2];
        return z1.a.a(f14, f15, f13 * arr_f2[2] + (f12 * arr_f2[1] + f11 * arr_f2[0]));
    }
}

