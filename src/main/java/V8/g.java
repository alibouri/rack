package v8;

import a5.c;
import android.app.Activity;
import android.os.Handler;

public final class g {
    public final Activity a;
    public final c b;
    public boolean c;
    public final Handler d;
    public final Runnable e;
    public boolean f;

    public g(Activity activity0, Runnable runnable0) {
        this.c = false;
        this.a = activity0;
        this.e = runnable0;
        this.b = new c(15, this);
        this.d = new Handler();
    }

    public final void a() {
        this.d.removeCallbacksAndMessages(null);
        if(this.c) {
            this.a.unregisterReceiver(this.b);
            this.c = false;
        }
    }
}

