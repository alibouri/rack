package c4;

import i4.a;
import io.sentry.hints.i;
import l4.c;
import v7.d;

public abstract class b {
    public static final A0.b a;
    public static final e[] b;
    public static final int c;

    static {
        e[] arr_e = {new a(), new d(24), new i(19)};  // initializer: Ljava/lang/Object;-><init>()V
        b.b = arr_e;
        A0.b b0 = new A0.b(9, false);
        b.a = b0;
        c4.a a0 = c4.a.c0;
        c c0 = (c)b0.Y;
        if(c0.b != null) {
            throw new RuntimeException("Value already set for this trie node");
        }
        c0.b = a0;
        b0.b(c4.a.d0, new byte[][]{new byte[]{-1, -40}});
        b0.b(c4.a.e0, new byte[][]{"II".getBytes(), new byte[]{42, 0}});
        b0.b(c4.a.e0, new byte[][]{"MM".getBytes(), new byte[]{0, 42}});
        b0.b(c4.a.f0, new byte[][]{"8BPS".getBytes()});
        b0.b(c4.a.g0, new byte[][]{new byte[]{(byte)0x89, 80, 78, 71, 13, 10, 26, 10, 0, 0, 0, 13, 73, 72, 68, 82}});
        b0.b(c4.a.h0, new byte[][]{"BM".getBytes()});
        b0.b(c4.a.h0, new byte[][]{"BA".getBytes()});
        b0.b(c4.a.h0, new byte[][]{"CI".getBytes()});
        b0.b(c4.a.h0, new byte[][]{"CP".getBytes()});
        b0.b(c4.a.h0, new byte[][]{"IC".getBytes()});
        b0.b(c4.a.h0, new byte[][]{"PT".getBytes()});
        b0.b(c4.a.i0, new byte[][]{"GIF87a".getBytes()});
        b0.b(c4.a.i0, new byte[][]{"GIF89a".getBytes()});
        b0.b(c4.a.j0, new byte[][]{new byte[]{0, 0, 1, 0}});
        b0.b(c4.a.k0, new byte[][]{new byte[]{10, 0, 1}});
        b0.b(c4.a.k0, new byte[][]{new byte[]{10, 2, 1}});
        b0.b(c4.a.k0, new byte[][]{new byte[]{10, 3, 1}});
        b0.b(c4.a.k0, new byte[][]{new byte[]{10, 5, 1}});
        b0.b(c4.a.u0, new byte[][]{"II".getBytes(), new byte[]{42, 0, 8, 0}});
        b0.b(c4.a.v0, new byte[][]{"II".getBytes(), new byte[]{26, 0, 0, 0}, "HEAPCCDR".getBytes()});
        b0.b(c4.a.w0, new byte[][]{"II".getBytes(), new byte[]{42, 0, 16, 0, 0, 0, 67, 82}});
        b0.b(c4.a.x0, new byte[][]{"IIRO".getBytes(), new byte[]{8, 0}});
        b0.b(c4.a.x0, new byte[][]{"MMOR".getBytes(), new byte[]{0, 0}});
        b0.b(c4.a.x0, new byte[][]{"IIRS".getBytes(), new byte[]{8, 0}});
        b0.b(c4.a.y0, new byte[][]{"FUJIFILMCCD-RAW".getBytes()});
        b0.b(c4.a.z0, new byte[][]{"II".getBytes(), new byte[]{85, 0}});
        b0.b(c4.a.s0, new byte[][]{"%!PS".getBytes()});
        b0.b(c4.a.s0, new byte[][]{new byte[]{-59, (byte)0xD0, -45, -58}});
        b0.b(c4.a.B0, new byte[][]{new byte[]{-1, -15}});
        b0.b(c4.a.B0, new byte[][]{new byte[]{-1, -7}});
        b0.b(c4.a.C0, new byte[][]{new byte[]{0x30, 38, -78, 0x75, (byte)0x8E, 102, -49, 17, -90, -39, 0, -86, 0, 98, -50, 108}});
        b0.b(c4.a.D0, new byte[][]{new byte[]{(byte)0xD0, -49, 17, (byte)0xE0, (byte)0xA1, (byte)0xB1, 26, (byte)0xE1, 0}});
        b0.b(c4.a.E0, new byte[][]{new byte[]{70, 76, 86}});
        b0.b(c4.a.F0, new byte[][]{new byte[]{6, 6, -19, -11, -40, 29, 70, -27, -67, 49, -17, -25, -2, 0x74, -73, 29}});
        b0.b(c4.a.G0, new byte[][]{new byte[]{6, 14, 43, 52, 2, 5, 1, 1, 13, 1, 2, 1, 1, 2}});
        b0.b(c4.a.H0, new byte[][]{new byte[]{0, 0, 73, 73, 88, 80, 82, 51}});
        b0.b(c4.a.H0, new byte[][]{new byte[]{0, 0, 77, 77, 88, 80, 82, 51}});
        b0.b(c4.a.I0, new byte[][]{new byte[]{0x72, 0x74, 0x73, 0x70, 58, 0x2F, 0x2F}});
        b0.b(c4.a.J0, new byte[][]{new byte[]{0x7B, 92, 0x72, 0x74, 102, 49}});
        b0.b(c4.a.K0, new byte[][]{new byte[]{83, 73, 84, 33, 0}});
        b0.b(c4.a.K0, new byte[][]{new byte[]{83, 0x74, 0x75, 102, 102, 73, 0x74, 0x20, 40, 99, 41, 49, 57, 57, 55, 45}});
        b0.b(c4.a.L0, new byte[][]{new byte[]{83, 0x74, 0x75, 102, 102, 73, 0x74, 33}});
        b0.b(c4.a.M0, new byte[][]{"CWS".getBytes()});
        b0.b(c4.a.M0, new byte[][]{"FWS".getBytes()});
        b0.b(c4.a.M0, new byte[][]{"ZWS".getBytes()});
        b0.b(c4.a.N0, new byte[][]{new byte[]{0, 0, 1, -70}});
        b0.b(c4.a.O0, new byte[][]{"PK".getBytes()});
        int v1 = b0.X;
        for(int v = 0; v < 3; ++v) {
            e e0 = arr_e[v];
            if(e0.c() > v1) {
                v1 = e0.c();
            }
        }
        b.c = v1;
    }
}

