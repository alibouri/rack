package L8;

import java.math.BigInteger;
import r8.e;
import v.h;

public abstract class d {
    public static final char[] a;
    public static final char[] b;
    public static final BigInteger[] c;

    static {
        d.a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}\'".toCharArray();
        d.b = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();
        BigInteger[] arr_bigInteger = new BigInteger[16];
        d.c = arr_bigInteger;
        arr_bigInteger[0] = BigInteger.ONE;
        BigInteger bigInteger0 = BigInteger.valueOf(900L);
        arr_bigInteger[1] = bigInteger0;
        for(int v = 2; true; ++v) {
            BigInteger[] arr_bigInteger1 = d.c;
            if(v >= arr_bigInteger1.length) {
                break;
            }
            arr_bigInteger1[v] = arr_bigInteger1[v - 1].multiply(bigInteger0);
        }
    }

    public static String a(int[] arr_v, int v) {
        BigInteger bigInteger0 = BigInteger.ZERO;
        for(int v1 = 0; v1 < v; ++v1) {
            bigInteger0 = bigInteger0.add(d.c[v - v1 - 1].multiply(BigInteger.valueOf(arr_v[v1])));
        }
        String s = bigInteger0.toString();
        if(s.charAt(0) != 49) {
            throw e.a();
        }
        return s.substring(1);
    }

    public static int b(int[] arr_v, int v, StringBuilder stringBuilder0) {
        int[] arr_v1 = new int[15];
        boolean z = false;
        int v1 = 0;
        while(true) {
            int v2 = arr_v[0];
            if(v >= v2 || z) {
                break;
            }
            int v3 = arr_v[v];
            if(v + 1 == v2) {
                z = true;
            }
            if(v3 < 900) {
                arr_v1[v1] = v3;
                ++v1;
            }
            else if(v3 == 900 || v3 == 901 || v3 == 0x3A0 || (v3 == 922 || v3 == 923 || v3 == 924)) {
                z = true;
                goto label_16;
            }
            ++v;
        label_16:
            if((v1 % 15 == 0 || v3 == 902 || z) && v1 > 0) {
                stringBuilder0.append(d.a(arr_v1, v1));
                v1 = 0;
            }
        }
        return v;
    }

    public static int c(int[] arr_v, int v, StringBuilder stringBuilder0) {
        int v11;
        int v1 = arr_v[0] - v << 1;
        int[] arr_v1 = new int[v1];
        int[] arr_v2 = new int[v1];
        int v2 = v;
        boolean z = false;
        int v3 = 0;
        while(v2 < arr_v[0] && !z) {
            int v4 = v2 + 1;
            int v5 = arr_v[v2];
            if(v5 < 900) {
                arr_v1[v3] = v5 / 30;
                arr_v1[v3 + 1] = v5 % 30;
                v3 += 2;
                v2 = v4;
            }
            else {
                switch(v5) {
                    case 900: {
                        arr_v1[v3] = 900;
                        ++v3;
                        v2 = v4;
                        break;
                    }
                    case 913: {
                        goto label_28;
                    }
                    case 901: 
                    case 902: 
                    case 0x3A0: {
                        z = true;
                        break;
                    }
                    default: {
                        if(v5 == 922 || v5 == 923 || v5 == 924) {
                            z = true;
                        }
                        else {
                            v2 = v4;
                        }
                    }
                }
            }
            continue;
        label_28:
            arr_v1[v3] = 913;
            v2 += 2;
            arr_v2[v3] = arr_v[v4];
            ++v3;
        }
        int v6 = 0;
        int v7 = 1;
        int v8 = 1;
        while(v6 < v3) {
            int v9 = arr_v1[v6];
            int v10 = h.d(v7);
        alab1:
            switch(v10) {
                case 0: {
                label_80:
                    if(v9 < 26) {
                        v11 = (char)(v9 + 65);
                        goto label_141;
                    }
                    else {
                        switch(v9) {
                            case 26: {
                                v11 = 0x20;
                                goto label_141;
                            }
                            case 27: {
                                v7 = 2;
                                break alab1;
                            }
                            case 28: {
                                v7 = 3;
                                break alab1;
                            }
                            case 29: {
                                v8 = v7;
                                v7 = 6;
                                break alab1;
                            }
                            case 900: {
                                v7 = 1;
                                break alab1;
                            }
                            case 913: {
                                stringBuilder0.append(((char)arr_v2[v6]));
                                break alab1;
                            }
                            default: {
                                break alab1;
                            }
                        }
                    }
                    goto label_98;
                }
                case 1: {
                label_98:
                    if(v9 < 26) {
                        v11 = (char)(v9 + 97);
                        goto label_141;
                    }
                    else {
                        switch(v9) {
                            case 26: {
                                v11 = 0x20;
                                goto label_141;
                            }
                            case 27: {
                                v8 = v7;
                                v11 = 0;
                                v7 = 5;
                                goto label_141;
                            }
                            case 28: {
                                v7 = 3;
                                break alab1;
                            }
                            case 29: {
                                v8 = v7;
                                v7 = 6;
                                break alab1;
                            }
                            case 900: {
                                v7 = 1;
                                break alab1;
                            }
                            case 913: {
                                stringBuilder0.append(((char)arr_v2[v6]));
                                break alab1;
                            }
                            default: {
                                break alab1;
                            }
                        }
                    }
                    goto label_118;
                }
                case 2: {
                label_118:
                    if(v9 < 25) {
                        v11 = d.b[v9];
                        goto label_141;
                    }
                    else {
                        switch(v9) {
                            case 25: {
                                v7 = 4;
                                break;
                            }
                            case 26: {
                                v11 = 0x20;
                                goto label_141;
                            }
                            case 27: {
                                v7 = 2;
                                break;
                            }
                            case 28: {
                                v11 = 0;
                                v7 = 1;
                                goto label_141;
                            }
                            case 29: {
                                v8 = v7;
                                v7 = 6;
                                break;
                            }
                            case 900: {
                                v7 = 1;
                                break;
                            }
                            case 913: {
                                stringBuilder0.append(((char)arr_v2[v6]));
                            }
                        }
                    }
                    break;
                }
                default: {
                    char[] arr_c = d.a;
                alab2:
                    switch(v10) {
                        case 3: {
                            if(v9 < 29) {
                                v11 = arr_c[v9];
                                goto label_141;
                            }
                            else {
                                switch(v9) {
                                    case 29: {
                                        v11 = 0;
                                        v7 = 1;
                                        goto label_141;
                                    }
                                    case 900: {
                                        v7 = 1;
                                        break alab2;
                                    }
                                    case 913: {
                                        stringBuilder0.append(((char)arr_v2[v6]));
                                        break alab2;
                                    }
                                    default: {
                                        break alab2;
                                    }
                                }
                            }
                            goto label_55;
                        }
                        case 4: {
                        label_55:
                            if(v9 < 26) {
                                v11 = (char)(v9 + 65);
                                v7 = v8;
                                goto label_141;
                            }
                            else {
                                switch(v9) {
                                    case 26: {
                                        v7 = v8;
                                        v11 = 0x20;
                                        goto label_141;
                                    }
                                    case 900: {
                                        v7 = 1;
                                        break alab2;
                                    }
                                    default: {
                                        v7 = v8;
                                        break alab2;
                                    }
                                }
                            }
                            goto label_67;
                        }
                        case 5: {
                        label_67:
                            if(v9 < 29) {
                                v7 = v8;
                                v11 = arr_c[v9];
                                goto label_141;
                            }
                            else {
                                switch(v9) {
                                    case 29: 
                                    case 900: {
                                        v11 = 0;
                                        v7 = 1;
                                        goto label_141;
                                    }
                                    case 913: {
                                        stringBuilder0.append(((char)arr_v2[v6]));
                                        v7 = v8;
                                        break alab2;
                                    }
                                    default: {
                                        v7 = v8;
                                        break alab2;
                                    }
                                }
                            }
                            goto label_80;
                        }
                    }
                }
            }
            v11 = 0;
        label_141:
            if(v11 != 0) {
                stringBuilder0.append(((char)v11));
            }
            ++v6;
        }
        return v2;
    }
}

