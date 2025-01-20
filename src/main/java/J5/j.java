package J5;

import E7.B;
import android.os.Bundle;
import android.util.Log;
import o6.i;

public final class j {
    public final int a;
    public final i b;
    public final int c;
    public final Bundle d;
    public final int e;

    public j(int v, int v1, Bundle bundle0, int v2) {
        this.e = v2;
        super();
        this.b = new i();
        this.a = v;
        this.c = v1;
        this.d = bundle0;
    }

    public final boolean a() {
        return this.e == 0;
    }

    public final void b(B b0) {
        if(Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + this.toString() + " with " + b0.toString());
        }
        this.b.a(b0);
    }

    public final void c(Bundle bundle0) {
        if(Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + this.toString() + " with " + bundle0);
        }
        this.b.b(bundle0);
    }

    @Override
    public final String toString() {
        return "Request { what=" + this.c + " id=" + this.a + " oneWay=" + this.a() + "}";
    }
}

