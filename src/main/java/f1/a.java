package f1;

import java.util.concurrent.CancellationException;

public final class a {
    public final boolean a;
    public final CancellationException b;
    public static final a c;
    public static final a d;

    static {
        if(h.b0) {
            a.d = null;
            a.c = null;
            return;
        }
        a.d = new a(false, null);
        a.c = new a(true, null);
    }

    public a(boolean z, CancellationException cancellationException0) {
        this.a = z;
        this.b = cancellationException0;
    }
}

