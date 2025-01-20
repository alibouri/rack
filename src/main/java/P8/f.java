package P8;

import A0.b;
import B8.c;

public final class f {
    public final int a;
    public final int[] b;
    public final b[] c;
    public final int d;
    public static final int[] e;
    public static final f[] f;

    static {
        f.e = new int[]{0x7C94, 0x85BC, 0x9A99, 0xA4D3, 0xBBF6, 51042, 0xD847, 0xE60D, 0xF928, 0x10B78, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 0x1B08E, 0x1CC1A, 0x1D33F, 0x1ED75, 0x1F250, 0x209D5, 0x216F0, 0x228BA, 0x2379F, 0x24B0B, 0x2542E, 158308, 161089, 167017};
        f.f = f.a();
    }

    public f(int v, int[] arr_v, b[] arr_b) {
        this.a = v;
        this.b = arr_v;
        this.c = arr_b;
        int v2 = arr_b[0].X;
        c[] arr_c = (c[])arr_b[0].Y;
        int v3 = 0;
        for(int v1 = 0; v1 < arr_c.length; ++v1) {
            c c0 = arr_c[v1];
            v3 += (c0.c + v2) * c0.b;
        }
        this.d = v3;
    }

    public static f[] a() {
        b[] arr_b = {new b(7, new c[]{new c(1, 19, 4)}), new b(10, new c[]{new c(1, 16, 4)}), new b(13, new c[]{new c(1, 13, 4)}), new b(17, new c[]{new c(1, 9, 4)})};
        f f0 = new f(1, new int[0], arr_b);
        b[] arr_b1 = {new b(10, new c[]{new c(1, 34, 4)}), new b(16, new c[]{new c(1, 28, 4)}), new b(22, new c[]{new c(1, 22, 4)}), new b(28, new c[]{new c(1, 16, 4)})};
        f f1 = new f(2, new int[]{6, 18}, arr_b1);
        b[] arr_b2 = {new b(15, new c[]{new c(1, 55, 4)}), new b(26, new c[]{new c(1, 44, 4)}), new b(18, new c[]{new c(2, 17, 4)}), new b(22, new c[]{new c(2, 13, 4)})};
        f f2 = new f(3, new int[]{6, 22}, arr_b2);
        b[] arr_b3 = {new b(20, new c[]{new c(1, 80, 4)}), new b(18, new c[]{new c(2, 0x20, 4)}), new b(26, new c[]{new c(2, 24, 4)}), new b(16, new c[]{new c(4, 9, 4)})};
        f f3 = new f(4, new int[]{6, 26}, arr_b3);
        b[] arr_b4 = {new b(26, new c[]{new c(1, 108, 4)}), new b(24, new c[]{new c(2, 43, 4)}), new b(18, new c[]{new c(2, 15, 4), new c(2, 16, 4)}), new b(22, new c[]{new c(2, 11, 4), new c(2, 12, 4)})};
        f f4 = new f(5, new int[]{6, 30}, arr_b4);
        b[] arr_b5 = {new b(18, new c[]{new c(2, 68, 4)}), new b(16, new c[]{new c(4, 27, 4)}), new b(24, new c[]{new c(4, 19, 4)}), new b(28, new c[]{new c(4, 15, 4)})};
        f f5 = new f(6, new int[]{6, 34}, arr_b5);
        b[] arr_b6 = {new b(20, new c[]{new c(2, 78, 4)}), new b(18, new c[]{new c(4, 0x1F, 4)}), new b(18, new c[]{new c(2, 14, 4), new c(4, 15, 4)}), new b(26, new c[]{new c(4, 13, 4), new c(1, 14, 4)})};
        f f6 = new f(7, new int[]{6, 22, 38}, arr_b6);
        b[] arr_b7 = {new b(24, new c[]{new c(2, 97, 4)}), new b(22, new c[]{new c(2, 38, 4), new c(2, 39, 4)}), new b(22, new c[]{new c(4, 18, 4), new c(2, 19, 4)}), new b(26, new c[]{new c(4, 14, 4), new c(2, 15, 4)})};
        f f7 = new f(8, new int[]{6, 24, 42}, arr_b7);
        b[] arr_b8 = {new b(30, new c[]{new c(2, 0x74, 4)}), new b(22, new c[]{new c(3, 36, 4), new c(2, 37, 4)}), new b(20, new c[]{new c(4, 16, 4), new c(4, 17, 4)}), new b(24, new c[]{new c(4, 12, 4), new c(4, 13, 4)})};
        f f8 = new f(9, new int[]{6, 26, 46}, arr_b8);
        b[] arr_b9 = {new b(18, new c[]{new c(2, 68, 4), new c(2, 69, 4)}), new b(26, new c[]{new c(4, 43, 4), new c(1, 44, 4)}), new b(24, new c[]{new c(6, 19, 4), new c(2, 20, 4)}), new b(28, new c[]{new c(6, 15, 4), new c(2, 16, 4)})};
        f f9 = new f(10, new int[]{6, 28, 50}, arr_b9);
        b[] arr_b10 = {new b(20, new c[]{new c(4, 81, 4)}), new b(30, new c[]{new c(1, 50, 4), new c(4, 51, 4)}), new b(28, new c[]{new c(4, 22, 4), new c(4, 23, 4)}), new b(24, new c[]{new c(3, 12, 4), new c(8, 13, 4)})};
        f f10 = new f(11, new int[]{6, 30, 54}, arr_b10);
        b[] arr_b11 = {new b(24, new c[]{new c(2, 92, 4), new c(2, 93, 4)}), new b(22, new c[]{new c(6, 36, 4), new c(2, 37, 4)}), new b(26, new c[]{new c(4, 20, 4), new c(6, 21, 4)}), new b(28, new c[]{new c(7, 14, 4), new c(4, 15, 4)})};
        f f11 = new f(12, new int[]{6, 0x20, 58}, arr_b11);
        b[] arr_b12 = {new b(26, new c[]{new c(4, 107, 4)}), new b(22, new c[]{new c(8, 37, 4), new c(1, 38, 4)}), new b(24, new c[]{new c(8, 20, 4), new c(4, 21, 4)}), new b(22, new c[]{new c(12, 11, 4), new c(4, 12, 4)})};
        f f12 = new f(13, new int[]{6, 34, 62}, arr_b12);
        b[] arr_b13 = {new b(30, new c[]{new c(3, 0x73, 4), new c(1, 0x74, 4)}), new b(24, new c[]{new c(4, 40, 4), new c(5, 41, 4)}), new b(20, new c[]{new c(11, 16, 4), new c(5, 17, 4)}), new b(24, new c[]{new c(11, 12, 4), new c(5, 13, 4)})};
        f f13 = new f(14, new int[]{6, 26, 46, 66}, arr_b13);
        b[] arr_b14 = {new b(22, new c[]{new c(5, 87, 4), new c(1, 88, 4)}), new b(24, new c[]{new c(5, 41, 4), new c(5, 42, 4)}), new b(30, new c[]{new c(5, 24, 4), new c(7, 25, 4)}), new b(24, new c[]{new c(11, 12, 4), new c(7, 13, 4)})};
        f f14 = new f(15, new int[]{6, 26, 0x30, 70}, arr_b14);
        b[] arr_b15 = {new b(24, new c[]{new c(5, 98, 4), new c(1, 99, 4)}), new b(28, new c[]{new c(7, 45, 4), new c(3, 46, 4)}), new b(24, new c[]{new c(15, 19, 4), new c(2, 20, 4)}), new b(30, new c[]{new c(3, 15, 4), new c(13, 16, 4)})};
        f f15 = new f(16, new int[]{6, 26, 50, 74}, arr_b15);
        b[] arr_b16 = {new b(28, new c[]{new c(1, 107, 4), new c(5, 108, 4)}), new b(28, new c[]{new c(10, 46, 4), new c(1, 0x2F, 4)}), new b(28, new c[]{new c(1, 22, 4), new c(15, 23, 4)}), new b(28, new c[]{new c(2, 14, 4), new c(17, 15, 4)})};
        f f16 = new f(17, new int[]{6, 30, 54, 78}, arr_b16);
        b[] arr_b17 = {new b(30, new c[]{new c(5, 120, 4), new c(1, 0x79, 4)}), new b(26, new c[]{new c(9, 43, 4), new c(4, 44, 4)}), new b(28, new c[]{new c(17, 22, 4), new c(1, 23, 4)}), new b(28, new c[]{new c(2, 14, 4), new c(19, 15, 4)})};
        f f17 = new f(18, new int[]{6, 30, 56, 82}, arr_b17);
        b[] arr_b18 = {new b(28, new c[]{new c(3, 0x71, 4), new c(4, 0x72, 4)}), new b(26, new c[]{new c(3, 44, 4), new c(11, 45, 4)}), new b(26, new c[]{new c(17, 21, 4), new c(4, 22, 4)}), new b(26, new c[]{new c(9, 13, 4), new c(16, 14, 4)})};
        f f18 = new f(19, new int[]{6, 30, 58, 86}, arr_b18);
        b[] arr_b19 = {new b(28, new c[]{new c(3, 107, 4), new c(5, 108, 4)}), new b(26, new c[]{new c(3, 41, 4), new c(13, 42, 4)}), new b(30, new c[]{new c(15, 24, 4), new c(5, 25, 4)}), new b(28, new c[]{new c(15, 15, 4), new c(10, 16, 4)})};
        f f19 = new f(20, new int[]{6, 34, 62, 90}, arr_b19);
        b[] arr_b20 = {new b(28, new c[]{new c(4, 0x74, 4), new c(4, 0x75, 4)}), new b(26, new c[]{new c(17, 42, 4)}), new b(28, new c[]{new c(17, 22, 4), new c(6, 23, 4)}), new b(30, new c[]{new c(19, 16, 4), new c(6, 17, 4)})};
        f f20 = new f(21, new int[]{6, 28, 50, 72, 94}, arr_b20);
        b[] arr_b21 = {new b(28, new c[]{new c(2, 0x6F, 4), new c(7, 0x70, 4)}), new b(28, new c[]{new c(17, 46, 4)}), new b(30, new c[]{new c(7, 24, 4), new c(16, 25, 4)}), new b(24, new c[]{new c(34, 13, 4)})};
        f f21 = new f(22, new int[]{6, 26, 50, 74, 98}, arr_b21);
        b[] arr_b22 = {new b(30, new c[]{new c(4, 0x79, 4), new c(5, 0x7A, 4)}), new b(28, new c[]{new c(4, 0x2F, 4), new c(14, 0x30, 4)}), new b(30, new c[]{new c(11, 24, 4), new c(14, 25, 4)}), new b(30, new c[]{new c(16, 15, 4), new c(14, 16, 4)})};
        f f22 = new f(23, new int[]{6, 30, 54, 78, 102}, arr_b22);
        b[] arr_b23 = {new b(30, new c[]{new c(6, 0x75, 4), new c(4, 0x76, 4)}), new b(28, new c[]{new c(6, 45, 4), new c(14, 46, 4)}), new b(30, new c[]{new c(11, 24, 4), new c(16, 25, 4)}), new b(30, new c[]{new c(30, 16, 4), new c(2, 17, 4)})};
        f f23 = new f(24, new int[]{6, 28, 54, 80, 106}, arr_b23);
        b[] arr_b24 = {new b(26, new c[]{new c(8, 106, 4), new c(4, 107, 4)}), new b(28, new c[]{new c(8, 0x2F, 4), new c(13, 0x30, 4)}), new b(30, new c[]{new c(7, 24, 4), new c(22, 25, 4)}), new b(30, new c[]{new c(22, 15, 4), new c(13, 16, 4)})};
        f f24 = new f(25, new int[]{6, 0x20, 58, 84, 110}, arr_b24);
        b[] arr_b25 = {new b(28, new c[]{new c(10, 0x72, 4), new c(2, 0x73, 4)}), new b(28, new c[]{new c(19, 46, 4), new c(4, 0x2F, 4)}), new b(28, new c[]{new c(28, 22, 4), new c(6, 23, 4)}), new b(30, new c[]{new c(33, 16, 4), new c(4, 17, 4)})};
        f f25 = new f(26, new int[]{6, 30, 58, 86, 0x72}, arr_b25);
        b[] arr_b26 = {new b(30, new c[]{new c(8, 0x7A, 4), new c(4, 0x7B, 4)}), new b(28, new c[]{new c(22, 45, 4), new c(3, 46, 4)}), new b(30, new c[]{new c(8, 23, 4), new c(26, 24, 4)}), new b(30, new c[]{new c(12, 15, 4), new c(28, 16, 4)})};
        f f26 = new f(27, new int[]{6, 34, 62, 90, 0x76}, arr_b26);
        b[] arr_b27 = {new b(30, new c[]{new c(3, 0x75, 4), new c(10, 0x76, 4)}), new b(28, new c[]{new c(3, 45, 4), new c(23, 46, 4)}), new b(30, new c[]{new c(4, 24, 4), new c(0x1F, 25, 4)}), new b(30, new c[]{new c(11, 15, 4), new c(0x1F, 16, 4)})};
        f f27 = new f(28, new int[]{6, 26, 50, 74, 98, 0x7A}, arr_b27);
        b[] arr_b28 = {new b(30, new c[]{new c(7, 0x74, 4), new c(7, 0x75, 4)}), new b(28, new c[]{new c(21, 45, 4), new c(7, 46, 4)}), new b(30, new c[]{new c(1, 23, 4), new c(37, 24, 4)}), new b(30, new c[]{new c(19, 15, 4), new c(26, 16, 4)})};
        f f28 = new f(29, new int[]{6, 30, 54, 78, 102, 0x7E}, arr_b28);
        b[] arr_b29 = {new b(30, new c[]{new c(5, 0x73, 4), new c(10, 0x74, 4)}), new b(28, new c[]{new c(19, 0x2F, 4), new c(10, 0x30, 4)}), new b(30, new c[]{new c(15, 24, 4), new c(25, 25, 4)}), new b(30, new c[]{new c(23, 15, 4), new c(25, 16, 4)})};
        f f29 = new f(30, new int[]{6, 26, 52, 78, 104, 130}, arr_b29);
        b[] arr_b30 = {new b(30, new c[]{new c(13, 0x73, 4), new c(3, 0x74, 4)}), new b(28, new c[]{new c(2, 46, 4), new c(29, 0x2F, 4)}), new b(30, new c[]{new c(42, 24, 4), new c(1, 25, 4)}), new b(30, new c[]{new c(23, 15, 4), new c(28, 16, 4)})};
        f f30 = new f(0x1F, new int[]{6, 30, 56, 82, 108, 0x86}, arr_b30);
        b[] arr_b31 = {new b(30, new c[]{new c(17, 0x73, 4)}), new b(28, new c[]{new c(10, 46, 4), new c(23, 0x2F, 4)}), new b(30, new c[]{new c(10, 24, 4), new c(35, 25, 4)}), new b(30, new c[]{new c(19, 15, 4), new c(35, 16, 4)})};
        f f31 = new f(0x20, new int[]{6, 34, 60, 86, 0x70, 0x8A}, arr_b31);
        b[] arr_b32 = {new b(30, new c[]{new c(17, 0x73, 4), new c(1, 0x74, 4)}), new b(28, new c[]{new c(14, 46, 4), new c(21, 0x2F, 4)}), new b(30, new c[]{new c(29, 24, 4), new c(19, 25, 4)}), new b(30, new c[]{new c(11, 15, 4), new c(46, 16, 4)})};
        f f32 = new f(33, new int[]{6, 30, 58, 86, 0x72, 0x8E}, arr_b32);
        b[] arr_b33 = {new b(30, new c[]{new c(13, 0x73, 4), new c(6, 0x74, 4)}), new b(28, new c[]{new c(14, 46, 4), new c(23, 0x2F, 4)}), new b(30, new c[]{new c(44, 24, 4), new c(7, 25, 4)}), new b(30, new c[]{new c(59, 16, 4), new c(1, 17, 4)})};
        f f33 = new f(34, new int[]{6, 34, 62, 90, 0x76, 0x92}, arr_b33);
        b[] arr_b34 = {new b(30, new c[]{new c(12, 0x79, 4), new c(7, 0x7A, 4)}), new b(28, new c[]{new c(12, 0x2F, 4), new c(26, 0x30, 4)}), new b(30, new c[]{new c(39, 24, 4), new c(14, 25, 4)}), new b(30, new c[]{new c(22, 15, 4), new c(41, 16, 4)})};
        f f34 = new f(35, new int[]{6, 30, 54, 78, 102, 0x7E, 150}, arr_b34);
        b[] arr_b35 = {new b(30, new c[]{new c(6, 0x79, 4), new c(14, 0x7A, 4)}), new b(28, new c[]{new c(6, 0x2F, 4), new c(34, 0x30, 4)}), new b(30, new c[]{new c(46, 24, 4), new c(10, 25, 4)}), new b(30, new c[]{new c(2, 15, 4), new c(0x40, 16, 4)})};
        f f35 = new f(36, new int[]{6, 24, 50, 76, 102, 0x80, 0x9A}, arr_b35);
        b[] arr_b36 = {new b(30, new c[]{new c(17, 0x7A, 4), new c(4, 0x7B, 4)}), new b(28, new c[]{new c(29, 46, 4), new c(14, 0x2F, 4)}), new b(30, new c[]{new c(49, 24, 4), new c(10, 25, 4)}), new b(30, new c[]{new c(24, 15, 4), new c(46, 16, 4)})};
        f f36 = new f(37, new int[]{6, 28, 54, 80, 106, 0x84, 0x9E}, arr_b36);
        b[] arr_b37 = {new b(30, new c[]{new c(4, 0x7A, 4), new c(18, 0x7B, 4)}), new b(28, new c[]{new c(13, 46, 4), new c(0x20, 0x2F, 4)}), new b(30, new c[]{new c(0x30, 24, 4), new c(14, 25, 4)}), new b(30, new c[]{new c(42, 15, 4), new c(0x20, 16, 4)})};
        f f37 = new f(38, new int[]{6, 0x20, 58, 84, 110, 0x88, 0xA2}, arr_b37);
        b[] arr_b38 = {new b(30, new c[]{new c(20, 0x75, 4), new c(4, 0x76, 4)}), new b(28, new c[]{new c(40, 0x2F, 4), new c(7, 0x30, 4)}), new b(30, new c[]{new c(43, 24, 4), new c(22, 25, 4)}), new b(30, new c[]{new c(10, 15, 4), new c(67, 16, 4)})};
        f f38 = new f(39, new int[]{6, 26, 54, 82, 110, 0x8A, 0xA6}, arr_b38);
        b[] arr_b39 = {new b(30, new c[]{new c(19, 0x76, 4), new c(6, 0x77, 4)}), new b(28, new c[]{new c(18, 0x2F, 4), new c(0x1F, 0x30, 4)}), new b(30, new c[]{new c(34, 24, 4), new c(34, 25, 4)}), new b(30, new c[]{new c(20, 15, 4), new c(61, 16, 4)})};
        return new f[]{f0, f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26, f27, f28, f29, f30, f31, f32, f33, f34, f35, f36, f37, f38, new f(40, new int[]{6, 30, 58, 86, 0x72, 0x8E, 170}, arr_b39)};
    }

    public static f b(int v) {
        int v1 = 0x7FFFFFFF;
        int v2 = 0;
        for(int v3 = 0; v3 < 34; ++v3) {
            int v4 = f.e[v3];
            if(v4 == v) {
                return f.c(v3 + 7);
            }
            int v5 = Integer.bitCount(v4 ^ v);
            if(v5 < v1) {
                v2 = v3 + 7;
                v1 = v5;
            }
        }
        return v1 > 3 ? null : f.c(v2);
    }

    public static f c(int v) {
        if(v <= 0 || v > 40) {
            throw new IllegalArgumentException();
        }
        return f.f[v - 1];
    }

    @Override
    public final String toString() {
        return String.valueOf(this.a);
    }
}

