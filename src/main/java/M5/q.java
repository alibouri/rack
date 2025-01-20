package M5;

import L7.b;
import io.sentry.hints.i;

public final class q implements c {
    public final int a;
    public final Object b;

    public q(b b0, g3.b b1, i i0) {
        this.a = 1;
        super();
        this.b = b0;
    }

    public q(f f0) {
        this.a = 0;
        super();
        this.b = f0;
    }

    @Override  // M5.c
    public final void a(boolean z) {
        if(this.a != 0) {
            b b0 = (b)this.b;
            b0.getClass();
            if(!z) {
                b0.getClass();
            }
            return;
        }
        ((f)this.b).n.sendMessage(((f)this.b).n.obtainMessage(1, Boolean.valueOf(z)));
    }
}

