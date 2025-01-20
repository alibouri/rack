package m9;

import java.io.OutputStream;

public abstract class a extends OutputStream {
    @Override
    public final void write(int v) {
        this.write(new byte[]{((byte)v)}, 0, 1);
    }

    @Override
    public final void write(byte[] arr_b) {
        this.write(arr_b, 0, arr_b.length);
    }

    @Override
    public abstract void write(byte[] arg1, int arg2, int arg3);
}

