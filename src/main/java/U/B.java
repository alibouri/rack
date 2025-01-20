package u;

import I2.J;

public abstract class b {
    public static final float[] a;

    static {
        float f12;
        float f11;
        float f10;
        float f9;
        float f6;
        float f5;
        float f4;
        float f3;
        float[] arr_f = new float[101];
        b.a = arr_f;
        float[] arr_f1 = new float[101];
        float f = 0.0f;
        float f1 = 0.0f;
        for(int v = 0; v < 100; ++v) {
            float f2 = 1.0f;
            while(true) {
                f3 = (f2 - f) / 2.0f + f;
                f4 = 1.0f - f3;
                f5 = f3 * 3.0f * f4;
                f6 = f3 * f3 * f3;
                float f7 = (f3 * 0.35f + f4 * 0.175f) * f5 + f6;
                if(((double)Math.abs(f7 - ((float)v) / 100.0f)) < 0.00001) {
                    break;
                }
                if(f7 > ((float)v) / 100.0f) {
                    f2 = f3;
                }
                else {
                    f = f3;
                }
            }
            arr_f[v] = (f4 * 0.5f + f3) * f5 + f6;
            float f8 = 1.0f;
            while(true) {
                f9 = (f8 - f1) / 2.0f + f1;
                f10 = 1.0f - f9;
                f11 = f9 * 3.0f * f10;
                f12 = f9 * f9 * f9;
                float f13 = (f10 * 0.5f + f9) * f11 + f12;
                if(((double)Math.abs(f13 - ((float)v) / 100.0f)) < 0.00001) {
                    break;
                }
                if(f13 > ((float)v) / 100.0f) {
                    f8 = f9;
                }
                else {
                    f1 = f9;
                }
            }
            arr_f1[v] = (f9 * 0.35f + f10 * 0.175f) * f11 + f12;
        }
        arr_f1[100] = 1.0f;
        arr_f[100] = 1.0f;
    }

    public static a a(float f) {
        float f1 = 0.0f;
        float f2 = 1.0f;
        float f3 = J.q(f, 0.0f, 1.0f);
        int v = (int)(100.0f * f3);
        if(v < 100) {
            float f4 = b.a[v];
            float f5 = (b.a[v + 1] - f4) / (((float)(v + 1)) / 100.0f - ((float)v) / 100.0f);
            f1 = f5;
            f2 = m5.b.o(f3, ((float)v) / 100.0f, f5, f4);
        }
        return new a(f2, f1);
    }
}

