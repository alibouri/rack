package hb;

import E7.w;
import Nb.j;
import io.sentry.P0;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.y1;
import q9.C3;

public final class l implements P0 {
    public final int X;
    public final C3 Y;

    public l(int v, C3 c30) {
        this.X = v;
        this.Y = c30;
    }

    @Override  // io.sentry.P0
    public final void c(y1 y10) {
        j.f(((SentryAndroidOptions)y10), "it");
        ((SentryAndroidOptions)y10).setEnvironment("production");
        ((SentryAndroidOptions)y10).setAttachStacktrace(true);
        if(this.X != 2) {
            ((SentryAndroidOptions)y10).setDsn("https://bccbc221eb904011a25ce144e5c15ed1@o407766.ingest.sentry.io/5419911");
        }
        ((SentryAndroidOptions)y10).setBeforeSend(new w(16, this.Y));
    }
}

