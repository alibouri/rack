package I5;

import A7.b;
import L5.i;
import M5.f;
import android.content.Context;
import android.os.Message;
import java.util.Iterator;

public abstract class g {
    public static final b a;

    static {
        g.a = new b("GoogleSignInCommon", new String[0]);
    }

    public static void a(Context context0) {
        h.x(context0).y();
        Iterator iterator0 = i.a().iterator();
        if(!iterator0.hasNext()) {
            synchronized(f.r) {
                f f0 = f.s;
                if(f0 != null) {
                    f0.i.incrementAndGet();
                    Message message0 = f0.n.obtainMessage(10);
                    f0.n.sendMessageAtFrontOfQueue(message0);
                }
            }
            return;
        }
        Object object1 = iterator0.next();
        ((i)object1).getClass();
        throw new UnsupportedOperationException();
    }
}

