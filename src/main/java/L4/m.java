package l4;

import java.io.EOFException;
import java.io.InputStream;

public final class m extends i {
    public final InputStream b;
    public long c;

    public m(InputStream inputStream0) {
        inputStream0.getClass();
        this.b = inputStream0;
        this.c = 0L;
    }

    @Override  // l4.i
    public final void D(long v) {
        if(v < 0L) {
            throw new IllegalArgumentException("n must be zero or greater.");
        }
        long v1 = this.G(v);
        if(v1 != v) {
            throw new EOFException(String.format("Unable to skip. Requested %d bytes but only %d remained.", v, v1));
        }
    }

    public final void F(byte[] arr_b, int v, int v1) {
        int v2;
        for(v2 = 0; v2 != v1; v2 += v3) {
            int v3 = this.b.read(arr_b, v + v2, v1 - v2);
            if(v3 == -1) {
                throw new EOFException("End of data reached.");
            }
        }
        this.c += (long)v2;
    }

    public final long G(long v) {
        long v1 = 0L;
        while(v1 != v) {
            long v2 = this.b.skip(v - v1);
            v1 += v2;
            if(v2 == 0L) {
                break;
            }
        }
        this.c += v1;
        return v1;
    }

    @Override  // l4.i
    public final byte a() {
        int v = this.b.read();
        if(v == -1) {
            throw new EOFException("End of data reached.");
        }
        ++this.c;
        return (byte)v;
    }

    @Override  // l4.i
    public final byte[] c(int v) {
        try {
            byte[] arr_b = new byte[v];
            this.F(arr_b, 0, v);
            return arr_b;
        }
        catch(OutOfMemoryError unused_ex) {
            throw new EOFException("End of data reached.");
        }
    }
}

