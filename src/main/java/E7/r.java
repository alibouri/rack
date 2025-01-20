package E7;

import I2.J;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.firebase.messaging.FirebaseMessaging;
import o6.e;

public final class r implements e {
    public final int X;
    public final FirebaseMessaging Y;

    public r(FirebaseMessaging firebaseMessaging0, int v) {
        this.X = v;
        this.Y = firebaseMessaging0;
        super();
    }

    @Override  // o6.e
    public final void k(Object object0) {
        if(this.X != 0) {
            FirebaseMessaging firebaseMessaging0 = this.Y;
            firebaseMessaging0.getClass();
            if(((CloudMessage)object0) != null) {
                J.J(((CloudMessage)object0).X);
                firebaseMessaging0.h();
            }
            return;
        }
        if(this.Y.e.i() && ((K)object0).h.a() != null && !((K)object0).g) {
            ((K)object0).h(0L);
        }
    }
}

