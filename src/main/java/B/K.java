package B;

public abstract class k {
    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    public static final f e;
    public static final f f;
    public static final f g;
    public static final f h;

    static {
        k.a = new d(4);
        k.b = new d(3);
        k.c = new d(5);
        k.d = new d(2);
        k.e = new f(0);
        k.f = new f(3);
        k.g = new f(2);
        k.h = new f(1);
    }

    public static void a(int v, int[] arr_v, int[] arr_v1, boolean z) {
        int v1 = 0;
        int v3 = 0;
        for(int v2 = 0; v2 < arr_v.length; ++v2) {
            v3 += arr_v[v2];
        }
        float f = ((float)(v - v3)) / 2.0f;
        if(!z) {
            for(int v4 = 0; v1 < arr_v.length; ++v4) {
                int v5 = arr_v[v1];
                arr_v1[v4] = Math.round(f);
                f += (float)v5;
                ++v1;
            }
            return;
        }
        for(int v6 = arr_v.length - 1; -1 < v6; --v6) {
            int v7 = arr_v[v6];
            arr_v1[v6] = Math.round(f);
            f += (float)v7;
        }
    }

    public static void b(int[] arr_v, int[] arr_v1, boolean z) {
        int v = 0;
        if(!z) {
            int v2 = 0;
            for(int v1 = 0; v < arr_v.length; ++v1) {
                int v3 = arr_v[v];
                arr_v1[v1] = v2;
                v2 += v3;
                ++v;
            }
            return;
        }
        for(int v4 = arr_v.length - 1; -1 < v4; --v4) {
            int v5 = arr_v[v4];
            arr_v1[v4] = v;
            v += v5;
        }
    }

    public static void c(int v, int[] arr_v, int[] arr_v1, boolean z) {
        int v1 = 0;
        int v3 = 0;
        for(int v2 = 0; v2 < arr_v.length; ++v2) {
            v3 += arr_v[v2];
        }
        int v4 = v - v3;
        if(!z) {
            for(int v5 = 0; v1 < arr_v.length; ++v5) {
                int v6 = arr_v[v1];
                arr_v1[v5] = v4;
                v4 += v6;
                ++v1;
            }
            return;
        }
        for(int v7 = arr_v.length - 1; -1 < v7; --v7) {
            int v8 = arr_v[v7];
            arr_v1[v7] = v4;
            v4 += v8;
        }
    }

    public static void d(int v, int[] arr_v, int[] arr_v1, boolean z) {
        int v1 = 0;
        int v3 = 0;
        for(int v2 = 0; v2 < arr_v.length; ++v2) {
            v3 += arr_v[v2];
        }
        float f = arr_v.length == 0 ? 0.0f : ((float)(v - v3)) / ((float)arr_v.length);
        float f1 = f / 2.0f;
        if(!z) {
            for(int v4 = 0; v1 < arr_v.length; ++v4) {
                int v5 = arr_v[v1];
                arr_v1[v4] = Math.round(f1);
                f1 += ((float)v5) + f;
                ++v1;
            }
            return;
        }
        for(int v6 = arr_v.length - 1; -1 < v6; --v6) {
            int v7 = arr_v[v6];
            arr_v1[v6] = Math.round(f1);
            f1 += ((float)v7) + f;
        }
    }

    public static void e(int v, int[] arr_v, int[] arr_v1, boolean z) {
        if(arr_v.length == 0) {
            return;
        }
        int v1 = 0;
        int v3 = 0;
        for(int v2 = 0; v2 < arr_v.length; ++v2) {
            v3 += arr_v[v2];
        }
        float f = ((float)(v - v3)) / ((float)Math.max(arr_v.length - 1, 1));
        float f1 = !z || arr_v.length != 1 ? 0.0f : f;
        if(!z) {
            for(int v4 = 0; v1 < arr_v.length; ++v4) {
                int v5 = arr_v[v1];
                arr_v1[v4] = Math.round(f1);
                f1 += ((float)v5) + f;
                ++v1;
            }
            return;
        }
        for(int v6 = arr_v.length - 1; -1 < v6; --v6) {
            int v7 = arr_v[v6];
            arr_v1[v6] = Math.round(f1);
            f1 += ((float)v7) + f;
        }
    }

    public static void f(int v, int[] arr_v, int[] arr_v1, boolean z) {
        int v1 = 0;
        int v3 = 0;
        for(int v2 = 0; v2 < arr_v.length; ++v2) {
            v3 += arr_v[v2];
        }
        float f = ((float)(v - v3)) / ((float)(arr_v.length + 1));
        if(!z) {
            float f1 = f;
            for(int v4 = 0; v1 < arr_v.length; ++v4) {
                int v5 = arr_v[v1];
                arr_v1[v4] = Math.round(f1);
                f1 += ((float)v5) + f;
                ++v1;
            }
            return;
        }
        int v6 = arr_v.length - 1;
        float f2 = f;
        while(-1 < v6) {
            int v7 = arr_v[v6];
            arr_v1[v6] = Math.round(f2);
            f2 += ((float)v7) + f;
            --v6;
        }
    }
}

