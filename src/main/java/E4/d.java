package e4;

import java.util.ArrayList;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class d extends Enum {
    public final byte X;
    public final boolean Y;
    public static final enum d Z;
    public static final enum d b0;
    public static final enum d c0;
    public static final enum d d0;
    public static final enum d e0;
    public static final enum d f0;
    public static final enum d g0;
    public static final enum d h0;
    public static final enum d i0;
    public static final enum d j0;
    public static final enum d k0;
    public static final enum d l0;
    public static final enum d m0;
    public static final enum d n0;
    public static final enum d o0;
    public static final enum d p0;
    public static final enum d q0;
    public static final enum d r0;
    public static final enum d s0;
    public static final enum d t0;
    public static final enum d u0;
    public static final enum d v0;
    public static final d[] w0;

    static {
        d.Z = new d("APP0", 0, (byte)0xE0, true);
        d.b0 = new d("APP1", 1, (byte)0xE1, true);
        d.c0 = new d("APP2", 2, -30, true);
        d d0 = new d("APP3", 3, -29, true);
        d d1 = new d("APP4", 4, -28, true);
        d d2 = new d("APP5", 5, -27, true);
        d d3 = new d("APP6", 6, -26, true);
        d d4 = new d("APP7", 7, -25, true);
        d d5 = new d("APP8", 8, -24, true);
        d d6 = new d("APP9", 9, -23, true);
        d d7 = new d("APPA", 10, -22, true);
        d d8 = new d("APPB", 11, -21, true);
        d.d0 = new d("APPC", 12, -20, true);
        d.e0 = new d("APPD", 13, -19, true);
        d.f0 = new d("APPE", 14, -18, true);
        d d9 = new d("APPF", 15, -17, true);
        d d10 = new d("SOI", 16, -40, false);
        d d11 = new d("DQT", 17, -37, false);
        d.g0 = new d("DNL", 18, -36, false);
        d d12 = new d("DRI", 19, -35, false);
        d d13 = new d("DHP", 20, -34, false);
        d d14 = new d("EXP", 21, -33, false);
        d.h0 = new d("DHT", 22, -60, false);
        d d15 = new d("DAC", 23, -52, false);
        d.i0 = new d("SOF0", 24, (byte)0xC0, true);
        d.j0 = new d("SOF1", 25, (byte)0xC1, true);
        d.k0 = new d("SOF2", 26, -62, true);
        d.l0 = new d("SOF3", 27, -61, true);
        d.m0 = new d("SOF5", 28, -59, true);
        d.n0 = new d("SOF6", 29, -58, true);
        d.o0 = new d("SOF7", 30, -57, true);
        d d16 = new d("JPG", 0x1F, -56, true);
        d.p0 = new d("SOF9", 0x20, -55, true);
        d.q0 = new d("SOF10", 33, -54, true);
        d.r0 = new d("SOF11", 34, -53, true);
        d.s0 = new d("SOF13", 35, -51, true);
        d.t0 = new d("SOF14", 36, -50, true);
        d.u0 = new d("SOF15", 37, -49, true);
        d.v0 = new d("COM", 38, -2, true);
        d[] arr_d = new d[39];
        arr_d[0] = d.Z;
        arr_d[1] = d.b0;
        arr_d[2] = d.c0;
        arr_d[3] = d0;
        arr_d[4] = d1;
        arr_d[5] = d2;
        arr_d[6] = d3;
        arr_d[7] = d4;
        arr_d[8] = d5;
        arr_d[9] = d6;
        arr_d[10] = d7;
        arr_d[11] = d8;
        arr_d[12] = d.d0;
        arr_d[13] = d.e0;
        arr_d[14] = d.f0;
        arr_d[15] = d9;
        arr_d[16] = d10;
        arr_d[17] = d11;
        arr_d[18] = d.g0;
        arr_d[19] = d12;
        arr_d[20] = d13;
        arr_d[21] = d14;
        arr_d[22] = d.h0;
        arr_d[23] = d15;
        arr_d[24] = d.i0;
        arr_d[25] = d.j0;
        arr_d[26] = d.k0;
        arr_d[27] = d.l0;
        arr_d[28] = d.m0;
        arr_d[29] = d.n0;
        arr_d[30] = d.o0;
        arr_d[0x1F] = d16;
        arr_d[0x20] = d.p0;
        arr_d[33] = d.q0;
        arr_d[34] = d.r0;
        arr_d[35] = d.s0;
        arr_d[36] = d.t0;
        arr_d[37] = d.u0;
        arr_d[38] = d.v0;
        d.w0 = arr_d;
        ArrayList arrayList0 = new ArrayList();
        d[] arr_d1 = (d[])d.class.getEnumConstants();
        for(int v = 0; v < arr_d1.length; ++v) {
            d d17 = arr_d1[v];
            if(d17.Y) {
                arrayList0.add(d17);
            }
        }
    }

    public d(String s, int v, byte b, boolean z) {
        super(s, v);
        this.X = b;
        this.Y = z;
    }

    public static d valueOf(String s) {
        return (d)Enum.valueOf(d.class, s);
    }

    public static d[] values() {
        return (d[])d.w0.clone();
    }
}

