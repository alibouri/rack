package m9;

import E2.a;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;

public final class h {
    public FileOutputStream a;
    public ByteBuffer b;
    public byte[] c;
    public long d;
    public long e;
    public static final a f;
    public static final byte[] g;

    static {
        h.f = new a(6);
        h.g = new byte[]{100, 0x74, 97, 0x72};
    }

    public final void a(byte[] arr_b, int v, int v1) {
        this.a.write(arr_b, v, v1);
        this.e += (long)v1;
    }
}

