package m9;

import java.io.RandomAccessFile;
import java.security.MessageDigest;

public final class i extends a {
    public final int X;
    public Object Y;

    public i(int v) {
        this.X = v;
        super();
    }

    public i(int v, Object object0) {
        this.X = v;
        this.Y = object0;
        super();
    }

    @Override
    public void close() {
        if(this.X != 0) {
            super.close();
            return;
        }
        ((RandomAccessFile)this.Y).close();
    }

    @Override  // m9.a
    public final void write(byte[] arr_b, int v, int v1) {
        switch(this.X) {
            case 0: {
                ((RandomAccessFile)this.Y).write(arr_b, v, v1);
                return;
            }
            case 1: {
                ((MessageDigest)this.Y).update(arr_b, v, v1);
                return;
            }
            case 2: {
                ((j)this.Y).c0 += (long)v1;
                return;
            }
            default: {
                ((k)this.Y).a.a(arr_b, v, v1);
            }
        }
    }
}

