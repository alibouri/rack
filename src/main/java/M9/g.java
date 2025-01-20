package m9;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import v.h;

public final class g extends a {
    public final c X;
    public final ByteBuffer Y;
    public int Z;
    public final byte[] b0;
    public String c0;
    public int d0;
    public long e0;

    public g(c c0) {
        this.Y = ByteBuffer.allocate(0x4000).order(ByteOrder.BIG_ENDIAN);
        this.b0 = new byte[4];
        this.X = c0;
        this.a(1);
    }

    public final void a(int v) {
        int v1;
        this.Z = v;
        ByteBuffer byteBuffer0 = this.Y;
        byteBuffer0.rewind();
        if(v == 3) {
            v1 = this.d0;
        }
        else {
            switch(v) {
                case 1: {
                    v1 = 4;
                    break;
                }
                case 2: {
                    v1 = 2;
                    break;
                }
                case 4: {
                    v1 = 8;
                    break;
                }
                default: {
                    if(v != 5) {
                        throw null;
                    }
                    v1 = 0;
                    break;
                }
            }
        }
        byteBuffer0.limit(v1);
    }

    @Override
    public final void close() {
        c c0 = this.X;
        if(c0.b != null) {
            c0.a();
        }
        i i0 = c0.c;
        int v = (int)((RandomAccessFile)i0.Y).getFilePointer();
        ArrayList arrayList0 = c0.a;
        for(Object object0: arrayList0) {
            ((b)object0).getClass();
            ByteBuffer byteBuffer0 = ByteBuffer.allocate(46).order(ByteOrder.LITTLE_ENDIAN);
            byteBuffer0.put(c.l);
            byteBuffer0.putShort(20);
            byteBuffer0.putShort(20);
            byteBuffer0.putShort(((b)object0).c);
            byteBuffer0.putShort(((short)(((b)object0).b ? 8 : 0)));
            byteBuffer0.putShort(0);
            byteBuffer0.putShort(33);
            byteBuffer0.putInt(((b)object0).d);
            byteBuffer0.putInt(((b)object0).e);
            byteBuffer0.putInt(((b)object0).f);
            byteBuffer0.putShort(((short)((b)object0).a.length));
            byteBuffer0.putShort(0);
            byteBuffer0.putShort(0);
            byteBuffer0.putShort(0);
            byteBuffer0.putShort(0);
            byteBuffer0.putInt(0);
            byteBuffer0.putInt(((b)object0).g);
            byte[] arr_b = byteBuffer0.array();
            ((b)object0).h.c.write(arr_b, 0, 46);
            ((b)object0).h.c.write(((b)object0).a, 0, ((b)object0).a.length);
        }
        int v1 = ((int)((RandomAccessFile)i0.Y).getFilePointer()) - v;
        ByteBuffer byteBuffer1 = ByteBuffer.allocate(22).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer1.put(c.m);
        byteBuffer1.putShort(0);
        byteBuffer1.putShort(0);
        byteBuffer1.putShort(((short)arrayList0.size()));
        byteBuffer1.putShort(((short)arrayList0.size()));
        byteBuffer1.putInt(v1);
        byteBuffer1.putInt(v);
        byteBuffer1.putShort(0);
        i0.write(byteBuffer1.array(), 0, 22);
        i0.close();
    }

    @Override  // m9.a
    public final void write(byte[] arr_b, int v, int v1) {
        if(v + v1 > arr_b.length) {
            throw new IOException("Count exceeds end of input array");
        }
        int v2 = v;
        int v3 = v1;
        while(v3 > 0) {
            c c0 = this.X;
            if(this.Z == 5) {
                long v4 = this.e0;
                int v5 = Math.min(((int)Math.min(this.e0, 0x7FFFFFFFL)), v3);
                Deflater deflater0 = c0.g;
                i i0 = c0.c;
                if(deflater0 == null) {
                    i0.write(arr_b, v2, v5);
                    c0.f += v5;
                }
                else {
                    deflater0.setInput(arr_b, v2, v5);
                    while(true) {
                        byte[] arr_b1 = c0.h;
                        int v6 = c0.g.deflate(arr_b1);
                        if(v6 <= 0) {
                            break;
                        }
                        i0.write(arr_b1, 0, v6);
                        c0.f += v6;
                    }
                }
                c0.d.update(arr_b, v2, v5);
                c0.e += v5;
                v2 += v5;
                v3 -= v5;
                long v7 = v4 - ((long)v5);
                this.e0 = v7;
                if(v7 != 0L) {
                    continue;
                }
                this.a(2);
            }
            else {
                ByteBuffer byteBuffer0 = this.Y;
                int v8 = Math.min(byteBuffer0.remaining(), v3);
                byteBuffer0.put(arr_b, v2, v8);
                v2 += v8;
                v3 -= v8;
                if(byteBuffer0.remaining() == 0) {
                    byteBuffer0.flip();
                    int v9 = h.d(this.Z);
                    if(v9 == 0) {
                        byteBuffer0.get(this.b0, 0, 4);
                        if(!Arrays.equals(this.b0, m9.h.g)) {
                            throw new IOException("Invalid dtar file header");
                        }
                        this.a(2);
                    }
                    else {
                        switch(v9) {
                            case 1: {
                                this.d0 = byteBuffer0.getShort(0) & 0xFFFF;
                                this.a(3);
                                break;
                            }
                            case 2: {
                                this.c0 = new String(byteBuffer0.array(), 0, this.d0, e.b);
                                this.a(4);
                                break;
                            }
                            case 3: {
                                this.e0 = byteBuffer0.getLong(0);
                                String s = this.c0;
                                if(c0.b != null) {
                                    c0.a();
                                }
                                int v10 = s.lastIndexOf(".");
                                b b0 = new b(c0, s, ((boolean)((v10 < 0 || !c.i.contains(s.substring(v10 + 1)) ? 0 : 1) ^ 1)));
                                c0.b = b0;
                                c0.a.add(b0);
                                long v11 = ((RandomAccessFile)c0.c.Y).getFilePointer();
                                b b1 = c0.b;
                                long v12 = v11 + ((long)(b1.a.length + 30));
                                int v13 = b1.b ? 0 : ((short)(((int)(3L - (v12 + 3L) % 4L))));
                                b1.g = (int)((RandomAccessFile)b1.h.c.Y).getFilePointer();
                                ByteBuffer byteBuffer1 = ByteBuffer.allocate(30).order(ByteOrder.LITTLE_ENDIAN);
                                byteBuffer1.put(c.j);
                                byteBuffer1.putShort(20);
                                byteBuffer1.putShort(b1.c);
                                byteBuffer1.putShort(((short)(b1.b ? 8 : 0)));
                                byteBuffer1.putShort(0);
                                byteBuffer1.putShort(33);
                                byteBuffer1.putInt(0);
                                byteBuffer1.putInt(0);
                                byteBuffer1.putInt(0);
                                byteBuffer1.putShort(((short)b1.a.length));
                                byteBuffer1.putShort(((short)v13));
                                byte[] arr_b2 = byteBuffer1.array();
                                b1.h.c.write(arr_b2, 0, 30);
                                b1.h.c.write(b1.a, 0, b1.a.length);
                                b1.h.c.write(c.n, 0, v13);
                                c0.d = new CRC32();
                                c0.g = c0.b.b ? new Deflater(9, true) : null;
                                c0.e = 0;
                                c0.f = 0;
                                this.a(5);
                            }
                        }
                    }
                    continue;
                }
            }
        }
    }
}

