package F4;

import A0.b;
import C3.i;
import G0.a;
import com.drew.metadata.mp4.Mp4Directory;
import com.drew.metadata.mp4.media.Mp4UuidBoxDirectory;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.UUID;
import l4.l;
import n0.h;

public final class c extends a {
    public static final b c;

    static {
        b b0 = new b(9, false);
        c.c = b0;
        F4.b b1 = F4.b.X;
        l4.c c0 = (l4.c)b0.Y;
        if(c0.b != null) {
            throw new RuntimeException("Value already set for this trie node");
        }
        c0.b = b1;
        b0.b(F4.b.Y, new byte[][]{new byte[]{5, 55, -51, -85, -99, 12, 68, 49, -89, 42, -6, 86, 0x1F, 42, 17, 62}});
        b0.b(F4.b.Z, new byte[][]{new byte[]{44, 76, 1, 0, (byte)0x85, 4, 0x40, -71, (byte)0xA0, 62, 86, 33, 72, -42, -33, -21}});
        b0.b(F4.b.b0, new byte[][]{new byte[]{51, -57, -92, -46, -72, 29, 71, 35, (byte)0xA0, -70, -15, -93, (byte)0xE0, -105, -83, 56}});
        b0.b(F4.b.c0, new byte[][]{new byte[]{(byte)0x89, 0x74, -37, -50, 0x7B, -25, 76, 81, (byte)0x84, -7, 0x71, 72, -7, -120, 37, 84}});
        b0.b(F4.b.d0, new byte[][]{new byte[]{-106, -87, -15, -15, -36, -104, 0x40, 45, -89, -82, -42, (byte)0x8E, 52, 69, 24, 9}});
        b0.b(F4.b.e0, new byte[][]{new byte[]{-94, 57, 0x4F, 82, 90, -101, 0x4F, 20, -94, 68, 108, 66, 0x7C, 100, (byte)0x8D, -12}});
        b0.b(F4.b.f0, new byte[][]{new byte[]{(byte)0xB1, 75, -8, -67, 8, 61, 75, 67, -91, -82, (byte)0x8C, -41, -43, -90, -50, 3}});
        b0.b(F4.b.g0, new byte[][]{new byte[]{-66, 0x7A, -49, -53, -105, -87, 66, -24, -100, 0x71, -103, -108, (byte)0x91, -29, -81, -84}});
        b0.b(F4.b.h0, new byte[][]{new byte[]{(byte)0xD0, (byte)0x8A, 0x4F, 24, 16, -13, 74, (byte)0x82, -74, -56, 50, -40, -85, (byte)0xA1, (byte)0x83, -45}});
    }

    @Override  // G0.a
    public final Mp4Directory i() {
        return new Mp4UuidBoxDirectory();
    }

    @Override  // G0.a
    public final a r(String s, byte[] arr_b, long v, i i0) {
        if(arr_b != null && arr_b.length >= 16) {
            c.c.getClass();
            F4.b b0 = (F4.b)c.c.f(arr_b.length, arr_b);
            if(b0 == null) {
                return this;
            }
            U7.c c0 = (U7.c)this.a;
            Mp4Directory mp4Directory0 = (Mp4Directory)this.b;
            switch(b0.ordinal()) {
                case 1: {
                    l4.b b1 = new l4.b(16, arr_b);
                    h h0 = new h(c0, mp4Directory0, 0);
                    try {
                        Q4.i.J(b1, h0, 0);
                    }
                    catch(k4.b b2) {
                        h0.f("Exception processing TIFF data: " + b2.getMessage());
                    }
                    catch(IOException iOException0) {
                        h0.f("Exception processing TIFF data: " + iOException0.getMessage());
                    }
                    return this;
                }
                case 2: {
                    com.drew.metadata.photoshop.b.c(new l(16, arr_b), arr_b.length - 16, c0, mp4Directory0);
                    return this;
                }
                case 3: {
                    com.drew.metadata.jpeg.b.e(new l(16, arr_b), ((U7.c)this.a), ((long)(arr_b.length - 16)), ((Mp4Directory)this.b));
                    return this;
                }
                case 8: {
                    L4.a.c(arr_b, 16, arr_b.length - 16, ((U7.c)this.a), ((Mp4Directory)this.b));
                    return this;
                }
                default: {
                    if(Long.compare(16L, arr_b.length) > 0) {
                        throw new EOFException("End of data reached.");
                    }
                    byte[] arr_b1 = new byte[16];
                    System.arraycopy(arr_b, 0, arr_b1, 0, 16);
                    ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b1);
                    String s1 = new UUID(byteBuffer0.getLong(), byteBuffer0.getLong()).toString();
                    int v1 = arr_b.length - 16;
                    if(16L + ((long)v1) > ((long)arr_b.length)) {
                        throw new EOFException("End of data reached.");
                    }
                    byte[] arr_b2 = new byte[v1];
                    System.arraycopy(arr_b, 16, arr_b2, 0, v1);
                    ((Mp4UuidBoxDirectory)mp4Directory0).setString(((int)Mp4UuidBoxDirectory.TAG_UUID), s1);
                    ((Mp4UuidBoxDirectory)mp4Directory0).setByteArray(((int)Mp4UuidBoxDirectory.TAG_USER_DATA), arr_b2);
                    return this;
                }
            }
        }
        return this;
    }

    @Override  // G0.a
    public final boolean w(String s) {
        return s.equals("uuid");
    }

    @Override  // G0.a
    public final boolean y(String s) {
        return false;
    }
}

