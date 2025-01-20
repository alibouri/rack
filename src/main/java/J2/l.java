package J2;

import Nb.j;
import W5.f;
import Xb.k;
import com.google.common.util.concurrent.ListenableFuture;
import f1.h;
import java.util.concurrent.ExecutionException;

public final class l implements Runnable {
    public final int X;
    public final ListenableFuture Y;
    public final k Z;

    public l(ListenableFuture listenableFuture0, k k0, int v) {
        this.X = v;
        this.Y = listenableFuture0;
        this.Z = k0;
        super();
    }

    @Override
    public final void run() {
        if(this.X != 0) {
            ListenableFuture listenableFuture0 = this.Y;
            boolean z = listenableFuture0.isCancelled();
            k k0 = this.Z;
            if(z) {
                k0.o(null);
                return;
            }
            try {
                k0.i(h.g(listenableFuture0));
                return;
            }
            catch(ExecutionException executionException0) {
                Throwable throwable0 = executionException0.getCause();
                if(throwable0 != null) {
                    k0.i(f.v(throwable0));
                    return;
                }
                j.n();
                throw null;
            }
        }
        ListenableFuture listenableFuture1 = this.Y;
        boolean z1 = listenableFuture1.isCancelled();
        k k1 = this.Z;
        if(z1) {
            k1.o(null);
            return;
        }
        try {
            k1.i(J.b(listenableFuture1));
        }
        catch(ExecutionException executionException1) {
            Throwable throwable1 = executionException1.getCause();
            j.c(throwable1);
            k1.i(f.v(throwable1));
        }
    }
}

