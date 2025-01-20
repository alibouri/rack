package s;

import Bb.n;
import Nb.j;
import t.a;

public final class t {
    public long[] a;
    public int[] b;
    public int c;
    public int d;
    public int e;

    public t() {
        this(6);
    }

    public t(int v) {
        this.a = H.a;
        this.b = k.a;
        if(v >= 0) {
            this.e(H.f(v));
            return;
        }
        a.c("Capacity must be a positive value.");
        throw null;
    }

    public final boolean a(int v) {
        long v16;
        int[] arr_v8;
        long[] arr_v7;
        int v33;
        int v32;
        int[] arr_v2;
        int v31;
        long v28;
        int v14;
        int v13;
        int v1 = v;
        int v2 = this.d;
        int v3 = v1 * 0xCC9E2D51 ^ v1 * 0xCC9E2D51 << 16;
        int v4 = v3 & 0x7F;
        int v5 = this.c;
        int v6 = v3 >>> 7 & v5;
        int v7 = 0;
        while(true) {
            int v8 = (v6 & 7) << 3;
            long v9 = -((long)v8) >> 0x3F & this.a[(v6 >> 3) + 1] << 0x40 - v8 | this.a[v6 >> 3] >>> v8;
            long v10 = (long)v4;
            long v11 = v9 ^ v10 * 0x101010101010101L;
            for(long v12 = ~v11 & v11 - 0x101010101010101L & 0x8080808080808080L; v12 != 0L; v12 &= v12 - 1L) {
                v13 = v6 + (Long.numberOfTrailingZeros(v12) >> 3) & v5;
                if(this.b[v13] == v1) {
                    v14 = v2;
                    this.b[v13] = v;
                    return this.d != v14;
                }
            }
            if(Long.compare(~v9 << 6 & v9 & 0x8080808080808080L, 0L) == 0) {
                goto label_139;
            }
            else {
                int v15 = this.d(v3 >>> 7);
                if(this.e == 0 && (this.a[v15 >> 3] >> ((v15 & 7) << 3) & 0xFFL) != 0xFEL) {
                    int v17 = this.c;
                    if(v17 > 8) {
                        int v18 = v3 >>> 7;
                        if(Long.compare(((long)this.d) * 0x20L ^ 0x8000000000000000L, ((long)v17) * 25L ^ 0x8000000000000000L) <= 0) {
                            long[] arr_v = this.a;
                            int v19 = this.c;
                            int[] arr_v1 = this.b;
                            H.a(arr_v, v19);
                            int v20 = 0;
                            int v21 = -1;
                            while(v20 != v19) {
                                int v22 = (v20 & 7) << 3;
                                long v23 = arr_v[v20 >> 3] >> v22 & 0xFFL;
                                if(v23 == 0x80L) {
                                    v21 = v20;
                                    ++v20;
                                }
                                else if(v23 == 0xFEL) {
                                    int v24 = arr_v1[v20] * 0xCC9E2D51;
                                    int v25 = v24 ^ v24 << 16;
                                    int v26 = this.d(v25 >>> 7);
                                    int v27 = v25 >>> 7 & v19;
                                    if((v26 - v27 & v19) / 8 == (v20 - v27 & v19) / 8) {
                                        v28 = v10;
                                        arr_v[v20 >> 3] = ((long)(v25 & 0x7F)) << v22 | arr_v[v20 >> 3] & ~(0xFFL << v22);
                                        arr_v[arr_v.length - 1] = arr_v[0] & 0xFFFFFFFFFFFFFFL | 0x8000000000000000L;
                                        ++v20;
                                        v2 = v2;
                                    }
                                    else {
                                        v28 = v10;
                                        long v29 = arr_v[v26 >> 3];
                                        int v30 = (v26 & 7) << 3;
                                        if((v29 >> v30 & 0xFFL) == 0x80L) {
                                            v31 = v18;
                                            arr_v[v26 >> 3] = ((long)(v25 & 0x7F)) << v30 | v29 & ~(0xFFL << v30);
                                            arr_v[v20 >> 3] = arr_v[v20 >> 3] & ~(0xFFL << v22) | 0x80L << v22;
                                            arr_v1[v26] = arr_v1[v20];
                                            arr_v1[v20] = 0;
                                            arr_v2 = arr_v1;
                                            v32 = v2;
                                            v21 = v20;
                                        }
                                        else {
                                            v31 = v18;
                                            arr_v2 = arr_v1;
                                            v32 = v2;
                                            arr_v[v26 >> 3] = ~(0xFFL << v30) & v29 | ((long)(v25 & 0x7F)) << v30;
                                            if(v21 == -1) {
                                                v21 = H.b(arr_v, v20 + 1, v19);
                                            }
                                            arr_v2[v21] = arr_v2[v26];
                                            arr_v2[v26] = arr_v2[v20];
                                            arr_v2[v20] = arr_v2[v21];
                                            --v20;
                                        }
                                        arr_v[arr_v.length - 1] = arr_v[0] & 0xFFFFFFFFFFFFFFL | 0x8000000000000000L;
                                        ++v20;
                                        arr_v1 = arr_v2;
                                        v2 = v32;
                                        v18 = v31;
                                    }
                                    v10 = v28;
                                }
                                else {
                                    ++v20;
                                }
                            }
                            v14 = v2;
                            v33 = v18;
                            v16 = v10;
                            this.e = H.c(this.c) - this.d;
                        }
                        else {
                            v14 = v2;
                            v33 = v18;
                            v16 = v10;
                            goto label_99;
                        }
                    }
                    else {
                        v14 = v2;
                        v33 = v3 >>> 7;
                        v16 = v10;
                    label_99:
                        long[] arr_v3 = this.a;
                        int[] arr_v4 = this.b;
                        int v34 = this.c;
                        this.e(H.d(this.c));
                        long[] arr_v5 = this.a;
                        int[] arr_v6 = this.b;
                        int v35 = this.c;
                        int v36 = 0;
                        while(v36 < v34) {
                            if((arr_v3[v36 >> 3] >> ((v36 & 7) << 3) & 0xFFL) < 0x80L) {
                                int v37 = arr_v4[v36];
                                int v38 = v37 * 0xCC9E2D51 ^ v37 * 0xCC9E2D51 << 16;
                                int v39 = this.d(v38 >>> 7);
                                int v40 = (v39 & 7) << 3;
                                arr_v7 = arr_v3;
                                arr_v8 = arr_v4;
                                long v41 = arr_v5[v39 >> 3] & ~(0xFFL << v40) | ((long)(v38 & 0x7F)) << v40;
                                arr_v5[v39 >> 3] = v41;
                                arr_v5[(v39 - 7 & v35) + (v35 & 7) >> 3] = v41;
                                arr_v6[v39] = v37;
                            }
                            else {
                                arr_v7 = arr_v3;
                                arr_v8 = arr_v4;
                            }
                            ++v36;
                            arr_v3 = arr_v7;
                            arr_v4 = arr_v8;
                        }
                    }
                    v13 = this.d(v33);
                }
                else {
                    v14 = v2;
                    v16 = v10;
                    v13 = v15;
                }
                ++this.d;
                int v42 = this.e;
                long[] arr_v9 = this.a;
                long v43 = arr_v9[v13 >> 3];
                int v44 = (v13 & 7) << 3;
                this.e = v42 - ((v43 >> v44 & 0xFFL) == 0x80L ? 1 : 0);
                int v45 = this.c;
                long v46 = v43 & ~(0xFFL << v44) | v16 << v44;
                arr_v9[v13 >> 3] = v46;
                arr_v9[(v13 - 7 & v45) + (v45 & 7) >> 3] = v46;
            }
            this.b[v13] = v;
            return this.d != v14;
        label_139:
            v7 += 8;
            v6 = v6 + v7 & v5;
            v2 = v2;
            v4 = v4;
            v1 = v;
        }
    }

