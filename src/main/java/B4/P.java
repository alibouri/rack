package b4;

public final class p {
    public int a;
    public static final float[] b;
    public static final float[] c;

    static {
        p.b = new float[]{1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 10000000.0f, 100000000.0f, 1000000000.0f, 10000000000.0f, 99999997952.0f, 999999995904.0f, 9999999827968.0f, 100000000376832.0f, 999999986991104.0f, 10000000272564224.0f, 99999998430674940.0f, 999999984306749400.0f, 9999999980506448000.0f, 100000002004087730000.0f, 1000000020040877300000.0f, 9999999778196308000000.0f, 99999997781963080000000.0f, 1000000013848427900000000.0f, 9999999562023526000000000.0f, 100000002537764290000000000.0f, 999999988484154800000000000.0f, 9999999442119690000000000000.0f, 100000001504746620000000000000.0f, 1000000015047466200000000000000.0f, 9999999848243207000000000000000.0f, 100000003318135350000000000000000.0f, 999999994495727300000000000000000.0f, 9999999790214768000000000000000000.0f, 100000004091847880000000000000000000.0f, 1.000000E+36f, 1.000000E+37f, 1.000000E+38f};
        p.c = new float[]{1.0f, 0.1f, 0.01f, 0.001f, 0.0001f, 0.00001f, 0.000001f, 1.000000E-07f, 1.000000E-08f, 1.000000E-09f, 1.000000E-10f, 1.000000E-11f, 1.000000E-12f, 1.000000E-13f, 1.000000E-14f, 1.000000E-15f, 1.000000E-16f, 1.000000E-17f, 1.000000E-18f, 1.000000E-19f, 1.000000E-20f, 1.000000E-21f, 1.000000E-22f, 1.000000E-23f, 1.000000E-24f, 1.000000E-25f, 1.000000E-26f, 1.000000E-27f, 1.000000E-28f, 1.000000E-29f, 1.000000E-30f, 1.000000E-31f, 1.000000E-32f, 1.000000E-33f, 1.000000E-34f, 1.000000E-35f, 1.000000E-36f, 1.000000E-37f, 9.999999E-39f};
    }

    public final float a(int v, int v1, String s) {
        float f1;
        boolean z3;
        boolean z2;
        boolean z;
        this.a = v;
        if(v >= v1) {
            return NaNf;
        }
        switch(s.charAt(v)) {
            case 43: {
                z = false;
                ++this.a;
                break;
            }
            case 45: {
                z = true;
                ++this.a;
                break;
            }
            default: {
                z = false;
            }
        }
        int v2 = this.a;
        long v3 = 0L;
        int v4 = 0;
        int v5 = 0;
        int v6 = 0;
        boolean z1 = false;
        int v7 = 0;
        int v8;
        while((v8 = this.a) < v1) {
            int v9 = s.charAt(v8);
            if(v9 == 0x30) {
                if(v4 == 0) {
                    ++v6;
                }
                else {
                    ++v5;
                }
            }
            else if(v9 < 49 || v9 > 57) {
                goto label_43;
            }
            else {
                int v10 = v4 + v5;
                while(v5 > 0) {
                    if(v3 > 922337203685477580L) {
                        return NaNf;
                    }
                    v3 *= 10L;
                    --v5;
                }
                if(v3 > 922337203685477580L) {
                    return NaNf;
                }
                v3 = v3 * 10L + ((long)(v9 - 0x30));
                v4 = v10 + 1;
                if(v3 < 0L) {
                    return NaNf;
                }
            }
            ++this.a;
            continue;
        label_43:
            if(v9 != 46 || z1) {
                break;
            }
            v7 = this.a - v2;
            z1 = true;
            ++this.a;
        }
        if(z1 && this.a == v7 + 1) {
            return NaNf;
        }
        if(v4 == 0) {
            if(v6 == 0) {
                return NaNf;
            }
            v4 = 1;
        }
        if(z1) {
            v5 = v7 - v6 - v4;
        }
        if(this.a < v1 && (s.charAt(this.a) == 69 || s.charAt(this.a) == 101)) {
            int v11 = this.a + 1;
            this.a = v11;
            if(v11 == v1) {
                return NaNf;
            }
            switch(s.charAt(v11)) {
                case 43: {
                    z3 = false;
                    ++this.a;
                    z2 = false;
                    break;
                }
                case 45: {
                    z3 = true;
                    ++this.a;
                    z2 = false;
                    break;
                }
                case 0x30: 
                case 49: 
                case 50: 
                case 51: 
                case 52: 
                case 53: 
                case 54: 
                case 55: 
                case 56: 
                case 57: {
                    z3 = false;
                    z2 = false;
                    break;
                }
                default: {
                    --this.a;
                    z2 = true;
                    z3 = false;
                }
            }
            if(!z2) {
                int v12 = this.a;
                int v13 = 0;
                int v14;
                while((v14 = this.a) < v1) {
                    int v15 = s.charAt(v14);
                    if(v15 < 0x30 || v15 > 57) {
                        break;
                    }
                    if(((long)v13) > 922337203685477580L) {
                        return NaNf;
                    }
                    v13 = v13 * 10 + (v15 - 0x30);
                    ++this.a;
                }
                if(this.a == v12) {
                    return NaNf;
                }
                v5 = z3 ? v5 - v13 : v5 + v13;
            }
        }
        if(v4 + v5 <= 39 && v4 + v5 >= -44) {
            float f = (float)v3;
            if(v3 != 0L) {
                boolean z4 = false;
                if(v5 > 0) {
                    z4 = true;
                    f1 = p.b[v5];
                }
                else if(v5 < 0) {
                    z4 = true;
                    if(v5 < -38) {
                        f = (float)(((double)f) * 1.000000E-20);
                        v5 += 20;
                    }
                    f1 = p.c[-v5];
                }
                if(z4) {
                    f *= f1;
                    return z ? -f : f;
                }
            }
            return z ? -f : f;
        }
        return NaNf;
    }
}

