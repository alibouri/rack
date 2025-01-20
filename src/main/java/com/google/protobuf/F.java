package com.google.protobuf;

import D3.a;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class f extends c0 {
    public F c;
    public final byte[] d;
    public final int e;
    public int f;
    public static final Logger g;
    public static final boolean h;

    static {
        f.g = Logger.getLogger(f.class.getName());
        f.h = n0.e;
    }

    public f(int v, byte[] arr_b) {
        if((arr_b.length - v | v) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", ((int)arr_b.length), 0, v));
        }
        this.d = arr_b;
        this.f = 0;
        this.e = v;
    }

    public final void A(byte b) {
        try {
            int v = this.f;
            this.f = v + 1;
            this.d[v] = b;
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new a(String.format("Pos: %d, limit: %d, len: %d", ((int)this.f), ((int)this.e), 1), indexOutOfBoundsException0, 4);
        }
    }

    public final void B(byte[] arr_b, int v, int v1) {
        try {
            System.arraycopy(arr_b, v, this.d, this.f, v1);
            this.f += v1;
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new a(String.format("Pos: %d, limit: %d, len: %d", ((int)this.f), ((int)this.e), v1), indexOutOfBoundsException0, 4);
        }
    }

    public final void C(e e0) {
        this.K(e0.size());
        this.B(e0.Y, e0.d(), e0.size());
    }

    public final void D(int v, int v1) {
        this.J(v, 5);
        this.E(v1);
    }

    public final void E(int v) {
        try {
            int v1 = this.f;
            this.f = v1 + 1;
            this.d[v1] = (byte)(v & 0xFF);
            this.f = v1 + 2;
            this.d[v1 + 1] = (byte)(v >> 8 & 0xFF);
            this.f = v1 + 3;
            this.d[v1 + 2] = (byte)(v >> 16 & 0xFF);
            this.f = v1 + 4;
            this.d[v1 + 3] = (byte)(v >> 24 & 0xFF);
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new a(String.format("Pos: %d, limit: %d, len: %d", ((int)this.f), ((int)this.e), 1), indexOutOfBoundsException0, 4);
        }
    }

    public final void F(int v, long v1) {
        this.J(v, 1);
        this.G(v1);
    }

    public final void G(long v) {
        try {
            int v1 = this.f;
            this.f = v1 + 1;
            this.d[v1] = (byte)(((int)v) & 0xFF);
            this.f = v1 + 2;
            this.d[v1 + 1] = (byte)(((int)(v >> 8)) & 0xFF);
            this.f = v1 + 3;
            this.d[v1 + 2] = (byte)(((int)(v >> 16)) & 0xFF);
            this.f = v1 + 4;
            this.d[v1 + 3] = (byte)(((int)(v >> 24)) & 0xFF);
            this.f = v1 + 5;
            this.d[v1 + 4] = (byte)(((int)(v >> 0x20)) & 0xFF);
            this.f = v1 + 6;
            this.d[v1 + 5] = (byte)(((int)(v >> 40)) & 0xFF);
            this.f = v1 + 7;
            this.d[v1 + 6] = (byte)(((int)(v >> 0x30)) & 0xFF);
            this.f = v1 + 8;
            this.d[v1 + 7] = (byte)(((int)(v >> 56)) & 0xFF);
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new a(String.format("Pos: %d, limit: %d, len: %d", ((int)this.f), ((int)this.e), 1), indexOutOfBoundsException0, 4);
        }
    }

    public final void H(int v) {
        if(v >= 0) {
            this.K(v);
            return;
        }
        this.M(((long)v));
    }

    public final void I(String s) {
        int v;
        try {
            v = this.f;
            int v1 = f.x(s.length());
            byte[] arr_b = this.d;
            int v2 = this.e;
            if(v1 == f.x(s.length() * 3)) {
                int v3 = v + v1;
                this.f = v3;
                int v4 = q0.a.a(s, arr_b, v3, v2 - v3);
                this.f = v;
                this.K(v4 - v - v1);
                this.f = v4;
                return;
            }
            this.K(q0.b(s));
            this.f = q0.a.a(s, arr_b, this.f, v2 - this.f);
            return;
        }
        catch(p0 p00) {
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new a(indexOutOfBoundsException0);
        }
        this.f = v;
        f.g.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", p00);
        byte[] arr_b1 = s.getBytes(u.a);
        try {
            this.K(arr_b1.length);
            this.B(arr_b1, 0, arr_b1.length);
            return;
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException1) {
            throw new a(indexOutOfBoundsException1);
        }
        throw new a(indexOutOfBoundsException0);
    }

    public final void J(int v, int v1) {
        this.K(v << 3 | v1);
    }

    public final void K(int v) {
        try {
            while(true) {
                byte[] arr_b = this.d;
                if((v & 0xFFFFFF80) == 0) {
                    int v1 = this.f;
                    this.f = v1 + 1;
                    arr_b[v1] = (byte)v;
                    return;
                }
                int v2 = this.f;
                this.f = v2 + 1;
                arr_b[v2] = (byte)(v & 0x7F | 0x80);
                v >>>= 7;
            }
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
        }
        throw new a(String.format("Pos: %d, limit: %d, len: %d", ((int)this.f), ((int)this.e), 1), indexOutOfBoundsException0, 4);
    }

    public final void L(int v, long v1) {
        this.J(v, 0);
        this.M(v1);
    }

    public final void M(long v) {
        byte[] arr_b = this.d;
        int v1 = this.e;
        if(f.h && v1 - this.f >= 10) {
            while((v & 0xFFFFFFFFFFFFFF80L) != 0L) {
                int v2 = this.f;
                this.f = v2 + 1;
                n0.k(arr_b, ((long)v2), ((byte)(((int)v) & 0x7F | 0x80)));
                v >>>= 7;
            }
            int v3 = this.f;
            this.f = 1 + v3;
            n0.k(arr_b, ((long)v3), ((byte)(((int)v))));
            return;
        }
        try {
            while(true) {
                if((v & 0xFFFFFFFFFFFFFF80L) == 0L) {
                    int v4 = this.f;
                    this.f = v4 + 1;
                    arr_b[v4] = (byte)(((int)v));
                    return;
                }
                int v5 = this.f;
                this.f = v5 + 1;
                arr_b[v5] = (byte)(((int)v) & 0x7F | 0x80);
                v >>>= 7;
            }
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
        }
        throw new a(String.format("Pos: %d, limit: %d, len: %d", ((int)this.f), v1, 1), indexOutOfBoundsException0, 4);
    }

    public static int d(int v) {
        return f.v(v) + 1;
    }

    public static int e(int v, e e0) {
        return f.f(e0) + f.v(v);
    }

    public static int f(e e0) {
        int v = e0.size();
        return f.x(v) + v;
    }

    public static int g(int v) {
        return f.v(v) + 8;
    }

    public static int h(int v, int v1) {
        return f.n(v1) + f.v(v);
    }

    public static int i(int v) {
        return f.v(v) + 4;
    }

    public static int j(int v) {
        return f.v(v) + 8;
    }

    public static int k(int v) {
        return f.v(v) + 4;
    }

    public static int l(int v, com.google.protobuf.a a0, X x0) {
        return a0.h(x0) + f.v(v) * 2;
    }

    public static int m(int v, int v1) {
        return f.n(v1) + f.v(v);
    }

    public static int n(int v) {
        return v < 0 ? 10 : f.x(v);
    }

    public static int o(int v, long v1) {
        return f.z(v1) + f.v(v);
    }

    public static int p(int v) {
        return f.v(v) + 4;
    }

    public static int q(int v) {
        return f.v(v) + 8;
    }

    public static int r(int v, int v1) {
        return f.x(v1 >> 0x1F ^ v1 << 1) + f.v(v);
    }

    public static int s(int v, long v1) {
        return f.z(v1 >> 0x3F ^ v1 << 1) + f.v(v);
    }

    public static int t(int v, String s) {
        return f.u(s) + f.v(v);
    }

    public static int u(String s) {
        int v;
        try {
            v = q0.b(s);
            return f.x(v) + v;
        }
        catch(p0 unused_ex) {
            v = s.getBytes(u.a).length;
            return f.x(v) + v;
        }
    }

    public static int v(int v) {
        return f.x(v << 3);
    }

    public static int w(int v, int v1) {
        return f.x(v1) + f.v(v);
    }

    public static int x(int v) {
        if((v & 0xFFFFFF80) == 0) {
            return 1;
        }
        if((v & 0xFFFFC000) == 0) {
            return 2;
        }
        if((0xFFE00000 & v) == 0) {
            return 3;
        }
        return (v & 0xF0000000) == 0 ? 4 : 5;
    }

    public static int y(int v, long v1) {
        return f.z(v1) + f.v(v);
    }

    public static int z(long v) {
        int v1;
        if((0xFFFFFFFFFFFFFF80L & v) == 0L) {
            return 1;
        }
        if(v < 0L) {
            return 10;
        }
        if((0xFFFFFFF800000000L & v) == 0L) {
            v1 = 2;
        }
        else {
            v >>>= 28;
            v1 = 6;
        }
        if((0xFFFFFFFFFFE00000L & v) != 0L) {
            v1 += 2;
            v >>>= 14;
        }
        return (v & 0xFFFFFFFFFFFFC000L) == 0L ? v1 : v1 + 1;
    }
}

