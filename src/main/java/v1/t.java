package v1;

import android.app.Notification.Builder;
import android.app.NotificationManager;
import android.content.Context;
import java.util.List;

public abstract class t {
    public static Notification.Builder a(Context context0, String s) {
        return new Notification.Builder(context0, s);
    }

    public static List b(NotificationManager notificationManager0) {
        return notificationManager0.getNotificationChannels();
    }

    public static void c(Notification.Builder notification$Builder0) {
        notification$Builder0.setBadgeIconType(0);
    }

    public static void d(Notification.Builder notification$Builder0) {
        notification$Builder0.setGroupAlertBehavior(0);
    }

    public static void e(Notification.Builder notification$Builder0) {
        notification$Builder0.setSettingsText(null);
    }

    public static void f(Notification.Builder notification$Builder0) {
        notification$Builder0.setShortcutId(null);
    }

    public static void g(Notification.Builder notification$Builder0) {
        notification$Builder0.setTimeoutAfter(0L);
    }
}

