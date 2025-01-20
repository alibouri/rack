package x8;

public final class e {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;

    public e(float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.a = f;
        this.b = f3;
        this.c = f6;
        this.d = f1;
        this.e = f4;
        this.f = f7;
        this.g = f2;
        this.h = f5;
        this.i = f8;
    }

    public static e a(float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15) {
        e e0 = e.b(f, f1, f2, f3, f4, f5, f6, f7);
        float f16 = e0.e * e0.i - e0.f * e0.h;
        float f17 = e0.f * e0.g - e0.d * e0.i;
        float f18 = e0.d * e0.h - e0.e * e0.g;
        float f19 = e0.c * e0.h - e0.b * e0.i;
        float f20 = e0.i * e0.a - e0.c * e0.g;
        float f21 = e0.g * e0.b - e0.h * e0.a;
        float f22 = e0.b * e0.f - e0.c * e0.e;
        float f23 = e0.c * e0.d - e0.f * e0.a;
        float f24 = e0.a * e0.e - e0.b * e0.d;
        e e1 = e.b(f8, f9, f10, f11, f12, f13, f14, f15);
        return new e(e1.d * f19 + e1.a * f16 + e1.g * f22, e1.g * f23 + (e1.d * f20 + e1.a * f17), e1.g * f24 + (e1.d * f21 + e1.a * f18), e1.h * f22 + (e1.e * f19 + e1.b * f16), e1.h * f23 + (e1.e * f20 + e1.b * f17), e1.e * f21 + e1.b * f18 + e1.h * f24, f22 * e1.i + (f19 * e1.f + f16 * e1.c), f20 * e1.f + f17 * e1.c + f23 * e1.i, e1.i * f24 + (e1.f * f21 + e1.c * f18));
    }

    public static e b(float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = f - f2 + f4 - f6;
        float f9 = f1 - f3 + f5 - f7;
        if(f8 == 0.0f && f9 == 0.0f) {
            return new e(f2 - f, f4 - f2, f, f3 - f1, f5 - f3, f1, 0.0f, 0.0f, 1.0f);
        }
        float f10 = f2 - f4;
        float f11 = f6 - f4;
        float f12 = f3 - f5;
        float f13 = f7 - f5;
        float f14 = f10 * f13 - f11 * f12;
        float f15 = (f13 * f8 - f11 * f9) / f14;
        float f16 = (f10 * f9 - f8 * f12) / f14;
        return new e(f15 * f2 + (f2 - f), f16 * f6 + (f6 - f), f, f15 * f3 + (f3 - f1), f16 * f7 + (f7 - f1), f1, f15, f16, 1.0f);
    }
}

