package b1;

import s.K;

public abstract class b {
    public static final float[] a;
    public static volatile K b;
    public static final Object[] c;

    static {
        b.a = new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
        b.b = new K(0);
        Object[] arr_object = new Object[0];
        b.c = arr_object;
        synchronized(arr_object) {
            b.b.e(0x73, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.799999f, 21.799999f, 25.200001f, 30.0f, 100.0f}));
            b.b.e(130, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.799999f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            b.b.e(150, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            b.b.e(180, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.799999f, 32.799999f, 34.799999f, 100.0f}));
            b.b.e(200, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if(((float)b.b.X[0]) / 100.0f - 0.01f <= 1.03f) {
            throw new IllegalStateException("You should only apply non-linear scaling to font scales > 1");
        }
    }

    public static a a(float f) {
        float f1;
        a a2;
        a a1;
        if(f >= 1.03f) {
            a a0 = (a)b.b.d(((int)(f * 100.0f)));
            if(a0 != null) {
                return a0;
            }
            int v1 = t.a.a(b.b.Z, ((int)(f * 100.0f)), b.b.X);
            if(v1 >= 0) {
                return (a)b.b.Y[v1];
            }
            int v2 = -(v1 + 1) - 1;
            if(-(v1 + 1) >= b.b.Z) {
                a1 = new c(new float[]{1.0f}, new float[]{f});
                b.b(f, ((c)a1));
                return a1;
            }
            float[] arr_f = b.a;
            if(v2 < 0) {
                a2 = new c(arr_f, arr_f);
                f1 = 1.0f;
            }
            else {
                f1 = ((float)b.b.X[v2]) / 100.0f;
                a2 = (a)b.b.Y[v2];
            }
            float f2 = ((float)b.b.X[-(v1 + 1)]) / 100.0f;
            float f3 = Math.max(0.0f, Math.min(1.0f, (Float.compare(f1, f2) == 0 ? 0.0f : (f - f1) / (f2 - f1))));
            a a3 = (a)b.b.Y[-(v1 + 1)];
            float[] arr_f1 = new float[9];
            for(int v = 0; v < 9; ++v) {
                float f4 = arr_f[v];
                float f5 = a2.b(f4);
                arr_f1[v] = (a3.b(f4) - f5) * (f3 * 1.0f + 0.0f) + f5;
            }
            a1 = new c(arr_f, arr_f1);
            b.b(f, ((c)a1));
            return a1;
        }
        return null;
    }

    public static void b(float f, c c0) {
        synchronized(b.c) {
            K k0 = b.b.c();
            k0.e(((int)(f * 100.0f)), c0);
            b.b = k0;
        }
    }
}

