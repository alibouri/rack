package Z6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.atomic.AtomicReference;
import s.d;

public final class f extends BroadcastReceiver {
    public final Context a;
    public static final AtomicReference b;

    static {
        f.b = new AtomicReference();
    }

    public f(Context context0) {
        this.a = context0;
    }

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        synchronized(g.k) {
            for(Object object1: ((d)g.l.values())) {
                ((g)object1).e();
            }
        }
        this.a.unregisterReceiver(this);
    }
}

