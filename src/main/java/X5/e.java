package x5;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;
import q9.c3;
import r5.i;
import z5.a;
import z5.c;

public final class e implements Runnable {
    public final h X;
    public final i Y;
    public final int Z;
    public final Runnable b0;

    public e(h h0, i i0, int v, Runnable runnable0) {
        this.X = h0;
        this.Y = i0;
        this.Z = v;
        this.b0 = runnable0;
    }

    @Override
    public final void run() {
        h h0;
        Runnable runnable0;
        int v1;
        i i0;
        try {
            i0 = this.Y;
            v1 = this.Z;
            runnable0 = this.b0;
            h0 = this.X;
            c c0 = h0.f;
            Objects.requireNonNull(h0.c);
            ((y5.h)c0).q(new c3(3, h0.c));
            NetworkInfo networkInfo0 = ((ConnectivityManager)h0.a.getSystemService("connectivity")).getActiveNetworkInfo();
            if(networkInfo0 == null || !networkInfo0.isConnected()) {
                ((y5.h)c0).q(new f(h0, i0, v1));
            }
            else {
                h0.a(i0, v1);
            }
        }
        catch(a unused_ex) {
            h0.d.a(i0, v1 + 1, false);
        }
        finally {
            runnable0.run();
        }
    }
}

