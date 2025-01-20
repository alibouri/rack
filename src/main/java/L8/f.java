package L8;

import K8.a;

public abstract class f {
    public static final float[][] a;

    static {
        f.a = new float[0xAE3][8];
        for(int v = 0; v < 0xAE3; ++v) {
            int v1 = a.b[v];
            int v2 = v1 & 1;
            int v3 = 0;
            while(v3 < 8) {
                float f = 0.0f;
                while((v1 & 1) == v2) {
                    ++f;
                    v1 >>= 1;
                }
                f.a[v][7 - v3] = f / 17.0f;
                ++v3;
                v2 = v1 & 1;
            }
        }
    }
}

