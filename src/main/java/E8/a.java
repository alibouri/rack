package E8;

import F8.b;
import io.sentry.g1;
import java.text.DecimalFormat;
import java.util.EnumMap;
import r8.c;
import r8.e;
import r8.i;
import r8.k;
import r8.m;
import r8.n;
import r8.o;

public final class a implements k {
    public final b a;
    public static final o[] b;

    static {
        a.b = new o[0];
    }

    public a() {
        this.a = new b(0);
    }

    @Override  // r8.k
    public final m a(g1 g10, EnumMap enumMap0) {
        String s;
        byte[] arr_b1;
        if(enumMap0 == null || !enumMap0.containsKey(c.Y)) {
            throw i.Z;
        }
        x8.b b0 = g10.r();
        int v = b0.X;
        int v1 = b0.Y;
        int v3 = -1;
        int v4 = -1;
        int v5 = v1;
        for(int v2 = 0; v2 < v1; ++v2) {
            for(int v6 = 0; true; ++v6) {
                int v7 = b0.Z;
                if(v6 >= v7) {
                    break;
                }
                int v8 = b0.b0[v7 * v2 + v6];
                if(v8 != 0) {
                    if(v2 < v5) {
                        v5 = v2;
                    }
                    if(v2 > v3) {
                        v3 = v2;
                    }
                    if(v6 << 5 < v) {
                        int v9;
                        for(v9 = 0; v8 << 0x1F - v9 == 0; ++v9) {
                        }
                        int v10 = (v6 << 5) + v9;
                        if(v10 < v) {
                            v = v10;
                        }
                    }
                    if((v6 << 5) + 0x1F > v4) {
                        int v11;
                        for(v11 = 0x1F; v8 >>> v11 == 0; --v11) {
                        }
                        int v12 = (v6 << 5) + v11;
                        if(v12 > v4) {
                            v4 = v12;
                        }
                    }
                }
            }
        }
        int[] arr_v = v4 < v || v3 < v5 ? null : new int[]{v, v5, v4 - v + 1, v3 - v5 + 1};
        if(arr_v == null) {
            throw i.Z;
        }
        int v13 = arr_v[0];
        int v14 = arr_v[1];
        int v15 = arr_v[2];
        int v16 = arr_v[3];
        int[] arr_v1 = new int[33];
        for(int v17 = 0; v17 < 33; ++v17) {
            for(int v18 = 0; v18 < 30; ++v18) {
                if(b0.c(((v17 & 1) * v15 / 2 + (v15 / 2 + v18 * v15)) / 30 + v13, (v16 / 2 + v17 * v16) / 33 + v14)) {
                    int v19 = v18 / 0x20 + v17;
                    arr_v1[v19] |= 1 << (v18 & 0x1F);
                }
            }
        }
        b b1 = this.a;
        b1.getClass();
        byte[] arr_b = new byte[0x90];
        for(int v20 = 0; v20 < 33; ++v20) {
            int[] arr_v2 = F8.a.a[v20];
            for(int v21 = 0; v21 < 30; ++v21) {
                int v22 = arr_v2[v21];
                if(v22 >= 0 && (arr_v1[v21 / 0x20 + v20] >>> (v21 & 0x1F) & 1) != 0) {
                    arr_b[v22 / 6] = (byte)(arr_b[v22 / 6] | ((byte)(1 << 5 - v22 % 6)));
                }
            }
        }
        b1.a(arr_b, 0, 10, 10, 0);
        int v23 = arr_b[0] & 15;
        switch(v23) {
            case 2: 
            case 3: 
            case 4: {
                b1.a(arr_b, 20, 84, 40, 1);
                b1.a(arr_b, 20, 84, 40, 2);
                arr_b1 = new byte[94];
                break;
            }
            case 5: {
                b1.a(arr_b, 20, 68, 56, 1);
                b1.a(arr_b, 20, 68, 56, 2);
                arr_b1 = new byte[78];
                break;
            }
            default: {
                throw e.a();
            }
        }
        System.arraycopy(arr_b, 0, arr_b1, 0, 10);
        System.arraycopy(arr_b, 20, arr_b1, 10, arr_b1.length - 10);
        StringBuilder stringBuilder0 = new StringBuilder(0x90);
        switch(v23) {
            case 2: 
            case 3: {
                if(v23 == 2) {
                    int v24 = F8.a.a(arr_b1, new byte[]{33, 34, 35, 36, 25, 26, 27, 28, 29, 30, 19, 20, 21, 22, 23, 24, 13, 14, 15, 16, 17, 18, 7, 8, 9, 10, 11, 12, 1, 2});
                    s = new DecimalFormat("0000000000".substring(0, F8.a.a(arr_b1, new byte[]{39, 40, 41, 42, 0x1F, 0x20}))).format(((long)v24));
                }
                else {
                    s = String.valueOf(new char[]{F8.a.b[0].charAt(F8.a.a(arr_b1, new byte[]{39, 40, 41, 42, 0x1F, 0x20})), F8.a.b[0].charAt(F8.a.a(arr_b1, new byte[]{33, 34, 35, 36, 25, 26})), F8.a.b[0].charAt(F8.a.a(arr_b1, new byte[]{27, 28, 29, 30, 19, 20})), F8.a.b[0].charAt(F8.a.a(arr_b1, new byte[]{21, 22, 23, 24, 13, 14})), F8.a.b[0].charAt(F8.a.a(arr_b1, new byte[]{15, 16, 17, 18, 7, 8})), F8.a.b[0].charAt(F8.a.a(arr_b1, new byte[]{9, 10, 11, 12, 1, 2}))});
                }
                DecimalFormat decimalFormat0 = new DecimalFormat("000");
                String s1 = decimalFormat0.format(((long)F8.a.a(arr_b1, new byte[]{53, 54, 43, 44, 45, 46, 0x2F, 0x30, 37, 38})));
                String s2 = decimalFormat0.format(((long)F8.a.a(arr_b1, new byte[]{55, 56, 57, 58, 59, 60, 49, 50, 51, 52})));
                stringBuilder0.append(F8.a.b(arr_b1, 10, 84));
                if(stringBuilder0.toString().startsWith("[)>\u001E01\u001D")) {
                    stringBuilder0.insert(9, s + '\u001D' + s1 + '\u001D' + s2 + '\u001D');
                }
                else {
                    stringBuilder0.insert(0, s + '\u001D' + s1 + '\u001D' + s2 + '\u001D');
                }
                break;
            }
            case 4: {
                stringBuilder0.append(F8.a.b(arr_b1, 1, 93));
                break;
            }
            case 5: {
                stringBuilder0.append(F8.a.b(arr_b1, 1, 77));
            }
        }
        String s3 = String.valueOf(v23);
        m m0 = new m(stringBuilder0.toString(), arr_b1, a.b, r8.a.h0);
        if(s3 != null) {
            m0.b(n.Z, s3);
        }
        return m0;
    }

    @Override  // r8.k
    public final void reset() {
    }
}

