package v;

import I2.J;
import Nb.j;
import g.a;
import m5.b;
import m7.o;
import s.r;
import s.s;

public final class v0 implements r0 {
    public final r X;
    public final s Y;
    public final int Z;
    public final int b0;
    public final o c0;
    public int[] d0;
    public float[] e0;
    public q f0;
    public q g0;
    public q h0;
    public q i0;
    public float[] j0;
    public float[] k0;
    public a l0;

    public v0(r r0, s s0, int v, int v1, o o0) {
        this.X = r0;
        this.Y = s0;
        this.Z = v;
        this.b0 = v1;
        this.c0 = o0;
    }

    public final int a(int v) {
        int v4;
        r r0 = this.X;
        int v1 = r0.b;
        if(v1 < 0) {
            throw new IllegalArgumentException("fromIndex(0) > toIndex(" + v1 + ')');
        }
        int v2 = v1 - 1;
        int v3 = 0;
        while(true) {
            if(v3 > v2) {
                v4 = -(v3 + 1);
                break;
            }
            v4 = v3 + v2 >>> 1;
            int v5 = r0.c(v4);
            if(v5 < v) {
                v3 = v4 + 1;
            }
            else {
                if(v5 <= v) {
                    break;
                }
                v2 = v4 - 1;
            }
        }
        return v4 >= -1 ? v4 : -(v4 + 2);
    }

    @Override  // v.q0
    public final boolean b() {
        return false;
    }

    public final float c(int v, int v1, boolean z) {
        y y0;
        r r0 = this.X;
        if(v >= r0.b - 1) {
            return ((float)v1) / 1000.0f;
        }
        int v2 = r0.c(v);
        int v3 = r0.c(v + 1);
        if(v1 == v2) {
            return ((float)v2) / 1000.0f;
        }
        u0 u00 = (u0)this.Y.f(v2);
        if(u00 == null) {
            y0 = this.c0;
        }
        else {
            y0 = u00.b;
            if(y0 == null) {
                y0 = this.c0;
            }
        }
        float f = (float)(v3 - v2);
        float f1 = y0.c(((float)(v1 - v2)) / f);
        return z ? f1 : (f * f1 + ((float)v2)) / 1000.0f;
    }

    public final void d(q q0, q q1, q q2) {
        float[] arr_f1;
        float[] arr_f2;
        boolean z = this.l0 != null;
        s s0 = this.Y;
        r r0 = this.X;
        if(this.f0 == null) {
            this.f0 = q0.c();
            this.g0 = q2.c();
            int v = r0.b;
            float[] arr_f = new float[v];
            for(int v1 = 0; v1 < v; ++v1) {
                arr_f[v1] = ((float)r0.c(v1)) / 1000.0f;
            }
            this.e0 = arr_f;
            int v2 = r0.b;
            int[] arr_v = new int[v2];
            for(int v3 = 0; v3 < v2; ++v3) {
                u0 u00 = (u0)s0.f(r0.c(v3));
                int v4 = u00 == null ? 0 : u00.c;
                if(v4 != 0) {
                    z = true;
                }
                arr_v[v3] = v4;
            }
            this.d0 = arr_v;
        }
        if(!z) {
            return;
        }
        if(this.l0 != null) {
            q q3 = this.h0;
            if(q3 == null) {
                j.p("lastInitialValue");
                throw null;
            }
            else if(q3.equals(q0)) {
                q q4 = this.i0;
                if(q4 != null) {
                    if(q4.equals(q1)) {
                        return;
                    }
                    goto label_40;
                }
                j.p("lastTargetValue");
                throw null;
            }
        }
    label_40:
        this.h0 = q0;
        this.i0 = q1;
        int v5 = q0.b();
        int v6 = q0.b() + v5 % 2;
        this.j0 = new float[v6];
        this.k0 = new float[v6];
        int v7 = r0.b;
        float[][] arr2_f = new float[v7][];
        int v8 = 0;
        while(v8 < v7) {
            int v9 = r0.c(v8);
            if(v9 == 0) {
                if(s0.b(0)) {
                    arr_f2 = new float[v6];
                    Object object0 = s0.f(0);
                    j.c(object0);
                    u0 u01 = (u0)object0;
                    for(int v11 = 0; v11 < v6; ++v11) {
                        arr_f2[v11] = u01.a.a(v11);
                    }
                    goto label_98;
                }
                else {
                    arr_f1 = new float[v6];
                    for(int v10 = 0; v10 < v6; ++v10) {
                        arr_f1[v10] = q0.a(v10);
                    }
                    goto label_99;
                }
                goto label_70;
            }
            else {
            label_70:
                if(v9 == this.Z) {
                    if(s0.b(v9)) {
                        arr_f2 = new float[v6];
                        Object object1 = s0.f(v9);
                        j.c(object1);
                        u0 u02 = (u0)object1;
                        for(int v13 = 0; v13 < v6; ++v13) {
                            arr_f2[v13] = u02.a.a(v13);
                        }
                        goto label_98;
                    }
                    else {
                        arr_f1 = new float[v6];
                        for(int v12 = 0; v12 < v6; ++v12) {
                            arr_f1[v12] = q1.a(v12);
                        }
                        goto label_99;
                    }
                    goto label_89;
                }
                else {
                label_89:
                    arr_f2 = new float[v6];
                    Object object2 = s0.f(v9);
                    j.c(object2);
                    u0 u03 = (u0)object2;
                    for(int v14 = 0; v14 < v6; ++v14) {
                        arr_f2[v14] = u03.a.a(v14);
                    }
                }
            }
        label_98:
            arr_f1 = arr_f2;
        label_99:
            arr2_f[v8] = arr_f1;
            ++v8;
        }
        int[] arr_v1 = this.d0;
        if(arr_v1 != null) {
            float[] arr_f3 = this.e0;
            if(arr_f3 != null) {
                this.l0 = new a(arr_v1, arr_f3, arr2_f);
                return;
            }
            j.p("times");
            throw null;
        }
        j.p("modes");
        throw null;
    }

