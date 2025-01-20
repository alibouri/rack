package T1;

import Nb.j;
import java.io.FileOutputStream;
import java.io.OutputStream;

public final class o extends OutputStream {
    public final FileOutputStream X;

    public o(FileOutputStream fileOutputStream0) {
        this.X = fileOutputStream0;
    }

    @Override
    public final void close() {
    }

    @Override
    public final void flush() {
        this.X.flush();
    }

    @Override
    public final void write(int v) {
        this.X.write(v);
    }

    @Override
    public final void write(byte[] arr_b) {
        j.f(arr_b, "b");
        this.X.write(arr_b);
    }

    @Override
    public final void write(byte[] arr_b, int v, int v1) {
        j.f(arr_b, "bytes");
        this.X.write(arr_b, v, v1);
    }
}

