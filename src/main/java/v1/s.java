package v1;

import android.app.Notification.Action.Builder;
import android.app.Notification.Builder;
import android.app.NotificationManager;

public abstract class s {
    public static boolean a(NotificationManager notificationManager0) {
        return notificationManager0.areNotificationsEnabled();
    }

    public static void b(Notification.Action.Builder notification$Action$Builder0, boolean z) {
        notification$Action$Builder0.setAllowGeneratedReplies(z);
    }

    public static void c(Notification.Builder notification$Builder0) {
        notification$Builder0.setRemoteInputHistory(null);
    }
}

