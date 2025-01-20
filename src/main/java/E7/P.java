package E7;

import android.os.Build.VERSION;
import android.os.StrictMode.ThreadPolicy.Builder;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import n7.f;
import x7.a;

public final class p implements a {
    public final int a;

    public p(int v) {
        this.a = v;
        super();
    }

    @Override  // x7.a
    public final Object get() {
        switch(this.a) {
            case 0: {
                return null;
            }
            case 1: {
                return Executors.newSingleThreadScheduledExecutor();
            }
            case 2: {
                return GaugeManager.lambda$new$0();
            }
            case 3: {
                return GaugeManager.lambda$new$1();
            }
            case 4: {
                return null;
            }
            case 5: {
                return Collections.emptySet();
            }
            case 6: {
                return null;
            }
            case 7: {
                StrictMode.ThreadPolicy.Builder strictMode$ThreadPolicy$Builder0 = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                int v = Build.VERSION.SDK_INT;
                strictMode$ThreadPolicy$Builder0.detectResourceMismatches();
                if(v >= 26) {
                    strictMode$ThreadPolicy$Builder0.detectUnbufferedIo();
                }
                return new f(Executors.newFixedThreadPool(4, new n7.a("Firebase Background", 10, strictMode$ThreadPolicy$Builder0.penaltyLog().build())), ((ScheduledExecutorService)ExecutorsRegistrar.d.get()));
            }
            case 8: {
                return new f(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new n7.a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), ((ScheduledExecutorService)ExecutorsRegistrar.d.get()));
            }
            case 9: {
                return new f(Executors.newCachedThreadPool(new n7.a("Firebase Blocking", 11, null)), ((ScheduledExecutorService)ExecutorsRegistrar.d.get()));
            }
            default: {
                return Executors.newSingleThreadScheduledExecutor(new n7.a("Firebase Scheduler", 0, null));
            }
        }
    }
}

