package o0;

public abstract class j {
    public static final s a;
    public static final s b;
    public static final s c;
    public static final s d;
    public static final float[] e;

    static {
        j.a = new s(0.31006f, 0.31616f);
        j.b = new s(0.34567f, 0.3585f);
        j.c = new s(0.32168f, 0.33767f);
        j.d = new s(0.31271f, 0.32902f);
        j.e = new float[]{0.964212f, 1.0f, 0.825188f};
    }

    public static c a(c c0) {
        s s0 = j.b;
        a a0 = a.b;
        if(b.a(c0.b, b.a)) {
            s s1 = ((q)c0).d;
            if(!j.d(s1, s0)) {
                float[] arr_f = s0.a();
                float[] arr_f1 = s1.a();
                float[] arr_f2 = j.h(j.c(a0.a, arr_f1, arr_f), ((q)c0).i);
                return new q(((q)c0).a, ((q)c0).h, s0, arr_f2, ((q)c0).k, ((q)c0).n, ((q)c0).e, ((q)c0).f, ((q)c0).g, -1);
            }
        }
        return c0;
    }

    public static float b(float[] arr_f) {
        float f = arr_f[0];
        float f1 = arr_f[1];
        float f2 = arr_f[2];
        float f3 = arr_f[3];
        float f4 = arr_f[4];
        float f5 = (f2 * arr_f[5] + (f1 * f4 + f * f3) - f3 * f4 - f1 * f2 - f * arr_f[5]) * 0.5f;
        return f5 < 0.0f ? -f5 : f5;
    }

    public static final float[] c(float[] arr_f, float[] arr_f1, float[] arr_f2) {
        j.j(arr_f, arr_f1);
        j.j(arr_f, arr_f2);
        float[] arr_f3 = {arr_f2[0] / arr_f1[0], arr_f2[1] / arr_f1[1], arr_f2[2] / arr_f1[2]};
        return j.h(j.g(arr_f), j.i(arr_f3, arr_f));
    }

    public static final boolean d(s s0, s s1) {
        return s0 == s1 ? true : Math.abs(s0.a - s1.a) < 0.001f && Math.abs(s0.b - s1.b) < 0.001f;
    }

    public static final g e(c c0, c c1, int v) {
        if(c0 == c1) {
            return new e(c0, c0, 1);  // initializer: Lo0/g;-><init>(Lo0/c;Lo0/c;I)V
        }
        return b.a(c0.b, b.a) && b.a(c1.b, b.a) ? new f(((q)c0), ((q)c1), v) : new g(c0, c1, v);
    }

    public static float f(float f, float f1, float f2, float f3) {
        return f * f3 - f1 * f2;
    }

    public static final float[] g(float[] arr_f) {
        float f = arr_f[0];
        float f1 = arr_f[3];
        float f2 = arr_f[6];
        float f3 = arr_f[1];
        float f4 = arr_f[4];
        float f5 = arr_f[7];
        float f6 = arr_f[2];
        float f7 = arr_f[5];
        float f8 = arr_f[8];
        float f9 = f4 * f8 - f5 * f7;
        float f10 = f5 * f6 - f3 * f8;
        float f11 = f3 * f7 - f4 * f6;
        float f12 = f2 * f11 + (f1 * f10 + f * f9);
        float[] arr_f1 = new float[arr_f.length];
        arr_f1[0] = f9 / f12;
        arr_f1[1] = f10 / f12;
        arr_f1[2] = f11 / f12;
        arr_f1[3] = (f2 * f7 - f1 * f8) / f12;
        arr_f1[4] = (f8 * f - f2 * f6) / f12;
        arr_f1[5] = (f6 * f1 - f7 * f) / f12;
        arr_f1[6] = (f1 * f5 - f2 * f4) / f12;
        arr_f1[7] = (f2 * f3 - f5 * f) / f12;
        arr_f1[8] = (f * f4 - f1 * f3) / f12;
        return arr_f1;
    }

    public static final float[] h(float[] arr_f, float[] arr_f1) {
        float f = arr_f[0];
        float f1 = arr_f1[0];
        float f2 = arr_f[3];
        float f3 = arr_f1[1];
        float f4 = arr_f[6];
        float f5 = arr_f1[2];
        float f6 = arr_f[1];
        float f7 = arr_f[4];
        float f8 = arr_f[7];
        float f9 = arr_f[2];
        float f10 = arr_f[5];
        float f11 = arr_f[8];
        float f12 = arr_f1[3];
        float f13 = arr_f1[4];
        float f14 = f4 * arr_f1[5] + (f2 * f13 + f * f12);
        float f15 = f8 * arr_f1[5] + (f7 * f13 + f6 * f12);
        float f16 = arr_f1[5] * f11 + (f13 * f10 + f12 * f9);
        float f17 = arr_f1[6];
        float f18 = arr_f1[7];
        return new float[]{f4 * f5 + (f2 * f3 + f * f1), f8 * f5 + (f7 * f3 + f6 * f1), f5 * f11 + (f3 * f10 + f1 * f9), f14, f15, f16, f4 * arr_f1[8] + (f2 * f18 + f * f17), f8 * arr_f1[8] + (f7 * f18 + f6 * f17), f11 * arr_f1[8] + (f10 * f18 + f9 * f17)};
    }

    public static final float[] i(float[] arr_f, float[] arr_f1) {
        float f = arr_f[0];
        float f1 = arr_f1[0] * f;
        float f2 = arr_f[1];
        float f3 = arr_f1[1] * f2;
        float f4 = arr_f[2];
        return new float[]{f1, f3, arr_f1[2] * f4, arr_f1[3] * f, arr_f1[4] * f2, arr_f1[5] * f4, f * arr_f1[6], f2 * arr_f1[7], f4 * arr_f1[8]};
    }

    public static final void j(float[] arr_f, float[] arr_f1) {
        float f = arr_f1[0];
        float f1 = arr_f1[1];
        float f2 = arr_f1[2];
        arr_f1[0] = arr_f[6] * f2 + (arr_f[3] * f1 + arr_f[0] * f);
        arr_f1[1] = arr_f[7] * f2 + (arr_f[4] * f1 + arr_f[1] * f);
        arr_f1[2] = arr_f[8] * f2 + (arr_f[5] * f1 + arr_f[2] * f);
    }
}

