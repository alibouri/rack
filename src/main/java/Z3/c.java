package z3;

import io.sentry.config.a;
import java.util.Arrays;

public final class c {
    public final float[] a;
    public final int[] b;

    public c(float[] arr_f, int[] arr_v) {
        this.a = arr_f;
        this.b = arr_v;
    }

    public final void a(c c0) {
        for(int v = 0; true; ++v) {
            int[] arr_v = c0.b;
            if(v >= arr_v.length) {
                break;
            }
            this.a[v] = c0.a[v];
            this.b[v] = arr_v[v];
        }
    }

    public final c b(float[] arr_f) {
        int v2;
        int[] arr_v = new int[arr_f.length];
        for(int v = 0; v < arr_f.length; ++v) {
            float f = arr_f[v];
            float[] arr_f1 = this.a;
            int v1 = Arrays.binarySearch(arr_f1, f);
            int[] arr_v1 = this.b;
            if(v1 >= 0) {
                v2 = arr_v1[v1];
            }
            else if(-(v1 + 1) == 0) {
                v2 = arr_v1[0];
            }
            else if(-(v1 + 1) == arr_v1.length - 1) {
                v2 = arr_v1[arr_v1.length - 1];
            }
            else {
                int v3 = -(v1 + 1) - 1;
                float f1 = arr_f1[v3];
                v2 = a.G(arr_v1[v3], (f - f1) / (arr_f1[-(v1 + 1)] - f1), arr_v1[-(v1 + 1)]);
            }
            arr_v[v] = v2;
        }
        return new c(arr_f, arr_v);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return c.class == class0 && (Arrays.equals(this.a, ((c)object0).a) && Arrays.equals(this.b, ((c)object0).b));
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.a);
        return Arrays.hashCode(this.b) + v * 0x1F;
    }
}

