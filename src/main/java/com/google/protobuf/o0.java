package com.google.protobuf;

public final class o0 extends c0 {
    public final int c;

    public o0(int v) {
        this.c = v;
        super();
    }

    @Override  // com.google.protobuf.c0
    public final int a(String s, byte[] arr_b, int v, int v1) {
        if(this.c != 0) {
            long v2 = (long)v;
            long v3 = ((long)v1) + v2;
            int v4 = s.length();
            if(v4 > v1 || arr_b.length - v1 < v) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + s.charAt(v4 - 1) + " at index " + (v + v1));
            }
            int v5 = 0;
            while(v5 < v4) {
                int v6 = s.charAt(v5);
                if(v6 >= 0x80) {
                    break;
                }
                n0.k(arr_b, v2, ((byte)v6));
                ++v5;
                v2 = 1L + v2;
            }
            if(v5 != v4) {
                while(v5 < v4) {
                    int v7 = s.charAt(v5);
                    if(v7 < 0x80 && v2 < v3) {
                        n0.k(arr_b, v2, ((byte)v7));
                        ++v2;
                    }
                    else if(v7 < 0x800 && v2 <= v3 - 2L) {
                        long v8 = v2 + 1L;
                        n0.k(arr_b, v2, ((byte)(v7 >>> 6 | 960)));
                        v2 += 2L;
                        n0.k(arr_b, v8, ((byte)(v7 & 0x3F | 0x80)));
                    }
                    else if(v7 >= 0xD800 && 0xDFFF >= v7 || v2 > v3 - 3L) {
                        if(v2 > v3 - 4L) {
                            goto label_49;
                        }
                        if(v5 + 1 == v4) {
                            throw new p0(v5 - 1, v4);
                        }
                        int v10 = s.charAt(v5 + 1);
                        if(!Character.isSurrogatePair(((char)v7), ((char)v10))) {
                            goto label_47;
                        }
                        int v11 = Character.toCodePoint(((char)v7), ((char)v10));
                        n0.k(arr_b, v2, ((byte)(v11 >>> 18 | 0xF0)));
                        n0.k(arr_b, v2 + 1L, ((byte)(v11 >>> 12 & 0x3F | 0x80)));
                        long v12 = 3L + v2;
                        n0.k(arr_b, v2 + 2L, ((byte)(v11 >>> 6 & 0x3F | 0x80)));
                        v2 += 4L;
                        n0.k(arr_b, v12, ((byte)(v11 & 0x3F | 0x80)));
                        ++v5;
                    }
                    else {
                        n0.k(arr_b, v2, ((byte)(v7 >>> 12 | 480)));
                        long v9 = v2 + 2L;
                        n0.k(arr_b, v2 + 1L, ((byte)(v7 >>> 6 & 0x3F | 0x80)));
                        v2 += 3L;
                        n0.k(arr_b, v9, ((byte)(v7 & 0x3F | 0x80)));
                    }
                    ++v5;
                    continue;
                label_47:
                    ++v5;
                    throw new p0(v5 - 1, v4);
                label_49:
                    if(!(0xD800 <= v7 && v7 <= 0xDFFF && (v5 + 1 == v4 || !Character.isSurrogatePair(((char)v7), s.charAt(v5 + 1))))) {
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char)v7) + " at index " + v2);
                    }
                    throw new p0(v5, v4);
                }
            }
            return (int)v2;
        }
        int v13 = s.length();
        int v14 = v1 + v;
        int v15;
        for(v15 = 0; v15 < v13; ++v15) {
            int v16 = v15 + v;
            if(v16 >= v14) {
                break;
            }
            int v17 = s.charAt(v15);
            if(v17 >= 0x80) {
                break;
            }
            arr_b[v16] = (byte)v17;
        }
        if(v15 == v13) {
            return v + v13;
        }
        int v18 = v + v15;
        while(v15 < v13) {
            int v19 = s.charAt(v15);
            if(v19 < 0x80 && v18 < v14) {
                arr_b[v18] = (byte)v19;
                ++v18;
            }
            else if(v19 < 0x800 && v18 <= v14 - 2) {
                int v20 = v18 + 1;
                arr_b[v18] = (byte)(v19 >>> 6 | 960);
                v18 += 2;
                arr_b[v20] = (byte)(v19 & 0x3F | 0x80);
            }
            else if(v19 >= 0xD800 && 0xDFFF >= v19 || v18 > v14 - 3) {
                if(v18 > v14 - 4) {
                    goto label_103;
                }
                if(v15 + 1 == s.length()) {
                    throw new p0(v15 - 1, v13);
                }
                int v22 = s.charAt(v15 + 1);
                if(!Character.isSurrogatePair(((char)v19), ((char)v22))) {
                    goto label_101;
                }
                int v23 = Character.toCodePoint(((char)v19), ((char)v22));
                arr_b[v18] = (byte)(v23 >>> 18 | 0xF0);
                arr_b[v18 + 1] = (byte)(v23 >>> 12 & 0x3F | 0x80);
                int v24 = v18 + 3;
                arr_b[v18 + 2] = (byte)(v23 >>> 6 & 0x3F | 0x80);
                v18 += 4;
                arr_b[v24] = (byte)(v23 & 0x3F | 0x80);
                ++v15;
            }
            else {
                arr_b[v18] = (byte)(v19 >>> 12 | 480);
                int v21 = v18 + 2;
                arr_b[v18 + 1] = (byte)(v19 >>> 6 & 0x3F | 0x80);
                v18 += 3;
                arr_b[v21] = (byte)(v19 & 0x3F | 0x80);
            }
            ++v15;
            continue;
        label_101:
            ++v15;
            throw new p0(v15 - 1, v13);
        label_103:
            if(!(0xD800 <= v19 && v19 <= 0xDFFF && (v15 + 1 == s.length() || !Character.isSurrogatePair(((char)v19), s.charAt(v15 + 1))))) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char)v19) + " at index " + v18);
            }
            throw new p0(v15, v13);
        }
        return v18;
    }

    @Override  // com.google.protobuf.c0
    public final int c(byte[] arr_b, int v, int v1) {
        int v8;
        int v4;
        int v2 = v;
        if(this.c != 0) {
            if((arr_b.length - v1 | (v2 | v1)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", ((int)arr_b.length), v, v1));
            }
            int v3 = (int)(((long)v1) - ((long)v2));
            if(v3 < 16) {
                v4 = 0;
            }
            else {
                long v5 = (long)v2;
                v4 = 0;
            alab1:
                while(true) {
                    if(v4 >= 8 - (((int)(((long)v2))) & 7)) {
                        while(v4 + 8 <= v3 && (n0.c.h(n0.f + v5, arr_b) & 0x8080808080808080L) == 0L) {
                            v5 += 8L;
                            v4 += 8;
                        }
                        while(v4 < v3) {
                            if(n0.g(arr_b, v5) < 0) {
                                break alab1;
                            }
                            ++v4;
                            ++v5;
                        }
                        v4 = v3;
                        break;
                    }
                    if(n0.g(arr_b, v5) < 0) {
                        break;
                    }
                    ++v4;
                    ++v5;
                }
            }
            int v6 = v3 - v4;
            long v7 = ((long)v2) + ((long)v4);
        alab2:
            while(true) {
                while(true) {
                label_27:
                    v8 = 0;
                    while(v6 > 0) {
                        v8 = n0.g(arr_b, v7);
                        if(v8 >= 0) {
                            --v6;
                            ++v7;
                        }
                        else {
                            ++v7;
                            if(true) {
                                break;
                            }
                        }
                    }
                    if(v6 == 0) {
                        return 0;
                    }
                    if(v8 < 0xFFFFFFE0) {
                        if(v6 - 1 == 0) {
                            return v8;
                        }
                        v6 += -2;
                        if(v8 >= -62 && n0.g(arr_b, v7) <= -65) {
                            ++v7;
                            continue;
                        }
                        return -1;
                    }
                    if(v8 < -16) {
                        if(v6 - 1 < 2) {
                            return o0.d(v7, arr_b, v8, v6 - 1);
                        }
                        v6 += -3;
                        int v9 = n0.g(arr_b, v7);
                        if(v9 > -65 || v8 == 0xFFFFFFE0 && v9 < 0xFFFFFFA0) {
                            break alab2;
                        }
                        long v10 = v7 + 1L;
                        if(v8 == -19 && v9 >= 0xFFFFFFA0) {
                            break alab2;
                        }
                        v7 += 2L;
                        if(n0.g(arr_b, v10) <= -65) {
                            continue;
                        }
                        break;
                    }
                    goto label_57;
                }
                return -1;
            label_57:
                if(v6 - 1 < 3) {
                    return o0.d(v7, arr_b, v8, v6 - 1);
                }
                v6 += -4;
                int v11 = n0.g(arr_b, v7);
                if(v11 > -65 || v11 + 0x70 + (v8 << 28) >> 30 != 0) {
                    break;
                }
                long v12 = 2L + v7;
                if(n0.g(arr_b, v7 + 1L) > -65) {
                    break;
                }
                v7 += 3L;
                if(n0.g(arr_b, v12) <= -65) {
                    goto label_27;
                }
                break;
            }
            return -1;
        }
        while(v2 < v1 && arr_b[v2] >= 0) {
            ++v2;
        }
        if(v2 < v1) {
            while(v2 < v1) {
                int v13 = v2 + 1;
                int v14 = arr_b[v2];
                if(v14 < 0) {
                    if(v14 < 0xFFFFFFE0) {
                        if(v13 >= v1) {
                            return v14;
                        }
                        if(v14 >= -62) {
                            v2 += 2;
                            if(arr_b[v13] <= -65) {
                                continue;
                            }
                            return -1;
                        }
                    }
                    else if(v14 < -16) {
                        if(v13 >= v1 - 1) {
                            return q0.a(arr_b, v13, v1);
                        }
                        int v15 = v2 + 2;
                        int v16 = arr_b[v13];
                        if(v16 <= -65 && (v14 != 0xFFFFFFE0 || v16 >= 0xFFFFFFA0) && (v14 != -19 || v16 < 0xFFFFFFA0)) {
                            v2 += 3;
                            if(arr_b[v15] <= -65) {
                                continue;
                            }
                            return -1;
                        }
                    }
                    else {
                        if(v13 >= v1 - 2) {
                            return q0.a(arr_b, v13, v1);
                        }
                        int v17 = arr_b[v13];
                        if(v17 <= -65 && v17 + 0x70 + (v14 << 28) >> 30 == 0) {
                            int v18 = v2 + 3;
                            if(arr_b[v2 + 2] <= -65) {
                                v2 += 4;
                                if(arr_b[v18] > -65) {
                                    return -1;
                                }
                                continue;
                            }
                        }
                    }
                    return -1;
                }
                v2 = v13;
            }
        }
        return 0;
    }

    public static int d(long v, byte[] arr_b, int v1, int v2) {
        switch(v2) {
            case 0: {
                return v1 <= -12 ? v1 : -1;
            }
            case 1: {
                return q0.c(v1, n0.g(arr_b, v));
            }
            case 2: {
                return q0.d(v1, n0.g(arr_b, v), n0.g(arr_b, v + 1L));
            }
            default: {
                throw new AssertionError();
            }
        }
    }
}

