package N5;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

public abstract class l {
    public Boolean a;
    public boolean b;
    public final e c;
    public final int d;
    public final Bundle e;
    public final e f;

    public l(e e0, int v, Bundle bundle0) {
        this.f = e0;
        this.c = e0;
        this.a = Boolean.TRUE;
        this.b = false;
        this.d = v;
        this.e = bundle0;
    }

    public abstract void a(ConnectionResult arg1);

    public abstract boolean b();

    public final void c() {
        synchronized(this) {
            this.a = null;
        }
    }

    public final void d() {
        this.c();
        synchronized(this.c.j0) {
            this.c.j0.remove(this);
        }
    }
}

