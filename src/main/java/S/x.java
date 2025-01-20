package s;

import Bb.n;
import Nb.j;
import java.util.NoSuchElementException;
import t.a;

public final class x {
    public long[] a;
    public Object[] b;
    public float[] c;
    public int d;
    public int e;
    public int f;

    public x() {
        this.a = H.a;
        this.b = a.c;
        this.c = g.a;
        this.d(6);
    }

    public final void a() {
        this.e = 0;
        long[] arr_v = this.a;
        if(arr_v != H.a) {
            n.p0(arr_v);
            int v = this.d >> 3;
            this.a[v] |= 0xFFL << ((this.d & 7) << 3);
        }
        n.o0(this.b, null, 0, this.d);
        this.f = H.c(this.d) - this.e;
    }

    public final int b(int v) {
        long v6;
        int v1 = this.d;
        int v2 = v & v1;
        int v3 = 0;
        while(true) {
            int v4 = (v2 & 7) << 3;
            long v5 = this.a[(v2 >> 3) + 1] << 0x40 - v4 & -((long)v4) >> 0x3F | this.a[v2 >> 3] >>> v4;
            v6 = v5 & ~v5 << 7 & 0x8080808080808080L;
            if(v6 != 0L) {
                break;
            }
            v3 += 8;
            v2 = v2 + v3 & v1;
        }
        return v2 + (Long.numberOfTrailingZeros(v6) >> 3) & v1;
    }

    public final int c(Object object0) {
        int v = 0;
        int v1 = object0 == null ? 0 : object0.hashCode();
        int v2 = v1 * 0xCC9E2D51 ^ v1 * 0xCC9E2D51 << 16;
        int v3 = this.d;
        for(int v4 = v2 >>> 7; true; v4 = v5 + v) {
            int v5 = v4 & v3;
            int v6 = (v5 & 7) << 3;
            long v7 = this.a[(v5 >> 3) + 1] << 0x40 - v6 & -((long)v6) >> 0x3F | this.a[v5 >> 3] >>> v6;
            long v8 = ((long)(v2 & 0x7F)) * 0x101010101010101L ^ v7;
            for(long v9 = ~v8 & v8 - 0x101010101010101L & 0x8080808080808080L; v9 != 0L; v9 &= v9 - 1L) {
                int v10 = (Long.numberOfTrailingZeros(v9) >> 3) + v5 & v3;
                if(j.a(this.b[v10], object0)) {
                    return v10;
                }
            }
            if((v7 & ~v7 << 6 & 0x8080808080808080L) != 0L) {
                return -1;
            }
            v += 8;
        }
    }

    public final void d(int v) {
        long[] arr_v;
        int v1 = v <= 0 ? 0 : Math.max(7, H.e(v));
        this.d = v1;
        if(v1 == 0) {
            arr_v = H.a;
        }
        else {
            arr_v = new long[(v1 + 15 & -8) >> 3];
            n.p0(arr_v);
        }
        this.a = arr_v;
        arr_v[v1 >> 3] |= 0xFFL << ((v1 & 7) << 3);
        this.f = H.c(this.d) - this.e;
        this.b = new Object[v1];
        this.c = new float[v1];
    }

