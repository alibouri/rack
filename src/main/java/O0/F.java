package o0;

import java.util.Arrays;
import n0.M;
import n0.v;

public final class f extends g {
    public final q e;
    public final q f;
    public final float[] g;

    public f(q q0, q q1, int v) {
        super(q1, q0, q1, null);
        float[] arr_f2;
        this.e = q0;
        this.f = q1;
        s s0 = q0.d;
        float[] arr_f = q0.i;
        float[] arr_f1 = q1.j;
        if(!j.d(s0, q1.d)) {
            float[] arr_f3 = s0.a();
            s s1 = q1.d;
            float[] arr_f4 = s1.a();
            s s2 = j.b;
            float[] arr_f5 = j.e;
            float[] arr_f6 = a.b.a;
            if(!j.d(s0, s2)) {
                float[] arr_f7 = Arrays.copyOf(arr_f5, 3);
                Nb.j.e(arr_f7, "copyOf(this, size)");
                arr_f = j.h(j.c(arr_f6, arr_f3, arr_f7), arr_f);
            }
            if(!j.d(s1, s2)) {
                float[] arr_f8 = Arrays.copyOf(arr_f5, 3);
                Nb.j.e(arr_f8, "copyOf(this, size)");
                arr_f1 = j.g(j.h(j.c(arr_f6, arr_f4, arr_f8), q1.i));
            }
            if(v == 3) {
                arr_f = j.i(new float[]{arr_f3[0] / arr_f4[0], arr_f3[1] / arr_f4[1], arr_f3[2] / arr_f4[2]}, arr_f);
            }
        }
        arr_f2 = j.h(arr_f1, arr_f);
        this.g = arr_f2;
    }

    @Override  // o0.g
    public final long a(long v) {
        float f = v.g(v);
        float f1 = v.e(v);
        float f2 = (float)this.e.p.e(((double)v.h(v)));
        float f3 = (float)this.e.p.e(((double)f));
        float f4 = (float)this.e.p.e(((double)f1));
        float f5 = this.g[6] * f4 + (this.g[3] * f3 + this.g[0] * f2);
        float f6 = this.g[7] * f4 + (this.g[4] * f3 + this.g[1] * f2);
        float f7 = this.g[8] * f4 + (this.g[5] * f3 + this.g[2] * f2);
        return M.b(((float)this.f.m.e(((double)f5))), ((float)this.f.m.e(((double)f6))), ((float)this.f.m.e(((double)f7))), v.d(v), this.f);
    }
}

