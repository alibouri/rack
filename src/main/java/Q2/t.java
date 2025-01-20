package q2;

import Nb.j;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

public final class t extends RemoteCallbackList {
    public final MultiInstanceInvalidationService a;

    public t(MultiInstanceInvalidationService multiInstanceInvalidationService0) {
        this.a = multiInstanceInvalidationService0;
        super();
    }

    @Override  // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface0, Object object0) {
        j.f(((m)iInterface0), "callback");
        j.f(object0, "cookie");
        this.a.Y.remove(((Integer)object0));
    }
}

