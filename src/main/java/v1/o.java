package v1;

import O3.j;
import R2.h;
import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;

public final class o extends j {
    public CharSequence Z;

    @Override  // O3.j
    public final void i(h h0) {
        new Notification.BigTextStyle(((Notification.Builder)h0.b)).setBigContentTitle(null).bigText(this.Z);
    }

    @Override  // O3.j
    public final String l() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}

