package s;

import Nb.j;
import java.util.NoSuchElementException;
import m5.b;
import t.a;

public final class u {
    public long[] a;
    public long[] b;
    public int[] c;
    public int d;
    public int e;
    public int f;

    public u(int v) {
        this.a = H.a;
        this.b = n.a;
        this.c = k.a;
        if(v >= 0) {
            this.c(H.f(v));
            return;
        }
        a.c("Capacity must be a positive value.");
        throw null;
    }

    public final int a(int v) {
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

    public final int b(long v) {
        int v11;
        int v1 = ((int)(v >>> 0x20 ^ v)) * 0xCC9E2D51;
        int v2 = v1 ^ v1 << 16;
        int v3 = this.d;
        int v4 = v2 >>> 7 & v3;
        int v5 = 0;
        while(true) {
            int v6 = (v4 & 7) << 3;
            long v7 = this.a[(v4 >> 3) + 1] << 0x40 - v6 & -((long)v6) >> 0x3F | this.a[v4 >> 3] >>> v6;
            long v8 = ((long)(v2 & 0x7F)) * 0x101010101010101L ^ v7;
            long v9 = ~v8 & v8 - 0x101010101010101L & 0x8080808080808080L;
            while(v9 != 0L) {
                int v10 = (Long.numberOfTrailingZeros(v9) >> 3) + v4 & v3;
                if(this.b[v10] == v) {
                    v11 = v10;
                    goto label_18;
                }
                v9 &= v9 - 1L;
            }
            if((v7 & ~v7 << 6 & 0x8080808080808080L) == 0L) {
                goto label_21;
            }
            else {
                v11 = -1;
            }
        label_18:
            if(v11 < 0) {
                throw new NoSuchElementException(b.t(v, "Cannot find value for key "));
            }
            return this.c[v11];
        label_21:
            v5 += 8;
            v4 = v4 + v5 & v3;
        }
    }

    public final void c(int v) {
        long[] arr_v;
        int v1 = v <= 0 ? 0 : Math.max(7, H.e(v));
        this.d = v1;
        if(v1 == 0) {
            arr_v = H.a;
        }
        else {
            arr_v = new long[(v1 + 15 & -8) >> 3];
            Bb.n.p0(arr_v);
        }
        this.a = arr_v;
        arr_v[v1 >> 3] |= 0xFFL << ((v1 & 7) << 3);
        this.f = H.c(this.d) - this.e;
        this.b = new long[v1];
        this.c = new int[v1];
    }

    public final void d(int v, long v1) {
        long v15;
        int v34;
        int v32;
        long[] arr_v3;
        int v31;
        int v13;
        int v2 = ((int)(v1 ^ v1 >>> 0x20)) * 0xCC9E2D51;
        int v3 = v2 ^ v2 << 16;
        int v4 = v3 >>> 7;
        int v5 = this.d;
        int v6 = v4 & v5;
        int v7 = 0;
        while(true) {
            int v8 = (v6 & 7) << 3;
            long v9 = -((long)v8) >> 0x3F & this.a[(v6 >> 3) + 1] << 0x40 - v8 | this.a[v6 >> 3] >>> v8;
            long v10 = v9 ^ ((long)(v3 & 0x7F)) * 0x101010101010101L;
            long v11 = v10 - 0x101010101010101L & ~v10 & 0x8080808080808080L;
            while(v11 != 0L) {
                int v12 = v6 + (Long.numberOfTrailingZeros(v11) >> 3) & v5;
                if(this.b[v12] == v1) {
                    v13 = v12;
                    goto label_133;
                }
                v11 &= v11 - 1L;
            }
            if(Long.compare(v9 & ~v9 << 6 & 0x8080808080808080L, 0L) == 0) {
                goto label_138;
            }
            else {
                int v14 = this.a(v4);
                if(this.f == 0 && (this.a[v14 >> 3] >> ((v14 & 7) << 3) & 0xFFL) != 0xFEL) {
                    int v16 = this.d;
                    if(v16 > 8) {
                        v15 = (long)(v3 & 0x7F);
                        if(Long.compare(((long)this.e) * 0x20L ^ 0x8000000000000000L, ((long)v16) * 25L ^ 0x8000000000000000L) <= 0) {
                            long[] arr_v = this.a;
                            int v17 = this.d;
                            long[] arr_v1 = this.b;
                            int[] arr_v2 = this.c;
                            H.a(arr_v, v17);
                            int v18 = -1;
                            int v19 = 0;
                            while(v19 != v17) {
                                int v20 = (v19 & 7) << 3;
                                long v21 = arr_v[v19 >> 3] >> v20 & 0xFFL;
                                if(v21 == 0x80L) {
                                    int v22 = v19;
                                    ++v19;
                                    v18 = v22;
                                }
                                else if(v21 == 0xFEL) {
                                    long v23 = arr_v1[v19];
                                    int v24 = ((int)(v23 ^ v23 >>> 0x20)) * 0xCC9E2D51;
                                    int v25 = v24 ^ v24 << 16;
                                    int v26 = this.a(v25 >>> 7);
                                    int v27 = v25 >>> 7 & v17;
                                    if((v26 - v27 & v17) / 8 == (v19 - v27 & v17) / 8) {
                                        arr_v[v19 >> 3] = ((long)(v25 & 0x7F)) << v20 | arr_v[v19 >> 3] & ~(0xFFL << v20);
                                        arr_v[arr_v.length - 1] = arr_v[0] & 0xFFFFFFFFFFFFFFL | 0x8000000000000000L;
                                        ++v19;
                                        v18 = v18;
                                    }
                                    else {
                                        int v28 = v19;
                                        long v29 = arr_v[v26 >> 3];
                                        int v30 = (v26 & 7) << 3;
                                        if((v29 >> v30 & 0xFFL) == 0x80L) {
                                            v31 = v4;
                                            arr_v[v26 >> 3] = v29 & ~(0xFFL << v30) | ((long)(v25 & 0x7F)) << v30;
                                            arr_v[v19 >> 3] = arr_v[v19 >> 3] & ~(0xFFL << v20) | 0x80L << v20;
                                            arr_v1[v26] = arr_v1[v28];
                                            arr_v1[v28] = 0L;
                                            arr_v2[v26] = arr_v2[v28];
                                            arr_v2[v28] = 0;
                                            arr_v3 = arr_v;
                                            v32 = v28;
                                        }
                                        else {
                                            v31 = v4;
                                            arr_v3 = arr_v;
                                            arr_v3[v26 >> 3] = v29 & ~(0xFFL << v30) | ((long)(v25 & 0x7F)) << v30;
                                            int v33 = v18 == -1 ? H.b(arr_v3, v28 + 1, v17) : v18;
                                            arr_v1[v33] = arr_v1[v26];
                                            arr_v1[v26] = arr_v1[v28];
                                            arr_v1[v28] = arr_v1[v33];
                                            arr_v2[v33] = arr_v2[v26];
                                            arr_v2[v26] = arr_v2[v28];
                                            arr_v2[v28] = arr_v2[v33];
                                            v32 = v28 - 1;
                                            v28 = v33;
                                        }
                                        arr_v3[arr_v3.length - 1] = arr_v3[0] & 0xFFFFFFFFFFFFFFL | 0x8000000000000000L;
                                        v19 = v32 + 1;
                                        arr_v = arr_v3;
                                        v18 = v28;
                                        v4 = v31;
                                    }
                                }
                                else {
                                    ++v19;
                                }
                            }
                            v34 = v4;
                            this.f = H.c(this.d) - this.e;
                        }
                        else {
                            v34 = v4;
                            goto label_94;
                        }
                    }
                    else {
                        v34 = v4;
                        v15 = (long)(v3 & 0x7F);
                    label_94:
                        long[] arr_v4 = this.a;
                        long[] arr_v5 = this.b;
                        int[] arr_v6 = this.c;
                        int v35 = this.d;
                        this.c(H.d(this.d));
                        long[] arr_v7 = this.a;
                        long[] arr_v8 = this.b;
                        int[] arr_v9 = this.c;
                        int v36 = this.d;
                        for(int v37 = 0; v37 < v35; ++v37) {
                            if((arr_v4[v37 >> 3] >> ((v37 & 7) << 3) & 0xFFL) < 0x80L) {
                                long v38 = arr_v5[v37];
                                int v39 = ((int)(v38 ^ v38 >>> 0x20)) * 0xCC9E2D51;
                                int v40 = v39 ^ v39 << 16;
                                int v41 = this.a(v40 >>> 7);
                                int v42 = (v41 & 7) << 3;
                                long v43 = arr_v7[v41 >> 3] & ~(0xFFL << v42) | ((long)(v40 & 0x7F)) << v42;
                                arr_v7[v41 >> 3] = v43;
                                arr_v7[(v41 - 7 & v36) + (v36 & 7) >> 3] = v43;
                                arr_v8[v41] = v38;
                                arr_v9[v41] = arr_v6[v37];
                            }
                        }
                    }
                    v14 = this.a(v34);
                }
                else {
                    v15 = (long)(v3 & 0x7F);
                }
                int v44 = 1;
                ++this.e;
                int v45 = this.f;
                long[] arr_v10 = this.a;
                long v46 = arr_v10[v14 >> 3];
                int v47 = (v14 & 7) << 3;
                if((v46 >> v47 & 0xFFL) != 0x80L) {
                    v44 = 0;
                }
                this.f = v45 - v44;
                int v48 = this.d;
                long v49 = v46 & ~(0xFFL << v47) | v15 << v47;
                arr_v10[v14 >> 3] = v49;
                arr_v10[(v14 - 7 & v48) + (v48 & 7) >> 3] = v49;
                v13 = ~v14;
            }
        label_133:
            if(v13 < 0) {
                v13 = ~v13;
            }
            this.b[v13] = v1;
            this.c[v13] = v;
            return;
        label_138:
            v7 += 8;
            v6 = v6 + v7 & v5;
        }
    }

    @Override
    public final boolean equals(Object object0) {
        int v6;
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof u)) {
            return false;
        }
        if(((u)object0).e != this.e) {
            return false;
        }
        long[] arr_v = this.b;
        int[] arr_v1 = this.c;
        long[] arr_v2 = this.a;
        int v = arr_v2.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v2[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; v4 = v6 + 1) {
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            v6 = v4;
                            if(arr_v1[v5] != ((u)object0).b(arr_v[v5])) {
                                return false;
                            }
                        }
                        else {
                            v6 = v4;
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_27;
                    }
                    break;
                }
            label_27:
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
        long[] arr_v = this.b;
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
                            long v7 = arr_v[v6];
                            v2 += arr_v1[v6] ^ ((int)(v7 ^ v7 >>> 0x20));
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
        int v10;
        int v7;
        if(this.e == 0) {
            return "{}";
        }
        StringBuilder stringBuilder0 = new StringBuilder("{");
        long[] arr_v = this.b;
        int[] arr_v1 = this.c;
        long[] arr_v2 = this.a;
        int v = arr_v2.length - 2;
        if(v >= 0) {
            int v2 = 0;
            for(int v1 = 0; true; v1 = v10 + 1) {
                long v3 = arr_v2[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v4 = 8 - (~(v1 - v) >>> 0x1F);
                    int v5 = 0;
                    while(v5 < v4) {
                        if((0xFFL & v3) < 0x80L) {
                            int v6 = (v1 << 3) + v5;
                            v7 = v1;
                            long v8 = arr_v[v6];
                            int v9 = arr_v1[v6];
                            stringBuilder0.append(v8);
                            stringBuilder0.append("=");
                            stringBuilder0.append(v9);
                            ++v2;
                            if(v2 < this.e) {
                                stringBuilder0.append(", ");
                            }
                        }
                        else {
                            v7 = v1;
                        }
                        v3 >>= 8;
                        ++v5;
                        v1 = v7;
                    }
                    if(v4 != 8) {
                        break;
                    }
                }
                v10 = v1;
                if(v10 == v) {
                    break;
                }
            }
        }
        stringBuilder0.append('}');
        String s = stringBuilder0.toString();
        j.e(s, "s.append(\'}\').toString()");
        return s;
    }
}

