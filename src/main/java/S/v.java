package s;

import Nb.j;
import t.a;

public final class v {
    public long[] a;
    public long[] b;
    public Object[] c;
    public int d;
    public int e;
    public int f;

    public v() {
        this(6);
    }

    public v(int v) {
        this.a = H.a;
        this.b = n.a;
        this.c = a.c;
        if(v >= 0) {
            this.f(H.f(v));
            return;
        }
        a.c("Capacity must be a positive value.");
        throw null;
    }

    public final boolean a(long v) {
        int v1 = ((int)(v ^ v >>> 0x20)) * 0xCC9E2D51;
        int v2 = v1 ^ v1 << 16;
        int v3 = this.d;
        int v4 = v2 >>> 7 & v3;
        int v5 = 0;
        while(true) {
            int v6 = (v4 & 7) << 3;
            long v7 = this.a[(v4 >> 3) + 1] << 0x40 - v6 & -((long)v6) >> 0x3F | this.a[v4 >> 3] >>> v6;
            long v8 = ((long)(v2 & 0x7F)) * 0x101010101010101L ^ v7;
            for(long v9 = ~v8 & v8 - 0x101010101010101L & 0x8080808080808080L; v9 != 0L; v9 &= v9 - 1L) {
                int v10 = (Long.numberOfTrailingZeros(v9) >> 3) + v4 & v3;
                if(this.b[v10] == v) {
                    return v10 >= 0;
                }
            }
            if((v7 & ~v7 << 6 & 0x8080808080808080L) != 0L) {
                return false;
            }
            v5 += 8;
            v4 = v4 + v5 & v3;
        }
    }

    public final boolean b(long v) {
        int v1 = ((int)(v ^ v >>> 0x20)) * 0xCC9E2D51;
        int v2 = v1 ^ v1 << 16;
        int v3 = this.d;
        int v4 = v2 >>> 7 & v3;
        int v5 = 0;
        while(true) {
            int v6 = (v4 & 7) << 3;
            long v7 = this.a[(v4 >> 3) + 1] << 0x40 - v6 & -((long)v6) >> 0x3F | this.a[v4 >> 3] >>> v6;
            long v8 = ((long)(v2 & 0x7F)) * 0x101010101010101L ^ v7;
            for(long v9 = ~v8 & v8 - 0x101010101010101L & 0x8080808080808080L; v9 != 0L; v9 &= v9 - 1L) {
                int v10 = (Long.numberOfTrailingZeros(v9) >> 3) + v4 & v3;
                if(this.b[v10] == v) {
                    return v10 >= 0;
                }
            }
            if((v7 & ~v7 << 6 & 0x8080808080808080L) != 0L) {
                return false;
            }
            v5 += 8;
            v4 = v4 + v5 & v3;
        }
    }

