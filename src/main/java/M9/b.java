package m9;

import java.io.IOException;

public final class b {
    public final byte[] a;
    public final boolean b;
    public final short c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final c h;

    public b(c c0, String s, boolean z) {
        this.h = c0;
        byte[] arr_b = s.getBytes(e.b);
        this.a = arr_b;
        if(arr_b.length > 0xFFFF) {
            throw new IOException("Filename too long: " + s);
        }
        this.b = z;
        this.c = z ? 0x808 : 0x800;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
    }
}

