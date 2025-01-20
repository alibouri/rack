package o0;

import m7.o;

public final class d {
    public static final float[] a;
    public static final float[] b;
    public static final q c;
    public static final q d;
    public static final q e;
    public static final q f;
    public static final q g;
    public static final q h;
    public static final q i;
    public static final q j;
    public static final q k;
    public static final q l;
    public static final q m;
    public static final q n;
    public static final q o;
    public static final q p;
    public static final k q;
    public static final k r;
    public static final q s;
    public static final l t;
    public static final c[] u;

    static {
        float[] arr_f = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        d.a = arr_f;
        float[] arr_f1 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        d.b = arr_f1;
        r r0 = new r(2.4, 0.947867, 0.052133, 0.077399, 0.04045);
        r r1 = new r(2.2, 0.947867, 0.052133, 0.077399, 0.04045);
        q q0 = new q("sRGB IEC61966-2.1", arr_f, j.d, r0, 0);
        d.c = q0;
        q q1 = new q("sRGB IEC61966-2.1 (Linear)", arr_f, j.d, 1.0, 0.0f, 1.0f, 1);
        d.d = q1;
        o o0 = new o(5);
        o o1 = new o(6);
        q q2 = new q("scRGB-nl IEC 61966-2-2:2003", arr_f, j.d, null, o0, o1, -0.799f, 2.399f, r0, 2);
        d.e = q2;
        q q3 = new q("scRGB IEC 61966-2-2:2003", arr_f, j.d, 1.0, -0.5f, 7.499f, 3);
        d.f = q3;
        r r2 = new r(2.222222, 0.909918, 0.090082, 0.222222, 0.081);
        q q4 = new q("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, j.d, r2, 4);
        d.g = q4;
        r r3 = new r(2.222222, 0.90967, 0.09033, 0.222222, 0.08145);
        q q5 = new q("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, j.d, r3, 5);
        d.h = q5;
        s s0 = new s(0.314f, 0.351f);
        q q6 = new q("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, s0, 2.6, 0.0f, 1.0f, 6);
        d.i = q6;
        q q7 = new q("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, j.d, r0, 7);
        d.j = q7;
        r r4 = new r(2.222222, 0.909918, 0.090082, 0.222222, 0.081);
        q q8 = new q("NTSC (1953)", arr_f1, j.a, r4, 8);
        d.k = q8;
        r r5 = new r(2.222222, 0.909918, 0.090082, 0.222222, 0.081);
        q q9 = new q("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, j.d, r5, 9);
        d.l = q9;
        q q10 = new q("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, j.d, 2.2, 0.0f, 1.0f, 10);
        d.m = q10;
        r r6 = new r(1.8, 1.0, 0.0, 0.0625, 0.031248);
        q q11 = new q("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 0.0001f}, j.b, r6, 11);
        d.n = q11;
        q q12 = new q("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 0.0001f, -0.077f}, j.c, 1.0, -65504.0f, 65504.0f, 12);
        d.o = q12;
        q q13 = new q("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, j.c, 1.0, -65504.0f, 65504.0f, 13);
        d.p = q13;
        k k0 = new k(14, 1, b.b, "Generic XYZ");
        d.q = k0;
        k k1 = new k(15, 0, b.c, "Generic L*a*b*");
        d.r = k1;
        q q14 = new q("None", arr_f, j.d, r1, 16);
        d.s = q14;
        l l0 = new l(17, b.c, "Oklab");  // initializer: Lo0/c;-><init>(IJLjava/lang/String;)V
        d.t = l0;
        d.u = new c[]{q0, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, q12, q13, k0, k1, q14, l0};
    }
}