    @Override  // v.q0
    public final q i(long v, q q0, q q1, q q2) {
        int v6;
        q q3 = q0;
        q q4 = q1;
        int v1 = this.Z;
        int v2 = (int)J.t(v / 1000000L - ((long)this.b0), 0L, v1);
        s s0 = this.Y;
        if(s0.b(v2)) {
            Object object0 = s0.f(v2);
            j.c(object0);
            return ((u0)object0).a;
        }
        if(v2 >= v1) {
            return q4;
        }
        if(v2 <= 0) {
            return q3;
        }
        this.d(q3, q4, q2);
        if(this.l0 != null) {
            float f = this.c(this.a(v2), v2, false);
            a a0 = this.l0;
            if(a0 != null) {
                float[] arr_f = this.j0;
                if(arr_f != null) {
                    v.s[][] arr2_s = (v.s[][])a0.Y;
                    float f1 = arr2_s[0][0].a;
                    if(f < f1 || f > arr2_s[arr2_s.length - 1][0].b) {
                        if(f > arr2_s[arr2_s.length - 1][0].b) {
                            f1 = arr2_s[arr2_s.length - 1][0].b;
                            v6 = arr2_s.length - 1;
                        }
                        else {
                            v6 = 0;
                        }
                        float f2 = f - f1;
                        int v7 = 0;
                        for(int v8 = 0; v7 < arr_f.length; ++v8) {
                            v.s s3 = arr2_s[v6][v8];
                            if(s3.r) {
                                arr_f[v7] = s3.n * f2 + b.o(s3.e, s3.c, (f1 - s3.a) * s3.k, s3.c);
                                arr_f[v7 + 1] = s3.o * f2 + b.o(s3.f, s3.d, (f1 - s3.a) * s3.k, s3.d);
                            }
                            else {
                                s3.c(f1);
                                v.s s4 = arr2_s[v6][v8];
                                arr_f[v7] = s4.a() * f2 + (s4.l * s4.h + s4.n);
                                v.s s5 = arr2_s[v6][v8];
                                arr_f[v7 + 1] = s5.b() * f2 + (s5.m * s5.i + s5.o);
                            }
                            v7 += 2;
                        }
                    }
                    else {
                        boolean z = false;
                        for(int v3 = 0; v3 < arr2_s.length; ++v3) {
                            int v4 = 0;
                            for(int v5 = 0; v4 < arr_f.length; ++v5) {
                                v.s s1 = arr2_s[v3][v5];
                                if(f <= s1.b) {
                                    if(s1.r) {
                                        arr_f[v4] = b.o(s1.e, s1.c, (f - s1.a) * s1.k, s1.c);
                                        arr_f[v4 + 1] = b.o(s1.f, s1.d, (f - s1.a) * s1.k, s1.d);
                                    }
                                    else {
                                        s1.c(f);
                                        v.s s2 = arr2_s[v3][v5];
                                        arr_f[v4] = s2.l * s2.h + s2.n;
                                        arr_f[v4 + 1] = s2.m * s2.i + s2.o;
                                    }
                                    z = true;
                                }
                                v4 += 2;
                            }
                            if(z) {
                                break;
                            }
                        }
                    }
                    float[] arr_f1 = this.j0;
                    if(arr_f1 != null) {
                        int v9 = 0;
                        while(v9 < arr_f1.length) {
                            q q5 = this.f0;
                            if(q5 != null) {
                                float[] arr_f2 = this.j0;
                                if(arr_f2 != null) {
                                    q5.e(v9, arr_f2[v9]);
                                    ++v9;
                                    continue;
                                }
                                j.p("posArray");
                                throw null;
                            }
                            j.p("valueVector");
                            throw null;
                        }
                        q q6 = this.f0;
                        if(q6 != null) {
                            return q6;
                        }
                        j.p("valueVector");
                        throw null;
                    }
                    j.p("posArray");
                    throw null;
                }
                j.p("posArray");
                throw null;
            }
            j.p("arcSpline");
            throw null;
        }
        int v10 = this.a(v2);
        float f3 = this.c(v10, v2, true);
        r r0 = this.X;
        int v11 = r0.c(v10);
        if(s0.b(v11)) {
            Object object1 = s0.f(v11);
            j.c(object1);
            q3 = ((u0)object1).a;
        }
        int v12 = r0.c(v10 + 1);
        if(s0.b(v12)) {
            Object object2 = s0.f(v12);
            j.c(object2);
            q4 = ((u0)object2).a;
        }
        q q7 = this.f0;
        if(q7 != null) {
            int v13 = q7.b();
            int v14 = 0;
            while(v14 < v13) {
                q q8 = this.f0;
                if(q8 != null) {
                    float f4 = q3.a(v14);
                    q8.e(v14, q4.a(v14) * f3 + (1.0f - f3) * f4);
                    ++v14;
                    continue;
                }
                j.p("valueVector");
                throw null;
            }
            q q9 = this.f0;
            if(q9 != null) {
                return q9;
            }
            j.p("valueVector");
            throw null;
        }
        j.p("valueVector");
        throw null;
    }

