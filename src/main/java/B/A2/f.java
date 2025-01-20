package a2;

import java.io.InputStream;

public final class f extends b {
    public f(InputStream inputStream0) {
        super(inputStream0);
        if(!inputStream0.markSupported()) {
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
        this.X.mark(0x7FFFFFFF);
    }

    public f(byte[] arr_b) {
        super(arr_b);
        this.X.mark(0x7FFFFFFF);
    }

    public final void b(long v) {
        int v1 = this.Y;
        if(((long)v1) > v) {
            this.Y = 0;
            this.X.reset();
        }
        else {
            v -= (long)v1;
        }
        this.a(((int)v));
    }
}

