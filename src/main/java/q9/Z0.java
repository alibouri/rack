package q9;

import Ab.t;
import Fb.j;
import W5.f;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;

public final class z0 extends j implements Function1 {
    public final int c0;
    public final Context d0;

    public z0(Context context0, g g0, int v) {
        this.c0 = v;
        this.d0 = context0;
        super(1, g0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        return this.c0 == 0 ? new z0(this.d0, ((g)object0), 0).v(t.a) : new z0(this.d0, ((g)object0), 1).v(t.a);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Context context0 = this.d0;
        if(this.c0 != 0) {
            f.b0(object0);
            return o0.w(context0);
        }
        f.b0(object0);
        NetworkInfo networkInfo0 = ((ConnectivityManager)context0.getSystemService("connectivity")).getActiveNetworkInfo();
        return networkInfo0 != null && networkInfo0.isConnectedOrConnecting() ? networkInfo0.getTypeName().toUpperCase() : null;
    }
}