    public final void e(Object object0, float f) {
        long v15;
        int v30;
        float[] arr_f1;
        int v29;
        long v25;
        Object[] arr_object3;
        long[] arr_v3;
        int v13;
        x x1;
        x x0 = this;
        Object object1 = object0;
        int v = object1 == null ? 0 : object0.hashCode();
        int v1 = v * 0xCC9E2D51 ^ v * 0xCC9E2D51 << 16;
        int v2 = v1 >>> 7;
        int v3 = v1 & 0x7F;
        int v4 = x0.d;
        int v5 = v2 & v4;
        int v6 = 0;
        while(true) {
            int v7 = (v5 & 7) << 3;
            long v8 = x0.a[(v5 >> 3) + 1] << 0x40 - v7 & -((long)v7) >> 0x3F | x0.a[v5 >> 3] >>> v7;
            long v9 = (long)v3;
            long v10 = v8 ^ v9 * 0x101010101010101L;
            long v11 = ~v10 & v10 - 0x101010101010101L & 0x8080808080808080L;
            while(v11 != 0L) {
                int v12 = v5 + (Long.numberOfTrailingZeros(v11) >> 3) & v4;
                if(j.a(x0.b[v12], object1)) {
                    x1 = x0;
                    v13 = v12;
                    goto label_143;
                }
                v11 &= v11 - 1L;
            }
            if(Long.compare(~v8 << 6 & v8 & 0x8080808080808080L, 0L) == 0) {
                goto label_148;
            }
            else {
                int v14 = x0.b(v2);
                if(x0.f == 0 && (x0.a[v14 >> 3] >> ((v14 & 7) << 3) & 0xFFL) != 0xFEL) {
                    if(x0.d <= 8 || Long.compare(((long)x0.e) * 0x20L ^ 0x8000000000000000L, ((long)x0.d) * 25L ^ 0x8000000000000000L) > 0) {
                        x1 = x0;
                        v30 = v2;
                        v15 = v9;
                        long[] arr_v1 = x1.a;
                        Object[] arr_object1 = x1.b;
                        float[] arr_f2 = x1.c;
                        int v31 = x1.d;
                        x1.d(H.d(x1.d));
                        long[] arr_v2 = x1.a;
                        Object[] arr_object2 = x1.b;
                        float[] arr_f3 = x1.c;
                        int v32 = x1.d;
                        int v33 = 0;
                        while(v33 < v31) {
                            if((arr_v1[v33 >> 3] >> ((v33 & 7) << 3) & 0xFFL) < 0x80L) {
                                Object object3 = arr_object1[v33];
                                int v34 = object3 == null ? 0 : object3.hashCode();
                                int v35 = v34 * 0xCC9E2D51 ^ v34 * 0xCC9E2D51 << 16;
                                int v36 = x1.b(v35 >>> 7);
                                int v37 = (v36 & 7) << 3;
                                arr_v3 = arr_v1;
                                arr_object3 = arr_object1;
                                long v38 = arr_v2[v36 >> 3] & ~(0xFFL << v37) | ((long)(v35 & 0x7F)) << v37;
                                arr_v2[v36 >> 3] = v38;
                                arr_v2[(v36 - 7 & v32) + (v32 & 7) >> 3] = v38;
                                arr_object2[v36] = object3;
                                arr_f3[v36] = arr_f2[v33];
                            }
                            else {
                                arr_v3 = arr_v1;
                                arr_object3 = arr_object1;
                            }
                            ++v33;
                            arr_v1 = arr_v3;
                            arr_object1 = arr_object3;
                        }
                    }
                    else {
                        long[] arr_v = x0.a;
                        int v16 = x0.d;
                        Object[] arr_object = x0.b;
                        float[] arr_f = x0.c;
                        H.a(arr_v, v16);
                        int v17 = 0;
                        int v18 = -1;
                        while(v17 != v16) {
                            int v19 = (v17 & 7) << 3;
                            long v20 = arr_v[v17 >> 3] >> v19 & 0xFFL;
                            if(v20 == 0x80L) {
                                v18 = v17;
                                ++v17;
                            }
                            else if(v20 == 0xFEL) {
                                Object object2 = arr_object[v17];
                                int v21 = object2 == null ? 0 : object2.hashCode();
                                int v22 = v21 * 0xCC9E2D51 ^ v21 * 0xCC9E2D51 << 16;
                                int v23 = x0.b(v22 >>> 7);
                                int v24 = v22 >>> 7 & v16;
                                if((v23 - v24 & v16) / 8 == (v17 - v24 & v16) / 8) {
                                    v25 = v9;
                                    arr_v[v17 >> 3] = ((long)(v22 & 0x7F)) << v19 | arr_v[v17 >> 3] & ~(0xFFL << v19);
                                    arr_v[arr_v.length - 1] = arr_v[0] & 0xFFFFFFFFFFFFFFL | 0x8000000000000000L;
                                    ++v17;
                                }
                                else {
                                    v25 = v9;
                                    int v26 = v18;
                                    long v27 = arr_v[v23 >> 3];
                                    int v28 = (v23 & 7) << 3;
                                    if((v27 >> v28 & 0xFFL) == 0x80L) {
                                        v29 = v2;
                                        arr_f1 = arr_f;
                                        arr_v[v23 >> 3] = ((long)(v22 & 0x7F)) << v28 | ~(0xFFL << v28) & v27;
                                        arr_v[v17 >> 3] = arr_v[v17 >> 3] & ~(0xFFL << v19) | 0x80L << v19;
                                        arr_object[v23] = arr_object[v17];
                                        arr_object[v17] = null;
                                        arr_f1[v23] = arr_f1[v17];
                                        arr_f1[v17] = 0.0f;
                                        v26 = v17;
                                    }
                                    else {
                                        v29 = v2;
                                        arr_f1 = arr_f;
                                        arr_v[v23 >> 3] = ((long)(v22 & 0x7F)) << v28 | ~(0xFFL << v28) & v27;
                                        if(v26 == -1) {
                                            v26 = H.b(arr_v, v17 + 1, v16);
                                        }
                                        arr_object[v26] = arr_object[v23];
                                        arr_object[v23] = arr_object[v17];
                                        arr_object[v17] = arr_object[v26];
                                        arr_f1[v26] = arr_f1[v23];
                                        arr_f1[v23] = arr_f1[v17];
                                        arr_f1[v17] = arr_f1[v26];
                                        --v17;
                                    }
                                    arr_v[arr_v.length - 1] = arr_v[0] & 0xFFFFFFFFFFFFFFL | 0x8000000000000000L;
                                    ++v17;
                                    x0 = this;
                                    v18 = v26;
                                    v2 = v29;
                                    arr_f = arr_f1;
                                }
                                v9 = v25;
                            }
                            else {
                                ++v17;
                            }
                        }
                        x1 = x0;
                        v30 = v2;
                        v15 = v9;
                        x1.f = H.c(x1.d) - x1.e;
                    }
                    v14 = x1.b(v30);
                }
                else {
                    x1 = x0;
                    v15 = v9;
                }
                ++x1.e;
                int v39 = x1.f;
                long[] arr_v4 = x1.a;
                long v40 = arr_v4[v14 >> 3];
                int v41 = (v14 & 7) << 3;
                x1.f = v39 - ((v40 >> v41 & 0xFFL) == 0x80L ? 1 : 0);
                int v42 = x1.d;
                long v43 = v40 & ~(0xFFL << v41) | v15 << v41;
                arr_v4[v14 >> 3] = v43;
                arr_v4[(v14 - 7 & v42) + (v42 & 7) >> 3] = v43;
                v13 = ~v14;
            }
        label_143:
            if(v13 < 0) {
                v13 = ~v13;
            }
            x1.b[v13] = object0;
            x1.c[v13] = f;
            return;
        label_148:
            v6 += 8;
            v5 = v5 + v6 & v4;
            x0 = x0;
            v3 = v3;
            object1 = object0;
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof x)) {
            return false;
        }
        if(((x)object0).e != this.e) {
            return false;
        }
        Object[] arr_object = this.b;
        float[] arr_f = this.c;
        long[] arr_v = this.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            Object object1 = arr_object[v5];
                            float f = arr_f[v5];
                            int v6 = ((x)object0).c(object1);
                            if(v6 < 0) {
                                throw new NoSuchElementException("There is no key " + object1 + " in the map");
                            }
                            if(f != ((x)object0).c[v6]) {
                                return false;
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_30;
                    }
                    break;
                }
            label_30:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        return true;
    }

    @Override
    public final int hashCode() {
        Object[] arr_object = this.b;
        float[] arr_f = this.c;
        long[] arr_v = this.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v2 = 0;
            for(int v1 = 0; true; ++v1) {
                long v3 = arr_v[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v4 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v5 = 0; v5 < v4; ++v5) {
                        if((0xFFL & v3) < 0x80L) {
                            int v6 = (v1 << 3) + v5;
                            Object object0 = arr_object[v6];
                            v2 += Float.floatToIntBits(arr_f[v6]) ^ (object0 == null ? 0 : object0.hashCode());
                        }
                        v3 >>= 8;
                    }
                    if(v4 != 8) {
                        return v2;
                    }
                }
                if(v1 == v) {
                    break;
                }
            }
            return v2;
        }
        return 0;
    }

    @Override
    public final String toString() {
        if(this.e == 0) {
            return "{}";
        }
        StringBuilder stringBuilder0 = new StringBuilder("{");
        Object[] arr_object = this.b;
        float[] arr_f = this.c;
        long[] arr_v = this.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            int v2 = 0;
            while(true) {
                long v3 = arr_v[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v4 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v5 = 0; v5 < v4; ++v5) {
                        if((0xFFL & v3) < 0x80L) {
                            int v6 = (v1 << 3) + v5;
                            Object object0 = arr_object[v6];
                            float f = arr_f[v6];
                            if(object0 == this) {
                                object0 = "(this)";
                            }
                            stringBuilder0.append(object0);
                            stringBuilder0.append("=");
                            stringBuilder0.append(f);
                            ++v2;
                            if(v2 < this.e) {
                                stringBuilder0.append(", ");
                            }
                        }
                        v3 >>= 8;
                    }
                    if(v4 == 8) {
                        goto label_31;
                    }
                    break;
                }
            label_31:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        stringBuilder0.append('}');
        String s = stringBuilder0.toString();
        j.e(s, "s.append(\'}\').toString()");
        return s;
    }
}