    public final int c(long v) {
        long v13;
        int v32;
        int v30;
        long[] arr_v2;
        int v29;
        int v1 = ((int)(v ^ v >>> 0x20)) * 0xCC9E2D51;
        int v2 = v1 ^ v1 << 16;
        int v3 = v2 >>> 7;
        int v4 = this.d;
        int v5 = v3 & v4;
        int v6 = 0;
        while(true) {
            int v7 = (v5 & 7) << 3;
            long v8 = -((long)v7) >> 0x3F & this.a[(v5 >> 3) + 1] << 0x40 - v7 | this.a[v5 >> 3] >>> v7;
            long v9 = v8 ^ ((long)(v2 & 0x7F)) * 0x101010101010101L;
            for(long v10 = v9 - 0x101010101010101L & ~v9 & 0x8080808080808080L; v10 != 0L; v10 &= v10 - 1L) {
                int v11 = v5 + (Long.numberOfTrailingZeros(v10) >> 3) & v4;
                if(this.b[v11] == v) {
                    return v11;
                }
            }
            if(Long.compare(v8 & ~v8 << 6 & 0x8080808080808080L, 0L) != 0) {
                int v12 = this.d(v3);
                if(this.f == 0 && (this.a[v12 >> 3] >> ((v12 & 7) << 3) & 0xFFL) != 0xFEL) {
                    int v14 = this.d;
                    if(v14 > 8) {
                        v13 = (long)(v2 & 0x7F);
                        if(Long.compare(((long)this.e) * 0x20L ^ 0x8000000000000000L, ((long)v14) * 25L ^ 0x8000000000000000L) <= 0) {
                            long[] arr_v = this.a;
                            int v15 = this.d;
                            long[] arr_v1 = this.b;
                            Object[] arr_object = this.c;
                            H.a(arr_v, v15);
                            int v16 = -1;
                            int v17 = 0;
                            while(v17 != v15) {
                                int v18 = (v17 & 7) << 3;
                                long v19 = arr_v[v17 >> 3] >> v18 & 0xFFL;
                                if(v19 == 0x80L) {
                                    int v20 = v17;
                                    ++v17;
                                    v16 = v20;
                                }
                                else if(v19 == 0xFEL) {
                                    long v21 = arr_v1[v17];
                                    int v22 = ((int)(v21 ^ v21 >>> 0x20)) * 0xCC9E2D51;
                                    int v23 = v22 ^ v22 << 16;
                                    int v24 = this.d(v23 >>> 7);
                                    int v25 = v23 >>> 7 & v15;
                                    if((v24 - v25 & v15) / 8 == (v17 - v25 & v15) / 8) {
                                        arr_v[v17 >> 3] = ((long)(v23 & 0x7F)) << v18 | arr_v[v17 >> 3] & ~(0xFFL << v18);
                                        arr_v[arr_v.length - 1] = arr_v[0] & 0xFFFFFFFFFFFFFFL | 0x8000000000000000L;
                                        ++v17;
                                        v16 = v16;
                                    }
                                    else {
                                        int v26 = v17;
                                        long v27 = arr_v[v24 >> 3];
                                        int v28 = (v24 & 7) << 3;
                                        if((v27 >> v28 & 0xFFL) == 0x80L) {
                                            v29 = v3;
                                            arr_v[v24 >> 3] = v27 & ~(0xFFL << v28) | ((long)(v23 & 0x7F)) << v28;
                                            arr_v[v17 >> 3] = arr_v[v17 >> 3] & ~(0xFFL << v18) | 0x80L << v18;
                                            arr_v1[v24] = arr_v1[v26];
                                            arr_v1[v26] = 0L;
                                            arr_object[v24] = arr_object[v26];
                                            arr_object[v26] = null;
                                            arr_v2 = arr_v;
                                            v30 = v26;
                                        }
                                        else {
                                            v29 = v3;
                                            arr_v2 = arr_v;
                                            arr_v2[v24 >> 3] = v27 & ~(0xFFL << v28) | ((long)(v23 & 0x7F)) << v28;
                                            int v31 = v16 == -1 ? H.b(arr_v2, v26 + 1, v15) : v16;
                                            arr_v1[v31] = arr_v1[v24];
                                            arr_v1[v24] = arr_v1[v26];
                                            arr_v1[v26] = arr_v1[v31];
                                            arr_object[v31] = arr_object[v24];
                                            arr_object[v24] = arr_object[v26];
                                            arr_object[v26] = arr_object[v31];
                                            v30 = v26 - 1;
                                            v26 = v31;
                                        }
                                        arr_v2[arr_v2.length - 1] = arr_v2[0] & 0xFFFFFFFFFFFFFFL | 0x8000000000000000L;
                                        v17 = v30 + 1;
                                        arr_v = arr_v2;
                                        v16 = v26;
                                        v3 = v29;
                                    }
                                }
                                else {
                                    ++v17;
                                }
                            }
                            v32 = v3;
                            this.f = H.c(this.d) - this.e;
                        }
                        else {
                            v32 = v3;
                            goto label_93;
                        }
                    }
                    else {
                        v32 = v3;
                        v13 = (long)(v2 & 0x7F);
                    label_93:
                        long[] arr_v3 = this.a;
                        long[] arr_v4 = this.b;
                        Object[] arr_object1 = this.c;
                        int v33 = this.d;
                        this.f(H.d(this.d));
                        long[] arr_v5 = this.a;
                        long[] arr_v6 = this.b;
                        Object[] arr_object2 = this.c;
                        int v34 = this.d;
                        for(int v35 = 0; v35 < v33; ++v35) {
                            if((arr_v3[v35 >> 3] >> ((v35 & 7) << 3) & 0xFFL) < 0x80L) {
                                long v36 = arr_v4[v35];
                                int v37 = ((int)(v36 ^ v36 >>> 0x20)) * 0xCC9E2D51;
                                int v38 = v37 ^ v37 << 16;
                                int v39 = this.d(v38 >>> 7);
                                int v40 = (v39 & 7) << 3;
                                long v41 = arr_v5[v39 >> 3] & ~(0xFFL << v40) | ((long)(v38 & 0x7F)) << v40;
                                arr_v5[v39 >> 3] = v41;
                                arr_v5[(v39 - 7 & v34) + (v34 & 7) >> 3] = v41;
                                arr_v6[v39] = v36;
                                arr_object2[v39] = arr_object1[v35];
                            }
                        }
                    }
                    v12 = this.d(v32);
                }
                else {
                    v13 = (long)(v2 & 0x7F);
                }
                int v42 = 1;
                ++this.e;
                int v43 = this.f;
                long[] arr_v7 = this.a;
                long v44 = arr_v7[v12 >> 3];
                int v45 = (v12 & 7) << 3;
                if((v44 >> v45 & 0xFFL) != 0x80L) {
                    v42 = 0;
                }
                this.f = v43 - v42;
                int v46 = this.d;
                long v47 = v44 & ~(0xFFL << v45) | v13 << v45;
                arr_v7[v12 >> 3] = v47;
                arr_v7[(v12 - 7 & v46) + (v46 & 7) >> 3] = v47;
                return v12;
            }
            v6 += 8;
            v5 = v5 + v6 & v4;
        }
    }