    public final void b() {
        this.d = 0;
        long[] arr_v = this.a;
        if(arr_v != H.a) {
            n.p0(arr_v);
            int v = this.c >> 3;
            this.a[v] |= 0xFFL << ((this.c & 7) << 3);
        }
        this.e = H.c(this.c) - this.d;
    }

    public final boolean c(int v) {
        int v1 = 0xCC9E2D51 * v ^ 0xCC9E2D51 * v << 16;
        int v2 = this.c;
        int v3 = v1 >>> 7 & v2;
        int v4 = 0;
        while(true) {
            int v5 = (v3 & 7) << 3;
            long v6 = this.a[(v3 >> 3) + 1] << 0x40 - v5 & -((long)v5) >> 0x3F | this.a[v3 >> 3] >>> v5;
            long v7 = ((long)(v1 & 0x7F)) * 0x101010101010101L ^ v6;
            for(long v8 = ~v7 & v7 - 0x101010101010101L & 0x8080808080808080L; v8 != 0L; v8 &= v8 - 1L) {
                int v9 = (Long.numberOfTrailingZeros(v8) >> 3) + v3 & v2;
                if(this.b[v9] == v) {
                    return v9 >= 0;
                }
            }
            if((v6 & ~v6 << 6 & 0x8080808080808080L) != 0L) {
                return false;
            }
            v4 += 8;
            v3 = v3 + v4 & v2;
        }
    }

