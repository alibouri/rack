package t8;

import java.util.Arrays;
import r8.e;
import r8.l;
import v.h;
import x8.b;
import z8.c;

public final class a {
    public s8.a a;
    public static final String[] b;
    public static final String[] c;
    public static final String[] d;
    public static final String[] e;
    public static final String[] f;

    static {
        a.b = new String[]{"CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
        a.c = new String[]{"CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
        a.d = new String[]{"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000B", "\f", "\r", "\u001B", "\u001C", "\u001D", "\u001E", "\u001F", "@", "\\", "^", "_", "`", "|", "~", "\u007F", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};
        a.e = new String[]{"", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "\'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};
        a.f = new String[]{"CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};
    }

    public final m7.a a(s8.a a0) {
        String s;
        int v38;
        int v25;
        int v24;
        int v19;
        z8.a a2;
        int v9;
        this.a = a0;
        b b0 = a0.a;
        boolean z = a0.c;
        int v = a0.e;
        int v1 = (z ? 11 : 14) + (v << 2);
        int[] arr_v = new int[v1];
        int v2 = ((z ? 88 : 0x70) + (v << 4)) * v;
        boolean[] arr_z = new boolean[v2];
        if(z) {
            for(int v3 = 0; v3 < v1; ++v3) {
                arr_v[v3] = v3;
            }
        }
        else {
            int v4 = ((v1 / 2 - 1) / 15 * 2 + (v1 + 1)) / 2;
            for(int v5 = 0; v5 < v1 / 2; ++v5) {
                int v6 = v5 / 15 + v5;
                arr_v[v1 / 2 - v5 - 1] = v4 - v6 - 1;
                arr_v[v1 / 2 + v5] = v4 + v6 + 1;
            }
        }
        int v7 = 0;
        int v8 = 0;
        while(true) {
            v9 = 12;
            if(v7 >= v) {
                break;
            }
            if(z) {
                v9 = 9;
            }
            int v10 = (v - v7 << 2) + v9;
            int v11 = v1 - 1 - (v7 << 1);
            int v12 = 0;
            while(v12 < v10) {
                int v13 = 0;
                while(v13 < 2) {
                    int v14 = (v7 << 1) + v13;
                    int v15 = (v7 << 1) + v12;
                    arr_z[v8 + (v12 << 1) + v13] = b0.c(arr_v[v14], arr_v[v15]);
                    int v16 = v11 - v13;
                    arr_z[v10 * 2 + v8 + (v12 << 1) + v13] = b0.c(arr_v[v15], arr_v[v16]);
                    int v17 = v11 - v12;
                    arr_z[v10 * 4 + v8 + (v12 << 1) + v13] = b0.c(arr_v[v16], arr_v[v17]);
                    arr_z[v10 * 6 + v8 + (v12 << 1) + v13] = b0.c(arr_v[v17], arr_v[v14]);
                    ++v13;
                    v = v;
                }
                ++v12;
                v = v;
            }
            v8 += v10 << 3;
            ++v7;
            v = v;
        }
        s8.a a1 = this.a;
        int v18 = a1.e;
        if(v18 <= 2) {
            a2 = z8.a.j;
            v19 = 6;
        }
        else if(v18 <= 8) {
            a2 = z8.a.n;
            v19 = 8;
        }
        else {
            if(v18 <= 22) {
                a2 = z8.a.i;
                v9 = 10;
            }
            else {
                a2 = z8.a.h;
            }
            v19 = v9;
        }
        int v20 = v2 / v19;
        int v21 = a1.d;
        if(v20 < v21) {
            throw e.a();
        }
        int v22 = v2 % v19;
        int[] arr_v1 = new int[v20];
        int v23 = 0;
        while(v23 < v20) {
            arr_v1[v23] = a.b(arr_z, v22, v19);
            ++v23;
            v22 += v19;
        }
        try {
            new g.a(28, a2).t(arr_v1, v20 - v21);
            v24 = 0;
            v25 = 0;
        }
        catch(c c0) {
            throw l.X ? new e(c0) : e.Z;  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V
        }
        while(v24 < v21) {
            int v26 = arr_v1[v24];
            if(v26 == 0 || v26 == (1 << v19) - 1) {
                throw e.a();
            }
            if(v26 == 1 || v26 == (1 << v19) - 2) {
                ++v25;
            }
            ++v24;
        }
        int v27 = v21 * v19 - v25;
        boolean[] arr_z1 = new boolean[v27];
        int v29 = 0;
        for(int v28 = 0; v28 < v21; ++v28) {
            int v30 = arr_v1[v28];
            if(v30 == 1 || v30 == (1 << v19) - 2) {
                Arrays.fill(arr_z1, v29, v29 + v19 - 1, v30 > 1);
                v29 = v19 - 1 + v29;
            }
            else {
                int v31 = v19 - 1;
                while(v31 >= 0) {
                    arr_z1[v29] = (v30 & 1 << v31) != 0;
                    --v31;
                    ++v29;
                }
            }
        }
        int v32 = (v27 + 7) / 8;
        byte[] arr_b = new byte[v32];
        for(int v33 = 0; v33 < v32; ++v33) {
            int v34 = v27 - (v33 << 3);
            arr_b[v33] = v34 < 8 ? ((byte)(a.b(arr_z1, v33 << 3, v34) << 8 - v34)) : ((byte)a.b(arr_z1, v33 << 3, 8));
        }
        StringBuilder stringBuilder0 = new StringBuilder(20);
        int v35 = 0;
        int v36 = 1;
        int v37 = 1;
    label_124:
        while(v35 < v27) {
            switch(v36) {
                case 4: {
                    v38 = 4;
                label_129:
                    if(v27 - v35 < v38) {
                        break label_124;
                    }
                    int v39 = a.b(arr_z1, v35, v38);
                    v35 += v38;
                    switch(h.d(v36)) {
                        case 0: {
                            goto label_142;
                        }
                        case 1: {
                            s = a.c[v39];
                            goto label_143;
                        }
                        case 2: {
                            s = a.d[v39];
                            goto label_143;
                        }
                        case 3: {
                            s = a.f[v39];
                            goto label_143;
                        }
                        case 4: {
                            s = a.e[v39];
                            goto label_143;
                        }
                    }
                    throw new IllegalStateException("Bad table");
                label_142:
                    s = a.b[v39];
                label_143:
                    if(s.startsWith("CTRL_")) {
                        int v40 = s.charAt(5);
                        switch(v40) {
                            case 66: {
                                v37 = 6;
                                goto label_158;
                            }
                            case 68: {
                                v37 = 4;
                                goto label_158;
                            }
                            case 76: {
                                v37 = 2;
                                goto label_158;
                            }
                            case 80: {
                                goto label_157;
                            }
                        }
                        v37 = v40 == 77 ? 3 : 1;
                        goto label_158;
                    label_157:
                        v37 = 5;
                    label_158:
                        if(s.charAt(6) != 76) {
                            int v41 = v37;
                            v37 = v36;
                            v36 = v41;
                            continue;
                        }
                    }
                    else {
                        stringBuilder0.append(s);
                    }
                    goto label_183;
                }
                case 6: {
                    break;
                }
                default: {
                    v38 = 5;
                    goto label_129;
                }
            }
            if(v27 - v35 < 5) {
                break;
            }
            int v42 = a.b(arr_z1, v35, 5);
            int v43 = v35 + 5;
            if(v42 == 0) {
                if(v27 - v43 < 11) {
                    break;
                }
                v42 = a.b(arr_z1, v43, 11) + 0x1F;
                v43 = v35 + 16;
            }
            int v44 = 0;
            while(true) {
                if(v44 < v42) {
                    if(v27 - v43 < 8) {
                        v35 = v27;
                        break;
                    }
                    else {
                        stringBuilder0.append(((char)a.b(arr_z1, v43, 8)));
                        v43 += 8;
                        ++v44;
                        continue;
                    }
                }
                v35 = v43;
                break;
            }
        label_183:
            v36 = v37;
        }
        return new m7.a(arr_b, stringBuilder0.toString(), null, null);
    }

    public static int b(boolean[] arr_z, int v, int v1) {
        int v2 = 0;
        for(int v3 = v; v3 < v + v1; ++v3) {
            v2 <<= 1;
            v2 = arr_z[v3] ? v2 | 1 : v2 << 1;
        }
        return v2;
    }
}

