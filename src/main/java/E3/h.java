package E3;

import android.app.NotificationManager;
import android.graphics.RenderNode;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;

public abstract class h {
    public static RenderNode d() {
        return new RenderNode("OffscreenLayer.main");
    }

    public static ContentCaptureSession f(Object object0) [...] // Inlined contents

    public static void h(NotificationManager notificationManager0) {
        notificationManager0.setNotificationDelegate("com.google.android.gms");
    }

    public static void j(View view0) {
        view0.setForceDarkAllowed(false);
    }

    public static boolean m(RenderNode renderNode0) {
        return renderNode0.setHasOverlappingRendering(true);
    }

    public static RenderNode q() {
        return new RenderNode("OffscreenLayer.shadow");
    }

    public static void r(NotificationManager notificationManager0) {
        notificationManager0.setNotificationDelegate(null);
    }

    public static RenderNode w() {
        return new RenderNode("Compose");
    }
}

