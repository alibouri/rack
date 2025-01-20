package M5;

import L5.l;
import a6.d;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

public final class e extends d {
    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        int v = message0.what;
        switch(v) {
            case 1: {
                Pair pair0 = (Pair)message0.obj;
                if(pair0.first != null) {
                    throw new ClassCastException();
                }
                l l0 = (l)pair0.second;
                throw null;
            }
            case 2: {
                ((BasePendingResult)message0.obj).forceFailureUnlessReady(Status.f0);
                return;
            }
            default: {
                Log.wtf("BasePendingResult", "Don\'t know how to handle message: " + v, new Exception());
            }
        }
    }
}

