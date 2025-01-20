package m9;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

public final class c {
    public final ArrayList a;
    public b b;
    public final i c;
    public CRC32 d;
    public int e;
    public int f;
    public Deflater g;
    public final byte[] h;
    public static final HashSet i;
    public static final byte[] j;
    public static final byte[] k;
    public static final byte[] l;
    public static final byte[] m;
    public static final byte[] n;

    static {
        c.i = new HashSet(Arrays.asList(new String[]{"arsc", "gif", "jpg", "jpeg", "png", "ogg", "mp3"}));
        c.j = new byte[]{80, 75, 3, 4};
        c.k = new byte[]{80, 75, 7, 8};
        c.l = new byte[]{80, 75, 1, 2};
        c.m = new byte[]{80, 75, 5, 6};
        c.n = new byte[]{0, 0, 0, 0};
    }

    public c(i i0) {
        this.a = new ArrayList();
        this.h = new byte[0x4000];
        this.c = i0;
    }

    public final void a() {
        Deflater deflater0 = this.g;
        if(deflater0 != null) {
            deflater0.finish();
            while(!this.g.finished()) {
                int v = this.g.deflate(this.h);
                this.c.write(this.h, 0, v);
                this.f += v;
            }
        }
        b b0 = this.b;
        b0.d = (int)this.d.getValue();
        b b1 = this.b;
        b1.f = this.e;
        b1.e = this.f;
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(16).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer0.put(c.k);
        byteBuffer0.putInt(b1.d);
        byteBuffer0.putInt(b1.e);
        byteBuffer0.putInt(b1.f);
        c c0 = b1.h;
        if(b1.b) {
            byte[] arr_b = byteBuffer0.array();
            c0.c.write(arr_b, 0, 16);
        }
        else {
            int v1 = (int)((RandomAccessFile)c0.c.Y).getFilePointer();
            ((RandomAccessFile)c0.c.Y).seek(((long)(b1.g + 14)));
            byte[] arr_b1 = byteBuffer0.array();
            c0.c.write(arr_b1, 4, 12);
            ((RandomAccessFile)c0.c.Y).seek(((long)v1));
        }
        this.b = null;
        this.g = null;
    }
}

