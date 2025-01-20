package s;

import Bb.n;
import Nb.j;
import java.util.NoSuchElementException;
import t.a;

public final class y {
    public long[] a;
    public Object[] b;
    public int[] c;
    public int d;
    public int e;
    public int f;

    public y() {
        this(6);
    }

    public y(int v) {
        this.a = H.a;
        this.b = a.c;
        this.c = k.a;
        if(v >= 0) {
            this.d(H.f(v));
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

    public final int b(Object object0) {
        long v13;
        long v26;
        Object[] arr_object3;
        long[] arr_v6;
        int v = object0 == null ? 0 : object0.hashCode();
        int v1 = v * 0xCC9E2D51 ^ v * 0xCC9E2D51 << 16;
        int v2 = v1 & 0x7F;
        int v3 = this.d;
        int v4 = v1 >>> 7 & v3;
        int v5 = 0;
        while(true) {
            int v6 = (v4 & 7) << 3;
            long v7 = this.a[(v4 >> 3) + 1] << 0x40 - v6 & -((long)v6) >> 0x3F | this.a[v4 >> 3] >>> v6;
            long v8 = (long)v2;
            long v9 = v7 ^ v8 * 0x101010101010101L;
            for(long v10 = ~v9 & v9 - 0x101010101010101L & 0x8080808080808080L; v10 != 0L; v10 &= v10 - 1L) {
                int v11 = v4 + (Long.numberOfTrailingZeros(v10) >> 3) & v3;
                if(j.a(this.b[v11], object0)) {
                    return v11;
                }
            }
            if(Long.compare(~v7 << 6 & v7 & 0x8080808080808080L, 0L) != 0) {
                int v12 = this.a(v1 >>> 7);
                if(this.f == 0 && (this.a[v12 >> 3] >> ((v12 & 7) << 3) & 0xFFL) != 0xFEL) {
                    if(this.d <= 8 || Long.compare(((long)this.e) * 0x20L ^ 0x8000000000000000L, ((long)this.d) * 25L ^ 0x8000000000000000L) > 0) {
                        v13 = v8;
                        long[] arr_v2 = this.a;
                        Object[] arr_object1 = this.b;
                        int[] arr_v3 = this.c;
                        int v27 = this.d;
                        this.d(H.d(this.d));
                        long[] arr_v4 = this.a;
                        Object[] arr_object2 = this.b;
                        int[] arr_v5 = this.c;
                        int v28 = this.d;
                        int v29 = 0;
                        while(v29 < v27) {
                            if((arr_v2[v29 >> 3] >> ((v29 & 7) << 3) & 0xFFL) < 0x80L) {
                                Object object2 = arr_object1[v29];
                                int v30 = object2 == null ? 0 : object2.hashCode();
                                int v31 = v30 * 0xCC9E2D51 ^ v30 * 0xCC9E2D51 << 16;
                                int v32 = this.a(v31 >>> 7);
                                int v33 = (v32 & 7) << 3;
                                arr_v6 = arr_v2;
                                arr_object3 = arr_object1;
                                long v34 = arr_v4[v32 >> 3] & ~(0xFFL << v33) | ((long)(v31 & 0x7F)) << v33;
                                arr_v4[v32 >> 3] = v34;
                                arr_v4[(v32 - 7 & v28) + (v28 & 7) >> 3] = v34;
                                arr_object2[v32] = object2;
                                arr_v5[v32] = arr_v3[v29];
                            }
                            else {
                                arr_v6 = arr_v2;
                                arr_object3 = arr_object1;
                            }
                            ++v29;
                            arr_v2 = arr_v6;
                            arr_object1 = arr_object3;
                        }
                    }
                    else {
                        long[] arr_v = this.a;
                        int v14 = this.d;
                        Object[] arr_object = this.b;
                        int[] arr_v1 = this.c;
                        H.a(arr_v, v14);
                        int v15 = 0;
                        int v16 = -1;
                        while(v15 != v14) {
                            int v17 = (v15 & 7) << 3;
                            long v18 = arr_v[v15 >> 3] >> v17 & 0xFFL;
                            if(v18 == 0x80L) {
                                v16 = v15;
                                ++v15;
                            }
                            else if(v18 == 0xFEL) {
                                Object object1 = arr_object[v15];
                                int v19 = object1 == null ? 0 : object1.hashCode();
                                int v20 = v19 * 0xCC9E2D51 ^ v19 * 0xCC9E2D51 << 16;
                                int v21 = this.a(v20 >>> 7);
                                int v22 = v20 >>> 7 & v14;
                                if((v21 - v22 & v14) / 8 == (v15 - v22 & v14) / 8) {
                                    arr_v[v15 >> 3] = ((long)(v20 & 0x7F)) << v17 | arr_v[v15 >> 3] & ~(0xFFL << v17);
                                    arr_v[arr_v.length - 1] = arr_v[0] & 0xFFFFFFFFFFFFFFL | 0x8000000000000000L;
                                    ++v15;
                                }
                                else {
                                    int v23 = v15;
                                    long v24 = arr_v[v21 >> 3];
                                    int v25 = (v21 & 7) << 3;
                                    if((v24 >> v25 & 0xFFL) == 0x80L) {
                                        v26 = v8;
                                        arr_v[v21 >> 3] = ((long)(v20 & 0x7F)) << v25 | v24 & ~(0xFFL << v25);
                                        arr_v[v15 >> 3] = arr_v[v15 >> 3] & ~(0xFFL << v17) | 0x80L << v17;
                                        arr_object[v21] = arr_object[v23];
                                        arr_object[v23] = null;
                                        arr_v1[v21] = arr_v1[v23];
                                        arr_v1[v23] = 0;
                                        v16 = v23;
                                    }
                                    else {
                                        v26 = v8;
                                        arr_v[v21 >> 3] = ((long)(v20 & 0x7F)) << v25 | v24 & ~(0xFFL << v25);
                                        v16 = v16 == -1 ? H.b(arr_v, v23 + 1, v14) : v16;
                                        arr_object[v16] = arr_object[v21];
                                        arr_object[v21] = arr_object[v23];
                                        arr_object[v23] = arr_object[v16];
                                        arr_v1[v16] = arr_v1[v21];
                                        arr_v1[v21] = arr_v1[v23];
                                        arr_v1[v23] = arr_v1[v16];
                                        --v23;
                                    }
                                    arr_v[arr_v.length - 1] = arr_v[0] & 0xFFFFFFFFFFFFFFL | 0x8000000000000000L;
                                    v15 = v23 + 1;
                                    v8 = v26;
                                }
                            }
                            else {
                                ++v15;
                            }
                        }
                        v13 = v8;
                        this.f = H.c(this.d) - this.e;
                    }
                    v12 = this.a(v1 >>> 7);
                }
                else {
                    v13 = v8;
                }
                int v35 = 1;
                ++this.e;
                int v36 = this.f;
                long[] arr_v7 = this.a;
                long v37 = arr_v7[v12 >> 3];
                int v38 = (v12 & 7) << 3;
                if((v37 >> v38 & 0xFFL) != 0x80L) {
                    v35 = 0;
                }
                this.f = v36 - v35;
                int v39 = this.d;
                long v40 = v37 & ~(0xFFL << v38) | v13 << v38;
                arr_v7[v12 >> 3] = v40;
                arr_v7[(v12 - 7 & v39) + (v39 & 7) >> 3] = v40;
                return ~v12;
            }
            v5 += 8;
            v4 = v4 + v5 & v3;
            v2 = v2;
        }
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
        this.c = new int[v1];
    }

    public final void e(int v) {
        --this.e;
        long[] arr_v = this.a;
        int v1 = this.d;
        int v2 = (v & 7) << 3;
        long v3 = arr_v[v >> 3] & ~(0xFFL << v2) | 0xFEL << v2;
        arr_v[v >> 3] = v3;
        arr_v[(v - 7 & v1) + (v1 & 7) >> 3] = v3;
        this.b[v] = null;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof y)) {
            return false;
        }
        if(((y)object0).e != this.e) {
            return false;
        }
        Object[] arr_object = this.b;
        int[] arr_v = this.c;
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
                            Object object1 = arr_object[v5];
                            int v6 = arr_v[v5];
                            int v7 = ((y)object0).c(object1);
                            if(v7 < 0) {
                                throw new NoSuchElementException("There is no key " + object1 + " in the map");
                            }
                            if(v6 != ((y)object0).c[v7]) {
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

    public final void f(int v, Object object0) {
        int v1 = this.b(object0);
        if(v1 < 0) {
            v1 = ~v1;
        }
        this.b[v1] = object0;
        this.c[v1] = v;
    }

    @Override
    public final int hashCode() {
        Object[] arr_object = this.b;
        int[] arr_v = this.c;
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
                            Object object0 = arr_object[v6];
                            v2 += arr_v[v6] ^ (object0 == null ? 0 : object0.hashCode());
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
        int[] arr_v = this.c;
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
                            Object object0 = arr_object[v6];
                            int v7 = arr_v[v6];
                            if(object0 == this) {
                                object0 = "(this)";
                            }
                            stringBuilder0.append(object0);
                            stringBuilder0.append("=");
                            stringBuilder0.append(v7);
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

