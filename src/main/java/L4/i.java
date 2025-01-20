package l4;

import com.drew.metadata.e;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public abstract class i {
    public boolean a;

    public i() {
        this.a = true;
        super();
    }

    public long A(int v) {
        long v3;
        this.E(v, 4);
        if(this.a) {
            long v1 = 0xFF000000L & ((long)this.b(v)) << 24;
            long v2 = 0xFF0000L & ((long)this.b(v + 1)) << 16 | v1;
            v3 = 0xFF00L & ((long)this.b(v + 2)) << 8 | v2;
            return ((long)this.b(v + 3)) & 0xFFL | v3;
        }
        long v4 = 0xFF000000L & ((long)this.b(v + 3)) << 24;
        long v5 = 0xFF0000L & ((long)this.b(v + 2)) << 16 | v4;
        v3 = 0xFF00L & ((long)this.b(v + 1)) << 8 | v5;
        return ((long)this.b(v)) & 0xFFL | v3;
    }

    public short B() {
        return (short)(this.a() & 0xFF);
    }

    public short C(int v) {
        this.E(v, 1);
        return (short)(this.b(v) & 0xFF);
    }

    public abstract void D(long arg1);

    public abstract void E(int arg1, int arg2);

    public abstract byte a();

    public abstract byte b(int arg1);

    public abstract byte[] c(int arg1);

    public abstract byte[] d(int arg1, int arg2);

    public float e(int v) {
        return Float.intBitsToFloat(this.j(v));
    }

    // Deobfuscation rating: LOW(20)
    public short f() {
        return this.a ? ((short)(((short)this.a()) << 8 & 0xFFFFFF00 | ((short)this.a()) & 0xFF)) : ((short)(((short)this.a()) & 0xFF | ((short)this.a()) << 8 & 0xFFFFFF00));
    }

    public short g(int v) {
        int v1;
        this.E(v, 2);
        if(this.a) {
            v1 = ((short)this.b(v)) << 8 & 0xFFFFFF00;
            return (short)(((short)this.b(v + 1)) & 0xFF | v1);
        }
        v1 = ((short)this.b(v + 1)) << 8 & 0xFFFFFF00;
        return (short)(((short)this.b(v)) & 0xFF | v1);
    }

    public int h(int v) {
        int v1;
        this.E(v, 3);
        if(this.a) {
            v1 = this.b(v) << 16 & 0xFF0000 | 0xFF00 & this.b(v + 1) << 8;
            return this.b(v + 2) & 0xFF | v1;
        }
        v1 = this.b(v + 2) << 16 & 0xFF0000 | 0xFF00 & this.b(v + 1) << 8;
        return this.b(v) & 0xFF | v1;
    }

    // Deobfuscation rating: LOW(20)
    public int i() {
        return this.a ? this.a() << 24 & 0xFF000000 | 0xFF0000 & this.a() << 16 | 0xFF00 & this.a() << 8 | this.a() & 0xFF : this.a() & 0xFF | 0xFF00 & this.a() << 8 | this.a() << 16 & 0xFF0000 | this.a() << 24 & 0xFF000000;
    }

    public int j(int v) {
        int v1;
        this.E(v, 4);
        if(this.a) {
            v1 = this.b(v) << 24 & 0xFF000000 | 0xFF0000 & this.b(v + 1) << 16 | 0xFF00 & this.b(v + 2) << 8;
            return this.b(v + 3) & 0xFF | v1;
        }
        v1 = this.b(v + 3) << 24 & 0xFF000000 | 0xFF0000 & this.b(v + 2) << 16 | 0xFF00 & this.b(v + 1) << 8;
        return this.b(v) & 0xFF | v1;
    }

    // Deobfuscation rating: LOW(20)
    public long k() {
        return this.a ? ((long)this.a()) << 56 & 0xFF00000000000000L | ((long)this.a()) << 0x30 & 0xFF000000000000L | ((long)this.a()) << 40 & 0xFF0000000000L | ((long)this.a()) << 0x20 & 0xFF00000000L | ((long)this.a()) << 24 & 0xFF000000L | ((long)this.a()) << 16 & 0xFF0000L | ((long)this.a()) << 8 & 0xFF00L | ((long)this.a()) & 0xFFL : ((long)this.a()) & 0xFFL | ((long)this.a()) << 8 & 0xFF00L | ((long)this.a()) << 16 & 0xFF0000L | ((long)this.a()) << 24 & 0xFF000000L | ((long)this.a()) << 0x20 & 0xFF00000000L | ((long)this.a()) << 40 & 0xFF0000000000L | ((long)this.a()) << 0x30 & 0xFF000000000000L | ((long)this.a()) << 56 & 0xFF00000000000000L;
    }

    public long l(int v) {
        this.E(v, 8);
        return this.a ? ((long)this.b(v)) << 56 & 0xFF00000000000000L | ((long)this.b(v + 1)) << 0x30 & 0xFF000000000000L | ((long)this.b(v + 2)) << 40 & 0xFF0000000000L | ((long)this.b(v + 3)) << 0x20 & 0xFF00000000L | ((long)this.b(v + 4)) << 24 & 0xFF000000L | ((long)this.b(v + 5)) << 16 & 0xFF0000L | ((long)this.b(v + 6)) << 8 & 0xFF00L | ((long)this.b(v + 7)) & 0xFFL : ((long)this.b(v + 7)) << 56 & 0xFF00000000000000L | ((long)this.b(v + 6)) << 0x30 & 0xFF000000000000L | ((long)this.b(v + 5)) << 40 & 0xFF0000000000L | ((long)this.b(v + 4)) << 0x20 & 0xFF00000000L | ((long)this.b(v + 3)) << 24 & 0xFF000000L | ((long)this.b(v + 2)) << 16 & 0xFF0000L | ((long)this.b(v + 1)) << 8 & 0xFF00L | ((long)this.b(v)) & 0xFFL;
    }

    public byte m(int v) {
        this.E(v, 1);
        return this.b(v);
    }

    public abstract long n();

    public byte[] o(int v) {
        byte[] arr_b = new byte[v];
        int v1;
        for(v1 = 0; v1 < v; ++v1) {
            byte b = this.a();
            arr_b[v1] = b;
            if(b == 0) {
                break;
            }
        }
        if(v1 == v) {
            return arr_b;
        }
        byte[] arr_b1 = new byte[v1];
        if(v1 > 0) {
            System.arraycopy(arr_b, 0, arr_b1, 0, v1);
        }
        return arr_b1;
    }

    public byte[] p(int v, int v1) {
        byte[] arr_b = this.d(v, v1);
        int v2;
        for(v2 = 0; v2 < arr_b.length && arr_b[v2] != 0; ++v2) {
        }
        if(v2 == v1) {
            return arr_b;
        }
        byte[] arr_b1 = new byte[v2];
        if(v2 > 0) {
            System.arraycopy(arr_b, 0, arr_b1, 0, v2);
        }
        return arr_b1;
    }

    public String q(int v, Charset charset0) {
        byte[] arr_b = this.o(v);
        if(charset0 != null) {
            try {
                return new String(arr_b, charset0.name());
            }
            catch(UnsupportedEncodingException unused_ex) {
            }
        }
        return new String(arr_b);
    }

    public float r(int v) {
        int v1;
        float f;
        this.E(v, 4);
        if(this.a) {
            f = (float)((this.b(v) & 0xFF) << 8 | this.b(v + 1) & 0xFF);
            v1 = (this.b(v + 2) & 0xFF) << 8;
            return (float)(((double)(this.b(v + 3) & 0xFF | v1)) / 65536.0 + ((double)f));
        }
        f = (float)((this.b(v + 3) & 0xFF) << 8 | this.b(v + 2) & 0xFF);
        v1 = (this.b(v + 1) & 0xFF) << 8;
        return (float)(((double)(this.b(v) & 0xFF | v1)) / 65536.0 + ((double)f));
    }

    public String s(int v) {
        return new String(this.c(v));
    }

    public String t(int v, int v1, String s) {
        byte[] arr_b = this.d(v, v1);
        try {
            return new String(arr_b, s);
        }
        catch(UnsupportedEncodingException unused_ex) {
            return new String(arr_b);
        }
    }

    public String u(int v, int v1, Charset charset0) {
        return new String(this.d(v, v1), charset0.name());
    }

    public String v(int v) {
        byte[] arr_b = this.c(v);
        try {
            return new String(arr_b, "UTF-8");
        }
        catch(UnsupportedEncodingException unused_ex) {
            return new String(arr_b);
        }
    }

    public e w(int v, Charset charset0) {
        return new e(this.c(v), charset0);
    }

    // Deobfuscation rating: LOW(20)
    public int x() {
        return this.a ? this.a() << 8 & 0xFF00 | this.a() & 0xFF : this.a() & 0xFF | 0xFF00 & this.a() << 8;
    }

    public int y(int v) {
        int v1;
        this.E(v, 2);
        if(this.a) {
            v1 = this.b(v) << 8 & 0xFF00;
            return this.b(v + 1) & 0xFF | v1;
        }
        v1 = this.b(v + 1) << 8 & 0xFF00;
        return this.b(v) & 0xFF | v1;
    }

    public long z() {
        if(this.a) {
            long v = 0xFF000000L & ((long)this.a()) << 24;
            long v1 = 0xFF0000L & ((long)this.a()) << 16 | v;
            long v2 = 0xFF00L & ((long)this.a()) << 8 | v1;
            return ((long)this.a()) & 0xFFL | v2;
        }
        return ((long)this.a()) & 0xFFL | ((long)this.a()) << 8 & 0xFF00L | ((long)this.a()) << 16 & 0xFF0000L | ((long)this.a()) << 24 & 0xFF000000L;
    }
}

