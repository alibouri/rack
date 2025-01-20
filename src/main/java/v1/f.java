package v1;

import android.app.Notification.Action.Builder;
import android.app.Notification.Builder;
import android.content.Context;

public abstract class f {
    public static String a(Context context0) {
        return context0.getOpPackageName();
    }

    public static void b(Notification.Builder notification$Builder0, boolean z) {
        notification$Builder0.setAllowSystemGeneratedContextualActions(z);
    }

    public static void c(Notification.Builder notification$Builder0) {
        notification$Builder0.setBubbleMetadata(null);
    }

    public static void d(Notification.Action.Builder notification$Action$Builder0) {
        notification$Action$Builder0.setContextual(false);
    }
}

