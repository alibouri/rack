package a8;

import Xb.H;
import Xb.J;
import Z6.g;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import c8.j;
import kotlin.coroutines.CoroutineContext;

public final class m {
    public final g a;
    public final j b;

    public m(g g0, j j0, CoroutineContext coroutineContext0, T t0) {
        this.a = g0;
        this.b = j0;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        g0.a();
        Context context0 = g0.a.getApplicationContext();
        if(context0 instanceof Application) {
            ((Application)context0).registerActivityLifecycleCallbacks(V.X);
            J.q(H.a(coroutineContext0), null, null, new l(this, coroutineContext0, t0, null), 3);
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + context0.getClass() + '.');
    }
}

