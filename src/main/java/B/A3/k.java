package a3;

import java.io.InputStream;

public final class k extends InputStream {
    public final InputStream X;
    public int Y;

    public k(InputStream inputStream0) {
        this.X = inputStream0;
        this.Y = 0x40000000;
    }

    @Override
    public final int available() {
        return this.Y;
    }

    @Override
    public final void close() {
        this.X.close();
    }

    @Override
    public final int read() {
        int v = this.X.read();
        if(v == -1) {
            this.Y = 0;
        }
        return v;
    }

    @Override
    public final int read(byte[] arr_b) {
        int v = this.X.read(arr_b);
        if(v == -1) {
            this.Y = 0;
        }
        return v;
    }

    @Override
    public final int read(byte[] arr_b, int v, int v1) {
        int v2 = this.X.read(arr_b, v, v1);
        if(v2 == -1) {
            this.Y = 0;
        }
        return v2;
    }

    @Override
    public final long skip(long v) {
        return this.X.skip(v);
    }
}

