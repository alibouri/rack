package B8;

import A0.b;

public final class d {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final b f;
    public final int g;
    public static final d[] h;

    static {
        d d0 = new d(1, 10, 10, 8, 8, new b(5, new c(1, 3, 0)));
        d d1 = new d(2, 12, 12, 10, 10, new b(7, new c(1, 5, 0)));
        d d2 = new d(3, 14, 14, 12, 12, new b(10, new c(1, 8, 0)));
        d d3 = new d(4, 16, 16, 14, 14, new b(12, new c(1, 12, 0)));
        d d4 = new d(5, 18, 18, 16, 16, new b(14, new c(1, 18, 0)));
        d d5 = new d(6, 20, 20, 18, 18, new b(18, new c(1, 22, 0)));
        d d6 = new d(7, 22, 22, 20, 20, new b(20, new c(1, 30, 0)));
        d d7 = new d(8, 24, 24, 22, 22, new b(24, new c(1, 36, 0)));
        d d8 = new d(9, 26, 26, 24, 24, new b(28, new c(1, 44, 0)));
        d d9 = new d(10, 0x20, 0x20, 14, 14, new b(36, new c(1, 62, 0)));
        d d10 = new d(11, 36, 36, 16, 16, new b(42, new c(1, 86, 0)));
        d d11 = new d(12, 40, 40, 18, 18, new b(0x30, new c(1, 0x72, 0)));
        d d12 = new d(13, 44, 44, 20, 20, new b(56, new c(1, 0x90, 0)));
        d d13 = new d(14, 0x30, 0x30, 22, 22, new b(68, new c(1, 0xAE, 0)));
        d d14 = new d(15, 52, 52, 24, 24, new b(42, new c(2, 102, 0)));
        d d15 = new d(16, 0x40, 0x40, 14, 14, new b(56, new c(2, 140, 0)));
        d d16 = new d(17, 72, 72, 16, 16, new b(36, new c(4, 92, 0)));
        d d17 = new d(18, 80, 80, 18, 18, new b(0x30, new c(4, 0x72, 0)));
        d d18 = new d(19, 88, 88, 20, 20, new b(56, new c(4, 0x90, 0)));
        d d19 = new d(20, 0x60, 0x60, 22, 22, new b(68, new c(4, 0xAE, 0)));
        d d20 = new d(21, 104, 104, 24, 24, new b(56, new c(6, 0x88, 0)));
        d d21 = new d(22, 120, 120, 18, 18, new b(68, new c(6, 0xAF, 0)));
        d d22 = new d(23, 0x84, 0x84, 20, 20, new b(62, new c(8, 0xA3, 0)));
        c c0 = new c(8, 0x9C, 0);
        c c1 = new c(2, 0x9B, 0);
        b b0 = new b();  // initializer: Ljava/lang/Object;-><init>()V
        b0.X = 62;
        b0.Y = new c[]{c0, c1};
        d.h = new d[]{d0, d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, d13, d14, d15, d16, d17, d18, d19, d20, d21, d22, new d(24, 0x90, 0x90, 22, 22, b0), new d(25, 8, 18, 6, 16, new b(7, new c(1, 5, 0))), new d(26, 8, 0x20, 6, 14, new b(11, new c(1, 10, 0))), new d(27, 12, 26, 10, 24, new b(14, new c(1, 16, 0))), new d(28, 12, 36, 10, 16, new b(18, new c(1, 22, 0))), new d(29, 16, 36, 14, 16, new b(24, new c(1, 0x20, 0))), new d(30, 16, 0x30, 14, 22, new b(28, new c(1, 49, 0)))};
    }

    public d(int v, int v1, int v2, int v3, int v4, b b0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = b0;
        c[] arr_c = (c[])b0.Y;
        int v6 = 0;
        for(int v5 = 0; v5 < arr_c.length; ++v5) {
            c c0 = arr_c[v5];
            v6 += (c0.c + b0.X) * c0.b;
        }
        this.g = v6;
    }

    @Override
    public final String toString() {
        return String.valueOf(this.a);
    }
}

