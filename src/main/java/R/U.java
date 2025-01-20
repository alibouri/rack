package r;

import android.os.CancellationSignal;

public abstract class u {
    public static void a(CancellationSignal cancellationSignal0) {
        cancellationSignal0.cancel();
    }

    public static CancellationSignal b() {
        return new CancellationSignal();
    }
}

