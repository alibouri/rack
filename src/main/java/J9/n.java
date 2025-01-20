package J9;

import Ab.t;
import Fb.j;
import T5.a;
import W5.f;
import Xb.G;
import com.google.firebase.messaging.FirebaseMessaging;
import hd.c;
import java.util.concurrent.Executors;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import o6.i;
import o6.k;

public final class n extends j implements Function2 {
    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((n)this.t(((G)object0), ((g)object1))).v(t.a);
        return t.a;
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new n(2, g0);  // initializer: LFb/j;-><init>(ILkotlin/coroutines/g;)V
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        try {
            FirebaseMessaging firebaseMessaging0 = FirebaseMessaging.c();
            if(firebaseMessaging0.g() == null) {
                k.e(null);
            }
            else {
                i i0 = new i();
                Executors.newSingleThreadExecutor(new a("Firebase-Messaging-Network-Io")).execute(new E7.t(firebaseMessaging0, i0, 0));
            }
            c.a.n("PushNotificationManager");
            c.a.g("Firebase token deleted", new Object[0]);
        }
        catch(Exception exception0) {
            c.a.n("PushNotificationManager");
            c.a.d("Unable to delete firebase token because: " + exception0, new Object[0]);
        }
        return t.a;
    }
}

