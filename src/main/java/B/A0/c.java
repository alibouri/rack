package A0;

import Ab.e;
import I2.J;
import M6.b;
import v.h;

public final class c {
    public final boolean a;
    public final int b;
    public final int c;
    public final a[] d;
    public int e;
    public final float[] f;
    public final float[] g;
    public final float[] h;

    public c() {
        this.a = false;
        this.b = 1;
        this.c = 3;
        this.d = new a[20];
        this.f = new float[20];
        this.g = new float[20];
        this.h = new float[3];
    }

    public final void a(float f, long v) {
        int v1 = (this.e + 1) % 20;
        this.e = v1;
        a[] arr_a = this.d;
        a a0 = arr_a[v1];
        if(a0 == null) {
            a a1 = new a();  // initializer: Ljava/lang/Object;-><init>()V
            a1.a = v;
            a1.b = f;
            arr_a[v1] = a1;
            return;
        }
        a0.a = v;
        a0.b = f;
    }

    public final float b(float f) {
        float f4;
        boolean z1;
        float[] arr_f1;
        float[] arr_f;
        float f1 = 0.0f;
        if(f > 0.0f) {
            int v = this.e;
            a[] arr_a = this.d;
            a a0 = arr_a[v];
            if(a0 != null) {
                int v1 = 0;
                a a1 = a0;
                do {
                    a a2 = arr_a[v];
                    boolean z = this.a;
                    int v2 = this.b;
                    arr_f = this.f;
                    arr_f1 = this.g;
                    if(a2 == null) {
                        z1 = z;
                        break;
                    }
                    float f2 = (float)(a0.a - a2.a);
                    z1 = z;
                    float f3 = (float)Math.abs(a2.a - a1.a);
                    a1 = v2 == 1 || z1 ? a2 : a0;
                    if(f2 > 100.0f || f3 > 40.0f) {
                        break;
                    }
                    arr_f[v1] = a2.b;
                    arr_f1[v1] = -f2;
                    v = (v == 0 ? 20 : v) - 1;
                    ++v1;
                }
                while(v1 < 20);
                if(v1 >= this.c) {
                    switch(h.d(v2)) {
                        case 0: {
                            try {
                                b.P(arr_f1, arr_f, v1, this.h);
                                f4 = 0.0f;
                                f4 = this.h[1];
                            }
                            catch(IllegalArgumentException unused_ex) {
                            }
                            break;
                        }
                        case 1: {
                            float f5 = arr_f1[v1 - 1];
                            int v3 = v1 - 1;
                            float f6 = 0.0f;
                            while(v3 > 0) {
                                float f7 = arr_f1[v3 - 1];
                                if(f5 != f7) {
                                    float f8 = (z1 ? -arr_f[v3 - 1] : arr_f[v3] - arr_f[v3 - 1]) / (f5 - f7);
                                    f6 += Math.abs(f8) * (f8 - Math.signum(f6) * ((float)Math.sqrt(Math.abs(f6) * 2.0f)));
                                    if(v3 == v1 - 1) {
                                        f6 *= 0.5f;
                                    }
                                }
                                --v3;
                                f5 = f7;
                            }
                            f4 = Math.signum(f6) * ((float)Math.sqrt(Math.abs(f6) * 2.0f));
                            break;
                        }
                        default: {
                            throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                        }
                    }
                    f1 = f4 * 1000.0f;
                }
            }
            if(f1 == 0.0f || Float.isNaN(f1)) {
                return 0.0f;
            }
            return f1 > 0.0f ? J.o(f1, f) : J.m(f1, -f);
        }
        b.T(("maximumVelocity should be a positive value. You specified=" + f));
        throw null;
    }
}

