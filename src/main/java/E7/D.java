package E7;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class d extends FilterInputStream {
    public long X;
    public long Y;

    public d(InputStream inputStream0) {
        super(inputStream0);
        this.Y = -1L;
        this.X = 0x100001L;
    }

    @Override
    public final int available() {
        return (int)Math.min(this.in.available(), this.X);
    }

    @Override
    public final void mark(int v) {
        synchronized(this) {
            this.in.mark(v);
            this.Y = this.X;
        }
    }

    @Override
    public final int read() {
        if(Long.compare(this.X, 0L) == 0) {
            return -1;
        }
        int v = this.in.read();
        if(v != -1) {
            --this.X;
        }
        return v;
    }

    @Override
    public final int read(byte[] arr_b, int v, int v1) {
        long v2 = this.X;
        if(Long.compare(v2, 0L) == 0) {
            return -1;
        }
        int v3 = this.in.read(arr_b, v, ((int)Math.min(v1, v2)));
        if(v3 != -1) {
            this.X -= (long)v3;
        }
        return v3;
    }

    @Override
    public final void reset() {
        synchronized(this) {
            if(this.in.markSupported()) {
                if(this.Y == -1L) {
                    throw new IOException("Mark not set");
                }
                this.in.reset();
                this.X = this.Y;
                return;
            }
        }
        throw new IOException("Mark not supported");
    }

    @Override
    public final long skip(long v) {
        long v1 = this.in.skip(Math.min(v, this.X));
        this.X -= v1;
        return v1;
    }
}

