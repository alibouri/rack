package l4;

import java.io.EOFException;

public final class l extends i {
    public final byte[] b;
    public int c;

    public l(int v, byte[] arr_b) {
        arr_b.getClass();
        this.b = arr_b;
        this.c = v;
    }

    @Override  // l4.i
    public final void D(long v) {
        if(v < 0L) {
            throw new IllegalArgumentException("n must be zero or greater.");
        }
        int v1 = this.c;
        if(((long)v1) + v > ((long)this.b.length)) {
            throw new EOFException("End of data reached.");
        }
        this.c = (int)(((long)v1) + v);
    }

    @Override  // l4.i
    public final byte a() {
        int v = this.c;
        byte[] arr_b = this.b;
        if(v >= arr_b.length) {
            throw new EOFException("End of data reached.");
        }
        this.c = v + 1;
        return arr_b[v];
    }

    @Override  // l4.i
    public final byte[] c(int v) {
        int v1 = this.c;
        byte[] arr_b = this.b;
        if(((long)v1) + ((long)v) > ((long)arr_b.length)) {
            throw new EOFException("End of data reached.");
        }
        byte[] arr_b1 = new byte[v];
        System.arraycopy(arr_b, v1, arr_b1, 0, v);
        this.c += v;
        return arr_b1;
    }
}