    public final int d(int v) {
        long v6;
        int v1 = this.c;
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

    public final void e(int v) {
        long[] arr_v;
        int v1 = v <= 0 ? 0 : Math.max(7, H.e(v));
        this.c = v1;
        if(v1 == 0) {
            arr_v = H.a;
        }
        else {
            arr_v = new long[(v1 + 15 & -8) >> 3];
            n.p0(arr_v);
        }
        this.a = arr_v;
        arr_v[v1 >> 3] |= 0xFFL << ((v1 & 7) << 3);
        this.e = H.c(this.c) - this.d;
        this.b = new int[v1];
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof t)) {
            return false;
        }
        if(((t)object0).d != this.d) {
            return false;
        }
        int[] arr_v = this.b;
        long[] arr_v1 = this.a;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v1[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L && !((t)object0).c(arr_v[(v1 << 3) + v4])) {
                            return false;
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_22;
                    }
                    break;
                }
            label_22:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        return true;
    }

    public final void f(int v) {
        --this.d;
        long[] arr_v = this.a;
        int v1 = this.c;
        int v2 = (v & 7) << 3;
        long v3 = arr_v[v >> 3] & ~(0xFFL << v2) | 0xFEL << v2;
        arr_v[v >> 3] = v3;
        arr_v[(v - 7 & v1) + (v1 & 7) >> 3] = v3;
    }

    @Override
    public final int hashCode() {
        int[] arr_v = this.b;
        long[] arr_v1 = this.a;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v2 = 0;
            for(int v1 = 0; true; ++v1) {
                long v3 = arr_v1[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v4 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v5 = 0; v5 < v4; ++v5) {
                        if((0xFFL & v3) < 0x80L) {
                            v2 += arr_v[(v1 << 3) + v5];
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
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("[");
        int[] arr_v = this.b;
        long[] arr_v1 = this.a;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v1 = 0;
            int v2 = 0;
            while(true) {
                long v3 = arr_v1[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_28;
                }
                int v4 = 8 - (~(v1 - v) >>> 0x1F);
                int v5 = 0;
                while(v5 < v4) {
                    if((0xFFL & v3) < 0x80L) {
                        int v6 = arr_v[(v1 << 3) + v5];
                        if(v2 == -1) {
                            stringBuilder0.append("...");
                            goto label_34;
                        }
                        if(v2 != 0) {
                            stringBuilder0.append(", ");
                        }
                        stringBuilder0.append(v6);
                        ++v2;
                    }
                    v3 >>= 8;
                    ++v5;
                }
                if(v4 == 8) {
                label_28:
                    if(v1 != v) {
                        ++v1;
                        continue;
                    }
                    break;
                }
                else {
                    stringBuilder0.append("]");
                }
                goto label_34;
            }
        }
        stringBuilder0.append("]");
    label_34:
        String s = stringBuilder0.toString();
        j.e(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }
}

