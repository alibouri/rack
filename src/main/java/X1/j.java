package X1;

import R2.f;
import R2.h;
import java.util.concurrent.ThreadPoolExecutor;

public final class j extends f {
    public final f a;
    public final ThreadPoolExecutor b;

    public j(f f0, ThreadPoolExecutor threadPoolExecutor0) {
        this.a = f0;
        this.b = threadPoolExecutor0;
    }

    @Override  // R2.f
    public final void v(Throwable throwable0) {
        try {
            this.a.v(throwable0);
        }
        finally {
            this.b.shutdown();
        }
    }

    @Override  // R2.f
    public final void w(h h0) {
        try {
            this.a.w(h0);
        }
        finally {
            this.b.shutdown();
        }
    }
}

