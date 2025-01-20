package W3;

import Nb.j;
import Xb.h0;
import java.io.Closeable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class b implements Closeable {
    public boolean X;
    public final h0 Y;

    public b() {
        ExecutorService executorService0 = Executors.newSingleThreadExecutor();
        j.e(executorService0, "newSingleThreadExecutor(...)");
        this.Y = new h0(executorService0);
    }

    @Override
    public final void close() {
        if(!this.X) {
            this.Y.close();
            this.X = true;
        }
    }
}

