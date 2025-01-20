package s;

import Bb.n;
import Nb.j;
import java.util.NoSuchElementException;

public final class q {
    public long[] a;
    public int[] b;
    public int[] c;
    public int d;
    public int e;
    public int f;

    public q() {
        this.a = H.a;
        this.b = k.a;
        this.c = k.a;
        this.f(6);
    }

    public final void a() {
        this.e = 0;
        long[] arr_v = this.a;
        if(arr_v != H.a) {
            n.p0(arr_v);
            int v = this.d >> 3;
            this.a[v] |= 0xFFL << ((this.d & 7) << 3);
        }
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

    public final int c(int v) {
        int v1 = 0xCC9E2D51 * v ^ 0xCC9E2D51 * v << 16;
        int v2 = this.d;
        int v3 = v1 >>> 7 & v2;
        int v4 = 0;
        while(true) {
            int v5 = (v3 & 7) << 3;
            long v6 = this.a[(v3 >> 3) + 1] << 0x40 - v5 & -((long)v5) >> 0x3F | this.a[v3 >> 3] >>> v5;
            long v7 = ((long)(v1 & 0x7F)) * 0x101010101010101L ^ v6;
            for(long v8 = ~v7 & v7 - 0x101010101010101L & 0x8080808080808080L; v8 != 0L; v8 &= v8 - 1L) {
                int v9 = (Long.numberOfTrailingZeros(v8) >> 3) + v3 & v2;
                if(this.b[v9] == v) {
                    return v9;
                }
            }
            if((v6 & ~v6 << 6 & 0x8080808080808080L) != 0L) {
                return -1;
            }
            v4 += 8;
            v3 = v3 + v4 & v2;
        }
    }

    public final int d(int v) {
        int v1 = this.c(v);
        if(v1 < 0) {
            throw new NoSuchElementException("Cannot find value for key " + v);
        }
        return this.c[v1];
    }

    public final int e(int v) {
        int v1 = this.c(v);
        return v1 < 0 ? -1 : this.c[v1];
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof q)) {
            return false;
        }
        if(((q)object0).e != this.e) {
            return false;
        }
        int[] arr_v = this.b;
        int[] arr_v1 = this.c;
        long[] arr_v2 = this.a;
        int v = arr_v2.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v2[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            if(arr_v1[v5] != ((q)object0).d(arr_v[v5])) {
                                return false;
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_25;
                    }
                    break;
                }
            label_25:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        return true;
    }

    public final void f(int v) {
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
        this.b = new int[v1];
        this.c = new int[v1];
    }

    public final void g(int v, int v1) {
        long v14;
        int[] arr_v11;
        long[] arr_v10;
        int[] arr_v3;
        int v29;
        int v12;
        q q1;
        q q0 = this;
        int v2 = v;
        int v3 = v2 * 0xCC9E2D51 ^ v2 * 0xCC9E2D51 << 16;
        int v4 = q0.d;
        int v5 = v3 >>> 7 & v4;
        int v6 = 0;
        while(true) {
            int v7 = (v5 & 7) << 3;
            long v8 = -((long)v7) >> 0x3F & q0.a[(v5 >> 3) + 1] << 0x40 - v7 | q0.a[v5 >> 3] >>> v7;
            long v9 = v8 ^ ((long)(v3 & 0x7F)) * 0x101010101010101L;
            long v10 = v9 - 0x101010101010101L & ~v9 & 0x8080808080808080L;
            while(v10 != 0L) {
                int v11 = v5 + (Long.numberOfTrailingZeros(v10) >> 3) & v4;
                if(q0.b[v11] == v2) {
                    q1 = q0;
                    v12 = v11;
                    goto label_138;
                }
                v10 &= v10 - 1L;
            }
            if(Long.compare(v8 & ~v8 << 6 & 0x8080808080808080L, 0L) == 0) {
                goto label_143;
            }
            else {
                int v13 = q0.b(v3 >>> 7);
                if(q0.f == 0 && (q0.a[v13 >> 3] >> ((v13 & 7) << 3) & 0xFFL) != 0xFEL) {
                    int v15 = q0.d;
                    if(v15 > 8) {
                        v14 = (long)(v3 & 0x7F);
                        if(Long.compare(((long)q0.e) * 0x20L ^ 0x8000000000000000L, ((long)v15) * 25L ^ 0x8000000000000000L) <= 0) {
                            long[] arr_v = q0.a;
                            int v16 = q0.d;
                            int[] arr_v1 = q0.b;
                            int[] arr_v2 = q0.c;
                            H.a(arr_v, v16);
                            int v17 = -1;
                            int v18 = 0;
                            while(v18 != v16) {
                                int v19 = (v18 & 7) << 3;
                                long v20 = arr_v[v18 >> 3] >> v19 & 0xFFL;
                                if(v20 == 0x80L) {
                                    int v21 = v18;
                                    ++v18;
                                    v17 = v21;
                                }
                                else if(v20 == 0xFEL) {
                                    int v22 = arr_v1[v18] * 0xCC9E2D51;
                                    int v23 = v22 ^ v22 << 16;
                                    int v24 = q0.b(v23 >>> 7);
                                    int v25 = v23 >>> 7 & v16;
                                    if((v24 - v25 & v16) / 8 == (v18 - v25 & v16) / 8) {
                                        arr_v[v18 >> 3] = arr_v[v18 >> 3] & ~(0xFFL << v19) | ((long)(v23 & 0x7F)) << v19;
                                        arr_v[arr_v.length - 1] = arr_v[0] & 0xFFFFFFFFFFFFFFL | 0x8000000000000000L;
                                        ++v18;
                                        v17 = v17;
                                    }
                                    else {
                                        int v26 = v18;
                                        long v27 = arr_v[v24 >> 3];
                                        int v28 = (v24 & 7) << 3;
                                        if((v27 >> v28 & 0xFFL) == 0x80L) {
                                            arr_v[v24 >> 3] = v27 & ~(0xFFL << v28) | ((long)(v23 & 0x7F)) << v28;
                                            arr_v[v18 >> 3] = arr_v[v18 >> 3] & ~(0xFFL << v19) | 0x80L << v19;
                                            arr_v1[v24] = arr_v1[v26];
                                            arr_v1[v26] = 0;
                                            arr_v2[v24] = arr_v2[v26];
                                            arr_v2[v26] = 0;
                                            v29 = v26;
                                            arr_v3 = arr_v2;
                                        }
                                        else {
                                            arr_v3 = arr_v2;
                                            arr_v[v24 >> 3] = ((long)(v23 & 0x7F)) << v28 | v27 & ~(0xFFL << v28);
                                            int v30 = v17 == -1 ? H.b(arr_v, v26 + 1, v16) : v17;
                                            arr_v1[v30] = arr_v1[v24];
                                            arr_v1[v24] = arr_v1[v26];
                                            arr_v1[v26] = arr_v1[v30];
                                            arr_v3[v30] = arr_v3[v24];
                                            arr_v3[v24] = arr_v3[v26];
                                            arr_v3[v26] = arr_v3[v30];
                                            v29 = v26 - 1;
                                            v26 = v30;
                                        }
                                        arr_v[arr_v.length - 1] = arr_v[0] & 0xFFFFFFFFFFFFFFL | 0x8000000000000000L;
                                        v18 = v29 + 1;
                                        q0 = this;
                                        v17 = v26;
                                        arr_v2 = arr_v3;
                                    }
                                }
                                else {
                                    ++v18;
                                }
                            }
                            q1 = q0;
                            q1.f = H.c(q1.d) - q1.e;
                        }
                        else {
                            q1 = q0;
                            goto label_93;
                        }
                    }
                    else {
                        q1 = q0;
                        v14 = (long)(v3 & 0x7F);
                    label_93:
                        long[] arr_v4 = q1.a;
                        int[] arr_v5 = q1.b;
                        int[] arr_v6 = q1.c;
                        int v31 = q1.d;
                        q1.f(H.d(q1.d));
                        long[] arr_v7 = q1.a;
                        int[] arr_v8 = q1.b;
                        int[] arr_v9 = q1.c;
                        int v32 = q1.d;
                        int v33 = 0;
                        while(v33 < v31) {
                            if((arr_v4[v33 >> 3] >> ((v33 & 7) << 3) & 0xFFL) < 0x80L) {
                                int v34 = arr_v5[v33];
                                int v35 = v34 * 0xCC9E2D51 ^ v34 * 0xCC9E2D51 << 16;
                                int v36 = q1.b(v35 >>> 7);
                                int v37 = (v36 & 7) << 3;
                                arr_v10 = arr_v4;
                                arr_v11 = arr_v5;
                                long v38 = arr_v7[v36 >> 3] & ~(0xFFL << v37) | ((long)(v35 & 0x7F)) << v37;
                                arr_v7[v36 >> 3] = v38;
                                arr_v7[(v36 - 7 & v32) + (v32 & 7) >> 3] = v38;
                                arr_v8[v36] = v34;
                                arr_v9[v36] = arr_v6[v33];
                            }
                            else {
                                arr_v10 = arr_v4;
                                arr_v11 = arr_v5;
                            }
                            ++v33;
                            arr_v4 = arr_v10;
                            arr_v5 = arr_v11;
                        }
                    }
                    v13 = q1.b(v3 >>> 7);
                }
                else {
                    q1 = q0;
                    v14 = (long)(v3 & 0x7F);
                }
                int v39 = 1;
                ++q1.e;
                int v40 = q1.f;
                long[] arr_v12 = q1.a;
                long v41 = arr_v12[v13 >> 3];
                int v42 = (v13 & 7) << 3;
                if((v41 >> v42 & 0xFFL) != 0x80L) {
                    v39 = 0;
                }
                q1.f = v40 - v39;
                int v43 = q1.d;
                long v44 = v41 & ~(0xFFL << v42) | v14 << v42;
                arr_v12[v13 >> 3] = v44;
                arr_v12[(v13 - 7 & v43) + (v43 & 7) >> 3] = v44;
                v12 = ~v13;
            }
        label_138:
            if(v12 < 0) {
                v12 = ~v12;
            }
            q1.b[v12] = v;
            q1.c[v12] = v1;
            return;
        label_143:
            v6 += 8;
            v5 = v5 + v6 & v4;
            q0 = q0;
            v2 = v;
        }
    }

    @Override
    public final int hashCode() {
        int[] arr_v = this.b;
        int[] arr_v1 = this.c;
        long[] arr_v2 = this.a;
        int v = arr_v2.length - 2;
        if(v >= 0) {
            int v2 = 0;
            for(int v1 = 0; true; ++v1) {
                long v3 = arr_v2[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v4 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v5 = 0; v5 < v4; ++v5) {
                        if((0xFFL & v3) < 0x80L) {
                            int v6 = (v1 << 3) + v5;
                            v2 += arr_v1[v6] ^ arr_v[v6];
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
        int[] arr_v = this.b;
        int[] arr_v1 = this.c;
        long[] arr_v2 = this.a;
        int v = arr_v2.length - 2;
        if(v >= 0) {
            int v1 = 0;
            int v2 = 0;
            while(true) {
                long v3 = arr_v2[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v4 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v5 = 0; v5 < v4; ++v5) {
                        if((0xFFL & v3) < 0x80L) {
                            int v6 = (v1 << 3) + v5;
                            int v7 = arr_v[v6];
                            int v8 = arr_v1[v6];
                            stringBuilder0.append(v7);
                            stringBuilder0.append("=");
                            stringBuilder0.append(v8);
                            ++v2;
                            if(v2 < this.e) {
                                stringBuilder0.append(", ");
                            }
                        }
                        v3 >>= 8;
                    }
                    if(v4 == 8) {
                        goto label_29;
                    }
                    break;
                }
            label_29:
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

