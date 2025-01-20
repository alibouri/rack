package rc;

import Nb.j;
import java.util.concurrent.ThreadFactory;

public final class a implements ThreadFactory {
    public final String a;
    public final boolean b;

    public a(String s, boolean z) {
        this.a = s;
        this.b = z;
    }

    @Override
    public final Thread newThread(Runnable runnable0) {
        j.f(this.a, "$name");
        Thread thread0 = new Thread(runnable0, this.a);
        thread0.setDaemon(this.b);
        return thread0;
    }
}