    public final int d(int v) {
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

    public final Object e(long v) {
        int v1 = ((int)(v ^ v >>> 0x20)) * 0xCC9E2D51;
        int v2 = v1 ^ v1 << 16;
        int v3 = this.d;
        int v4 = v2 >>> 7 & v3;
        int v5 = 0;
        while(true) {
            int v6 = (v4 & 7) << 3;
            long v7 = this.a[(v4 >> 3) + 1] << 0x40 - v6 & -((long)v6) >> 0x3F | this.a[v4 >> 3] >>> v6;
            long v8 = ((long)(v2 & 0x7F)) * 0x101010101010101L ^ v7;
            for(long v9 = ~v8 & v8 - 0x101010101010101L & 0x8080808080808080L; v9 != 0L; v9 &= v9 - 1L) {
                int v10 = (Long.numberOfTrailingZeros(v9) >> 3) + v4 & v3;
                if(this.b[v10] == v) {
                    return v10 < 0 ? null : this.c[v10];
                }
            }
            if((v7 & ~v7 << 6 & 0x8080808080808080L) != 0L) {
                return null;
            }
            v5 += 8;
            v4 = v4 + v5 & v3;
        }
    }

    @Override
    public final boolean equals(Object object0) {
        int v6;
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof v)) {
            return false;
        }
        if(((v)object0).e != this.e) {
            return false;
        }
        long[] arr_v = this.b;
        Object[] arr_object = this.c;
        long[] arr_v1 = this.a;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v1[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; v4 = v6 + 1) {
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            v6 = v4;
                            long v7 = arr_v[v5];
                            Object object1 = arr_object[v5];
                            if(object1 == null) {
                                if(((v)object0).e(v7) != null || !((v)object0).b(v7)) {
                                    return false;
                                }
                            }
                            else if(!object1.equals(((v)object0).e(v7))) {
                                return false;
                            }
                        }
                        else {
                            v6 = v4;
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_32;
                    }
                    break;
                }
            label_32:
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
            Bb.n.p0(arr_v);
        }
        this.a = arr_v;
        arr_v[v1 >> 3] |= 0xFFL << ((v1 & 7) << 3);
        this.f = H.c(this.d) - this.e;
        this.b = new long[v1];
        this.c = new Object[v1];
    }

    public final void g(long v, Object object0) {
        int v1 = this.c(v);
        this.b[v1] = v;
        this.c[v1] = object0;
    }

    @Override
    public final int hashCode() {
        long[] arr_v = this.b;
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
                            long v7 = arr_v[v6];
                            Object object0 = arr_object[v6];
                            v2 += (object0 == null ? 0 : object0.hashCode()) ^ ((int)(v7 ^ v7 >>> 0x20));
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
        int v9;
        int v7;
        if(this.e == 0) {
            return "{}";
        }
        StringBuilder stringBuilder0 = new StringBuilder("{");
        long[] arr_v = this.b;
        Object[] arr_object = this.c;
        long[] arr_v1 = this.a;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v2 = 0;
            for(int v1 = 0; true; v1 = v9 + 1) {
                long v3 = arr_v1[v1];
                if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v4 = 8 - (~(v1 - v) >>> 0x1F);
                    int v5 = 0;
                    while(v5 < v4) {
                        if((0xFFL & v3) < 0x80L) {
                            int v6 = (v1 << 3) + v5;
                            v7 = v1;
                            long v8 = arr_v[v6];
                            Object object0 = arr_object[v6];
                            stringBuilder0.append(v8);
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
                v9 = v1;
                if(v9 == v) {
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

