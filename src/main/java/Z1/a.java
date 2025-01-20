package z1;

import android.graphics.Color;

public abstract class a {
    public static final ThreadLocal a;

    static {
        a.a = new ThreadLocal();
    }

    public static int a(double f, double f1, double f2) {
        double f3 = (-0.4986 * f2 + (-1.5372 * f1 + 3.2406 * f)) / 100.0;
        double f4 = (0.0415 * f2 + (1.8758 * f1 + -0.9689 * f)) / 100.0;
        double f5 = (1.057 * f2 + (-0.204 * f1 + 0.0557 * f)) / 100.0;
        int v = (int)Math.round((Double.compare(f3, 0.003131) <= 0 ? f3 * 12.92 : Math.pow(f3, 0.416667) * 1.055 - 0.055) * 255.0);
        int v1 = 0;
        int v2 = v >= 0 ? Math.min(v, 0xFF) : 0;
        int v3 = (int)Math.round((f4 > 0.003131 ? Math.pow(f4, 0.416667) * 1.055 - 0.055 : f4 * 12.92) * 255.0);
        int v4 = v3 >= 0 ? Math.min(v3, 0xFF) : 0;
        int v5 = (int)Math.round((f5 > 0.003131 ? Math.pow(f5, 0.416667) * 1.055 - 0.055 : f5 * 12.92) * 255.0);
        if(v5 >= 0) {
            v1 = Math.min(v5, 0xFF);
        }
        return Color.rgb(v2, v4, v1);
    }

    public static double b(int v) {
        ThreadLocal threadLocal0 = a.a;
        double[] arr_f = (double[])threadLocal0.get();
        if(arr_f == null) {
            arr_f = new double[3];
            threadLocal0.set(arr_f);
        }
        int v1 = Color.red(v);
        int v2 = Color.green(v);
        int v3 = Color.blue(v);
        if(arr_f.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double f = Double.compare(((double)v1) / 255.0, 0.04045) >= 0 ? Math.pow((((double)v1) / 255.0 + 0.055) / 1.055, 2.4) : ((double)v1) / 255.0 / 12.92;
        double f1 = ((double)v2) / 255.0 < 0.04045 ? ((double)v2) / 255.0 / 12.92 : Math.pow((((double)v2) / 255.0 + 0.055) / 1.055, 2.4);
        double f2 = ((double)v3) / 255.0 < 0.04045 ? ((double)v3) / 255.0 / 12.92 : Math.pow((((double)v3) / 255.0 + 0.055) / 1.055, 2.4);
        arr_f[0] = (0.1805 * f2 + (0.3576 * f1 + 0.4124 * f)) * 100.0;
        double f3 = (0.0722 * f2 + (0.7152 * f1 + 0.2126 * f)) * 100.0;
        arr_f[1] = f3;
        arr_f[2] = (f2 * 0.9505 + (f1 * 0.1192 + f * 0.0193)) * 100.0;
        return f3 / 100.0;
    }

    public static int c(int v, int v1) {
        int v2 = Color.alpha(v1);
        int v3 = Color.alpha(v);
        int v4 = 0xFF - (0xFF - v3) * (0xFF - v2) / 0xFF;
        return Color.argb(v4, a.d(Color.red(v), v3, Color.red(v1), v2, v4), a.d(Color.green(v), v3, Color.green(v1), v2, v4), a.d(Color.blue(v), v3, Color.blue(v1), v2, v4));
    }

    public static int d(int v, int v1, int v2, int v3, int v4) {
        return v4 == 0 ? 0 : ((0xFF - v1) * (v2 * v3) + v * 0xFF * v1) / (v4 * 0xFF);
    }

    public static int e(int v, int v1) [...] // Inlined contents
}