    @Override  // v.r0
    public final int j() {
        return this.b0;
    }

    @Override  // v.q0
    public final long n(q q0, q q1, q q2) {
        return ((long)(this.o() + this.j())) * 1000000L;
    }

    @Override  // v.r0
    public final int o() {
        return this.Z;
    }

    @Override  // v.q0
    public final q q(q q0, q q1, q q2) {
        return this.s(this.n(q0, q1, q2), q0, q1, q2);
    }

    @Override  // v.q0
    public final q s(long v, q q0, q q1, q q2) {
        long v1 = J.t(v / 1000000L - ((long)this.b0), 0L, this.Z);
        if(v1 < 0L) {
            return q2;
        }
        this.d(q0, q1, q2);
        int v2 = 0;
        if(this.l0 != null) {
            float f = this.c(this.a(((int)v1)), ((int)v1), false);
            a a0 = this.l0;
            if(a0 != null) {
                float[] arr_f = this.k0;
                if(arr_f != null) {
                    v.s[][] arr2_s = (v.s[][])a0.Y;
                    float f1 = arr2_s[0][0].a;
                    if(Float.compare(f, f1) < 0) {
                        f = f1;
                    }
                    else if(f > arr2_s[arr2_s.length - 1][0].b) {
                        f = arr2_s[arr2_s.length - 1][0].b;
                    }
                    boolean z = false;
                    for(int v3 = 0; v3 < arr2_s.length; ++v3) {
                        int v4 = 0;
                        for(int v5 = 0; v4 < arr_f.length; ++v5) {
                            v.s s0 = arr2_s[v3][v5];
                            if(f <= s0.b) {
                                if(s0.r) {
                                    arr_f[v4] = s0.n;
                                    arr_f[v4 + 1] = s0.o;
                                }
                                else {
                                    s0.c(f);
                                    arr_f[v4] = arr2_s[v3][v5].a();
                                    arr_f[v4 + 1] = arr2_s[v3][v5].b();
                                }
                                z = true;
                            }
                            v4 += 2;
                        }
                        if(z) {
                            break;
                        }
                    }
                    float[] arr_f1 = this.k0;
                    if(arr_f1 != null) {
                        while(v2 < arr_f1.length) {
                            q q3 = this.g0;
                            if(q3 != null) {
                                float[] arr_f2 = this.k0;
                                if(arr_f2 != null) {
                                    q3.e(v2, arr_f2[v2]);
                                    ++v2;
                                    continue;
                                }
                                j.p("slopeArray");
                                throw null;
                            }
                            j.p("velocityVector");
                            throw null;
                        }
                        q q4 = this.g0;
                        if(q4 != null) {
                            return q4;
                        }
                        j.p("velocityVector");
                        throw null;
                    }
                    j.p("slopeArray");
                    throw null;
                }
                j.p("slopeArray");
                throw null;
            }
            j.p("arcSpline");
            throw null;
        }
        q q5 = this.i((v1 - 1L) * 1000000L, q0, q1, q2);
        q q6 = this.i(v1 * 1000000L, q0, q1, q2);
        int v6 = q5.b();
        while(v2 < v6) {
            q q7 = this.g0;
            if(q7 != null) {
                q7.e(v2, (q5.a(v2) - q6.a(v2)) * 1000.0f);
                ++v2;
                continue;
            }
            j.p("velocityVector");
            throw null;
        }
        q q8 = this.g0;
        if(q8 != null) {
            return q8;
        }
        j.p("velocityVector");
        throw null;
    }
}

