package X1;

import android.os.Trace;
import com.google.android.gms.internal.measurement.K1;

public final class l implements Runnable {
    public final int X;

    public l(int v) {
        this.X = v;
        super();
    }

    @Override
    public final void run() {
        if(this.X != 0) {
            K1.i.incrementAndGet();
            return;
        }
        try {
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
        }
        finally {
            Trace.endSection();
        }
    }
}

