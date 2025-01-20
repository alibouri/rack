package y1;

public final class l {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float[] g;
    public final float h;
    public final float i;
    public final float j;
    public static final l k;

    static {
        float[] arr_f = b.c;
        float f = (float)(((double)b.p()) * 63.661977 / 100.0);
        float f1 = arr_f[0];
        float[] arr_f1 = b.a[0];
        float f2 = arr_f1[0] * f1;
        float f3 = arr_f[1];
        float f4 = arr_f1[1] * f3 + f2;
        float f5 = arr_f[2];
        float f6 = arr_f1[2] * f5 + f4;
        float[] arr_f2 = b.a[1];
        float f7 = arr_f2[2] * f5 + (arr_f2[1] * f3 + arr_f2[0] * f1);
        float[] arr_f3 = b.a[2];
        float f8 = f5 * arr_f3[2] + (f3 * arr_f3[1] + f1 * arr_f3[0]);
        float f9 = (1.0f - ((float)Math.exp((-f - 42.0f) / 92.0f)) * 0.277778f) * 1.0f;
        if(((double)f9) > 1.0) {
            f9 = 1.0f;
        }
        else if(((double)f9) < 0.0) {
            f9 = 0.0f;
        }
        float[] arr_f4 = {100.0f / f6 * f9 + 1.0f - f9, 100.0f / f7 * f9 + 1.0f - f9, 100.0f / f8 * f9 + 1.0f - f9};
        float f10 = 1.0f / (5.0f * f + 1.0f);
        float f11 = f10 * f10 * f10 * f10;
        float f12 = 0.1f * (1.0f - f11) * (1.0f - f11) * ((float)Math.cbrt(((double)f) * 5.0)) + f11 * f;
        float f13 = b.p() / arr_f[1];
        float f14 = 0.725f / ((float)Math.pow(f13, 0.2));
        float f15 = (float)Math.pow(((double)(arr_f4[0] * f12 * f6)) / 100.0, 0.42);
        float f16 = (float)Math.pow(((double)(arr_f4[1] * f12 * f7)) / 100.0, 0.42);
        float f17 = (float)Math.pow(((double)(arr_f4[2] * f12 * f8)) / 100.0, 0.42);
        new float[]{f15 * 400.0f / (f15 + 27.129999f), f16 * 400.0f / (f16 + 27.129999f), 400.0f * f17 / (f17 + 27.129999f)};
        l.k = new l(f13, (400.0f * f17 / (f17 + 27.129999f) * 0.05f + (f15 * 400.0f / (f15 + 27.129999f) * 2.0f + f16 * 400.0f / (f16 + 27.129999f))) * f14, f14, f14, 0.69f, 1.0f, arr_f4, f12, ((float)Math.pow(f12, 0.25)), ((float)Math.sqrt(f13)) + 1.48f);
    }

    public l(float f, float f1, float f2, float f3, float f4, float f5, float[] arr_f, float f6, float f7, float f8) {
        this.f = f;
        this.a = f1;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.g = arr_f;
        this.h = f6;
        this.i = f7;
        this.j = f8;
    }
}

