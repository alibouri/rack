package Ec;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

public final class i extends InputStream {
    public final int X;
    public final Closeable Y;

    public i(l l0, int v) {
        this.X = v;
        this.Y = l0;
        super();
    }

    public i(File file0) {
        this.X = 2;
        super();
        this.Y = new RandomAccessFile(file0, "r");
    }

    private final void a() {
    }

    @Override
    public int available() {
        switch(this.X) {
            case 0: {
                return (int)Math.min(((j)this.Y).Y, 0x7FFFFFFFL);
            }
            case 1: {
                F f0 = (F)this.Y;
                if(f0.Z) {
                    throw new IOException("closed");
                }
                return (int)Math.min(f0.Y.Y, 0x7FFFFFFFL);
            }
            default: {
                return super.available();
            }
        }
    }

    @Override
    public final void close() {
        switch(this.X) {
            case 0: {
                break;
            }
            case 1: {
                ((F)this.Y).close();
                break;
            }
            default: {
                ((RandomAccessFile)this.Y).close();
            }
        }
    }

    @Override
    public final int read() {
        switch(this.X) {
            case 0: {
                j j0 = (j)this.Y;
                return j0.Y <= 0L ? -1 : j0.G() & 0xFF;
            }
            case 1: {
                F f0 = (F)this.Y;
                if(f0.Z) {
                    throw new IOException("closed");
                }
                return f0.Y.Y != 0L || f0.X.M(f0.Y, 0x2000L) != -1L ? f0.Y.G() & 0xFF : -1;
            }
            default: {
                byte[] arr_b = new byte[1];
                return ((RandomAccessFile)this.Y).read(arr_b, 0, 1) == 1 ? arr_b[0] : -1;
            }
        }
    }

    @Override
    public int read(byte[] arr_b) {
        return this.X == 2 ? ((RandomAccessFile)this.Y).read(arr_b, 0, arr_b.length) : super.read(arr_b);
    }

    @Override
    public final int read(byte[] arr_b, int v, int v1) {
        switch(this.X) {
            case 0: {
                Nb.j.f(arr_b, "sink");
                return ((j)this.Y).read(arr_b, v, v1);
            }
            case 1: {
                Nb.j.f(arr_b, "data");
                F f0 = (F)this.Y;
                if(f0.Z) {
                    throw new IOException("closed");
                }
                b.e(arr_b.length, v, v1);
                return f0.Y.Y != 0L || f0.X.M(f0.Y, 0x2000L) != -1L ? f0.Y.read(arr_b, v, v1) : -1;
            }
            default: {
                return ((RandomAccessFile)this.Y).read(arr_b, v, v1);
            }
        }
    }

    @Override
    public String toString() {
        switch(this.X) {
            case 0: {
                return ((j)this.Y) + ".inputStream()";
            }
            case 1: {
                return ((F)this.Y) + ".inputStream()";
            }
            default: {
                return super.toString();
            }
        }
    }
}

