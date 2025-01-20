package a2;

import M.J;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

public class b extends InputStream implements DataInput {
    public final DataInputStream X;
    public int Y;
    public ByteOrder Z;
    public byte[] b0;
    public final int c0;

    public b(InputStream inputStream0) {
        this(inputStream0, ByteOrder.BIG_ENDIAN);
    }

    public b(InputStream inputStream0, ByteOrder byteOrder0) {
        DataInputStream dataInputStream0 = new DataInputStream(inputStream0);
        this.X = dataInputStream0;
        dataInputStream0.mark(0);
        this.Y = 0;
        this.Z = byteOrder0;
        this.c0 = inputStream0 instanceof b ? ((b)inputStream0).c0 : -1;
    }

    public b(byte[] arr_b) {
        this(new ByteArrayInputStream(arr_b), ByteOrder.BIG_ENDIAN);
        this.c0 = arr_b.length;
    }

    public final void a(int v) {
        int v1;
        for(v1 = 0; v1 < v; v1 += v3) {
            DataInputStream dataInputStream0 = this.X;
            int v2 = v - v1;
            int v3 = (int)dataInputStream0.skip(((long)v2));
            if(v3 <= 0) {
                if(this.b0 == null) {
                    this.b0 = new byte[0x2000];
                }
                v3 = dataInputStream0.read(this.b0, 0, Math.min(0x2000, v2));
                if(v3 == -1) {
                    throw new EOFException(J.d(v, "Reached EOF while skipping ", " bytes."));
                }
            }
        }
        this.Y += v1;
    }

    @Override
    public final int available() {
        return this.X.available();
    }

    @Override
    public final void mark(int v) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override
    public final int read() {
        ++this.Y;
        return this.X.read();
    }

    @Override
    public final int read(byte[] arr_b, int v, int v1) {
        int v2 = this.X.read(arr_b, v, v1);
        this.Y += v2;
        return v2;
    }

    @Override
    public final boolean readBoolean() {
        ++this.Y;
        return this.X.readBoolean();
    }

    @Override
    public final byte readByte() {
        ++this.Y;
        int v = this.X.read();
        if(v < 0) {
            throw new EOFException();
        }
        return (byte)v;
    }

    @Override
    public final char readChar() {
        this.Y += 2;
        return this.X.readChar();
    }

    @Override
    public final double readDouble() {
        return Double.longBitsToDouble(this.readLong());
    }

    @Override
    public final float readFloat() {
        return Float.intBitsToFloat(this.readInt());
    }

    @Override
    public final void readFully(byte[] arr_b) {
        this.Y += arr_b.length;
        this.X.readFully(arr_b);
    }

    @Override
    public final void readFully(byte[] arr_b, int v, int v1) {
        this.Y += v1;
        this.X.readFully(arr_b, v, v1);
    }

    @Override
    public final int readInt() {
        this.Y += 4;
        int v = this.X.read();
        int v1 = this.X.read();
        int v2 = this.X.read();
        int v3 = this.X.read();
        if((v | v1 | v2 | v3) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder0 = this.Z;
        if(byteOrder0 == ByteOrder.LITTLE_ENDIAN) {
            return (v3 << 24) + (v2 << 16) + (v1 << 8) + v;
        }
        if(byteOrder0 != ByteOrder.BIG_ENDIAN) {
            throw new IOException("Invalid byte order: " + this.Z);
        }
        return (v << 24) + (v1 << 16) + (v2 << 8) + v3;
    }

    @Override
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override
    public final long readLong() {
        this.Y += 8;
        int v = this.X.read();
        int v1 = this.X.read();
        int v2 = this.X.read();
        int v3 = this.X.read();
        int v4 = this.X.read();
        int v5 = this.X.read();
        int v6 = this.X.read();
        int v7 = this.X.read();
        if((v | v1 | v2 | v3 | v4 | v5 | v6 | v7) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder0 = this.Z;
        if(byteOrder0 == ByteOrder.LITTLE_ENDIAN) {
            return (((long)v7) << 56) + (((long)v6) << 0x30) + (((long)v5) << 40) + (((long)v4) << 0x20) + (((long)v3) << 24) + (((long)v2) << 16) + (((long)v1) << 8) + ((long)v);
        }
        if(byteOrder0 != ByteOrder.BIG_ENDIAN) {
            throw new IOException("Invalid byte order: " + this.Z);
        }
        return (((long)v) << 56) + (((long)v1) << 0x30) + (((long)v2) << 40) + (((long)v3) << 0x20) + (((long)v4) << 24) + (((long)v5) << 16) + (((long)v6) << 8) + ((long)v7);
    }

    @Override
    public final short readShort() {
        this.Y += 2;
        int v = this.X.read();
        int v1 = this.X.read();
        if((v | v1) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder0 = this.Z;
        if(byteOrder0 == ByteOrder.LITTLE_ENDIAN) {
            return (short)((v1 << 8) + v);
        }
        if(byteOrder0 != ByteOrder.BIG_ENDIAN) {
            throw new IOException("Invalid byte order: " + this.Z);
        }
        return (short)((v << 8) + v1);
    }

    @Override
    public final String readUTF() {
        this.Y += 2;
        return this.X.readUTF();
    }

    @Override
    public final int readUnsignedByte() {
        ++this.Y;
        return this.X.readUnsignedByte();
    }

    @Override
    public final int readUnsignedShort() {
        this.Y += 2;
        int v = this.X.read();
        int v1 = this.X.read();
        if((v | v1) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder0 = this.Z;
        if(byteOrder0 == ByteOrder.LITTLE_ENDIAN) {
            return (v1 << 8) + v;
        }
        if(byteOrder0 != ByteOrder.BIG_ENDIAN) {
            throw new IOException("Invalid byte order: " + this.Z);
        }
        return (v << 8) + v1;
    }

    @Override
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override
    public final int skipBytes(int v) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }
}

