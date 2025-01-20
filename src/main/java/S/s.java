package s;

import Bb.n;
import Nb.j;
import t.a;

public final class s {
    public long[] a;
    public int[] b;
    public Object[] c;
    public int d;
    public int e;
    public int f;

    public s() {
        this(6);
    }

    public s(int v) {
        this.a = H.a;
        this.b = k.a;
        this.c = a.c;
        if(v >= 0) {
            this.g(H.f(v));
            return;
        }
        a.c("Capacity must be a positive value.");
        throw null;
    }

    public final void a() {
        this.e = 0;
        long[] arr_v = this.a;
        if(arr_v != H.a) {
            n.p0(arr_v);
            int v = this.d >> 3;
            this.a[v] |= 0xFFL << ((this.d & 7) << 3);
        }
        n.o0(this.c, null, 0, this.d);
        this.f = H.c(this.d) - this.e;
    }

    public final boolean b(int v) {
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

    public final boolean c(int v) {
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
        long v12;
        int[] arr_v7;
        long[] arr_v6;
        int v30;
        int v29;
        int v28;
        int v27;
        int v26;
        int v25;
        int v1 = v * 0xCC9E2D51 ^ v * 0xCC9E2D51 << 16;
        int v2 = v1 >>> 7;
        int v3 = this.d;
        int v4 = v2 & v3;
        int v5 = 0;
        while(true) {
            int v6 = (v4 & 7) << 3;
            long v7 = -((long)v6) >> 0x3F & this.a[(v4 >> 3) + 1] << 0x40 - v6 | this.a[v4 >> 3] >>> v6;
            long v8 = v7 ^ ((long)(v1 & 0x7F)) * 0x101010101010101L;
            for(long v9 = v8 - 0x101010101010101L & ~v8 & 0x8080808080808080L; v9 != 0L; v9 &= v9 - 1L) {
                int v10 = v4 + (Long.numberOfTrailingZeros(v9) >> 3) & v3;
                if(this.b[v10] == v) {
                    return v10;
                }
            }
            if(Long.compare(v7 & ~v7 << 6 & 0x8080808080808080L, 0L) != 0) {
                int v11 = this.e(v2);
                if(this.f == 0 && (this.a[v11 >> 3] >> ((v11 & 7) << 3) & 0xFFL) != 0xFEL) {
                    int v13 = this.d;
                    if(v13 > 8) {
                        v12 = (long)(v1 & 0x7F);
                        if(Long.compare(((long)this.e) * 0x20L ^ 0x8000000000000000L, ((long)v13) * 25L ^ 0x8000000000000000L) <= 0) {
                            long[] arr_v = this.a;
                            int v14 = this.d;
                            int[] arr_v1 = this.b;
                            Object[] arr_object = this.c;
                            H.a(arr_v, v14);
                            int v15 = -1;
                            int v16 = 0;
                            while(v16 != v14) {
                                int v17 = (v16 & 7) << 3;
                                long v18 = arr_v[v16 >> 3] >> v17 & 0xFFL;
                                if(v18 == 0x80L) {
                                    v15 = v16;
                                    ++v16;
                                }
                                else if(v18 == 0xFEL) {
                                    int v19 = arr_v1[v16] * 0xCC9E2D51;
                                    int v20 = v19 ^ v19 << 16;
                                    int v21 = this.e(v20 >>> 7);
                                    int v22 = v20 >>> 7 & v14;
                                    if((v21 - v22 & v14) / 8 == (v16 - v22 & v14) / 8) {
                                        arr_v[v16 >> 3] = arr_v[v16 >> 3] & ~(0xFFL << v17) | ((long)(v20 & 0x7F)) << v17;
                                        arr_v[arr_v.length - 1] = arr_v[0] & 0xFFFFFFFFFFFFFFL | 0x8000000000000000L;
                                        ++v16;
                                        arr_v1 = arr_v1;
                                    }
                                    else {
                                        long v23 = arr_v[v21 >> 3];
                                        int v24 = (v21 & 7) << 3;
                                        if((v23 >> v24 & 0xFFL) == 0x80L) {
                                            v25 = v16;
                                            v26 = v2;
                                            arr_v[v21 >> 3] = ~(0xFFL << v24) & v23 | ((long)(v20 & 0x7F)) << v24;
                                            arr_v[v16 >> 3] = arr_v[v16 >> 3] & ~(0xFFL << v17) | 0x80L << v17;
                                            arr_v1[v21] = arr_v1[v25];
                                            arr_v1[v25] = 0;
                                            arr_object[v21] = arr_object[v25];
                                            arr_object[v25] = null;
                                            v27 = v14;
                                            v28 = v25;
                                        }
                                        else {
                                            v26 = v2;
                                            arr_v[v21 >> 3] = ~(0xFFL << v24) & v23 | ((long)(v20 & 0x7F)) << v24;
                                            if(v15 == -1) {
                                                v27 = v14;
                                                v29 = H.b(arr_v, v16 + 1, v27);
                                            }
                                            else {
                                                v27 = v14;
                                                v29 = v15;
                                            }
                                            arr_v1[v29] = arr_v1[v21];
                                            arr_v1[v21] = arr_v1[v16];
                                            arr_v1[v16] = arr_v1[v29];
                                            arr_object[v29] = arr_object[v21];
                                            arr_object[v21] = arr_object[v16];
                                            arr_object[v16] = arr_object[v29];
                                            v28 = v16 - 1;
                                            v25 = v29;
                                        }
                                        arr_v[arr_v.length - 1] = arr_v[0] & 0xFFFFFFFFFFFFFFL | 0x8000000000000000L;
                                        v16 = v28 + 1;
                                        v14 = v27;
                                        v15 = v25;
                                        arr_v1 = arr_v1;
                                        v2 = v26;
                                    }
                                }
                                else {
                                    ++v16;
                                }
                            }
                            v30 = v2;
                            this.f = H.c(this.d) - this.e;
                        }
                        else {
                            v30 = v2;
                            goto label_95;
                        }
                    }
                    else {
                        v30 = v2;
                        v12 = (long)(v1 & 0x7F);
                    label_95:
                        long[] arr_v2 = this.a;
                        int[] arr_v3 = this.b;
                        Object[] arr_object1 = this.c;
                        int v31 = this.d;
                        this.g(H.d(this.d));
                        long[] arr_v4 = this.a;
                        int[] arr_v5 = this.b;
                        Object[] arr_object2 = this.c;
                        int v32 = this.d;
                        int v33 = 0;
                        while(v33 < v31) {
                            if((arr_v2[v33 >> 3] >> ((v33 & 7) << 3) & 0xFFL) < 0x80L) {
                                int v34 = arr_v3[v33];
                                int v35 = v34 * 0xCC9E2D51 ^ v34 * 0xCC9E2D51 << 16;
                                int v36 = this.e(v35 >>> 7);
                                int v37 = (v36 & 7) << 3;
                                arr_v6 = arr_v2;
                                arr_v7 = arr_v3;
                                long v38 = arr_v4[v36 >> 3] & ~(0xFFL << v37) | ((long)(v35 & 0x7F)) << v37;
                                arr_v4[v36 >> 3] = v38;
                                arr_v4[(v36 - 7 & v32) + (v32 & 7) >> 3] = v38;
                                arr_v5[v36] = v34;
                                arr_object2[v36] = arr_object1[v33];
                            }
                            else {
                                arr_v6 = arr_v2;
                                arr_v7 = arr_v3;
                            }
                            ++v33;
                            arr_v2 = arr_v6;
                            arr_v3 = arr_v7;
                        }
                    }
                    v11 = this.e(v30);
                }
                else {
                    v12 = (long)(v1 & 0x7F);
                }
                int v39 = 1;
                ++this.e;
                int v40 = this.f;
                long[] arr_v8 = this.a;
                long v41 = arr_v8[v11 >> 3];
                int v42 = (v11 & 7) << 3;
                if((v41 >> v42 & 0xFFL) != 0x80L) {
                    v39 = 0;
                }
                this.f = v40 - v39;
                int v43 = this.d;
                long v44 = v41 & ~(0xFFL << v42) | v12 << v42;
                arr_v8[v11 >> 3] = v44;
                arr_v8[(v11 - 7 & v43) + (v43 & 7) >> 3] = v44;
                return v11;
            }
            v5 += 8;
            v4 = v4 + v5 & v3;
            v2 = v2;
        }
    }

    public final int e(int v) {
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

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof s)) {
            return false;
        }
        if(((s)object0).e != this.e) {
            return false;
        }
        int[] arr_v = this.b;
        Object[] arr_object = this.c;
        long[] arr_v1 = this.a;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v1[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            int v6 = arr_v[v5];
                            Object object1 = arr_object[v5];
                            if(object1 == null) {
                                if(((s)object0).f(v6) != null || !((s)object0).c(v6)) {
                                    return false;
                                }
                            }
                            else if(!object1.equals(((s)object0).f(v6))) {
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

    public final Object f(int v) {
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
                    return v9 < 0 ? null : this.c[v9];
                }
            }
            if((v6 & ~v6 << 6 & 0x8080808080808080L) != 0L) {
                return null;
            }
            v4 += 8;
            v3 = v3 + v4 & v2;
        }
    }

    public final void g(int v) {
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
        this.c = new Object[v1];
    }

    public final Object h(int v) {
        int v10;
        int v1 = 0xCC9E2D51 * v ^ 0xCC9E2D51 * v << 16;
        int v2 = this.d;
        int v3 = v1 >>> 7 & v2;
        int v4 = 0;
        while(true) {
            int v5 = (v3 & 7) << 3;
            long v6 = this.a[(v3 >> 3) + 1] << 0x40 - v5 & -((long)v5) >> 0x3F | this.a[v3 >> 3] >>> v5;
            long v7 = ((long)(v1 & 0x7F)) * 0x101010101010101L ^ v6;
            long v8 = ~v7 & v7 - 0x101010101010101L & 0x8080808080808080L;
            while(v8 != 0L) {
                int v9 = (Long.numberOfTrailingZeros(v8) >> 3) + v3 & v2;
                if(this.b[v9] == v) {
                    v10 = v9;
                    goto label_17;
                }
                v8 &= v8 - 1L;
            }
            if((v6 & ~v6 << 6 & 0x8080808080808080L) == 0L) {
                goto label_30;
            }
            else {
                v10 = -1;
            }
        label_17:
            if(v10 >= 0) {
                --this.e;
                long[] arr_v = this.a;
                int v11 = this.d;
                int v12 = (v10 & 7) << 3;
                long v13 = arr_v[v10 >> 3] & ~(0xFFL << v12) | 0xFEL << v12;
                arr_v[v10 >> 3] = v13;
                arr_v[(v10 - 7 & v11) + (v11 & 7) >> 3] = v13;
                Object[] arr_object = this.c;
                Object object0 = arr_object[v10];
                arr_object[v10] = null;
                return object0;
            }
            return null;
        label_30:
            v4 += 8;
            v3 = v3 + v4 & v2;
        }
    }

    @Override
    public final int hashCode() {
        int[] arr_v = this.b;
        Object[] arr_object = this.c;
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
                            int v6 = (v1 << 3) + v5;
                            int v7 = arr_v[v6];
                            Object object0 = arr_object[v6];
                            v2 += (object0 == null ? 0 : object0.hashCode()) ^ v7;
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

    public final void i(int v, Object object0) {
        int v1 = this.d(v);
        this.b[v1] = v;
        this.c[v1] = object0;
    }

    @Override
    public final String toString() {
        if(this.e == 0) {
            return "{}";
        }
        StringBuilder stringBuilder0 = new StringBuilder("{");
        int[] arr_v = this.b;
        Object[] arr_object = this.c;
        long[] arr_v1 = this.a;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v1 = 0;
            int v2 = 0;
            while(true) {
                long v3 = arr_v1[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v4 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v5 = 0; v5 < v4; ++v5) {
                        if((0xFFL & v3) < 0x80L) {
                            int v6 = (v1 << 3) + v5;
                            int v7 = arr_v[v6];
                            Object object0 = arr_object[v6];
                            stringBuilder0.append(v7);
                            stringBuilder0.append("=");
                            if(object0 == this) {
                                object0 = "(this)";
                            }
                            stringBuilder0.append(object0);
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

