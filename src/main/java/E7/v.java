package E7;

import U7.b;
import Z6.g;
import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.concurrent.Executor;
import m7.e;
import m7.r;
import v7.c;
import v7.d;

public final class v implements e {
    public final int X;
    public final r Y;

    public v(r r0, int v) {
        this.X = v;
        this.Y = r0;
        super();
    }

    @Override  // m7.e
    public final Object d(C c0) {
        switch(this.X) {
            case 0: {
                return FirebaseMessagingRegistrar.lambda$getComponents$0(this.Y, c0);
            }
            case 1: {
                return FirebasePerfRegistrar.lambda$getComponents$0(this.Y, c0);
            }
            case 2: {
                return RemoteConfigRegistrar.lambda$getComponents$0(this.Y, c0);
            }
            default: {
                return new c(((Context)c0.a(Context.class)), ((g)c0.a(g.class)).d(), c0.Q(d.class), c0.l(b.class), ((Executor)c0.k(this.Y)));
            }
        }
    }
}

