package M5;

import L5.j;
import L5.k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import io.sentry.internal.debugmeta.c;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import o6.i;
import v7.d;

public final class n implements j {
    public final int a;
    public final BasePendingResult b;
    public final Object c;

    public n(BasePendingResult basePendingResult0, i i0, d d0) {
        this.a = 1;
        super();
        this.b = basePendingResult0;
        this.c = i0;
    }

    public n(c c0, BasePendingResult basePendingResult0) {
        this.a = 0;
        super();
        this.c = c0;
        this.b = basePendingResult0;
    }

    @Override  // L5.j
    public final void a(Status status0) {
        if(this.a != 0) {
            i i0 = (i)this.c;
            if(status0.X <= 0) {
                this.b.await(0L, TimeUnit.MILLISECONDS);
                i0.b(null);
                return;
            }
            L5.d d0 = status0.Z == null ? new L5.d(status0) : new k(status0);  // initializer: LL5/d;-><init>(Lcom/google/android/gms/common/api/Status;)V
            i0.a(d0);
            return;
        }
        ((Map)((c)this.c).Y).remove(this.b);
    }
}

