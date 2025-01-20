package E5;

import N5.r;
import android.content.Context;
import android.util.LogPrinter;
import com.google.android.gms.internal.gtm.zzau;
import java.util.concurrent.CopyOnWriteArrayList;

public final class k {
    public final Context a;
    public final h b;
    public volatile zzau c;
    public Thread.UncaughtExceptionHandler d;
    public static volatile k e;

    public k(Context context0) {
        Context context1 = context0.getApplicationContext();
        r.j(context1);
        this.a = context1;
        this.b = new h(this);
        new CopyOnWriteArrayList();
        new LogPrinter(4, "GA/LogCatTransport");
    }

    public static void a() {
        if(!(Thread.currentThread() instanceof j)) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }
}

